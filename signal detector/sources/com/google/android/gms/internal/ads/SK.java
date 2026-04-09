package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class SK extends D5.b {

    /* renamed from: d, reason: collision with root package name */
    public final InputStream f11170d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f11171e;

    /* renamed from: f, reason: collision with root package name */
    public int f11172f;

    /* renamed from: g, reason: collision with root package name */
    public int f11173g;

    /* renamed from: h, reason: collision with root package name */
    public int f11174h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f11175j;

    /* renamed from: k, reason: collision with root package name */
    public int f11176k = Integer.MAX_VALUE;

    public /* synthetic */ SK(InputStream inputStream) {
        Charset charset = AbstractC1528mL.f15610a;
        this.f11170d = inputStream;
        this.f11171e = new byte[4096];
        this.f11172f = 0;
        this.f11174h = 0;
        this.f11175j = 0;
    }

    @Override // D5.b
    public final OK A() throws IOException {
        int iP = P();
        int i = this.f11172f;
        int i3 = this.f11174h;
        int i6 = i - i3;
        byte[] bArr = this.f11171e;
        if (iP <= i6 && iP > 0) {
            OK okS = QK.s(i3, iP, bArr);
            this.f11174h += iP;
            return okS;
        }
        if (iP == 0) {
            return QK.f10609b;
        }
        if (iP < 0) {
            throw new C1636oL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrN = N(iP);
        if (bArrN != null) {
            return QK.s(0, bArrN.length, bArrN);
        }
        int i7 = this.f11174h;
        int i8 = this.f11172f;
        int i9 = i8 - i7;
        this.f11175j += i8;
        this.f11174h = 0;
        this.f11172f = 0;
        ArrayList arrayListO = O(iP - i9);
        byte[] bArr2 = new byte[iP];
        System.arraycopy(bArr, i7, bArr2, 0, i9);
        int size = arrayListO.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListO.get(i10);
            i10++;
            byte[] bArr3 = (byte[]) obj;
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i9, length);
            i9 += length;
        }
        OK ok = QK.f10609b;
        try {
            return new OK(bArr2);
        } catch (C1636oL e6) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e6);
        }
    }

    @Override // D5.b
    public final int B() {
        return P();
    }

    @Override // D5.b
    public final int C() {
        return P();
    }

    @Override // D5.b
    public final int D() {
        return S();
    }

    @Override // D5.b
    public final long E() {
        return T();
    }

    @Override // D5.b
    public final int F() {
        return D5.b.l(P());
    }

    @Override // D5.b
    public final long G() {
        return D5.b.m(Q());
    }

    @Override // D5.b
    public final int H(int i) throws C1636oL {
        if (i < 0) {
            throw new C1636oL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = this.f11175j + this.f11174h + i;
        if (i3 < 0) {
            throw new C1636oL("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i6 = this.f11176k;
        if (i3 > i6) {
            throw new C1636oL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f11176k = i3;
        J();
        return i6;
    }

    public final void I(int i) throws C1636oL {
        InputStream inputStream = this.f11170d;
        int i3 = this.f11172f;
        int i6 = this.f11174h;
        int i7 = i3 - i6;
        if (i <= i7 && i >= 0) {
            this.f11174h = i6 + i;
            return;
        }
        if (i < 0) {
            throw new C1636oL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i8 = this.f11175j;
        int i9 = i8 + i6;
        int i10 = this.f11176k;
        if (i9 + i > i10) {
            I((i10 - i8) - i6);
            throw new C1636oL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f11175j = i9;
        this.f11172f = 0;
        this.f11174h = 0;
        while (i7 < i) {
            long j6 = i - i7;
            try {
                try {
                    long jSkip = inputStream.skip(j6);
                    if (jSkip < 0 || jSkip > j6) {
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
                        i7 += (int) jSkip;
                    }
                } catch (C1636oL e6) {
                    e6.f15934a = true;
                    throw e6;
                }
            } catch (Throwable th) {
                this.f11175j += i7;
                J();
                throw th;
            }
        }
        this.f11175j += i7;
        J();
        if (i7 >= i) {
            return;
        }
        int i11 = this.f11172f;
        int i12 = i11 - this.f11174h;
        this.f11174h = i11;
        K(1);
        while (true) {
            int i13 = i - i12;
            int i14 = this.f11172f;
            if (i13 <= i14) {
                this.f11174h = i13;
                return;
            } else {
                i12 += i14;
                this.f11174h = i14;
                K(1);
            }
        }
    }

    public final void J() {
        int i = this.f11172f + this.f11173g;
        this.f11172f = i;
        int i3 = this.f11175j + i;
        int i6 = this.f11176k;
        if (i3 <= i6) {
            this.f11173g = 0;
            return;
        }
        int i7 = i3 - i6;
        this.f11173g = i7;
        this.f11172f = i - i7;
    }

    public final void K(int i) throws C1636oL {
        if (L(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f11175j) - this.f11174h) {
            throw new C1636oL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C1636oL("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final boolean L(int i) throws IOException {
        InputStream inputStream = this.f11170d;
        int i3 = this.f11174h;
        int i6 = i3 + i;
        int i7 = this.f11172f;
        if (i6 <= i7) {
            throw new IllegalStateException(A.f.n(new StringBuilder(String.valueOf(i).length() + 66), "refillBuffer() called when ", i, " bytes were already available in buffer"));
        }
        int i8 = this.f11175j;
        if (i > (Integer.MAX_VALUE - i8) - i3 || i8 + i3 + i > this.f11176k) {
            return false;
        }
        byte[] bArr = this.f11171e;
        if (i3 > 0) {
            if (i7 > i3) {
                System.arraycopy(bArr, i3, bArr, 0, i7 - i3);
            }
            i8 = this.f11175j + i3;
            this.f11175j = i8;
            i7 = this.f11172f - i3;
            this.f11172f = i7;
            this.f11174h = 0;
        }
        try {
            int i9 = inputStream.read(bArr, i7, Math.min(4096 - i7, (Integer.MAX_VALUE - i8) - i7));
            if (i9 != 0 && i9 >= -1 && i9 <= 4096) {
                if (i9 <= 0) {
                    return false;
                }
                this.f11172f += i9;
                J();
                return this.f11172f >= i || L(i);
            }
            String strValueOf = String.valueOf(inputStream.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + strValueOf.length() + 39 + 41);
            sb.append(strValueOf);
            sb.append("#read(byte[]) returned invalid result: ");
            sb.append(i9);
            sb.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb.toString());
        } catch (C1636oL e6) {
            e6.f15934a = true;
            throw e6;
        }
    }

    public final byte[] M(int i) throws IOException {
        byte[] bArrN = N(i);
        if (bArrN != null) {
            return bArrN;
        }
        int i3 = this.f11174h;
        int i6 = this.f11172f;
        int i7 = i6 - i3;
        this.f11175j += i6;
        this.f11174h = 0;
        this.f11172f = 0;
        ArrayList arrayListO = O(i - i7);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f11171e, i3, bArr, 0, i7);
        int size = arrayListO.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayListO.get(i8);
            i8++;
            byte[] bArr2 = (byte[]) obj;
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i7, length);
            i7 += length;
        }
        return bArr;
    }

    public final byte[] N(int i) throws IOException {
        if (i == 0) {
            return AbstractC1528mL.f15611b;
        }
        int i3 = this.f11175j;
        int i6 = this.f11174h;
        int i7 = i3 + i6 + i;
        if ((-2147483647) + i7 > 0) {
            throw new C1636oL("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i8 = this.f11176k;
        if (i7 > i8) {
            I((i8 - i3) - i6);
            throw new C1636oL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i9 = this.f11172f - i6;
        int i10 = i - i9;
        InputStream inputStream = this.f11170d;
        if (i10 >= 4096) {
            try {
                if (i10 > inputStream.available()) {
                    return null;
                }
            } catch (C1636oL e6) {
                e6.f15934a = true;
                throw e6;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f11171e, this.f11174h, bArr, 0, i9);
        this.f11175j += this.f11172f;
        this.f11174h = 0;
        this.f11172f = 0;
        while (i9 < i) {
            try {
                int i11 = inputStream.read(bArr, i9, i - i9);
                if (i11 == -1) {
                    throw new C1636oL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f11175j += i11;
                i9 += i11;
            } catch (C1636oL e7) {
                e7.f15934a = true;
                throw e7;
            }
        }
        return bArr;
    }

    public final ArrayList O(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i3 = 0;
            while (i3 < iMin) {
                int i6 = this.f11170d.read(bArr, i3, iMin - i3);
                if (i6 == -1) {
                    throw new C1636oL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f11175j += i6;
                i3 += i6;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int P() {
        int i;
        int i3 = this.f11174h;
        int i6 = this.f11172f;
        if (i6 != i3) {
            int i7 = i3 + 1;
            byte[] bArr = this.f11171e;
            byte b5 = bArr[i3];
            if (b5 >= 0) {
                this.f11174h = i7;
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
                this.f11174h = i8;
                return i;
            }
        }
        return (int) R();
    }

    public final long Q() {
        long j6;
        long j7;
        long j8;
        int i = this.f11174h;
        int i3 = this.f11172f;
        if (i3 != i) {
            int i6 = i + 1;
            byte[] bArr = this.f11171e;
            byte b5 = bArr[i];
            if (b5 >= 0) {
                this.f11174h = i6;
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
                this.f11174h = i7;
                return j6;
            }
        }
        return R();
    }

    public final long R() throws C1636oL {
        long j6 = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f11174h == this.f11172f) {
                K(1);
            }
            int i3 = this.f11174h;
            this.f11174h = i3 + 1;
            j6 |= (r3 & 127) << i;
            if ((this.f11171e[i3] & 128) == 0) {
                return j6;
            }
        }
        throw new C1636oL("CodedInputStream encountered a malformed varint.");
    }

    public final int S() throws C1636oL {
        int i = this.f11174h;
        if (this.f11172f - i < 4) {
            K(4);
            i = this.f11174h;
        }
        this.f11174h = i + 4;
        byte[] bArr = this.f11171e;
        int i3 = bArr[i] & 255;
        int i6 = bArr[i + 1] & 255;
        int i7 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i6 << 8) | i3 | (i7 << 16);
    }

    public final long T() throws C1636oL {
        int i = this.f11174h;
        if (this.f11172f - i < 8) {
            K(8);
            i = this.f11174h;
        }
        this.f11174h = i + 8;
        byte[] bArr = this.f11171e;
        long j6 = bArr[i];
        long j7 = bArr[i + 2];
        long j8 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j6 & 255) | ((bArr[i + 1] & 255) << 8) | ((j7 & 255) << 16) | ((j8 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    @Override // D5.b
    public final void f(int i) {
        this.f11176k = i;
        J();
    }

    @Override // D5.b
    public final boolean g() {
        return this.f11174h == this.f11172f && !L(1);
    }

    @Override // D5.b
    public final int h() {
        return this.f11175j + this.f11174h;
    }

    @Override // D5.b
    public final int n() throws C1636oL {
        if (g()) {
            this.i = 0;
            return 0;
        }
        int iP = P();
        this.i = iP;
        if ((iP >>> 3) != 0) {
            return iP;
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
                I(P());
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
        int i7 = this.f11172f - this.f11174h;
        byte[] bArr = this.f11171e;
        if (i7 >= 10) {
            while (i6 < 10) {
                int i8 = this.f11174h;
                this.f11174h = i8 + 1;
                if (bArr[i8] < 0) {
                    i6++;
                }
            }
            throw new C1636oL("CodedInputStream encountered a malformed varint.");
        }
        while (i6 < 10) {
            if (this.f11174h == this.f11172f) {
                K(1);
            }
            int i9 = this.f11174h;
            this.f11174h = i9 + 1;
            if (bArr[i9] < 0) {
                i6++;
            }
        }
        throw new C1636oL("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // D5.b
    public final double q() {
        return Double.longBitsToDouble(T());
    }

    @Override // D5.b
    public final float r() {
        return Float.intBitsToFloat(S());
    }

    @Override // D5.b
    public final long s() {
        return Q();
    }

    @Override // D5.b
    public final long t() {
        return Q();
    }

    @Override // D5.b
    public final int u() {
        return P();
    }

    @Override // D5.b
    public final long v() {
        return T();
    }

    @Override // D5.b
    public final int w() {
        return S();
    }

    @Override // D5.b
    public final boolean x() {
        return Q() != 0;
    }

    @Override // D5.b
    public final String y() throws C1636oL {
        int iP = P();
        byte[] bArr = this.f11171e;
        if (iP > 0) {
            int i = this.f11172f;
            int i3 = this.f11174h;
            if (iP <= i - i3) {
                String str = new String(bArr, i3, iP, AbstractC1528mL.f15610a);
                this.f11174h += iP;
                return str;
            }
        }
        if (iP == 0) {
            return "";
        }
        if (iP < 0) {
            throw new C1636oL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iP > this.f11172f) {
            return new String(M(iP), AbstractC1528mL.f15610a);
        }
        K(iP);
        String str2 = new String(bArr, this.f11174h, iP, AbstractC1528mL.f15610a);
        this.f11174h += iP;
        return str2;
    }

    @Override // D5.b
    public final String z() throws IOException {
        int iP = P();
        int i = this.f11174h;
        int i3 = this.f11172f;
        int i6 = i3 - i;
        byte[] bArrM = this.f11171e;
        if (iP <= i6 && iP > 0) {
            this.f11174h = i + iP;
        } else {
            if (iP == 0) {
                return "";
            }
            if (iP < 0) {
                throw new C1636oL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (iP <= i3) {
                K(iP);
                this.f11174h = iP;
            } else {
                bArrM = M(iP);
            }
        }
        return YL.d(i, iP, bArrM);
    }
}
