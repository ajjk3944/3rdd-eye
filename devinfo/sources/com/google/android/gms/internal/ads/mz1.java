package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mz1 implements iz1 {

    /* renamed from: a, reason: collision with root package name */
    public final iz1 f14076a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14077b;

    public mz1(iz1 iz1Var, long j) {
        this.f14076a = iz1Var;
        this.f14077b = j;
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final boolean a() {
        return this.f14076a.a();
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final int b(ce1 ce1Var, rq1 rq1Var, int i4) {
        int iB = this.f14076a.b(ce1Var, rq1Var, i4);
        if (iB != -4) {
            return iB;
        }
        rq1Var.g += this.f14077b;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final int f(long j) {
        return this.f14076a.f(j - this.f14077b);
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final void zzc() {
        this.f14076a.zzc();
    }
}
