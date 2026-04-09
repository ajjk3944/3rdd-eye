package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class f54 extends g54 {
    public final byte[] v;
    public final int w;
    public int x;
    public final OutputStream y;

    public f54(OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.v = new byte[iMax];
        this.w = iMax;
        this.y = outputStream;
    }

    @Override // defpackage.g54
    public final void I(int i, int i2) {
        X((i << 3) | i2);
    }

    @Override // defpackage.g54
    public final void J(int i, int i2) {
        c0(20);
        e0(i << 3);
        if (i2 >= 0) {
            e0(i2);
        } else {
            f0(i2);
        }
    }

    @Override // defpackage.g54
    public final void K(int i, int i2) {
        c0(20);
        e0(i << 3);
        e0(i2);
    }

    @Override // defpackage.g54
    public final void L(int i, int i2) {
        c0(14);
        e0((i << 3) | 5);
        g0(i2);
    }

    @Override // defpackage.g54
    public final void M(int i, long j) {
        c0(20);
        e0(i << 3);
        f0(j);
    }

    @Override // defpackage.g54
    public final int N() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // defpackage.g54
    public final void O(int i, long j) {
        c0(18);
        e0((i << 3) | 1);
        h0(j);
    }

    @Override // defpackage.g54
    public final void P(int i, boolean z) {
        c0(11);
        e0(i << 3);
        int i2 = this.x;
        this.v[i2] = z ? (byte) 1 : (byte) 0;
        this.x = i2 + 1;
    }

    @Override // defpackage.g54
    public final void Q(String str, int i) throws IOException {
        X((i << 3) | 2);
        b0(str);
    }

    @Override // defpackage.g54
    public final void R(int i, a54 a54Var) {
        X((i << 3) | 2);
        S(a54Var);
    }

    @Override // defpackage.g54
    public final void S(a54 a54Var) {
        X(a54Var.d());
        a54Var.j(this);
    }

    @Override // defpackage.g54
    public final void T(int i, byte[] bArr) throws IOException {
        X(i);
        i0(bArr, 0, i);
    }

    @Override // defpackage.g54
    public final void U(s44 s44Var) {
        X(((p54) s44Var).d(null));
        ((p54) s44Var).v(this);
    }

    @Override // defpackage.g54
    public final void V(byte b) {
        if (this.x == this.w) {
            d0();
        }
        int i = this.x;
        this.v[i] = b;
        this.x = i + 1;
    }

    @Override // defpackage.g54
    public final void W(int i) {
        if (i >= 0) {
            X(i);
        } else {
            Z(i);
        }
    }

    @Override // defpackage.g54
    public final void X(int i) {
        c0(5);
        e0(i);
    }

    @Override // defpackage.g54
    public final void Y(int i) {
        c0(4);
        g0(i);
    }

    @Override // defpackage.g54
    public final void Z(long j) {
        c0(10);
        f0(j);
    }

    @Override // defpackage.g54
    public final void a0(long j) {
        c0(8);
        h0(j);
    }

    @Override // defpackage.g54
    public final void b0(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iD = g54.D(length);
            int i = iD + length;
            int i2 = this.w;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iC = i74.c(str, bArr, 0, length);
                X(iC);
                i0(bArr, 0, iC);
                return;
            }
            if (i > i2 - this.x) {
                d0();
            }
            int iD2 = g54.D(str.length());
            int i3 = this.x;
            byte[] bArr2 = this.v;
            try {
                if (iD2 == iD) {
                    int i4 = i3 + iD2;
                    this.x = i4;
                    int iC2 = i74.c(str, bArr2, i4, i2 - i4);
                    this.x = i3;
                    e0((iC2 - i3) - iD2);
                    this.x = iC2;
                } else {
                    int iB = i74.b(str);
                    e0(iB);
                    this.x = i74.c(str, bArr2, this.x, iB);
                }
            } catch (h74 e) {
                this.x = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new h40(e2);
            }
        } catch (h74 e3) {
            H(str, e3);
        }
    }

    public final void c0(int i) {
        if (this.w - this.x < i) {
            d0();
        }
    }

    public final void d0() {
        this.y.write(this.v, 0, this.x);
        this.x = 0;
    }

    public final void e0(int i) {
        boolean z = g54.u;
        byte[] bArr = this.v;
        if (z) {
            while ((i & (-128)) != 0) {
                int i2 = this.x;
                this.x = i2 + 1;
                g74.m(bArr, i2, (byte) (i | 128));
                i >>>= 7;
            }
            int i3 = this.x;
            this.x = i3 + 1;
            g74.m(bArr, i3, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i4 = this.x;
            this.x = i4 + 1;
            bArr[i4] = (byte) (i | 128);
            i >>>= 7;
        }
        int i5 = this.x;
        this.x = i5 + 1;
        bArr[i5] = (byte) i;
    }

    public final void f0(long j) {
        boolean z = g54.u;
        byte[] bArr = this.v;
        if (z) {
            while (true) {
                int i = (int) j;
                if ((j & (-128)) == 0) {
                    int i2 = this.x;
                    this.x = i2 + 1;
                    g74.m(bArr, i2, (byte) i);
                    return;
                } else {
                    int i3 = this.x;
                    this.x = i3 + 1;
                    g74.m(bArr, i3, (byte) (i | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = (int) j;
                if ((j & (-128)) == 0) {
                    int i5 = this.x;
                    this.x = i5 + 1;
                    bArr[i5] = (byte) i4;
                    return;
                } else {
                    int i6 = this.x;
                    this.x = i6 + 1;
                    bArr[i6] = (byte) (i4 | 128);
                    j >>>= 7;
                }
            }
        }
    }

    public final void g0(int i) {
        int i2 = this.x;
        byte[] bArr = this.v;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.x = i2 + 4;
    }

    public final void h0(long j) {
        int i = this.x;
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
    }

    public final void i0(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.x;
        int i4 = this.w;
        int i5 = i4 - i3;
        byte[] bArr2 = this.v;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.x += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        this.x = i4;
        d0();
        int i7 = i2 - i5;
        if (i7 > i4) {
            this.y.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.x = i7;
        }
    }

    @Override // defpackage.yb
    public final void w(byte[] bArr, int i, int i2) throws IOException {
        i0(bArr, i, i2);
    }
}
