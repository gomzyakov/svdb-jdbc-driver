// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/warning.proto
// Protobuf Java Version: 4.27.3

package codes.spectrum.svdb.model.v1;

public final class WarningOuterClass {
  private WarningOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      WarningOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WarningOrBuilder extends
      // @@protoc_insertion_point(interface_extends:codes.spectrum.svdb.model.v1.Warning)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * код ошибки SQL
     * </pre>
     *
     * <code>int32 code = 10;</code>
     * @return The code.
     */
    int getCode();

    /**
     * <pre>
     * SQLState
     * </pre>
     *
     * <code>string state = 15;</code>
     * @return The state.
     */
    java.lang.String getState();
    /**
     * <pre>
     * SQLState
     * </pre>
     *
     * <code>string state = 15;</code>
     * @return The bytes for state.
     */
    com.google.protobuf.ByteString
        getStateBytes();

    /**
     * <pre>
     * сообщение
     * </pre>
     *
     * <code>string reason = 20;</code>
     * @return The reason.
     */
    java.lang.String getReason();
    /**
     * <pre>
     * сообщение
     * </pre>
     *
     * <code>string reason = 20;</code>
     * @return The bytes for reason.
     */
    com.google.protobuf.ByteString
        getReasonBytes();
  }
  /**
   * Protobuf type {@code codes.spectrum.svdb.model.v1.Warning}
   */
  public static final class Warning extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:codes.spectrum.svdb.model.v1.Warning)
      WarningOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 3,
        /* suffix= */ "",
        Warning.class.getName());
    }
    // Use Warning.newBuilder() to construct.
    private Warning(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private Warning() {
      state_ = "";
      reason_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return codes.spectrum.svdb.model.v1.WarningOuterClass.internal_static_codes_spectrum_svdb_model_v1_Warning_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return codes.spectrum.svdb.model.v1.WarningOuterClass.internal_static_codes_spectrum_svdb_model_v1_Warning_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              codes.spectrum.svdb.model.v1.WarningOuterClass.Warning.class, codes.spectrum.svdb.model.v1.WarningOuterClass.Warning.Builder.class);
    }

    public static final int CODE_FIELD_NUMBER = 10;
    private int code_ = 0;
    /**
     * <pre>
     * код ошибки SQL
     * </pre>
     *
     * <code>int32 code = 10;</code>
     * @return The code.
     */
    @java.lang.Override
    public int getCode() {
      return code_;
    }

    public static final int STATE_FIELD_NUMBER = 15;
    @SuppressWarnings("serial")
    private volatile java.lang.Object state_ = "";
    /**
     * <pre>
     * SQLState
     * </pre>
     *
     * <code>string state = 15;</code>
     * @return The state.
     */
    @java.lang.Override
    public java.lang.String getState() {
      java.lang.Object ref = state_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        state_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * SQLState
     * </pre>
     *
     * <code>string state = 15;</code>
     * @return The bytes for state.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getStateBytes() {
      java.lang.Object ref = state_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        state_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int REASON_FIELD_NUMBER = 20;
    @SuppressWarnings("serial")
    private volatile java.lang.Object reason_ = "";
    /**
     * <pre>
     * сообщение
     * </pre>
     *
     * <code>string reason = 20;</code>
     * @return The reason.
     */
    @java.lang.Override
    public java.lang.String getReason() {
      java.lang.Object ref = reason_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reason_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * сообщение
     * </pre>
     *
     * <code>string reason = 20;</code>
     * @return The bytes for reason.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getReasonBytes() {
      java.lang.Object ref = reason_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reason_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (code_ != 0) {
        output.writeInt32(10, code_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(state_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 15, state_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(reason_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 20, reason_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (code_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, code_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(state_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(15, state_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(reason_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(20, reason_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof codes.spectrum.svdb.model.v1.WarningOuterClass.Warning)) {
        return super.equals(obj);
      }
      codes.spectrum.svdb.model.v1.WarningOuterClass.Warning other = (codes.spectrum.svdb.model.v1.WarningOuterClass.Warning) obj;

      if (getCode()
          != other.getCode()) return false;
      if (!getState()
          .equals(other.getState())) return false;
      if (!getReason()
          .equals(other.getReason())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + CODE_FIELD_NUMBER;
      hash = (53 * hash) + getCode();
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + getState().hashCode();
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + getReason().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static codes.spectrum.svdb.model.v1.WarningOuterClass.Warning parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static codes.spectrum.svdb.model.v1.WarningOuterClass.Warning parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static codes.spectrum.svdb.model.v1.WarningOuterClass.Warning parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static codes.spectrum.svdb.model.v1.WarningOuterClass.Warning parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static codes.spectrum.svdb.model.v1.WarningOuterClass.Warning parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static codes.spectrum.svdb.model.v1.WarningOuterClass.Warning parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static codes.spectrum.svdb.model.v1.WarningOuterClass.Warning parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static codes.spectrum.svdb.model.v1.WarningOuterClass.Warning parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static codes.spectrum.svdb.model.v1.WarningOuterClass.Warning parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static codes.spectrum.svdb.model.v1.WarningOuterClass.Warning parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static codes.spectrum.svdb.model.v1.WarningOuterClass.Warning parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static codes.spectrum.svdb.model.v1.WarningOuterClass.Warning parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(codes.spectrum.svdb.model.v1.WarningOuterClass.Warning prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code codes.spectrum.svdb.model.v1.Warning}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:codes.spectrum.svdb.model.v1.Warning)
        codes.spectrum.svdb.model.v1.WarningOuterClass.WarningOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return codes.spectrum.svdb.model.v1.WarningOuterClass.internal_static_codes_spectrum_svdb_model_v1_Warning_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return codes.spectrum.svdb.model.v1.WarningOuterClass.internal_static_codes_spectrum_svdb_model_v1_Warning_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                codes.spectrum.svdb.model.v1.WarningOuterClass.Warning.class, codes.spectrum.svdb.model.v1.WarningOuterClass.Warning.Builder.class);
      }

      // Construct using codes.spectrum.svdb.model.v1.WarningOuterClass.Warning.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        code_ = 0;
        state_ = "";
        reason_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return codes.spectrum.svdb.model.v1.WarningOuterClass.internal_static_codes_spectrum_svdb_model_v1_Warning_descriptor;
      }

      @java.lang.Override
      public codes.spectrum.svdb.model.v1.WarningOuterClass.Warning getDefaultInstanceForType() {
        return codes.spectrum.svdb.model.v1.WarningOuterClass.Warning.getDefaultInstance();
      }

      @java.lang.Override
      public codes.spectrum.svdb.model.v1.WarningOuterClass.Warning build() {
        codes.spectrum.svdb.model.v1.WarningOuterClass.Warning result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public codes.spectrum.svdb.model.v1.WarningOuterClass.Warning buildPartial() {
        codes.spectrum.svdb.model.v1.WarningOuterClass.Warning result = new codes.spectrum.svdb.model.v1.WarningOuterClass.Warning(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(codes.spectrum.svdb.model.v1.WarningOuterClass.Warning result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.code_ = code_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.state_ = state_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.reason_ = reason_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof codes.spectrum.svdb.model.v1.WarningOuterClass.Warning) {
          return mergeFrom((codes.spectrum.svdb.model.v1.WarningOuterClass.Warning)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(codes.spectrum.svdb.model.v1.WarningOuterClass.Warning other) {
        if (other == codes.spectrum.svdb.model.v1.WarningOuterClass.Warning.getDefaultInstance()) return this;
        if (other.getCode() != 0) {
          setCode(other.getCode());
        }
        if (!other.getState().isEmpty()) {
          state_ = other.state_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (!other.getReason().isEmpty()) {
          reason_ = other.reason_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 80: {
                code_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 80
              case 122: {
                state_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 122
              case 162: {
                reason_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 162
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int code_ ;
      /**
       * <pre>
       * код ошибки SQL
       * </pre>
       *
       * <code>int32 code = 10;</code>
       * @return The code.
       */
      @java.lang.Override
      public int getCode() {
        return code_;
      }
      /**
       * <pre>
       * код ошибки SQL
       * </pre>
       *
       * <code>int32 code = 10;</code>
       * @param value The code to set.
       * @return This builder for chaining.
       */
      public Builder setCode(int value) {

        code_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * код ошибки SQL
       * </pre>
       *
       * <code>int32 code = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        code_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object state_ = "";
      /**
       * <pre>
       * SQLState
       * </pre>
       *
       * <code>string state = 15;</code>
       * @return The state.
       */
      public java.lang.String getState() {
        java.lang.Object ref = state_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          state_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * SQLState
       * </pre>
       *
       * <code>string state = 15;</code>
       * @return The bytes for state.
       */
      public com.google.protobuf.ByteString
          getStateBytes() {
        java.lang.Object ref = state_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          state_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * SQLState
       * </pre>
       *
       * <code>string state = 15;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        state_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * SQLState
       * </pre>
       *
       * <code>string state = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        state_ = getDefaultInstance().getState();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * SQLState
       * </pre>
       *
       * <code>string state = 15;</code>
       * @param value The bytes for state to set.
       * @return This builder for chaining.
       */
      public Builder setStateBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        state_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.lang.Object reason_ = "";
      /**
       * <pre>
       * сообщение
       * </pre>
       *
       * <code>string reason = 20;</code>
       * @return The reason.
       */
      public java.lang.String getReason() {
        java.lang.Object ref = reason_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          reason_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * сообщение
       * </pre>
       *
       * <code>string reason = 20;</code>
       * @return The bytes for reason.
       */
      public com.google.protobuf.ByteString
          getReasonBytes() {
        java.lang.Object ref = reason_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          reason_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * сообщение
       * </pre>
       *
       * <code>string reason = 20;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        reason_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * сообщение
       * </pre>
       *
       * <code>string reason = 20;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        reason_ = getDefaultInstance().getReason();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * сообщение
       * </pre>
       *
       * <code>string reason = 20;</code>
       * @param value The bytes for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        reason_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:codes.spectrum.svdb.model.v1.Warning)
    }

    // @@protoc_insertion_point(class_scope:codes.spectrum.svdb.model.v1.Warning)
    private static final codes.spectrum.svdb.model.v1.WarningOuterClass.Warning DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new codes.spectrum.svdb.model.v1.WarningOuterClass.Warning();
    }

    public static codes.spectrum.svdb.model.v1.WarningOuterClass.Warning getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Warning>
        PARSER = new com.google.protobuf.AbstractParser<Warning>() {
      @java.lang.Override
      public Warning parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Warning> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Warning> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public codes.spectrum.svdb.model.v1.WarningOuterClass.Warning getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_codes_spectrum_svdb_model_v1_Warning_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_codes_spectrum_svdb_model_v1_Warning_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020v1/warning.proto\022\034codes.spectrum.svdb." +
      "model.v1\"6\n\007Warning\022\014\n\004code\030\n \001(\005\022\r\n\005sta" +
      "te\030\017 \001(\t\022\016\n\006reason\030\024 \001(\tB/Z-gitlab.spect" +
      "rumdata.tech/sd3/svdb/go/model/v1b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_codes_spectrum_svdb_model_v1_Warning_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_codes_spectrum_svdb_model_v1_Warning_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_codes_spectrum_svdb_model_v1_Warning_descriptor,
        new java.lang.String[] { "Code", "State", "Reason", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
