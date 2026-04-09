package com.google.android.gms.internal.ads;

import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fn1 extends hn1 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f11242d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11243e;

    /* renamed from: f, reason: collision with root package name */
    public int f11244f;

    public fn1(byte[] bArr, int i4) {
        int length = bArr.length;
        if (((length - i4) | i4) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(a0.g.i(length, i4, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f11242d = bArr;
        this.f11244f = 0;
        this.f11243e = i4;
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void M(int i4, int i10) throws androidx.datastore.preferences.protobuf.l {
        b0((i4 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void N(int i4, int i10) throws androidx.datastore.preferences.protobuf.l {
        b0(i4 << 3);
        a0(i10);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void O(int i4, int i10) throws androidx.datastore.preferences.protobuf.l {
        b0(i4 << 3);
        b0(i10);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void P(int i4, int i10) throws androidx.datastore.preferences.protobuf.l {
        b0((i4 << 3) | 5);
        c0(i10);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void Q(int i4, long j) throws androidx.datastore.preferences.protobuf.l {
        b0(i4 << 3);
        d0(j);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final int R() {
        return this.f11243e - this.f11244f;
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void S(int i4, long j) throws androidx.datastore.preferences.protobuf.l {
        b0((i4 << 3) | 1);
        e0(j);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void T(int i4, boolean z3) throws androidx.datastore.preferences.protobuf.l {
        b0(i4 << 3);
        Z(z3 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void U(int i4, String str) throws androidx.datastore.preferences.protobuf.l {
        b0((i4 << 3) | 2);
        f0(str);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void V(int i4, bn1 bn1Var) throws androidx.datastore.preferences.protobuf.l {
        b0((i4 << 3) | 2);
        W(bn1Var);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void W(bn1 bn1Var) throws androidx.datastore.preferences.protobuf.l {
        b0(bn1Var.i());
        bn1Var.m(this);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void X(int i4, byte[] bArr) throws androidx.datastore.preferences.protobuf.l {
        b0(i4);
        g0(0, i4, bArr);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void Y(qm1 qm1Var) throws androidx.datastore.preferences.protobuf.l {
        b0(((qn1) qm1Var).d(null));
        ((qn1) qm1Var).v(this);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void Z(byte b10) throws androidx.datastore.preferences.protobuf.l {
        int i4;
        int i10 = this.f11244f;
        try {
            i4 = i10 + 1;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
        try {
            this.f11242d[i10] = b10;
            this.f11244f = i4;
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            i10 = i4;
            throw new androidx.datastore.preferences.protobuf.l(i10, this.f11243e, 1, e, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void a0(int i4) throws androidx.datastore.preferences.protobuf.l {
        if (i4 >= 0) {
            b0(i4);
        } else {
            d0(i4);
        }
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void b0(int i4) throws androidx.datastore.preferences.protobuf.l {
        int i10;
        int i11 = this.f11244f;
        while (true) {
            int i12 = i4 & (-128);
            byte[] bArr = this.f11242d;
            if (i12 == 0) {
                i10 = i11 + 1;
                bArr[i11] = (byte) i4;
                this.f11244f = i10;
                return;
            } else {
                i10 = i11 + 1;
                try {
                    bArr[i11] = (byte) (i4 | 128);
                    i4 >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e2) {
                    throw new androidx.datastore.preferences.protobuf.l(i10, this.f11243e, 1, e2, 2);
                }
            }
            throw new androidx.datastore.preferences.protobuf.l(i10, this.f11243e, 1, e2, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void c0(int i4) throws androidx.datastore.preferences.protobuf.l {
        int i10 = this.f11244f;
        try {
            byte[] bArr = this.f11242d;
            bArr[i10] = (byte) i4;
            bArr[i10 + 1] = (byte) (i4 >> 8);
            bArr[i10 + 2] = (byte) (i4 >> 16);
            bArr[i10 + 3] = (byte) (i4 >> 24);
            this.f11244f = i10 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new androidx.datastore.preferences.protobuf.l(i10, this.f11243e, 4, e2, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void d0(long j) throws androidx.datastore.preferences.protobuf.l {
        int i4;
        int i10 = this.f11244f;
        int i11 = this.f11243e;
        byte[] bArr = this.f11242d;
        if (!hn1.f11928c || i11 - i10 < 10) {
            long j8 = j;
            while ((j8 & (-128)) != 0) {
                int i12 = i10 + 1;
                try {
                    bArr[i10] = (byte) (((int) j8) | 128);
                    j8 >>>= 7;
                    i10 = i12;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i4 = i12;
                    throw new androidx.datastore.preferences.protobuf.l(i4, i11, 1, e, 2);
                }
            }
            i4 = i10 + 1;
            try {
                bArr[i10] = (byte) j8;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                throw new androidx.datastore.preferences.protobuf.l(i4, i11, 1, e, 2);
            }
        } else {
            long j9 = j;
            while ((j9 & (-128)) != 0) {
                ip1.m(bArr, i10, (byte) (((int) j9) | 128));
                j9 >>>= 7;
                i10++;
            }
            i4 = i10 + 1;
            ip1.m(bArr, i10, (byte) j9);
        }
        this.f11244f = i4;
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void e0(long j) throws androidx.datastore.preferences.protobuf.l {
        int i4 = this.f11244f;
        try {
            byte[] bArr = this.f11242d;
            bArr[i4] = (byte) j;
            bArr[i4 + 1] = (byte) (j >> 8);
            bArr[i4 + 2] = (byte) (j >> 16);
            bArr[i4 + 3] = (byte) (j >> 24);
            bArr[i4 + 4] = (byte) (j >> 32);
            bArr[i4 + 5] = (byte) (j >> 40);
            bArr[i4 + 6] = (byte) (j >> 48);
            bArr[i4 + 7] = (byte) (j >> 56);
            this.f11244f = i4 + 8;
        } catch (IndexOutOfBoundsException e2) {
            throw new androidx.datastore.preferences.protobuf.l(i4, this.f11243e, 8, e2, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void f0(String str) throws androidx.datastore.preferences.protobuf.l {
        int i4 = this.f11244f;
        try {
            int iJ = hn1.J(str.length() * 3);
            int iJ2 = hn1.J(str.length());
            int i10 = this.f11243e;
            byte[] bArr = this.f11242d;
            if (iJ2 != iJ) {
                b0(kp1.b(str));
                int i11 = this.f11244f;
                this.f11244f = kp1.c(str, bArr, i11, i10 - i11);
            } else {
                int i12 = i4 + iJ2;
                this.f11244f = i12;
                int iC = kp1.c(str, bArr, i12, i10 - i12);
                this.f11244f = i4;
                b0((iC - i4) - iJ2);
                this.f11244f = iC;
            }
        } catch (IndexOutOfBoundsException e2) {
            throw new androidx.datastore.preferences.protobuf.l(e2);
        }
    }

    public final void g0(int i4, int i10, byte[] bArr) throws androidx.datastore.preferences.protobuf.l {
        try {
            System.arraycopy(bArr, i4, this.f11242d, this.f11244f, i10);
            this.f11244f += i10;
        } catch (IndexOutOfBoundsException e2) {
            throw new androidx.datastore.preferences.protobuf.l(this.f11244f, this.f11243e, i10, e2, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.yo0
    public final void j(int i4, int i10, byte[] bArr) throws androidx.datastore.preferences.protobuf.l {
        g0(i4, i10, bArr);
    }
}
