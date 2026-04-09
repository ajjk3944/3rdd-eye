package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;

/* compiled from: Metrics.kt */
/* renamed from: com.vungle.ads.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4065x extends J {
    private Long valueFirst;
    private Long valueSecond;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4065x(Sdk$SDKMetric.b metricType) {
        super(metricType);
        kotlin.jvm.internal.l.f(metricType, "metricType");
    }

    public final Long getValueFirst() {
        return this.valueFirst;
    }

    public final Long getValueSecond() {
        return this.valueSecond;
    }

    public final void setValueFirst(Long l5) {
        this.valueFirst = l5;
    }

    public final void setValueSecond(Long l5) {
        this.valueSecond = l5;
    }
}
