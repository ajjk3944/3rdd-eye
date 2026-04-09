package io.appmetrica.analytics.locationapi.internal;

import androidx.work.s;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g;

/* loaded from: classes3.dex */
public final class CacheArguments {

    /* renamed from: a, reason: collision with root package name */
    private final long f42286a;

    /* renamed from: b, reason: collision with root package name */
    private final long f42287b;

    public CacheArguments() {
        this(0L, 0L, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CacheArguments.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.CacheArguments");
        }
        CacheArguments cacheArguments = (CacheArguments) obj;
        return this.f42286a == cacheArguments.f42286a && this.f42287b == cacheArguments.f42287b;
    }

    public final long getOutdatedTimeInterval() {
        return this.f42287b;
    }

    public final long getRefreshPeriod() {
        return this.f42286a;
    }

    public int hashCode() {
        long j4 = this.f42286a;
        int i = ((int) (j4 ^ (j4 >>> 32))) * 31;
        long j10 = this.f42287b;
        return ((int) ((j10 >>> 32) ^ j10)) + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CacheArguments(refreshPeriod=");
        sb.append(this.f42286a);
        sb.append(", outdatedTimeInterval=");
        return s.f(sb, this.f42287b, ')');
    }

    public CacheArguments(long j4, long j10) {
        this.f42286a = j4;
        this.f42287b = j10;
    }

    public /* synthetic */ CacheArguments(long j4, long j10, int i, g gVar) {
        this((i & 1) != 0 ? TimeUnit.SECONDS.toMillis(10L) : j4, (i & 2) != 0 ? TimeUnit.MINUTES.toMillis(2L) : j10);
    }
}
