package com.google.android.gms.internal.measurement;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class z4 extends b4 {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f5280g = Logger.getLogger(z4.class.getName());

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f5281h = s6.f5193e;

    /* renamed from: c, reason: collision with root package name */
    public w5 f5282c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f5283d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5284e;

    /* renamed from: f, reason: collision with root package name */
    public int f5285f;

    public z4(int i10, byte[] bArr) {
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(h0.b.l("Array range is invalid. Buffer.length=", length, i10, ", offset=0, length="));
        }
        this.f5283d = bArr;
        this.f5285f = 0;
        this.f5284e = i10;
    }

    public static int B0(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int k0(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int l0(String str) {
        int length;
        try {
            length = u6.b(str);
        } catch (t6 unused) {
            length = str.getBytes(o5.f5148a).length;
        }
        return B0(length) + length;
    }

    public final void A0(String str) throws androidx.datastore.preferences.protobuf.m {
        int i10 = this.f5285f;
        try {
            int iB0 = B0(str.length() * 3);
            int iB02 = B0(str.length());
            int i11 = this.f5284e;
            byte[] bArr = this.f5283d;
            if (iB02 != iB0) {
                v0(u6.b(str));
                int i12 = this.f5285f;
                this.f5285f = u6.c(i12, i11 - i12, str, bArr);
            } else {
                int i13 = i10 + iB02;
                this.f5285f = i13;
                int iC = u6.c(i13, i11 - i13, str, bArr);
                this.f5285f = i10;
                v0((iC - i10) - iB02);
                this.f5285f = iC;
            }
        } catch (t6 e4) {
            this.f5285f = i10;
            f5280g.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
            byte[] bytes = str.getBytes(o5.f5148a);
            try {
                int length = bytes.length;
                v0(length);
                z0(length, bytes);
            } catch (IndexOutOfBoundsException e10) {
                throw new androidx.datastore.preferences.protobuf.m(e10);
            }
        } catch (IndexOutOfBoundsException e11) {
            throw new androidx.datastore.preferences.protobuf.m(e11);
        }
    }

    public final void m0(int i10, int i11) throws androidx.datastore.preferences.protobuf.m {
        v0((i10 << 3) | i11);
    }

    public final void n0(int i10, int i11) throws androidx.datastore.preferences.protobuf.m {
        v0(i10 << 3);
        u0(i11);
    }

    public final void o0(int i10, int i11) throws androidx.datastore.preferences.protobuf.m {
        v0(i10 << 3);
        v0(i11);
    }

    public final void p0(int i10, int i11) throws androidx.datastore.preferences.protobuf.m {
        v0((i10 << 3) | 5);
        w0(i11);
    }

    public final void q0(int i10, long j) throws androidx.datastore.preferences.protobuf.m {
        v0(i10 << 3);
        x0(j);
    }

    public final void r0(int i10, long j) throws androidx.datastore.preferences.protobuf.m {
        v0((i10 << 3) | 1);
        y0(j);
    }

    public final void s0(y4 y4Var) throws androidx.datastore.preferences.protobuf.m {
        v0(y4Var.c());
        z0(y4Var.c(), y4Var.f5270d);
    }

    public final void t0(byte b2) throws androidx.datastore.preferences.protobuf.m {
        int i10;
        int i11 = this.f5285f;
        try {
            i10 = i11 + 1;
        } catch (IndexOutOfBoundsException e4) {
            e = e4;
        }
        try {
            this.f5283d[i11] = b2;
            this.f5285f = i10;
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            i11 = i10;
            throw new androidx.datastore.preferences.protobuf.m(i11, this.f5284e, 1, e);
        }
    }

    public final void u0(int i10) throws androidx.datastore.preferences.protobuf.m {
        if (i10 >= 0) {
            v0(i10);
        } else {
            x0(i10);
        }
    }

    public final void v0(int i10) throws androidx.datastore.preferences.protobuf.m {
        int i11;
        int i12 = this.f5285f;
        while (true) {
            int i13 = i10 & (-128);
            byte[] bArr = this.f5283d;
            if (i13 == 0) {
                i11 = i12 + 1;
                bArr[i12] = (byte) i10;
                this.f5285f = i11;
                return;
            } else {
                i11 = i12 + 1;
                try {
                    bArr[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e4) {
                    throw new androidx.datastore.preferences.protobuf.m(i11, this.f5284e, 1, e4);
                }
            }
            throw new androidx.datastore.preferences.protobuf.m(i11, this.f5284e, 1, e4);
        }
    }

    public final void w0(int i10) throws androidx.datastore.preferences.protobuf.m {
        int i11 = this.f5285f;
        try {
            byte[] bArr = this.f5283d;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f5285f = i11 + 4;
        } catch (IndexOutOfBoundsException e4) {
            throw new androidx.datastore.preferences.protobuf.m(i11, this.f5284e, 4, e4);
        }
    }

    public final void x0(long j) throws androidx.datastore.preferences.protobuf.m {
        int i10;
        int i11 = this.f5285f;
        int i12 = this.f5284e;
        byte[] bArr = this.f5283d;
        if (!f5281h || i12 - i11 < 10) {
            long j7 = j;
            while ((j7 & (-128)) != 0) {
                int i13 = i11 + 1;
                try {
                    bArr[i11] = (byte) (((int) j7) | 128);
                    j7 >>>= 7;
                    i11 = i13;
                } catch (IndexOutOfBoundsException e4) {
                    e = e4;
                    i10 = i13;
                    throw new androidx.datastore.preferences.protobuf.m(i10, i12, 1, e);
                }
            }
            i10 = i11 + 1;
            try {
                bArr[i11] = (byte) j7;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                throw new androidx.datastore.preferences.protobuf.m(i10, i12, 1, e);
            }
        } else {
            long j10 = j;
            while ((j10 & (-128)) != 0) {
                s6.f5191c.a(bArr, s6.f5194f + i11, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            s6.f5191c.a(bArr, s6.f5194f + i11, (byte) j10);
        }
        this.f5285f = i10;
    }

    public final void y0(long j) throws androidx.datastore.preferences.protobuf.m {
        int i10 = this.f5285f;
        try {
            byte[] bArr = this.f5283d;
            bArr[i10] = (byte) j;
            bArr[i10 + 1] = (byte) (j >> 8);
            bArr[i10 + 2] = (byte) (j >> 16);
            bArr[i10 + 3] = (byte) (j >> 24);
            bArr[i10 + 4] = (byte) (j >> 32);
            bArr[i10 + 5] = (byte) (j >> 40);
            bArr[i10 + 6] = (byte) (j >> 48);
            bArr[i10 + 7] = (byte) (j >> 56);
            this.f5285f = i10 + 8;
        } catch (IndexOutOfBoundsException e4) {
            throw new androidx.datastore.preferences.protobuf.m(i10, this.f5284e, 8, e4);
        }
    }

    public final void z0(int i10, byte[] bArr) throws androidx.datastore.preferences.protobuf.m {
        try {
            System.arraycopy(bArr, 0, this.f5283d, this.f5285f, i10);
            this.f5285f += i10;
        } catch (IndexOutOfBoundsException e4) {
            throw new androidx.datastore.preferences.protobuf.m(this.f5285f, this.f5284e, i10, e4);
        }
    }
}
