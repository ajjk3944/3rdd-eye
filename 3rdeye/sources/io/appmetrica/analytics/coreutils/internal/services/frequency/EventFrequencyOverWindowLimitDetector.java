package io.appmetrica.analytics.coreutils.internal.services.frequency;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes3.dex */
public final class EventFrequencyOverWindowLimitDetector {

    /* renamed from: a, reason: collision with root package name */
    private long f38988a;

    /* renamed from: b, reason: collision with root package name */
    private int f38989b;

    /* renamed from: c, reason: collision with root package name */
    private final EventFrequencyStorage f38990c;

    /* renamed from: d, reason: collision with root package name */
    private final SystemTimeProvider f38991d = new SystemTimeProvider();

    public EventFrequencyOverWindowLimitDetector(long j4, int i, EventFrequencyStorage eventFrequencyStorage) {
        this.f38988a = j4;
        this.f38989b = i;
        this.f38990c = eventFrequencyStorage;
    }

    public final boolean detect(String str) {
        long jLongValue;
        long jUptimeMillis = this.f38991d.uptimeMillis();
        EventFrequencyStorage eventFrequencyStorage = this.f38990c;
        Long windowStart = eventFrequencyStorage.getWindowStart(str);
        if (windowStart == null) {
            eventFrequencyStorage.putWindowStart(str, jUptimeMillis);
            jLongValue = jUptimeMillis;
        } else {
            jLongValue = windowStart.longValue();
        }
        long j4 = jUptimeMillis - jLongValue;
        if (j4 < 0 || j4 > this.f38988a) {
            this.f38990c.putWindowStart(str, jUptimeMillis);
            this.f38990c.putWindowOccurrencesCount(str, 1);
            return false;
        }
        Integer windowOccurrencesCount = this.f38990c.getWindowOccurrencesCount(str);
        int iIntValue = (windowOccurrencesCount != null ? windowOccurrencesCount.intValue() : 0) + 1;
        this.f38990c.putWindowOccurrencesCount(str, iIntValue);
        return iIntValue > this.f38989b;
    }

    public final synchronized void updateParameters(long j4, int i) {
        this.f38988a = j4;
        this.f38989b = i;
    }
}
