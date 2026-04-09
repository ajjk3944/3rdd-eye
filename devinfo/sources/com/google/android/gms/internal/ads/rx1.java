package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rx1 implements iz1 {

    /* renamed from: a, reason: collision with root package name */
    public final iz1 f15782a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sx1 f15784c;

    public rx1(sx1 sx1Var, iz1 iz1Var) {
        this.f15784c = sx1Var;
        this.f15782a = iz1Var;
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final boolean a() {
        return !this.f15784c.i() && this.f15782a.a();
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final int b(ce1 ce1Var, rq1 rq1Var, int i4) {
        sx1 sx1Var = this.f15784c;
        if (sx1Var.i()) {
            return -3;
        }
        if (this.f15783b) {
            rq1Var.f14029b = 4;
            return -4;
        }
        long jC1 = sx1Var.C1();
        int iB = this.f15782a.b(ce1Var, rq1Var, i4);
        if (iB != -5) {
            long j = sx1Var.f16587e;
            if (j == Long.MIN_VALUE || ((iB != -4 || rq1Var.g < j) && !(iB == -3 && jC1 == Long.MIN_VALUE && !rq1Var.f15736f))) {
                return iB;
            }
            rq1Var.i();
            rq1Var.f14029b = 4;
            this.f15783b = true;
            return -4;
        }
        mx1 mx1Var = (mx1) ce1Var.f10095c;
        mx1Var.getClass();
        int i10 = mx1Var.I;
        int i11 = mx1Var.H;
        if (i11 == 0) {
            if (i10 == 0) {
                return -5;
            }
            i11 = 0;
        }
        if (sx1Var.f16587e != Long.MIN_VALUE) {
            i10 = 0;
        }
        lw1 lw1Var = new lw1(mx1Var);
        lw1Var.G = i11;
        lw1Var.H = i10;
        ce1Var.f10095c = new mx1(lw1Var);
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final int f(long j) {
        if (this.f15784c.i()) {
            return -3;
        }
        return this.f15782a.f(j);
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final void zzc() {
        this.f15782a.zzc();
    }
}
