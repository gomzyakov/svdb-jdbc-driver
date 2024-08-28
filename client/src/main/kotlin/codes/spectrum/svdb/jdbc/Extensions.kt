package codes.spectrum.svdb.jdbc

import codes.spectrum.svdb.*
import codes.spectrum.svdb.model.v1.ByteRecordOuterClass
import codes.spectrum.svdb.model.v1.ColumnOuterClass
import codes.spectrum.svdb.model.v1.RecordOuterClass
import codes.spectrum.svdb.model.v1.ValueOuterClass
import com.google.protobuf.ByteString
import com.google.protobuf.ListValue
import com.google.protobuf.Value
import java.sql.SQLException
import kotlin.math.absoluteValue
import kotlin.math.roundToLong

inline fun <R> runWrappingSqlException(
    sqlStatus: String,
    block: () -> R,
): R {
    return try {
        block()
    } catch (e: Exception) {
        if (e is SQLException) throw e
        throw SQLException(e.message, sqlStatus, e)
    }
}

const val CONNECTION_EXCEPTION_CODE = "08000"

const val DATA_EXCEPTION = "22000"

fun ValueOuterClass.Value.wrappedValue(): SvdbJdbcWrappedValue {
    return when (this.valueCase) {
        ValueOuterClass.Value.ValueCase.STR -> SvdbJdbcWrappedValue(str, ValueOuterClass.Value.ValueCase.STR)
        ValueOuterClass.Value.ValueCase.I32 -> SvdbJdbcWrappedValue(i32, ValueOuterClass.Value.ValueCase.I32)
        ValueOuterClass.Value.ValueCase.I64 -> SvdbJdbcWrappedValue(i64, ValueOuterClass.Value.ValueCase.I64)
        ValueOuterClass.Value.ValueCase.F64 -> SvdbJdbcWrappedValue(f64, ValueOuterClass.Value.ValueCase.F64)
        ValueOuterClass.Value.ValueCase.DEC -> SvdbJdbcWrappedValue(dec, ValueOuterClass.Value.ValueCase.DEC)
        ValueOuterClass.Value.ValueCase.BIT -> SvdbJdbcWrappedValue(bit, ValueOuterClass.Value.ValueCase.BIT)
        ValueOuterClass.Value.ValueCase.OBJ -> SvdbJdbcWrappedValue(obj, ValueOuterClass.Value.ValueCase.OBJ)
        ValueOuterClass.Value.ValueCase.ARR -> SvdbJdbcWrappedValue(arr, ValueOuterClass.Value.ValueCase.ARR)
        ValueOuterClass.Value.ValueCase.DUR -> SvdbJdbcWrappedValue(dur, ValueOuterClass.Value.ValueCase.DUR)
        ValueOuterClass.Value.ValueCase.TIM -> SvdbJdbcWrappedValue(tim, ValueOuterClass.Value.ValueCase.TIM)
        ValueOuterClass.Value.ValueCase.VALUE_NOT_SET, null ->
            SvdbJdbcWrappedValue(
                SvdbNull,
                ValueOuterClass.Value.ValueCase.VALUE_NOT_SET,
            )
    }
}

fun RecordOuterClass.Record.fieldMap(): Map<String, SvdbJdbcWrappedValue> {
    return this.fieldsList.associate { it.code to it.value.wrappedValue() }
}

fun RecordOuterClass.Record.fieldMapString(): Map<String, String> {
    return this.fieldsList.associate { it.code to it.value.wrappedValue().value.toString() }
}

fun ByteRecordOuterClass.ByteRecord.toByteStringList(): List<ByteString> {
    return fieldsList.map { it.item }
}

fun getIndexByLabel(
    columns: List<ColumnOuterClass.Column>,
    columnLabel: String,
): Int {
    return columns.indexOfFirst { it.code == columnLabel }
}

fun unmarshalByteField(
    byteItem: ByteString,
    dataType: ColumnOuterClass.DataType,
): Any? {
    if (byteItem.isEmpty) {
        return null
    }

    return when (dataType) {
        ColumnOuterClass.DataType.STRING -> {
            val value = Value.parseFrom(byteItem)

            if (value.kindCase != Value.KindCase.STRING_VALUE) {
                error("can't unmarshal byte value with datatype: $dataType")
            }

            return value.stringValue
        }

        ColumnOuterClass.DataType.BOOL -> {
            val value = Value.parseFrom(byteItem)

            if (value.kindCase != Value.KindCase.BOOL_VALUE) {
                error("can't unmarshal byte value with datatype: $dataType")
            }

            return value.boolValue
        }

        ColumnOuterClass.DataType.INT -> {
            val value = Value.parseFrom(byteItem)

            if (value.kindCase != Value.KindCase.NUMBER_VALUE) {
                error("can't unmarshal byte value with datatype: $dataType")
            }

            return value.numberValue.toLong()
        }

        ColumnOuterClass.DataType.FLOAT -> {
            val value = Value.parseFrom(byteItem)

            if (value.kindCase != Value.KindCase.NUMBER_VALUE) {
                error("can't unmarshal byte value with datatype: $dataType")
            }

            return value.numberValue
        }

        ColumnOuterClass.DataType.DECIMAL -> {
            val value = Value.parseFrom(byteItem)

            if (value.kindCase != Value.KindCase.STRING_VALUE) {
                error("can't unmarshal byte value with datatype: $dataType")
            }

            return value.stringValue
        }

        ColumnOuterClass.DataType.TIMESTAMP -> {
            val value = Value.parseFrom(byteItem)

            if (value.kindCase != Value.KindCase.STRING_VALUE) {
                error("can't unmarshal byte value with datatype: $dataType")
            }

            return value.stringValue
        }

        ColumnOuterClass.DataType.DURATION -> {
            val value = Value.parseFrom(byteItem)

            if (value.kindCase != Value.KindCase.STRING_VALUE) {
                error("can't unmarshal byte value with datatype: $dataType")
            }

            return value.stringValue
        }

        ColumnOuterClass.DataType.ARRAY -> {
            val listValue = ListValue.parseFrom(byteItem)

            if (listValue.unknownFields.serializedSize != 0) {
                error("can't unmarshal byte value with datatype: $dataType")
            }

            return unwrapValues(listValue.valuesList)
        }

        ColumnOuterClass.DataType.OBJECT -> {
            val value = Value.parseFrom(byteItem)

            if (value.kindCase != Value.KindCase.STRING_VALUE) {
                error("can't unmarshal byte value with datatype: $dataType")
            }

            return value.stringValue
        }

        else -> null
    }
}

fun unwrapValues(valuesList: List<Value>): SvdbJdbcArrayWrapperV2 {
    return SvdbJdbcArrayWrapperV2(
        valuesList.map {
            when (it.kindCase) {
                Value.KindCase.BOOL_VALUE -> it.boolValue
                Value.KindCase.LIST_VALUE -> unwrapValues(it.listValue.valuesList)
                Value.KindCase.NUMBER_VALUE -> unwrapNumberValue(it.numberValue)
                Value.KindCase.STRING_VALUE -> it.stringValue
                Value.KindCase.STRUCT_VALUE -> unwrapValuesMap(it.structValue.fieldsMap)
                Value.KindCase.KIND_NOT_SET -> null
                Value.KindCase.NULL_VALUE -> null
                else -> null
            }
        },
    )
}

fun unwrapValuesMap(valuesMap: Map<String, Value>): SvdbJdbcObjWrapperV2 {
    return SvdbJdbcObjWrapperV2(
        valuesMap.map {
            it.key to
                when (it.value.kindCase) {
                    Value.KindCase.BOOL_VALUE -> it.value.boolValue
                    Value.KindCase.LIST_VALUE -> unwrapValues(it.value.listValue.valuesList)
                    Value.KindCase.NUMBER_VALUE -> it.value.numberValue
                    Value.KindCase.STRING_VALUE -> it.value.stringValue
                    Value.KindCase.STRUCT_VALUE -> unwrapValuesMap(it.value.structValue.fieldsMap)
                    Value.KindCase.KIND_NOT_SET -> null
                    Value.KindCase.NULL_VALUE -> null
                    else -> null
                }
        }.toMap(),
    )
}

fun unwrapNumberValue(value: Double): Any {
    if (value.toString().endsWith(".0")) {
        return value.absoluteValue.roundToLong()
    }
    return value
}
