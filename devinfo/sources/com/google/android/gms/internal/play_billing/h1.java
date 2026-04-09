package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h1 extends wd.b {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f20137f = Logger.getLogger(h1.class.getName());
    public static final boolean g = u2.f20239e;

    /* renamed from: b, reason: collision with root package name */
    public a2 f20138b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f20139c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20140d;

    /* renamed from: e, reason: collision with root package name */
    public int f20141e;

    public h1(byte[] bArr, int i4) {
        int length = bArr.length;
        if (((length - i4) | i4) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(a0.g.i(length, i4, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f20139c = bArr;
        this.f20141e = 0;
        this.f20140d = i4;
    }

    public static int V(String str) {
        int length;
        try {
            length = w2.c(str);
        } catch (v2 unused) {
            length = str.getBytes(u1.f20233a).length;
        }
        return W(length) + length;
    }

    public static int W(int i4) {
        return (352 - (Integer.numberOfLeadingZeros(i4) * 9)) >>> 6;
    }

    public static int X(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void Y(int i4, byte[] bArr) throws androidx.datastore.preferences.protobuf.l {
        try {
            System.arraycopy(bArr, 0, this.f20139c, this.f20141e, i4);
            this.f20141e += i4;
        } catch (IndexOutOfBoundsException e2) {
            throw new androidx.datastore.preferences.protobuf.l(this.f20141e, this.f20140d, i4, e2, 6);
        }
    }

    public final void Z(int i4, g1 g1Var) {
        j0((i4 << 3) | 2);
        j0(g1Var.d());
        Y(g1Var.d(), g1Var.f20133b);
    }

    public final void a0(int i4, int i10) {
        j0((i4 << 3) | 5);
        b0(i10);
    }

    public final void b0(int i4) throws androidx.datastore.preferences.protobuf.l {
        int i10 = this.f20141e;
        try {
            byte[] bArr = this.f20139c;
            bArr[i10] = (byte) i4;
            bArr[i10 + 1] = (byte) (i4 >> 8);
            bArr[i10 + 2] = (byte) (i4 >> 16);
            bArr[i10 + 3] = (byte) (i4 >> 24);
            this.f20141e = i10 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new androidx.datastore.preferences.protobuf.l(i10, this.f20140d, 4, e2, 6);
        }
    }

    public final void c0(int i4, long j) {
        j0((i4 << 3) | 1);
        d0(j);
    }

    public final void d0(long j) throws androidx.datastore.preferences.protobuf.l {
        int i4 = this.f20141e;
        try {
            byte[] bArr = this.f20139c;
            bArr[i4] = (byte) j;
            bArr[i4 + 1] = (byte) (j >> 8);
            bArr[i4 + 2] = (byte) (j >> 16);
            bArr[i4 + 3] = (byte) (j >> 24);
            bArr[i4 + 4] = (byte) (j >> 32);
            bArr[i4 + 5] = (byte) (j >> 40);
            bArr[i4 + 6] = (byte) (j >> 48);
            bArr[i4 + 7] = (byte) (j >> 56);
            this.f20141e = i4 + 8;
        } catch (IndexOutOfBoundsException e2) {
            throw new androidx.datastore.preferences.protobuf.l(i4, this.f20140d, 8, e2, 6);
        }
    }

    public final void e0(int i4, int i10) {
        j0(i4 << 3);
        f0(i10);
    }

    public final void f0(int i4) throws androidx.datastore.preferences.protobuf.l {
        if (i4 >= 0) {
            j0(i4);
        } else {
            l0(i4);
        }
    }

    public final void g0(int i4, String str) {
        j0((i4 << 3) | 2);
        int i10 = this.f20141e;
        try {
            int iW = W(str.length() * 3);
            int iW2 = W(str.length());
            int i11 = this.f20140d;
            byte[] bArr = this.f20139c;
            if (iW2 != iW) {
                j0(w2.c(str));
                int i12 = this.f20141e;
                this.f20141e = w2.b(str, bArr, i12, i11 - i12);
            } else {
                int i13 = i10 + iW2;
                this.f20141e = i13;
                int iB = w2.b(str, bArr, i13, i11 - i13);
                this.f20141e = i10;
                j0((iB - i10) - iW2);
                this.f20141e = iB;
            }
        } catch (v2 e2) {
            this.f20141e = i10;
            f20137f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(u1.f20233a);
            try {
                int length = bytes.length;
                j0(length);
                Y(length, bytes);
            } catch (IndexOutOfBoundsException e10) {
                throw new androidx.datastore.preferences.protobuf.l(e10);
            }
        } catch (IndexOutOfBoundsException e11) {
            throw new androidx.datastore.preferences.protobuf.l(e11);
        }
    }

    public final void h0(int i4, int i10) {
        j0((i4 << 3) | i10);
    }

    public final void i0(int i4, int i10) {
        j0(i4 << 3);
        j0(i10);
    }

    public final void j0(int i4) {
        int i10;
        int i11 = this.f20141e;
        while (true) {
            int i12 = i4 & (-128);
            byte[] bArr = this.f20139c;
            if (i12 == 0) {
                i10 = i11 + 1;
                bArr[i11] = (byte) i4;
                this.f20141e = i10;
                return;
            } else {
                i10 = i11 + 1;
                try {
                    bArr[i11] = (byte) (i4 | 128);
                    i4 >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e2) {
                    throw new androidx.datastore.preferences.protobuf.l(i10, this.f20140d, 1, e2, 6);
                }
            }
            throw new androidx.datastore.preferences.protobuf.l(i10, this.f20140d, 1, e2, 6);
        }
    }

    public final void k0(int i4, long j) {
        j0(i4 << 3);
        l0(j);
    }

    public final void l0(long j) throws androidx.datastore.preferences.protobuf.l {
        int i4;
        int i10 = this.f20141e;
        boolean z3 = g;
        int i11 = this.f20140d;
        byte[] bArr = this.f20139c;
        if (!z3 || i11 - i10 < 10) {
            long j8 = j;
            while ((j8 & (-128)) != 0) {
                i4 = i10 + 1;
                try {
                    bArr[i10] = (byte) (((int) j8) | 128);
                    j8 >>>= 7;
                    i10 = i4;
                } catch (IndexOutOfBoundsException e2) {
                    throw new androidx.datastore.preferences.protobuf.l(i4, i11, 1, e2, 6);
                }
            }
            i4 = i10 + 1;
            bArr[i10] = (byte) j8;
        } else {
            long j9 = j;
            while ((j9 & (-128)) != 0) {
                u2.f20237c.d(bArr, u2.f20240f + i10, (byte) (((int) j9) | 128));
                j9 >>>= 7;
                i10++;
            }
            i4 = i10 + 1;
            u2.f20237c.d(bArr, u2.f20240f + i10, (byte) j9);
        }
        this.f20141e = i4;
    }
}
