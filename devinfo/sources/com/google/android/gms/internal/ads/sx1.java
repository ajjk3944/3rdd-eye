package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sx1 implements iy1, hy1 {

    /* renamed from: a, reason: collision with root package name */
    public final dy1 f16583a;

    /* renamed from: b, reason: collision with root package name */
    public hy1 f16584b;

    /* renamed from: c, reason: collision with root package name */
    public rx1[] f16585c = new rx1[0];

    /* renamed from: d, reason: collision with root package name */
    public long f16586d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f16587e;

    public sx1(dy1 dy1Var, long j) {
        this.f16583a = dy1Var;
        this.f16587e = j;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final long B1() {
        long jB1 = this.f16583a.B1();
        if (jB1 != Long.MIN_VALUE) {
            long j = this.f16587e;
            if (j == Long.MIN_VALUE || jB1 < j) {
                return jB1;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final long C1() {
        long jC1 = this.f16583a.C1();
        if (jC1 != Long.MIN_VALUE) {
            long j = this.f16587e;
            if (j == Long.MIN_VALUE || jC1 < j) {
                return jC1;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final boolean G1() {
        return this.f16583a.G1();
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final void a(long j) {
        this.f16583a.a(j);
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final long b(d[] dVarArr, boolean[] zArr, iz1[] iz1VarArr, boolean[] zArr2, long j) {
        int length = iz1VarArr.length;
        this.f16585c = new rx1[length];
        iz1[] iz1VarArr2 = new iz1[length];
        for (int i4 = 0; i4 < iz1VarArr.length; i4++) {
            rx1[] rx1VarArr = this.f16585c;
            rx1 rx1Var = (rx1) iz1VarArr[i4];
            rx1VarArr[i4] = rx1Var;
            iz1VarArr2[i4] = rx1Var != null ? rx1Var.f15782a : null;
        }
        long jB = this.f16583a.b(dVarArr, zArr, iz1VarArr2, zArr2, j);
        long j8 = this.f16587e;
        long jMax = Math.max(jB, j);
        if (j8 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j8);
        }
        long j9 = -9223372036854775807L;
        if (i()) {
            if (jB < j) {
                j9 = jMax;
                break;
            }
            if (jB != 0) {
                for (d dVar : dVarArr) {
                    if (dVar != null) {
                        mx1 mx1VarZzc = dVar.zzc();
                        if (!ia.d(mx1VarZzc.f14052m, mx1VarZzc.j)) {
                            j9 = jMax;
                            break;
                        }
                    }
                }
            }
        }
        this.f16586d = j9;
        for (int i10 = 0; i10 < iz1VarArr.length; i10++) {
            iz1 iz1Var = iz1VarArr2[i10];
            if (iz1Var == null) {
                this.f16585c[i10] = null;
            } else {
                rx1[] rx1VarArr2 = this.f16585c;
                rx1 rx1Var2 = rx1VarArr2[i10];
                if (rx1Var2 == null || rx1Var2.f15782a != iz1Var) {
                    rx1VarArr2[i10] = new rx1(this, iz1Var);
                }
            }
            iz1VarArr[i10] = this.f16585c[i10];
        }
        return jMax;
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final long c(long j, nu1 nu1Var) {
        if (j == 0) {
            return 0L;
        }
        long j8 = nu1Var.f14444a;
        String str = bq0.f9768a;
        long jMax = Math.max(0L, Math.min(j8, j));
        long j9 = nu1Var.f14445b;
        long j10 = this.f16587e;
        long jMax2 = Math.max(0L, Math.min(j9, j10 == Long.MIN_VALUE ? Long.MAX_VALUE : j10 - j));
        if (jMax != j8 || jMax2 != j9) {
            nu1Var = new nu1(jMax, jMax2);
        }
        return this.f16583a.c(j, nu1Var);
    }

    @Override // com.google.android.gms.internal.ads.hy1
    public final /* bridge */ /* synthetic */ void d(jz1 jz1Var) {
        hy1 hy1Var = this.f16584b;
        hy1Var.getClass();
        hy1Var.d(this);
    }

    @Override // com.google.android.gms.internal.ads.hy1
    public final void e(iy1 iy1Var) {
        hy1 hy1Var = this.f16584b;
        hy1Var.getClass();
        hy1Var.e(this);
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final oz1 f() {
        return this.f16583a.f();
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final boolean g(rt1 rt1Var) {
        return this.f16583a.g(rt1Var);
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final void h() {
        this.f16583a.h();
    }

    public final boolean i() {
        return this.f16586d != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final long j(long j) {
        this.f16586d = -9223372036854775807L;
        for (rx1 rx1Var : this.f16585c) {
            if (rx1Var != null) {
                rx1Var.f15783b = false;
            }
        }
        long j8 = this.f16583a.j(j);
        long j9 = this.f16587e;
        long jMax = Math.max(j8, 0L);
        return j9 != Long.MIN_VALUE ? Math.min(jMax, j9) : jMax;
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final void k(hy1 hy1Var, long j) {
        this.f16584b = hy1Var;
        this.f16583a.k(this, j);
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final void l(long j) {
        this.f16583a.l(j);
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final long z1() {
        if (i()) {
            long j = this.f16586d;
            this.f16586d = -9223372036854775807L;
            long jZ1 = z1();
            return jZ1 != -9223372036854775807L ? jZ1 : j;
        }
        long jZ12 = this.f16583a.z1();
        if (jZ12 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j8 = this.f16587e;
        long jMax = Math.max(jZ12, 0L);
        return j8 != Long.MIN_VALUE ? Math.min(jMax, j8) : jMax;
    }
}
