package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bm1 implements lf1 {
    public final kz2 c;
    public final lg1 d;
    public nf1 e;
    public long f;
    public boolean h;
    public boolean i;
    public final cm1 a = new cm1(null, 0, "audio/mp4a-latm", true);
    public final kz2 b = new kz2(2048);
    public long g = -1;

    static {
        int i = i41.B;
    }

    public bm1() {
        kz2 kz2Var = new kz2(10);
        this.c = kz2Var;
        byte[] bArr = kz2Var.a;
        this.d = new lg1(bArr.length, bArr);
    }

    @Override // defpackage.lf1
    public final boolean b(mf1 mf1Var) throws EOFException, InterruptedIOException {
        kz2 kz2Var;
        df1 df1Var;
        int i = 0;
        while (true) {
            kz2Var = this.c;
            df1Var = (df1) mf1Var;
            df1Var.B(kz2Var.a, 0, 10, false);
            kz2Var.E(0);
            if (kz2Var.O() != 4801587) {
                break;
            }
            kz2Var.G(3);
            int iG = kz2Var.g();
            i += iG + 10;
            df1Var.e(iG, false);
        }
        df1Var.k = 0;
        df1Var.e(i, false);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            df1Var.B(kz2Var.a, 0, 2, false);
            kz2Var.E(0);
            if ((kz2Var.L() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                df1Var.B(kz2Var.a, 0, 4, false);
                lg1 lg1Var = this.d;
                lg1Var.l(14);
                int iR = lg1Var.r(13);
                if (iR <= 6) {
                    i4++;
                    df1Var.k = 0;
                    df1Var.e(i4, false);
                } else {
                    df1Var.e(iR - 6, false);
                    i3 += iR;
                }
            } else {
                i4++;
                df1Var.k = 0;
                df1Var.e(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // defpackage.lf1
    public final int c(mf1 mf1Var, pf1 pf1Var) throws EOFException, InterruptedIOException, lq1 {
        this.e.getClass();
        kz2 kz2Var = this.b;
        int iD = ((df1) mf1Var).d(kz2Var.a, 0, 2048);
        if (!this.i) {
            this.e.v(new qf1(-9223372036854775807L, 0L));
            this.i = true;
        }
        if (iD == -1) {
            return -1;
        }
        kz2Var.E(0);
        kz2Var.C(iD);
        boolean z = this.h;
        cm1 cm1Var = this.a;
        if (!z) {
            cm1Var.u = this.f;
            this.h = true;
        }
        cm1Var.b(kz2Var);
        return 0;
    }

    @Override // defpackage.lf1
    public final void e(long j, long j2) {
        this.h = false;
        this.a.a();
        this.f = j2;
    }

    @Override // defpackage.lf1
    public final void f(nf1 nf1Var) {
        this.e = nf1Var;
        this.a.e(nf1Var, new in1(Integer.MIN_VALUE, 0, 1));
        nf1Var.s();
    }
}
