package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c5 implements b5 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f9974a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f9975b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9976c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9977d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9978e;

    public c5(long[] jArr, long[] jArr2, long j, long j8, int i4) {
        this.f9974a = jArr;
        this.f9975b = jArr2;
        this.f9976c = j;
        this.f9977d = j8;
        this.f9978e = i4;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final long b() {
        return this.f9976c;
    }

    @Override // com.google.android.gms.internal.ads.b5
    public final long d() {
        return this.f9977d;
    }

    @Override // com.google.android.gms.internal.ads.b5
    public final int e() {
        return this.f9978e;
    }

    @Override // com.google.android.gms.internal.ads.b5
    public final long f(long j) {
        return this.f9974a[bq0.q(this.f9975b, j, true)];
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final l2 g(long j) {
        long[] jArr = this.f9974a;
        int iQ = bq0.q(jArr, j, true);
        long j8 = jArr[iQ];
        long[] jArr2 = this.f9975b;
        n2 n2Var = new n2(j8, jArr2[iQ]);
        if (j8 >= j || iQ == jArr.length - 1) {
            return new l2(n2Var, n2Var);
        }
        int i4 = iQ + 1;
        return new l2(n2Var, new n2(jArr[i4], jArr2[i4]));
    }
}
