package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tw1;

/* loaded from: classes3.dex */
public class qr implements tw1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f32320a;

    /* renamed from: b, reason: collision with root package name */
    private final long f32321b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32322c;

    /* renamed from: d, reason: collision with root package name */
    private final long f32323d;

    /* renamed from: e, reason: collision with root package name */
    private final int f32324e;

    /* renamed from: f, reason: collision with root package name */
    private final long f32325f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f32326g;

    public qr(int i, int i10, long j4, long j10, boolean z10) {
        this.f32320a = j4;
        this.f32321b = j10;
        this.f32322c = i10 == -1 ? 1 : i10;
        this.f32324e = i;
        this.f32326g = z10;
        if (j4 == -1) {
            this.f32323d = -1L;
            this.f32325f = -9223372036854775807L;
        } else {
            this.f32323d = j4 - j10;
            this.f32325f = a(i, j4, j10);
        }
    }

    public long a(long j4) {
        return c(j4);
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final tw1.a b(long j4) {
        long j10 = this.f32323d;
        if (j10 == -1 && !this.f32326g) {
            vw1 vw1Var = new vw1(0L, this.f32321b);
            return new tw1.a(vw1Var, vw1Var);
        }
        long j11 = this.f32322c;
        long jMin = (((this.f32324e * j4) / 8000000) / j11) * j11;
        if (j10 != -1) {
            jMin = Math.min(jMin, j10 - j11);
        }
        long jMax = Math.max(jMin, 0L);
        long j12 = this.f32321b;
        long j13 = jMax + j12;
        long jA = a(this.f32324e, j13, j12);
        vw1 vw1Var2 = new vw1(jA, j13);
        if (this.f32323d != -1 && jA < j4) {
            long j14 = j13 + this.f32322c;
            if (j14 < this.f32320a) {
                return new tw1.a(vw1Var2, new vw1(a(this.f32324e, j14, this.f32321b), j14));
            }
        }
        return new tw1.a(vw1Var2, vw1Var2);
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final long c() {
        return this.f32325f;
    }

    private static long a(int i, long j4, long j10) {
        return (Math.max(0L, j4 - j10) * 8000000) / i;
    }

    public final long c(long j4) {
        return a(this.f32324e, j4, this.f32321b);
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final boolean b() {
        return this.f32323d != -1 || this.f32326g;
    }
}
