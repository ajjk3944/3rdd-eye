package com.vungle.ads.internal.protos;

import com.google.protobuf.U;
import com.google.protobuf.V;
import java.util.List;

/* compiled from: Sdk.java */
/* loaded from: classes2.dex */
public interface b extends V {
    @Override // com.google.protobuf.V
    /* synthetic */ U getDefaultInstanceForType();

    Sdk$SDKMetric getMetrics(int i);

    int getMetricsCount();

    List<Sdk$SDKMetric> getMetricsList();

    @Override // com.google.protobuf.V
    /* synthetic */ boolean isInitialized();
}
