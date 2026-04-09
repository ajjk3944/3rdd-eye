package io.appmetrica.analytics.networktasks.internal;

import N7.C1154e9;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;

/* loaded from: classes3.dex */
public class ExponentialBackoffDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private final TimePassedChecker f42396a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeProvider f42397b;

    /* renamed from: c, reason: collision with root package name */
    private final HostRetryInfoProvider f42398c;

    /* renamed from: d, reason: collision with root package name */
    private long f42399d;

    /* renamed from: e, reason: collision with root package name */
    private int f42400e;

    /* renamed from: f, reason: collision with root package name */
    private final String f42401f;

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, String str) {
        this(hostRetryInfoProvider, new SystemTimeProvider(), new TimePassedChecker(), str);
    }

    public void reset() {
        this.f42400e = 1;
        this.f42399d = 0L;
        this.f42398c.saveNextSendAttemptNumber(1);
        this.f42398c.saveLastAttemptTimeSeconds(this.f42399d);
    }

    public void updateLastAttemptInfo() {
        long jCurrentTimeSeconds = this.f42397b.currentTimeSeconds();
        this.f42399d = jCurrentTimeSeconds;
        this.f42400e++;
        this.f42398c.saveLastAttemptTimeSeconds(jCurrentTimeSeconds);
        this.f42398c.saveNextSendAttemptNumber(this.f42400e);
    }

    public boolean wasLastAttemptLongAgoEnough(RetryPolicyConfig retryPolicyConfig) {
        if (retryPolicyConfig != null) {
            long j4 = this.f42399d;
            if (j4 != 0) {
                TimePassedChecker timePassedChecker = this.f42396a;
                int i = ((1 << (this.f42400e - 1)) - 1) * retryPolicyConfig.exponentialMultiplier;
                int i10 = retryPolicyConfig.maxIntervalSeconds;
                if (i > i10) {
                    i = i10;
                }
                return timePassedChecker.didTimePassSeconds(j4, i, this.f42401f);
            }
        }
        return true;
    }

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, SystemTimeProvider systemTimeProvider, TimePassedChecker timePassedChecker, String str) {
        this.f42398c = hostRetryInfoProvider;
        this.f42397b = systemTimeProvider;
        this.f42396a = timePassedChecker;
        this.f42399d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.f42400e = hostRetryInfoProvider.getNextSendAttemptNumber();
        this.f42401f = C1154e9.i("[ExponentialBackoffDataHolder-", str, "]");
    }
}
