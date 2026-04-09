package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class e54 extends g54 {
    public final byte[] v;
    public final int w;
    public int x;

    public e54(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.v = bArr;
            this.x = 0;
            this.w = i;
        } else {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("Array range is invalid. Buffer.length=" + length + ", offset=0, length=" + i);
        }
    }

    @Override // defpackage.g54
    public final void I(int i, int i2) throws h40 {
        X((i << 3) | i2);
    }

    @Override // defpackage.g54
    public final void J(int i, int i2) throws h40 {
        X(i << 3);
        W(i2);
    }

    @Override // defpackage.g54
    public final void K(int i, int i2) throws h40 {
        X(i << 3);
        X(i2);
    }

    @Override // defpackage.g54
    public final void L(int i, int i2) throws h40 {
        X((i << 3) | 5);
        Y(i2);
    }

    @Override // defpackage.g54
    public final void M(int i, long j) throws h40 {
        X(i << 3);
        Z(j);
    }

    @Override // defpackage.g54
    public final int N() {
        return this.w - this.x;
    }

    @Override // defpackage.g54
    public final void O(int i, long j) throws h40 {
        X((i << 3) | 1);
        a0(j);
    }

    @Override // defpackage.g54
    public final void P(int i, boolean z) throws h40 {
        X(i << 3);
        V(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.g54
    public final void Q(String str, int i) throws h40 {
        X((i << 3) | 2);
        b0(str);
    }

    @Override // defpackage.g54
    public final void R(int i, a54 a54Var) throws h40 {
        X((i << 3) | 2);
        S(a54Var);
    }

    @Override // defpackage.g54
    public final void S(a54 a54Var) throws h40 {
        X(a54Var.d());
        a54Var.j(this);
    }

    @Override // defpackage.g54
    public final void T(int i, byte[] bArr) throws h40 {
        X(i);
        c0(bArr, 0, i);
    }

    @Override // defpackage.g54
    public final void U(s44 s44Var) throws h40 {
        X(((p54) s44Var).d(null));
        ((p54) s44Var).v(this);
    }

    @Override // defpackage.g54
    public final void V(byte b) throws h40 {
        int i;
        int i2 = this.x;
        try {
            i = i2 + 1;
        } catch (IndexOutOfBoundsException e) {
            e = e;
        }
        try {
            this.v[i2] = b;
            this.x = i;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            i2 = i;
            throw new h40(i2, this.w, 1, e);
        }
    }

    @Override // defpackage.g54
    public final void W(int i) throws h40 {
        if (i >= 0) {
            X(i);
        } else {
            Z(i);
        }
    }

    @Override // defpackage.g54
    public final void X(int i) throws h40 {
        int i2;
        int i3 = this.x;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.v;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.x = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new h40(i2, this.w, 1, e);
                }
            }
            throw new h40(i2, this.w, 1, e);
        }
    }

    @Override // defpackage.g54
    public final void Y(int i) throws h40 {
        int i2 = this.x;
        try {
            byte[] bArr = this.v;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.x = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new h40(i2, this.w, 4, e);
        }
    }

    @Override // defpackage.g54
    public final void Z(long j) throws h40 {
        int i;
        int i2 = this.x;
        int i3 = this.w;
        byte[] bArr = this.v;
        if (!g54.u || i3 - i2 < 10) {
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j2) | 128);
                    j2 >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new h40(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new h40(i, i3, 1, e);
            }
        } else {
            long j3 = j;
            while ((j3 & (-128)) != 0) {
                g74.m(bArr, i2, (byte) (((int) j3) | 128));
                j3 >>>= 7;
                i2++;
            }
            i = i2 + 1;
            g74.m(bArr, i2, (byte) j3);
        }
        this.x = i;
    }

    @Override // defpackage.g54
    public final void a0(long j) throws h40 {
        int i = this.x;
        try {
            byte[] bArr = this.v;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.x = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new h40(i, this.w, 8, e);
        }
    }

    @Override // defpackage.g54
    public final void b0(String str) throws h40 {
        int i = this.x;
        try {
            int iD = g54.D(str.length() * 3);
            int iD2 = g54.D(str.length());
            int i2 = this.w;
            byte[] bArr = this.v;
            if (iD2 != iD) {
                X(i74.b(str));
                int i3 = this.x;
                this.x = i74.c(str, bArr, i3, i2 - i3);
            } else {
                int i4 = i + iD2;
                this.x = i4;
                int iC = i74.c(str, bArr, i4, i2 - i4);
                this.x = i;
                X((iC - i) - iD2);
                this.x = iC;
            }
        } catch (h74 e) {
            this.x = i;
            H(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new h40(e2);
        }
    }

    public final void c0(byte[] bArr, int i, int i2) throws h40 {
        try {
            System.arraycopy(bArr, i, this.v, this.x, i2);
            this.x += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new h40(this.x, this.w, i2, e);
        }
    }

    @Override // defpackage.yb
    public final void w(byte[] bArr, int i, int i2) throws h40 {
        c0(bArr, i, i2);
    }
}
