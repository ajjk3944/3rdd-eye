package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dy1 implements iy1, hy1 {

    /* renamed from: a, reason: collision with root package name */
    public final jy1 f10606a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10607b;

    /* renamed from: c, reason: collision with root package name */
    public final i f10608c;

    /* renamed from: d, reason: collision with root package name */
    public qx1 f10609d;

    /* renamed from: e, reason: collision with root package name */
    public iy1 f10610e;

    /* renamed from: f, reason: collision with root package name */
    public hy1 f10611f;
    public long g = -9223372036854775807L;

    public dy1(jy1 jy1Var, i iVar, long j) {
        this.f10606a = jy1Var;
        this.f10608c = iVar;
        this.f10607b = j;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final long B1() {
        iy1 iy1Var = this.f10610e;
        String str = bq0.f9768a;
        return iy1Var.B1();
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final long C1() {
        iy1 iy1Var = this.f10610e;
        String str = bq0.f9768a;
        return iy1Var.C1();
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final boolean G1() {
        iy1 iy1Var = this.f10610e;
        return iy1Var != null && iy1Var.G1();
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final void a(long j) {
        iy1 iy1Var = this.f10610e;
        String str = bq0.f9768a;
        iy1Var.a(j);
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final long b(d[] dVarArr, boolean[] zArr, iz1[] iz1VarArr, boolean[] zArr2, long j) {
        long j8 = this.g;
        long j9 = (j8 == -9223372036854775807L || j != this.f10607b) ? j : j8;
        this.g = -9223372036854775807L;
        iy1 iy1Var = this.f10610e;
        String str = bq0.f9768a;
        return iy1Var.b(dVarArr, zArr, iz1VarArr, zArr2, j9);
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final long c(long j, nu1 nu1Var) {
        iy1 iy1Var = this.f10610e;
        String str = bq0.f9768a;
        return iy1Var.c(j, nu1Var);
    }

    @Override // com.google.android.gms.internal.ads.hy1
    public final /* bridge */ /* synthetic */ void d(jz1 jz1Var) {
        hy1 hy1Var = this.f10611f;
        String str = bq0.f9768a;
        hy1Var.d(this);
    }

    @Override // com.google.android.gms.internal.ads.hy1
    public final void e(iy1 iy1Var) {
        hy1 hy1Var = this.f10611f;
        String str = bq0.f9768a;
        hy1Var.e(this);
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final oz1 f() {
        iy1 iy1Var = this.f10610e;
        String str = bq0.f9768a;
        return iy1Var.f();
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final boolean g(rt1 rt1Var) {
        iy1 iy1Var = this.f10610e;
        return iy1Var != null && iy1Var.g(rt1Var);
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final void h() {
        iy1 iy1Var = this.f10610e;
        if (iy1Var != null) {
            iy1Var.h();
            return;
        }
        qx1 qx1Var = this.f10609d;
        if (qx1Var != null) {
            qx1Var.r();
        }
    }

    public final void i(jy1 jy1Var) {
        long j = this.g;
        if (j == -9223372036854775807L) {
            j = this.f10607b;
        }
        qx1 qx1Var = this.f10609d;
        qx1Var.getClass();
        iy1 iy1VarC = qx1Var.c(jy1Var, this.f10608c, j);
        this.f10610e = iy1VarC;
        if (this.f10611f != null) {
            iy1VarC.k(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final long j(long j) {
        iy1 iy1Var = this.f10610e;
        String str = bq0.f9768a;
        return iy1Var.j(j);
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final void k(hy1 hy1Var, long j) {
        this.f10611f = hy1Var;
        iy1 iy1Var = this.f10610e;
        if (iy1Var != null) {
            long j8 = this.g;
            if (j8 == -9223372036854775807L) {
                j8 = this.f10607b;
            }
            iy1Var.k(this, j8);
        }
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final void l(long j) {
        iy1 iy1Var = this.f10610e;
        String str = bq0.f9768a;
        iy1Var.l(j);
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final long z1() {
        iy1 iy1Var = this.f10610e;
        String str = bq0.f9768a;
        return iy1Var.z1();
    }
}
