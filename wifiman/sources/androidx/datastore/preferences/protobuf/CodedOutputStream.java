package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.n0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.snmp4j.asn1.BER;

/* loaded from: classes.dex */
public abstract class CodedOutputStream extends AbstractC3970f {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f30769c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f30770d = m0.C();

    /* renamed from: a, reason: collision with root package name */
    C3974j f30771a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f30772b;

    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }
    }

    private static abstract class b extends CodedOutputStream {

        /* renamed from: e, reason: collision with root package name */
        final byte[] f30773e;

        /* renamed from: f, reason: collision with root package name */
        final int f30774f;

        /* renamed from: g, reason: collision with root package name */
        int f30775g;

        /* renamed from: h, reason: collision with root package name */
        int f30776h;

        b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f30773e = bArr;
            this.f30774f = bArr.length;
        }

        final void S0(byte b10) {
            byte[] bArr = this.f30773e;
            int i10 = this.f30775g;
            this.f30775g = i10 + 1;
            bArr[i10] = b10;
            this.f30776h++;
        }

        final void T0(int i10) {
            byte[] bArr = this.f30773e;
            int i11 = this.f30775g;
            int i12 = i11 + 1;
            this.f30775g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f30775g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f30775g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f30775g = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f30776h += 4;
        }

        final void U0(long j10) {
            byte[] bArr = this.f30773e;
            int i10 = this.f30775g;
            int i11 = i10 + 1;
            this.f30775g = i11;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i10 + 2;
            this.f30775g = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i10 + 3;
            this.f30775g = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i10 + 4;
            this.f30775g = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i10 + 5;
            this.f30775g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f30775g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f30775g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f30775g = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f30776h += 8;
        }

        final void V0(int i10) {
            if (i10 >= 0) {
                X0(i10);
            } else {
                Y0(i10);
            }
        }

        final void W0(int i10, int i11) {
            X0(o0.c(i10, i11));
        }

        final void X0(int i10) {
            if (!CodedOutputStream.f30770d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f30773e;
                    int i11 = this.f30775g;
                    this.f30775g = i11 + 1;
                    bArr[i11] = (byte) ((i10 & BER.MAX_OID_LENGTH) | 128);
                    this.f30776h++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f30773e;
                int i12 = this.f30775g;
                this.f30775g = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f30776h++;
                return;
            }
            long j10 = this.f30775g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f30773e;
                int i13 = this.f30775g;
                this.f30775g = i13 + 1;
                m0.H(bArr3, i13, (byte) ((i10 & BER.MAX_OID_LENGTH) | 128));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f30773e;
            int i14 = this.f30775g;
            this.f30775g = i14 + 1;
            m0.H(bArr4, i14, (byte) i10);
            this.f30776h += (int) (this.f30775g - j10);
        }

        final void Y0(long j10) {
            if (!CodedOutputStream.f30770d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f30773e;
                    int i10 = this.f30775g;
                    this.f30775g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & BER.MAX_OID_LENGTH) | 128);
                    this.f30776h++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f30773e;
                int i11 = this.f30775g;
                this.f30775g = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f30776h++;
                return;
            }
            long j11 = this.f30775g;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f30773e;
                int i12 = this.f30775g;
                this.f30775g = i12 + 1;
                m0.H(bArr3, i12, (byte) ((((int) j10) & BER.MAX_OID_LENGTH) | 128));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f30773e;
            int i13 = this.f30775g;
            this.f30775g = i13 + 1;
            m0.H(bArr4, i13, (byte) j10);
            this.f30776h += (int) (this.f30775g - j11);
        }
    }

    private static final class c extends b {

        /* renamed from: i, reason: collision with root package name */
        private final OutputStream f30777i;

        c(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f30777i = outputStream;
        }

        private void Z0() throws IOException {
            this.f30777i.write(this.f30773e, 0, this.f30775g);
            this.f30775g = 0;
        }

        private void a1(int i10) throws IOException {
            if (this.f30774f - this.f30775g < i10) {
                Z0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void A0(M m10) throws IOException {
            P0(m10.d());
            m10.m(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void B0(int i10, M m10) throws IOException {
            N0(1, 3);
            O0(2, i10);
            c1(3, m10);
            N0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void C0(int i10, AbstractC3971g abstractC3971g) throws IOException {
            N0(1, 3);
            O0(2, i10);
            f0(3, abstractC3971g);
            N0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void L0(int i10, String str) throws IOException {
            N0(i10, 2);
            M0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void M0(String str) throws IOException {
            int iG;
            try {
                int length = str.length() * 3;
                int iR = CodedOutputStream.R(length);
                int i10 = iR + length;
                int i11 = this.f30774f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int iF = n0.f(str, bArr, 0, length);
                    P0(iF);
                    a(bArr, 0, iF);
                    return;
                }
                if (i10 > i11 - this.f30775g) {
                    Z0();
                }
                int iR2 = CodedOutputStream.R(str.length());
                int i12 = this.f30775g;
                try {
                    if (iR2 == iR) {
                        int i13 = i12 + iR2;
                        this.f30775g = i13;
                        int iF2 = n0.f(str, this.f30773e, i13, this.f30774f - i13);
                        this.f30775g = i12;
                        iG = (iF2 - i12) - iR2;
                        X0(iG);
                        this.f30775g = iF2;
                    } else {
                        iG = n0.g(str);
                        X0(iG);
                        this.f30775g = n0.f(str, this.f30773e, this.f30775g, iG);
                    }
                    this.f30776h += iG;
                } catch (n0.d e10) {
                    this.f30776h -= this.f30775g - i12;
                    this.f30775g = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(e11);
                }
            } catch (n0.d e12) {
                X(str, e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void N0(int i10, int i11) throws IOException {
            P0(o0.c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void O0(int i10, int i11) throws IOException {
            a1(20);
            W0(i10, 0);
            X0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void P0(int i10) throws IOException {
            a1(5);
            X0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Q0(int i10, long j10) throws IOException {
            a1(20);
            W0(i10, 0);
            Y0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void R0(long j10) throws IOException {
            a1(10);
            Y0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void W() throws IOException {
            if (this.f30775g > 0) {
                Z0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.AbstractC3970f
        public void a(byte[] bArr, int i10, int i11) throws IOException {
            b1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void a0(byte b10) throws IOException {
            if (this.f30775g == this.f30774f) {
                Z0();
            }
            S0(b10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void b0(int i10, boolean z10) throws IOException {
            a1(11);
            W0(i10, 0);
            S0(z10 ? (byte) 1 : (byte) 0);
        }

        public void b1(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f30774f;
            int i13 = this.f30775g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f30773e, i13, i11);
                this.f30775g += i11;
                this.f30776h += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f30773e, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f30775g = this.f30774f;
            this.f30776h += i14;
            Z0();
            if (i16 <= this.f30774f) {
                System.arraycopy(bArr, i15, this.f30773e, 0, i16);
                this.f30775g = i16;
            } else {
                this.f30777i.write(bArr, i15, i16);
            }
            this.f30776h += i16;
        }

        public void c1(int i10, M m10) throws IOException {
            N0(i10, 2);
            A0(m10);
        }

        void d1(M m10, c0 c0Var) throws IOException {
            P0(((AbstractC3965a) m10).e(c0Var));
            c0Var.i(m10, this.f30771a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void e0(byte[] bArr, int i10, int i11) throws IOException {
            P0(i11);
            b1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void f0(int i10, AbstractC3971g abstractC3971g) throws IOException {
            N0(i10, 2);
            g0(abstractC3971g);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void g0(AbstractC3971g abstractC3971g) throws IOException {
            P0(abstractC3971g.size());
            abstractC3971g.W0(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void l0(int i10, int i11) throws IOException {
            a1(14);
            W0(i10, 5);
            T0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void m0(int i10) throws IOException {
            a1(4);
            T0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void n0(int i10, long j10) throws IOException {
            a1(18);
            W0(i10, 1);
            U0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void o0(long j10) throws IOException {
            a1(8);
            U0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void v0(int i10, int i11) throws IOException {
            a1(20);
            W0(i10, 0);
            V0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void w0(int i10) throws IOException {
            if (i10 >= 0) {
                P0(i10);
            } else {
                R0(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void z0(int i10, M m10, c0 c0Var) throws IOException {
            N0(i10, 2);
            d1(m10, c0Var);
        }
    }

    public static int A(M m10) {
        return y(m10.d());
    }

    static int B(M m10, c0 c0Var) {
        return y(((AbstractC3965a) m10).e(c0Var));
    }

    static int C(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int D(int i10, AbstractC3971g abstractC3971g) {
        return (P(1) * 2) + Q(2, i10) + f(3, abstractC3971g);
    }

    public static int E(int i10) {
        return R(i10);
    }

    public static int F(int i10, int i11) {
        return P(i10) + G(i11);
    }

    public static int G(int i10) {
        return 4;
    }

    public static int H(int i10, long j10) {
        return P(i10) + I(j10);
    }

    public static int I(long j10) {
        return 8;
    }

    public static int J(int i10, int i11) {
        return P(i10) + K(i11);
    }

    public static int K(int i10) {
        return R(U(i10));
    }

    public static int L(int i10, long j10) {
        return P(i10) + M(j10);
    }

    public static int M(long j10) {
        return T(V(j10));
    }

    public static int N(int i10, String str) {
        return P(i10) + O(str);
    }

    public static int O(String str) {
        int length;
        try {
            length = n0.g(str);
        } catch (n0.d unused) {
            length = str.getBytes(AbstractC3987x.f30964a).length;
        }
        return y(length);
    }

    public static int P(int i10) {
        return R(o0.c(i10, 0));
    }

    public static int Q(int i10, int i11) {
        return P(i10) + R(i11);
    }

    public static int R(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int S(int i10, long j10) {
        return P(i10) + T(j10);
    }

    public static int T(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int U(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long V(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static CodedOutputStream Z(OutputStream outputStream, int i10) {
        return new c(outputStream, i10);
    }

    public static int c(int i10, boolean z10) {
        return P(i10) + d(z10);
    }

    public static int d(boolean z10) {
        return 1;
    }

    public static int e(byte[] bArr) {
        return y(bArr.length);
    }

    public static int f(int i10, AbstractC3971g abstractC3971g) {
        return P(i10) + g(abstractC3971g);
    }

    public static int g(AbstractC3971g abstractC3971g) {
        return y(abstractC3971g.size());
    }

    public static int h(int i10, double d10) {
        return P(i10) + i(d10);
    }

    public static int i(double d10) {
        return 8;
    }

    public static int j(int i10, int i11) {
        return P(i10) + k(i11);
    }

    public static int k(int i10) {
        return v(i10);
    }

    public static int l(int i10, int i11) {
        return P(i10) + m(i11);
    }

    public static int m(int i10) {
        return 4;
    }

    public static int n(int i10, long j10) {
        return P(i10) + o(j10);
    }

    public static int o(long j10) {
        return 8;
    }

    public static int p(int i10, float f10) {
        return P(i10) + q(f10);
    }

    public static int q(float f10) {
        return 4;
    }

    static int r(int i10, M m10, c0 c0Var) {
        return (P(i10) * 2) + t(m10, c0Var);
    }

    public static int s(M m10) {
        return m10.d();
    }

    static int t(M m10, c0 c0Var) {
        return ((AbstractC3965a) m10).e(c0Var);
    }

    public static int u(int i10, int i11) {
        return P(i10) + v(i11);
    }

    public static int v(int i10) {
        if (i10 >= 0) {
            return R(i10);
        }
        return 10;
    }

    public static int w(int i10, long j10) {
        return P(i10) + x(j10);
    }

    public static int x(long j10) {
        return T(j10);
    }

    static int y(int i10) {
        return R(i10) + i10;
    }

    static int z(int i10, M m10, c0 c0Var) {
        return P(i10) + B(m10, c0Var);
    }

    public abstract void A0(M m10);

    public abstract void B0(int i10, M m10);

    public abstract void C0(int i10, AbstractC3971g abstractC3971g);

    public final void D0(int i10, int i11) {
        l0(i10, i11);
    }

    public final void E0(int i10) {
        m0(i10);
    }

    public final void F0(int i10, long j10) {
        n0(i10, j10);
    }

    public final void G0(long j10) {
        o0(j10);
    }

    public final void H0(int i10, int i11) {
        O0(i10, U(i11));
    }

    public final void I0(int i10) {
        P0(U(i10));
    }

    public final void J0(int i10, long j10) {
        Q0(i10, V(j10));
    }

    public final void K0(long j10) {
        R0(V(j10));
    }

    public abstract void L0(int i10, String str);

    public abstract void M0(String str);

    public abstract void N0(int i10, int i11);

    public abstract void O0(int i10, int i11);

    public abstract void P0(int i10);

    public abstract void Q0(int i10, long j10);

    public abstract void R0(long j10);

    public abstract void W();

    final void X(String str, n0.d dVar) throws OutOfSpaceException {
        f30769c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC3987x.f30964a);
        try {
            P0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new OutOfSpaceException(e11);
        }
    }

    boolean Y() {
        return this.f30772b;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3970f
    public abstract void a(byte[] bArr, int i10, int i11);

    public abstract void a0(byte b10);

    public abstract void b0(int i10, boolean z10);

    public final void c0(boolean z10) {
        a0(z10 ? (byte) 1 : (byte) 0);
    }

    public final void d0(byte[] bArr) {
        e0(bArr, 0, bArr.length);
    }

    abstract void e0(byte[] bArr, int i10, int i11);

    public abstract void f0(int i10, AbstractC3971g abstractC3971g);

    public abstract void g0(AbstractC3971g abstractC3971g);

    public final void h0(int i10, double d10) {
        n0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void i0(double d10) {
        o0(Double.doubleToRawLongBits(d10));
    }

    public final void j0(int i10, int i11) {
        v0(i10, i11);
    }

    public final void k0(int i10) {
        w0(i10);
    }

    public abstract void l0(int i10, int i11);

    public abstract void m0(int i10);

    public abstract void n0(int i10, long j10);

    public abstract void o0(long j10);

    public final void p0(int i10, float f10) {
        l0(i10, Float.floatToRawIntBits(f10));
    }

    public final void q0(float f10) {
        m0(Float.floatToRawIntBits(f10));
    }

    public final void r0(int i10, M m10) {
        N0(i10, 3);
        t0(m10);
        N0(i10, 4);
    }

    final void s0(int i10, M m10, c0 c0Var) {
        N0(i10, 3);
        u0(m10, c0Var);
        N0(i10, 4);
    }

    public final void t0(M m10) {
        m10.m(this);
    }

    final void u0(M m10, c0 c0Var) {
        c0Var.i(m10, this.f30771a);
    }

    public abstract void v0(int i10, int i11);

    public abstract void w0(int i10);

    public final void x0(int i10, long j10) {
        Q0(i10, j10);
    }

    public final void y0(long j10) {
        R0(j10);
    }

    abstract void z0(int i10, M m10, c0 c0Var);

    private CodedOutputStream() {
    }
}
