package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class c52 {

    /* renamed from: a, reason: collision with root package name */
    private long f25538a;

    /* renamed from: b, reason: collision with root package name */
    private long f25539b;

    /* renamed from: c, reason: collision with root package name */
    private long f25540c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Long> f25541d = new ThreadLocal<>();

    public c52(long j4) {
        c(j4);
    }

    public final synchronized long a(long j4) {
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f25539b == -9223372036854775807L) {
                long jLongValue = this.f25538a;
                if (jLongValue == 9223372036854775806L) {
                    Long l5 = this.f25541d.get();
                    l5.getClass();
                    jLongValue = l5.longValue();
                }
                this.f25539b = jLongValue - j4;
                notifyAll();
            }
            this.f25540c = j4;
            return j4 + this.f25539b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j4) {
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j10 = this.f25540c;
            if (j10 != -9223372036854775807L) {
                long j11 = (j10 * 90000) / 1000000;
                long j12 = (4294967296L + j11) / 8589934592L;
                long j13 = ((j12 - 1) * 8589934592L) + j4;
                j4 += j12 * 8589934592L;
                if (Math.abs(j13 - j11) < Math.abs(j4 - j11)) {
                    j4 = j13;
                }
            }
            return a((j4 * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c() {
        return this.f25539b;
    }

    public final synchronized void c(long j4) {
        this.f25538a = j4;
        this.f25539b = j4 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f25540c = -9223372036854775807L;
    }

    public final synchronized long b() {
        long jA;
        try {
            long j4 = this.f25540c;
            if (j4 != -9223372036854775807L) {
                jA = j4 + this.f25539b;
            } else {
                jA = a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return jA;
    }

    public final synchronized long a() {
        long j4;
        j4 = this.f25538a;
        if (j4 == Long.MAX_VALUE || j4 == 9223372036854775806L) {
            j4 = -9223372036854775807L;
        }
        return j4;
    }
}
