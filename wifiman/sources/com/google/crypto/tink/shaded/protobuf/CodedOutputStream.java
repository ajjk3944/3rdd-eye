package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.m0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.snmp4j.asn1.BER;

/* loaded from: classes3.dex */
public abstract class CodedOutputStream extends AbstractC5080g {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f38431c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f38432d = l0.E();

    /* renamed from: a, reason: collision with root package name */
    C5084k f38433a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f38434b;

    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        OutOfSpaceException(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }
    }

    private static class b extends CodedOutputStream {

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f38435e;

        /* renamed from: f, reason: collision with root package name */
        private final int f38436f;

        /* renamed from: g, reason: collision with root package name */
        private final int f38437g;

        /* renamed from: h, reason: collision with root package name */
        private int f38438h;

        b(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f38435e = bArr;
            this.f38436f = i10;
            this.f38438h = i10;
            this.f38437g = i12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void C0(int i10, String str) throws OutOfSpaceException {
            D0(i10, 2);
            M0(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void D0(int i10, int i11) throws OutOfSpaceException {
            F0(n0.c(i10, i11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void E0(int i10, int i11) throws OutOfSpaceException {
            D0(i10, 0);
            F0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void F0(int i10) throws OutOfSpaceException {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f38435e;
                    int i11 = this.f38438h;
                    this.f38438h = i11 + 1;
                    bArr[i11] = (byte) ((i10 & BER.MAX_OID_LENGTH) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f38438h), Integer.valueOf(this.f38437g), 1), e10);
                }
            }
            byte[] bArr2 = this.f38435e;
            int i12 = this.f38438h;
            this.f38438h = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void G0(int i10, long j10) throws OutOfSpaceException {
            D0(i10, 0);
            H0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void H0(long j10) throws OutOfSpaceException {
            if (CodedOutputStream.f38432d && W() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f38435e;
                    int i10 = this.f38438h;
                    this.f38438h = i10 + 1;
                    l0.K(bArr, i10, (byte) ((((int) j10) & BER.MAX_OID_LENGTH) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f38435e;
                int i11 = this.f38438h;
                this.f38438h = i11 + 1;
                l0.K(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f38435e;
                    int i12 = this.f38438h;
                    this.f38438h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & BER.MAX_OID_LENGTH) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f38438h), Integer.valueOf(this.f38437g), 1), e10);
                }
            }
            byte[] bArr4 = this.f38435e;
            int i13 = this.f38438h;
            this.f38438h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        public final void I0(byte[] bArr, int i10, int i11) throws OutOfSpaceException {
            try {
                System.arraycopy(bArr, i10, this.f38435e, this.f38438h, i11);
                this.f38438h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f38438h), Integer.valueOf(this.f38437g), Integer.valueOf(i11)), e10);
            }
        }

        public final void J0(AbstractC5081h abstractC5081h) throws OutOfSpaceException {
            F0(abstractC5081h.size());
            abstractC5081h.b1(this);
        }

        public final void K0(int i10, M m10) throws OutOfSpaceException {
            D0(i10, 2);
            L0(m10);
        }

        public final void L0(M m10) throws OutOfSpaceException {
            F0(m10.d());
            m10.b(this);
        }

        public final void M0(String str) throws OutOfSpaceException {
            int i10 = this.f38438h;
            try {
                int iN = CodedOutputStream.N(str.length() * 3);
                int iN2 = CodedOutputStream.N(str.length());
                if (iN2 == iN) {
                    int i11 = i10 + iN2;
                    this.f38438h = i11;
                    int iF = m0.f(str, this.f38435e, i11, W());
                    this.f38438h = i10;
                    F0((iF - i10) - iN2);
                    this.f38438h = iF;
                } else {
                    F0(m0.g(str));
                    this.f38438h = m0.f(str, this.f38435e, this.f38438h, W());
                }
            } catch (m0.d e10) {
                this.f38438h = i10;
                S(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int W() {
            return this.f38437g - this.f38438h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void X(byte b10) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f38435e;
                int i10 = this.f38438h;
                this.f38438h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f38438h), Integer.valueOf(this.f38437g), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void Y(int i10, boolean z10) throws OutOfSpaceException {
            D0(i10, 0);
            X(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.AbstractC5080g
        public final void a(byte[] bArr, int i10, int i11) throws OutOfSpaceException {
            I0(bArr, i10, i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void a0(int i10, AbstractC5081h abstractC5081h) throws OutOfSpaceException {
            D0(i10, 2);
            J0(abstractC5081h);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void f0(int i10, int i11) throws OutOfSpaceException {
            D0(i10, 5);
            g0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void g0(int i10) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f38435e;
                int i11 = this.f38438h;
                int i12 = i11 + 1;
                this.f38438h = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f38438h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f38438h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f38438h = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f38438h), Integer.valueOf(this.f38437g), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void h0(int i10, long j10) throws OutOfSpaceException {
            D0(i10, 1);
            i0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void i0(long j10) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f38435e;
                int i10 = this.f38438h;
                int i11 = i10 + 1;
                this.f38438h = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i10 + 2;
                this.f38438h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i10 + 3;
                this.f38438h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i10 + 4;
                this.f38438h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i10 + 5;
                this.f38438h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i10 + 6;
                this.f38438h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i10 + 7;
                this.f38438h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f38438h = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f38438h), Integer.valueOf(this.f38437g), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void n0(int i10, int i11) throws OutOfSpaceException {
            D0(i10, 0);
            o0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void o0(int i10) throws OutOfSpaceException {
            if (i10 >= 0) {
                F0(i10);
            } else {
                H0(i10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        final void r0(int i10, M m10, c0 c0Var) throws OutOfSpaceException {
            D0(i10, 2);
            F0(((AbstractC5074a) m10).a(c0Var));
            c0Var.i(m10, this.f38433a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void s0(int i10, M m10) throws OutOfSpaceException {
            D0(1, 3);
            E0(2, i10);
            K0(3, m10);
            D0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void t0(int i10, AbstractC5081h abstractC5081h) throws OutOfSpaceException {
            D0(1, 3);
            E0(2, i10);
            a0(3, abstractC5081h);
            D0(1, 4);
        }
    }

    public static int A(int i10, AbstractC5081h abstractC5081h) {
        return (L(1) * 2) + M(2, i10) + f(3, abstractC5081h);
    }

    public static int B(int i10, int i11) {
        return L(i10) + C(i11);
    }

    public static int C(int i10) {
        return 4;
    }

    public static int D(int i10, long j10) {
        return L(i10) + E(j10);
    }

    public static int E(long j10) {
        return 8;
    }

    public static int F(int i10, int i11) {
        return L(i10) + G(i11);
    }

    public static int G(int i10) {
        return N(Q(i10));
    }

    public static int H(int i10, long j10) {
        return L(i10) + I(j10);
    }

    public static int I(long j10) {
        return P(R(j10));
    }

    public static int J(int i10, String str) {
        return L(i10) + K(str);
    }

    public static int K(String str) {
        int length;
        try {
            length = m0.g(str);
        } catch (m0.d unused) {
            length = str.getBytes(AbstractC5097y.f38598b).length;
        }
        return x(length);
    }

    public static int L(int i10) {
        return N(n0.c(i10, 0));
    }

    public static int M(int i10, int i11) {
        return L(i10) + N(i11);
    }

    public static int N(int i10) {
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

    public static int O(int i10, long j10) {
        return L(i10) + P(j10);
    }

    public static int P(long j10) {
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

    public static int Q(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long R(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static CodedOutputStream U(byte[] bArr) {
        return V(bArr, 0, bArr.length);
    }

    public static CodedOutputStream V(byte[] bArr, int i10, int i11) {
        return new b(bArr, i10, i11);
    }

    public static int d(int i10, boolean z10) {
        return L(i10) + e(z10);
    }

    public static int e(boolean z10) {
        return 1;
    }

    public static int f(int i10, AbstractC5081h abstractC5081h) {
        return L(i10) + g(abstractC5081h);
    }

    public static int g(AbstractC5081h abstractC5081h) {
        return x(abstractC5081h.size());
    }

    public static int h(int i10, double d10) {
        return L(i10) + i(d10);
    }

    public static int i(double d10) {
        return 8;
    }

    public static int j(int i10, int i11) {
        return L(i10) + k(i11);
    }

    public static int k(int i10) {
        return u(i10);
    }

    public static int l(int i10, int i11) {
        return L(i10) + m(i11);
    }

    public static int m(int i10) {
        return 4;
    }

    public static int n(int i10, long j10) {
        return L(i10) + o(j10);
    }

    public static int o(long j10) {
        return 8;
    }

    public static int p(int i10, float f10) {
        return L(i10) + q(f10);
    }

    public static int q(float f10) {
        return 4;
    }

    static int r(int i10, M m10, c0 c0Var) {
        return (L(i10) * 2) + s(m10, c0Var);
    }

    static int s(M m10, c0 c0Var) {
        return ((AbstractC5074a) m10).a(c0Var);
    }

    public static int t(int i10, int i11) {
        return L(i10) + u(i11);
    }

    public static int u(int i10) {
        if (i10 >= 0) {
            return N(i10);
        }
        return 10;
    }

    public static int v(int i10, long j10) {
        return L(i10) + w(j10);
    }

    public static int w(long j10) {
        return P(j10);
    }

    static int x(int i10) {
        return N(i10) + i10;
    }

    static int y(int i10, M m10, c0 c0Var) {
        return L(i10) + z(m10, c0Var);
    }

    static int z(M m10, c0 c0Var) {
        return x(((AbstractC5074a) m10).a(c0Var));
    }

    public final void A0(int i10, long j10) {
        G0(i10, R(j10));
    }

    public final void B0(long j10) {
        H0(R(j10));
    }

    public abstract void C0(int i10, String str);

    public abstract void D0(int i10, int i11);

    public abstract void E0(int i10, int i11);

    public abstract void F0(int i10);

    public abstract void G0(int i10, long j10);

    public abstract void H0(long j10);

    final void S(String str, m0.d dVar) throws OutOfSpaceException {
        f38431c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC5097y.f38598b);
        try {
            F0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new OutOfSpaceException(e10);
        }
    }

    boolean T() {
        return this.f38434b;
    }

    public abstract int W();

    public abstract void X(byte b10);

    public abstract void Y(int i10, boolean z10);

    public final void Z(boolean z10) {
        X(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5080g
    public abstract void a(byte[] bArr, int i10, int i11);

    public abstract void a0(int i10, AbstractC5081h abstractC5081h);

    public final void b0(int i10, double d10) {
        h0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void c() {
        if (W() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void c0(double d10) {
        i0(Double.doubleToRawLongBits(d10));
    }

    public final void d0(int i10, int i11) {
        n0(i10, i11);
    }

    public final void e0(int i10) {
        o0(i10);
    }

    public abstract void f0(int i10, int i11);

    public abstract void g0(int i10);

    public abstract void h0(int i10, long j10);

    public abstract void i0(long j10);

    public final void j0(int i10, float f10) {
        f0(i10, Float.floatToRawIntBits(f10));
    }

    public final void k0(float f10) {
        g0(Float.floatToRawIntBits(f10));
    }

    final void l0(int i10, M m10, c0 c0Var) {
        D0(i10, 3);
        m0(m10, c0Var);
        D0(i10, 4);
    }

    final void m0(M m10, c0 c0Var) {
        c0Var.i(m10, this.f38433a);
    }

    public abstract void n0(int i10, int i11);

    public abstract void o0(int i10);

    public final void p0(int i10, long j10) {
        G0(i10, j10);
    }

    public final void q0(long j10) {
        H0(j10);
    }

    abstract void r0(int i10, M m10, c0 c0Var);

    public abstract void s0(int i10, M m10);

    public abstract void t0(int i10, AbstractC5081h abstractC5081h);

    public final void u0(int i10, int i11) {
        f0(i10, i11);
    }

    public final void v0(int i10) {
        g0(i10);
    }

    public final void w0(int i10, long j10) {
        h0(i10, j10);
    }

    public final void x0(long j10) {
        i0(j10);
    }

    public final void y0(int i10, int i11) {
        E0(i10, Q(i11));
    }

    public final void z0(int i10) {
        F0(Q(i10));
    }

    private CodedOutputStream() {
    }
}
