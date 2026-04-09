package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rg4 implements jh4, ih4 {
    public final dh4 f;
    public ih4 g;
    public qg4[] h = new qg4[0];
    public long i = 0;
    public long j;

    public rg4(dh4 dh4Var, long j) {
        this.f = dh4Var;
        this.j = j;
    }

    @Override // defpackage.jh4
    public final void a(ih4 ih4Var, long j) {
        this.g = ih4Var;
        this.f.a(this, j);
    }

    @Override // defpackage.mi4
    public final boolean b(nb4 nb4Var) {
        return this.f.b(nb4Var);
    }

    @Override // defpackage.ih4
    public final /* bridge */ /* synthetic */ void c(mi4 mi4Var) {
        ih4 ih4Var = this.g;
        ih4Var.getClass();
        ih4Var.c(this);
    }

    @Override // defpackage.jh4
    public final long d(long j) {
        this.i = -9223372036854775807L;
        for (qg4 qg4Var : this.h) {
            if (qg4Var != null) {
                qg4Var.b = false;
            }
        }
        long jD = this.f.d(j);
        long j2 = this.j;
        long jMax = Math.max(jD, 0L);
        return j2 != Long.MIN_VALUE ? Math.min(jMax, j2) : jMax;
    }

    @Override // defpackage.jh4
    public final void e(long j) {
        this.f.e(j);
    }

    @Override // defpackage.jh4
    public final long f() {
        if (n()) {
            long j = this.i;
            this.i = -9223372036854775807L;
            long jF = f();
            return jF != -9223372036854775807L ? jF : j;
        }
        long jF2 = this.f.f();
        if (jF2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.j;
        long jMax = Math.max(jF2, 0L);
        return j2 != Long.MIN_VALUE ? Math.min(jMax, j2) : jMax;
    }

    @Override // defpackage.ih4
    public final void g(jh4 jh4Var) {
        ih4 ih4Var = this.g;
        ih4Var.getClass();
        ih4Var.g(this);
    }

    @Override // defpackage.jh4
    public final long h(long j, lc4 lc4Var) {
        if (j == 0) {
            return 0L;
        }
        long j2 = lc4Var.a;
        String str = v23.a;
        long jMax = Math.max(0L, Math.min(j2, j));
        long j3 = lc4Var.b;
        long j4 = this.j;
        long jMax2 = Math.max(0L, Math.min(j3, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j));
        if (jMax != j2 || jMax2 != j3) {
            lc4Var = new lc4(jMax, jMax2);
        }
        return this.f.h(j, lc4Var);
    }

    @Override // defpackage.mi4
    public final long i() {
        long jI = this.f.i();
        if (jI != Long.MIN_VALUE) {
            long j = this.j;
            if (j == Long.MIN_VALUE || jI < j) {
                return jI;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.mi4
    public final long j() {
        long j = this.f.j();
        if (j != Long.MIN_VALUE) {
            long j2 = this.j;
            if (j2 == Long.MIN_VALUE || j < j2) {
                return j;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.mi4
    public final void k(long j) {
        this.f.k(j);
    }

    @Override // defpackage.jh4
    public final ri4 l() {
        return this.f.l();
    }

    @Override // defpackage.jh4
    public final long m(nj4[] nj4VarArr, boolean[] zArr, li4[] li4VarArr, boolean[] zArr2, long j) {
        int length = li4VarArr.length;
        this.h = new qg4[length];
        li4[] li4VarArr2 = new li4[length];
        for (int i = 0; i < li4VarArr.length; i++) {
            qg4[] qg4VarArr = this.h;
            qg4 qg4Var = (qg4) li4VarArr[i];
            qg4VarArr[i] = qg4Var;
            li4VarArr2[i] = qg4Var != null ? qg4Var.a : null;
        }
        long jM = this.f.m(nj4VarArr, zArr, li4VarArr2, zArr2, j);
        long j2 = this.j;
        long jMax = Math.max(jM, j);
        if (j2 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j2);
        }
        long j3 = -9223372036854775807L;
        if (n()) {
            if (jM < j) {
                j3 = jMax;
                break;
            }
            if (jM != 0) {
                for (nj4 nj4Var : nj4VarArr) {
                    if (nj4Var != null) {
                        ph4 ph4VarH = nj4Var.h();
                        if (!pp1.d(ph4VarH.m, ph4VarH.j)) {
                            j3 = jMax;
                            break;
                        }
                    }
                }
            }
        }
        this.i = j3;
        for (int i2 = 0; i2 < li4VarArr.length; i2++) {
            li4 li4Var = li4VarArr2[i2];
            if (li4Var == null) {
                this.h[i2] = null;
            } else {
                qg4[] qg4VarArr2 = this.h;
                qg4 qg4Var2 = qg4VarArr2[i2];
                if (qg4Var2 == null || qg4Var2.a != li4Var) {
                    qg4VarArr2[i2] = new qg4(this, li4Var);
                }
            }
            li4VarArr[i2] = this.h[i2];
        }
        return jMax;
    }

    public final boolean n() {
        return this.i != -9223372036854775807L;
    }

    @Override // defpackage.mi4
    public final boolean o() {
        return this.f.o();
    }

    @Override // defpackage.jh4
    public final void r() {
        this.f.r();
    }
}
