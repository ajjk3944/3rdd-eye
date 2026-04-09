package com.vungle.ads.internal.protos;

import com.google.protobuf.AbstractC4026i;
import com.google.protobuf.U;
import com.google.protobuf.V;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* compiled from: Sdk.java */
/* loaded from: classes2.dex */
public interface d extends V {
    long getAt();

    String getConnectionType();

    AbstractC4026i getConnectionTypeBytes();

    String getConnectionTypeDetail();

    String getConnectionTypeDetailAndroid();

    AbstractC4026i getConnectionTypeDetailAndroidBytes();

    AbstractC4026i getConnectionTypeDetailBytes();

    String getCreativeId();

    AbstractC4026i getCreativeIdBytes();

    @Override // com.google.protobuf.V
    /* synthetic */ U getDefaultInstanceForType();

    String getEventId();

    AbstractC4026i getEventIdBytes();

    long getIsHbPlacement();

    String getMake();

    AbstractC4026i getMakeBytes();

    String getMessage();

    AbstractC4026i getMessageBytes();

    String getModel();

    AbstractC4026i getModelBytes();

    String getOs();

    AbstractC4026i getOsBytes();

    String getOsVersion();

    AbstractC4026i getOsVersionBytes();

    String getPlacementReferenceId();

    AbstractC4026i getPlacementReferenceIdBytes();

    Sdk$SDKError.b getReason();

    int getReasonValue();

    String getSessionId();

    AbstractC4026i getSessionIdBytes();

    @Override // com.google.protobuf.V
    /* synthetic */ boolean isInitialized();
}
