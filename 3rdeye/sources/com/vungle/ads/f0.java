package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;

/* compiled from: Metrics.kt */
/* loaded from: classes2.dex */
public class f0 extends AbstractC4065x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Sdk$SDKMetric.b metricType) {
        super(metricType);
        kotlin.jvm.internal.l.f(metricType, "metricType");
    }

    private final long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public final long calculateIntervalDuration() {
        long currentTime = getCurrentTime();
        Long valueSecond = getValueSecond();
        long jLongValue = valueSecond != null ? valueSecond.longValue() : currentTime;
        Long valueFirst = getValueFirst();
        if (valueFirst != null) {
            currentTime = valueFirst.longValue();
        }
        return jLongValue - currentTime;
    }

    @Override // com.vungle.ads.J
    public long getValue() {
        return calculateIntervalDuration();
    }

    public void markEnd() {
        setValueSecond(Long.valueOf(getCurrentTime()));
    }

    public void markStart() {
        setValueFirst(Long.valueOf(getCurrentTime()));
    }
}
