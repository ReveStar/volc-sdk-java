// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/response/response_vod.proto

package com.volcengine.model.vod.response;

public interface VodGetVideoInfosResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Models.Vod.Response.VodGetVideoInfosResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Volcengine.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return Whether the responseMetadata field is set.
   */
  boolean hasResponseMetadata();
  /**
   * <code>.Volcengine.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return The responseMetadata.
   */
  com.volcengine.model.base.ResponseMetadata getResponseMetadata();
  /**
   * <code>.Volcengine.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   */
  com.volcengine.model.base.ResponseMetadataOrBuilder getResponseMetadataOrBuilder();

  /**
   * <code>.Volcengine.Models.Vod.Business.VodGetVideoInfosData Result = 2;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>.Volcengine.Models.Vod.Business.VodGetVideoInfosData Result = 2;</code>
   * @return The result.
   */
  com.volcengine.model.vod.business.VodGetVideoInfosData getResult();
  /**
   * <code>.Volcengine.Models.Vod.Business.VodGetVideoInfosData Result = 2;</code>
   */
  com.volcengine.model.vod.business.VodGetVideoInfosDataOrBuilder getResultOrBuilder();
}
