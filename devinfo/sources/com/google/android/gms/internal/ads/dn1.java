package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.internal.Buffer;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dn1 extends en1 {

    /* renamed from: d, reason: collision with root package name */
    public final InputStream f10528d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f10529e;

    /* renamed from: f, reason: collision with root package name */
    public int f10530f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f10531h;

    /* renamed from: i, reason: collision with root package name */
    public int f10532i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f10533k = Integer.MAX_VALUE;

    public /* synthetic */ dn1(InputStream inputStream) {
        Charset charset = yn1.f18811a;
        this.f10528d = inputStream;
        this.f10529e = new byte[Buffer.SEGMENTING_THRESHOLD];
        this.f10530f = 0;
        this.f10531h = 0;
        this.j = 0;
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final long A() {
        return en1.g(K());
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int B(int i4) throws ao1 {
        if (i4 < 0) {
            throw new ao1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i10 = this.j + this.f10531h + i4;
        if (i10 < 0) {
            throw new ao1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i11 = this.f10533k;
        if (i10 > i11) {
            throw new ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f10533k = i10;
        D();
        return i11;
    }

    public final void C(int i4) throws ao1 {
        InputStream inputStream = this.f10528d;
        int i10 = this.f10530f;
        int i11 = this.f10531h;
        int i12 = i10 - i11;
        if (i4 <= i12 && i4 >= 0) {
            this.f10531h = i11 + i4;
            return;
        }
        if (i4 < 0) {
            throw new ao1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i13 = this.j;
        int i14 = i13 + i11;
        int i15 = this.f10533k;
        if (i14 + i4 > i15) {
            C((i15 - i13) - i11);
            throw new ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.j = i14;
        this.f10530f = 0;
        this.f10531h = 0;
        while (i12 < i4) {
            long j = i4 - i12;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        String strValueOf = String.valueOf(inputStream.getClass());
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb2.append(strValueOf);
                        sb2.append("#skip returned invalid result: ");
                        sb2.append(jSkip);
                        sb2.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i12 += (int) jSkip;
                    }
                } catch (ao1 e2) {
                    e2.f9377a = true;
                    throw e2;
                }
            } catch (Throwable th2) {
                this.j += i12;
                D();
                throw th2;
            }
        }
        this.j += i12;
        D();
        if (i12 >= i4) {
            return;
        }
        int i16 = this.f10530f;
        int i17 = i16 - this.f10531h;
        this.f10531h = i16;
        E(1);
        while (true) {
            int i18 = i4 - i17;
            int i19 = this.f10530f;
            if (i18 <= i19) {
                this.f10531h = i18;
                return;
            } else {
                i17 += i19;
                this.f10531h = i19;
                E(1);
            }
        }
    }

    public final void D() {
        int i4 = this.f10530f + this.g;
        this.f10530f = i4;
        int i10 = this.j + i4;
        int i11 = this.f10533k;
        if (i10 <= i11) {
            this.g = 0;
            return;
        }
        int i12 = i10 - i11;
        this.g = i12;
        this.f10530f = i4 - i12;
    }

    public final void E(int i4) throws ao1 {
        if (F(i4)) {
            return;
        }
        if (i4 <= (Integer.MAX_VALUE - this.j) - this.f10531h) {
            throw new ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new ao1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final boolean F(int i4) throws IOException {
        InputStream inputStream = this.f10528d;
        int i10 = this.f10531h;
        int i11 = i10 + i4;
        int i12 = this.f10530f;
        if (i11 <= i12) {
            throw new IllegalStateException(je.u.v(new StringBuilder(String.valueOf(i4).length() + 66), "refillBuffer() called when ", i4, " bytes were already available in buffer"));
        }
        int i13 = this.j;
        if (i4 > (Integer.MAX_VALUE - i13) - i10 || i13 + i10 + i4 > this.f10533k) {
            return false;
        }
        byte[] bArr = this.f10529e;
        if (i10 > 0) {
            if (i12 > i10) {
                System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
            }
            i13 = this.j + i10;
            this.j = i13;
            i12 = this.f10530f - i10;
            this.f10530f = i12;
            this.f10531h = 0;
        }
        try {
            int i14 = inputStream.read(bArr, i12, Math.min(4096 - i12, (Integer.MAX_VALUE - i13) - i12));
            if (i14 != 0 && i14 >= -1 && i14 <= 4096) {
                if (i14 <= 0) {
                    return false;
                }
                this.f10530f += i14;
                D();
                return this.f10530f >= i4 || F(i4);
            }
            String strValueOf = String.valueOf(inputStream.getClass());
            StringBuilder sb2 = new StringBuilder(String.valueOf(i14).length() + strValueOf.length() + 39 + 41);
            sb2.append(strValueOf);
            sb2.append("#read(byte[]) returned invalid result: ");
            sb2.append(i14);
            sb2.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb2.toString());
        } catch (ao1 e2) {
            e2.f9377a = true;
            throw e2;
        }
    }

    public final byte[] G(int i4) throws IOException {
        byte[] bArrH = H(i4);
        if (bArrH != null) {
            return bArrH;
        }
        int i10 = this.f10531h;
        int i11 = this.f10530f;
        int i12 = i11 - i10;
        this.j += i11;
        this.f10531h = 0;
        this.f10530f = 0;
        ArrayList arrayListI = I(i4 - i12);
        byte[] bArr = new byte[i4];
        System.arraycopy(this.f10529e, i10, bArr, 0, i12);
        int size = arrayListI.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayListI.get(i13);
            i13++;
            byte[] bArr2 = (byte[]) obj;
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i12, length);
            i12 += length;
        }
        return bArr;
    }

    public final byte[] H(int i4) throws IOException {
        if (i4 == 0) {
            return yn1.f18812b;
        }
        int i10 = this.j;
        int i11 = this.f10531h;
        int i12 = i10 + i11 + i4;
        if ((-2147483647) + i12 > 0) {
            throw new ao1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i13 = this.f10533k;
        if (i12 > i13) {
            C((i13 - i10) - i11);
            throw new ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = this.f10530f - i11;
        int i15 = i4 - i14;
        InputStream inputStream = this.f10528d;
        if (i15 >= 4096) {
            try {
                if (i15 > inputStream.available()) {
                    return null;
                }
            } catch (ao1 e2) {
                e2.f9377a = true;
                throw e2;
            }
        }
        byte[] bArr = new byte[i4];
        System.arraycopy(this.f10529e, this.f10531h, bArr, 0, i14);
        this.j += this.f10530f;
        this.f10531h = 0;
        this.f10530f = 0;
        while (i14 < i4) {
            try {
                int i16 = inputStream.read(bArr, i14, i4 - i14);
                if (i16 == -1) {
                    throw new ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.j += i16;
                i14 += i16;
            } catch (ao1 e10) {
                e10.f9377a = true;
                throw e10;
            }
        }
        return bArr;
    }

    public final ArrayList I(int i4) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i4 > 0) {
            int iMin = Math.min(i4, Buffer.SEGMENTING_THRESHOLD);
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = this.f10528d.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    throw new ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.j += i11;
                i10 += i11;
            }
            i4 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int J() {
        int i4;
        int i10 = this.f10531h;
        int i11 = this.f10530f;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f10529e;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f10531h = i12;
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
                this.f10531h = i13;
                return i4;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j;
        long j8;
        long j9;
        int i4 = this.f10531h;
        int i10 = this.f10530f;
        if (i10 != i4) {
            int i11 = i4 + 1;
            byte[] bArr = this.f10529e;
            byte b10 = bArr[i4];
            if (b10 >= 0) {
                this.f10531h = i11;
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
                this.f10531h = i12;
                return j;
            }
        }
        return L();
    }

    public final long L() throws ao1 {
        long j = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            if (this.f10531h == this.f10530f) {
                E(1);
            }
            int i10 = this.f10531h;
            this.f10531h = i10 + 1;
            j |= (r3 & 127) << i4;
            if ((this.f10529e[i10] & 128) == 0) {
                return j;
            }
        }
        throw new ao1("CodedInputStream encountered a malformed varint.");
    }

    public final int M() throws ao1 {
        int i4 = this.f10531h;
        if (this.f10530f - i4 < 4) {
            E(4);
            i4 = this.f10531h;
        }
        this.f10531h = i4 + 4;
        byte[] bArr = this.f10529e;
        int i10 = bArr[i4] & 255;
        int i11 = bArr[i4 + 1] & 255;
        int i12 = bArr[i4 + 2] & 255;
        return ((bArr[i4 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final long N() throws ao1 {
        int i4 = this.f10531h;
        if (this.f10530f - i4 < 8) {
            E(8);
            i4 = this.f10531h;
        }
        this.f10531h = i4 + 8;
        byte[] bArr = this.f10529e;
        long j = bArr[i4];
        long j8 = bArr[i4 + 2];
        long j9 = bArr[i4 + 3];
        return ((bArr[i4 + 6] & 255) << 48) | (j & 255) | ((bArr[i4 + 1] & 255) << 8) | ((j8 & 255) << 16) | ((j9 & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 7] & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final void a(int i4) {
        this.f10533k = i4;
        D();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final boolean b() {
        return this.f10531h == this.f10530f && !F(1);
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int c() {
        return this.j + this.f10531h;
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int h() throws ao1 {
        if (b()) {
            this.f10532i = 0;
            return 0;
        }
        int iJ = J();
        this.f10532i = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw new ao1("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final void i(int i4) {
        if (this.f10532i != i4) {
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
                C(J());
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
        int i12 = this.f10530f - this.f10531h;
        byte[] bArr = this.f10529e;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f10531h;
                this.f10531h = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw new ao1("CodedInputStream encountered a malformed varint.");
        }
        while (i11 < 10) {
            if (this.f10531h == this.f10530f) {
                E(1);
            }
            int i14 = this.f10531h;
            this.f10531h = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw new ao1("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final double k() {
        return Double.longBitsToDouble(N());
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final float l() {
        return Float.intBitsToFloat(M());
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final long m() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final long n() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int o() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final long p() {
        return N();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int q() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final boolean r() {
        return K() != 0;
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final String s() throws ao1 {
        int iJ = J();
        byte[] bArr = this.f10529e;
        if (iJ > 0) {
            int i4 = this.f10530f;
            int i10 = this.f10531h;
            if (iJ <= i4 - i10) {
                String str = new String(bArr, i10, iJ, yn1.f18811a);
                this.f10531h += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw new ao1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iJ > this.f10530f) {
            return new String(G(iJ), yn1.f18811a);
        }
        E(iJ);
        String str2 = new String(bArr, this.f10531h, iJ, yn1.f18811a);
        this.f10531h += iJ;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final String t() throws IOException {
        int iJ = J();
        int i4 = this.f10531h;
        int i10 = this.f10530f;
        int i11 = i10 - i4;
        byte[] bArrG = this.f10529e;
        if (iJ <= i11 && iJ > 0) {
            this.f10531h = i4 + iJ;
        } else {
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw new ao1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i4 = 0;
            if (iJ <= i10) {
                E(iJ);
                this.f10531h = iJ;
            } else {
                bArrG = G(iJ);
            }
        }
        return kp1.d(i4, iJ, bArrG);
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final zm1 u() throws IOException {
        int iJ = J();
        int i4 = this.f10530f;
        int i10 = this.f10531h;
        int i11 = i4 - i10;
        byte[] bArr = this.f10529e;
        if (iJ <= i11 && iJ > 0) {
            zm1 zm1VarW = bn1.w(i10, iJ, bArr);
            this.f10531h += iJ;
            return zm1VarW;
        }
        if (iJ == 0) {
            return bn1.f9729b;
        }
        if (iJ < 0) {
            throw new ao1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrH = H(iJ);
        if (bArrH != null) {
            return bn1.w(0, bArrH.length, bArrH);
        }
        int i12 = this.f10531h;
        int i13 = this.f10530f;
        int i14 = i13 - i12;
        this.j += i13;
        this.f10531h = 0;
        this.f10530f = 0;
        ArrayList arrayListI = I(iJ - i14);
        byte[] bArr2 = new byte[iJ];
        System.arraycopy(bArr, i12, bArr2, 0, i14);
        int size = arrayListI.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayListI.get(i15);
            i15++;
            byte[] bArr3 = (byte[]) obj;
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i14, length);
            i14 += length;
        }
        zm1 zm1Var = bn1.f9729b;
        try {
            return new zm1(bArr2);
        } catch (ao1 e2) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int v() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int w() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int x() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final long y() {
        return N();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int z() {
        return en1.f(J());
    }
}
