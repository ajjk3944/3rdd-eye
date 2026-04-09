package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class o {

    @Nullable
    private String meta;

    @NotNull
    private Sdk$SDKMetric.SDKMetricType metricType;

    public o(@NotNull Sdk$SDKMetric.SDKMetricType metricType) {
        kotlin.jvm.internal.p.e(metricType, "metricType");
        this.metricType = metricType;
    }

    @Nullable
    public final String getMeta() {
        return this.meta;
    }

    @NotNull
    public final Sdk$SDKMetric.SDKMetricType getMetricType() {
        return this.metricType;
    }

    public abstract long getValue();

    public final void setMeta(@Nullable String str) {
        this.meta = str;
    }

    public final void setMetricType(@NotNull Sdk$SDKMetric.SDKMetricType sDKMetricType) {
        kotlin.jvm.internal.p.e(sDKMetricType, "<set-?>");
        this.metricType = sDKMetricType;
    }
}
