package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bh4 implements th3 {
    public final th3 f;
    public final int g;
    public final xh4 h;
    public final byte[] i;
    public int j;

    public bh4(th3 th3Var, int i, xh4 xh4Var) {
        zt0.D(i > 0);
        this.f = th3Var;
        this.g = i;
        this.h = xh4Var;
        this.i = new byte[1];
        this.j = i;
    }

    @Override // defpackage.th3
    public final long a(ij3 ij3Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.th3
    public final void b(ws3 ws3Var) {
        ws3Var.getClass();
        this.f.b(ws3Var);
    }

    @Override // defpackage.ua4
    public final int d(byte[] bArr, int i, int i2) {
        int i3 = this.j;
        th3 th3Var = this.f;
        if (i3 == 0) {
            byte[] bArr2 = this.i;
            if (th3Var.d(bArr2, 0, 1) != -1) {
                int i4 = (bArr2[0] & 255) << 4;
                if (i4 != 0) {
                    byte[] bArr3 = new byte[i4];
                    int i5 = i4;
                    int i6 = 0;
                    while (i5 > 0) {
                        int iD = th3Var.d(bArr3, i6, i5);
                        if (iD != -1) {
                            i6 += iD;
                            i5 -= iD;
                        }
                    }
                    while (i4 > 0) {
                        int i7 = i4 - 1;
                        if (bArr3[i7] != 0) {
                            break;
                        }
                        i4 = i7;
                    }
                    if (i4 > 0) {
                        kz2 kz2Var = new kz2(i4, bArr3);
                        xh4 xh4Var = this.h;
                        long jMax = !xh4Var.l ? xh4Var.i : Math.max(xh4Var.m.y(true), xh4Var.i);
                        int iB = kz2Var.B();
                        jg1 jg1Var = xh4Var.k;
                        jg1Var.getClass();
                        jg1Var.a(kz2Var, iB, 0);
                        jg1Var.c(jMax, 1, iB, 0, null);
                        xh4Var.l = true;
                    }
                }
                i3 = this.g;
                this.j = i3;
            }
            return -1;
        }
        int iD2 = th3Var.d(bArr, i, Math.min(i3, i2));
        if (iD2 != -1) {
            this.j -= iD2;
        }
        return iD2;
    }

    @Override // defpackage.th3
    public final Map g() {
        return this.f.g();
    }

    @Override // defpackage.th3
    public final Uri h() {
        return this.f.h();
    }

    @Override // defpackage.th3
    public final void l() {
        throw new UnsupportedOperationException();
    }
}
