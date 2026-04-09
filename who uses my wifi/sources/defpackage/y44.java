package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class y44 extends a54 {
    public final byte[] h;

    public y44(byte[] bArr) {
        bArr.getClass();
        this.h = bArr;
    }

    @Override // defpackage.a54
    public byte b(int i) {
        return this.h[i];
    }

    @Override // defpackage.a54
    public byte c(int i) {
        return this.h[i];
    }

    @Override // defpackage.a54
    public int d() {
        return this.h.length;
    }

    @Override // defpackage.a54
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a54) && d() == ((a54) obj).d()) {
            if (d() == 0) {
                return true;
            }
            if (!(obj instanceof y44)) {
                return obj.equals(this);
            }
            y44 y44Var = (y44) obj;
            int i = this.f;
            int i2 = y44Var.f;
            if (i == 0 || i2 == 0 || i == i2) {
                return s(y44Var, 0, d());
            }
        }
        return false;
    }

    @Override // defpackage.a54
    public void f(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.h, i, bArr, i2, i3);
    }

    @Override // defpackage.a54
    public final int g() {
        return 0;
    }

    @Override // defpackage.a54
    public final boolean h() {
        return true;
    }

    @Override // defpackage.a54
    public final a54 i(int i, int i2) {
        int iA = a54.a(i, i2, d());
        if (iA == 0) {
            return a54.g;
        }
        return new x44(this.h, r() + i, iA);
    }

    @Override // defpackage.a54
    public final void j(g54 g54Var) {
        g54Var.w(this.h, r(), d());
    }

    @Override // defpackage.a54
    public final int k(int i, int i2, int i3) {
        int iR = r() + i2;
        Charset charset = y54.a;
        for (int i4 = iR; i4 < iR + i3; i4++) {
            i = (i * 31) + this.h[i4];
        }
        return i;
    }

    @Override // defpackage.a54
    public final m0 l() {
        return m0.f(this.h, r(), d());
    }

    public int r() {
        return 0;
    }

    public final boolean s(y44 y44Var, int i, int i2) {
        if (i2 > y44Var.d()) {
            int iD = d();
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 18 + String.valueOf(iD).length());
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(iD);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i + i2 > y44Var.d()) {
            int iD2 = y44Var.d();
            int length = String.valueOf(i).length();
            StringBuilder sb2 = new StringBuilder(length + 24 + String.valueOf(i2).length() + 2 + String.valueOf(iD2).length());
            ex0.o(sb2, "Ran off end of other: ", i, ", ", i2);
            throw new IllegalArgumentException(ex0.j(sb2, ", ", iD2));
        }
        byte[] bArr = y44Var.h;
        int iR = r() + i2;
        int iR2 = r();
        int iR3 = y44Var.r() + i;
        while (iR2 < iR) {
            if (this.h[iR2] != bArr[iR3]) {
                return false;
            }
            iR2++;
            iR3++;
        }
        return true;
    }
}
