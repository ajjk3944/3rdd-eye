package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class d54 extends m0 {
    public final InputStream i;
    public final byte[] j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p = Integer.MAX_VALUE;

    public /* synthetic */ d54(InputStream inputStream) {
        Charset charset = y54.a;
        this.i = inputStream;
        this.j = new byte[4096];
        this.k = 0;
        this.m = 0;
        this.o = 0;
    }

    @Override // defpackage.m0
    public final long A() {
        return P();
    }

    @Override // defpackage.m0
    public final int B() {
        return m0.h(L());
    }

    @Override // defpackage.m0
    public final long C() {
        return m0.i(M());
    }

    @Override // defpackage.m0
    public final int D(int i) throws a64 {
        if (i < 0) {
            throw new a64("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.o + this.m + i;
        if (i2 < 0) {
            throw new a64("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.p;
        if (i2 > i3) {
            throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.p = i2;
        F();
        return i3;
    }

    public final void E(int i) throws a64 {
        InputStream inputStream = this.i;
        int i2 = this.k;
        int i3 = this.m;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.m = i3 + i;
            return;
        }
        if (i < 0) {
            throw new a64("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.o;
        int i6 = i5 + i3;
        int i7 = this.p;
        if (i6 + i > i7) {
            E((i7 - i5) - i3);
            throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.o = i6;
        this.k = 0;
        this.m = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        String strValueOf = String.valueOf(inputStream.getClass());
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb.append(strValueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(jSkip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (a64 e) {
                    e.f = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.o += i4;
                F();
                throw th;
            }
        }
        this.o += i4;
        F();
        if (i4 >= i) {
            return;
        }
        int i8 = this.k;
        int i9 = i8 - this.m;
        this.m = i8;
        G(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.k;
            if (i10 <= i11) {
                this.m = i10;
                return;
            } else {
                i9 += i11;
                this.m = i11;
                G(1);
            }
        }
    }

    public final void F() {
        int i = this.k + this.l;
        this.k = i;
        int i2 = this.o + i;
        int i3 = this.p;
        if (i2 <= i3) {
            this.l = 0;
            return;
        }
        int i4 = i2 - i3;
        this.l = i4;
        this.k = i - i4;
    }

    public final void G(int i) throws a64 {
        if (H(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.o) - this.m) {
            throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new a64("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final boolean H(int i) throws IOException {
        InputStream inputStream = this.i;
        int i2 = this.m;
        int i3 = i2 + i;
        int i4 = this.k;
        if (i3 <= i4) {
            throw new IllegalStateException(ga1.k(new StringBuilder(String.valueOf(i).length() + 66), "refillBuffer() called when ", i, " bytes were already available in buffer"));
        }
        int i5 = this.o;
        if (i > (Integer.MAX_VALUE - i5) - i2 || i5 + i2 + i > this.p) {
            return false;
        }
        byte[] bArr = this.j;
        if (i2 > 0) {
            if (i4 > i2) {
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            i5 = this.o + i2;
            this.o = i5;
            i4 = this.k - i2;
            this.k = i4;
            this.m = 0;
        }
        try {
            int i6 = inputStream.read(bArr, i4, Math.min(4096 - i4, (Integer.MAX_VALUE - i5) - i4));
            if (i6 != 0 && i6 >= -1 && i6 <= 4096) {
                if (i6 <= 0) {
                    return false;
                }
                this.k += i6;
                F();
                return this.k >= i || H(i);
            }
            String strValueOf = String.valueOf(inputStream.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + strValueOf.length() + 39 + 41);
            sb.append(strValueOf);
            sb.append("#read(byte[]) returned invalid result: ");
            sb.append(i6);
            sb.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb.toString());
        } catch (a64 e) {
            e.f = true;
            throw e;
        }
    }

    public final byte[] I(int i) throws IOException {
        byte[] bArrJ = J(i);
        if (bArrJ != null) {
            return bArrJ;
        }
        int i2 = this.m;
        int i3 = this.k;
        int i4 = i3 - i2;
        this.o += i3;
        this.m = 0;
        this.k = 0;
        ArrayList arrayListK = K(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.j, i2, bArr, 0, i4);
        int size = arrayListK.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayListK.get(i5);
            i5++;
            byte[] bArr2 = (byte[]) obj;
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    public final byte[] J(int i) throws IOException {
        if (i == 0) {
            return y54.b;
        }
        int i2 = this.o;
        int i3 = this.m;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            throw new a64("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.p;
        if (i4 > i5) {
            E((i5 - i2) - i3);
            throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = this.k - i3;
        int i7 = i - i6;
        InputStream inputStream = this.i;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (a64 e) {
                e.f = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.j, this.m, bArr, 0, i6);
        this.o += this.k;
        this.m = 0;
        this.k = 0;
        while (i6 < i) {
            try {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.o += i8;
                i6 += i8;
            } catch (a64 e2) {
                e2.f = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList K(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.i.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.o += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int L() {
        int i;
        int i2 = this.m;
        int i3 = this.k;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.j;
            byte b = bArr[i2];
            if (b >= 0) {
                this.m = i4;
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
                this.m = i5;
                return i;
            }
        }
        return (int) N();
    }

    public final long M() {
        long j;
        long j2;
        long j3;
        int i = this.m;
        int i2 = this.k;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.j;
            byte b = bArr[i];
            if (b >= 0) {
                this.m = i3;
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
                this.m = i4;
                return j;
            }
        }
        return N();
    }

    public final long N() throws a64 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.m == this.k) {
                G(1);
            }
            int i2 = this.m;
            this.m = i2 + 1;
            j |= (r3 & 127) << i;
            if ((this.j[i2] & 128) == 0) {
                return j;
            }
        }
        throw new a64("CodedInputStream encountered a malformed varint.");
    }

    public final int O() throws a64 {
        int i = this.m;
        if (this.k - i < 4) {
            G(4);
            i = this.m;
        }
        this.m = i + 4;
        byte[] bArr = this.j;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final long P() throws a64 {
        int i = this.m;
        if (this.k - i < 8) {
            G(8);
            i = this.m;
        }
        this.m = i + 8;
        byte[] bArr = this.j;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    @Override // defpackage.m0
    public final void a(int i) {
        this.p = i;
        F();
    }

    @Override // defpackage.m0
    public final boolean c() {
        return this.m == this.k && !H(1);
    }

    @Override // defpackage.m0
    public final int e() {
        return this.o + this.m;
    }

    @Override // defpackage.m0
    public final int j() throws a64 {
        if (c()) {
            this.n = 0;
            return 0;
        }
        int iL = L();
        this.n = iL;
        if ((iL >>> 3) != 0) {
            return iL;
        }
        throw new a64("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.m0
    public final void k(int i) {
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
                E(L());
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
        int i4 = this.k - this.m;
        byte[] bArr = this.j;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.m;
                this.m = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw new a64("CodedInputStream encountered a malformed varint.");
        }
        while (i3 < 10) {
            if (this.m == this.k) {
                G(1);
            }
            int i6 = this.m;
            this.m = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw new a64("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // defpackage.m0
    public final double m() {
        return Double.longBitsToDouble(P());
    }

    @Override // defpackage.m0
    public final float n() {
        return Float.intBitsToFloat(O());
    }

    @Override // defpackage.m0
    public final long o() {
        return M();
    }

    @Override // defpackage.m0
    public final long p() {
        return M();
    }

    @Override // defpackage.m0
    public final int q() {
        return L();
    }

    @Override // defpackage.m0
    public final long r() {
        return P();
    }

    @Override // defpackage.m0
    public final int s() {
        return O();
    }

    @Override // defpackage.m0
    public final boolean t() {
        return M() != 0;
    }

    @Override // defpackage.m0
    public final String u() throws a64 {
        int iL = L();
        byte[] bArr = this.j;
        if (iL > 0) {
            int i = this.k;
            int i2 = this.m;
            if (iL <= i - i2) {
                String str = new String(bArr, i2, iL, y54.a);
                this.m += iL;
                return str;
            }
        }
        if (iL == 0) {
            return "";
        }
        if (iL < 0) {
            throw new a64("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iL > this.k) {
            return new String(I(iL), y54.a);
        }
        G(iL);
        String str2 = new String(bArr, this.m, iL, y54.a);
        this.m += iL;
        return str2;
    }

    @Override // defpackage.m0
    public final String v() throws IOException {
        int iL = L();
        int i = this.m;
        int i2 = this.k;
        int i3 = i2 - i;
        byte[] bArrI = this.j;
        if (iL <= i3 && iL > 0) {
            this.m = i + iL;
        } else {
            if (iL == 0) {
                return "";
            }
            if (iL < 0) {
                throw new a64("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (iL <= i2) {
                G(iL);
                this.m = iL;
            } else {
                bArrI = I(iL);
            }
        }
        i74.a.getClass();
        return y24.f(bArrI, i, iL);
    }

    @Override // defpackage.m0
    public final y44 w() throws IOException {
        int iL = L();
        int i = this.k;
        int i2 = this.m;
        int i3 = i - i2;
        byte[] bArr = this.j;
        if (iL <= i3 && iL > 0) {
            y44 y44VarN = a54.n(bArr, i2, iL);
            this.m += iL;
            return y44VarN;
        }
        if (iL == 0) {
            return a54.g;
        }
        if (iL < 0) {
            throw new a64("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrJ = J(iL);
        if (bArrJ != null) {
            return a54.n(bArrJ, 0, bArrJ.length);
        }
        int i4 = this.m;
        int i5 = this.k;
        int i6 = i5 - i4;
        this.o += i5;
        this.m = 0;
        this.k = 0;
        ArrayList arrayListK = K(iL - i6);
        byte[] bArr2 = new byte[iL];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        int size = arrayListK.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayListK.get(i7);
            i7++;
            byte[] bArr3 = (byte[]) obj;
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i6, length);
            i6 += length;
        }
        y44 y44Var = a54.g;
        return new y44(bArr2);
    }

    @Override // defpackage.m0
    public final int x() {
        return L();
    }

    @Override // defpackage.m0
    public final int y() {
        return L();
    }

    @Override // defpackage.m0
    public final int z() {
        return O();
    }
}
