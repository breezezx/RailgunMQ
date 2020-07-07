// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/message.proto

package cn.stream2000.railgunmq.core;

public final class Message {
  private Message() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code MessageType}
   */
  public enum MessageType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Empty = 0;</code>
     */
    Empty(0),
    /**
     * <code>PubMessageRequestType = 1;</code>
     */
    PubMessageRequestType(1),
    /**
     * <code>PubMessageResponseType = 2;</code>
     */
    PubMessageResponseType(2),
    /**
     * <code>CreateChannelRequestType = 3;</code>
     */
    CreateChannelRequestType(3),
    /**
     * <code>CreateChannelResponseType = 4;</code>
     */
    CreateChannelResponseType(4),
    /**
     * <code>NodeHeartBeatType = 5;</code>
     */
    NodeHeartBeatType(5),
    /**
     * <code>CSHeartBeatType = 6;</code>
     */
    CSHeartBeatType(6),
    /**
     * <code>SetChannelNameType = 7;</code>
     */
    SetChannelNameType(7),
    /**
     * <code>DisconnecType = 8;</code>
     */
    DisconnecType(8),
    /**
     * <code>SubMessageRequestType = 9;</code>
     */
    SubMessageRequestType(9),
    /**
     * <code>SubMessageResponseType = 10;</code>
     */
    SubMessageResponseType(10),
    /**
     * <code>SendMessageResponseType = 11;</code>
     */
    SendMessageResponseType(11),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>Empty = 0;</code>
     */
    public static final int Empty_VALUE = 0;
    /**
     * <code>PubMessageRequestType = 1;</code>
     */
    public static final int PubMessageRequestType_VALUE = 1;
    /**
     * <code>PubMessageResponseType = 2;</code>
     */
    public static final int PubMessageResponseType_VALUE = 2;
    /**
     * <code>CreateChannelRequestType = 3;</code>
     */
    public static final int CreateChannelRequestType_VALUE = 3;
    /**
     * <code>CreateChannelResponseType = 4;</code>
     */
    public static final int CreateChannelResponseType_VALUE = 4;
    /**
     * <code>NodeHeartBeatType = 5;</code>
     */
    public static final int NodeHeartBeatType_VALUE = 5;
    /**
     * <code>CSHeartBeatType = 6;</code>
     */
    public static final int CSHeartBeatType_VALUE = 6;
    /**
     * <code>SetChannelNameType = 7;</code>
     */
    public static final int SetChannelNameType_VALUE = 7;
    /**
     * <code>DisconnecType = 8;</code>
     */
    public static final int DisconnecType_VALUE = 8;
    /**
     * <code>SubMessageRequestType = 9;</code>
     */
    public static final int SubMessageRequestType_VALUE = 9;
    /**
     * <code>SubMessageResponseType = 10;</code>
     */
    public static final int SubMessageResponseType_VALUE = 10;
    /**
     * <code>SendMessageResponseType = 11;</code>
     */
    public static final int SendMessageResponseType_VALUE = 11;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MessageType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MessageType forNumber(int value) {
      switch (value) {
        case 0: return Empty;
        case 1: return PubMessageRequestType;
        case 2: return PubMessageResponseType;
        case 3: return CreateChannelRequestType;
        case 4: return CreateChannelResponseType;
        case 5: return NodeHeartBeatType;
        case 6: return CSHeartBeatType;
        case 7: return SetChannelNameType;
        case 8: return DisconnecType;
        case 9: return SubMessageRequestType;
        case 10: return SubMessageResponseType;
        case 11: return SendMessageResponseType;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MessageType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MessageType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MessageType>() {
            public MessageType findValueByNumber(int number) {
              return MessageType.forNumber(number);
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
      return cn.stream2000.railgunmq.core.Message.getDescriptor().getEnumTypes().get(0);
    }

    private static final MessageType[] VALUES = values();

    public static MessageType valueOf(
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

    private MessageType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MessageType)
  }

  /**
   * Protobuf enum {@code ErrorType}
   */
  public enum ErrorType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>OK = 0;</code>
     */
    OK(0),
    /**
     * <code>InternalServerError = 1;</code>
     */
    InternalServerError(1),
    /**
     * <code>InvalidTopic = 2;</code>
     */
    InvalidTopic(2),
    /**
     * <code>FullMessageQueue = 3;</code>
     */
    FullMessageQueue(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>OK = 0;</code>
     */
    public static final int OK_VALUE = 0;
    /**
     * <code>InternalServerError = 1;</code>
     */
    public static final int InternalServerError_VALUE = 1;
    /**
     * <code>InvalidTopic = 2;</code>
     */
    public static final int InvalidTopic_VALUE = 2;
    /**
     * <code>FullMessageQueue = 3;</code>
     */
    public static final int FullMessageQueue_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ErrorType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ErrorType forNumber(int value) {
      switch (value) {
        case 0: return OK;
        case 1: return InternalServerError;
        case 2: return InvalidTopic;
        case 3: return FullMessageQueue;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ErrorType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ErrorType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ErrorType>() {
            public ErrorType findValueByNumber(int number) {
              return ErrorType.forNumber(number);
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
      return cn.stream2000.railgunmq.core.Message.getDescriptor().getEnumTypes().get(1);
    }

    private static final ErrorType[] VALUES = values();

    public static ErrorType valueOf(
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

    private ErrorType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ErrorType)
  }

  public interface HeatBeatOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HeatBeat)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code HeatBeat}
   */
  public  static final class HeatBeat extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HeatBeat)
      HeatBeatOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HeatBeat.newBuilder() to construct.
    private HeatBeat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HeatBeat() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HeatBeat();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HeatBeat(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            default: {
              if (!parseUnknownField(
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
      return cn.stream2000.railgunmq.core.Message.internal_static_HeatBeat_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.stream2000.railgunmq.core.Message.internal_static_HeatBeat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.stream2000.railgunmq.core.Message.HeatBeat.class, cn.stream2000.railgunmq.core.Message.HeatBeat.Builder.class);
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
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof cn.stream2000.railgunmq.core.Message.HeatBeat)) {
        return super.equals(obj);
      }
      cn.stream2000.railgunmq.core.Message.HeatBeat other = (cn.stream2000.railgunmq.core.Message.HeatBeat) obj;

      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static cn.stream2000.railgunmq.core.Message.HeatBeat parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.stream2000.railgunmq.core.Message.HeatBeat parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.stream2000.railgunmq.core.Message.HeatBeat parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.stream2000.railgunmq.core.Message.HeatBeat parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.stream2000.railgunmq.core.Message.HeatBeat parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.stream2000.railgunmq.core.Message.HeatBeat parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.stream2000.railgunmq.core.Message.HeatBeat parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cn.stream2000.railgunmq.core.Message.HeatBeat parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static cn.stream2000.railgunmq.core.Message.HeatBeat parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static cn.stream2000.railgunmq.core.Message.HeatBeat parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static cn.stream2000.railgunmq.core.Message.HeatBeat parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cn.stream2000.railgunmq.core.Message.HeatBeat parseFrom(
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
    public static Builder newBuilder(cn.stream2000.railgunmq.core.Message.HeatBeat prototype) {
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
     * Protobuf type {@code HeatBeat}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HeatBeat)
        cn.stream2000.railgunmq.core.Message.HeatBeatOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.stream2000.railgunmq.core.Message.internal_static_HeatBeat_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.stream2000.railgunmq.core.Message.internal_static_HeatBeat_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.stream2000.railgunmq.core.Message.HeatBeat.class, cn.stream2000.railgunmq.core.Message.HeatBeat.Builder.class);
      }

      // Construct using cn.stream2000.railgunmq.core.Message.HeatBeat.newBuilder()
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
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.stream2000.railgunmq.core.Message.internal_static_HeatBeat_descriptor;
      }

      @java.lang.Override
      public cn.stream2000.railgunmq.core.Message.HeatBeat getDefaultInstanceForType() {
        return cn.stream2000.railgunmq.core.Message.HeatBeat.getDefaultInstance();
      }

      @java.lang.Override
      public cn.stream2000.railgunmq.core.Message.HeatBeat build() {
        cn.stream2000.railgunmq.core.Message.HeatBeat result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public cn.stream2000.railgunmq.core.Message.HeatBeat buildPartial() {
        cn.stream2000.railgunmq.core.Message.HeatBeat result = new cn.stream2000.railgunmq.core.Message.HeatBeat(this);
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.stream2000.railgunmq.core.Message.HeatBeat) {
          return mergeFrom((cn.stream2000.railgunmq.core.Message.HeatBeat)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.stream2000.railgunmq.core.Message.HeatBeat other) {
        if (other == cn.stream2000.railgunmq.core.Message.HeatBeat.getDefaultInstance()) return this;
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
        cn.stream2000.railgunmq.core.Message.HeatBeat parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.stream2000.railgunmq.core.Message.HeatBeat) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HeatBeat)
    }

    // @@protoc_insertion_point(class_scope:HeatBeat)
    private static final cn.stream2000.railgunmq.core.Message.HeatBeat DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new cn.stream2000.railgunmq.core.Message.HeatBeat();
    }

    public static cn.stream2000.railgunmq.core.Message.HeatBeat getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HeatBeat>
        PARSER = new com.google.protobuf.AbstractParser<HeatBeat>() {
      @java.lang.Override
      public HeatBeat parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HeatBeat(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HeatBeat> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HeatBeat> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public cn.stream2000.railgunmq.core.Message.HeatBeat getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HeatBeat_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HeatBeat_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023proto/message.proto\"\n\n\010HeatBeat*\267\002\n\013Me" +
      "ssageType\022\t\n\005Empty\020\000\022\031\n\025PubMessageReques" +
      "tType\020\001\022\032\n\026PubMessageResponseType\020\002\022\034\n\030C" +
      "reateChannelRequestType\020\003\022\035\n\031CreateChann" +
      "elResponseType\020\004\022\025\n\021NodeHeartBeatType\020\005\022" +
      "\023\n\017CSHeartBeatType\020\006\022\026\n\022SetChannelNameTy" +
      "pe\020\007\022\021\n\rDisconnecType\020\010\022\031\n\025SubMessageReq" +
      "uestType\020\t\022\032\n\026SubMessageResponseType\020\n\022\033" +
      "\n\027SendMessageResponseType\020\013*T\n\tErrorType" +
      "\022\006\n\002OK\020\000\022\027\n\023InternalServerError\020\001\022\020\n\014Inv" +
      "alidTopic\020\002\022\024\n\020FullMessageQueue\020\003B\'\n\034cn." +
      "stream2000.railgunmq.coreB\007Messageb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HeatBeat_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HeatBeat_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HeatBeat_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
