package io.appmetrica.analytics.coreutils.internal.time;

/* loaded from: classes3.dex */
public final class TimePassedChecker {

    /* renamed from: a, reason: collision with root package name */
    private final TimeProvider f38999a;

    public TimePassedChecker(TimeProvider timeProvider) {
        this.f38999a = timeProvider;
    }

    public final boolean didTimePassMillis(long j4, long j10, String str) {
        long jCurrentTimeMillis = this.f38999a.currentTimeMillis();
        return jCurrentTimeMillis < j4 || jCurrentTimeMillis - j4 >= j10;
    }

    public final boolean didTimePassSeconds(long j4, long j10, String str) {
        long jCurrentTimeSeconds = this.f38999a.currentTimeSeconds();
        return jCurrentTimeSeconds < j4 || jCurrentTimeSeconds - j4 >= j10;
    }

    public TimePassedChecker() {
        this(new SystemTimeProvider());
    }
}
