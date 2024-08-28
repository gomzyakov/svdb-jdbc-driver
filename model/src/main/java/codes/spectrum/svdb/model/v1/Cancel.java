// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/cancel.proto
// Protobuf Java Version: 4.27.3

package codes.spectrum.svdb.model.v1;

public final class Cancel {
  private Cancel() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      Cancel.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CancelOptionsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:codes.spectrum.svdb.model.v1.CancelOptions)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * uid сессии, которую необходимо закрыть
     * </pre>
     *
     * <code>string sessionUid = 10;</code>
     * @return The sessionUid.
     */
    java.lang.String getSessionUid();
    /**
     * <pre>
     * uid сессии, которую необходимо закрыть
     * </pre>
     *
     * <code>string sessionUid = 10;</code>
     * @return The bytes for sessionUid.
     */
    com.google.protobuf.ByteString
        getSessionUidBytes();

    /**
     * <pre>
     * uid курсора, который надо закрыть
     * </pre>
     *
     * <code>string cursorUid = 20;</code>
     * @return The cursorUid.
     */
    java.lang.String getCursorUid();
    /**
     * <pre>
     * uid курсора, который надо закрыть
     * </pre>
     *
     * <code>string cursorUid = 20;</code>
     * @return The bytes for cursorUid.
     */
    com.google.protobuf.ByteString
        getCursorUidBytes();
  }
  /**
   * <pre>
   * структура-параметр для метода закрытия сессии или курсора
   * </pre>
   *
   * Protobuf type {@code codes.spectrum.svdb.model.v1.CancelOptions}
   */
  public static final class CancelOptions extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:codes.spectrum.svdb.model.v1.CancelOptions)
      CancelOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 3,
        /* suffix= */ "",
        CancelOptions.class.getName());
    }
    // Use CancelOptions.newBuilder() to construct.
    private CancelOptions(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private CancelOptions() {
      sessionUid_ = "";
      cursorUid_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return codes.spectrum.svdb.model.v1.Cancel.internal_static_codes_spectrum_svdb_model_v1_CancelOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return codes.spectrum.svdb.model.v1.Cancel.internal_static_codes_spectrum_svdb_model_v1_CancelOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              codes.spectrum.svdb.model.v1.Cancel.CancelOptions.class, codes.spectrum.svdb.model.v1.Cancel.CancelOptions.Builder.class);
    }

    public static final int SESSIONUID_FIELD_NUMBER = 10;
    @SuppressWarnings("serial")
    private volatile java.lang.Object sessionUid_ = "";
    /**
     * <pre>
     * uid сессии, которую необходимо закрыть
     * </pre>
     *
     * <code>string sessionUid = 10;</code>
     * @return The sessionUid.
     */
    @java.lang.Override
    public java.lang.String getSessionUid() {
      java.lang.Object ref = sessionUid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionUid_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * uid сессии, которую необходимо закрыть
     * </pre>
     *
     * <code>string sessionUid = 10;</code>
     * @return The bytes for sessionUid.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSessionUidBytes() {
      java.lang.Object ref = sessionUid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionUid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CURSORUID_FIELD_NUMBER = 20;
    @SuppressWarnings("serial")
    private volatile java.lang.Object cursorUid_ = "";
    /**
     * <pre>
     * uid курсора, который надо закрыть
     * </pre>
     *
     * <code>string cursorUid = 20;</code>
     * @return The cursorUid.
     */
    @java.lang.Override
    public java.lang.String getCursorUid() {
      java.lang.Object ref = cursorUid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cursorUid_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * uid курсора, который надо закрыть
     * </pre>
     *
     * <code>string cursorUid = 20;</code>
     * @return The bytes for cursorUid.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCursorUidBytes() {
      java.lang.Object ref = cursorUid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cursorUid_ = b;
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
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(sessionUid_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 10, sessionUid_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(cursorUid_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 20, cursorUid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(sessionUid_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(10, sessionUid_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(cursorUid_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(20, cursorUid_);
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
      if (!(obj instanceof codes.spectrum.svdb.model.v1.Cancel.CancelOptions)) {
        return super.equals(obj);
      }
      codes.spectrum.svdb.model.v1.Cancel.CancelOptions other = (codes.spectrum.svdb.model.v1.Cancel.CancelOptions) obj;

      if (!getSessionUid()
          .equals(other.getSessionUid())) return false;
      if (!getCursorUid()
          .equals(other.getCursorUid())) return false;
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
      hash = (37 * hash) + SESSIONUID_FIELD_NUMBER;
      hash = (53 * hash) + getSessionUid().hashCode();
      hash = (37 * hash) + CURSORUID_FIELD_NUMBER;
      hash = (53 * hash) + getCursorUid().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static codes.spectrum.svdb.model.v1.Cancel.CancelOptions parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static codes.spectrum.svdb.model.v1.Cancel.CancelOptions parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static codes.spectrum.svdb.model.v1.Cancel.CancelOptions parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static codes.spectrum.svdb.model.v1.Cancel.CancelOptions parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static codes.spectrum.svdb.model.v1.Cancel.CancelOptions parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static codes.spectrum.svdb.model.v1.Cancel.CancelOptions parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static codes.spectrum.svdb.model.v1.Cancel.CancelOptions parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static codes.spectrum.svdb.model.v1.Cancel.CancelOptions parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static codes.spectrum.svdb.model.v1.Cancel.CancelOptions parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static codes.spectrum.svdb.model.v1.Cancel.CancelOptions parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static codes.spectrum.svdb.model.v1.Cancel.CancelOptions parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static codes.spectrum.svdb.model.v1.Cancel.CancelOptions parseFrom(
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
    public static Builder newBuilder(codes.spectrum.svdb.model.v1.Cancel.CancelOptions prototype) {
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
     * <pre>
     * структура-параметр для метода закрытия сессии или курсора
     * </pre>
     *
     * Protobuf type {@code codes.spectrum.svdb.model.v1.CancelOptions}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:codes.spectrum.svdb.model.v1.CancelOptions)
        codes.spectrum.svdb.model.v1.Cancel.CancelOptionsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return codes.spectrum.svdb.model.v1.Cancel.internal_static_codes_spectrum_svdb_model_v1_CancelOptions_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return codes.spectrum.svdb.model.v1.Cancel.internal_static_codes_spectrum_svdb_model_v1_CancelOptions_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                codes.spectrum.svdb.model.v1.Cancel.CancelOptions.class, codes.spectrum.svdb.model.v1.Cancel.CancelOptions.Builder.class);
      }

      // Construct using codes.spectrum.svdb.model.v1.Cancel.CancelOptions.newBuilder()
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
        sessionUid_ = "";
        cursorUid_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return codes.spectrum.svdb.model.v1.Cancel.internal_static_codes_spectrum_svdb_model_v1_CancelOptions_descriptor;
      }

      @java.lang.Override
      public codes.spectrum.svdb.model.v1.Cancel.CancelOptions getDefaultInstanceForType() {
        return codes.spectrum.svdb.model.v1.Cancel.CancelOptions.getDefaultInstance();
      }

      @java.lang.Override
      public codes.spectrum.svdb.model.v1.Cancel.CancelOptions build() {
        codes.spectrum.svdb.model.v1.Cancel.CancelOptions result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public codes.spectrum.svdb.model.v1.Cancel.CancelOptions buildPartial() {
        codes.spectrum.svdb.model.v1.Cancel.CancelOptions result = new codes.spectrum.svdb.model.v1.Cancel.CancelOptions(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(codes.spectrum.svdb.model.v1.Cancel.CancelOptions result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.sessionUid_ = sessionUid_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.cursorUid_ = cursorUid_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof codes.spectrum.svdb.model.v1.Cancel.CancelOptions) {
          return mergeFrom((codes.spectrum.svdb.model.v1.Cancel.CancelOptions)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(codes.spectrum.svdb.model.v1.Cancel.CancelOptions other) {
        if (other == codes.spectrum.svdb.model.v1.Cancel.CancelOptions.getDefaultInstance()) return this;
        if (!other.getSessionUid().isEmpty()) {
          sessionUid_ = other.sessionUid_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getCursorUid().isEmpty()) {
          cursorUid_ = other.cursorUid_;
          bitField0_ |= 0x00000002;
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
              case 82: {
                sessionUid_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 82
              case 162: {
                cursorUid_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
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

      private java.lang.Object sessionUid_ = "";
      /**
       * <pre>
       * uid сессии, которую необходимо закрыть
       * </pre>
       *
       * <code>string sessionUid = 10;</code>
       * @return The sessionUid.
       */
      public java.lang.String getSessionUid() {
        java.lang.Object ref = sessionUid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          sessionUid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * uid сессии, которую необходимо закрыть
       * </pre>
       *
       * <code>string sessionUid = 10;</code>
       * @return The bytes for sessionUid.
       */
      public com.google.protobuf.ByteString
          getSessionUidBytes() {
        java.lang.Object ref = sessionUid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sessionUid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * uid сессии, которую необходимо закрыть
       * </pre>
       *
       * <code>string sessionUid = 10;</code>
       * @param value The sessionUid to set.
       * @return This builder for chaining.
       */
      public Builder setSessionUid(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        sessionUid_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * uid сессии, которую необходимо закрыть
       * </pre>
       *
       * <code>string sessionUid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearSessionUid() {
        sessionUid_ = getDefaultInstance().getSessionUid();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * uid сессии, которую необходимо закрыть
       * </pre>
       *
       * <code>string sessionUid = 10;</code>
       * @param value The bytes for sessionUid to set.
       * @return This builder for chaining.
       */
      public Builder setSessionUidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        sessionUid_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object cursorUid_ = "";
      /**
       * <pre>
       * uid курсора, который надо закрыть
       * </pre>
       *
       * <code>string cursorUid = 20;</code>
       * @return The cursorUid.
       */
      public java.lang.String getCursorUid() {
        java.lang.Object ref = cursorUid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          cursorUid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * uid курсора, который надо закрыть
       * </pre>
       *
       * <code>string cursorUid = 20;</code>
       * @return The bytes for cursorUid.
       */
      public com.google.protobuf.ByteString
          getCursorUidBytes() {
        java.lang.Object ref = cursorUid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          cursorUid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * uid курсора, который надо закрыть
       * </pre>
       *
       * <code>string cursorUid = 20;</code>
       * @param value The cursorUid to set.
       * @return This builder for chaining.
       */
      public Builder setCursorUid(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        cursorUid_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * uid курсора, который надо закрыть
       * </pre>
       *
       * <code>string cursorUid = 20;</code>
       * @return This builder for chaining.
       */
      public Builder clearCursorUid() {
        cursorUid_ = getDefaultInstance().getCursorUid();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * uid курсора, который надо закрыть
       * </pre>
       *
       * <code>string cursorUid = 20;</code>
       * @param value The bytes for cursorUid to set.
       * @return This builder for chaining.
       */
      public Builder setCursorUidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        cursorUid_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:codes.spectrum.svdb.model.v1.CancelOptions)
    }

    // @@protoc_insertion_point(class_scope:codes.spectrum.svdb.model.v1.CancelOptions)
    private static final codes.spectrum.svdb.model.v1.Cancel.CancelOptions DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new codes.spectrum.svdb.model.v1.Cancel.CancelOptions();
    }

    public static codes.spectrum.svdb.model.v1.Cancel.CancelOptions getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CancelOptions>
        PARSER = new com.google.protobuf.AbstractParser<CancelOptions>() {
      @java.lang.Override
      public CancelOptions parsePartialFrom(
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

    public static com.google.protobuf.Parser<CancelOptions> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CancelOptions> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public codes.spectrum.svdb.model.v1.Cancel.CancelOptions getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_codes_spectrum_svdb_model_v1_CancelOptions_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_codes_spectrum_svdb_model_v1_CancelOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017v1/cancel.proto\022\034codes.spectrum.svdb.m" +
      "odel.v1\"<\n\rCancelOptions\022\022\n\nsessionUid\030\n" +
      " \001(\t\022\021\n\tcursorUid\030\024 \001(\tJ\004\010\001\020\nB/Z-gitlab." +
      "spectrumdata.tech/sd3/svdb/go/model/v1b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_codes_spectrum_svdb_model_v1_CancelOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_codes_spectrum_svdb_model_v1_CancelOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_codes_spectrum_svdb_model_v1_CancelOptions_descriptor,
        new java.lang.String[] { "SessionUid", "CursorUid", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
