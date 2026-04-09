package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;

/* compiled from: Metrics.kt */
/* loaded from: classes2.dex */
public abstract class J {
    private String meta;
    private Sdk$SDKMetric.b metricType;

    public J(Sdk$SDKMetric.b metricType) {
        kotlin.jvm.internal.l.f(metricType, "metricType");
        this.metricType = metricType;
    }

    public final String getMeta() {
        return this.meta;
    }

    public final Sdk$SDKMetric.b getMetricType() {
        return this.metricType;
    }

    public abstract long getValue();

    public final void setMeta(String str) {
        this.meta = str;
    }

    public final void setMetricType(Sdk$SDKMetric.b bVar) {
        kotlin.jvm.internal.l.f(bVar, "<set-?>");
        this.metricType = bVar;
    }
}
