package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class n extends dr.a {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f1320f = Logger.getLogger(n.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f1321g = q1.f1341e;

    /* renamed from: a, reason: collision with root package name */
    public l0 f1322a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1323b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1324c;

    /* renamed from: d, reason: collision with root package name */
    public int f1325d;

    /* renamed from: e, reason: collision with root package name */
    public final d4.h1 f1326e;

    public n(d4.h1 h1Var, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i10, 20);
        this.f1323b = new byte[iMax];
        this.f1324c = iMax;
        this.f1326e = h1Var;
    }

    public static int T(int i10, g gVar) {
        int iV = V(i10);
        int size = gVar.size();
        return W(size) + size + iV;
    }

    public static int U(String str) {
        int length;
        try {
            length = t1.a(str);
        } catch (s1 unused) {
            length = str.getBytes(c0.f1253a).length;
        }
        return W(length) + length;
    }

    public static int V(int i10) {
        return W(i10 << 3);
    }

    public static int W(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int X(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    @Override // dr.a
    public final void L(byte[] bArr, int i10, int i11) throws IOException {
        b0(bArr, i10, i11);
    }

    public final void O(int i10) {
        int i11 = this.f1325d;
        int i12 = i11 + 1;
        this.f1325d = i12;
        byte[] bArr = this.f1323b;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i11 + 2;
        this.f1325d = i13;
        bArr[i12] = (byte) ((i10 >> 8) & 255);
        int i14 = i11 + 3;
        this.f1325d = i14;
        bArr[i13] = (byte) ((i10 >> 16) & 255);
        this.f1325d = i11 + 4;
        bArr[i14] = (byte) ((i10 >> 24) & 255);
    }

    public final void P(long j) {
        int i10 = this.f1325d;
        int i11 = i10 + 1;
        this.f1325d = i11;
        byte[] bArr = this.f1323b;
        bArr[i10] = (byte) (j & 255);
        int i12 = i10 + 2;
        this.f1325d = i12;
        bArr[i11] = (byte) ((j >> 8) & 255);
        int i13 = i10 + 3;
        this.f1325d = i13;
        bArr[i12] = (byte) ((j >> 16) & 255);
        int i14 = i10 + 4;
        this.f1325d = i14;
        bArr[i13] = (byte) (255 & (j >> 24));
        int i15 = i10 + 5;
        this.f1325d = i15;
        bArr[i14] = (byte) (((int) (j >> 32)) & 255);
        int i16 = i10 + 6;
        this.f1325d = i16;
        bArr[i15] = (byte) (((int) (j >> 40)) & 255);
        int i17 = i10 + 7;
        this.f1325d = i17;
        bArr[i16] = (byte) (((int) (j >> 48)) & 255);
        this.f1325d = i10 + 8;
        bArr[i17] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void Q(int i10, int i11) {
        R((i10 << 3) | i11);
    }

    public final void R(int i10) {
        boolean z10 = f1321g;
        byte[] bArr = this.f1323b;
        if (z10) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f1325d;
                this.f1325d = i11 + 1;
                q1.j(bArr, i11, (byte) ((i10 | 128) & 255));
                i10 >>>= 7;
            }
            int i12 = this.f1325d;
            this.f1325d = i12 + 1;
            q1.j(bArr, i12, (byte) i10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.f1325d;
            this.f1325d = i13 + 1;
            bArr[i13] = (byte) ((i10 | 128) & 255);
            i10 >>>= 7;
        }
        int i14 = this.f1325d;
        this.f1325d = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    public final void S(long j) {
        boolean z10 = f1321g;
        byte[] bArr = this.f1323b;
        if (z10) {
            while ((j & (-128)) != 0) {
                int i10 = this.f1325d;
                this.f1325d = i10 + 1;
                q1.j(bArr, i10, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            int i11 = this.f1325d;
            this.f1325d = i11 + 1;
            q1.j(bArr, i11, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i12 = this.f1325d;
            this.f1325d = i12 + 1;
            bArr[i12] = (byte) ((((int) j) | 128) & 255);
            j >>>= 7;
        }
        int i13 = this.f1325d;
        this.f1325d = i13 + 1;
        bArr[i13] = (byte) j;
    }

    public final void Y() throws IOException {
        this.f1326e.write(this.f1323b, 0, this.f1325d);
        this.f1325d = 0;
    }

    public final void Z(int i10) throws IOException {
        if (this.f1324c - this.f1325d < i10) {
            Y();
        }
    }

    public final void a0(byte b2) throws IOException {
        if (this.f1325d == this.f1324c) {
            Y();
        }
        int i10 = this.f1325d;
        this.f1325d = i10 + 1;
        this.f1323b[i10] = b2;
    }

    public final void b0(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f1325d;
        int i13 = this.f1324c;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f1323b;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f1325d += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f1325d = i13;
        Y();
        if (i16 > i13) {
            this.f1326e.write(bArr, i15, i16);
        } else {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f1325d = i16;
        }
    }

    public final void c0(int i10, boolean z10) throws IOException {
        Z(11);
        Q(i10, 0);
        byte b2 = z10 ? (byte) 1 : (byte) 0;
        int i11 = this.f1325d;
        this.f1325d = i11 + 1;
        this.f1323b[i11] = b2;
    }

    public final void d0(int i10, g gVar) {
        o0(i10, 2);
        e0(gVar);
    }

    public final void e0(g gVar) throws IOException {
        q0(gVar.size());
        L(gVar.f1279d, gVar.e(), gVar.size());
    }

    public final void f0(int i10, int i11) throws IOException {
        Z(14);
        Q(i10, 5);
        O(i11);
    }

    public final void g0(int i10) throws IOException {
        Z(4);
        O(i10);
    }

    public final void h0(int i10, long j) throws IOException {
        Z(18);
        Q(i10, 1);
        P(j);
    }

    public final void i0(long j) throws IOException {
        Z(8);
        P(j);
    }

    public final void j0(int i10, int i11) throws IOException {
        Z(20);
        Q(i10, 0);
        if (i11 >= 0) {
            R(i11);
        } else {
            S(i11);
        }
    }

    public final void k0(int i10) throws IOException {
        if (i10 >= 0) {
            q0(i10);
        } else {
            s0(i10);
        }
    }

    public final void l0(int i10, a aVar, d1 d1Var) throws IOException {
        o0(i10, 2);
        q0(aVar.a(d1Var));
        d1Var.b(aVar, this.f1322a);
    }

    public final void m0(int i10, String str) throws IOException {
        o0(i10, 2);
        n0(str);
    }

    public final void n0(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iW = W(length);
            int i10 = iW + length;
            int i11 = this.f1324c;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iM = t1.f1366a.M(0, length, str, bArr);
                q0(iM);
                b0(bArr, 0, iM);
                return;
            }
            if (i10 > i11 - this.f1325d) {
                Y();
            }
            int iW2 = W(str.length());
            int i12 = this.f1325d;
            byte[] bArr2 = this.f1323b;
            try {
                try {
                    if (iW2 == iW) {
                        int i13 = i12 + iW2;
                        this.f1325d = i13;
                        int iM2 = t1.f1366a.M(i13, i11 - i13, str, bArr2);
                        this.f1325d = i12;
                        R((iM2 - i12) - iW2);
                        this.f1325d = iM2;
                    } else {
                        int iA = t1.a(str);
                        R(iA);
                        this.f1325d = t1.f1366a.M(this.f1325d, iA, str, bArr2);
                    }
                } catch (ArrayIndexOutOfBoundsException e4) {
                    throw new m(e4);
                }
            } catch (s1 e10) {
                this.f1325d = i12;
                throw e10;
            }
        } catch (s1 e11) {
            f1320f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e11);
            byte[] bytes = str.getBytes(c0.f1253a);
            try {
                q0(bytes.length);
                L(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e12) {
                throw new m(e12);
            }
        }
    }

    public final void o0(int i10, int i11) {
        q0((i10 << 3) | i11);
    }

    public final void p0(int i10, int i11) throws IOException {
        Z(20);
        Q(i10, 0);
        R(i11);
    }

    public final void q0(int i10) throws IOException {
        Z(5);
        R(i10);
    }

    public final void r0(int i10, long j) throws IOException {
        Z(20);
        Q(i10, 0);
        S(j);
    }

    public final void s0(long j) throws IOException {
        Z(10);
        S(j);
    }
}
