package androidx.datastore.preferences.protobuf;

import X0.o;
import androidx.datastore.preferences.protobuf.p0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* compiled from: CodedOutputStream.java */
/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1733k extends AbstractC1728f {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f15650b = Logger.getLogger(AbstractC1733k.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f15651c = o0.f15683f;

    /* renamed from: a, reason: collision with root package name */
    public C1734l f15652a;

    /* compiled from: CodedOutputStream.java */
    /* renamed from: androidx.datastore.preferences.protobuf.k$a */
    public static abstract class a extends AbstractC1733k {

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f15653d;

        /* renamed from: e, reason: collision with root package name */
        public final int f15654e;

        /* renamed from: f, reason: collision with root package name */
        public int f15655f;

        public a(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.f15653d = bArr;
            this.f15654e = bArr.length;
        }

        public final void K(int i) {
            int i10 = this.f15655f;
            int i11 = i10 + 1;
            this.f15655f = i11;
            byte b10 = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            byte[] bArr = this.f15653d;
            bArr[i10] = b10;
            int i12 = i10 + 2;
            this.f15655f = i12;
            bArr[i11] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i13 = i10 + 3;
            this.f15655f = i13;
            bArr[i12] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f15655f = i10 + 4;
            bArr[i13] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        }

        public final void L(long j4) {
            int i = this.f15655f;
            int i10 = i + 1;
            this.f15655f = i10;
            byte[] bArr = this.f15653d;
            bArr[i] = (byte) (j4 & 255);
            int i11 = i + 2;
            this.f15655f = i11;
            bArr[i10] = (byte) ((j4 >> 8) & 255);
            int i12 = i + 3;
            this.f15655f = i12;
            bArr[i11] = (byte) ((j4 >> 16) & 255);
            int i13 = i + 4;
            this.f15655f = i13;
            bArr[i12] = (byte) (255 & (j4 >> 24));
            int i14 = i + 5;
            this.f15655f = i14;
            bArr[i13] = (byte) (((int) (j4 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i15 = i + 6;
            this.f15655f = i15;
            bArr[i14] = (byte) (((int) (j4 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i16 = i + 7;
            this.f15655f = i16;
            bArr[i15] = (byte) (((int) (j4 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f15655f = i + 8;
            bArr[i16] = (byte) (((int) (j4 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        }

        public final void M(int i, int i10) {
            N((i << 3) | i10);
        }

        public final void N(int i) {
            boolean z10 = AbstractC1733k.f15651c;
            byte[] bArr = this.f15653d;
            if (z10) {
                while ((i & (-128)) != 0) {
                    int i10 = this.f15655f;
                    this.f15655f = i10 + 1;
                    o0.j(bArr, i10, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                int i11 = this.f15655f;
                this.f15655f = i11 + 1;
                o0.j(bArr, i11, (byte) i);
                return;
            }
            while ((i & (-128)) != 0) {
                int i12 = this.f15655f;
                this.f15655f = i12 + 1;
                bArr[i12] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
            int i13 = this.f15655f;
            this.f15655f = i13 + 1;
            bArr[i13] = (byte) i;
        }

        public final void O(long j4) {
            boolean z10 = AbstractC1733k.f15651c;
            byte[] bArr = this.f15653d;
            if (z10) {
                while ((j4 & (-128)) != 0) {
                    int i = this.f15655f;
                    this.f15655f = i + 1;
                    o0.j(bArr, i, (byte) ((((int) j4) & 127) | 128));
                    j4 >>>= 7;
                }
                int i10 = this.f15655f;
                this.f15655f = i10 + 1;
                o0.j(bArr, i10, (byte) j4);
                return;
            }
            while ((j4 & (-128)) != 0) {
                int i11 = this.f15655f;
                this.f15655f = i11 + 1;
                bArr[i11] = (byte) ((((int) j4) & 127) | 128);
                j4 >>>= 7;
            }
            int i12 = this.f15655f;
            this.f15655f = i12 + 1;
            bArr[i12] = (byte) j4;
        }
    }

    /* compiled from: CodedOutputStream.java */
    /* renamed from: androidx.datastore.preferences.protobuf.k$b */
    public static class b extends AbstractC1733k {

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f15656d;

        /* renamed from: e, reason: collision with root package name */
        public final int f15657e;

        /* renamed from: f, reason: collision with root package name */
        public int f15658f;

        public b(byte[] bArr, int i) {
            if (((bArr.length - i) | i) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
            }
            this.f15656d = bArr;
            this.f15658f = 0;
            this.f15657e = i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void A(P p10) throws IOException {
            H(p10.getSerializedSize());
            p10.b(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void B(int i, P p10) throws IOException {
            F(1, 3);
            G(2, i);
            F(3, 2);
            A(p10);
            F(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void C(int i, AbstractC1730h abstractC1730h) throws IOException {
            F(1, 3);
            G(2, i);
            r(3, abstractC1730h);
            F(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void D(int i, String str) throws IOException {
            F(i, 2);
            E(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void E(String str) throws IOException {
            int i = this.f15658f;
            try {
                int iL = AbstractC1733k.l(str.length() * 3);
                int iL2 = AbstractC1733k.l(str.length());
                int i10 = this.f15657e;
                byte[] bArr = this.f15656d;
                if (iL2 != iL) {
                    H(p0.b(str));
                    int i11 = this.f15658f;
                    this.f15658f = p0.f15687a.b(str, bArr, i11, i10 - i11);
                    return;
                }
                int i12 = i + iL2;
                this.f15658f = i12;
                int iB = p0.f15687a.b(str, bArr, i12, i10 - i12);
                this.f15658f = i;
                H((iB - i) - iL2);
                this.f15658f = iB;
            } catch (p0.d e4) {
                this.f15658f = i;
                n(str, e4);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void F(int i, int i10) throws IOException {
            H((i << 3) | i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void G(int i, int i10) throws IOException {
            F(i, 0);
            H(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void H(int i) throws IOException {
            boolean z10 = AbstractC1733k.f15651c;
            int i10 = this.f15657e;
            byte[] bArr = this.f15656d;
            if (z10 && !C1726d.a()) {
                int i11 = this.f15658f;
                if (i10 - i11 >= 5) {
                    if ((i & (-128)) == 0) {
                        this.f15658f = 1 + i11;
                        o0.j(bArr, i11, (byte) i);
                        return;
                    }
                    this.f15658f = i11 + 1;
                    o0.j(bArr, i11, (byte) (i | 128));
                    int i12 = i >>> 7;
                    if ((i12 & (-128)) == 0) {
                        int i13 = this.f15658f;
                        this.f15658f = 1 + i13;
                        o0.j(bArr, i13, (byte) i12);
                        return;
                    }
                    int i14 = this.f15658f;
                    this.f15658f = i14 + 1;
                    o0.j(bArr, i14, (byte) (i12 | 128));
                    int i15 = i >>> 14;
                    if ((i15 & (-128)) == 0) {
                        int i16 = this.f15658f;
                        this.f15658f = 1 + i16;
                        o0.j(bArr, i16, (byte) i15);
                        return;
                    }
                    int i17 = this.f15658f;
                    this.f15658f = i17 + 1;
                    o0.j(bArr, i17, (byte) (i15 | 128));
                    int i18 = i >>> 21;
                    if ((i18 & (-128)) == 0) {
                        int i19 = this.f15658f;
                        this.f15658f = 1 + i19;
                        o0.j(bArr, i19, (byte) i18);
                        return;
                    } else {
                        int i20 = this.f15658f;
                        this.f15658f = i20 + 1;
                        o0.j(bArr, i20, (byte) (i18 | 128));
                        int i21 = this.f15658f;
                        this.f15658f = 1 + i21;
                        o0.j(bArr, i21, (byte) (i >>> 28));
                        return;
                    }
                }
            }
            while ((i & (-128)) != 0) {
                try {
                    int i22 = this.f15658f;
                    this.f15658f = i22 + 1;
                    bArr[i22] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15658f), Integer.valueOf(i10), 1), e4);
                }
            }
            int i23 = this.f15658f;
            this.f15658f = i23 + 1;
            bArr[i23] = (byte) i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void I(int i, long j4) throws IOException {
            F(i, 0);
            J(j4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void J(long j4) throws IOException {
            boolean z10 = AbstractC1733k.f15651c;
            int i = this.f15657e;
            byte[] bArr = this.f15656d;
            if (z10 && i - this.f15658f >= 10) {
                while ((j4 & (-128)) != 0) {
                    int i10 = this.f15658f;
                    this.f15658f = i10 + 1;
                    o0.j(bArr, i10, (byte) ((((int) j4) & 127) | 128));
                    j4 >>>= 7;
                }
                int i11 = this.f15658f;
                this.f15658f = 1 + i11;
                o0.j(bArr, i11, (byte) j4);
                return;
            }
            while ((j4 & (-128)) != 0) {
                try {
                    int i12 = this.f15658f;
                    this.f15658f = i12 + 1;
                    bArr[i12] = (byte) ((((int) j4) & 127) | 128);
                    j4 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15658f), Integer.valueOf(i), 1), e4);
                }
            }
            int i13 = this.f15658f;
            this.f15658f = i13 + 1;
            bArr[i13] = (byte) j4;
        }

        public final void K(byte[] bArr, int i, int i10) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f15656d, this.f15658f, i10);
                this.f15658f += i10;
            } catch (IndexOutOfBoundsException e4) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15658f), Integer.valueOf(this.f15657e), Integer.valueOf(i10)), e4);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1728f
        public final void a(byte[] bArr, int i, int i10) throws IOException {
            K(bArr, i, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void o(byte b10) throws IOException {
            try {
                byte[] bArr = this.f15656d;
                int i = this.f15658f;
                this.f15658f = i + 1;
                bArr[i] = b10;
            } catch (IndexOutOfBoundsException e4) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15658f), Integer.valueOf(this.f15657e), 1), e4);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void p(int i, boolean z10) throws IOException {
            F(i, 0);
            o(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void q(int i, byte[] bArr) throws IOException {
            H(i);
            K(bArr, 0, i);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void r(int i, AbstractC1730h abstractC1730h) throws IOException {
            F(i, 2);
            s(abstractC1730h);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void s(AbstractC1730h abstractC1730h) throws IOException {
            H(abstractC1730h.size());
            abstractC1730h.h(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void t(int i, int i10) throws IOException {
            F(i, 5);
            u(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void u(int i) throws IOException {
            try {
                byte[] bArr = this.f15656d;
                int i10 = this.f15658f;
                int i11 = i10 + 1;
                this.f15658f = i11;
                bArr[i10] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
                int i12 = i10 + 2;
                this.f15658f = i12;
                bArr[i11] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i13 = i10 + 3;
                this.f15658f = i13;
                bArr[i12] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f15658f = i10 + 4;
                bArr[i13] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            } catch (IndexOutOfBoundsException e4) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15658f), Integer.valueOf(this.f15657e), 1), e4);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void v(int i, long j4) throws IOException {
            F(i, 1);
            w(j4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void w(long j4) throws IOException {
            try {
                byte[] bArr = this.f15656d;
                int i = this.f15658f;
                int i10 = i + 1;
                this.f15658f = i10;
                bArr[i] = (byte) (((int) j4) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i11 = i + 2;
                this.f15658f = i11;
                bArr[i10] = (byte) (((int) (j4 >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i12 = i + 3;
                this.f15658f = i12;
                bArr[i11] = (byte) (((int) (j4 >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i13 = i + 4;
                this.f15658f = i13;
                bArr[i12] = (byte) (((int) (j4 >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i14 = i + 5;
                this.f15658f = i14;
                bArr[i13] = (byte) (((int) (j4 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i15 = i + 6;
                this.f15658f = i15;
                bArr[i14] = (byte) (((int) (j4 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i16 = i + 7;
                this.f15658f = i16;
                bArr[i15] = (byte) (((int) (j4 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f15658f = i + 8;
                bArr[i16] = (byte) (((int) (j4 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
            } catch (IndexOutOfBoundsException e4) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15658f), Integer.valueOf(this.f15657e), 1), e4);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void x(int i, int i10) throws IOException {
            F(i, 0);
            y(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void y(int i) throws IOException {
            if (i >= 0) {
                H(i);
            } else {
                J(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void z(int i, P p10, f0 f0Var) throws IOException {
            F(i, 2);
            H(((AbstractC1723a) p10).d(f0Var));
            f0Var.e(p10, this.f15652a);
        }
    }

    /* compiled from: CodedOutputStream.java */
    /* renamed from: androidx.datastore.preferences.protobuf.k$c */
    public static class c extends IOException {
        public c(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        public c(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }
    }

    /* compiled from: CodedOutputStream.java */
    /* renamed from: androidx.datastore.preferences.protobuf.k$d */
    public static final class d extends a {

        /* renamed from: g, reason: collision with root package name */
        public final o.b f15659g;

        public d(o.b bVar, int i) {
            super(i);
            this.f15659g = bVar;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void A(P p10) throws IOException {
            H(p10.getSerializedSize());
            p10.b(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void B(int i, P p10) throws IOException {
            F(1, 3);
            G(2, i);
            F(3, 2);
            A(p10);
            F(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void C(int i, AbstractC1730h abstractC1730h) throws IOException {
            F(1, 3);
            G(2, i);
            r(3, abstractC1730h);
            F(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void D(int i, String str) throws IOException {
            F(i, 2);
            E(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void E(String str) throws IOException {
            try {
                int length = str.length() * 3;
                int iL = AbstractC1733k.l(length);
                int i = iL + length;
                int i10 = this.f15654e;
                if (i > i10) {
                    byte[] bArr = new byte[length];
                    int iB = p0.f15687a.b(str, bArr, 0, length);
                    H(iB);
                    R(bArr, 0, iB);
                    return;
                }
                if (i > i10 - this.f15655f) {
                    P();
                }
                int iL2 = AbstractC1733k.l(str.length());
                int i11 = this.f15655f;
                byte[] bArr2 = this.f15653d;
                try {
                    if (iL2 == iL) {
                        int i12 = i11 + iL2;
                        this.f15655f = i12;
                        int iB2 = p0.f15687a.b(str, bArr2, i12, i10 - i12);
                        this.f15655f = i11;
                        N((iB2 - i11) - iL2);
                        this.f15655f = iB2;
                    } else {
                        int iB3 = p0.b(str);
                        N(iB3);
                        this.f15655f = p0.f15687a.b(str, bArr2, this.f15655f, iB3);
                    }
                } catch (p0.d e4) {
                    this.f15655f = i11;
                    throw e4;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new c(e10);
                }
            } catch (p0.d e11) {
                n(str, e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void F(int i, int i10) throws IOException {
            H((i << 3) | i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void G(int i, int i10) throws IOException {
            Q(20);
            M(i, 0);
            N(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void H(int i) throws IOException {
            Q(5);
            N(i);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void I(int i, long j4) throws IOException {
            Q(20);
            M(i, 0);
            O(j4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void J(long j4) throws IOException {
            Q(10);
            O(j4);
        }

        public final void P() throws IOException {
            this.f15659g.write(this.f15653d, 0, this.f15655f);
            this.f15655f = 0;
        }

        public final void Q(int i) throws IOException {
            if (this.f15654e - this.f15655f < i) {
                P();
            }
        }

        public final void R(byte[] bArr, int i, int i10) throws IOException {
            int i11 = this.f15655f;
            int i12 = this.f15654e;
            int i13 = i12 - i11;
            byte[] bArr2 = this.f15653d;
            if (i13 >= i10) {
                System.arraycopy(bArr, i, bArr2, i11, i10);
                this.f15655f += i10;
                return;
            }
            System.arraycopy(bArr, i, bArr2, i11, i13);
            int i14 = i + i13;
            int i15 = i10 - i13;
            this.f15655f = i12;
            P();
            if (i15 > i12) {
                this.f15659g.write(bArr, i14, i15);
            } else {
                System.arraycopy(bArr, i14, bArr2, 0, i15);
                this.f15655f = i15;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1728f
        public final void a(byte[] bArr, int i, int i10) throws IOException {
            R(bArr, i, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void o(byte b10) throws IOException {
            if (this.f15655f == this.f15654e) {
                P();
            }
            int i = this.f15655f;
            this.f15655f = i + 1;
            this.f15653d[i] = b10;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void p(int i, boolean z10) throws IOException {
            Q(11);
            M(i, 0);
            byte b10 = z10 ? (byte) 1 : (byte) 0;
            int i10 = this.f15655f;
            this.f15655f = i10 + 1;
            this.f15653d[i10] = b10;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void q(int i, byte[] bArr) throws IOException {
            H(i);
            R(bArr, 0, i);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void r(int i, AbstractC1730h abstractC1730h) throws IOException {
            F(i, 2);
            s(abstractC1730h);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void s(AbstractC1730h abstractC1730h) throws IOException {
            H(abstractC1730h.size());
            abstractC1730h.h(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void t(int i, int i10) throws IOException {
            Q(14);
            M(i, 5);
            K(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void u(int i) throws IOException {
            Q(4);
            K(i);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void v(int i, long j4) throws IOException {
            Q(18);
            M(i, 1);
            L(j4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void w(long j4) throws IOException {
            Q(8);
            L(j4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void x(int i, int i10) throws IOException {
            Q(20);
            M(i, 0);
            if (i10 >= 0) {
                N(i10);
            } else {
                O(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void y(int i) throws IOException {
            if (i >= 0) {
                H(i);
            } else {
                J(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1733k
        public final void z(int i, P p10, f0 f0Var) throws IOException {
            F(i, 2);
            H(((AbstractC1723a) p10).d(f0Var));
            f0Var.e(p10, this.f15652a);
        }
    }

    public static int b(int i, AbstractC1730h abstractC1730h) {
        return c(abstractC1730h) + j(i);
    }

    public static int c(AbstractC1730h abstractC1730h) {
        int size = abstractC1730h.size();
        return l(size) + size;
    }

    public static int d(int i) {
        return j(i) + 4;
    }

    public static int e(int i) {
        return j(i) + 8;
    }

    @Deprecated
    public static int f(int i, P p10, f0 f0Var) {
        return ((AbstractC1723a) p10).d(f0Var) + (j(i) * 2);
    }

    public static int g(int i) {
        if (i >= 0) {
            return l(i);
        }
        return 10;
    }

    public static int h(C c10) {
        int size = c10.f15540b != null ? c10.f15540b.size() : c10.f15539a != null ? c10.f15539a.getSerializedSize() : 0;
        return l(size) + size;
    }

    public static int i(String str) {
        int length;
        try {
            length = p0.b(str);
        } catch (p0.d unused) {
            length = str.getBytes(C1746y.f15707a).length;
        }
        return l(length) + length;
    }

    public static int j(int i) {
        return l(i << 3);
    }

    public static int k(int i, int i10) {
        return l(i10) + j(i);
    }

    public static int l(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int m(long j4) {
        int i;
        if (((-128) & j4) == 0) {
            return 1;
        }
        if (j4 < 0) {
            return 10;
        }
        if (((-34359738368L) & j4) != 0) {
            j4 >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j4) != 0) {
            i += 2;
            j4 >>>= 14;
        }
        return (j4 & (-16384)) != 0 ? i + 1 : i;
    }

    public abstract void A(P p10) throws IOException;

    public abstract void B(int i, P p10) throws IOException;

    public abstract void C(int i, AbstractC1730h abstractC1730h) throws IOException;

    public abstract void D(int i, String str) throws IOException;

    public abstract void E(String str) throws IOException;

    public abstract void F(int i, int i10) throws IOException;

    public abstract void G(int i, int i10) throws IOException;

    public abstract void H(int i) throws IOException;

    public abstract void I(int i, long j4) throws IOException;

    public abstract void J(long j4) throws IOException;

    public final void n(String str, p0.d dVar) throws IOException {
        f15650b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(C1746y.f15707a);
        try {
            H(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (c e4) {
            throw e4;
        } catch (IndexOutOfBoundsException e10) {
            throw new c(e10);
        }
    }

    public abstract void o(byte b10) throws IOException;

    public abstract void p(int i, boolean z10) throws IOException;

    public abstract void q(int i, byte[] bArr) throws IOException;

    public abstract void r(int i, AbstractC1730h abstractC1730h) throws IOException;

    public abstract void s(AbstractC1730h abstractC1730h) throws IOException;

    public abstract void t(int i, int i10) throws IOException;

    public abstract void u(int i) throws IOException;

    public abstract void v(int i, long j4) throws IOException;

    public abstract void w(long j4) throws IOException;

    public abstract void x(int i, int i10) throws IOException;

    public abstract void y(int i) throws IOException;

    public abstract void z(int i, P p10, f0 f0Var) throws IOException;
}
