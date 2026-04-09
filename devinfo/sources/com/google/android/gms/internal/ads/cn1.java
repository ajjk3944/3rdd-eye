package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cn1 extends en1 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f10175d;

    /* renamed from: e, reason: collision with root package name */
    public int f10176e;

    /* renamed from: f, reason: collision with root package name */
    public int f10177f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10178h;

    /* renamed from: i, reason: collision with root package name */
    public int f10179i;
    public int j = Integer.MAX_VALUE;

    public /* synthetic */ cn1(byte[] bArr, int i4, int i10) {
        this.f10175d = bArr;
        this.f10176e = i10 + i4;
        this.g = i4;
        this.f10178h = i4;
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final long A() {
        return en1.g(F());
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int B(int i4) throws ao1 {
        if (i4 < 0) {
            throw new ao1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i10 = (this.g - this.f10178h) + i4;
        if (i10 < 0) {
            throw new ao1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i11 = this.j;
        if (i10 > i11) {
            throw new ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.j = i10;
        D();
        return i11;
    }

    public final void C(int i4) throws ao1 {
        if (i4 >= 0) {
            int i10 = this.f10176e;
            int i11 = this.g;
            if (i4 <= i10 - i11) {
                this.g = i11 + i4;
                return;
            }
        }
        if (i4 >= 0) {
            throw new ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new ao1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final void D() {
        int i4 = this.f10176e + this.f10177f;
        this.f10176e = i4;
        int i10 = i4 - this.f10178h;
        int i11 = this.j;
        if (i10 <= i11) {
            this.f10177f = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f10177f = i12;
        this.f10176e = i4 - i12;
    }

    public final int E() {
        int i4;
        int i10 = this.g;
        int i11 = this.f10176e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f10175d;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.g = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    i4 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i4 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i4 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b11 = bArr[i17];
                            int i19 = (i18 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i4 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i4 = i19;
                            }
                            i4 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.g = i13;
                return i4;
            }
        }
        return (int) G();
    }

    public final long F() {
        long j;
        long j8;
        long j9;
        int i4 = this.g;
        int i10 = this.f10176e;
        if (i10 != i4) {
            int i11 = i4 + 1;
            byte[] bArr = this.f10175d;
            byte b10 = bArr[i4];
            if (b10 >= 0) {
                this.g = i11;
                return b10;
            }
            if (i10 - i11 >= 9) {
                int i12 = i4 + 2;
                int i13 = (bArr[i11] << 7) ^ b10;
                if (i13 < 0) {
                    j = i13 ^ (-128);
                } else {
                    int i14 = i4 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j = i15 ^ 16256;
                    } else {
                        int i16 = i4 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            long j10 = (-2080896) ^ i17;
                            i12 = i16;
                            j = j10;
                        } else {
                            i14 = i4 + 5;
                            long j11 = i17 ^ (bArr[i16] << 28);
                            if (j11 >= 0) {
                                j8 = 266354560;
                            } else {
                                int i18 = i4 + 6;
                                long j12 = j11 ^ (bArr[i14] << 35);
                                if (j12 < 0) {
                                    j9 = -34093383808L;
                                } else {
                                    i14 = i4 + 7;
                                    j11 = j12 ^ (bArr[i18] << 42);
                                    if (j11 >= 0) {
                                        j8 = 4363953127296L;
                                    } else {
                                        i18 = i4 + 8;
                                        j12 = j11 ^ (bArr[i14] << 49);
                                        if (j12 < 0) {
                                            j9 = -558586000294016L;
                                        } else {
                                            i14 = i4 + 9;
                                            j11 = j12 ^ (bArr[i18] << 56);
                                            if (j11 >= 0) {
                                                j8 = 71499008037633920L;
                                            } else {
                                                int i19 = i4 + 10;
                                                long j13 = j11 ^ (bArr[i14] << 63);
                                                if (j13 >= 0) {
                                                    j = j13 ^ (-9151873028817141888L);
                                                    i12 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j12 ^ j9;
                                i12 = i18;
                            }
                            j = j11 ^ j8;
                        }
                    }
                    i12 = i14;
                }
                this.g = i12;
                return j;
            }
        }
        return G();
    }

    public final long G() throws ao1 {
        long j = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            int i10 = this.g;
            if (i10 == this.f10176e) {
                throw new ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.g = i10 + 1;
            j |= (r3 & 127) << i4;
            if ((this.f10175d[i10] & 128) == 0) {
                return j;
            }
        }
        throw new ao1("CodedInputStream encountered a malformed varint.");
    }

    public final int H() throws ao1 {
        int i4 = this.g;
        if (this.f10176e - i4 < 4) {
            throw new ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.g = i4 + 4;
        byte[] bArr = this.f10175d;
        int i10 = bArr[i4] & 255;
        int i11 = bArr[i4 + 1] & 255;
        int i12 = bArr[i4 + 2] & 255;
        return ((bArr[i4 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final long I() throws ao1 {
        int i4 = this.g;
        if (this.f10176e - i4 < 8) {
            throw new ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.g = i4 + 8;
        byte[] bArr = this.f10175d;
        long j = bArr[i4];
        long j8 = bArr[i4 + 2];
        long j9 = bArr[i4 + 3];
        return ((bArr[i4 + 6] & 255) << 48) | (j & 255) | ((bArr[i4 + 1] & 255) << 8) | ((j8 & 255) << 16) | ((j9 & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 7] & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final void a(int i4) {
        this.j = i4;
        D();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final boolean b() {
        return this.g == this.f10176e;
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int c() {
        return this.g - this.f10178h;
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int h() throws ao1 {
        if (b()) {
            this.f10179i = 0;
            return 0;
        }
        int iE = E();
        this.f10179i = iE;
        if ((iE >>> 3) != 0) {
            return iE;
        }
        throw new ao1("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final void i(int i4) throws ao1 {
        if (this.f10179i != i4) {
            throw new ao1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final boolean j(int i4) throws ao1 {
        int i10 = i4 & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                C(8);
                return true;
            }
            if (i10 == 2) {
                C(E());
                return true;
            }
            if (i10 == 3) {
                e();
                i(((i4 >>> 3) << 3) | 4);
                return true;
            }
            if (i10 == 4) {
                if (this.f10837b == 0) {
                    i(0);
                }
                return false;
            }
            if (i10 != 5) {
                throw new zn1();
            }
            C(4);
            return true;
        }
        int i12 = this.f10176e - this.g;
        byte[] bArr = this.f10175d;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.g;
                this.g = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw new ao1("CodedInputStream encountered a malformed varint.");
        }
        while (i11 < 10) {
            int i14 = this.g;
            if (i14 == this.f10176e) {
                throw new ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.g = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw new ao1("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final double k() {
        return Double.longBitsToDouble(I());
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final float l() {
        return Float.intBitsToFloat(H());
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final long m() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final long n() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int o() {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final long p() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int q() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final boolean r() {
        return F() != 0;
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final String s() throws ao1 {
        int iE = E();
        if (iE > 0) {
            int i4 = this.f10176e;
            int i10 = this.g;
            if (iE <= i4 - i10) {
                String str = new String(this.f10175d, i10, iE, yn1.f18811a);
                this.g += iE;
                return str;
            }
        }
        if (iE == 0) {
            return "";
        }
        if (iE < 0) {
            throw new ao1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final String t() throws ao1 {
        int iE = E();
        if (iE > 0) {
            int i4 = this.f10176e;
            int i10 = this.g;
            if (iE <= i4 - i10) {
                String strD = kp1.d(i10, iE, this.f10175d);
                this.g += iE;
                return strD;
            }
        }
        if (iE == 0) {
            return "";
        }
        if (iE <= 0) {
            throw new ao1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final zm1 u() throws ao1 {
        int iE = E();
        byte[] bArr = this.f10175d;
        if (iE > 0) {
            int i4 = this.f10176e;
            int i10 = this.g;
            if (iE <= i4 - i10) {
                zm1 zm1VarW = bn1.w(i10, iE, bArr);
                this.g += iE;
                return zm1VarW;
            }
        }
        if (iE == 0) {
            return bn1.f9729b;
        }
        if (iE > 0) {
            int i11 = this.f10176e;
            int i12 = this.g;
            if (iE <= i11 - i12) {
                int i13 = iE + i12;
                this.g = i13;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i12, i13);
                zm1 zm1Var = bn1.f9729b;
                return new zm1(bArrCopyOfRange);
            }
        }
        if (iE <= 0) {
            throw new ao1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int v() {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int w() {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int x() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final long y() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int z() {
        return en1.f(E());
    }
}
