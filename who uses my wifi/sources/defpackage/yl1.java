package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yl1 implements lf1 {
    public final zl1 a = new zl1(0, 0, null, "audio/ac3");
    public final kz2 b = new kz2(2786);
    public boolean c;

    static {
        int i = zt0.o;
    }

    @Override // defpackage.lf1
    public final boolean b(mf1 mf1Var) throws EOFException, InterruptedIOException {
        df1 df1Var;
        int iX;
        kz2 kz2Var = new kz2(10);
        int i = 0;
        while (true) {
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
        int i2 = 0;
        int i3 = i;
        while (true) {
            df1Var.B(kz2Var.a, 0, 6, false);
            kz2Var.E(0);
            if (kz2Var.L() != 2935) {
                df1Var.k = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                df1Var.e(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = kz2Var.a;
                if (bArr.length < 6) {
                    iX = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    int i4 = (((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1;
                    iX = i4 + i4;
                } else {
                    byte b = bArr[4];
                    iX = yc0.x((b & 192) >> 6, b & 63);
                }
                if (iX == -1) {
                    break;
                }
                df1Var.e(iX - 6, false);
            }
        }
        return false;
    }

    @Override // defpackage.lf1
    public final int c(mf1 mf1Var, pf1 pf1Var) throws EOFException, InterruptedIOException {
        kz2 kz2Var = this.b;
        int iD = ((df1) mf1Var).d(kz2Var.a, 0, 2786);
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
