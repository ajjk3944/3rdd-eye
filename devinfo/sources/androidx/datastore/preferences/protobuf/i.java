package androidx.datastore.preferences.protobuf;

import com.applovin.shadow.okio.internal.Buffer;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: c, reason: collision with root package name */
    public final FileInputStream f988c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f989d;

    /* renamed from: e, reason: collision with root package name */
    public int f990e;

    /* renamed from: f, reason: collision with root package name */
    public int f991f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f992h;

    /* renamed from: i, reason: collision with root package name */
    public int f993i;
    public int j = Integer.MAX_VALUE;

    public i(FileInputStream fileInputStream) {
        Charset charset = y.f1081a;
        this.f988c = fileInputStream;
        this.f989d = new byte[Buffer.SEGMENTING_THRESHOLD];
        this.f990e = 0;
        this.g = 0;
        this.f993i = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int A() {
        return M();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long B() {
        return N();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean C(int i4) throws a0 {
        int i10 = i4 & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                R(8);
                return true;
            }
            if (i10 == 2) {
                R(M());
                return true;
            }
            if (i10 == 3) {
                D();
                a(((i4 >>> 3) << 3) | 4);
                return true;
            }
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw a0.b();
            }
            R(4);
            return true;
        }
        int i12 = this.f990e - this.g;
        byte[] bArr = this.f989d;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.g;
                this.g = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw a0.c();
        }
        while (i11 < 10) {
            if (this.g == this.f990e) {
                Q(1);
            }
            int i14 = this.g;
            this.g = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw a0.c();
        return true;
    }

    public final byte[] H(int i4) throws IOException {
        byte[] bArrI = I(i4);
        if (bArrI != null) {
            return bArrI;
        }
        int i10 = this.g;
        int i11 = this.f990e;
        int length = i11 - i10;
        this.f993i += i11;
        this.g = 0;
        this.f990e = 0;
        ArrayList arrayListJ = J(i4 - length);
        byte[] bArr = new byte[i4];
        System.arraycopy(this.f989d, i10, bArr, 0, length);
        int size = arrayListJ.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayListJ.get(i12);
            i12++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] I(int i4) throws IOException {
        if (i4 == 0) {
            return y.f1082b;
        }
        if (i4 < 0) {
            throw a0.d();
        }
        int i10 = this.f993i;
        int i11 = this.g;
        int i12 = i10 + i11 + i4;
        if (i12 - Integer.MAX_VALUE > 0) {
            throw new a0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i13 = this.j;
        if (i12 > i13) {
            R((i13 - i10) - i11);
            throw a0.e();
        }
        int i14 = this.f990e - i11;
        int i15 = i4 - i14;
        FileInputStream fileInputStream = this.f988c;
        if (i15 >= 4096) {
            try {
                if (i15 > fileInputStream.available()) {
                    return null;
                }
            } catch (a0 e2) {
                e2.f932a = true;
                throw e2;
            }
        }
        byte[] bArr = new byte[i4];
        System.arraycopy(this.f989d, this.g, bArr, 0, i14);
        this.f993i += this.f990e;
        this.g = 0;
        this.f990e = 0;
        while (i14 < i4) {
            try {
                int i16 = fileInputStream.read(bArr, i14, i4 - i14);
                if (i16 == -1) {
                    throw a0.e();
                }
                this.f993i += i16;
                i14 += i16;
            } catch (a0 e10) {
                e10.f932a = true;
                throw e10;
            }
        }
        return bArr;
    }

    public final ArrayList J(int i4) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i4 > 0) {
            int iMin = Math.min(i4, Buffer.SEGMENTING_THRESHOLD);
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = this.f988c.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    throw a0.e();
                }
                this.f993i += i11;
                i10 += i11;
            }
            i4 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int K() throws a0 {
        int i4 = this.g;
        if (this.f990e - i4 < 4) {
            Q(4);
            i4 = this.g;
        }
        this.g = i4 + 4;
        byte[] bArr = this.f989d;
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    public final long L() throws a0 {
        int i4 = this.g;
        if (this.f990e - i4 < 8) {
            Q(8);
            i4 = this.g;
        }
        this.g = i4 + 8;
        byte[] bArr = this.f989d;
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }

    public final int M() {
        int i4;
        int i10 = this.g;
        int i11 = this.f990e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f989d;
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
        return (int) O();
    }

    public final long N() {
        long j;
        long j8;
        long j9;
        long j10;
        int i4 = this.g;
        int i10 = this.f990e;
        if (i10 != i4) {
            int i11 = i4 + 1;
            byte[] bArr = this.f989d;
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
                        i12 = i14;
                    } else {
                        int i16 = i4 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            j10 = (-2080896) ^ i17;
                        } else {
                            long j11 = i17;
                            i12 = i4 + 5;
                            long j12 = j11 ^ (bArr[i16] << 28);
                            if (j12 >= 0) {
                                j9 = 266354560;
                            } else {
                                i16 = i4 + 6;
                                long j13 = j12 ^ (bArr[i12] << 35);
                                if (j13 < 0) {
                                    j8 = -34093383808L;
                                } else {
                                    i12 = i4 + 7;
                                    j12 = j13 ^ (bArr[i16] << 42);
                                    if (j12 >= 0) {
                                        j9 = 4363953127296L;
                                    } else {
                                        i16 = i4 + 8;
                                        j13 = j12 ^ (bArr[i12] << 49);
                                        if (j13 < 0) {
                                            j8 = -558586000294016L;
                                        } else {
                                            i12 = i4 + 9;
                                            long j14 = (j13 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                            if (j14 < 0) {
                                                int i18 = i4 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i18;
                                                }
                                            }
                                            j = j14;
                                        }
                                    }
                                }
                                j10 = j8 ^ j13;
                            }
                            j = j9 ^ j12;
                        }
                        i12 = i16;
                        j = j10;
                    }
                }
                this.g = i12;
                return j;
            }
        }
        return O();
    }

    public final long O() throws a0 {
        long j = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            if (this.g == this.f990e) {
                Q(1);
            }
            int i10 = this.g;
            this.g = i10 + 1;
            j |= (r3 & 127) << i4;
            if ((this.f989d[i10] & 128) == 0) {
                return j;
            }
        }
        throw a0.c();
    }

    public final void P() {
        int i4 = this.f990e + this.f991f;
        this.f990e = i4;
        int i10 = this.f993i + i4;
        int i11 = this.j;
        if (i10 <= i11) {
            this.f991f = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f991f = i12;
        this.f990e = i4 - i12;
    }

    public final void Q(int i4) throws a0 {
        if (S(i4)) {
            return;
        }
        if (i4 <= (Integer.MAX_VALUE - this.f993i) - this.g) {
            throw a0.e();
        }
        throw new a0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void R(int i4) throws a0 {
        int i10 = this.f990e;
        int i11 = this.g;
        int i12 = i10 - i11;
        if (i4 <= i12 && i4 >= 0) {
            this.g = i11 + i4;
            return;
        }
        FileInputStream fileInputStream = this.f988c;
        if (i4 < 0) {
            throw a0.d();
        }
        int i13 = this.f993i;
        int i14 = i13 + i11;
        int i15 = i14 + i4;
        int i16 = this.j;
        if (i15 > i16) {
            R((i16 - i13) - i11);
            throw a0.e();
        }
        this.f993i = i14;
        this.f990e = 0;
        this.g = 0;
        while (i12 < i4) {
            long j = i4 - i12;
            try {
                try {
                    long jSkip = fileInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i12 += (int) jSkip;
                    }
                } catch (a0 e2) {
                    e2.f932a = true;
                    throw e2;
                }
            } catch (Throwable th2) {
                this.f993i += i12;
                P();
                throw th2;
            }
        }
        this.f993i += i12;
        P();
        if (i12 >= i4) {
            return;
        }
        int i17 = this.f990e;
        int i18 = i17 - this.g;
        this.g = i17;
        Q(1);
        while (true) {
            int i19 = i4 - i18;
            int i20 = this.f990e;
            if (i19 <= i20) {
                this.g = i19;
                return;
            } else {
                i18 += i20;
                this.g = i20;
                Q(1);
            }
        }
    }

    public final boolean S(int i4) throws IOException {
        FileInputStream fileInputStream = this.f988c;
        int i10 = this.g;
        int i11 = i10 + i4;
        int i12 = this.f990e;
        if (i11 <= i12) {
            throw new IllegalStateException(r5.c.h(i4, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i13 = this.f993i;
        if (i4 <= (Integer.MAX_VALUE - i13) - i10 && i13 + i10 + i4 <= this.j) {
            byte[] bArr = this.f989d;
            if (i10 > 0) {
                if (i12 > i10) {
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                this.f993i += i10;
                this.f990e -= i10;
                this.g = 0;
            }
            int i14 = this.f990e;
            try {
                int i15 = fileInputStream.read(bArr, i14, Math.min(bArr.length - i14, (Integer.MAX_VALUE - this.f993i) - i14));
                if (i15 == 0 || i15 < -1 || i15 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i15 + "\nThe InputStream implementation is buggy.");
                }
                if (i15 > 0) {
                    this.f990e += i15;
                    P();
                    if (this.f990e >= i4) {
                        return true;
                    }
                    return S(i4);
                }
            } catch (a0 e2) {
                e2.f932a = true;
                throw e2;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void a(int i4) throws a0 {
        if (this.f992h != i4) {
            throw new a0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int b() {
        return this.f993i + this.g;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean c() {
        return this.g == this.f990e && !S(1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void h(int i4) {
        this.j = i4;
        P();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int i(int i4) throws a0 {
        if (i4 < 0) {
            throw a0.d();
        }
        int i10 = this.f993i + this.g + i4;
        if (i10 < 0) {
            throw new a0("Failed to parse the message.");
        }
        int i11 = this.j;
        if (i10 > i11) {
            throw a0.e();
        }
        this.j = i10;
        P();
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean k() {
        return N() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final g l() throws IOException {
        int iM = M();
        int i4 = this.f990e;
        int i10 = this.g;
        int i11 = i4 - i10;
        byte[] bArr = this.f989d;
        if (iM <= i11 && iM > 0) {
            g gVarD = g.d(i10, iM, bArr);
            this.g += iM;
            return gVarD;
        }
        if (iM == 0) {
            return g.f972c;
        }
        if (iM < 0) {
            throw a0.d();
        }
        byte[] bArrI = I(iM);
        if (bArrI != null) {
            return g.d(0, bArrI.length, bArrI);
        }
        int i12 = this.g;
        int i13 = this.f990e;
        int length = i13 - i12;
        this.f993i += i13;
        this.g = 0;
        this.f990e = 0;
        ArrayList arrayListJ = J(iM - length);
        byte[] bArr2 = new byte[iM];
        System.arraycopy(bArr, i12, bArr2, 0, length);
        int size = arrayListJ.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayListJ.get(i14);
            i14++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        g gVar = g.f972c;
        return new g(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final double m() {
        return Double.longBitsToDouble(L());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int n() {
        return M();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int o() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long p() {
        return L();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final float q() {
        return Float.intBitsToFloat(K());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int r() {
        return M();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long s() {
        return N();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int t() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long u() {
        return L();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int v() {
        int iM = M();
        return (-(iM & 1)) ^ (iM >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long w() {
        long jN = N();
        return (-(jN & 1)) ^ (jN >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String x() throws a0 {
        int iM = M();
        byte[] bArr = this.f989d;
        if (iM > 0) {
            int i4 = this.f990e;
            int i10 = this.g;
            if (iM <= i4 - i10) {
                String str = new String(bArr, i10, iM, y.f1081a);
                this.g += iM;
                return str;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM < 0) {
            throw a0.d();
        }
        if (iM > this.f990e) {
            return new String(H(iM), y.f1081a);
        }
        Q(iM);
        String str2 = new String(bArr, this.g, iM, y.f1081a);
        this.g += iM;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String y() throws IOException {
        int iM = M();
        int i4 = this.g;
        int i10 = this.f990e;
        int i11 = i10 - i4;
        byte[] bArrH = this.f989d;
        if (iM <= i11 && iM > 0) {
            this.g = i4 + iM;
        } else {
            if (iM == 0) {
                return "";
            }
            if (iM < 0) {
                throw a0.d();
            }
            i4 = 0;
            if (iM <= i10) {
                Q(iM);
                this.g = iM;
            } else {
                bArrH = H(iM);
            }
        }
        return n1.f1021a.i(i4, iM, bArrH);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int z() throws a0 {
        if (c()) {
            this.f992h = 0;
            return 0;
        }
        int iM = M();
        this.f992h = iM;
        if ((iM >>> 3) != 0) {
            return iM;
        }
        throw new a0("Protocol message contained an invalid tag (zero).");
    }
}
