// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MemcachedCache.proto

package com.log4ic.compressor.cache.impl.memcached.protobuf;

public final class MemcachedCacheProtobuf {
  private MemcachedCacheProtobuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MemcachedCacheOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string content = 1;
    boolean hasContent();
    String getContent();
    
    // required string cacheFilePath = 2;
    boolean hasCacheFilePath();
    String getCacheFilePath();
    
    // required .MemcachedCache.FileType fileType = 3;
    boolean hasFileType();
    com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache.FileType getFileType();
    
    // required int64 createDate = 4;
    boolean hasCreateDate();
    long getCreateDate();
  }
  public static final class MemcachedCache extends
      com.google.protobuf.GeneratedMessage
      implements MemcachedCacheOrBuilder {
    // Use MemcachedCache.newBuilder() to construct.
    private MemcachedCache(Builder builder) {
      super(builder);
    }
    private MemcachedCache(boolean noInit) {}
    
    private static final MemcachedCache defaultInstance;
    public static MemcachedCache getDefaultInstance() {
      return defaultInstance;
    }
    
    public MemcachedCache getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.internal_static_MemcachedCache_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.internal_static_MemcachedCache_fieldAccessorTable;
    }
    
    public enum FileType
        implements com.google.protobuf.ProtocolMessageEnum {
      JS(0, 0),
      CSS(1, 1),
      GSS(2, 2),
      LESS(3, 3),
      MSS(4, 4),
      ;
      
      public static final int JS_VALUE = 0;
      public static final int CSS_VALUE = 1;
      public static final int GSS_VALUE = 2;
      public static final int LESS_VALUE = 3;
      public static final int MSS_VALUE = 4;
      
      
      public final int getNumber() { return value; }
      
      public static FileType valueOf(int value) {
        switch (value) {
          case 0: return JS;
          case 1: return CSS;
          case 2: return GSS;
          case 3: return LESS;
          case 4: return MSS;
          default: return null;
        }
      }
      
      public static com.google.protobuf.Internal.EnumLiteMap<FileType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<FileType>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<FileType>() {
              public FileType findValueByNumber(int number) {
                return FileType.valueOf(number);
              }
            };
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final FileType[] VALUES = {
        JS, CSS, GSS, LESS, MSS, 
      };
      
      public static FileType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      
      private final int index;
      private final int value;
      
      private FileType(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      // @@protoc_insertion_point(enum_scope:MemcachedCache.FileType)
    }
    
    private int bitField0_;
    // required string content = 1;
    public static final int CONTENT_FIELD_NUMBER = 1;
    private java.lang.Object content_;
    public boolean hasContent() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getContent() {
      java.lang.Object ref = content_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          content_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required string cacheFilePath = 2;
    public static final int CACHEFILEPATH_FIELD_NUMBER = 2;
    private java.lang.Object cacheFilePath_;
    public boolean hasCacheFilePath() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getCacheFilePath() {
      java.lang.Object ref = cacheFilePath_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          cacheFilePath_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getCacheFilePathBytes() {
      java.lang.Object ref = cacheFilePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        cacheFilePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required .MemcachedCache.FileType fileType = 3;
    public static final int FILETYPE_FIELD_NUMBER = 3;
    private com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache.FileType fileType_;
    public boolean hasFileType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache.FileType getFileType() {
      return fileType_;
    }
    
    // required int64 createDate = 4;
    public static final int CREATEDATE_FIELD_NUMBER = 4;
    private long createDate_;
    public boolean hasCreateDate() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public long getCreateDate() {
      return createDate_;
    }
    
    private void initFields() {
      content_ = "";
      cacheFilePath_ = "";
      fileType_ = com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache.FileType.JS;
      createDate_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasContent()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCacheFilePath()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFileType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCreateDate()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getContentBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getCacheFilePathBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, fileType_.getNumber());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt64(4, createDate_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getContentBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getCacheFilePathBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, fileType_.getNumber());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, createDate_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCacheOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.internal_static_MemcachedCache_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.internal_static_MemcachedCache_fieldAccessorTable;
      }
      
      // Construct using com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        content_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        cacheFilePath_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        fileType_ = com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache.FileType.JS;
        bitField0_ = (bitField0_ & ~0x00000004);
        createDate_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache.getDescriptor();
      }
      
      public com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache getDefaultInstanceForType() {
        return com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache.getDefaultInstance();
      }
      
      public com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache build() {
        com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache buildPartial() {
        com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache result = new com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.content_ = content_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.cacheFilePath_ = cacheFilePath_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.fileType_ = fileType_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.createDate_ = createDate_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache) {
          return mergeFrom((com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache other) {
        if (other == com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache.getDefaultInstance()) return this;
        if (other.hasContent()) {
          setContent(other.getContent());
        }
        if (other.hasCacheFilePath()) {
          setCacheFilePath(other.getCacheFilePath());
        }
        if (other.hasFileType()) {
          setFileType(other.getFileType());
        }
        if (other.hasCreateDate()) {
          setCreateDate(other.getCreateDate());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasContent()) {
          
          return false;
        }
        if (!hasCacheFilePath()) {
          
          return false;
        }
        if (!hasFileType()) {
          
          return false;
        }
        if (!hasCreateDate()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              content_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              cacheFilePath_ = input.readBytes();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
              com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache.FileType value = com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache.FileType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                fileType_ = value;
              }
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              createDate_ = input.readInt64();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string content = 1;
      private java.lang.Object content_ = "";
      public boolean hasContent() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getContent() {
        java.lang.Object ref = content_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          content_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setContent(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        content_ = value;
        onChanged();
        return this;
      }
      public Builder clearContent() {
        bitField0_ = (bitField0_ & ~0x00000001);
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }
      void setContent(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        content_ = value;
        onChanged();
      }
      
      // required string cacheFilePath = 2;
      private java.lang.Object cacheFilePath_ = "";
      public boolean hasCacheFilePath() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getCacheFilePath() {
        java.lang.Object ref = cacheFilePath_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          cacheFilePath_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setCacheFilePath(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        cacheFilePath_ = value;
        onChanged();
        return this;
      }
      public Builder clearCacheFilePath() {
        bitField0_ = (bitField0_ & ~0x00000002);
        cacheFilePath_ = getDefaultInstance().getCacheFilePath();
        onChanged();
        return this;
      }
      void setCacheFilePath(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        cacheFilePath_ = value;
        onChanged();
      }
      
      // required .MemcachedCache.FileType fileType = 3;
      private com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache.FileType fileType_ = com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache.FileType.JS;
      public boolean hasFileType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache.FileType getFileType() {
        return fileType_;
      }
      public Builder setFileType(com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache.FileType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        fileType_ = value;
        onChanged();
        return this;
      }
      public Builder clearFileType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        fileType_ = com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache.FileType.JS;
        onChanged();
        return this;
      }
      
      // required int64 createDate = 4;
      private long createDate_ ;
      public boolean hasCreateDate() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public long getCreateDate() {
        return createDate_;
      }
      public Builder setCreateDate(long value) {
        bitField0_ |= 0x00000008;
        createDate_ = value;
        onChanged();
        return this;
      }
      public Builder clearCreateDate() {
        bitField0_ = (bitField0_ & ~0x00000008);
        createDate_ = 0L;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:MemcachedCache)
    }
    
    static {
      defaultInstance = new MemcachedCache(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:MemcachedCache)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_MemcachedCache_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MemcachedCache_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024MemcachedCache.proto\"\261\001\n\016MemcachedCach" +
      "e\022\017\n\007content\030\001 \002(\t\022\025\n\rcacheFilePath\030\002 \002(" +
      "\t\022*\n\010fileType\030\003 \002(\0162\030.MemcachedCache.Fil" +
      "eType\022\022\n\ncreateDate\030\004 \002(\003\"7\n\010FileType\022\006\n" +
      "\002JS\020\000\022\007\n\003CSS\020\001\022\007\n\003GSS\020\002\022\010\n\004LESS\020\003\022\007\n\003MSS" +
      "\020\004BM\n3com.log4ic.compressor.cache.impl.m" +
      "emcached.protobufB\026MemcachedCacheProtobu" +
      "f"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_MemcachedCache_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_MemcachedCache_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_MemcachedCache_descriptor,
              new java.lang.String[] { "Content", "CacheFilePath", "FileType", "CreateDate", },
              com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache.class,
              com.log4ic.compressor.cache.impl.memcached.protobuf.MemcachedCacheProtobuf.MemcachedCache.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
