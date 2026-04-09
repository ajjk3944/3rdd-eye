package hm;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements g, f, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public r f25173a;

    /* renamed from: b, reason: collision with root package name */
    public long f25174b;

    public final void A(w wVar) {
        nk.k.e(wVar, "source");
        while (wVar.n(this, 8192L) != -1) {
        }
    }

    @Override // hm.g
    public final int C(n nVar) throws EOFException {
        nk.k.e(nVar, "options");
        int iB = im.a.b(this, nVar, false);
        if (iB == -1) {
            return -1;
        }
        skip(nVar.f25192a[iB].a());
        return iB;
    }

    public final void E(int i4) {
        r rVarW = w(1);
        byte[] bArr = rVarW.f25206a;
        int i10 = rVarW.f25208c;
        rVarW.f25208c = i10 + 1;
        bArr[i10] = (byte) i4;
        this.f25174b++;
    }

    public final void F(long j) {
        boolean z3;
        if (j == 0) {
            E(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                T("-9223372036854775808");
                return;
            }
            z3 = true;
        } else {
            z3 = false;
        }
        byte[] bArr = im.a.f26016a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i4 = iNumberOfLeadingZeros + (j > im.a.f26017b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z3) {
            i4++;
        }
        r rVarW = w(i4);
        byte[] bArr2 = rVarW.f25206a;
        int i10 = rVarW.f25208c + i4;
        while (j != 0) {
            long j8 = 10;
            i10--;
            bArr2[i10] = im.a.f26016a[(int) (j % j8)];
            j /= j8;
        }
        if (z3) {
            bArr2[i10 - 1] = 45;
        }
        rVarW.f25208c += i4;
        this.f25174b += i4;
    }

    public final void G(long j) {
        if (j == 0) {
            E(48);
            return;
        }
        long j8 = (j >>> 1) | j;
        long j9 = j8 | (j8 >>> 2);
        long j10 = j9 | (j9 >>> 4);
        long j11 = j10 | (j10 >>> 8);
        long j12 = j11 | (j11 >>> 16);
        long j13 = j12 | (j12 >>> 32);
        long j14 = j13 - ((j13 >>> 1) & 6148914691236517205L);
        long j15 = ((j14 >>> 2) & 3689348814741910323L) + (j14 & 3689348814741910323L);
        long j16 = ((j15 >>> 4) + j15) & 1085102592571150095L;
        long j17 = j16 + (j16 >>> 8);
        long j18 = j17 + (j17 >>> 16);
        int i4 = (int) ((((j18 & 63) + ((j18 >>> 32) & 63)) + 3) / 4);
        r rVarW = w(i4);
        byte[] bArr = rVarW.f25206a;
        int i10 = rVarW.f25208c;
        for (int i11 = (i10 + i4) - 1; i11 >= i10; i11--) {
            bArr[i11] = im.a.f26016a[(int) (15 & j)];
            j >>>= 4;
        }
        rVarW.f25208c += i4;
        this.f25174b += i4;
    }

    @Override // hm.f
    public final /* bridge */ /* synthetic */ f J(h hVar) {
        y(hVar);
        return this;
    }

    public final void L(int i4) {
        r rVarW = w(4);
        byte[] bArr = rVarW.f25206a;
        int i10 = rVarW.f25208c;
        bArr[i10] = (byte) ((i4 >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i4 >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i4 >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i4 & 255);
        rVarW.f25208c = i10 + 4;
        this.f25174b += 4;
    }

    public final void N(int i4) {
        r rVarW = w(2);
        byte[] bArr = rVarW.f25206a;
        int i10 = rVarW.f25208c;
        bArr[i10] = (byte) ((i4 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i4 & 255);
        rVarW.f25208c = i10 + 2;
        this.f25174b += 2;
    }

    public final void O(int i4, int i10, String str) {
        char cCharAt;
        nk.k.e(str, "string");
        if (i4 < 0) {
            throw new IllegalArgumentException(je.u.r(i4, "beginIndex < 0: ").toString());
        }
        if (i10 < i4) {
            throw new IllegalArgumentException(a0.g.i(i10, i4, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i10 > str.length()) {
            StringBuilder sbW = je.u.w(i10, "endIndex > string.length: ", " > ");
            sbW.append(str.length());
            throw new IllegalArgumentException(sbW.toString().toString());
        }
        while (i4 < i10) {
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 < 128) {
                r rVarW = w(1);
                byte[] bArr = rVarW.f25206a;
                int i11 = rVarW.f25208c - i4;
                int iMin = Math.min(i10, 8192 - i11);
                int i12 = i4 + 1;
                bArr[i4 + i11] = (byte) cCharAt2;
                while (true) {
                    i4 = i12;
                    if (i4 >= iMin || (cCharAt = str.charAt(i4)) >= 128) {
                        break;
                    }
                    i12 = i4 + 1;
                    bArr[i4 + i11] = (byte) cCharAt;
                }
                int i13 = rVarW.f25208c;
                int i14 = (i11 + i4) - i13;
                rVarW.f25208c = i13 + i14;
                this.f25174b += i14;
            } else {
                if (cCharAt2 < 2048) {
                    r rVarW2 = w(2);
                    byte[] bArr2 = rVarW2.f25206a;
                    int i15 = rVarW2.f25208c;
                    bArr2[i15] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i15 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    rVarW2.f25208c = i15 + 2;
                    this.f25174b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    r rVarW3 = w(3);
                    byte[] bArr3 = rVarW3.f25206a;
                    int i16 = rVarW3.f25208c;
                    bArr3[i16] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i16 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i16 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    rVarW3.f25208c = i16 + 3;
                    this.f25174b += 3;
                } else {
                    int i17 = i4 + 1;
                    char cCharAt3 = i17 < i10 ? str.charAt(i17) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        E(63);
                        i4 = i17;
                    } else {
                        int i18 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        r rVarW4 = w(4);
                        byte[] bArr4 = rVarW4.f25206a;
                        int i19 = rVarW4.f25208c;
                        bArr4[i19] = (byte) ((i18 >> 18) | 240);
                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                        rVarW4.f25208c = i19 + 4;
                        this.f25174b += 4;
                        i4 += 2;
                    }
                }
                i4++;
            }
        }
    }

    @Override // hm.u
    public final void Q(e eVar, long j) {
        r rVarB;
        nk.k.e(eVar, "source");
        if (eVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        i0.d(eVar.f25174b, 0L, j);
        while (j > 0) {
            r rVar = eVar.f25173a;
            nk.k.b(rVar);
            int i4 = rVar.f25208c;
            r rVar2 = eVar.f25173a;
            nk.k.b(rVar2);
            long j8 = i4 - rVar2.f25207b;
            int i10 = 0;
            if (j < j8) {
                r rVar3 = this.f25173a;
                r rVar4 = rVar3 != null ? rVar3.g : null;
                if (rVar4 != null && rVar4.f25210e) {
                    if ((rVar4.f25208c + j) - (rVar4.f25209d ? 0 : rVar4.f25207b) <= 8192) {
                        r rVar5 = eVar.f25173a;
                        nk.k.b(rVar5);
                        rVar5.d(rVar4, (int) j);
                        eVar.f25174b -= j;
                        this.f25174b += j;
                        return;
                    }
                }
                r rVar6 = eVar.f25173a;
                nk.k.b(rVar6);
                int i11 = (int) j;
                if (i11 <= 0 || i11 > rVar6.f25208c - rVar6.f25207b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i11 >= 1024) {
                    rVarB = rVar6.c();
                } else {
                    rVarB = s.b();
                    byte[] bArr = rVar6.f25206a;
                    byte[] bArr2 = rVarB.f25206a;
                    int i12 = rVar6.f25207b;
                    zj.m.O(bArr, 0, bArr2, i12, i12 + i11);
                }
                rVarB.f25208c = rVarB.f25207b + i11;
                rVar6.f25207b += i11;
                r rVar7 = rVar6.g;
                nk.k.b(rVar7);
                rVar7.b(rVarB);
                eVar.f25173a = rVarB;
            }
            r rVar8 = eVar.f25173a;
            nk.k.b(rVar8);
            long j9 = rVar8.f25208c - rVar8.f25207b;
            eVar.f25173a = rVar8.a();
            r rVar9 = this.f25173a;
            if (rVar9 == null) {
                this.f25173a = rVar8;
                rVar8.g = rVar8;
                rVar8.f25211f = rVar8;
            } else {
                r rVar10 = rVar9.g;
                nk.k.b(rVar10);
                rVar10.b(rVar8);
                r rVar11 = rVar8.g;
                if (rVar11 == rVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                nk.k.b(rVar11);
                if (rVar11.f25210e) {
                    int i13 = rVar8.f25208c - rVar8.f25207b;
                    r rVar12 = rVar8.g;
                    nk.k.b(rVar12);
                    int i14 = 8192 - rVar12.f25208c;
                    r rVar13 = rVar8.g;
                    nk.k.b(rVar13);
                    if (!rVar13.f25209d) {
                        r rVar14 = rVar8.g;
                        nk.k.b(rVar14);
                        i10 = rVar14.f25207b;
                    }
                    if (i13 <= i14 + i10) {
                        r rVar15 = rVar8.g;
                        nk.k.b(rVar15);
                        rVar8.d(rVar15, i13);
                        rVar8.a();
                        s.a(rVar8);
                    }
                }
            }
            eVar.f25174b -= j9;
            this.f25174b += j9;
            j -= j9;
        }
    }

    public final void T(String str) {
        nk.k.e(str, "string");
        O(0, str.length(), str);
    }

    public final void U(int i4) {
        if (i4 < 128) {
            E(i4);
            return;
        }
        if (i4 < 2048) {
            r rVarW = w(2);
            byte[] bArr = rVarW.f25206a;
            int i10 = rVarW.f25208c;
            bArr[i10] = (byte) ((i4 >> 6) | 192);
            bArr[i10 + 1] = (byte) ((i4 & 63) | 128);
            rVarW.f25208c = i10 + 2;
            this.f25174b += 2;
            return;
        }
        if (55296 <= i4 && i4 < 57344) {
            E(63);
            return;
        }
        if (i4 < 65536) {
            r rVarW2 = w(3);
            byte[] bArr2 = rVarW2.f25206a;
            int i11 = rVarW2.f25208c;
            bArr2[i11] = (byte) ((i4 >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((i4 >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((i4 & 63) | 128);
            rVarW2.f25208c = i11 + 3;
            this.f25174b += 3;
            return;
        }
        if (i4 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(i0.w(i4)));
        }
        r rVarW3 = w(4);
        byte[] bArr3 = rVarW3.f25206a;
        int i12 = rVarW3.f25208c;
        bArr3[i12] = (byte) ((i4 >> 18) | 240);
        bArr3[i12 + 1] = (byte) (((i4 >> 12) & 63) | 128);
        bArr3[i12 + 2] = (byte) (((i4 >> 6) & 63) | 128);
        bArr3[i12 + 3] = (byte) ((i4 & 63) | 128);
        rVarW3.f25208c = i12 + 4;
        this.f25174b += 4;
    }

    public final Object clone() {
        e eVar = new e();
        if (this.f25174b == 0) {
            return eVar;
        }
        r rVar = this.f25173a;
        nk.k.b(rVar);
        r rVarC = rVar.c();
        eVar.f25173a = rVarC;
        rVarC.g = rVarC;
        rVarC.f25211f = rVarC;
        for (r rVar2 = rVar.f25211f; rVar2 != rVar; rVar2 = rVar2.f25211f) {
            r rVar3 = rVarC.g;
            nk.k.b(rVar3);
            nk.k.b(rVar2);
            rVar3.b(rVar2.c());
        }
        eVar.f25174b = this.f25174b;
        return eVar;
    }

    public final void e() throws EOFException {
        skip(this.f25174b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        long j = this.f25174b;
        e eVar = (e) obj;
        if (j != eVar.f25174b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        r rVar = this.f25173a;
        nk.k.b(rVar);
        r rVar2 = eVar.f25173a;
        nk.k.b(rVar2);
        int i4 = rVar.f25207b;
        int i10 = rVar2.f25207b;
        long j8 = 0;
        while (j8 < this.f25174b) {
            long jMin = Math.min(rVar.f25208c - i4, rVar2.f25208c - i10);
            long j9 = 0;
            while (j9 < jMin) {
                int i11 = i4 + 1;
                int i12 = i10 + 1;
                if (rVar.f25206a[i4] != rVar2.f25206a[i10]) {
                    return false;
                }
                j9++;
                i4 = i11;
                i10 = i12;
            }
            if (i4 == rVar.f25208c) {
                rVar = rVar.f25211f;
                nk.k.b(rVar);
                i4 = rVar.f25207b;
            }
            if (i10 == rVar2.f25208c) {
                rVar2 = rVar2.f25211f;
                nk.k.b(rVar2);
                i10 = rVar2.f25207b;
            }
            j8 += jMin;
        }
        return true;
    }

    public final boolean exhausted() {
        return this.f25174b == 0;
    }

    public final long g() {
        long j = this.f25174b;
        if (j == 0) {
            return 0L;
        }
        r rVar = this.f25173a;
        nk.k.b(rVar);
        r rVar2 = rVar.g;
        nk.k.b(rVar2);
        return (rVar2.f25208c >= 8192 || !rVar2.f25210e) ? j : j - (r3 - rVar2.f25207b);
    }

    public final int hashCode() {
        r rVar = this.f25173a;
        if (rVar == null) {
            return 0;
        }
        int i4 = 1;
        do {
            int i10 = rVar.f25208c;
            for (int i11 = rVar.f25207b; i11 < i10; i11++) {
                i4 = (i4 * 31) + rVar.f25206a[i11];
            }
            rVar = rVar.f25211f;
            nk.k.b(rVar);
        } while (rVar != this.f25173a);
        return i4;
    }

    @Override // hm.g
    public final long i(e eVar) {
        long j = this.f25174b;
        if (j > 0) {
            eVar.Q(this, j);
        }
        return j;
    }

    public final long indexOf(byte b10, long j, long j8) {
        r rVar;
        long j9 = 0;
        if (0 > j || j > j8) {
            StringBuilder sb2 = new StringBuilder("size=");
            sb2.append(this.f25174b);
            a0.g.A(sb2, " fromIndex=", j, " toIndex=");
            sb2.append(j8);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        long j10 = this.f25174b;
        if (j8 > j10) {
            j8 = j10;
        }
        if (j == j8 || (rVar = this.f25173a) == null) {
            return -1L;
        }
        if (j10 - j < j) {
            while (j10 > j) {
                rVar = rVar.g;
                nk.k.b(rVar);
                j10 -= rVar.f25208c - rVar.f25207b;
            }
            while (j10 < j8) {
                byte[] bArr = rVar.f25206a;
                int iMin = (int) Math.min(rVar.f25208c, (rVar.f25207b + j8) - j10);
                for (int i4 = (int) ((rVar.f25207b + j) - j10); i4 < iMin; i4++) {
                    if (bArr[i4] == b10) {
                        return (i4 - rVar.f25207b) + j10;
                    }
                }
                j10 += rVar.f25208c - rVar.f25207b;
                rVar = rVar.f25211f;
                nk.k.b(rVar);
                j = j10;
            }
            return -1L;
        }
        while (true) {
            long j11 = (rVar.f25208c - rVar.f25207b) + j9;
            if (j11 > j) {
                break;
            }
            rVar = rVar.f25211f;
            nk.k.b(rVar);
            j9 = j11;
        }
        while (j9 < j8) {
            byte[] bArr2 = rVar.f25206a;
            int iMin2 = (int) Math.min(rVar.f25208c, (rVar.f25207b + j8) - j9);
            for (int i10 = (int) ((rVar.f25207b + j) - j9); i10 < iMin2; i10++) {
                if (bArr2[i10] == b10) {
                    return (i10 - rVar.f25207b) + j9;
                }
            }
            j9 += rVar.f25208c - rVar.f25207b;
            rVar = rVar.f25211f;
            nk.k.b(rVar);
            j = j9;
        }
        return -1L;
    }

    @Override // hm.g
    public final InputStream inputStream() {
        return new c(this, 0);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void m(e eVar, long j, long j8) {
        nk.k.e(eVar, "out");
        long j9 = j;
        i0.d(this.f25174b, j9, j8);
        if (j8 == 0) {
            return;
        }
        eVar.f25174b += j8;
        r rVar = this.f25173a;
        while (true) {
            nk.k.b(rVar);
            long j10 = rVar.f25208c - rVar.f25207b;
            if (j9 < j10) {
                break;
            }
            j9 -= j10;
            rVar = rVar.f25211f;
        }
        r rVar2 = rVar;
        long j11 = j8;
        while (j11 > 0) {
            nk.k.b(rVar2);
            r rVarC = rVar2.c();
            int i4 = rVarC.f25207b + ((int) j9);
            rVarC.f25207b = i4;
            rVarC.f25208c = Math.min(i4 + ((int) j11), rVarC.f25208c);
            r rVar3 = eVar.f25173a;
            if (rVar3 == null) {
                rVarC.g = rVarC;
                rVarC.f25211f = rVarC;
                eVar.f25173a = rVarC;
            } else {
                r rVar4 = rVar3.g;
                nk.k.b(rVar4);
                rVar4.b(rVarC);
            }
            j11 -= rVarC.f25208c - rVarC.f25207b;
            rVar2 = rVar2.f25211f;
            j9 = 0;
        }
    }

    @Override // hm.w
    public final long n(e eVar, long j) {
        nk.k.e(eVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(a0.g.j(j, "byteCount < 0: ").toString());
        }
        long j8 = this.f25174b;
        if (j8 == 0) {
            return -1L;
        }
        if (j > j8) {
            j = j8;
        }
        eVar.Q(this, j);
        return j;
    }

    public final byte p(long j) {
        i0.d(this.f25174b, j, 1L);
        r rVar = this.f25173a;
        if (rVar == null) {
            nk.k.b(null);
            throw null;
        }
        long j8 = this.f25174b;
        if (j8 - j < j) {
            while (j8 > j) {
                rVar = rVar.g;
                nk.k.b(rVar);
                j8 -= rVar.f25208c - rVar.f25207b;
            }
            return rVar.f25206a[(int) ((rVar.f25207b + j) - j8)];
        }
        long j9 = 0;
        while (true) {
            int i4 = rVar.f25208c;
            int i10 = rVar.f25207b;
            long j10 = (i4 - i10) + j9;
            if (j10 > j) {
                return rVar.f25206a[(int) ((i10 + j) - j9)];
            }
            rVar = rVar.f25211f;
            nk.k.b(rVar);
            j9 = j10;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        nk.k.e(byteBuffer, "sink");
        r rVar = this.f25173a;
        if (rVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), rVar.f25208c - rVar.f25207b);
        byteBuffer.put(rVar.f25206a, rVar.f25207b, iMin);
        int i4 = rVar.f25207b + iMin;
        rVar.f25207b = i4;
        this.f25174b -= iMin;
        if (i4 == rVar.f25208c) {
            this.f25173a = rVar.a();
            s.a(rVar);
        }
        return iMin;
    }

    @Override // hm.g
    public final byte readByte() throws EOFException {
        if (this.f25174b == 0) {
            throw new EOFException();
        }
        r rVar = this.f25173a;
        nk.k.b(rVar);
        int i4 = rVar.f25207b;
        int i10 = rVar.f25208c;
        int i11 = i4 + 1;
        byte b10 = rVar.f25206a[i4];
        this.f25174b--;
        if (i11 != i10) {
            rVar.f25207b = i11;
            return b10;
        }
        this.f25173a = rVar.a();
        s.a(rVar);
        return b10;
    }

    public final byte[] readByteArray(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a0.g.j(j, "byteCount: ").toString());
        }
        if (this.f25174b < j) {
            throw new EOFException();
        }
        int i4 = (int) j;
        byte[] bArr = new byte[i4];
        int i10 = 0;
        while (i10 < i4) {
            int i11 = read(bArr, i10, i4 - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
        return bArr;
    }

    @Override // hm.g
    public final h readByteString(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a0.g.j(j, "byteCount: ").toString());
        }
        if (this.f25174b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new h(readByteArray(j));
        }
        h hVarV = v((int) j);
        skip(j);
        return hVarV;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:38:0x00a2 BREAK  A[LOOP:0: B:5:0x000c->B:46:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long readHexadecimalUnsignedLong() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.f25174b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La9
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            hm.r r7 = r15.f25173a
            nk.k.b(r7)
            byte[] r8 = r7.f25206a
            int r9 = r7.f25207b
            int r10 = r7.f25208c
        L17:
            if (r9 >= r10) goto L8e
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L26
            r12 = 57
            if (r11 > r12) goto L26
            int r12 = r11 + (-48)
            goto L3b
        L26:
            r12 = 97
            if (r11 < r12) goto L31
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L31
            int r12 = r11 + (-87)
            goto L3b
        L31:
            r12 = 65
            if (r11 < r12) goto L66
            r12 = 70
            if (r11 > r12) goto L66
            int r12 = r11 + (-55)
        L3b:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L4b
            r11 = 4
            long r4 = r4 << r11
            long r11 = (long) r12
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L17
        L4b:
            hm.e r0 = new hm.e
            r0.<init>()
            r0.G(r4)
            r0.E(r11)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.readUtf8()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L66:
            r6 = 1
            if (r1 == 0) goto L6a
            goto L8e
        L6a:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            int r2 = r11 >> 4
            r2 = r2 & 15
            char[] r3 = im.b.f26018a
            char r2 = r3[r2]
            r4 = r11 & 15
            char r3 = r3[r4]
            r4 = 2
            char[] r4 = new char[r4]
            r4[r0] = r2
            r4[r6] = r3
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L8e:
            if (r9 != r10) goto L9a
            hm.r r8 = r7.a()
            r15.f25173a = r8
            hm.s.a(r7)
            goto L9c
        L9a:
            r7.f25207b = r9
        L9c:
            if (r6 != 0) goto La2
            hm.r r7 = r15.f25173a
            if (r7 != 0) goto Lc
        La2:
            long r2 = r15.f25174b
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f25174b = r2
            return r4
        La9:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hm.e.readHexadecimalUnsignedLong():long");
    }

    @Override // hm.g
    public final int readInt() throws EOFException {
        if (this.f25174b < 4) {
            throw new EOFException();
        }
        r rVar = this.f25173a;
        nk.k.b(rVar);
        int i4 = rVar.f25207b;
        int i10 = rVar.f25208c;
        if (i10 - i4 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = rVar.f25206a;
        int i11 = i4 + 3;
        int i12 = ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 2] & 255) << 8);
        int i13 = i4 + 4;
        int i14 = (bArr[i11] & 255) | i12;
        this.f25174b -= 4;
        if (i13 != i10) {
            rVar.f25207b = i13;
            return i14;
        }
        this.f25173a = rVar.a();
        s.a(rVar);
        return i14;
    }

    @Override // hm.g
    public final short readShort() throws EOFException {
        if (this.f25174b < 2) {
            throw new EOFException();
        }
        r rVar = this.f25173a;
        nk.k.b(rVar);
        int i4 = rVar.f25207b;
        int i10 = rVar.f25208c;
        if (i10 - i4 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = rVar.f25206a;
        int i11 = i4 + 1;
        int i12 = (bArr[i4] & 255) << 8;
        int i13 = i4 + 2;
        int i14 = (bArr[i11] & 255) | i12;
        this.f25174b -= 2;
        if (i13 == i10) {
            this.f25173a = rVar.a();
            s.a(rVar);
        } else {
            rVar.f25207b = i13;
        }
        return (short) i14;
    }

    @Override // hm.g
    public final String readString(Charset charset) {
        nk.k.e(charset, "charset");
        return readString(this.f25174b, charset);
    }

    public final String readUtf8() {
        return readString(this.f25174b, vk.a.f36267a);
    }

    @Override // hm.g
    public final String readUtf8LineStrict(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(a0.g.j(j, "limit < 0: ").toString());
        }
        long j8 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jIndexOf = indexOf((byte) 10, 0L, j8);
        if (jIndexOf != -1) {
            return im.a.a(this, jIndexOf);
        }
        if (j8 < this.f25174b && p(j8 - 1) == 13 && p(j8) == 10) {
            return im.a.a(this, j8);
        }
        e eVar = new e();
        m(eVar, 0L, Math.min(32, this.f25174b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f25174b, j) + " content=" + eVar.readByteString(eVar.f25174b).b() + (char) 8230);
    }

    @Override // hm.g
    public final boolean request(long j) {
        return this.f25174b >= j;
    }

    @Override // hm.g
    public final void require(long j) throws EOFException {
        if (this.f25174b < j) {
            throw new EOFException();
        }
    }

    @Override // hm.g
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            r rVar = this.f25173a;
            if (rVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, rVar.f25208c - rVar.f25207b);
            long j8 = iMin;
            this.f25174b -= j8;
            j -= j8;
            int i4 = rVar.f25207b + iMin;
            rVar.f25207b = i4;
            if (i4 == rVar.f25208c) {
                this.f25173a = rVar.a();
                s.a(rVar);
            }
        }
    }

    @Override // hm.w, hm.u
    public final y timeout() {
        return y.f25217d;
    }

    public final String toString() {
        long j = this.f25174b;
        if (j <= 2147483647L) {
            return v((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f25174b).toString());
    }

    public final h v(int i4) {
        if (i4 == 0) {
            return h.f25175d;
        }
        i0.d(this.f25174b, 0L, i4);
        r rVar = this.f25173a;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i4) {
            nk.k.b(rVar);
            int i13 = rVar.f25208c;
            int i14 = rVar.f25207b;
            if (i13 == i14) {
                throw new AssertionError("s.limit == s.pos");
            }
            i11 += i13 - i14;
            i12++;
            rVar = rVar.f25211f;
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        r rVar2 = this.f25173a;
        int i15 = 0;
        while (i10 < i4) {
            nk.k.b(rVar2);
            bArr[i15] = rVar2.f25206a;
            i10 += rVar2.f25208c - rVar2.f25207b;
            iArr[i15] = Math.min(i10, i4);
            iArr[i15 + i12] = rVar2.f25207b;
            rVar2.f25209d = true;
            i15++;
            rVar2 = rVar2.f25211f;
        }
        return new t(bArr, iArr);
    }

    public final r w(int i4) {
        if (i4 < 1 || i4 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        r rVar = this.f25173a;
        if (rVar == null) {
            r rVarB = s.b();
            this.f25173a = rVarB;
            rVarB.g = rVarB;
            rVarB.f25211f = rVarB;
            return rVarB;
        }
        r rVar2 = rVar.g;
        nk.k.b(rVar2);
        if (rVar2.f25208c + i4 <= 8192 && rVar2.f25210e) {
            return rVar2;
        }
        r rVarB2 = s.b();
        rVar2.b(rVarB2);
        return rVarB2;
    }

    @Override // hm.f
    public final f write(byte[] bArr) {
        nk.k.e(bArr, "source");
        write(bArr, 0, bArr.length);
        return this;
    }

    @Override // hm.f
    public final /* bridge */ /* synthetic */ f writeByte(int i4) {
        E(i4);
        return this;
    }

    @Override // hm.f
    public final /* bridge */ /* synthetic */ f writeInt(int i4) {
        L(i4);
        return this;
    }

    @Override // hm.f
    public final /* bridge */ /* synthetic */ f writeShort(int i4) {
        N(i4);
        return this;
    }

    @Override // hm.f
    public final /* bridge */ /* synthetic */ f writeUtf8(String str) {
        T(str);
        return this;
    }

    @Override // hm.f
    public final /* bridge */ /* synthetic */ f x(int i4, byte[] bArr) {
        write(bArr, 0, i4);
        return this;
    }

    public final void y(h hVar) {
        nk.k.e(hVar, "byteString");
        hVar.k(this, hVar.a());
    }

    public final String readString(long j, Charset charset) throws EOFException {
        nk.k.e(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a0.g.j(j, "byteCount: ").toString());
        }
        if (this.f25174b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        r rVar = this.f25173a;
        nk.k.b(rVar);
        int i4 = rVar.f25207b;
        if (i4 + j > rVar.f25208c) {
            return new String(readByteArray(j), charset);
        }
        int i10 = (int) j;
        String str = new String(rVar.f25206a, i4, i10, charset);
        int i11 = rVar.f25207b + i10;
        rVar.f25207b = i11;
        this.f25174b -= j;
        if (i11 == rVar.f25208c) {
            this.f25173a = rVar.a();
            s.a(rVar);
        }
        return str;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        nk.k.e(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i4 = iRemaining;
        while (i4 > 0) {
            r rVarW = w(1);
            int iMin = Math.min(i4, 8192 - rVarW.f25208c);
            byteBuffer.get(rVarW.f25206a, rVarW.f25208c, iMin);
            i4 -= iMin;
            rVarW.f25208c += iMin;
        }
        this.f25174b += iRemaining;
        return iRemaining;
    }

    public final int read(byte[] bArr, int i4, int i10) {
        i0.d(bArr.length, i4, i10);
        r rVar = this.f25173a;
        if (rVar == null) {
            return -1;
        }
        int iMin = Math.min(i10, rVar.f25208c - rVar.f25207b);
        byte[] bArr2 = rVar.f25206a;
        int i11 = rVar.f25207b;
        zj.m.O(bArr2, i4, bArr, i11, i11 + iMin);
        int i12 = rVar.f25207b + iMin;
        rVar.f25207b = i12;
        this.f25174b -= iMin;
        if (i12 == rVar.f25208c) {
            this.f25173a = rVar.a();
            s.a(rVar);
        }
        return iMin;
    }

    public final void write(byte[] bArr, int i4, int i10) {
        nk.k.e(bArr, "source");
        long j = i10;
        i0.d(bArr.length, i4, j);
        int i11 = i10 + i4;
        while (i4 < i11) {
            r rVarW = w(1);
            int iMin = Math.min(i11 - i4, 8192 - rVarW.f25208c);
            int i12 = i4 + iMin;
            zj.m.O(bArr, rVarW.f25208c, rVarW.f25206a, i4, i12);
            rVarW.f25208c += iMin;
            i4 = i12;
        }
        this.f25174b += j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, hm.u
    public final void close() {
    }

    @Override // hm.f, hm.u, java.io.Flushable
    public final void flush() {
    }

    @Override // hm.g, hm.f
    public final e getBuffer() {
        return this;
    }
}
