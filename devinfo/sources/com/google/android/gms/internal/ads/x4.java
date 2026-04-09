package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x4 implements b5, m2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f18296a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18297b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18298c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18299d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18300e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18301f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18302h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18303i;
    public final long j;

    public x4(int i4, int i10, long j, long j8) {
        long jMax;
        this.f18296a = j;
        this.f18297b = j8;
        this.f18298c = i10 == -1 ? 1 : i10;
        this.f18300e = i4;
        if (j == -1) {
            this.f18299d = -1L;
            jMax = -9223372036854775807L;
        } else {
            long j9 = j - j8;
            this.f18299d = j9;
            jMax = (Math.max(0L, j9) * 8000000) / i4;
        }
        this.f18301f = jMax;
        this.g = j8;
        this.f18302h = i4;
        this.f18303i = i10;
        this.j = j == -1 ? -1L : j;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean a() {
        return this.f18299d != -1;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final long b() {
        return this.f18301f;
    }

    @Override // com.google.android.gms.internal.ads.b5
    public final long d() {
        return this.j;
    }

    @Override // com.google.android.gms.internal.ads.b5
    public final int e() {
        return this.f18302h;
    }

    @Override // com.google.android.gms.internal.ads.b5
    public final long f(long j) {
        return (Math.max(0L, j - this.f18297b) * 8000000) / this.f18300e;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final l2 g(long j) {
        long j8 = this.f18299d;
        long j9 = this.f18297b;
        if (j8 == -1) {
            n2 n2Var = new n2(0L, j9);
            return new l2(n2Var, n2Var);
        }
        int i4 = this.f18300e;
        long j10 = this.f18298c;
        long jMin = (((i4 * j) / 8000000) / j10) * j10;
        if (j8 != -1) {
            jMin = Math.min(jMin, j8 - j10);
        }
        long jMax = Math.max(jMin, 0L) + j9;
        long jMax2 = (Math.max(0L, jMax - j9) * 8000000) / i4;
        n2 n2Var2 = new n2(jMax2, jMax);
        if (j8 != -1 && jMax2 < j) {
            long j11 = jMax + j10;
            if (j11 < this.f18296a) {
                return new l2(n2Var2, new n2((Math.max(0L, j11 - j9) * 8000000) / i4, j11));
            }
        }
        return new l2(n2Var2, n2Var2);
    }
}
