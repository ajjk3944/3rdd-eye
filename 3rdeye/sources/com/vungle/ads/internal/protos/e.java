package com.vungle.ads.internal.protos;

import com.google.protobuf.AbstractC4026i;
import com.google.protobuf.U;
import com.google.protobuf.V;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;

/* compiled from: Sdk.java */
/* loaded from: classes2.dex */
public interface e extends V {
    String getConnectionType();

    AbstractC4026i getConnectionTypeBytes();

    String getConnectionTypeDetail();

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

    String getMeta();

    AbstractC4026i getMetaBytes();

    String getModel();

    AbstractC4026i getModelBytes();

    String getOs();

    AbstractC4026i getOsBytes();

    String getOsVersion();

    AbstractC4026i getOsVersionBytes();

    String getPlacementReferenceId();

    AbstractC4026i getPlacementReferenceIdBytes();

    String getSessionId();

    AbstractC4026i getSessionIdBytes();

    Sdk$SDKMetric.b getType();

    int getTypeValue();

    long getValue();

    @Override // com.google.protobuf.V
    /* synthetic */ boolean isInitialized();
}
