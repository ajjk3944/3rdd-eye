package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m extends u6.t {

    /* renamed from: o, reason: collision with root package name */
    public static final Logger f1013o = Logger.getLogger(m.class.getName());

    /* renamed from: p, reason: collision with root package name */
    public static final boolean f1014p = k1.f1008e;
    public g0 j;

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f1015k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1016l;

    /* renamed from: m, reason: collision with root package name */
    public int f1017m;

    /* renamed from: n, reason: collision with root package name */
    public final hm.d f1018n;

    public m(hm.d dVar, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i4, 20);
        this.f1015k = new byte[iMax];
        this.f1016l = iMax;
        this.f1018n = dVar;
    }

    public static int J(int i4, g gVar) {
        int iL = L(i4);
        int size = gVar.size();
        return M(size) + size + iL;
    }

    public static int K(String str) {
        int length;
        try {
            length = n1.a(str);
        } catch (m1 unused) {
            length = str.getBytes(y.f1081a).length;
        }
        return M(length) + length;
    }

    public static int L(int i4) {
        return M(i4 << 3);
    }

    public static int M(int i4) {
        return (352 - (Integer.numberOfLeadingZeros(i4) * 9)) >>> 6;
    }

    public static int N(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void E(int i4) {
        int i10 = this.f1017m;
        int i11 = i10 + 1;
        this.f1017m = i11;
        byte[] bArr = this.f1015k;
        bArr[i10] = (byte) (i4 & 255);
        int i12 = i10 + 2;
        this.f1017m = i12;
        bArr[i11] = (byte) ((i4 >> 8) & 255);
        int i13 = i10 + 3;
        this.f1017m = i13;
        bArr[i12] = (byte) ((i4 >> 16) & 255);
        this.f1017m = i10 + 4;
        bArr[i13] = (byte) ((i4 >> 24) & 255);
    }

    public final void F(long j) {
        int i4 = this.f1017m;
        int i10 = i4 + 1;
        this.f1017m = i10;
        byte[] bArr = this.f1015k;
        bArr[i4] = (byte) (j & 255);
        int i11 = i4 + 2;
        this.f1017m = i11;
        bArr[i10] = (byte) ((j >> 8) & 255);
        int i12 = i4 + 3;
        this.f1017m = i12;
        bArr[i11] = (byte) ((j >> 16) & 255);
        int i13 = i4 + 4;
        this.f1017m = i13;
        bArr[i12] = (byte) (255 & (j >> 24));
        int i14 = i4 + 5;
        this.f1017m = i14;
        bArr[i13] = (byte) (((int) (j >> 32)) & 255);
        int i15 = i4 + 6;
        this.f1017m = i15;
        bArr[i14] = (byte) (((int) (j >> 40)) & 255);
        int i16 = i4 + 7;
        this.f1017m = i16;
        bArr[i15] = (byte) (((int) (j >> 48)) & 255);
        this.f1017m = i4 + 8;
        bArr[i16] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void G(int i4, int i10) {
        H((i4 << 3) | i10);
    }

    public final void H(int i4) {
        boolean z3 = f1014p;
        byte[] bArr = this.f1015k;
        if (z3) {
            while ((i4 & (-128)) != 0) {
                int i10 = this.f1017m;
                this.f1017m = i10 + 1;
                k1.j(bArr, i10, (byte) ((i4 | 128) & 255));
                i4 >>>= 7;
            }
            int i11 = this.f1017m;
            this.f1017m = i11 + 1;
            k1.j(bArr, i11, (byte) i4);
            return;
        }
        while ((i4 & (-128)) != 0) {
            int i12 = this.f1017m;
            this.f1017m = i12 + 1;
            bArr[i12] = (byte) ((i4 | 128) & 255);
            i4 >>>= 7;
        }
        int i13 = this.f1017m;
        this.f1017m = i13 + 1;
        bArr[i13] = (byte) i4;
    }

    public final void I(long j) {
        boolean z3 = f1014p;
        byte[] bArr = this.f1015k;
        if (z3) {
            while ((j & (-128)) != 0) {
                int i4 = this.f1017m;
                this.f1017m = i4 + 1;
                k1.j(bArr, i4, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            int i10 = this.f1017m;
            this.f1017m = i10 + 1;
            k1.j(bArr, i10, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i11 = this.f1017m;
            this.f1017m = i11 + 1;
            bArr[i11] = (byte) ((((int) j) | 128) & 255);
            j >>>= 7;
        }
        int i12 = this.f1017m;
        this.f1017m = i12 + 1;
        bArr[i12] = (byte) j;
    }

    public final void O() throws IOException {
        this.f1018n.write(this.f1015k, 0, this.f1017m);
        this.f1017m = 0;
    }

    public final void P(int i4) throws IOException {
        if (this.f1016l - this.f1017m < i4) {
            O();
        }
    }

    public final void Q(byte b10) throws IOException {
        if (this.f1017m == this.f1016l) {
            O();
        }
        int i4 = this.f1017m;
        this.f1017m = i4 + 1;
        this.f1015k[i4] = b10;
    }

    public final void R(byte[] bArr, int i4, int i10) throws IOException {
        int i11 = this.f1017m;
        int i12 = this.f1016l;
        int i13 = i12 - i11;
        byte[] bArr2 = this.f1015k;
        if (i13 >= i10) {
            System.arraycopy(bArr, i4, bArr2, i11, i10);
            this.f1017m += i10;
            return;
        }
        System.arraycopy(bArr, i4, bArr2, i11, i13);
        int i14 = i4 + i13;
        int i15 = i10 - i13;
        this.f1017m = i12;
        O();
        if (i15 > i12) {
            this.f1018n.write(bArr, i14, i15);
        } else {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.f1017m = i15;
        }
    }

    public final void S(int i4, boolean z3) throws IOException {
        P(11);
        G(i4, 0);
        byte b10 = z3 ? (byte) 1 : (byte) 0;
        int i10 = this.f1017m;
        this.f1017m = i10 + 1;
        this.f1015k[i10] = b10;
    }

    public final void T(int i4, g gVar) {
        e0(i4, 2);
        U(gVar);
    }

    public final void U(g gVar) throws IOException {
        g0(gVar.size());
        s(gVar.g(), gVar.size(), gVar.f975b);
    }

    public final void V(int i4, int i10) {
        P(14);
        G(i4, 5);
        E(i10);
    }

    public final void W(int i4) throws IOException {
        P(4);
        E(i4);
    }

    public final void X(int i4, long j) {
        P(18);
        G(i4, 1);
        F(j);
    }

    public final void Y(long j) throws IOException {
        P(8);
        F(j);
    }

    public final void Z(int i4, int i10) throws IOException {
        P(20);
        G(i4, 0);
        if (i10 >= 0) {
            H(i10);
        } else {
            I(i10);
        }
    }

    public final void a0(int i4) throws IOException {
        if (i4 >= 0) {
            g0(i4);
        } else {
            i0(i4);
        }
    }

    public final void b0(int i4, a aVar, x0 x0Var) throws IOException {
        e0(i4, 2);
        g0(aVar.a(x0Var));
        x0Var.b(aVar, this.j);
    }

    public final void c0(int i4, String str) throws IOException {
        e0(i4, 2);
        d0(str);
    }

    public final void d0(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iM = M(length);
            int i4 = iM + length;
            int i10 = this.f1016l;
            if (i4 > i10) {
                byte[] bArr = new byte[length];
                int iJ = n1.f1021a.j(str, bArr, 0, length);
                g0(iJ);
                R(bArr, 0, iJ);
                return;
            }
            if (i4 > i10 - this.f1017m) {
                O();
            }
            int iM2 = M(str.length());
            int i11 = this.f1017m;
            byte[] bArr2 = this.f1015k;
            try {
                try {
                    if (iM2 == iM) {
                        int i12 = i11 + iM2;
                        this.f1017m = i12;
                        int iJ2 = n1.f1021a.j(str, bArr2, i12, i10 - i12);
                        this.f1017m = i11;
                        H((iJ2 - i11) - iM2);
                        this.f1017m = iJ2;
                    } else {
                        int iA = n1.a(str);
                        H(iA);
                        this.f1017m = n1.f1021a.j(str, bArr2, this.f1017m, iA);
                    }
                } catch (m1 e2) {
                    this.f1017m = i11;
                    throw e2;
                }
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new l(e10);
            }
        } catch (m1 e11) {
            f1013o.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e11);
            byte[] bytes = str.getBytes(y.f1081a);
            try {
                g0(bytes.length);
                s(0, bytes.length, bytes);
            } catch (IndexOutOfBoundsException e12) {
                throw new l(e12);
            }
        }
    }

    public final void e0(int i4, int i10) {
        g0((i4 << 3) | i10);
    }

    public final void f0(int i4, int i10) throws IOException {
        P(20);
        G(i4, 0);
        H(i10);
    }

    public final void g0(int i4) throws IOException {
        P(5);
        H(i4);
    }

    public final void h0(int i4, long j) {
        P(20);
        G(i4, 0);
        I(j);
    }

    public final void i0(long j) throws IOException {
        P(10);
        I(j);
    }

    @Override // u6.t
    public final void s(int i4, int i10, byte[] bArr) throws IOException {
        R(bArr, i4, i10);
    }
}
