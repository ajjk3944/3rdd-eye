package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class og1 implements lf1 {
    public final us0 d;
    public int e;
    public pg1 g;
    public long j;
    public sg1 k;
    public int o;
    public boolean p;
    public final boolean c = true;
    public final kz2 a = new kz2(12);
    public final tg0 b = new tg0();
    public nf1 f = new us0();
    public sg1[] i = new sg1[0];
    public long m = -1;
    public long n = -1;
    public int l = -1;
    public long h = -9223372036854775807L;

    public og1(us0 us0Var) {
        this.d = us0Var;
    }

    @Override // defpackage.lf1
    public final boolean b(mf1 mf1Var) {
        kz2 kz2Var = this.a;
        mf1Var.u(kz2Var.a, 0, 12);
        kz2Var.E(0);
        if (kz2Var.c() != 1179011410) {
            return false;
        }
        kz2Var.G(4);
        return kz2Var.c() == 541677121;
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x03bd  */
    @Override // defpackage.lf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(defpackage.mf1 r31, defpackage.pf1 r32) throws java.io.EOFException, java.io.InterruptedIOException, defpackage.lq1 {
        /*
            Method dump skipped, instructions count: 1157
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og1.c(mf1, pf1):int");
    }

    @Override // defpackage.lf1
    public final void e(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (sg1 sg1Var : this.i) {
            if (sg1Var.k == 0) {
                sg1Var.i = 0;
            } else {
                sg1Var.i = sg1Var.n[v23.p(sg1Var.m, j, true)];
            }
        }
        if (j == 0) {
            this.e = this.i.length != 0 ? 3 : 0;
        } else {
            this.e = 6;
        }
    }

    @Override // defpackage.lf1
    public final void f(nf1 nf1Var) {
        this.e = 0;
        if (this.c) {
            nf1Var = new rl(nf1Var, this.d);
        }
        this.f = nf1Var;
        this.j = -1L;
    }
}
