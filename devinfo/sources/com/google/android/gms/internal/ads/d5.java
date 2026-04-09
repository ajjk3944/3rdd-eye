package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d5 implements b5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f10325a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10326b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10327c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10328d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10329e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10330f;
    public final long[] g;

    public d5(long j, int i4, long j8, int i10, long j9, long[] jArr) {
        this.f10325a = j;
        this.f10326b = i4;
        this.f10327c = j8;
        this.f10328d = i10;
        this.f10329e = j9;
        this.g = jArr;
        this.f10330f = j9 != -1 ? j + j9 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean a() {
        return this.g != null;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final long b() {
        return this.f10327c;
    }

    @Override // com.google.android.gms.internal.ads.b5
    public final long d() {
        return this.f10330f;
    }

    @Override // com.google.android.gms.internal.ads.b5
    public final int e() {
        return this.f10328d;
    }

    @Override // com.google.android.gms.internal.ads.b5
    public final long f(long j) {
        if (!a()) {
            return 0L;
        }
        long j8 = j - this.f10325a;
        if (j8 <= this.f10326b) {
            return 0L;
        }
        long[] jArr = this.g;
        jArr.getClass();
        double d10 = (j8 * 256.0d) / this.f10329e;
        int iQ = bq0.q(jArr, (long) d10, true);
        long j9 = this.f10327c;
        long j10 = (iQ * j9) / 100;
        long j11 = jArr[iQ];
        int i4 = iQ + 1;
        long j12 = (j9 * i4) / 100;
        return Math.round((j11 == (iQ == 99 ? 256L : jArr[i4]) ? 0.0d : (d10 - j11) / (r0 - j11)) * (j12 - j10)) + j10;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final l2 g(long j) {
        double d10;
        double d11;
        boolean zA = a();
        int i4 = this.f10326b;
        long j8 = this.f10325a;
        if (!zA) {
            n2 n2Var = new n2(0L, j8 + i4);
            return new l2(n2Var, n2Var);
        }
        String str = bq0.f9768a;
        long j9 = this.f10327c;
        long jMax = Math.max(0L, Math.min(j, j9));
        double d12 = (jMax * 100.0d) / j9;
        double d13 = 0.0d;
        if (d12 <= 0.0d) {
            d10 = 256.0d;
        } else if (d12 >= 100.0d) {
            d10 = 256.0d;
            d13 = 256.0d;
        } else {
            int i10 = (int) d12;
            long[] jArr = this.g;
            jArr.getClass();
            double d14 = jArr[i10];
            if (i10 == 99) {
                d10 = 256.0d;
                d11 = 256.0d;
            } else {
                d10 = 256.0d;
                d11 = jArr[i10 + 1];
            }
            d13 = ((d11 - d14) * (d12 - i10)) + d14;
        }
        long j10 = this.f10329e;
        n2 n2Var2 = new n2(jMax, j8 + Math.max(i4, Math.min(Math.round((d13 / d10) * j10), j10 - 1)));
        return new l2(n2Var2, n2Var2);
    }
}
