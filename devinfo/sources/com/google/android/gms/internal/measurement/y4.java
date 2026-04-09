package com.google.android.gms.internal.measurement;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y4 extends com.bumptech.glide.f {

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f20047e = Logger.getLogger(y4.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f20048f = r6.f19899e;

    /* renamed from: a, reason: collision with root package name */
    public v5 f20049a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f20050b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20051c;

    /* renamed from: d, reason: collision with root package name */
    public int f20052d;

    public y4(byte[] bArr, int i4) {
        int length = bArr.length;
        if (((length - i4) | i4) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(a0.g.i(length, i4, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f20050b = bArr;
        this.f20052d = 0;
        this.f20051c = i4;
    }

    public static int Q(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int R(String str) {
        int length;
        try {
            length = t6.b(str);
        } catch (s6 unused) {
            length = str.getBytes(n5.f19843a).length;
        }
        return h0(length) + length;
    }

    public static int h0(int i4) {
        return (352 - (Integer.numberOfLeadingZeros(i4) * 9)) >>> 6;
    }

    public final void S(int i4, int i10) {
        b0((i4 << 3) | i10);
    }

    public final void T(int i4, int i10) {
        b0(i4 << 3);
        a0(i10);
    }

    public final void U(int i4, int i10) {
        b0(i4 << 3);
        b0(i10);
    }

    public final void V(int i4, int i10) {
        b0((i4 << 3) | 5);
        c0(i10);
    }

    public final void W(int i4, long j) {
        b0(i4 << 3);
        d0(j);
    }

    public final void X(int i4, long j) {
        b0((i4 << 3) | 1);
        e0(j);
    }

    public final void Y(x4 x4Var) {
        b0(x4Var.d());
        f0(x4Var.d(), x4Var.f20033b);
    }

    public final void Z(byte b10) {
        int i4;
        int i10 = this.f20052d;
        try {
            i4 = i10 + 1;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
        try {
            this.f20050b[i10] = b10;
            this.f20052d = i4;
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            i10 = i4;
            throw new androidx.datastore.preferences.protobuf.l(i10, this.f20051c, 1, e, 5);
        }
    }

    public final void a0(int i4) {
        if (i4 >= 0) {
            b0(i4);
        } else {
            d0(i4);
        }
    }

    public final void b0(int i4) {
        int i10;
        int i11 = this.f20052d;
        while (true) {
            int i12 = i4 & (-128);
            byte[] bArr = this.f20050b;
            if (i12 == 0) {
                i10 = i11 + 1;
                bArr[i11] = (byte) i4;
                this.f20052d = i10;
                return;
            } else {
                i10 = i11 + 1;
                try {
                    bArr[i11] = (byte) (i4 | 128);
                    i4 >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e2) {
                    throw new androidx.datastore.preferences.protobuf.l(i10, this.f20051c, 1, e2, 5);
                }
            }
            throw new androidx.datastore.preferences.protobuf.l(i10, this.f20051c, 1, e2, 5);
        }
    }

    public final void c0(int i4) {
        int i10 = this.f20052d;
        try {
            byte[] bArr = this.f20050b;
            bArr[i10] = (byte) i4;
            bArr[i10 + 1] = (byte) (i4 >> 8);
            bArr[i10 + 2] = (byte) (i4 >> 16);
            bArr[i10 + 3] = (byte) (i4 >> 24);
            this.f20052d = i10 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new androidx.datastore.preferences.protobuf.l(i10, this.f20051c, 4, e2, 5);
        }
    }

    public final void d0(long j) {
        int i4;
        int i10 = this.f20052d;
        int i11 = this.f20051c;
        byte[] bArr = this.f20050b;
        if (!f20048f || i11 - i10 < 10) {
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
                    throw new androidx.datastore.preferences.protobuf.l(i4, i11, 1, e, 5);
                }
            }
            i4 = i10 + 1;
            try {
                bArr[i10] = (byte) j8;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                throw new androidx.datastore.preferences.protobuf.l(i4, i11, 1, e, 5);
            }
        } else {
            long j9 = j;
            while ((j9 & (-128)) != 0) {
                r6.f19897c.a(bArr, r6.f19900f + i10, (byte) (((int) j9) | 128));
                j9 >>>= 7;
                i10++;
            }
            i4 = i10 + 1;
            r6.f19897c.a(bArr, r6.f19900f + i10, (byte) j9);
        }
        this.f20052d = i4;
    }

    public final void e0(long j) {
        int i4 = this.f20052d;
        try {
            byte[] bArr = this.f20050b;
            bArr[i4] = (byte) j;
            bArr[i4 + 1] = (byte) (j >> 8);
            bArr[i4 + 2] = (byte) (j >> 16);
            bArr[i4 + 3] = (byte) (j >> 24);
            bArr[i4 + 4] = (byte) (j >> 32);
            bArr[i4 + 5] = (byte) (j >> 40);
            bArr[i4 + 6] = (byte) (j >> 48);
            bArr[i4 + 7] = (byte) (j >> 56);
            this.f20052d = i4 + 8;
        } catch (IndexOutOfBoundsException e2) {
            throw new androidx.datastore.preferences.protobuf.l(i4, this.f20051c, 8, e2, 5);
        }
    }

    public final void f0(int i4, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.f20050b, this.f20052d, i4);
            this.f20052d += i4;
        } catch (IndexOutOfBoundsException e2) {
            throw new androidx.datastore.preferences.protobuf.l(this.f20052d, this.f20051c, i4, e2, 5);
        }
    }

    public final void g0(String str) {
        int i4 = this.f20052d;
        try {
            int iH0 = h0(str.length() * 3);
            int iH02 = h0(str.length());
            int i10 = this.f20051c;
            byte[] bArr = this.f20050b;
            if (iH02 != iH0) {
                b0(t6.b(str));
                int i11 = this.f20052d;
                this.f20052d = t6.c(str, bArr, i11, i10 - i11);
            } else {
                int i12 = i4 + iH02;
                this.f20052d = i12;
                int iC = t6.c(str, bArr, i12, i10 - i12);
                this.f20052d = i4;
                b0((iC - i4) - iH02);
                this.f20052d = iC;
            }
        } catch (s6 e2) {
            this.f20052d = i4;
            f20047e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(n5.f19843a);
            try {
                int length = bytes.length;
                b0(length);
                f0(length, bytes);
            } catch (IndexOutOfBoundsException e10) {
                throw new androidx.datastore.preferences.protobuf.l(e10);
            }
        } catch (IndexOutOfBoundsException e11) {
            throw new androidx.datastore.preferences.protobuf.l(e11);
        }
    }
}
