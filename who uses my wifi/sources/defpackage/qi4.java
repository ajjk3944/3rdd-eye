package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qi4 implements jh4, ih4 {
    public final jh4 f;
    public final long g;
    public ih4 h;

    public qi4(jh4 jh4Var, long j) {
        this.f = jh4Var;
        this.g = j;
    }

    @Override // defpackage.jh4
    public final void a(ih4 ih4Var, long j) {
        this.h = ih4Var;
        this.f.a(this, j - this.g);
    }

    @Override // defpackage.mi4
    public final boolean b(nb4 nb4Var) {
        long j = nb4Var.a;
        mb4 mb4Var = new mb4();
        mb4Var.b = nb4Var.b;
        mb4Var.c = nb4Var.c;
        mb4Var.a = j - this.g;
        return this.f.b(new nb4(mb4Var));
    }

    @Override // defpackage.ih4
    public final /* bridge */ /* synthetic */ void c(mi4 mi4Var) {
        ih4 ih4Var = this.h;
        ih4Var.getClass();
        ih4Var.c(this);
    }

    @Override // defpackage.jh4
    public final long d(long j) {
        jh4 jh4Var = this.f;
        long j2 = this.g;
        return jh4Var.d(j - j2) + j2;
    }

    @Override // defpackage.jh4
    public final void e(long j) {
        this.f.e(j - this.g);
    }

    @Override // defpackage.jh4
    public final long f() {
        long jF = this.f.f();
        if (jF == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jF + this.g;
    }

    @Override // defpackage.ih4
    public final void g(jh4 jh4Var) {
        ih4 ih4Var = this.h;
        ih4Var.getClass();
        ih4Var.g(this);
    }

    @Override // defpackage.jh4
    public final long h(long j, lc4 lc4Var) {
        jh4 jh4Var = this.f;
        long j2 = this.g;
        return jh4Var.h(j - j2, lc4Var) + j2;
    }

    @Override // defpackage.mi4
    public final long i() {
        long jI = this.f.i();
        if (jI == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jI + this.g;
    }

    @Override // defpackage.mi4
    public final long j() {
        long j = this.f.j();
        if (j == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return j + this.g;
    }

    @Override // defpackage.mi4
    public final void k(long j) {
        this.f.k(j - this.g);
    }

    @Override // defpackage.jh4
    public final ri4 l() {
        return this.f.l();
    }

    @Override // defpackage.jh4
    public final long m(nj4[] nj4VarArr, boolean[] zArr, li4[] li4VarArr, boolean[] zArr2, long j) {
        li4[] li4VarArr2 = new li4[li4VarArr.length];
        int i = 0;
        while (true) {
            li4 li4Var = null;
            if (i >= li4VarArr.length) {
                break;
            }
            pi4 pi4Var = (pi4) li4VarArr[i];
            if (pi4Var != null) {
                li4Var = pi4Var.a;
            }
            li4VarArr2[i] = li4Var;
            i++;
        }
        long j2 = this.g;
        long jM = this.f.m(nj4VarArr, zArr, li4VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < li4VarArr.length; i2++) {
            li4 li4Var2 = li4VarArr2[i2];
            if (li4Var2 == null) {
                li4VarArr[i2] = null;
            } else {
                li4 li4Var3 = li4VarArr[i2];
                if (li4Var3 == null || ((pi4) li4Var3).a != li4Var2) {
                    li4VarArr[i2] = new pi4(li4Var2, j2);
                }
            }
        }
        return jM + j2;
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
