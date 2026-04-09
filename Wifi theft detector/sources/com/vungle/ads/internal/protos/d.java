package com.vungle.ads.internal.protos;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: classes3.dex */
public interface d extends MessageLiteOrBuilder {
    String getAdSource();

    ByteString getAdSourceBytes();

    long getAppState();

    long getAt();

    String getConnectionType();

    ByteString getConnectionTypeBytes();

    String getConnectionTypeDetail();

    String getConnectionTypeDetailAndroid();

    ByteString getConnectionTypeDetailAndroidBytes();

    ByteString getConnectionTypeDetailBytes();

    String getCreativeId();

    ByteString getCreativeIdBytes();

    String getEventId();

    ByteString getEventIdBytes();

    boolean getIsAdoEnabled();

    long getIsHbPlacement();

    boolean getIsLowDataModeEnabled();

    boolean getIsPartialDownloadEnabled();

    String getMake();

    ByteString getMakeBytes();

    String getMediationName();

    ByteString getMediationNameBytes();

    String getMessage();

    ByteString getMessageBytes();

    String getModel();

    ByteString getModelBytes();

    String getOs();

    ByteString getOsBytes();

    String getOsVersion();

    ByteString getOsVersionBytes();

    String getPlacementReferenceId();

    ByteString getPlacementReferenceIdBytes();

    String getPlacementType();

    ByteString getPlacementTypeBytes();

    Sdk$SDKError.Reason getReason();

    int getReasonValue();

    String getSessionId();

    ByteString getSessionIdBytes();

    String getVmVersion();

    ByteString getVmVersionBytes();
}
