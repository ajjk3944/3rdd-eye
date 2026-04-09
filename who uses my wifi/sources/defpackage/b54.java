package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b54 extends m0 {
    public final byte[] i;
    public int j;
    public int k;
    public int l;
    public final int m;
    public int n;
    public int o = Integer.MAX_VALUE;

    public /* synthetic */ b54(byte[] bArr, int i, int i2) {
        this.i = bArr;
        this.j = i2 + i;
        this.l = i;
        this.m = i;
    }

    @Override // defpackage.m0
    public final long A() {
        return K();
    }

    @Override // defpackage.m0
    public final int B() {
        return m0.h(G());
    }

    @Override // defpackage.m0
    public final long C() {
        return m0.i(H());
    }

    @Override // defpackage.m0
    public final int D(int i) throws a64 {
        if (i < 0) {
            throw new a64("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = (this.l - this.m) + i;
        if (i2 < 0) {
            throw new a64("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.o;
        if (i2 > i3) {
            throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.o = i2;
        F();
        return i3;
    }

    public final void E(int i) throws a64 {
        if (i >= 0) {
            int i2 = this.j;
            int i3 = this.l;
            if (i <= i2 - i3) {
                this.l = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new a64("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final void F() {
        int i = this.j + this.k;
        this.j = i;
        int i2 = i - this.m;
        int i3 = this.o;
        if (i2 <= i3) {
            this.k = 0;
            return;
        }
        int i4 = i2 - i3;
        this.k = i4;
        this.j = i - i4;
    }

    public final int G() {
        int i;
        int i2 = this.l;
        int i3 = this.j;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.i;
            byte b = bArr[i2];
            if (b >= 0) {
                this.l = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.l = i5;
                return i;
            }
        }
        return (int) I();
    }

    public final long H() {
        long j;
        long j2;
        long j3;
        int i = this.l;
        int i2 = this.j;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.i;
            byte b = bArr[i];
            if (b >= 0) {
                this.l = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            i6 = i + 5;
                            long j5 = i9 ^ (bArr[i8] << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j6 = j5 ^ (bArr[i6] << 35);
                                if (j6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i6 = i + 7;
                                    j5 = j6 ^ (bArr[i10] << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j6 = j5 ^ (bArr[i6] << 49);
                                        if (j6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i6 = i + 9;
                                            long j7 = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                int i11 = i + 10;
                                                if (bArr[i6] >= 0) {
                                                    j = j7;
                                                    i4 = i11;
                                                }
                                            } else {
                                                j = j7;
                                            }
                                        }
                                    }
                                }
                                j = j6 ^ j2;
                                i4 = i10;
                            }
                            j = j5 ^ j3;
                        }
                    }
                    i4 = i6;
                }
                this.l = i4;
                return j;
            }
        }
        return I();
    }

    public final long I() throws a64 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.l;
            if (i2 == this.j) {
                throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.l = i2 + 1;
            j |= (r3 & 127) << i;
            if ((this.i[i2] & 128) == 0) {
                return j;
            }
        }
        throw new a64("CodedInputStream encountered a malformed varint.");
    }

    public final int J() throws a64 {
        int i = this.l;
        if (this.j - i < 4) {
            throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.l = i + 4;
        byte[] bArr = this.i;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final long K() throws a64 {
        int i = this.l;
        if (this.j - i < 8) {
            throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.l = i + 8;
        byte[] bArr = this.i;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    @Override // defpackage.m0
    public final void a(int i) {
        this.o = i;
        F();
    }

    @Override // defpackage.m0
    public final boolean c() {
        return this.l == this.j;
    }

    @Override // defpackage.m0
    public final int e() {
        return this.l - this.m;
    }

    @Override // defpackage.m0
    public final int j() throws a64 {
        if (c()) {
            this.n = 0;
            return 0;
        }
        int iG = G();
        this.n = iG;
        if ((iG >>> 3) != 0) {
            return iG;
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
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                E(8);
                return true;
            }
            if (i2 == 2) {
                E(G());
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
            E(4);
            return true;
        }
        int i4 = this.j - this.l;
        byte[] bArr = this.i;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.l;
                this.l = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw new a64("CodedInputStream encountered a malformed varint.");
        }
        while (i3 < 10) {
            int i6 = this.l;
            if (i6 == this.j) {
                throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.l = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw new a64("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // defpackage.m0
    public final double m() {
        return Double.longBitsToDouble(K());
    }

    @Override // defpackage.m0
    public final float n() {
        return Float.intBitsToFloat(J());
    }

    @Override // defpackage.m0
    public final long o() {
        return H();
    }

    @Override // defpackage.m0
    public final long p() {
        return H();
    }

    @Override // defpackage.m0
    public final int q() {
        return G();
    }

    @Override // defpackage.m0
    public final long r() {
        return K();
    }

    @Override // defpackage.m0
    public final int s() {
        return J();
    }

    @Override // defpackage.m0
    public final boolean t() {
        return H() != 0;
    }

    @Override // defpackage.m0
    public final String u() throws a64 {
        int iG = G();
        if (iG > 0) {
            int i = this.j;
            int i2 = this.l;
            if (iG <= i - i2) {
                String str = new String(this.i, i2, iG, y54.a);
                this.l += iG;
                return str;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG < 0) {
            throw new a64("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.m0
    public final String v() throws a64 {
        int iG = G();
        if (iG > 0) {
            int i = this.j;
            int i2 = this.l;
            if (iG <= i - i2) {
                i74.a.getClass();
                String strF = y24.f(this.i, i2, iG);
                this.l += iG;
                return strF;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG <= 0) {
            throw new a64("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.m0
    public final y44 w() throws a64 {
        int iG = G();
        byte[] bArr = this.i;
        if (iG > 0) {
            int i = this.j;
            int i2 = this.l;
            if (iG <= i - i2) {
                y44 y44VarN = a54.n(bArr, i2, iG);
                this.l += iG;
                return y44VarN;
            }
        }
        if (iG == 0) {
            return a54.g;
        }
        if (iG > 0) {
            int i3 = this.j;
            int i4 = this.l;
            if (iG <= i3 - i4) {
                int i5 = iG + i4;
                this.l = i5;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
                y44 y44Var = a54.g;
                return new y44(bArrCopyOfRange);
            }
        }
        if (iG <= 0) {
            throw new a64("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.m0
    public final int x() {
        return G();
    }

    @Override // defpackage.m0
    public final int y() {
        return G();
    }

    @Override // defpackage.m0
    public final int z() {
        return J();
    }
}
