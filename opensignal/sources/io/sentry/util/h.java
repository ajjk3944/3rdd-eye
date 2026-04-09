package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class h implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicLong f12812g = new AtomicLong(System.nanoTime());

    /* renamed from: a, reason: collision with root package name */
    public long f12813a;

    /* renamed from: d, reason: collision with root package name */
    public final long f12814d;

    public h() {
        long jA = a();
        long jA2 = (a() << 1) | 1;
        this.f12814d = jA2;
        this.f12813a = jA2 + jA;
    }

    public static long a() {
        AtomicLong atomicLong;
        long j;
        long j7;
        do {
            atomicLong = f12812g;
            j = atomicLong.get();
            long j10 = (j >> 12) ^ j;
            long j11 = j10 ^ (j10 << 25);
            j7 = (j11 ^ (j11 >> 27)) * 2685821657736338717L;
        } while (!atomicLong.compareAndSet(j, j7));
        return j7;
    }

    public final void b(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            this.f12813a = (this.f12813a * 6364136223846793005L) + this.f12814d;
            bArr[i10] = (byte) ((((r1 >>> 22) ^ r1) >>> ((int) ((r1 >>> 61) + 22))) >>> 24);
        }
    }

    public final double c() {
        long j = this.f12813a * 6364136223846793005L;
        long j7 = this.f12814d;
        long j10 = j + j7;
        long j11 = (((j10 >>> 22) ^ j10) >>> ((int) ((j10 >>> 61) + 22))) & 4294967295L;
        this.f12813a = (j10 * 6364136223846793005L) + j7;
        return (((j11 >>> 6) << 27) + (((((r0 >>> 22) ^ r0) >>> ((int) ((r0 >>> 61) + 22))) & 4294967295L) >>> 5)) / 9.007199254740992E15d;
    }
}
