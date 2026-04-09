package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class t extends y {
    private boolean alreadyLogged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@NotNull Sdk$SDKMetric.SDKMetricType metricType) {
        super(metricType);
        kotlin.jvm.internal.p.e(metricType, "metricType");
    }

    public final boolean isLogged() {
        return this.alreadyLogged;
    }

    public final void markLogged() {
        this.alreadyLogged = true;
    }
}
