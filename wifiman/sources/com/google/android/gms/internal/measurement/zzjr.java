package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzjr extends X3 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f35548b = Logger.getLogger(zzjr.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f35549c = N5.w();

    /* renamed from: a, reason: collision with root package name */
    C4423o4 f35550a;

    private static class a extends zzjr {

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f35551d;

        /* renamed from: e, reason: collision with root package name */
        private final int f35552e;

        /* renamed from: f, reason: collision with root package name */
        private int f35553f;

        a(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i11) | i11) < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i11)));
            }
            this.f35551d = bArr;
            this.f35553f = 0;
            this.f35552e = i11;
        }

        private final void A0(byte[] bArr, int i10, int i11) throws zzb {
            try {
                System.arraycopy(bArr, i10, this.f35551d, this.f35553f, i11);
                this.f35553f += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(this.f35553f, this.f35552e, i11, (Throwable) e10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjr
        public final void H(int i10) {
            if (i10 >= 0) {
                U(i10);
            } else {
                N(i10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjr
        public final void K(int i10, int i11) {
            V(i10, 0);
            H(i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzjr
        public final void L(int i10, long j10) {
            V(i10, 0);
            N(j10);
        }

        @Override // com.google.android.gms.internal.measurement.zzjr
        public final void M(int i10, V3 v32) {
            V(1, 3);
            b0(2, i10);
            n(3, v32);
            V(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjr
        public final void N(long j10) throws zzb {
            int i10;
            int i11 = this.f35553f;
            if (!zzjr.f35549c || b() < 10) {
                while ((j10 & (-128)) != 0) {
                    try {
                        int i12 = i11 + 1;
                        try {
                            this.f35551d[i11] = (byte) (((int) j10) | 128);
                            j10 >>>= 7;
                            i11 = i12;
                        } catch (IndexOutOfBoundsException e10) {
                            e = e10;
                            i11 = i12;
                            throw new zzb(i11, this.f35552e, 1, (Throwable) e);
                        }
                    } catch (IndexOutOfBoundsException e11) {
                        e = e11;
                    }
                }
                i10 = i11 + 1;
                try {
                    this.f35551d[i11] = (byte) j10;
                } catch (IndexOutOfBoundsException e12) {
                    e = e12;
                    i11 = i10;
                    throw new zzb(i11, this.f35552e, 1, (Throwable) e);
                }
            } else {
                while ((j10 & (-128)) != 0) {
                    N5.m(this.f35551d, i11, (byte) (((int) j10) | 128));
                    j10 >>>= 7;
                    i11++;
                }
                i10 = i11 + 1;
                N5.m(this.f35551d, i11, (byte) j10);
            }
            this.f35553f = i10;
        }

        @Override // com.google.android.gms.internal.measurement.zzjr
        public final void U(int i10) throws zzb {
            int i11;
            int i12 = this.f35553f;
            while ((i10 & (-128)) != 0) {
                try {
                    i11 = i12 + 1;
                } catch (IndexOutOfBoundsException e10) {
                    e = e10;
                    throw new zzb(i12, this.f35552e, 1, (Throwable) e);
                }
                try {
                    this.f35551d[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e11) {
                    e = e11;
                    i12 = i11;
                    throw new zzb(i12, this.f35552e, 1, (Throwable) e);
                }
            }
            i11 = i12 + 1;
            this.f35551d[i12] = (byte) i10;
            this.f35553f = i11;
        }

        @Override // com.google.android.gms.internal.measurement.zzjr
        public final void V(int i10, int i11) {
            U((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.measurement.X3
        public final void a(byte[] bArr, int i10, int i11) throws zzb {
            A0(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzjr
        public final int b() {
            return this.f35552e - this.f35553f;
        }

        @Override // com.google.android.gms.internal.measurement.zzjr
        public final void b0(int i10, int i11) {
            V(i10, 0);
            U(i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzjr
        public final void j(byte b10) throws zzb {
            int i10;
            int i11 = this.f35553f;
            try {
                i10 = i11 + 1;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
            }
            try {
                this.f35551d[i11] = b10;
                this.f35553f = i10;
            } catch (IndexOutOfBoundsException e11) {
                e = e11;
                i11 = i10;
                throw new zzb(i11, this.f35552e, 1, (Throwable) e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjr
        public final void k(int i10) throws zzb {
            int i11 = this.f35553f;
            try {
                byte[] bArr = this.f35551d;
                bArr[i11] = (byte) i10;
                bArr[i11 + 1] = (byte) (i10 >> 8);
                bArr[i11 + 2] = (byte) (i10 >> 16);
                bArr[i11 + 3] = i10 >> 24;
                this.f35553f = i11 + 4;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(i11, this.f35552e, 4, (Throwable) e10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjr
        public final void l(int i10, int i11) {
            V(i10, 5);
            k(i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzjr
        public final void m(int i10, long j10) {
            V(i10, 1);
            s(j10);
        }

        @Override // com.google.android.gms.internal.measurement.zzjr
        public final void n(int i10, V3 v32) {
            V(i10, 2);
            t(v32);
        }

        @Override // com.google.android.gms.internal.measurement.zzjr
        public final void o(int i10, InterfaceC4366h5 interfaceC4366h5) {
            V(1, 3);
            b0(2, i10);
            V(3, 2);
            u(interfaceC4366h5);
            V(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjr
        final void p(int i10, InterfaceC4366h5 interfaceC4366h5, InterfaceC4495x5 interfaceC4495x5) {
            V(i10, 2);
            U(((N3) interfaceC4366h5).a(interfaceC4495x5));
            interfaceC4495x5.d(interfaceC4366h5, this.f35550a);
        }

        @Override // com.google.android.gms.internal.measurement.zzjr
        public final void q(int i10, String str) {
            V(i10, 2);
            v(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzjr
        public final void r(int i10, boolean z10) {
            V(i10, 0);
            j(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzjr
        public final void s(long j10) throws zzb {
            int i10 = this.f35553f;
            try {
                byte[] bArr = this.f35551d;
                bArr[i10] = (byte) j10;
                bArr[i10 + 1] = (byte) (j10 >> 8);
                bArr[i10 + 2] = (byte) (j10 >> 16);
                bArr[i10 + 3] = (byte) (j10 >> 24);
                bArr[i10 + 4] = (byte) (j10 >> 32);
                bArr[i10 + 5] = (byte) (j10 >> 40);
                bArr[i10 + 6] = (byte) (j10 >> 48);
                bArr[i10 + 7] = (byte) (j10 >> 56);
                this.f35553f = i10 + 8;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(i10, this.f35552e, 8, (Throwable) e10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjr
        public final void t(V3 v32) {
            U(v32.S());
            v32.F(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzjr
        public final void u(InterfaceC4366h5 interfaceC4366h5) {
            U(interfaceC4366h5.d());
            interfaceC4366h5.b(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzjr
        public final void v(String str) throws zzb {
            int i10 = this.f35553f;
            try {
                int iV0 = zzjr.v0(str.length() * 3);
                int iV02 = zzjr.v0(str.length());
                if (iV02 != iV0) {
                    U(R5.a(str));
                    this.f35553f = R5.b(str, this.f35551d, this.f35553f, b());
                    return;
                }
                int i11 = i10 + iV02;
                this.f35553f = i11;
                int iB = R5.b(str, this.f35551d, i11, b());
                this.f35553f = i10;
                U((iB - i10) - iV02);
                this.f35553f = iB;
            } catch (V5 e10) {
                this.f35553f = i10;
                w(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new zzb(e11);
            }
        }
    }

    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        private zzb(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }

        zzb(int i10, int i11, int i12, Throwable th2) {
            this(i10, i11, i12, th2);
        }

        private zzb(long j10, long j11, int i10, Throwable th2) {
            this(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10)), th2);
        }
    }

    public static int A(V3 v32) {
        int iS = v32.S();
        return v0(iS) + iS;
    }

    public static int B(InterfaceC4366h5 interfaceC4366h5) {
        return interfaceC4366h5.d();
    }

    public static int C(String str) {
        int length;
        try {
            length = R5.a(str);
        } catch (V5 unused) {
            length = str.getBytes(F4.f35000a).length;
        }
        return v0(length) + length;
    }

    public static zzjr D(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int P(int i10, long j10) {
        return v0(i10 << 3) + 8;
    }

    public static int Q(int i10, V3 v32) {
        int iV0 = v0(i10 << 3);
        int iS = v32.S();
        return iV0 + v0(iS) + iS;
    }

    static int R(int i10, InterfaceC4366h5 interfaceC4366h5, InterfaceC4495x5 interfaceC4495x5) {
        return v0(i10 << 3) + g(interfaceC4366h5, interfaceC4495x5);
    }

    public static int S(long j10) {
        return 8;
    }

    public static int T(InterfaceC4366h5 interfaceC4366h5) {
        int iD = interfaceC4366h5.d();
        return v0(iD) + iD;
    }

    public static int X(int i10) {
        return n0(i10);
    }

    public static int Y(int i10, long j10) {
        return v0(i10 << 3) + n0(j10);
    }

    public static int Z(int i10, V3 v32) {
        return (v0(8) << 1) + w0(2, i10) + Q(3, v32);
    }

    public static int a0(long j10) {
        return n0(j10);
    }

    public static int c(double d10) {
        return 8;
    }

    public static int c0(int i10) {
        return 4;
    }

    public static int d(float f10) {
        return 4;
    }

    public static int d0(int i10, int i11) {
        return v0(i10 << 3) + n0(i11);
    }

    public static int e(int i10, double d10) {
        return v0(i10 << 3) + 8;
    }

    public static int e0(int i10, long j10) {
        return v0(i10 << 3) + 8;
    }

    public static int f(int i10, float f10) {
        return v0(i10 << 3) + 4;
    }

    public static int f0(long j10) {
        return 8;
    }

    static int g(InterfaceC4366h5 interfaceC4366h5, InterfaceC4495x5 interfaceC4495x5) {
        int iA = ((N3) interfaceC4366h5).a(interfaceC4495x5);
        return v0(iA) + iA;
    }

    public static int g0(int i10) {
        return n0(i10);
    }

    public static int h(boolean z10) {
        return 1;
    }

    public static int h0(int i10, int i11) {
        return v0(i10 << 3) + 4;
    }

    public static int i(byte[] bArr) {
        int length = bArr.length;
        return v0(length) + length;
    }

    public static int i0(int i10, long j10) {
        return v0(i10 << 3) + n0(u0(j10));
    }

    public static int j0(long j10) {
        return n0(u0(j10));
    }

    public static int k0(int i10) {
        return 4;
    }

    public static int l0(int i10, int i11) {
        return v0(i10 << 3) + n0(i11);
    }

    public static int m0(int i10, long j10) {
        return v0(i10 << 3) + n0(j10);
    }

    public static int n0(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int o0(int i10) {
        return v0(z0(i10));
    }

    public static int p0(int i10, int i11) {
        return v0(i10 << 3) + 4;
    }

    public static int s0(int i10) {
        return v0(i10 << 3);
    }

    public static int t0(int i10, int i11) {
        return v0(i10 << 3) + v0(z0(i11));
    }

    private static long u0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int v0(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int w0(int i10, int i11) {
        return v0(i10 << 3) + v0(i11);
    }

    static int x(int i10, InterfaceC4366h5 interfaceC4366h5, InterfaceC4495x5 interfaceC4495x5) {
        return (v0(i10 << 3) << 1) + ((N3) interfaceC4366h5).a(interfaceC4495x5);
    }

    public static int y(int i10, String str) {
        return v0(i10 << 3) + C(str);
    }

    public static int z(int i10, boolean z10) {
        return v0(i10 << 3) + 1;
    }

    private static int z0(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public final void E() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void F(double d10) {
        s(Double.doubleToRawLongBits(d10));
    }

    public final void G(float f10) {
        k(Float.floatToRawIntBits(f10));
    }

    public abstract void H(int i10);

    public final void I(int i10, double d10) {
        m(i10, Double.doubleToRawLongBits(d10));
    }

    public final void J(int i10, float f10) {
        l(i10, Float.floatToRawIntBits(f10));
    }

    public abstract void K(int i10, int i11);

    public abstract void L(int i10, long j10);

    public abstract void M(int i10, V3 v32);

    public abstract void N(long j10);

    public final void O(boolean z10) {
        j(z10 ? (byte) 1 : (byte) 0);
    }

    public abstract void U(int i10);

    public abstract void V(int i10, int i11);

    public abstract int b();

    public abstract void b0(int i10, int i11);

    public abstract void j(byte b10);

    public abstract void k(int i10);

    public abstract void l(int i10, int i11);

    public abstract void m(int i10, long j10);

    public abstract void n(int i10, V3 v32);

    public abstract void o(int i10, InterfaceC4366h5 interfaceC4366h5);

    abstract void p(int i10, InterfaceC4366h5 interfaceC4366h5, InterfaceC4495x5 interfaceC4495x5);

    public abstract void q(int i10, String str);

    public final void q0(int i10, long j10) {
        L(i10, u0(j10));
    }

    public abstract void r(int i10, boolean z10);

    public final void r0(long j10) {
        N(u0(j10));
    }

    public abstract void s(long j10);

    public abstract void t(V3 v32);

    public abstract void u(InterfaceC4366h5 interfaceC4366h5);

    public abstract void v(String str);

    final void w(String str, V5 v52) throws zzb {
        f35548b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) v52);
        byte[] bytes = str.getBytes(F4.f35000a);
        try {
            U(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzb(e10);
        }
    }

    public final void x0(int i10) {
        U(z0(i10));
    }

    public final void y0(int i10, int i11) {
        b0(i10, z0(i11));
    }

    private zzjr() {
    }
}
