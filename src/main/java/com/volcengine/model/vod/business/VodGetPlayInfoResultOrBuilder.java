// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_play.proto

package com.volcengine.model.vod.business;

public interface VodGetPlayInfoResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Models.Vod.Business.VodGetPlayInfoResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 唯一ID
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The vid.
   */
  java.lang.String getVid();
  /**
   * <pre>
   * 唯一ID
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The bytes for vid.
   */
  com.google.protobuf.ByteString
      getVidBytes();

  /**
   * <pre>
   *状态
   * </pre>
   *
   * <code>int64 Status = 2;</code>
   * @return The status.
   */
  long getStatus();

  /**
   * <pre>
   *封面地址
   * </pre>
   *
   * <code>string PosterUrl = 3;</code>
   * @return The posterUrl.
   */
  java.lang.String getPosterUrl();
  /**
   * <pre>
   *封面地址
   * </pre>
   *
   * <code>string PosterUrl = 3;</code>
   * @return The bytes for posterUrl.
   */
  com.google.protobuf.ByteString
      getPosterUrlBytes();

  /**
   * <pre>
   *播放时长(单位：s)
   * </pre>
   *
   * <code>float Duration = 4;</code>
   * @return The duration.
   */
  float getDuration();

  /**
   * <pre>
   * 媒体类型
   * </pre>
   *
   * <code>string FileType = 5;</code>
   * @return The fileType.
   */
  java.lang.String getFileType();
  /**
   * <pre>
   * 媒体类型
   * </pre>
   *
   * <code>string FileType = 5;</code>
   * @return The bytes for fileType.
   */
  com.google.protobuf.ByteString
      getFileTypeBytes();

  /**
   * <pre>
   *是否关键针对齐
   * </pre>
   *
   * <code>bool EnableAdaptive = 6;</code>
   * @return The enableAdaptive.
   */
  boolean getEnableAdaptive();

  /**
   * <pre>
   *播放列表数量
   * </pre>
   *
   * <code>int64 TotalCount = 7;</code>
   * @return The totalCount.
   */
  long getTotalCount();

  /**
   * <pre>
   * dash播放信息
   * </pre>
   *
   * <code>.Volcengine.Models.Vod.Business.VodAdaptiveInfo AdaptiveInfo = 8;</code>
   * @return Whether the adaptiveInfo field is set.
   */
  boolean hasAdaptiveInfo();
  /**
   * <pre>
   * dash播放信息
   * </pre>
   *
   * <code>.Volcengine.Models.Vod.Business.VodAdaptiveInfo AdaptiveInfo = 8;</code>
   * @return The adaptiveInfo.
   */
  com.volcengine.model.vod.business.VodAdaptiveInfo getAdaptiveInfo();
  /**
   * <pre>
   * dash播放信息
   * </pre>
   *
   * <code>.Volcengine.Models.Vod.Business.VodAdaptiveInfo AdaptiveInfo = 8;</code>
   */
  com.volcengine.model.vod.business.VodAdaptiveInfoOrBuilder getAdaptiveInfoOrBuilder();

  /**
   * <pre>
   *播放列表
   * </pre>
   *
   * <code>repeated .Volcengine.Models.Vod.Business.VodPlayInfo PlayInfoList = 9;</code>
   */
  java.util.List<com.volcengine.model.vod.business.VodPlayInfo> 
      getPlayInfoListList();
  /**
   * <pre>
   *播放列表
   * </pre>
   *
   * <code>repeated .Volcengine.Models.Vod.Business.VodPlayInfo PlayInfoList = 9;</code>
   */
  com.volcengine.model.vod.business.VodPlayInfo getPlayInfoList(int index);
  /**
   * <pre>
   *播放列表
   * </pre>
   *
   * <code>repeated .Volcengine.Models.Vod.Business.VodPlayInfo PlayInfoList = 9;</code>
   */
  int getPlayInfoListCount();
  /**
   * <pre>
   *播放列表
   * </pre>
   *
   * <code>repeated .Volcengine.Models.Vod.Business.VodPlayInfo PlayInfoList = 9;</code>
   */
  java.util.List<? extends com.volcengine.model.vod.business.VodPlayInfoOrBuilder> 
      getPlayInfoListOrBuilderList();
  /**
   * <pre>
   *播放列表
   * </pre>
   *
   * <code>repeated .Volcengine.Models.Vod.Business.VodPlayInfo PlayInfoList = 9;</code>
   */
  com.volcengine.model.vod.business.VodPlayInfoOrBuilder getPlayInfoListOrBuilder(
      int index);
}
