package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.vt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2038vt {

    /* renamed from: a, reason: collision with root package name */
    public long f17359a;

    /* renamed from: b, reason: collision with root package name */
    public long f17360b;

    /* renamed from: c, reason: collision with root package name */
    public long f17361c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f17362d = new ThreadLocal();

    public C2038vt() {
        c(0L);
    }

    public final synchronized long a() {
        long j6 = this.f17359a;
        if (j6 == Long.MAX_VALUE || j6 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j6;
    }

    public final synchronized long b() {
        return this.f17360b;
    }

    public final synchronized void c(long j6) {
        this.f17359a = j6;
        this.f17360b = j6 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f17361c = -9223372036854775807L;
    }

    public final synchronized long d(long j6) {
        if (j6 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j7 = this.f17361c;
            if (j7 != -9223372036854775807L) {
                long jU = Vt.u(j7, 90000L, 1000000L, RoundingMode.DOWN);
                long j8 = (4294967296L + jU) / 8589934592L;
                long j9 = (((-1) + j8) * 8589934592L) + j6;
                long j10 = (j8 * 8589934592L) + j6;
                j6 = Math.abs(j9 - jU) < Math.abs(j10 - jU) ? j9 : j10;
            }
            return f(Vt.u(j6, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long e(long j6) {
        if (j6 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j7 = this.f17361c;
        if (j7 != -9223372036854775807L) {
            long jU = Vt.u(j7, 90000L, 1000000L, RoundingMode.DOWN);
            long j8 = jU / 8589934592L;
            Long.signum(j8);
            long j9 = (j8 * 8589934592L) + j6;
            j6 = j9 >= jU ? j9 : ((j8 + 1) * 8589934592L) + j6;
        }
        return f(Vt.u(j6, 1000000L, 90000L, RoundingMode.DOWN));
    }

    public final synchronized long f(long j6) {
        if (j6 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!g()) {
                long jLongValue = this.f17359a;
                if (jLongValue == 9223372036854775806L) {
                    Long l2 = (Long) this.f17362d.get();
                    if (l2 == null) {
                        throw null;
                    }
                    jLongValue = l2.longValue();
                }
                this.f17360b = jLongValue - j6;
                notifyAll();
            }
            this.f17361c = j6;
            return j6 + this.f17360b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean g() {
        return this.f17360b != -9223372036854775807L;
    }
}
