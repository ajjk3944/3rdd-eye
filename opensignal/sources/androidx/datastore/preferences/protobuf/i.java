package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i extends j {
    public int B;
    public int D;
    public int E;
    public int F = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public final InputStream f1292g;

    /* renamed from: r, reason: collision with root package name */
    public final byte[] f1293r;

    /* renamed from: x, reason: collision with root package name */
    public int f1294x;

    /* renamed from: y, reason: collision with root package name */
    public int f1295y;

    public i(InputStream inputStream) {
        c0.a(inputStream, "input");
        this.f1292g = inputStream;
        this.f1293r = new byte[4096];
        this.f1294x = 0;
        this.B = 0;
        this.E = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long A() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean B(int i10) throws e0 {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 == 1) {
                N(8);
                return true;
            }
            if (i11 == 2) {
                N(I());
                return true;
            }
            if (i11 == 3) {
                C();
                a(((i10 >>> 3) << 3) | 4);
                return true;
            }
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw e0.b();
            }
            N(4);
            return true;
        }
        int i13 = this.f1294x - this.B;
        byte[] bArr = this.f1293r;
        if (i13 >= 10) {
            while (i12 < 10) {
                int i14 = this.B;
                this.B = i14 + 1;
                if (bArr[i14] < 0) {
                    i12++;
                }
            }
            throw e0.c();
        }
        while (i12 < 10) {
            if (this.B == this.f1294x) {
                M(1);
            }
            int i15 = this.B;
            this.B = i15 + 1;
            if (bArr[i15] < 0) {
                i12++;
            }
        }
        throw e0.c();
        return true;
    }

    public final byte[] D(int i10) throws IOException {
        byte[] bArrE = E(i10);
        if (bArrE != null) {
            return bArrE;
        }
        int i11 = this.B;
        int i12 = this.f1294x;
        int length = i12 - i11;
        this.E += i12;
        this.B = 0;
        this.f1294x = 0;
        ArrayList arrayListF = F(i10 - length);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f1293r, i11, bArr, 0, length);
        Iterator it = arrayListF.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] E(int i10) throws IOException {
        if (i10 == 0) {
            return c0.f1254b;
        }
        if (i10 < 0) {
            throw e0.d();
        }
        int i11 = this.E;
        int i12 = this.B;
        int i13 = i11 + i12 + i10;
        if (i13 - Integer.MAX_VALUE > 0) {
            throw new e0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i14 = this.F;
        if (i13 > i14) {
            N((i14 - i11) - i12);
            throw e0.e();
        }
        int i15 = this.f1294x - i12;
        int i16 = i10 - i15;
        InputStream inputStream = this.f1292g;
        if (i16 >= 4096) {
            try {
                if (i16 > inputStream.available()) {
                    return null;
                }
            } catch (e0 e4) {
                e4.f1264a = true;
                throw e4;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f1293r, this.B, bArr, 0, i15);
        this.E += this.f1294x;
        this.B = 0;
        this.f1294x = 0;
        while (i15 < i10) {
            try {
                int i17 = inputStream.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw e0.e();
                }
                this.E += i17;
                i15 += i17;
            } catch (e0 e10) {
                e10.f1264a = true;
                throw e10;
            }
        }
        return bArr;
    }

    public final ArrayList F(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.f1292g.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw e0.e();
                }
                this.E += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int G() throws e0 {
        int i10 = this.B;
        if (this.f1294x - i10 < 4) {
            M(4);
            i10 = this.B;
        }
        this.B = i10 + 4;
        byte[] bArr = this.f1293r;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long H() throws e0 {
        int i10 = this.B;
        if (this.f1294x - i10 < 8) {
            M(8);
            i10 = this.B;
        }
        this.B = i10 + 8;
        byte[] bArr = this.f1293r;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final int I() {
        int i10;
        int i11 = this.B;
        int i12 = this.f1294x;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f1293r;
            byte b2 = bArr[i11];
            if (b2 >= 0) {
                this.B = i13;
                return b2;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b2;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b10 = bArr[i18];
                            int i20 = (i19 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.B = i14;
                return i10;
            }
        }
        return (int) K();
    }

    public final long J() {
        long j;
        long j7;
        long j10;
        long j11;
        int i10 = this.B;
        int i11 = this.f1294x;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f1293r;
            byte b2 = bArr[i10];
            if (b2 >= 0) {
                this.B = i12;
                return b2;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b2;
                if (i14 < 0) {
                    j = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            j11 = (-2080896) ^ i18;
                        } else {
                            long j12 = i18;
                            i13 = i10 + 5;
                            long j13 = j12 ^ (bArr[i17] << 28);
                            if (j13 >= 0) {
                                j10 = 266354560;
                            } else {
                                i17 = i10 + 6;
                                long j14 = j13 ^ (bArr[i13] << 35);
                                if (j14 < 0) {
                                    j7 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j13 = j14 ^ (bArr[i17] << 42);
                                    if (j13 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i17 = i10 + 8;
                                        j14 = j13 ^ (bArr[i13] << 49);
                                        if (j14 < 0) {
                                            j7 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j15 = (j14 ^ (bArr[i17] << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                int i19 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i19;
                                                }
                                            }
                                            j = j15;
                                        }
                                    }
                                }
                                j11 = j7 ^ j14;
                            }
                            j = j10 ^ j13;
                        }
                        i13 = i17;
                        j = j11;
                    }
                }
                this.B = i13;
                return j;
            }
        }
        return K();
    }

    public final long K() throws e0 {
        long j = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.B == this.f1294x) {
                M(1);
            }
            int i11 = this.B;
            this.B = i11 + 1;
            j |= (r3 & 127) << i10;
            if ((this.f1293r[i11] & 128) == 0) {
                return j;
            }
        }
        throw e0.c();
    }

    public final void L() {
        int i10 = this.f1294x + this.f1295y;
        this.f1294x = i10;
        int i11 = this.E + i10;
        int i12 = this.F;
        if (i11 <= i12) {
            this.f1295y = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f1295y = i13;
        this.f1294x = i10 - i13;
    }

    public final void M(int i10) throws e0 {
        if (O(i10)) {
            return;
        }
        if (i10 <= (Integer.MAX_VALUE - this.E) - this.B) {
            throw e0.e();
        }
        throw new e0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void N(int i10) throws e0 {
        int i11 = this.f1294x;
        int i12 = this.B;
        if (i10 <= i11 - i12 && i10 >= 0) {
            this.B = i12 + i10;
            return;
        }
        InputStream inputStream = this.f1292g;
        if (i10 < 0) {
            throw e0.d();
        }
        int i13 = this.E;
        int i14 = i13 + i12;
        int i15 = i14 + i10;
        int i16 = this.F;
        if (i15 > i16) {
            N((i16 - i13) - i12);
            throw e0.e();
        }
        this.E = i14;
        int i17 = i11 - i12;
        this.f1294x = 0;
        this.B = 0;
        while (i17 < i10) {
            long j = i10 - i17;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i17 += (int) jSkip;
                    }
                } catch (e0 e4) {
                    e4.f1264a = true;
                    throw e4;
                }
            } catch (Throwable th2) {
                this.E += i17;
                L();
                throw th2;
            }
        }
        this.E += i17;
        L();
        if (i17 >= i10) {
            return;
        }
        int i18 = this.f1294x;
        int i19 = i18 - this.B;
        this.B = i18;
        M(1);
        while (true) {
            int i20 = i10 - i19;
            int i21 = this.f1294x;
            if (i20 <= i21) {
                this.B = i20;
                return;
            } else {
                i19 += i21;
                this.B = i21;
                M(1);
            }
        }
    }

    public final boolean O(int i10) throws IOException {
        InputStream inputStream = this.f1292g;
        int i11 = this.B;
        int i12 = i11 + i10;
        int i13 = this.f1294x;
        if (i12 <= i13) {
            throw new IllegalStateException(h0.b.m("refillBuffer() called when ", i10, " bytes were already available in buffer"));
        }
        int i14 = this.E;
        if (i10 <= (Integer.MAX_VALUE - i14) - i11 && i14 + i11 + i10 <= this.F) {
            byte[] bArr = this.f1293r;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.E += i11;
                this.f1294x -= i11;
                this.B = 0;
            }
            int i15 = this.f1294x;
            try {
                int i16 = inputStream.read(bArr, i15, Math.min(bArr.length - i15, (Integer.MAX_VALUE - this.E) - i15));
                if (i16 == 0 || i16 < -1 || i16 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i16 + "\nThe InputStream implementation is buggy.");
                }
                if (i16 > 0) {
                    this.f1294x += i16;
                    L();
                    if (this.f1294x >= i10) {
                        return true;
                    }
                    return O(i10);
                }
            } catch (e0 e4) {
                e4.f1264a = true;
                throw e4;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void a(int i10) throws e0 {
        if (this.D != i10) {
            throw new e0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int b() {
        return this.E + this.B;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean c() {
        return this.B == this.f1294x && !O(1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void h(int i10) {
        this.F = i10;
        L();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int i(int i10) throws e0 {
        if (i10 < 0) {
            throw e0.d();
        }
        int i11 = this.E + this.B + i10;
        if (i11 < 0) {
            throw new e0("Failed to parse the message.");
        }
        int i12 = this.F;
        if (i11 > i12) {
            throw e0.e();
        }
        this.F = i11;
        L();
        return i12;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean j() {
        return J() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final g k() throws IOException {
        int I = I();
        int i10 = this.f1294x;
        int i11 = this.B;
        int i12 = i10 - i11;
        byte[] bArr = this.f1293r;
        if (I <= i12 && I > 0) {
            g gVarC = g.c(bArr, i11, I);
            this.B += I;
            return gVarC;
        }
        if (I == 0) {
            return g.f1276g;
        }
        if (I < 0) {
            throw e0.d();
        }
        byte[] bArrE = E(I);
        if (bArrE != null) {
            return g.c(bArrE, 0, bArrE.length);
        }
        int i13 = this.B;
        int i14 = this.f1294x;
        int length = i14 - i13;
        this.E += i14;
        this.B = 0;
        this.f1294x = 0;
        ArrayList arrayListF = F(I - length);
        byte[] bArr2 = new byte[I];
        System.arraycopy(bArr, i13, bArr2, 0, length);
        Iterator it = arrayListF.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        g gVar = g.f1276g;
        return new g(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final double l() {
        return Double.longBitsToDouble(H());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int m() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int n() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long o() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final float p() {
        return Float.intBitsToFloat(G());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int q() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long r() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int s() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long t() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int u() {
        int I = I();
        return (-(I & 1)) ^ (I >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long v() {
        long J = J();
        return (-(J & 1)) ^ (J >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String w() throws e0 {
        int I = I();
        byte[] bArr = this.f1293r;
        if (I > 0) {
            int i10 = this.f1294x;
            int i11 = this.B;
            if (I <= i10 - i11) {
                String str = new String(bArr, i11, I, c0.f1253a);
                this.B += I;
                return str;
            }
        }
        if (I == 0) {
            return "";
        }
        if (I < 0) {
            throw e0.d();
        }
        if (I > this.f1294x) {
            return new String(D(I), c0.f1253a);
        }
        M(I);
        String str2 = new String(bArr, this.B, I, c0.f1253a);
        this.B += I;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String x() throws IOException {
        int I = I();
        int i10 = this.B;
        int i11 = this.f1294x;
        int i12 = i11 - i10;
        byte[] bArrD = this.f1293r;
        if (I <= i12 && I > 0) {
            this.B = i10 + I;
        } else {
            if (I == 0) {
                return "";
            }
            if (I < 0) {
                throw e0.d();
            }
            i10 = 0;
            if (I <= i11) {
                M(I);
                this.B = I;
            } else {
                bArrD = D(I);
            }
        }
        return t1.f1366a.J(bArrD, i10, I);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int y() throws e0 {
        if (c()) {
            this.D = 0;
            return 0;
        }
        int I = I();
        this.D = I;
        if ((I >>> 3) != 0) {
            return I;
        }
        throw new e0("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int z() {
        return I();
    }
}
