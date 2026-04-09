package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zo0 {

    /* renamed from: a, reason: collision with root package name */
    public long f19132a;

    /* renamed from: b, reason: collision with root package name */
    public long f19133b;

    /* renamed from: c, reason: collision with root package name */
    public long f19134c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f19135d = new ThreadLocal();

    public zo0() {
        c(0L);
    }

    public final synchronized long a() {
        long j = this.f19132a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long b() {
        return this.f19133b;
    }

    public final synchronized void c(long j) {
        this.f19132a = j;
        this.f19133b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f19134c = -9223372036854775807L;
    }

    public final synchronized long d(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j8 = this.f19134c;
            if (j8 != -9223372036854775807L) {
                long jU = bq0.u(j8, 90000L, 1000000L, RoundingMode.DOWN);
                long j9 = (4294967296L + jU) / 8589934592L;
                long j10 = (((-1) + j9) * 8589934592L) + j;
                long j11 = (j9 * 8589934592L) + j;
                j = Math.abs(j10 - jU) < Math.abs(j11 - jU) ? j10 : j11;
            }
            return f(bq0.u(j, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long e(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j8 = this.f19134c;
        if (j8 != -9223372036854775807L) {
            long jU = bq0.u(j8, 90000L, 1000000L, RoundingMode.DOWN);
            long j9 = jU / 8589934592L;
            Long.signum(j9);
            long j10 = (j9 * 8589934592L) + j;
            j = j10 >= jU ? j10 : ((j9 + 1) * 8589934592L) + j;
        }
        return f(bq0.u(j, 1000000L, 90000L, RoundingMode.DOWN));
    }

    public final synchronized long f(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!g()) {
                long jLongValue = this.f19132a;
                if (jLongValue == 9223372036854775806L) {
                    Long l10 = (Long) this.f19135d.get();
                    if (l10 == null) {
                        throw null;
                    }
                    jLongValue = l10.longValue();
                }
                this.f19133b = jLongValue - j;
                notifyAll();
            }
            this.f19134c = j;
            return j + this.f19133b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean g() {
        return this.f19133b != -9223372036854775807L;
    }
}
