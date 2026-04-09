package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class c54 extends m0 {
    public final Iterator i;
    public ByteBuffer j;
    public int k;
    public int l;
    public int n;
    public long p;
    public long q;
    public long r;
    public int m = Integer.MAX_VALUE;
    public int o = 0;

    public /* synthetic */ c54(int i, ArrayList arrayList) {
        this.k = i;
        this.i = arrayList.iterator();
        if (i != 0) {
            H();
            return;
        }
        this.j = y54.c;
        this.p = 0L;
        this.q = 0L;
        this.r = 0L;
    }

    @Override // defpackage.m0
    public final long A() {
        return O();
    }

    @Override // defpackage.m0
    public final int B() {
        return m0.h(K());
    }

    @Override // defpackage.m0
    public final long C() {
        return m0.i(L());
    }

    @Override // defpackage.m0
    public final int D(int i) throws a64 {
        if (i < 0) {
            throw new a64("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iE = e() + i;
        int i2 = this.m;
        if (iE > i2) {
            throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.m = iE;
        int i3 = this.k + this.l;
        this.k = i3;
        if (i3 <= iE) {
            this.l = 0;
            return i2;
        }
        int i4 = i3 - iE;
        this.l = i4;
        this.k = i3 - i4;
        return i2;
    }

    public final byte E() throws a64 {
        if (this.r - this.p == 0) {
            G();
        }
        long j = this.p;
        this.p = 1 + j;
        return g74.c.A1(j);
    }

    public final void F(int i) throws a64 {
        if (i >= 0) {
            if (i <= ((this.k - this.o) - this.p) + this.q) {
                while (i > 0) {
                    if (this.r - this.p == 0) {
                        G();
                    }
                    int iMin = Math.min(i, (int) (this.r - this.p));
                    i -= iMin;
                    this.p += iMin;
                }
                return;
            }
        }
        if (i >= 0) {
            throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new a64("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final void G() throws a64 {
        if (!this.i.hasNext()) {
            throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        H();
    }

    public final void H() {
        ByteBuffer byteBuffer = (ByteBuffer) this.i.next();
        this.j = byteBuffer;
        this.o += (int) (this.p - this.q);
        long jPosition = byteBuffer.position();
        this.p = jPosition;
        this.q = jPosition;
        this.r = this.j.limit();
        long jN = g74.n(this.j);
        this.p += jN;
        this.q += jN;
        this.r += jN;
    }

    public final void I(int i, byte[] bArr) throws a64 {
        if (i > J()) {
            if (i > 0) {
                throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            return;
        }
        int i2 = i;
        while (i2 > 0) {
            if (this.r - this.p == 0) {
                G();
            }
            int iMin = Math.min(i2, (int) (this.r - this.p));
            long j = iMin;
            g74.c.F1(this.p, bArr, i - i2, j);
            i2 -= iMin;
            this.p += j;
        }
    }

    public final int J() {
        return (int) (((this.k - this.o) - this.p) + this.q);
    }

    public final int K() {
        int i;
        long j = this.p;
        if (this.r != j) {
            long j2 = j + 1;
            f74 f74Var = g74.c;
            byte bA1 = f74Var.A1(j);
            if (bA1 >= 0) {
                this.p++;
                return bA1;
            }
            if (this.r - this.p >= 10) {
                long j3 = 2 + j;
                int iA1 = (f74Var.A1(j2) << 7) ^ bA1;
                if (iA1 < 0) {
                    i = iA1 ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int iA12 = (f74Var.A1(j3) << 14) ^ iA1;
                    if (iA12 >= 0) {
                        i = iA12 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int iA13 = iA12 ^ (f74Var.A1(j4) << 21);
                        if (iA13 < 0) {
                            i = (-2080896) ^ iA13;
                        } else {
                            j4 = 5 + j;
                            byte bA12 = f74Var.A1(j5);
                            int i2 = (iA13 ^ (bA12 << 28)) ^ 266354560;
                            if (bA12 < 0) {
                                j5 = 6 + j;
                                if (f74Var.A1(j4) < 0) {
                                    j4 = 7 + j;
                                    if (f74Var.A1(j5) < 0) {
                                        j5 = 8 + j;
                                        if (f74Var.A1(j4) < 0) {
                                            j4 = 9 + j;
                                            if (f74Var.A1(j5) < 0) {
                                                long j6 = j + 10;
                                                if (f74Var.A1(j4) >= 0) {
                                                    i = i2;
                                                    j3 = j6;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                        j3 = j5;
                    }
                    j3 = j4;
                }
                this.p = j3;
                return i;
            }
        }
        return (int) M();
    }

    public final long L() {
        long j;
        long j2;
        long j3;
        long j4 = this.p;
        if (this.r != j4) {
            long j5 = j4 + 1;
            f74 f74Var = g74.c;
            byte bA1 = f74Var.A1(j4);
            if (bA1 >= 0) {
                this.p++;
                return bA1;
            }
            if (this.r - this.p >= 10) {
                long j6 = 2 + j4;
                int iA1 = (f74Var.A1(j5) << 7) ^ bA1;
                if (iA1 < 0) {
                    j = iA1 ^ (-128);
                } else {
                    long j7 = 3 + j4;
                    int iA12 = (f74Var.A1(j6) << 14) ^ iA1;
                    if (iA12 >= 0) {
                        j = iA12 ^ 16256;
                    } else {
                        long j8 = 4 + j4;
                        int iA13 = iA12 ^ (f74Var.A1(j7) << 21);
                        if (iA13 < 0) {
                            j = (-2080896) ^ iA13;
                            j6 = j8;
                        } else {
                            j7 = 5 + j4;
                            long jA1 = (f74Var.A1(j8) << 28) ^ iA13;
                            if (jA1 >= 0) {
                                j3 = 266354560;
                            } else {
                                long j9 = 6 + j4;
                                long jA12 = jA1 ^ (f74Var.A1(j7) << 35);
                                if (jA12 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j7 = 7 + j4;
                                    jA1 = jA12 ^ (f74Var.A1(j9) << 42);
                                    if (jA1 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j9 = 8 + j4;
                                        jA12 = jA1 ^ (f74Var.A1(j7) << 49);
                                        if (jA12 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j7 = 9 + j4;
                                            long jA13 = (jA12 ^ (f74Var.A1(j9) << 56)) ^ 71499008037633920L;
                                            if (jA13 < 0) {
                                                long j10 = j4 + 10;
                                                if (f74Var.A1(j7) >= 0) {
                                                    j6 = j10;
                                                    j = jA13;
                                                }
                                            } else {
                                                j = jA13;
                                            }
                                        }
                                    }
                                }
                                j = j2 ^ jA12;
                                j6 = j9;
                            }
                            j = j3 ^ jA1;
                        }
                    }
                    j6 = j7;
                }
                this.p = j6;
                return j;
            }
        }
        return M();
    }

    public final long M() throws a64 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & 127) << i;
            if ((E() & 128) == 0) {
                return j;
            }
        }
        throw new a64("CodedInputStream encountered a malformed varint.");
    }

    public final int N() {
        long j = this.r;
        long j2 = this.p;
        if (j - j2 < 4) {
            int iE = E() & 255;
            int iE2 = (E() & 255) << 8;
            return iE | iE2 | ((E() & 255) << 16) | ((E() & 255) << 24);
        }
        this.p = 4 + j2;
        f74 f74Var = g74.c;
        int iA1 = f74Var.A1(j2) & 255;
        int iA12 = (f74Var.A1(1 + j2) & 255) << 8;
        return ((f74Var.A1(j2 + 3) & 255) << 24) | iA1 | iA12 | ((f74Var.A1(2 + j2) & 255) << 16);
    }

    public final long O() {
        long j = this.r;
        long j2 = this.p;
        if (j - j2 < 8) {
            return ((E() & 255) << 56) | (E() & 255) | ((E() & 255) << 8) | ((E() & 255) << 16) | ((E() & 255) << 24) | ((E() & 255) << 32) | ((E() & 255) << 40) | ((E() & 255) << 48);
        }
        this.p = 8 + j2;
        f74 f74Var = g74.c;
        return (f74Var.A1(j2) & 255) | ((f74Var.A1(j2 + 1) & 255) << 8) | ((f74Var.A1(j2 + 2) & 255) << 16) | ((f74Var.A1(j2 + 3) & 255) << 24) | ((f74Var.A1(j2 + 4) & 255) << 32) | ((f74Var.A1(j2 + 5) & 255) << 40) | ((f74Var.A1(j2 + 6) & 255) << 48) | ((f74Var.A1(j2 + 7) & 255) << 56);
    }

    @Override // defpackage.m0
    public final void a(int i) {
        this.m = i;
        int i2 = this.k + this.l;
        this.k = i2;
        if (i2 <= i) {
            this.l = 0;
            return;
        }
        int i3 = i2 - i;
        this.l = i3;
        this.k = i2 - i3;
    }

    @Override // defpackage.m0
    public final boolean c() {
        return (((long) this.o) + this.p) - this.q == ((long) this.k);
    }

    @Override // defpackage.m0
    public final int e() {
        return (int) ((this.o + this.p) - this.q);
    }

    @Override // defpackage.m0
    public final int j() throws a64 {
        if (c()) {
            this.n = 0;
            return 0;
        }
        int iK = K();
        this.n = iK;
        if ((iK >>> 3) != 0) {
            return iK;
        }
        throw new a64("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.m0
    public final void k(int i) throws a64 {
        if (this.n != i) {
            throw new a64("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.m0
    public final boolean l(int i) throws a64 {
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (E() >= 0) {
                    return true;
                }
            }
            throw new a64("CodedInputStream encountered a malformed varint.");
        }
        if (i2 == 1) {
            F(8);
            return true;
        }
        if (i2 == 2) {
            F(K());
            return true;
        }
        if (i2 == 3) {
            g();
            k(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            if (this.g == 0) {
                k(0);
            }
            return false;
        }
        if (i2 != 5) {
            throw new z54();
        }
        F(4);
        return true;
    }

    @Override // defpackage.m0
    public final double m() {
        return Double.longBitsToDouble(O());
    }

    @Override // defpackage.m0
    public final float n() {
        return Float.intBitsToFloat(N());
    }

    @Override // defpackage.m0
    public final long o() {
        return L();
    }

    @Override // defpackage.m0
    public final long p() {
        return L();
    }

    @Override // defpackage.m0
    public final int q() {
        return K();
    }

    @Override // defpackage.m0
    public final long r() {
        return O();
    }

    @Override // defpackage.m0
    public final int s() {
        return N();
    }

    @Override // defpackage.m0
    public final boolean t() {
        return L() != 0;
    }

    @Override // defpackage.m0
    public final String u() throws a64 {
        int iK = K();
        if (iK > 0) {
            long j = this.r;
            long j2 = this.p;
            long j3 = iK;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iK];
                g74.c.F1(j2, bArr, 0L, j3);
                String str = new String(bArr, y54.a);
                this.p += j3;
                return str;
            }
        }
        if (iK > 0 && iK <= J()) {
            byte[] bArr2 = new byte[iK];
            I(iK, bArr2);
            return new String(bArr2, y54.a);
        }
        if (iK == 0) {
            return "";
        }
        if (iK < 0) {
            throw new a64("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.m0
    public final String v() throws a64 {
        String strI;
        int iK = K();
        if (iK > 0) {
            long j = this.r;
            long j2 = this.p;
            long j3 = iK;
            if (j3 <= j - j2) {
                long j4 = j2 - this.q;
                ByteBuffer byteBuffer = this.j;
                int i = (int) j4;
                y24 y24Var = i74.a;
                if (byteBuffer.hasArray()) {
                    int iArrayOffset = byteBuffer.arrayOffset();
                    y24Var.getClass();
                    strI = y24.f(byteBuffer.array(), iArrayOffset + i, iK);
                } else {
                    strI = byteBuffer.isDirect() ? y24.i(byteBuffer, i, iK) : y24.i(byteBuffer, i, iK);
                }
                this.p += j3;
                return strI;
            }
        }
        if (iK >= 0 && iK <= J()) {
            byte[] bArr = new byte[iK];
            I(iK, bArr);
            i74.a.getClass();
            return y24.f(bArr, 0, iK);
        }
        if (iK == 0) {
            return "";
        }
        if (iK <= 0) {
            throw new a64("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.m0
    public final y44 w() throws a64 {
        int iK = K();
        if (iK > 0) {
            long j = this.r;
            long j2 = this.p;
            long j3 = iK;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iK];
                g74.c.F1(j2, bArr, 0L, j3);
                this.p += j3;
                y44 y44Var = a54.g;
                return new y44(bArr);
            }
        }
        if (iK > 0 && iK <= J()) {
            byte[] bArr2 = new byte[iK];
            I(iK, bArr2);
            y44 y44Var2 = a54.g;
            return new y44(bArr2);
        }
        if (iK == 0) {
            return a54.g;
        }
        if (iK < 0) {
            throw new a64("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.m0
    public final int x() {
        return K();
    }

    @Override // defpackage.m0
    public final int y() {
        return K();
    }

    @Override // defpackage.m0
    public final int z() {
        return N();
    }
}
