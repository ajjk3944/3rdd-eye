package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;

/* compiled from: Metrics.kt */
/* loaded from: classes2.dex */
public final class e0 extends J {
    private Long value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Sdk$SDKMetric.b metricType) {
        super(metricType);
        kotlin.jvm.internal.l.f(metricType, "metricType");
    }

    public final void addValue(long j4) {
        Long l5 = this.value;
        this.value = Long.valueOf((l5 != null ? l5.longValue() : 0L) + j4);
    }

    /* renamed from: getValue, reason: collision with other method in class */
    public final Long m25getValue() {
        return this.value;
    }

    public final void markTime() {
        this.value = Long.valueOf(System.currentTimeMillis());
    }

    public final void setValue(Long l5) {
        this.value = l5;
    }

    @Override // com.vungle.ads.J
    public long getValue() {
        Long l5 = this.value;
        if (l5 != null) {
            return l5.longValue();
        }
        return 0L;
    }
}
