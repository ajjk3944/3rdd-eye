package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dh4 implements jh4, ih4 {
    public final kh4 f;
    public final long g;
    public final rj4 h;
    public pg4 i;
    public jh4 j;
    public ih4 k;
    public long l = -9223372036854775807L;

    public dh4(kh4 kh4Var, rj4 rj4Var, long j) {
        this.f = kh4Var;
        this.h = rj4Var;
        this.g = j;
    }

    @Override // defpackage.jh4
    public final void a(ih4 ih4Var, long j) {
        this.k = ih4Var;
        jh4 jh4Var = this.j;
        if (jh4Var != null) {
            long j2 = this.l;
            if (j2 == -9223372036854775807L) {
                j2 = this.g;
            }
            jh4Var.a(this, j2);
        }
    }

    @Override // defpackage.mi4
    public final boolean b(nb4 nb4Var) {
        jh4 jh4Var = this.j;
        return jh4Var != null && jh4Var.b(nb4Var);
    }

    @Override // defpackage.ih4
    public final /* bridge */ /* synthetic */ void c(mi4 mi4Var) {
        ih4 ih4Var = this.k;
        String str = v23.a;
        ih4Var.c(this);
    }

    @Override // defpackage.jh4
    public final long d(long j) {
        jh4 jh4Var = this.j;
        String str = v23.a;
        return jh4Var.d(j);
    }

    @Override // defpackage.jh4
    public final void e(long j) {
        jh4 jh4Var = this.j;
        String str = v23.a;
        jh4Var.e(j);
    }

    @Override // defpackage.jh4
    public final long f() {
        jh4 jh4Var = this.j;
        String str = v23.a;
        return jh4Var.f();
    }

    @Override // defpackage.ih4
    public final void g(jh4 jh4Var) {
        ih4 ih4Var = this.k;
        String str = v23.a;
        ih4Var.g(this);
    }

    @Override // defpackage.jh4
    public final long h(long j, lc4 lc4Var) {
        jh4 jh4Var = this.j;
        String str = v23.a;
        return jh4Var.h(j, lc4Var);
    }

    @Override // defpackage.mi4
    public final long i() {
        jh4 jh4Var = this.j;
        String str = v23.a;
        return jh4Var.i();
    }

    @Override // defpackage.mi4
    public final long j() {
        jh4 jh4Var = this.j;
        String str = v23.a;
        return jh4Var.j();
    }

    @Override // defpackage.mi4
    public final void k(long j) {
        jh4 jh4Var = this.j;
        String str = v23.a;
        jh4Var.k(j);
    }

    @Override // defpackage.jh4
    public final ri4 l() {
        jh4 jh4Var = this.j;
        String str = v23.a;
        return jh4Var.l();
    }

    @Override // defpackage.jh4
    public final long m(nj4[] nj4VarArr, boolean[] zArr, li4[] li4VarArr, boolean[] zArr2, long j) {
        long j2 = this.l;
        long j3 = (j2 == -9223372036854775807L || j != this.g) ? j : j2;
        this.l = -9223372036854775807L;
        jh4 jh4Var = this.j;
        String str = v23.a;
        return jh4Var.m(nj4VarArr, zArr, li4VarArr, zArr2, j3);
    }

    public final void n(kh4 kh4Var) {
        long j = this.l;
        if (j == -9223372036854775807L) {
            j = this.g;
        }
        pg4 pg4Var = this.i;
        pg4Var.getClass();
        jh4 jh4VarC = pg4Var.c(kh4Var, this.h, j);
        this.j = jh4VarC;
        if (this.k != null) {
            jh4VarC.a(this, j);
        }
    }

    @Override // defpackage.mi4
    public final boolean o() {
        jh4 jh4Var = this.j;
        return jh4Var != null && jh4Var.o();
    }

    @Override // defpackage.jh4
    public final void r() {
        jh4 jh4Var = this.j;
        if (jh4Var != null) {
            jh4Var.r();
            return;
        }
        pg4 pg4Var = this.i;
        if (pg4Var != null) {
            pg4Var.r();
        }
    }
}
