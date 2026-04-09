package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;

/* compiled from: Metrics.kt */
/* loaded from: classes2.dex */
public final class U extends f0 {
    private boolean alreadyLogged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(Sdk$SDKMetric.b metricType) {
        super(metricType);
        kotlin.jvm.internal.l.f(metricType, "metricType");
    }

    public final boolean alreadyMetered$vungle_ads_release() {
        return (getValueFirst() == null || getValueSecond() == null) ? false : true;
    }

    public final boolean isLogged() {
        return this.alreadyLogged;
    }

    @Override // com.vungle.ads.f0
    public void markEnd() {
        if (getValueSecond() == null) {
            super.markEnd();
        }
    }

    public final void markLogged() {
        this.alreadyLogged = true;
    }

    @Override // com.vungle.ads.f0
    public void markStart() {
        if (getValueFirst() == null) {
            super.markStart();
        }
    }
}
