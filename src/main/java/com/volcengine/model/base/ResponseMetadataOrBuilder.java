// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: base/base.proto

package com.volcengine.model.base;

public interface ResponseMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Models.Base.ResponseMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 请求ID
   * </pre>
   *
   * <code>string RequestId = 1;</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * 请求ID
   * </pre>
   *
   * <code>string RequestId = 1;</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   * 请求接口
   * </pre>
   *
   * <code>string Action = 2;</code>
   * @return The action.
   */
  java.lang.String getAction();
  /**
   * <pre>
   * 请求接口
   * </pre>
   *
   * <code>string Action = 2;</code>
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString
      getActionBytes();

  /**
   * <pre>
   * 版本
   * </pre>
   *
   * <code>string Version = 3;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * 版本
   * </pre>
   *
   * <code>string Version = 3;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * 服务
   * </pre>
   *
   * <code>string Service = 4;</code>
   * @return The service.
   */
  java.lang.String getService();
  /**
   * <pre>
   * 服务
   * </pre>
   *
   * <code>string Service = 4;</code>
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString
      getServiceBytes();

  /**
   * <pre>
   * 区域
   * </pre>
   *
   * <code>string Region = 5;</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * 区域
   * </pre>
   *
   * <code>string Region = 5;</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <pre>
   * 异常信息
   * </pre>
   *
   * <code>.Volcengine.Models.Base.ResponseError Error = 6;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * 异常信息
   * </pre>
   *
   * <code>.Volcengine.Models.Base.ResponseError Error = 6;</code>
   * @return The error.
   */
  com.volcengine.model.base.ResponseError getError();
  /**
   * <pre>
   * 异常信息
   * </pre>
   *
   * <code>.Volcengine.Models.Base.ResponseError Error = 6;</code>
   */
  com.volcengine.model.base.ResponseErrorOrBuilder getErrorOrBuilder();
}
