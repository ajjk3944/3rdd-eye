package defpackage;

import java.io.EOFException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yj1 {
    public final zj1 a = new zj1();
    public final kz2 b = new kz2(0, new byte[65025]);
    public int c = -1;
    public int d;
    public boolean e;

    public final boolean a(mf1 mf1Var) {
        int i;
        boolean z = this.e;
        kz2 kz2Var = this.b;
        if (z) {
            this.e = false;
            kz2Var.y(0);
        }
        while (true) {
            if (this.e) {
                return true;
            }
            int i2 = this.c;
            zj1 zj1Var = this.a;
            if (i2 < 0) {
                if (!zj1Var.a(mf1Var, -1L) || !zj1Var.b(mf1Var, true)) {
                    break;
                }
                int iB = zj1Var.d;
                if ((zj1Var.a & 1) == 1 && kz2Var.c == 0) {
                    iB += b(0);
                    i = this.d;
                } else {
                    i = 0;
                }
                try {
                    mf1Var.t(iB);
                    this.c = i;
                    i2 = i;
                } catch (EOFException unused) {
                }
            }
            int iB2 = b(i2);
            int i3 = this.c + this.d;
            if (iB2 > 0) {
                kz2Var.A(kz2Var.c + iB2);
                try {
                    mf1Var.x(kz2Var.a, kz2Var.c, iB2);
                    kz2Var.C(kz2Var.c + iB2);
                    this.e = zj1Var.f[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == zj1Var.c) {
                i3 = -1;
            }
            this.c = i3;
        }
        return false;
    }

    public final int b(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            zj1 zj1Var = this.a;
            if (i5 >= zj1Var.c) {
                break;
            }
            this.d = i4 + 1;
            i2 = zj1Var.f[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
