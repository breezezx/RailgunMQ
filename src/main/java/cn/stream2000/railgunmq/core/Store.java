// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: store.proto

package cn.stream2000.railgunmq.core;

public final class Store {
  private Store() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RocksDBMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RocksDBMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string topic = 1;</code>
     */
    java.lang.String getTopic();
    /**
     * <code>string topic = 1;</code>
     */
    com.google.protobuf.ByteString
        getTopicBytes();

    /**
     * <code>string msg_id = 2;</code>
     */
    java.lang.String getMsgId();
    /**
     * <code>string msg_id = 2;</code>
     */
    com.google.protobuf.ByteString
        getMsgIdBytes();

    /**
     * <code>.RocksDBMessage.payload_type type = 3;</code>
     */
    int getTypeValue();
    /**
     * <code>.RocksDBMessage.payload_type type = 3;</code>
     */
    cn.stream2000.railgunmq.core.Store.RocksDBMessage.payload_type getType();

    /**
     * <code>bytes data = 4;</code>
     */
    com.google.protobuf.ByteString getData();
  }
  /**
   * Protobuf type {@code RocksDBMessage}
   */
  public  static final class RocksDBMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RocksDBMessage)
      RocksDBMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RocksDBMessage.newBuilder() to construct.
    private RocksDBMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RocksDBMessage() {
      topic_ = "";
      msgId_ = "";
      type_ = 0;
      data_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RocksDBMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              topic_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              msgId_ = s;
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 34: {

              data_ = input.readBytes();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.stream2000.railgunmq.core.Store.internal_static_RocksDBMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.stream2000.railgunmq.core.Store.internal_static_RocksDBMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.stream2000.railgunmq.core.Store.RocksDBMessage.class, cn.stream2000.railgunmq.core.Store.RocksDBMessage.Builder.class);
    }

    /**
     * Protobuf enum {@code RocksDBMessage.payload_type}
     */
    public enum payload_type
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>Text = 0;</code>
       */
      Text(0),
      /**
       * <code>Binary = 1;</code>
       */
      Binary(1),
      /**
       * <code>Integer = 2;</code>
       */
      Integer(2),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>Text = 0;</code>
       */
      public static final int Text_VALUE = 0;
      /**
       * <code>Binary = 1;</code>
       */
      public static final int Binary_VALUE = 1;
      /**
       * <code>Integer = 2;</code>
       */
      public static final int Integer_VALUE = 2;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static payload_type valueOf(int value) {
        return forNumber(value);
      }

      public static payload_type forNumber(int value) {
        switch (value) {
          case 0: return Text;
          case 1: return Binary;
          case 2: return Integer;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<payload_type>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          payload_type> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<payload_type>() {
              public payload_type findValueByNumber(int number) {
                return payload_type.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return cn.stream2000.railgunmq.core.Store.RocksDBMessage.getDescriptor().getEnumTypes().get(0);
      }

      private static final payload_type[] VALUES = values();

      public static payload_type valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private payload_type(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:RocksDBMessage.payload_type)
    }

    public static final int TOPIC_FIELD_NUMBER = 1;
    private volatile java.lang.Object topic_;
    /**
     * <code>string topic = 1;</code>
     */
    public java.lang.String getTopic() {
      java.lang.Object ref = topic_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topic_ = s;
        return s;
      }
    }
    /**
     * <code>string topic = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTopicBytes() {
      java.lang.Object ref = topic_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MSG_ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object msgId_;
    /**
     * <code>string msg_id = 2;</code>
     */
    public java.lang.String getMsgId() {
      java.lang.Object ref = msgId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msgId_ = s;
        return s;
      }
    }
    /**
     * <code>string msg_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMsgIdBytes() {
      java.lang.Object ref = msgId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msgId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    /**
     * <code>.RocksDBMessage.payload_type type = 3;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.RocksDBMessage.payload_type type = 3;</code>
     */
    public cn.stream2000.railgunmq.core.Store.RocksDBMessage.payload_type getType() {
      @SuppressWarnings("deprecation")
      cn.stream2000.railgunmq.core.Store.RocksDBMessage.payload_type result = cn.stream2000.railgunmq.core.Store.RocksDBMessage.payload_type.valueOf(type_);
      return result == null ? cn.stream2000.railgunmq.core.Store.RocksDBMessage.payload_type.UNRECOGNIZED : result;
    }

    public static final int DATA_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString data_;
    /**
     * <code>bytes data = 4;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
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
      if (!getTopicBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, topic_);
      }
      if (!getMsgIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, msgId_);
      }
      if (type_ != cn.stream2000.railgunmq.core.Store.RocksDBMessage.payload_type.Text.getNumber()) {
        output.writeEnum(3, type_);
      }
      if (!data_.isEmpty()) {
        output.writeBytes(4, data_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getTopicBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, topic_);
      }
      if (!getMsgIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, msgId_);
      }
      if (type_ != cn.stream2000.railgunmq.core.Store.RocksDBMessage.payload_type.Text.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, type_);
      }
      if (!data_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, data_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof cn.stream2000.railgunmq.core.Store.RocksDBMessage)) {
        return super.equals(obj);
      }
      cn.stream2000.railgunmq.core.Store.RocksDBMessage other = (cn.stream2000.railgunmq.core.Store.RocksDBMessage) obj;

      boolean result = true;
      result = result && getTopic()
          .equals(other.getTopic());
      result = result && getMsgId()
          .equals(other.getMsgId());
      result = result && type_ == other.type_;
      result = result && getData()
          .equals(other.getData());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TOPIC_FIELD_NUMBER;
      hash = (53 * hash) + getTopic().hashCode();
      hash = (37 * hash) + MSG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMsgId().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static cn.stream2000.railgunmq.core.Store.RocksDBMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.stream2000.railgunmq.core.Store.RocksDBMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.stream2000.railgunmq.core.Store.RocksDBMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.stream2000.railgunmq.core.Store.RocksDBMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.stream2000.railgunmq.core.Store.RocksDBMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.stream2000.railgunmq.core.Store.RocksDBMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.stream2000.railgunmq.core.Store.RocksDBMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cn.stream2000.railgunmq.core.Store.RocksDBMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static cn.stream2000.railgunmq.core.Store.RocksDBMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static cn.stream2000.railgunmq.core.Store.RocksDBMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static cn.stream2000.railgunmq.core.Store.RocksDBMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cn.stream2000.railgunmq.core.Store.RocksDBMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(cn.stream2000.railgunmq.core.Store.RocksDBMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code RocksDBMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RocksDBMessage)
        cn.stream2000.railgunmq.core.Store.RocksDBMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.stream2000.railgunmq.core.Store.internal_static_RocksDBMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.stream2000.railgunmq.core.Store.internal_static_RocksDBMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.stream2000.railgunmq.core.Store.RocksDBMessage.class, cn.stream2000.railgunmq.core.Store.RocksDBMessage.Builder.class);
      }

      // Construct using cn.stream2000.railgunmq.core.Store.RocksDBMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        topic_ = "";

        msgId_ = "";

        type_ = 0;

        data_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.stream2000.railgunmq.core.Store.internal_static_RocksDBMessage_descriptor;
      }

      @java.lang.Override
      public cn.stream2000.railgunmq.core.Store.RocksDBMessage getDefaultInstanceForType() {
        return cn.stream2000.railgunmq.core.Store.RocksDBMessage.getDefaultInstance();
      }

      @java.lang.Override
      public cn.stream2000.railgunmq.core.Store.RocksDBMessage build() {
        cn.stream2000.railgunmq.core.Store.RocksDBMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public cn.stream2000.railgunmq.core.Store.RocksDBMessage buildPartial() {
        cn.stream2000.railgunmq.core.Store.RocksDBMessage result = new cn.stream2000.railgunmq.core.Store.RocksDBMessage(this);
        result.topic_ = topic_;
        result.msgId_ = msgId_;
        result.type_ = type_;
        result.data_ = data_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.stream2000.railgunmq.core.Store.RocksDBMessage) {
          return mergeFrom((cn.stream2000.railgunmq.core.Store.RocksDBMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.stream2000.railgunmq.core.Store.RocksDBMessage other) {
        if (other == cn.stream2000.railgunmq.core.Store.RocksDBMessage.getDefaultInstance()) return this;
        if (!other.getTopic().isEmpty()) {
          topic_ = other.topic_;
          onChanged();
        }
        if (!other.getMsgId().isEmpty()) {
          msgId_ = other.msgId_;
          onChanged();
        }
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
          setData(other.getData());
        }
        this.mergeUnknownFields(other.unknownFields);
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
        cn.stream2000.railgunmq.core.Store.RocksDBMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.stream2000.railgunmq.core.Store.RocksDBMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object topic_ = "";
      /**
       * <code>string topic = 1;</code>
       */
      public java.lang.String getTopic() {
        java.lang.Object ref = topic_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          topic_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string topic = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTopicBytes() {
        java.lang.Object ref = topic_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          topic_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string topic = 1;</code>
       */
      public Builder setTopic(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        topic_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string topic = 1;</code>
       */
      public Builder clearTopic() {
        
        topic_ = getDefaultInstance().getTopic();
        onChanged();
        return this;
      }
      /**
       * <code>string topic = 1;</code>
       */
      public Builder setTopicBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        topic_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object msgId_ = "";
      /**
       * <code>string msg_id = 2;</code>
       */
      public java.lang.String getMsgId() {
        java.lang.Object ref = msgId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          msgId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string msg_id = 2;</code>
       */
      public com.google.protobuf.ByteString
          getMsgIdBytes() {
        java.lang.Object ref = msgId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          msgId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string msg_id = 2;</code>
       */
      public Builder setMsgId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        msgId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string msg_id = 2;</code>
       */
      public Builder clearMsgId() {
        
        msgId_ = getDefaultInstance().getMsgId();
        onChanged();
        return this;
      }
      /**
       * <code>string msg_id = 2;</code>
       */
      public Builder setMsgIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        msgId_ = value;
        onChanged();
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.RocksDBMessage.payload_type type = 3;</code>
       */
      public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.RocksDBMessage.payload_type type = 3;</code>
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.RocksDBMessage.payload_type type = 3;</code>
       */
      public cn.stream2000.railgunmq.core.Store.RocksDBMessage.payload_type getType() {
        @SuppressWarnings("deprecation")
        cn.stream2000.railgunmq.core.Store.RocksDBMessage.payload_type result = cn.stream2000.railgunmq.core.Store.RocksDBMessage.payload_type.valueOf(type_);
        return result == null ? cn.stream2000.railgunmq.core.Store.RocksDBMessage.payload_type.UNRECOGNIZED : result;
      }
      /**
       * <code>.RocksDBMessage.payload_type type = 3;</code>
       */
      public Builder setType(cn.stream2000.railgunmq.core.Store.RocksDBMessage.payload_type value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.RocksDBMessage.payload_type type = 3;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes data = 4;</code>
       */
      public com.google.protobuf.ByteString getData() {
        return data_;
      }
      /**
       * <code>bytes data = 4;</code>
       */
      public Builder setData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes data = 4;</code>
       */
      public Builder clearData() {
        
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:RocksDBMessage)
    }

    // @@protoc_insertion_point(class_scope:RocksDBMessage)
    private static final cn.stream2000.railgunmq.core.Store.RocksDBMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new cn.stream2000.railgunmq.core.Store.RocksDBMessage();
    }

    public static cn.stream2000.railgunmq.core.Store.RocksDBMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RocksDBMessage>
        PARSER = new com.google.protobuf.AbstractParser<RocksDBMessage>() {
      @java.lang.Override
      public RocksDBMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RocksDBMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RocksDBMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RocksDBMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public cn.stream2000.railgunmq.core.Store.RocksDBMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RocksDBMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RocksDBMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013store.proto\"\234\001\n\016RocksDBMessage\022\r\n\005topi" +
      "c\030\001 \001(\t\022\016\n\006msg_id\030\002 \001(\t\022*\n\004type\030\003 \001(\0162\034." +
      "RocksDBMessage.payload_type\022\014\n\004data\030\004 \001(" +
      "\014\"1\n\014payload_type\022\010\n\004Text\020\000\022\n\n\006Binary\020\001\022" +
      "\013\n\007Integer\020\002B%\n\034cn.stream2000.railgunmq." +
      "coreB\005Storeb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_RocksDBMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RocksDBMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RocksDBMessage_descriptor,
        new java.lang.String[] { "Topic", "MsgId", "Type", "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
