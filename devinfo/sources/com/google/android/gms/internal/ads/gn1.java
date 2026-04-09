package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gn1 extends hn1 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f11562d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11563e;

    /* renamed from: f, reason: collision with root package name */
    public int f11564f;
    public final OutputStream g;

    public gn1(OutputStream outputStream, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i4, 20);
        this.f11562d = new byte[iMax];
        this.f11563e = iMax;
        this.g = outputStream;
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void M(int i4, int i10) {
        b0((i4 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void N(int i4, int i10) {
        g0(20);
        i0(i4 << 3);
        if (i10 >= 0) {
            i0(i10);
        } else {
            j0(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void O(int i4, int i10) {
        g0(20);
        i0(i4 << 3);
        i0(i10);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void P(int i4, int i10) {
        g0(14);
        i0((i4 << 3) | 5);
        k0(i10);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void Q(int i4, long j) {
        g0(20);
        i0(i4 << 3);
        j0(j);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final int R() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void S(int i4, long j) {
        g0(18);
        i0((i4 << 3) | 1);
        l0(j);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void T(int i4, boolean z3) {
        g0(11);
        i0(i4 << 3);
        int i10 = this.f11564f;
        this.f11562d[i10] = z3 ? (byte) 1 : (byte) 0;
        this.f11564f = i10 + 1;
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void U(int i4, String str) throws IOException, jp1 {
        b0((i4 << 3) | 2);
        f0(str);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void V(int i4, bn1 bn1Var) {
        b0((i4 << 3) | 2);
        W(bn1Var);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void W(bn1 bn1Var) {
        b0(bn1Var.i());
        bn1Var.m(this);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void X(int i4, byte[] bArr) throws IOException {
        b0(i4);
        m0(0, i4, bArr);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void Y(qm1 qm1Var) {
        b0(((qn1) qm1Var).d(null));
        ((qn1) qm1Var).v(this);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void Z(byte b10) {
        if (this.f11564f == this.f11563e) {
            h0();
        }
        int i4 = this.f11564f;
        this.f11562d[i4] = b10;
        this.f11564f = i4 + 1;
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void a0(int i4) {
        if (i4 >= 0) {
            b0(i4);
        } else {
            d0(i4);
        }
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void b0(int i4) {
        g0(5);
        i0(i4);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void c0(int i4) {
        g0(4);
        k0(i4);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void d0(long j) {
        g0(10);
        j0(j);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void e0(long j) {
        g0(8);
        l0(j);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void f0(String str) throws IOException, jp1 {
        int length = str.length() * 3;
        int iJ = hn1.J(length);
        int i4 = iJ + length;
        int i10 = this.f11563e;
        if (i4 > i10) {
            byte[] bArr = new byte[length];
            int iC = kp1.c(str, bArr, 0, length);
            b0(iC);
            m0(0, iC, bArr);
            return;
        }
        if (i4 > i10 - this.f11564f) {
            h0();
        }
        int iJ2 = hn1.J(str.length());
        int i11 = this.f11564f;
        byte[] bArr2 = this.f11562d;
        try {
            if (iJ2 == iJ) {
                int i12 = i11 + iJ2;
                this.f11564f = i12;
                int iC2 = kp1.c(str, bArr2, i12, i10 - i12);
                this.f11564f = i11;
                i0((iC2 - i11) - iJ2);
                this.f11564f = iC2;
            } else {
                int iB = kp1.b(str);
                i0(iB);
                this.f11564f = kp1.c(str, bArr2, this.f11564f, iB);
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new androidx.datastore.preferences.protobuf.l(e2);
        }
    }

    public final void g0(int i4) {
        if (this.f11563e - this.f11564f < i4) {
            h0();
        }
    }

    public final void h0() {
        this.g.write(this.f11562d, 0, this.f11564f);
        this.f11564f = 0;
    }

    public final void i0(int i4) {
        boolean z3 = hn1.f11928c;
        byte[] bArr = this.f11562d;
        if (z3) {
            while ((i4 & (-128)) != 0) {
                int i10 = this.f11564f;
                this.f11564f = i10 + 1;
                ip1.m(bArr, i10, (byte) (i4 | 128));
                i4 >>>= 7;
            }
            int i11 = this.f11564f;
            this.f11564f = i11 + 1;
            ip1.m(bArr, i11, (byte) i4);
            return;
        }
        while ((i4 & (-128)) != 0) {
            int i12 = this.f11564f;
            this.f11564f = i12 + 1;
            bArr[i12] = (byte) (i4 | 128);
            i4 >>>= 7;
        }
        int i13 = this.f11564f;
        this.f11564f = i13 + 1;
        bArr[i13] = (byte) i4;
    }

    @Override // com.google.android.gms.internal.ads.yo0
    public final void j(int i4, int i10, byte[] bArr) throws IOException {
        m0(i4, i10, bArr);
    }

    public final void j0(long j) {
        boolean z3 = hn1.f11928c;
        byte[] bArr = this.f11562d;
        if (z3) {
            while (true) {
                int i4 = (int) j;
                if ((j & (-128)) == 0) {
                    int i10 = this.f11564f;
                    this.f11564f = i10 + 1;
                    ip1.m(bArr, i10, (byte) i4);
                    return;
                } else {
                    int i11 = this.f11564f;
                    this.f11564f = i11 + 1;
                    ip1.m(bArr, i11, (byte) (i4 | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                int i12 = (int) j;
                if ((j & (-128)) == 0) {
                    int i13 = this.f11564f;
                    this.f11564f = i13 + 1;
                    bArr[i13] = (byte) i12;
                    return;
                } else {
                    int i14 = this.f11564f;
                    this.f11564f = i14 + 1;
                    bArr[i14] = (byte) (i12 | 128);
                    j >>>= 7;
                }
            }
        }
    }

    public final void k0(int i4) {
        int i10 = this.f11564f;
        byte[] bArr = this.f11562d;
        bArr[i10] = (byte) i4;
        bArr[i10 + 1] = (byte) (i4 >> 8);
        bArr[i10 + 2] = (byte) (i4 >> 16);
        bArr[i10 + 3] = (byte) (i4 >> 24);
        this.f11564f = i10 + 4;
    }

    public final void l0(long j) {
        int i4 = this.f11564f;
        byte[] bArr = this.f11562d;
        bArr[i4] = (byte) j;
        bArr[i4 + 1] = (byte) (j >> 8);
        bArr[i4 + 2] = (byte) (j >> 16);
        bArr[i4 + 3] = (byte) (j >> 24);
        bArr[i4 + 4] = (byte) (j >> 32);
        bArr[i4 + 5] = (byte) (j >> 40);
        bArr[i4 + 6] = (byte) (j >> 48);
        bArr[i4 + 7] = (byte) (j >> 56);
        this.f11564f = i4 + 8;
    }

    public final void m0(int i4, int i10, byte[] bArr) throws IOException {
        int i11 = this.f11564f;
        int i12 = this.f11563e;
        int i13 = i12 - i11;
        byte[] bArr2 = this.f11562d;
        if (i13 >= i10) {
            System.arraycopy(bArr, i4, bArr2, i11, i10);
            this.f11564f += i10;
            return;
        }
        System.arraycopy(bArr, i4, bArr2, i11, i13);
        int i14 = i4 + i13;
        this.f11564f = i12;
        h0();
        int i15 = i10 - i13;
        if (i15 > i12) {
            this.g.write(bArr, i14, i15);
        } else {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.f11564f = i15;
        }
    }
}
