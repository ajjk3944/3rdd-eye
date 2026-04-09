package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class am1 implements lf1 {
    public final zl1 a = new zl1(0, 1, null, "audio/ac4");
    public final kz2 b = new kz2(16384);
    public boolean c;

    static {
        int i = qb1.v;
    }

    @Override // defpackage.lf1
    public final boolean b(mf1 mf1Var) throws EOFException, InterruptedIOException {
        df1 df1Var;
        int i;
        kz2 kz2Var = new kz2(10);
        int i2 = 0;
        while (true) {
            df1Var = (df1) mf1Var;
            df1Var.B(kz2Var.a, 0, 10, false);
            kz2Var.E(0);
            if (kz2Var.O() != 4801587) {
                break;
            }
            kz2Var.G(3);
            int iG = kz2Var.g();
            i2 += iG + 10;
            df1Var.e(iG, false);
        }
        df1Var.k = 0;
        df1Var.e(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            df1Var.B(kz2Var.a, 0, 7, false);
            kz2Var.E(0);
            int iL = kz2Var.L();
            if (iL != 44096 && iL != 44097) {
                df1Var.k = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                df1Var.e(i4, false);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = kz2Var.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iL == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                df1Var.e(i - 7, false);
            }
        }
        return false;
    }

    @Override // defpackage.lf1
    public final int c(mf1 mf1Var, pf1 pf1Var) throws EOFException, InterruptedIOException {
        kz2 kz2Var = this.b;
        int iD = ((df1) mf1Var).d(kz2Var.a, 0, 16384);
        if (iD == -1) {
            return -1;
        }
        kz2Var.E(0);
        kz2Var.C(iD);
        boolean z = this.c;
        zl1 zl1Var = this.a;
        if (!z) {
            zl1Var.o = 0L;
            this.c = true;
        }
        zl1Var.b(kz2Var);
        return 0;
    }

    @Override // defpackage.lf1
    public final void e(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    @Override // defpackage.lf1
    public final void f(nf1 nf1Var) {
        this.a.e(nf1Var, new in1(Integer.MIN_VALUE, 0, 1));
        nf1Var.s();
        nf1Var.v(new qf1(-9223372036854775807L, 0L));
    }
}
