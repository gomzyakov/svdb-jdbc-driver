// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/queryresult.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package codes.spectrum.svdb.model.v1;

@kotlin.jvm.JvmName("-initializequeryResult")
public inline fun queryResult(block: codes.spectrum.svdb.model.v1.QueryResultKt.Dsl.() -> kotlin.Unit): codes.spectrum.svdb.model.v1.Queryresult.QueryResult =
  codes.spectrum.svdb.model.v1.QueryResultKt.Dsl._create(codes.spectrum.svdb.model.v1.Queryresult.QueryResult.newBuilder()).apply { block() }._build()
/**
 * ```
 * обертка результата запроса
 * NOTE: результат запроса это еще не сами данные,
 * а только логический курсор над ними, соответственно
 * ошибочные статусы на этой фазы - это ошибки SdQL,
 * недостаток пермиссий и т.п., ошибки чтения самих данных
 * будут упаковываться в RecordResult
 * ```
 *
 * Protobuf type `codes.spectrum.svdb.model.v1.QueryResult`
 */
public object QueryResultKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: codes.spectrum.svdb.model.v1.Queryresult.QueryResult.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: codes.spectrum.svdb.model.v1.Queryresult.QueryResult.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): codes.spectrum.svdb.model.v1.Queryresult.QueryResult = _builder.build()

    /**
     * ```
     * не используется, будет DEPRECATED в версии 2.0
     * ```
     *
     * `string ver = 3;`
     */
    public var ver: kotlin.String
      @JvmName("getVer")
      get() = _builder.getVer()
      @JvmName("setVer")
      set(value) {
        _builder.setVer(value)
      }
    /**
     * ```
     * не используется, будет DEPRECATED в версии 2.0
     * ```
     *
     * `string ver = 3;`
     */
    public fun clearVer() {
      _builder.clearVer()
    }

    /**
     * ```
     * режим передачи данных
     * ```
     *
     * `.codes.spectrum.svdb.model.v1.DataMode dataMode = 2;`
     */
    public var dataMode: codes.spectrum.svdb.model.v1.Queryresult.DataMode
      @JvmName("getDataMode")
      get() = _builder.getDataMode()
      @JvmName("setDataMode")
      set(value) {
        _builder.setDataMode(value)
      }
    public var dataModeValue: kotlin.Int
      @JvmName("getDataModeValue")
      get() = _builder.getDataModeValue()
      @JvmName("setDataModeValue")
      set(value) {
        _builder.setDataModeValue(value)
      }
    /**
     * ```
     * режим передачи данных
     * ```
     *
     * `.codes.spectrum.svdb.model.v1.DataMode dataMode = 2;`
     */
    public fun clearDataMode() {
      _builder.clearDataMode()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ColumnsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * ```
     * метаданные, содержащие структуру ответа: имена и типы полей, опции
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.Column columns = 4;`
     */
     public val columns: com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.ColumnOuterClass.Column, ColumnsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getColumnsList()
      )
    /**
     * ```
     * метаданные, содержащие структуру ответа: имена и типы полей, опции
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.Column columns = 4;`
     * @param value The columns to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addColumns")
    public fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.ColumnOuterClass.Column, ColumnsProxy>.add(value: codes.spectrum.svdb.model.v1.ColumnOuterClass.Column) {
      _builder.addColumns(value)
    }
    /**
     * ```
     * метаданные, содержащие структуру ответа: имена и типы полей, опции
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.Column columns = 4;`
     * @param value The columns to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignColumns")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.ColumnOuterClass.Column, ColumnsProxy>.plusAssign(value: codes.spectrum.svdb.model.v1.ColumnOuterClass.Column) {
      add(value)
    }
    /**
     * ```
     * метаданные, содержащие структуру ответа: имена и типы полей, опции
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.Column columns = 4;`
     * @param values The columns to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllColumns")
    public fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.ColumnOuterClass.Column, ColumnsProxy>.addAll(values: kotlin.collections.Iterable<codes.spectrum.svdb.model.v1.ColumnOuterClass.Column>) {
      _builder.addAllColumns(values)
    }
    /**
     * ```
     * метаданные, содержащие структуру ответа: имена и типы полей, опции
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.Column columns = 4;`
     * @param values The columns to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllColumns")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.ColumnOuterClass.Column, ColumnsProxy>.plusAssign(values: kotlin.collections.Iterable<codes.spectrum.svdb.model.v1.ColumnOuterClass.Column>) {
      addAll(values)
    }
    /**
     * ```
     * метаданные, содержащие структуру ответа: имена и типы полей, опции
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.Column columns = 4;`
     * @param index The index to set the value at.
     * @param value The columns to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setColumns")
    public operator fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.ColumnOuterClass.Column, ColumnsProxy>.set(index: kotlin.Int, value: codes.spectrum.svdb.model.v1.ColumnOuterClass.Column) {
      _builder.setColumns(index, value)
    }
    /**
     * ```
     * метаданные, содержащие структуру ответа: имена и типы полей, опции
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.Column columns = 4;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearColumns")
    public fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.ColumnOuterClass.Column, ColumnsProxy>.clear() {
      _builder.clearColumns()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ByteRecordsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * ```
     * данные ответа в виде массива байтов
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.ByteRecord byteRecords = 5;`
     */
     public val byteRecords: com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.ByteRecordOuterClass.ByteRecord, ByteRecordsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getByteRecordsList()
      )
    /**
     * ```
     * данные ответа в виде массива байтов
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.ByteRecord byteRecords = 5;`
     * @param value The byteRecords to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addByteRecords")
    public fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.ByteRecordOuterClass.ByteRecord, ByteRecordsProxy>.add(value: codes.spectrum.svdb.model.v1.ByteRecordOuterClass.ByteRecord) {
      _builder.addByteRecords(value)
    }
    /**
     * ```
     * данные ответа в виде массива байтов
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.ByteRecord byteRecords = 5;`
     * @param value The byteRecords to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignByteRecords")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.ByteRecordOuterClass.ByteRecord, ByteRecordsProxy>.plusAssign(value: codes.spectrum.svdb.model.v1.ByteRecordOuterClass.ByteRecord) {
      add(value)
    }
    /**
     * ```
     * данные ответа в виде массива байтов
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.ByteRecord byteRecords = 5;`
     * @param values The byteRecords to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllByteRecords")
    public fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.ByteRecordOuterClass.ByteRecord, ByteRecordsProxy>.addAll(values: kotlin.collections.Iterable<codes.spectrum.svdb.model.v1.ByteRecordOuterClass.ByteRecord>) {
      _builder.addAllByteRecords(values)
    }
    /**
     * ```
     * данные ответа в виде массива байтов
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.ByteRecord byteRecords = 5;`
     * @param values The byteRecords to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllByteRecords")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.ByteRecordOuterClass.ByteRecord, ByteRecordsProxy>.plusAssign(values: kotlin.collections.Iterable<codes.spectrum.svdb.model.v1.ByteRecordOuterClass.ByteRecord>) {
      addAll(values)
    }
    /**
     * ```
     * данные ответа в виде массива байтов
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.ByteRecord byteRecords = 5;`
     * @param index The index to set the value at.
     * @param value The byteRecords to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setByteRecords")
    public operator fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.ByteRecordOuterClass.ByteRecord, ByteRecordsProxy>.set(index: kotlin.Int, value: codes.spectrum.svdb.model.v1.ByteRecordOuterClass.ByteRecord) {
      _builder.setByteRecords(index, value)
    }
    /**
     * ```
     * данные ответа в виде массива байтов
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.ByteRecord byteRecords = 5;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearByteRecords")
    public fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.ByteRecordOuterClass.ByteRecord, ByteRecordsProxy>.clear() {
      _builder.clearByteRecords()
    }


    /**
     * ```
     * статус запроса - OK при успешном формировании плана запроса,  в случае ошибок SdQL (400)
     * или при нарушении ACL (403) или иных интернальных ошибках (500)
     * ```
     *
     * `.codes.spectrum.svdb.model.v1.State state = 10;`
     */
    public var state: codes.spectrum.svdb.model.v1.StateOuterClass.State
      @JvmName("getState")
      get() = _builder.getState()
      @JvmName("setState")
      set(value) {
        _builder.setState(value)
      }
    /**
     * ```
     * статус запроса - OK при успешном формировании плана запроса,  в случае ошибок SdQL (400)
     * или при нарушении ACL (403) или иных интернальных ошибках (500)
     * ```
     *
     * `.codes.spectrum.svdb.model.v1.State state = 10;`
     */
    public fun clearState() {
      _builder.clearState()
    }
    /**
     * ```
     * статус запроса - OK при успешном формировании плана запроса,  в случае ошибок SdQL (400)
     * или при нарушении ACL (403) или иных интернальных ошибках (500)
     * ```
     *
     * `.codes.spectrum.svdb.model.v1.State state = 10;`
     * @return Whether the state field is set.
     */
    public fun hasState(): kotlin.Boolean {
      return _builder.hasState()
    }
    public val QueryResultKt.Dsl.stateOrNull: codes.spectrum.svdb.model.v1.StateOuterClass.State?
      get() = _builder.stateOrNull

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class RecordsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * ```
     * при запросе в режиме SYNC - тут будет сразу возвращены записи
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.Record records = 20;`
     */
     public val records: com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.RecordOuterClass.Record, RecordsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getRecordsList()
      )
    /**
     * ```
     * при запросе в режиме SYNC - тут будет сразу возвращены записи
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.Record records = 20;`
     * @param value The records to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addRecords")
    public fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.RecordOuterClass.Record, RecordsProxy>.add(value: codes.spectrum.svdb.model.v1.RecordOuterClass.Record) {
      _builder.addRecords(value)
    }
    /**
     * ```
     * при запросе в режиме SYNC - тут будет сразу возвращены записи
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.Record records = 20;`
     * @param value The records to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignRecords")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.RecordOuterClass.Record, RecordsProxy>.plusAssign(value: codes.spectrum.svdb.model.v1.RecordOuterClass.Record) {
      add(value)
    }
    /**
     * ```
     * при запросе в режиме SYNC - тут будет сразу возвращены записи
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.Record records = 20;`
     * @param values The records to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllRecords")
    public fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.RecordOuterClass.Record, RecordsProxy>.addAll(values: kotlin.collections.Iterable<codes.spectrum.svdb.model.v1.RecordOuterClass.Record>) {
      _builder.addAllRecords(values)
    }
    /**
     * ```
     * при запросе в режиме SYNC - тут будет сразу возвращены записи
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.Record records = 20;`
     * @param values The records to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllRecords")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.RecordOuterClass.Record, RecordsProxy>.plusAssign(values: kotlin.collections.Iterable<codes.spectrum.svdb.model.v1.RecordOuterClass.Record>) {
      addAll(values)
    }
    /**
     * ```
     * при запросе в режиме SYNC - тут будет сразу возвращены записи
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.Record records = 20;`
     * @param index The index to set the value at.
     * @param value The records to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setRecords")
    public operator fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.RecordOuterClass.Record, RecordsProxy>.set(index: kotlin.Int, value: codes.spectrum.svdb.model.v1.RecordOuterClass.Record) {
      _builder.setRecords(index, value)
    }
    /**
     * ```
     * при запросе в режиме SYNC - тут будет сразу возвращены записи
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.Record records = 20;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearRecords")
    public fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.RecordOuterClass.Record, RecordsProxy>.clear() {
      _builder.clearRecords()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class WarningsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * ```
     * предупреждения, для вывода в потоке текста
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.Warning warnings = 30;`
     */
     public val warnings: com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.WarningOuterClass.Warning, WarningsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getWarningsList()
      )
    /**
     * ```
     * предупреждения, для вывода в потоке текста
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.Warning warnings = 30;`
     * @param value The warnings to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addWarnings")
    public fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.WarningOuterClass.Warning, WarningsProxy>.add(value: codes.spectrum.svdb.model.v1.WarningOuterClass.Warning) {
      _builder.addWarnings(value)
    }
    /**
     * ```
     * предупреждения, для вывода в потоке текста
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.Warning warnings = 30;`
     * @param value The warnings to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignWarnings")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.WarningOuterClass.Warning, WarningsProxy>.plusAssign(value: codes.spectrum.svdb.model.v1.WarningOuterClass.Warning) {
      add(value)
    }
    /**
     * ```
     * предупреждения, для вывода в потоке текста
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.Warning warnings = 30;`
     * @param values The warnings to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllWarnings")
    public fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.WarningOuterClass.Warning, WarningsProxy>.addAll(values: kotlin.collections.Iterable<codes.spectrum.svdb.model.v1.WarningOuterClass.Warning>) {
      _builder.addAllWarnings(values)
    }
    /**
     * ```
     * предупреждения, для вывода в потоке текста
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.Warning warnings = 30;`
     * @param values The warnings to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllWarnings")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.WarningOuterClass.Warning, WarningsProxy>.plusAssign(values: kotlin.collections.Iterable<codes.spectrum.svdb.model.v1.WarningOuterClass.Warning>) {
      addAll(values)
    }
    /**
     * ```
     * предупреждения, для вывода в потоке текста
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.Warning warnings = 30;`
     * @param index The index to set the value at.
     * @param value The warnings to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setWarnings")
    public operator fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.WarningOuterClass.Warning, WarningsProxy>.set(index: kotlin.Int, value: codes.spectrum.svdb.model.v1.WarningOuterClass.Warning) {
      _builder.setWarnings(index, value)
    }
    /**
     * ```
     * предупреждения, для вывода в потоке текста
     * ```
     *
     * `repeated .codes.spectrum.svdb.model.v1.Warning warnings = 30;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearWarnings")
    public fun com.google.protobuf.kotlin.DslList<codes.spectrum.svdb.model.v1.WarningOuterClass.Warning, WarningsProxy>.clear() {
      _builder.clearWarnings()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun codes.spectrum.svdb.model.v1.Queryresult.QueryResult.copy(block: `codes.spectrum.svdb.model.v1`.QueryResultKt.Dsl.() -> kotlin.Unit): codes.spectrum.svdb.model.v1.Queryresult.QueryResult =
  `codes.spectrum.svdb.model.v1`.QueryResultKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val codes.spectrum.svdb.model.v1.Queryresult.QueryResultOrBuilder.stateOrNull: codes.spectrum.svdb.model.v1.StateOuterClass.State?
  get() = if (hasState()) getState() else null

