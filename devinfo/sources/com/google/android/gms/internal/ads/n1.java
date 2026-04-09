package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n1 implements m2 {

    /* renamed from: a, reason: collision with root package name */
    public final p1 f14097a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14098b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14099c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14100d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14101e;

    /* renamed from: f, reason: collision with root package name */
    public final long f14102f;

    public n1(p1 p1Var, long j, long j8, long j9, long j10, long j11) {
        this.f14097a = p1Var;
        this.f14098b = j;
        this.f14099c = j8;
        this.f14100d = j9;
        this.f14101e = j10;
        this.f14102f = j11;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final long b() {
        return this.f14098b;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final l2 g(long j) {
        n2 n2Var = new n2(j, o1.a(this.f14097a.g(j), 0L, this.f14099c, this.f14100d, this.f14101e, this.f14102f));
        return new l2(n2Var, n2Var);
    }
}
