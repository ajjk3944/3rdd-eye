package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xj1 implements lf1 {
    public nf1 a;
    public ck1 b;
    public boolean c;

    static {
        int i = um.x;
    }

    public final boolean a(mf1 mf1Var) {
        zj1 zj1Var = new zj1();
        if (zj1Var.b(mf1Var, true) && (zj1Var.a & 2) == 2) {
            int iMin = Math.min(zj1Var.e, 8);
            kz2 kz2Var = new kz2(iMin);
            mf1Var.u(kz2Var.a, 0, iMin);
            kz2Var.E(0);
            if (kz2Var.B() >= 5 && kz2Var.K() == 127 && kz2Var.P() == 1179402563) {
                this.b = new wj1();
                return true;
            }
            kz2Var.E(0);
            try {
                if (pu1.F(1, kz2Var, true)) {
                    this.b = new dk1();
                    return true;
                }
            } catch (lq1 unused) {
            }
            kz2Var.E(0);
            if (bk1.e(kz2Var, bk1.o)) {
                this.b = new bk1();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lf1
    public final boolean b(mf1 mf1Var) {
        try {
            return a(mf1Var);
        } catch (lq1 unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0169 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016a  */
    @Override // defpackage.lf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(defpackage.mf1 r21, defpackage.pf1 r22) throws defpackage.lq1, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xj1.c(mf1, pf1):int");
    }

    @Override // defpackage.lf1
    public final void e(long j, long j2) {
        ck1 ck1Var = this.b;
        if (ck1Var != null) {
            yj1 yj1Var = ck1Var.a;
            zj1 zj1Var = yj1Var.a;
            zj1Var.a = 0;
            zj1Var.b = 0L;
            zj1Var.c = 0;
            zj1Var.d = 0;
            zj1Var.e = 0;
            yj1Var.b.y(0);
            yj1Var.c = -1;
            yj1Var.e = false;
            if (j == 0) {
                ck1Var.a(!ck1Var.l);
                return;
            }
            if (ck1Var.h != 0) {
                long j3 = (ck1Var.i * j2) / 1000000;
                ck1Var.e = j3;
                ak1 ak1Var = ck1Var.d;
                String str = v23.a;
                ak1Var.d(j3);
                ck1Var.h = 2;
            }
        }
    }

    @Override // defpackage.lf1
    public final void f(nf1 nf1Var) {
        this.a = nf1Var;
    }
}
