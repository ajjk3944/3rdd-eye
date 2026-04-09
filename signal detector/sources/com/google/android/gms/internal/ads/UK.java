package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class UK extends VK {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f11640d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11641e;

    /* renamed from: f, reason: collision with root package name */
    public int f11642f;

    /* renamed from: g, reason: collision with root package name */
    public final OutputStream f11643g;

    public UK(OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.f11640d = new byte[iMax];
        this.f11641e = iMax;
        this.f11643g = outputStream;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void M(int i, int i3) {
        b0((i << 3) | i3);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void N(int i, int i3) {
        g0(20);
        i0(i << 3);
        if (i3 >= 0) {
            i0(i3);
        } else {
            j0(i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void O(int i, int i3) {
        g0(20);
        i0(i << 3);
        i0(i3);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void P(int i, int i3) {
        g0(14);
        i0((i << 3) | 5);
        k0(i3);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void Q(int i, long j6) {
        g0(20);
        i0(i << 3);
        j0(j6);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final int R() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void S(int i, long j6) {
        g0(18);
        i0((i << 3) | 1);
        l0(j6);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void T(int i, boolean z6) {
        g0(11);
        i0(i << 3);
        int i3 = this.f11642f;
        this.f11640d[i3] = z6 ? (byte) 1 : (byte) 0;
        this.f11642f = i3 + 1;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void U(int i, String str) throws XL, IOException {
        b0((i << 3) | 2);
        f0(str);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void V(int i, QK qk) {
        b0((i << 3) | 2);
        W(qk);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void W(QK qk) {
        b0(qk.f());
        qk.j(this);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void X(int i, byte[] bArr) throws IOException {
        b0(i);
        m0(0, i, bArr);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void Y(FK fk) {
        b0(((AbstractC1096eL) fk).d(null));
        ((AbstractC1096eL) fk).v(this);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void Z(byte b5) {
        if (this.f11642f == this.f11641e) {
            h0();
        }
        int i = this.f11642f;
        this.f11640d[i] = b5;
        this.f11642f = i + 1;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void a0(int i) {
        if (i >= 0) {
            b0(i);
        } else {
            d0(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void b0(int i) {
        g0(5);
        i0(i);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void c0(int i) {
        g0(4);
        k0(i);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void d0(long j6) {
        g0(10);
        j0(j6);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void e0(long j6) {
        g0(8);
        l0(j6);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void f0(String str) throws XL, IOException {
        int length = str.length() * 3;
        int iJ = VK.J(length);
        int i = iJ + length;
        int i3 = this.f11641e;
        if (i > i3) {
            byte[] bArr = new byte[length];
            int iC = YL.c(str, bArr, 0, length);
            b0(iC);
            m0(0, iC, bArr);
            return;
        }
        if (i > i3 - this.f11642f) {
            h0();
        }
        int iJ2 = VK.J(str.length());
        int i6 = this.f11642f;
        byte[] bArr2 = this.f11640d;
        try {
            if (iJ2 == iJ) {
                int i7 = i6 + iJ2;
                this.f11642f = i7;
                int iC2 = YL.c(str, bArr2, i7, i3 - i7);
                this.f11642f = i6;
                i0((iC2 - i6) - iJ2);
                this.f11642f = iC2;
            } else {
                int iB = YL.b(str);
                i0(iB);
                this.f11642f = YL.c(str, bArr2, this.f11642f, iB);
            }
        } catch (ArrayIndexOutOfBoundsException e6) {
            throw new EK(e6);
        }
    }

    public final void g0(int i) {
        if (this.f11641e - this.f11642f < i) {
            h0();
        }
    }

    public final void h0() {
        this.f11643g.write(this.f11640d, 0, this.f11642f);
        this.f11642f = 0;
    }

    public final void i0(int i) {
        boolean z6 = VK.f11982c;
        byte[] bArr = this.f11640d;
        if (z6) {
            while ((i & (-128)) != 0) {
                int i3 = this.f11642f;
                this.f11642f = i3 + 1;
                WL.m(bArr, i3, (byte) (i | 128));
                i >>>= 7;
            }
            int i6 = this.f11642f;
            this.f11642f = i6 + 1;
            WL.m(bArr, i6, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i7 = this.f11642f;
            this.f11642f = i7 + 1;
            bArr[i7] = (byte) (i | 128);
            i >>>= 7;
        }
        int i8 = this.f11642f;
        this.f11642f = i8 + 1;
        bArr[i8] = (byte) i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1984ut
    public final void j(int i, int i3, byte[] bArr) throws IOException {
        m0(i, i3, bArr);
    }

    public final void j0(long j6) {
        boolean z6 = VK.f11982c;
        byte[] bArr = this.f11640d;
        if (z6) {
            while (true) {
                int i = (int) j6;
                if ((j6 & (-128)) == 0) {
                    int i3 = this.f11642f;
                    this.f11642f = i3 + 1;
                    WL.m(bArr, i3, (byte) i);
                    return;
                } else {
                    int i6 = this.f11642f;
                    this.f11642f = i6 + 1;
                    WL.m(bArr, i6, (byte) (i | 128));
                    j6 >>>= 7;
                }
            }
        } else {
            while (true) {
                int i7 = (int) j6;
                if ((j6 & (-128)) == 0) {
                    int i8 = this.f11642f;
                    this.f11642f = i8 + 1;
                    bArr[i8] = (byte) i7;
                    return;
                } else {
                    int i9 = this.f11642f;
                    this.f11642f = i9 + 1;
                    bArr[i9] = (byte) (i7 | 128);
                    j6 >>>= 7;
                }
            }
        }
    }

    public final void k0(int i) {
        int i3 = this.f11642f;
        byte[] bArr = this.f11640d;
        bArr[i3] = (byte) i;
        bArr[i3 + 1] = (byte) (i >> 8);
        bArr[i3 + 2] = (byte) (i >> 16);
        bArr[i3 + 3] = (byte) (i >> 24);
        this.f11642f = i3 + 4;
    }

    public final void l0(long j6) {
        int i = this.f11642f;
        byte[] bArr = this.f11640d;
        bArr[i] = (byte) j6;
        bArr[i + 1] = (byte) (j6 >> 8);
        bArr[i + 2] = (byte) (j6 >> 16);
        bArr[i + 3] = (byte) (j6 >> 24);
        bArr[i + 4] = (byte) (j6 >> 32);
        bArr[i + 5] = (byte) (j6 >> 40);
        bArr[i + 6] = (byte) (j6 >> 48);
        bArr[i + 7] = (byte) (j6 >> 56);
        this.f11642f = i + 8;
    }

    public final void m0(int i, int i3, byte[] bArr) throws IOException {
        int i6 = this.f11642f;
        int i7 = this.f11641e;
        int i8 = i7 - i6;
        byte[] bArr2 = this.f11640d;
        if (i8 >= i3) {
            System.arraycopy(bArr, i, bArr2, i6, i3);
            this.f11642f += i3;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i6, i8);
        int i9 = i + i8;
        this.f11642f = i7;
        h0();
        int i10 = i3 - i8;
        if (i10 > i7) {
            this.f11643g.write(bArr, i9, i10);
        } else {
            System.arraycopy(bArr, i9, bArr2, 0, i10);
            this.f11642f = i10;
        }
    }
}
