package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class eg1 implements lf1 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public nf1 f;
    public jg1 g;

    public eg1(String str, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.lf1
    public final boolean b(mf1 mf1Var) {
        int i = this.b;
        int i2 = this.a;
        zt0.b0((i2 == -1 || i == -1) ? false : true);
        kz2 kz2Var = new kz2(i);
        ((df1) mf1Var).B(kz2Var.a, 0, i, false);
        return kz2Var.L() == i2;
    }

    @Override // defpackage.lf1
    public final int c(mf1 mf1Var, pf1 pf1Var) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        jg1 jg1Var = this.g;
        jg1Var.getClass();
        int iB = jg1Var.b(mf1Var, 1024, true);
        if (iB != -1) {
            this.d += iB;
            return 0;
        }
        this.e = 2;
        this.g.c(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // defpackage.lf1
    public final void e(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // defpackage.lf1
    public final void f(nf1 nf1Var) {
        this.f = nf1Var;
        jg1 jg1VarZ = nf1Var.z(1024, 4);
        this.g = jg1VarZ;
        gg4 gg4Var = new gg4();
        String str = this.c;
        gg4Var.d(str);
        gg4Var.e(str);
        jg1VarZ.d(new ph4(gg4Var));
        this.f.s();
        this.f.v(new fg1());
        this.e = 1;
    }
}
