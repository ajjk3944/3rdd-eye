package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class nz1 implements iy1, hy1 {

    /* renamed from: a, reason: collision with root package name */
    public final iy1 f14490a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14491b;

    /* renamed from: c, reason: collision with root package name */
    public hy1 f14492c;

    public nz1(iy1 iy1Var, long j) {
        this.f14490a = iy1Var;
        this.f14491b = j;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final long B1() {
        long jB1 = this.f14490a.B1();
        if (jB1 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jB1 + this.f14491b;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final long C1() {
        long jC1 = this.f14490a.C1();
        if (jC1 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jC1 + this.f14491b;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final boolean G1() {
        return this.f14490a.G1();
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final void a(long j) {
        this.f14490a.a(j - this.f14491b);
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final long b(d[] dVarArr, boolean[] zArr, iz1[] iz1VarArr, boolean[] zArr2, long j) {
        iz1[] iz1VarArr2 = new iz1[iz1VarArr.length];
        int i4 = 0;
        while (true) {
            iz1 iz1Var = null;
            if (i4 >= iz1VarArr.length) {
                break;
            }
            mz1 mz1Var = (mz1) iz1VarArr[i4];
            if (mz1Var != null) {
                iz1Var = mz1Var.f14076a;
            }
            iz1VarArr2[i4] = iz1Var;
            i4++;
        }
        long j8 = this.f14491b;
        long jB = this.f14490a.b(dVarArr, zArr, iz1VarArr2, zArr2, j - j8);
        for (int i10 = 0; i10 < iz1VarArr.length; i10++) {
            iz1 iz1Var2 = iz1VarArr2[i10];
            if (iz1Var2 == null) {
                iz1VarArr[i10] = null;
            } else {
                iz1 iz1Var3 = iz1VarArr[i10];
                if (iz1Var3 == null || ((mz1) iz1Var3).f14076a != iz1Var2) {
                    iz1VarArr[i10] = new mz1(iz1Var2, j8);
                }
            }
        }
        return jB + j8;
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final long c(long j, nu1 nu1Var) {
        iy1 iy1Var = this.f14490a;
        long j8 = this.f14491b;
        return iy1Var.c(j - j8, nu1Var) + j8;
    }

    @Override // com.google.android.gms.internal.ads.hy1
    public final /* bridge */ /* synthetic */ void d(jz1 jz1Var) {
        hy1 hy1Var = this.f14492c;
        hy1Var.getClass();
        hy1Var.d(this);
    }

    @Override // com.google.android.gms.internal.ads.hy1
    public final void e(iy1 iy1Var) {
        hy1 hy1Var = this.f14492c;
        hy1Var.getClass();
        hy1Var.e(this);
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final oz1 f() {
        return this.f14490a.f();
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final boolean g(rt1 rt1Var) {
        long j = rt1Var.f15762a;
        qt1 qt1Var = new qt1();
        qt1Var.f15444b = rt1Var.f15763b;
        qt1Var.f15445c = rt1Var.f15764c;
        qt1Var.f15443a = j - this.f14491b;
        return this.f14490a.g(new rt1(qt1Var));
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final void h() {
        this.f14490a.h();
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final long j(long j) {
        iy1 iy1Var = this.f14490a;
        long j8 = this.f14491b;
        return iy1Var.j(j - j8) + j8;
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final void k(hy1 hy1Var, long j) {
        this.f14492c = hy1Var;
        this.f14490a.k(this, j - this.f14491b);
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final void l(long j) {
        this.f14490a.l(j - this.f14491b);
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final long z1() {
        long jZ1 = this.f14490a.z1();
        if (jZ1 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZ1 + this.f14491b;
    }
}
