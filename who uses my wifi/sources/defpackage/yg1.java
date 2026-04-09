package defpackage;

import java.nio.ByteOrder;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yg1 implements af1 {
    public final rf1 f;
    public final int g;
    public final pf1 h = new pf1();

    public yg1(rf1 rf1Var, int i) {
        this.f = rf1Var;
        this.g = i;
    }

    public final long a(mf1 mf1Var) {
        pf1 pf1Var;
        rf1 rf1Var;
        int iY;
        while (true) {
            long jN = mf1Var.n();
            long jP = mf1Var.p() - 6;
            pf1Var = this.h;
            rf1Var = this.f;
            if (jN >= jP) {
                break;
            }
            long jN2 = mf1Var.n();
            kz2 kz2Var = new kz2(17);
            int i = 0;
            mf1Var.u(kz2Var.a, 0, 2);
            char cR = kz2Var.r(0, ByteOrder.BIG_ENDIAN);
            int i2 = this.g;
            if (cR != i2) {
                mf1Var.i();
                mf1Var.A((int) (jN2 - mf1Var.o()));
            } else {
                byte[] bArr = kz2Var.a;
                while (i < 15 && (iY = mf1Var.y(bArr, 2 + i, 15 - i)) != -1) {
                    i += iY;
                }
                kz2Var.C(i + 2);
                mf1Var.i();
                mf1Var.A((int) (jN2 - mf1Var.o()));
                if (i41.K(kz2Var, rf1Var, i2, pf1Var)) {
                    break;
                }
            }
            mf1Var.A(1);
        }
        if (mf1Var.n() < mf1Var.p() - 6) {
            return pf1Var.a;
        }
        mf1Var.A((int) (mf1Var.p() - mf1Var.n()));
        return rf1Var.j;
    }

    @Override // defpackage.af1
    public final ze1 f(mf1 mf1Var, long j) {
        long jO = mf1Var.o();
        long jA = a(mf1Var);
        long jN = mf1Var.n();
        mf1Var.A(Math.max(6, this.f.c));
        long jA2 = a(mf1Var);
        return (jA > j || jA2 <= j) ? jA2 <= j ? new ze1(-2, jA2, mf1Var.n()) : new ze1(-1, jA, jO) : new ze1(0, -9223372036854775807L, jN);
    }
}
