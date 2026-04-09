package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q5 extends l0 {
    public static final Logger g = Logger.getLogger(q5.class.getName());

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f19494h = b7.f19282e;

    /* renamed from: b, reason: collision with root package name */
    public e6 f19495b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f19496c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19497d;

    /* renamed from: e, reason: collision with root package name */
    public int f19498e;

    /* renamed from: f, reason: collision with root package name */
    public final OutputStream f19499f;

    public q5(OutputStream outputStream, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i4, 20);
        this.f19496c = new byte[iMax];
        this.f19497d = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f19499f = outputStream;
    }

    public static int h(String str) {
        int length;
        try {
            length = d7.b(str);
        } catch (c7 unused) {
            length = str.getBytes(a6.f19264a).length;
        }
        return i(length) + length;
    }

    public static int i(int i4) {
        return (352 - (Integer.numberOfLeadingZeros(i4) * 9)) >>> 6;
    }

    public static int j(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void A(int i4) {
        l(5);
        o(i4);
    }

    public final void B(int i4, long j) throws IOException {
        l(20);
        o(i4 << 3);
        p(j);
    }

    public final void C(long j) throws IOException {
        l(10);
        p(j);
    }

    public final void D(int i4, byte[] bArr) throws IOException {
        int i10 = this.f19498e;
        int i11 = this.f19497d;
        int i12 = i11 - i10;
        byte[] bArr2 = this.f19496c;
        if (i12 >= i4) {
            System.arraycopy(bArr, 0, bArr2, i10, i4);
            this.f19498e += i4;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i10, i12);
        this.f19498e = i11;
        k();
        int i13 = i4 - i12;
        if (i13 > i11) {
            this.f19499f.write(bArr, i12, i13);
        } else {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.f19498e = i13;
        }
    }

    public final void k() throws IOException {
        this.f19499f.write(this.f19496c, 0, this.f19498e);
        this.f19498e = 0;
    }

    public final void l(int i4) throws IOException {
        if (this.f19497d - this.f19498e < i4) {
            k();
        }
    }

    public final void m(int i4) {
        int i10 = this.f19498e;
        byte[] bArr = this.f19496c;
        bArr[i10] = (byte) i4;
        bArr[i10 + 1] = (byte) (i4 >> 8);
        bArr[i10 + 2] = (byte) (i4 >> 16);
        bArr[i10 + 3] = (byte) (i4 >> 24);
        this.f19498e = i10 + 4;
    }

    public final void n(long j) {
        int i4 = this.f19498e;
        byte[] bArr = this.f19496c;
        bArr[i4] = (byte) j;
        bArr[i4 + 1] = (byte) (j >> 8);
        bArr[i4 + 2] = (byte) (j >> 16);
        bArr[i4 + 3] = (byte) (j >> 24);
        bArr[i4 + 4] = (byte) (j >> 32);
        bArr[i4 + 5] = (byte) (j >> 40);
        bArr[i4 + 6] = (byte) (j >> 48);
        bArr[i4 + 7] = (byte) (j >> 56);
        this.f19498e = i4 + 8;
    }

    public final void o(int i4) {
        boolean z3 = f19494h;
        byte[] bArr = this.f19496c;
        if (!z3) {
            while ((i4 & (-128)) != 0) {
                int i10 = this.f19498e;
                this.f19498e = i10 + 1;
                bArr[i10] = (byte) (i4 | 128);
                i4 >>>= 7;
            }
            int i11 = this.f19498e;
            this.f19498e = i11 + 1;
            bArr[i11] = (byte) i4;
            return;
        }
        while ((i4 & (-128)) != 0) {
            int i12 = this.f19498e;
            this.f19498e = i12 + 1;
            b7.f19280c.d(bArr, b7.f19283f + i12, (byte) (i4 | 128));
            i4 >>>= 7;
        }
        int i13 = this.f19498e;
        this.f19498e = i13 + 1;
        b7.f19280c.d(bArr, b7.f19283f + i13, (byte) i4);
    }

    public final void p(long j) {
        boolean z3 = f19494h;
        byte[] bArr = this.f19496c;
        if (z3) {
            while (true) {
                int i4 = (int) j;
                if ((j & (-128)) == 0) {
                    int i10 = this.f19498e;
                    this.f19498e = i10 + 1;
                    b7.f19280c.d(bArr, b7.f19283f + i10, (byte) i4);
                    return;
                }
                int i11 = this.f19498e;
                this.f19498e = i11 + 1;
                b7.f19280c.d(bArr, b7.f19283f + i11, (byte) (i4 | 128));
                j >>>= 7;
            }
        } else {
            while (true) {
                int i12 = (int) j;
                if ((j & (-128)) == 0) {
                    int i13 = this.f19498e;
                    this.f19498e = i13 + 1;
                    bArr[i13] = (byte) i12;
                    return;
                } else {
                    int i14 = this.f19498e;
                    this.f19498e = i14 + 1;
                    bArr[i14] = (byte) (i12 | 128);
                    j >>>= 7;
                }
            }
        }
    }

    public final void q(p5 p5Var) throws IOException {
        A(p5Var.d());
        D(p5Var.d(), p5Var.f19464b);
    }

    public final void r(int i4, int i10) throws IOException {
        l(14);
        o((i4 << 3) | 5);
        m(i10);
    }

    public final void s(int i4) throws IOException {
        l(4);
        m(i4);
    }

    public final void t(int i4, long j) throws IOException {
        l(18);
        o((i4 << 3) | 1);
        n(j);
    }

    public final void u(long j) throws IOException {
        l(8);
        n(j);
    }

    public final void v(int i4, int i10) throws IOException {
        l(20);
        o(i4 << 3);
        if (i10 >= 0) {
            o(i10);
        } else {
            p(i10);
        }
    }

    public final void w(int i4) throws IOException {
        if (i4 >= 0) {
            A(i4);
        } else {
            C(i4);
        }
    }

    public final void x(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int i4 = i(length);
            int i10 = i4 + length;
            int i11 = this.f19497d;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iA = d7.a(str, bArr, 0, length);
                A(iA);
                D(iA, bArr);
                return;
            }
            if (i10 > i11 - this.f19498e) {
                k();
            }
            int i12 = i(str.length());
            int i13 = this.f19498e;
            byte[] bArr2 = this.f19496c;
            try {
                if (i12 == i4) {
                    int i14 = i13 + i12;
                    this.f19498e = i14;
                    int iA2 = d7.a(str, bArr2, i14, i11 - i14);
                    this.f19498e = i13;
                    o((iA2 - i13) - i12);
                    this.f19498e = iA2;
                } else {
                    int iB = d7.b(str);
                    o(iB);
                    this.f19498e = d7.a(str, bArr2, this.f19498e, iB);
                }
            } catch (c7 e2) {
                this.f19498e = i13;
                throw e2;
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new androidx.datastore.preferences.protobuf.l(e10);
            }
        } catch (c7 e11) {
            g.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e11);
            byte[] bytes = str.getBytes(a6.f19264a);
            try {
                int length2 = bytes.length;
                A(length2);
                D(length2, bytes);
            } catch (IndexOutOfBoundsException e12) {
                throw new androidx.datastore.preferences.protobuf.l(e12);
            }
        }
    }

    public final void y(int i4, int i10) {
        A((i4 << 3) | i10);
    }

    public final void z(int i4, int i10) throws IOException {
        l(20);
        o(i4 << 3);
        o(i10);
    }
}
