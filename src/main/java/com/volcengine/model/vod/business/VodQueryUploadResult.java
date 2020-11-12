// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_upload.proto

package com.volcengine.model.vod.business;

/**
 * Protobuf type {@code Volcengine.Models.Vod.Business.VodQueryUploadResult}
 */
public final class VodQueryUploadResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Models.Vod.Business.VodQueryUploadResult)
    VodQueryUploadResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodQueryUploadResult.newBuilder() to construct.
  private VodQueryUploadResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodQueryUploadResult() {
    videoInfoList_ = java.util.Collections.emptyList();
    notExistJobIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodQueryUploadResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodQueryUploadResult(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              videoInfoList_ = new java.util.ArrayList<com.volcengine.model.vod.business.VodURLSet>();
              mutable_bitField0_ |= 0x00000001;
            }
            videoInfoList_.add(
                input.readMessage(com.volcengine.model.vod.business.VodURLSet.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              notExistJobIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            notExistJobIds_.add(s);
            break;
          }
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        videoInfoList_ = java.util.Collections.unmodifiableList(videoInfoList_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        notExistJobIds_ = notExistJobIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.model.vod.business.VodUpload.internal_static_Volcengine_Models_Vod_Business_VodQueryUploadResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.model.vod.business.VodUpload.internal_static_Volcengine_Models_Vod_Business_VodQueryUploadResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.model.vod.business.VodQueryUploadResult.class, com.volcengine.model.vod.business.VodQueryUploadResult.Builder.class);
  }

  public static final int VIDEOINFOLIST_FIELD_NUMBER = 1;
  private java.util.List<com.volcengine.model.vod.business.VodURLSet> videoInfoList_;
  /**
   * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.volcengine.model.vod.business.VodURLSet> getVideoInfoListList() {
    return videoInfoList_;
  }
  /**
   * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.volcengine.model.vod.business.VodURLSetOrBuilder> 
      getVideoInfoListOrBuilderList() {
    return videoInfoList_;
  }
  /**
   * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
   */
  @java.lang.Override
  public int getVideoInfoListCount() {
    return videoInfoList_.size();
  }
  /**
   * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.model.vod.business.VodURLSet getVideoInfoList(int index) {
    return videoInfoList_.get(index);
  }
  /**
   * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.model.vod.business.VodURLSetOrBuilder getVideoInfoListOrBuilder(
      int index) {
    return videoInfoList_.get(index);
  }

  public static final int NOTEXISTJOBIDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList notExistJobIds_;
  /**
   * <code>repeated string NotExistJobIds = 2;</code>
   * @return A list containing the notExistJobIds.
   */
  public com.google.protobuf.ProtocolStringList
      getNotExistJobIdsList() {
    return notExistJobIds_;
  }
  /**
   * <code>repeated string NotExistJobIds = 2;</code>
   * @return The count of notExistJobIds.
   */
  public int getNotExistJobIdsCount() {
    return notExistJobIds_.size();
  }
  /**
   * <code>repeated string NotExistJobIds = 2;</code>
   * @param index The index of the element to return.
   * @return The notExistJobIds at the given index.
   */
  public java.lang.String getNotExistJobIds(int index) {
    return notExistJobIds_.get(index);
  }
  /**
   * <code>repeated string NotExistJobIds = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the notExistJobIds at the given index.
   */
  public com.google.protobuf.ByteString
      getNotExistJobIdsBytes(int index) {
    return notExistJobIds_.getByteString(index);
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
    for (int i = 0; i < videoInfoList_.size(); i++) {
      output.writeMessage(1, videoInfoList_.get(i));
    }
    for (int i = 0; i < notExistJobIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, notExistJobIds_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < videoInfoList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, videoInfoList_.get(i));
    }
    {
      int dataSize = 0;
      for (int i = 0; i < notExistJobIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(notExistJobIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNotExistJobIdsList().size();
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
    if (!(obj instanceof com.volcengine.model.vod.business.VodQueryUploadResult)) {
      return super.equals(obj);
    }
    com.volcengine.model.vod.business.VodQueryUploadResult other = (com.volcengine.model.vod.business.VodQueryUploadResult) obj;

    if (!getVideoInfoListList()
        .equals(other.getVideoInfoListList())) return false;
    if (!getNotExistJobIdsList()
        .equals(other.getNotExistJobIdsList())) return false;
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
    if (getVideoInfoListCount() > 0) {
      hash = (37 * hash) + VIDEOINFOLIST_FIELD_NUMBER;
      hash = (53 * hash) + getVideoInfoListList().hashCode();
    }
    if (getNotExistJobIdsCount() > 0) {
      hash = (37 * hash) + NOTEXISTJOBIDS_FIELD_NUMBER;
      hash = (53 * hash) + getNotExistJobIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.model.vod.business.VodQueryUploadResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.model.vod.business.VodQueryUploadResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.model.vod.business.VodQueryUploadResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.model.vod.business.VodQueryUploadResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.model.vod.business.VodQueryUploadResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.model.vod.business.VodQueryUploadResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.model.vod.business.VodQueryUploadResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.model.vod.business.VodQueryUploadResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.model.vod.business.VodQueryUploadResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.model.vod.business.VodQueryUploadResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.model.vod.business.VodQueryUploadResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.model.vod.business.VodQueryUploadResult parseFrom(
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
  public static Builder newBuilder(com.volcengine.model.vod.business.VodQueryUploadResult prototype) {
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
   * Protobuf type {@code Volcengine.Models.Vod.Business.VodQueryUploadResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Models.Vod.Business.VodQueryUploadResult)
      com.volcengine.model.vod.business.VodQueryUploadResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.model.vod.business.VodUpload.internal_static_Volcengine_Models_Vod_Business_VodQueryUploadResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.model.vod.business.VodUpload.internal_static_Volcengine_Models_Vod_Business_VodQueryUploadResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.model.vod.business.VodQueryUploadResult.class, com.volcengine.model.vod.business.VodQueryUploadResult.Builder.class);
    }

    // Construct using com.volcengine.model.vod.business.VodQueryUploadResult.newBuilder()
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
        getVideoInfoListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (videoInfoListBuilder_ == null) {
        videoInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        videoInfoListBuilder_.clear();
      }
      notExistJobIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.model.vod.business.VodUpload.internal_static_Volcengine_Models_Vod_Business_VodQueryUploadResult_descriptor;
    }

    @java.lang.Override
    public com.volcengine.model.vod.business.VodQueryUploadResult getDefaultInstanceForType() {
      return com.volcengine.model.vod.business.VodQueryUploadResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.model.vod.business.VodQueryUploadResult build() {
      com.volcengine.model.vod.business.VodQueryUploadResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.model.vod.business.VodQueryUploadResult buildPartial() {
      com.volcengine.model.vod.business.VodQueryUploadResult result = new com.volcengine.model.vod.business.VodQueryUploadResult(this);
      int from_bitField0_ = bitField0_;
      if (videoInfoListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          videoInfoList_ = java.util.Collections.unmodifiableList(videoInfoList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.videoInfoList_ = videoInfoList_;
      } else {
        result.videoInfoList_ = videoInfoListBuilder_.build();
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        notExistJobIds_ = notExistJobIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.notExistJobIds_ = notExistJobIds_;
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
      if (other instanceof com.volcengine.model.vod.business.VodQueryUploadResult) {
        return mergeFrom((com.volcengine.model.vod.business.VodQueryUploadResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.model.vod.business.VodQueryUploadResult other) {
      if (other == com.volcengine.model.vod.business.VodQueryUploadResult.getDefaultInstance()) return this;
      if (videoInfoListBuilder_ == null) {
        if (!other.videoInfoList_.isEmpty()) {
          if (videoInfoList_.isEmpty()) {
            videoInfoList_ = other.videoInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVideoInfoListIsMutable();
            videoInfoList_.addAll(other.videoInfoList_);
          }
          onChanged();
        }
      } else {
        if (!other.videoInfoList_.isEmpty()) {
          if (videoInfoListBuilder_.isEmpty()) {
            videoInfoListBuilder_.dispose();
            videoInfoListBuilder_ = null;
            videoInfoList_ = other.videoInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            videoInfoListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getVideoInfoListFieldBuilder() : null;
          } else {
            videoInfoListBuilder_.addAllMessages(other.videoInfoList_);
          }
        }
      }
      if (!other.notExistJobIds_.isEmpty()) {
        if (notExistJobIds_.isEmpty()) {
          notExistJobIds_ = other.notExistJobIds_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureNotExistJobIdsIsMutable();
          notExistJobIds_.addAll(other.notExistJobIds_);
        }
        onChanged();
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
      com.volcengine.model.vod.business.VodQueryUploadResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.model.vod.business.VodQueryUploadResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.volcengine.model.vod.business.VodURLSet> videoInfoList_ =
      java.util.Collections.emptyList();
    private void ensureVideoInfoListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        videoInfoList_ = new java.util.ArrayList<com.volcengine.model.vod.business.VodURLSet>(videoInfoList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.model.vod.business.VodURLSet, com.volcengine.model.vod.business.VodURLSet.Builder, com.volcengine.model.vod.business.VodURLSetOrBuilder> videoInfoListBuilder_;

    /**
     * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
     */
    public java.util.List<com.volcengine.model.vod.business.VodURLSet> getVideoInfoListList() {
      if (videoInfoListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(videoInfoList_);
      } else {
        return videoInfoListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
     */
    public int getVideoInfoListCount() {
      if (videoInfoListBuilder_ == null) {
        return videoInfoList_.size();
      } else {
        return videoInfoListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
     */
    public com.volcengine.model.vod.business.VodURLSet getVideoInfoList(int index) {
      if (videoInfoListBuilder_ == null) {
        return videoInfoList_.get(index);
      } else {
        return videoInfoListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
     */
    public Builder setVideoInfoList(
        int index, com.volcengine.model.vod.business.VodURLSet value) {
      if (videoInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVideoInfoListIsMutable();
        videoInfoList_.set(index, value);
        onChanged();
      } else {
        videoInfoListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
     */
    public Builder setVideoInfoList(
        int index, com.volcengine.model.vod.business.VodURLSet.Builder builderForValue) {
      if (videoInfoListBuilder_ == null) {
        ensureVideoInfoListIsMutable();
        videoInfoList_.set(index, builderForValue.build());
        onChanged();
      } else {
        videoInfoListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
     */
    public Builder addVideoInfoList(com.volcengine.model.vod.business.VodURLSet value) {
      if (videoInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVideoInfoListIsMutable();
        videoInfoList_.add(value);
        onChanged();
      } else {
        videoInfoListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
     */
    public Builder addVideoInfoList(
        int index, com.volcengine.model.vod.business.VodURLSet value) {
      if (videoInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVideoInfoListIsMutable();
        videoInfoList_.add(index, value);
        onChanged();
      } else {
        videoInfoListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
     */
    public Builder addVideoInfoList(
        com.volcengine.model.vod.business.VodURLSet.Builder builderForValue) {
      if (videoInfoListBuilder_ == null) {
        ensureVideoInfoListIsMutable();
        videoInfoList_.add(builderForValue.build());
        onChanged();
      } else {
        videoInfoListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
     */
    public Builder addVideoInfoList(
        int index, com.volcengine.model.vod.business.VodURLSet.Builder builderForValue) {
      if (videoInfoListBuilder_ == null) {
        ensureVideoInfoListIsMutable();
        videoInfoList_.add(index, builderForValue.build());
        onChanged();
      } else {
        videoInfoListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
     */
    public Builder addAllVideoInfoList(
        java.lang.Iterable<? extends com.volcengine.model.vod.business.VodURLSet> values) {
      if (videoInfoListBuilder_ == null) {
        ensureVideoInfoListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, videoInfoList_);
        onChanged();
      } else {
        videoInfoListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
     */
    public Builder clearVideoInfoList() {
      if (videoInfoListBuilder_ == null) {
        videoInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        videoInfoListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
     */
    public Builder removeVideoInfoList(int index) {
      if (videoInfoListBuilder_ == null) {
        ensureVideoInfoListIsMutable();
        videoInfoList_.remove(index);
        onChanged();
      } else {
        videoInfoListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
     */
    public com.volcengine.model.vod.business.VodURLSet.Builder getVideoInfoListBuilder(
        int index) {
      return getVideoInfoListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
     */
    public com.volcengine.model.vod.business.VodURLSetOrBuilder getVideoInfoListOrBuilder(
        int index) {
      if (videoInfoListBuilder_ == null) {
        return videoInfoList_.get(index);  } else {
        return videoInfoListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
     */
    public java.util.List<? extends com.volcengine.model.vod.business.VodURLSetOrBuilder> 
         getVideoInfoListOrBuilderList() {
      if (videoInfoListBuilder_ != null) {
        return videoInfoListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(videoInfoList_);
      }
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
     */
    public com.volcengine.model.vod.business.VodURLSet.Builder addVideoInfoListBuilder() {
      return getVideoInfoListFieldBuilder().addBuilder(
          com.volcengine.model.vod.business.VodURLSet.getDefaultInstance());
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
     */
    public com.volcengine.model.vod.business.VodURLSet.Builder addVideoInfoListBuilder(
        int index) {
      return getVideoInfoListFieldBuilder().addBuilder(
          index, com.volcengine.model.vod.business.VodURLSet.getDefaultInstance());
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.VodURLSet VideoInfoList = 1;</code>
     */
    public java.util.List<com.volcengine.model.vod.business.VodURLSet.Builder> 
         getVideoInfoListBuilderList() {
      return getVideoInfoListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.model.vod.business.VodURLSet, com.volcengine.model.vod.business.VodURLSet.Builder, com.volcengine.model.vod.business.VodURLSetOrBuilder> 
        getVideoInfoListFieldBuilder() {
      if (videoInfoListBuilder_ == null) {
        videoInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.volcengine.model.vod.business.VodURLSet, com.volcengine.model.vod.business.VodURLSet.Builder, com.volcengine.model.vod.business.VodURLSetOrBuilder>(
                videoInfoList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        videoInfoList_ = null;
      }
      return videoInfoListBuilder_;
    }

    private com.google.protobuf.LazyStringList notExistJobIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureNotExistJobIdsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        notExistJobIds_ = new com.google.protobuf.LazyStringArrayList(notExistJobIds_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string NotExistJobIds = 2;</code>
     * @return A list containing the notExistJobIds.
     */
    public com.google.protobuf.ProtocolStringList
        getNotExistJobIdsList() {
      return notExistJobIds_.getUnmodifiableView();
    }
    /**
     * <code>repeated string NotExistJobIds = 2;</code>
     * @return The count of notExistJobIds.
     */
    public int getNotExistJobIdsCount() {
      return notExistJobIds_.size();
    }
    /**
     * <code>repeated string NotExistJobIds = 2;</code>
     * @param index The index of the element to return.
     * @return The notExistJobIds at the given index.
     */
    public java.lang.String getNotExistJobIds(int index) {
      return notExistJobIds_.get(index);
    }
    /**
     * <code>repeated string NotExistJobIds = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the notExistJobIds at the given index.
     */
    public com.google.protobuf.ByteString
        getNotExistJobIdsBytes(int index) {
      return notExistJobIds_.getByteString(index);
    }
    /**
     * <code>repeated string NotExistJobIds = 2;</code>
     * @param index The index to set the value at.
     * @param value The notExistJobIds to set.
     * @return This builder for chaining.
     */
    public Builder setNotExistJobIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNotExistJobIdsIsMutable();
      notExistJobIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string NotExistJobIds = 2;</code>
     * @param value The notExistJobIds to add.
     * @return This builder for chaining.
     */
    public Builder addNotExistJobIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNotExistJobIdsIsMutable();
      notExistJobIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string NotExistJobIds = 2;</code>
     * @param values The notExistJobIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllNotExistJobIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureNotExistJobIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, notExistJobIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string NotExistJobIds = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNotExistJobIds() {
      notExistJobIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string NotExistJobIds = 2;</code>
     * @param value The bytes of the notExistJobIds to add.
     * @return This builder for chaining.
     */
    public Builder addNotExistJobIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureNotExistJobIdsIsMutable();
      notExistJobIds_.add(value);
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Models.Vod.Business.VodQueryUploadResult)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Models.Vod.Business.VodQueryUploadResult)
  private static final com.volcengine.model.vod.business.VodQueryUploadResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.model.vod.business.VodQueryUploadResult();
  }

  public static com.volcengine.model.vod.business.VodQueryUploadResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodQueryUploadResult>
      PARSER = new com.google.protobuf.AbstractParser<VodQueryUploadResult>() {
    @java.lang.Override
    public VodQueryUploadResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodQueryUploadResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodQueryUploadResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodQueryUploadResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.model.vod.business.VodQueryUploadResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

