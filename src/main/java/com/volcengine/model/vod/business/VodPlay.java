// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_play.proto

package com.volcengine.model.vod.business;

public final class VodPlay {
  private VodPlay() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Business_VodPlayInfoModel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Business_VodPlayInfoModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Business_VodGetOriginalPlayInfoResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Business_VodGetOriginalPlayInfoResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033vod/business/vod_play.proto\022\036Volcengin" +
      "e.Models.Vod.Business\032\035vod/business/vod_" +
      "common.proto\"\346\002\n\020VodPlayInfoModel\022H\n\007Ver" +
      "sion\030\n \001(\01627.Volcengine.Models.Vod.Busin" +
      "ess.VodPlayInfoModelVersion\022\013\n\003Vid\030\001 \001(\t" +
      "\022\016\n\006Status\030\002 \001(\005\022\021\n\tPosterUrl\030\003 \001(\t\022\020\n\010D" +
      "uration\030\004 \001(\002\022\020\n\010FileType\030\005 \001(\t\022\026\n\016Enabl" +
      "eAdaptive\030\006 \001(\010\022\022\n\nTotalCount\030\007 \001(\005\022E\n\014A" +
      "daptiveInfo\030\010 \001(\0132/.Volcengine.Models.Vo" +
      "d.Business.VodAdaptiveInfo\022A\n\014PlayInfoLi" +
      "st\030\t \003(\0132+.Volcengine.Models.Vod.Busines" +
      "s.VodPlayInfo\"\330\001\n\034VodGetOriginalPlayInfo" +
      "Result\022\020\n\010FileType\030\001 \001(\t\022\020\n\010Duration\030\002 \001" +
      "(\002\022\014\n\004Size\030\003 \001(\001\022\016\n\006Height\030\004 \001(\005\022\r\n\005Widt" +
      "h\030\005 \001(\005\022\016\n\006Format\030\006 \001(\t\022\r\n\005Codec\030\007 \001(\t\022\017" +
      "\n\007Bitrate\030\010 \001(\005\022\013\n\003Md5\030\t \001(\t\022\023\n\013MainPlay" +
      "Url\030\n \001(\t\022\025\n\rBackupPlayUrl\030\013 \001(\t*\326\001\n\027Vod" +
      "PlayInfoModelVersion\022$\n UndefinedVodPlay" +
      "InfoModelVersion\020\000\022%\n!InternalV1VodPlayI" +
      "nfoModelVersion\020\001\022%\n!InternalV2VodPlayIn" +
      "foModelVersion\020\002\022%\n!InternalV3VodPlayInf" +
      "oModelVersion\020\003\022 \n\034ToBV1VodPlayInfoModel" +
      "Version\020\004B\247\001\n!com.volcengine.model.vod.b" +
      "usinessB\007VodPlayP\001Z9github.com/volcengin" +
      "e/volc-sdk-golang/models/vod/business\240\001\001" +
      "\330\001\001\302\002\000\312\002\030Volc\\Models\\Vod\\Business\342\002\027Volc" +
      "\\Models\\GPBMetadatab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.volcengine.model.vod.business.VodCommon.getDescriptor(),
        });
    internal_static_Volcengine_Models_Vod_Business_VodPlayInfoModel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Volcengine_Models_Vod_Business_VodPlayInfoModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Business_VodPlayInfoModel_descriptor,
        new java.lang.String[] { "Version", "Vid", "Status", "PosterUrl", "Duration", "FileType", "EnableAdaptive", "TotalCount", "AdaptiveInfo", "PlayInfoList", });
    internal_static_Volcengine_Models_Vod_Business_VodGetOriginalPlayInfoResult_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Volcengine_Models_Vod_Business_VodGetOriginalPlayInfoResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Business_VodGetOriginalPlayInfoResult_descriptor,
        new java.lang.String[] { "FileType", "Duration", "Size", "Height", "Width", "Format", "Codec", "Bitrate", "Md5", "MainPlayUrl", "BackupPlayUrl", });
    com.volcengine.model.vod.business.VodCommon.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
