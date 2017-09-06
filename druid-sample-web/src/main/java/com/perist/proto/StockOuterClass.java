// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Stock.proto

package com.perist.proto;

public final class StockOuterClass {
  private StockOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StockOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.perist.proto.Stock)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *id
     * </pre>
     *
     * <code>int64 id = 1;</code>
     */
    long getId();

    /**
     * <pre>
     *股票名称
     * </pre>
     *
     * <code>string stockName = 2;</code>
     */
    java.lang.String getStockName();
    /**
     * <pre>
     *股票名称
     * </pre>
     *
     * <code>string stockName = 2;</code>
     */
    com.google.protobuf.ByteString
        getStockNameBytes();

    /**
     * <pre>
     *股票状态
     * </pre>
     *
     * <code>int32 status = 3;</code>
     */
    int getStatus();

    /**
     * <pre>
     *版本号
     * </pre>
     *
     * <code>int32 version = 4;</code>
     */
    int getVersion();
  }
  /**
   * <pre>
   *股票
   * </pre>
   *
   * Protobuf type {@code com.perist.proto.Stock}
   */
  public  static final class Stock extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.perist.proto.Stock)
      StockOrBuilder {
    // Use Stock.newBuilder() to construct.
    private Stock(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Stock() {
      id_ = 0L;
      stockName_ = "";
      status_ = 0;
      version_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Stock(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              id_ = input.readInt64();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              stockName_ = s;
              break;
            }
            case 24: {

              status_ = input.readInt32();
              break;
            }
            case 32: {

              version_ = input.readInt32();
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.perist.proto.StockOuterClass.internal_static_com_perist_proto_Stock_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.perist.proto.StockOuterClass.internal_static_com_perist_proto_Stock_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.perist.proto.StockOuterClass.Stock.class, com.perist.proto.StockOuterClass.Stock.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <pre>
     *id
     * </pre>
     *
     * <code>int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }

    public static final int STOCKNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object stockName_;
    /**
     * <pre>
     *股票名称
     * </pre>
     *
     * <code>string stockName = 2;</code>
     */
    public java.lang.String getStockName() {
      java.lang.Object ref = stockName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stockName_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *股票名称
     * </pre>
     *
     * <code>string stockName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getStockNameBytes() {
      java.lang.Object ref = stockName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stockName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STATUS_FIELD_NUMBER = 3;
    private int status_;
    /**
     * <pre>
     *股票状态
     * </pre>
     *
     * <code>int32 status = 3;</code>
     */
    public int getStatus() {
      return status_;
    }

    public static final int VERSION_FIELD_NUMBER = 4;
    private int version_;
    /**
     * <pre>
     *版本号
     * </pre>
     *
     * <code>int32 version = 4;</code>
     */
    public int getVersion() {
      return version_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (id_ != 0L) {
        output.writeInt64(1, id_);
      }
      if (!getStockNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, stockName_);
      }
      if (status_ != 0) {
        output.writeInt32(3, status_);
      }
      if (version_ != 0) {
        output.writeInt32(4, version_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, id_);
      }
      if (!getStockNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, stockName_);
      }
      if (status_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, status_);
      }
      if (version_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, version_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.perist.proto.StockOuterClass.Stock)) {
        return super.equals(obj);
      }
      com.perist.proto.StockOuterClass.Stock other = (com.perist.proto.StockOuterClass.Stock) obj;

      boolean result = true;
      result = result && (getId()
          == other.getId());
      result = result && getStockName()
          .equals(other.getStockName());
      result = result && (getStatus()
          == other.getStatus());
      result = result && (getVersion()
          == other.getVersion());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
      hash = (37 * hash) + STOCKNAME_FIELD_NUMBER;
      hash = (53 * hash) + getStockName().hashCode();
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus();
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.perist.proto.StockOuterClass.Stock parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.perist.proto.StockOuterClass.Stock parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.perist.proto.StockOuterClass.Stock parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.perist.proto.StockOuterClass.Stock parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.perist.proto.StockOuterClass.Stock parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.perist.proto.StockOuterClass.Stock parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.perist.proto.StockOuterClass.Stock parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.perist.proto.StockOuterClass.Stock parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.perist.proto.StockOuterClass.Stock parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.perist.proto.StockOuterClass.Stock parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.perist.proto.StockOuterClass.Stock parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.perist.proto.StockOuterClass.Stock parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.perist.proto.StockOuterClass.Stock prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * <pre>
     *股票
     * </pre>
     *
     * Protobuf type {@code com.perist.proto.Stock}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.perist.proto.Stock)
        com.perist.proto.StockOuterClass.StockOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.perist.proto.StockOuterClass.internal_static_com_perist_proto_Stock_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.perist.proto.StockOuterClass.internal_static_com_perist_proto_Stock_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.perist.proto.StockOuterClass.Stock.class, com.perist.proto.StockOuterClass.Stock.Builder.class);
      }

      // Construct using com.perist.proto.StockOuterClass.Stock.newBuilder()
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
      public Builder clear() {
        super.clear();
        id_ = 0L;

        stockName_ = "";

        status_ = 0;

        version_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.perist.proto.StockOuterClass.internal_static_com_perist_proto_Stock_descriptor;
      }

      public com.perist.proto.StockOuterClass.Stock getDefaultInstanceForType() {
        return com.perist.proto.StockOuterClass.Stock.getDefaultInstance();
      }

      public com.perist.proto.StockOuterClass.Stock build() {
        com.perist.proto.StockOuterClass.Stock result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.perist.proto.StockOuterClass.Stock buildPartial() {
        com.perist.proto.StockOuterClass.Stock result = new com.perist.proto.StockOuterClass.Stock(this);
        result.id_ = id_;
        result.stockName_ = stockName_;
        result.status_ = status_;
        result.version_ = version_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.perist.proto.StockOuterClass.Stock) {
          return mergeFrom((com.perist.proto.StockOuterClass.Stock)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.perist.proto.StockOuterClass.Stock other) {
        if (other == com.perist.proto.StockOuterClass.Stock.getDefaultInstance()) return this;
        if (other.getId() != 0L) {
          setId(other.getId());
        }
        if (!other.getStockName().isEmpty()) {
          stockName_ = other.stockName_;
          onChanged();
        }
        if (other.getStatus() != 0) {
          setStatus(other.getStatus());
        }
        if (other.getVersion() != 0) {
          setVersion(other.getVersion());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.perist.proto.StockOuterClass.Stock parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.perist.proto.StockOuterClass.Stock) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long id_ ;
      /**
       * <pre>
       *id
       * </pre>
       *
       * <code>int64 id = 1;</code>
       */
      public long getId() {
        return id_;
      }
      /**
       * <pre>
       *id
       * </pre>
       *
       * <code>int64 id = 1;</code>
       */
      public Builder setId(long value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *id
       * </pre>
       *
       * <code>int64 id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object stockName_ = "";
      /**
       * <pre>
       *股票名称
       * </pre>
       *
       * <code>string stockName = 2;</code>
       */
      public java.lang.String getStockName() {
        java.lang.Object ref = stockName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          stockName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *股票名称
       * </pre>
       *
       * <code>string stockName = 2;</code>
       */
      public com.google.protobuf.ByteString
          getStockNameBytes() {
        java.lang.Object ref = stockName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          stockName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *股票名称
       * </pre>
       *
       * <code>string stockName = 2;</code>
       */
      public Builder setStockName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        stockName_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *股票名称
       * </pre>
       *
       * <code>string stockName = 2;</code>
       */
      public Builder clearStockName() {
        
        stockName_ = getDefaultInstance().getStockName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *股票名称
       * </pre>
       *
       * <code>string stockName = 2;</code>
       */
      public Builder setStockNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        stockName_ = value;
        onChanged();
        return this;
      }

      private int status_ ;
      /**
       * <pre>
       *股票状态
       * </pre>
       *
       * <code>int32 status = 3;</code>
       */
      public int getStatus() {
        return status_;
      }
      /**
       * <pre>
       *股票状态
       * </pre>
       *
       * <code>int32 status = 3;</code>
       */
      public Builder setStatus(int value) {
        
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *股票状态
       * </pre>
       *
       * <code>int32 status = 3;</code>
       */
      public Builder clearStatus() {
        
        status_ = 0;
        onChanged();
        return this;
      }

      private int version_ ;
      /**
       * <pre>
       *版本号
       * </pre>
       *
       * <code>int32 version = 4;</code>
       */
      public int getVersion() {
        return version_;
      }
      /**
       * <pre>
       *版本号
       * </pre>
       *
       * <code>int32 version = 4;</code>
       */
      public Builder setVersion(int value) {
        
        version_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *版本号
       * </pre>
       *
       * <code>int32 version = 4;</code>
       */
      public Builder clearVersion() {
        
        version_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:com.perist.proto.Stock)
    }

    // @@protoc_insertion_point(class_scope:com.perist.proto.Stock)
    private static final com.perist.proto.StockOuterClass.Stock DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.perist.proto.StockOuterClass.Stock();
    }

    public static com.perist.proto.StockOuterClass.Stock getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Stock>
        PARSER = new com.google.protobuf.AbstractParser<Stock>() {
      public Stock parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Stock(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Stock> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Stock> getParserForType() {
      return PARSER;
    }

    public com.perist.proto.StockOuterClass.Stock getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_perist_proto_Stock_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_perist_proto_Stock_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Stock.proto\022\020com.perist.proto\"G\n\005Stock" +
      "\022\n\n\002id\030\001 \001(\003\022\021\n\tstockName\030\002 \001(\t\022\016\n\006statu" +
      "s\030\003 \001(\005\022\017\n\007version\030\004 \001(\005b\006proto3"
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
    internal_static_com_perist_proto_Stock_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_perist_proto_Stock_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_perist_proto_Stock_descriptor,
        new java.lang.String[] { "Id", "StockName", "Status", "Version", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}