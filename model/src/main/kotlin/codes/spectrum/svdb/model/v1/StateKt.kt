// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/state.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package codes.spectrum.svdb.model.v1;

@kotlin.jvm.JvmName("-initializestate")
public inline fun state(block: codes.spectrum.svdb.model.v1.StateKt.Dsl.() -> kotlin.Unit): codes.spectrum.svdb.model.v1.StateOuterClass.State =
  codes.spectrum.svdb.model.v1.StateKt.Dsl._create(codes.spectrum.svdb.model.v1.StateOuterClass.State.newBuilder()).apply { block() }._build()
/**
 * ```
 * для передачи статуса заверешения в обертках
 * результатов в Result<T>, аналог HTTP кода, 
 * обертка в том числе исключений
 * ```
 *
 * Protobuf type `codes.spectrum.svdb.model.v1.State`
 */
public object StateKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: codes.spectrum.svdb.model.v1.StateOuterClass.State.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: codes.spectrum.svdb.model.v1.StateOuterClass.State.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): codes.spectrum.svdb.model.v1.StateOuterClass.State = _builder.build()

    /**
     * ```
     * код статуса (вольно но вяжем к HTTP аналогам
     * уже известные коды
     * 200 - OK
     * 204 - EOF
     * 400 - BAD_REQUEST  - ошибки во входных данных
     * 401 - UNAUTHORIZED - проблемы авторизации
     * 403 - FORBIDDEN    -  нарушение ACL
     * 404 - NOT_FOUND    - в контексте резолюции имен таблиц и полей
     * 500 - INTERNAL_ERROR - прочие исключения, ошибки
     * ```
     *
     * `int32 code = 1;`
     */
    public var code: kotlin.Int
      @JvmName("getCode")
      get() = _builder.getCode()
      @JvmName("setCode")
      set(value) {
        _builder.setCode(value)
      }
    /**
     * ```
     * код статуса (вольно но вяжем к HTTP аналогам
     * уже известные коды
     * 200 - OK
     * 204 - EOF
     * 400 - BAD_REQUEST  - ошибки во входных данных
     * 401 - UNAUTHORIZED - проблемы авторизации
     * 403 - FORBIDDEN    -  нарушение ACL
     * 404 - NOT_FOUND    - в контексте резолюции имен таблиц и полей
     * 500 - INTERNAL_ERROR - прочие исключения, ошибки
     * ```
     *
     * `int32 code = 1;`
     */
    public fun clearCode() {
      _builder.clearCode()
    }

    /**
     * ```
     * тип статуса, ошибки (это прежде всего для исключений, ошибок),
     * но могут быть и какие-то типа EOF и т.п.
     * известный тип - "EOF"
     * ```
     *
     * `string type = 10;`
     */
    public var type: kotlin.String
      @JvmName("getType")
      get() = _builder.getType()
      @JvmName("setType")
      set(value) {
        _builder.setType(value)
      }
    /**
     * ```
     * тип статуса, ошибки (это прежде всего для исключений, ошибок),
     * но могут быть и какие-то типа EOF и т.п.
     * известный тип - "EOF"
     * ```
     *
     * `string type = 10;`
     */
    public fun clearType() {
      _builder.clearType()
    }

    /**
     * ```
     * сообщение, связанное со статусом
     * ```
     *
     * `string message = 20;`
     */
    public var message: kotlin.String
      @JvmName("getMessage")
      get() = _builder.getMessage()
      @JvmName("setMessage")
      set(value) {
        _builder.setMessage(value)
      }
    /**
     * ```
     * сообщение, связанное со статусом
     * ```
     *
     * `string message = 20;`
     */
    public fun clearMessage() {
      _builder.clearMessage()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun codes.spectrum.svdb.model.v1.StateOuterClass.State.copy(block: `codes.spectrum.svdb.model.v1`.StateKt.Dsl.() -> kotlin.Unit): codes.spectrum.svdb.model.v1.StateOuterClass.State =
  `codes.spectrum.svdb.model.v1`.StateKt.Dsl._create(this.toBuilder()).apply { block() }._build()

