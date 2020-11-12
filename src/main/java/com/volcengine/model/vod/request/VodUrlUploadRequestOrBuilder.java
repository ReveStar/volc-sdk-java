// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.model.vod.request;

public interface VodUrlUploadRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Models.Vod.Request.VodUrlUploadRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 上传的空间名
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <pre>
   * 上传的空间名
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <pre>
   * 上传URL设置参数集合
   * </pre>
   *
   * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
   */
  java.util.List<com.volcengine.model.vod.business.VodUrlUploadURLSet> 
      getURLSetsList();
  /**
   * <pre>
   * 上传URL设置参数集合
   * </pre>
   *
   * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
   */
  com.volcengine.model.vod.business.VodUrlUploadURLSet getURLSets(int index);
  /**
   * <pre>
   * 上传URL设置参数集合
   * </pre>
   *
   * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
   */
  int getURLSetsCount();
  /**
   * <pre>
   * 上传URL设置参数集合
   * </pre>
   *
   * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
   */
  java.util.List<? extends com.volcengine.model.vod.business.VodUrlUploadURLSetOrBuilder> 
      getURLSetsOrBuilderList();
  /**
   * <pre>
   * 上传URL设置参数集合
   * </pre>
   *
   * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
   */
  com.volcengine.model.vod.business.VodUrlUploadURLSetOrBuilder getURLSetsOrBuilder(
      int index);
}
