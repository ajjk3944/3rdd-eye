package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class RK extends D5.b {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f10892d;

    /* renamed from: e, reason: collision with root package name */
    public int f10893e;

    /* renamed from: f, reason: collision with root package name */
    public int f10894f;

    /* renamed from: g, reason: collision with root package name */
    public int f10895g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10896h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f10897j = Integer.MAX_VALUE;

    public /* synthetic */ RK(int i, int i3, byte[] bArr) {
        this.f10892d = bArr;
        this.f10893e = i3 + i;
        this.f10895g = i;
        this.f10896h = i;
    }

    @Override // D5.b
    public final OK A() throws C1636oL {
        int iK = K();
        byte[] bArr = this.f10892d;
        if (iK > 0) {
            int i = this.f10893e;
            int i3 = this.f10895g;
            if (iK <= i - i3) {
                OK okS = QK.s(i3, iK, bArr);
                this.f10895g += iK;
                return okS;
            }
        }
        if (iK == 0) {
            return QK.f10609b;
        }
        if (iK > 0) {
            int i6 = this.f10893e;
            int i7 = this.f10895g;
            if (iK <= i6 - i7) {
                int i8 = iK + i7;
                this.f10895g = i8;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i7, i8);
                OK ok = QK.f10609b;
                return new OK(bArrCopyOfRange);
            }
        }
        if (iK <= 0) {
            throw new C1636oL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new C1636oL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // D5.b
    public final int B() {
        return K();
    }

    @Override // D5.b
    public final int C() {
        return K();
    }

    @Override // D5.b
    public final int D() {
        return N();
    }

    @Override // D5.b
    public final long E() {
        return O();
    }

    @Override // D5.b
    public final int F() {
        return D5.b.l(K());
    }

    @Override // D5.b
    public final long G() {
        return D5.b.m(L());
    }

    @Override // D5.b
    public final int H(int i) {
        if (i < 0) {
            throw new C1636oL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = (this.f10895g - this.f10896h) + i;
        if (i3 < 0) {
            throw new C1636oL("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i6 = this.f10897j;
        if (i3 > i6) {
            throw new C1636oL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f10897j = i3;
        J();
        return i6;
    }

    public final void I(int i) throws C1636oL {
        if (i >= 0) {
            int i3 = this.f10893e;
            int i6 = this.f10895g;
            if (i <= i3 - i6) {
                this.f10895g = i6 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new C1636oL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C1636oL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final void J() {
        int i = this.f10893e + this.f10894f;
        this.f10893e = i;
        int i3 = i - this.f10896h;
        int i6 = this.f10897j;
        if (i3 <= i6) {
            this.f10894f = 0;
            return;
        }
        int i7 = i3 - i6;
        this.f10894f = i7;
        this.f10893e = i - i7;
    }

    public final int K() {
        int i;
        int i3 = this.f10895g;
        int i6 = this.f10893e;
        if (i6 != i3) {
            int i7 = i3 + 1;
            byte[] bArr = this.f10892d;
            byte b5 = bArr[i3];
            if (b5 >= 0) {
                this.f10895g = i7;
                return b5;
            }
            if (i6 - i7 >= 9) {
                int i8 = i3 + 2;
                int i9 = (bArr[i7] << 7) ^ b5;
                if (i9 < 0) {
                    i = i9 ^ (-128);
                } else {
                    int i10 = i3 + 3;
                    int i11 = (bArr[i8] << 14) ^ i9;
                    if (i11 >= 0) {
                        i = i11 ^ 16256;
                    } else {
                        int i12 = i3 + 4;
                        int i13 = i11 ^ (bArr[i10] << 21);
                        if (i13 < 0) {
                            i = (-2080896) ^ i13;
                        } else {
                            i10 = i3 + 5;
                            byte b6 = bArr[i12];
                            int i14 = (i13 ^ (b6 << 28)) ^ 266354560;
                            if (b6 < 0) {
                                i12 = i3 + 6;
                                if (bArr[i10] < 0) {
                                    i10 = i3 + 7;
                                    if (bArr[i12] < 0) {
                                        i12 = i3 + 8;
                                        if (bArr[i10] < 0) {
                                            i10 = i3 + 9;
                                            if (bArr[i12] < 0) {
                                                int i15 = i3 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i8 = i15;
                                                    i = i14;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i14;
                            }
                            i = i14;
                        }
                        i8 = i12;
                    }
                    i8 = i10;
                }
                this.f10895g = i8;
                return i;
            }
        }
        return (int) M();
    }

    public final long L() {
        long j6;
        long j7;
        long j8;
        int i = this.f10895g;
        int i3 = this.f10893e;
        if (i3 != i) {
            int i6 = i + 1;
            byte[] bArr = this.f10892d;
            byte b5 = bArr[i];
            if (b5 >= 0) {
                this.f10895g = i6;
                return b5;
            }
            if (i3 - i6 >= 9) {
                int i7 = i + 2;
                int i8 = (bArr[i6] << 7) ^ b5;
                if (i8 < 0) {
                    j6 = i8 ^ (-128);
                } else {
                    int i9 = i + 3;
                    int i10 = (bArr[i7] << 14) ^ i8;
                    if (i10 >= 0) {
                        j6 = i10 ^ 16256;
                    } else {
                        int i11 = i + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            long j9 = (-2080896) ^ i12;
                            i7 = i11;
                            j6 = j9;
                        } else {
                            i9 = i + 5;
                            long j10 = i12 ^ (bArr[i11] << 28);
                            if (j10 >= 0) {
                                j7 = 266354560;
                            } else {
                                int i13 = i + 6;
                                long j11 = j10 ^ (bArr[i9] << 35);
                                if (j11 < 0) {
                                    j8 = -34093383808L;
                                } else {
                                    i9 = i + 7;
                                    j10 = j11 ^ (bArr[i13] << 42);
                                    if (j10 >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        i13 = i + 8;
                                        j11 = j10 ^ (bArr[i9] << 49);
                                        if (j11 < 0) {
                                            j8 = -558586000294016L;
                                        } else {
                                            i9 = i + 9;
                                            j10 = j11 ^ (bArr[i13] << 56);
                                            if (j10 >= 0) {
                                                j7 = 71499008037633920L;
                                            } else {
                                                int i14 = i + 10;
                                                long j12 = j10 ^ (bArr[i9] << 63);
                                                if (j12 >= 0) {
                                                    j6 = j12 ^ (-9151873028817141888L);
                                                    i7 = i14;
                                                }
                                            }
                                        }
                                    }
                                }
                                j6 = j11 ^ j8;
                                i7 = i13;
                            }
                            j6 = j10 ^ j7;
                        }
                    }
                    i7 = i9;
                }
                this.f10895g = i7;
                return j6;
            }
        }
        return M();
    }

    public final long M() throws C1636oL {
        long j6 = 0;
        for (int i = 0; i < 64; i += 7) {
            int i3 = this.f10895g;
            if (i3 == this.f10893e) {
                throw new C1636oL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f10895g = i3 + 1;
            j6 |= (r3 & 127) << i;
            if ((this.f10892d[i3] & 128) == 0) {
                return j6;
            }
        }
        throw new C1636oL("CodedInputStream encountered a malformed varint.");
    }

    public final int N() throws C1636oL {
        int i = this.f10895g;
        if (this.f10893e - i < 4) {
            throw new C1636oL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f10895g = i + 4;
        byte[] bArr = this.f10892d;
        int i3 = bArr[i] & 255;
        int i6 = bArr[i + 1] & 255;
        int i7 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i6 << 8) | i3 | (i7 << 16);
    }

    public final long O() throws C1636oL {
        int i = this.f10895g;
        if (this.f10893e - i < 8) {
            throw new C1636oL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f10895g = i + 8;
        byte[] bArr = this.f10892d;
        long j6 = bArr[i];
        long j7 = bArr[i + 2];
        long j8 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j6 & 255) | ((bArr[i + 1] & 255) << 8) | ((j7 & 255) << 16) | ((j8 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    @Override // D5.b
    public final void f(int i) {
        this.f10897j = i;
        J();
    }

    @Override // D5.b
    public final boolean g() {
        return this.f10895g == this.f10893e;
    }

    @Override // D5.b
    public final int h() {
        return this.f10895g - this.f10896h;
    }

    @Override // D5.b
    public final int n() throws C1636oL {
        if (g()) {
            this.i = 0;
            return 0;
        }
        int iK = K();
        this.i = iK;
        if ((iK >>> 3) != 0) {
            return iK;
        }
        throw new C1636oL("Protocol message contained an invalid tag (zero).");
    }

    @Override // D5.b
    public final void o(int i) throws C1636oL {
        if (this.i != i) {
            throw new C1636oL("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // D5.b
    public final boolean p(int i) throws C1636oL {
        int i3 = i & 7;
        int i6 = 0;
        if (i3 != 0) {
            if (i3 == 1) {
                I(8);
                return true;
            }
            if (i3 == 2) {
                I(K());
                return true;
            }
            if (i3 == 3) {
                j();
                o(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i3 == 4) {
                if (this.f1295b == 0) {
                    o(0);
                }
                return false;
            }
            if (i3 != 5) {
                throw new C1582nL();
            }
            I(4);
            return true;
        }
        int i7 = this.f10893e - this.f10895g;
        byte[] bArr = this.f10892d;
        if (i7 >= 10) {
            while (i6 < 10) {
                int i8 = this.f10895g;
                this.f10895g = i8 + 1;
                if (bArr[i8] < 0) {
                    i6++;
                }
            }
            throw new C1636oL("CodedInputStream encountered a malformed varint.");
        }
        while (i6 < 10) {
            int i9 = this.f10895g;
            if (i9 == this.f10893e) {
                throw new C1636oL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f10895g = i9 + 1;
            if (bArr[i9] < 0) {
                i6++;
            }
        }
        throw new C1636oL("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // D5.b
    public final double q() {
        return Double.longBitsToDouble(O());
    }

    @Override // D5.b
    public final float r() {
        return Float.intBitsToFloat(N());
    }

    @Override // D5.b
    public final long s() {
        return L();
    }

    @Override // D5.b
    public final long t() {
        return L();
    }

    @Override // D5.b
    public final int u() {
        return K();
    }

    @Override // D5.b
    public final long v() {
        return O();
    }

    @Override // D5.b
    public final int w() {
        return N();
    }

    @Override // D5.b
    public final boolean x() {
        return L() != 0;
    }

    @Override // D5.b
    public final String y() throws C1636oL {
        int iK = K();
        if (iK > 0) {
            int i = this.f10893e;
            int i3 = this.f10895g;
            if (iK <= i - i3) {
                String str = new String(this.f10892d, i3, iK, AbstractC1528mL.f15610a);
                this.f10895g += iK;
                return str;
            }
        }
        if (iK == 0) {
            return "";
        }
        if (iK < 0) {
            throw new C1636oL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new C1636oL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // D5.b
    public final String z() throws C1636oL {
        int iK = K();
        if (iK > 0) {
            int i = this.f10893e;
            int i3 = this.f10895g;
            if (iK <= i - i3) {
                String strD = YL.d(i3, iK, this.f10892d);
                this.f10895g += iK;
                return strD;
            }
        }
        if (iK == 0) {
            return "";
        }
        if (iK <= 0) {
            throw new C1636oL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new C1636oL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
