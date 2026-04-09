package ia;

import A9.I;
import N7.H7;
import c9.C2088i;
import g0.C4356c;
import io.appmetrica.analytics.impl.Oo;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;
import y9.C5819a;

/* compiled from: Buffer.kt */
/* renamed from: ia.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4468d implements g, f, Cloneable, ByteChannel {

    /* renamed from: b, reason: collision with root package name */
    public x f38642b;

    /* renamed from: c, reason: collision with root package name */
    public long f38643c;

    @Override // ia.f
    public final /* bridge */ /* synthetic */ f A0(int i, int i10, byte[] bArr) {
        B0(bArr, i, i10);
        return this;
    }

    public final long B(h targetBytes) {
        kotlin.jvm.internal.l.f(targetBytes, "targetBytes");
        return D(targetBytes, 0L);
    }

    public final void B0(byte[] source, int i, int i10) {
        kotlin.jvm.internal.l.f(source, "source");
        long j4 = i10;
        I.m(source.length, i, j4);
        int i11 = i10 + i;
        while (i < i11) {
            x xVarW0 = w0(1);
            int iMin = Math.min(i11 - i, 8192 - xVarW0.f38690c);
            int i12 = i + iMin;
            C2088i.d(source, xVarW0.f38690c, xVarW0.f38688a, i, i12);
            xVarW0.f38690c += iMin;
            i = i12;
        }
        this.f38643c += j4;
    }

    public final void C0(int i) {
        x xVarW0 = w0(1);
        int i10 = xVarW0.f38690c;
        xVarW0.f38690c = i10 + 1;
        xVarW0.f38688a[i10] = (byte) i;
        this.f38643c++;
    }

    public final long D(h targetBytes, long j4) {
        kotlin.jvm.internal.l.f(targetBytes, "targetBytes");
        long j10 = 0;
        if (j4 < 0) {
            throw new IllegalArgumentException(Oo.d(j4, "fromIndex < 0: ").toString());
        }
        x xVar = this.f38642b;
        if (xVar == null) {
            return -1L;
        }
        long j11 = this.f38643c;
        if (j11 - j4 < j4) {
            while (j11 > j4) {
                xVar = xVar.f38694g;
                kotlin.jvm.internal.l.c(xVar);
                j11 -= xVar.f38690c - xVar.f38689b;
            }
            if (targetBytes.c() == 2) {
                byte bF = targetBytes.f(0);
                byte bF2 = targetBytes.f(1);
                while (j11 < this.f38643c) {
                    int i = xVar.f38690c;
                    for (int i10 = (int) ((xVar.f38689b + j4) - j11); i10 < i; i10++) {
                        byte b10 = xVar.f38688a[i10];
                        if (b10 == bF || b10 == bF2) {
                            return (i10 - xVar.f38689b) + j11;
                        }
                    }
                    j11 += xVar.f38690c - xVar.f38689b;
                    xVar = xVar.f38693f;
                    kotlin.jvm.internal.l.c(xVar);
                    j4 = j11;
                }
            } else {
                byte[] bArrE = targetBytes.e();
                while (j11 < this.f38643c) {
                    int i11 = xVar.f38690c;
                    for (int i12 = (int) ((xVar.f38689b + j4) - j11); i12 < i11; i12++) {
                        byte b11 = xVar.f38688a[i12];
                        for (byte b12 : bArrE) {
                            if (b11 == b12) {
                                return (i12 - xVar.f38689b) + j11;
                            }
                        }
                    }
                    j11 += xVar.f38690c - xVar.f38689b;
                    xVar = xVar.f38693f;
                    kotlin.jvm.internal.l.c(xVar);
                    j4 = j11;
                }
            }
            return -1L;
        }
        while (true) {
            long j12 = (xVar.f38690c - xVar.f38689b) + j10;
            if (j12 > j4) {
                break;
            }
            xVar = xVar.f38693f;
            kotlin.jvm.internal.l.c(xVar);
            j10 = j12;
        }
        if (targetBytes.c() == 2) {
            byte bF3 = targetBytes.f(0);
            byte bF4 = targetBytes.f(1);
            while (j10 < this.f38643c) {
                int i13 = xVar.f38690c;
                for (int i14 = (int) ((xVar.f38689b + j4) - j10); i14 < i13; i14++) {
                    byte b13 = xVar.f38688a[i14];
                    if (b13 == bF3 || b13 == bF4) {
                        return (i14 - xVar.f38689b) + j10;
                    }
                }
                j10 += xVar.f38690c - xVar.f38689b;
                xVar = xVar.f38693f;
                kotlin.jvm.internal.l.c(xVar);
                j4 = j10;
            }
        } else {
            byte[] bArrE2 = targetBytes.e();
            while (j10 < this.f38643c) {
                int i15 = xVar.f38690c;
                for (int i16 = (int) ((xVar.f38689b + j4) - j10); i16 < i15; i16++) {
                    byte b14 = xVar.f38688a[i16];
                    for (byte b15 : bArrE2) {
                        if (b14 == b15) {
                            return (i16 - xVar.f38689b) + j10;
                        }
                    }
                }
                j10 += xVar.f38690c - xVar.f38689b;
                xVar = xVar.f38693f;
                kotlin.jvm.internal.l.c(xVar);
                j4 = j10;
            }
        }
        return -1L;
    }

    public final void D0(long j4) {
        boolean z10;
        byte[] bArr;
        if (j4 == 0) {
            C0(48);
            return;
        }
        int i = 1;
        if (j4 < 0) {
            j4 = -j4;
            if (j4 < 0) {
                R0("-9223372036854775808");
                return;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j4 >= 100000000) {
            i = j4 < 1000000000000L ? j4 < 10000000000L ? j4 < 1000000000 ? 9 : 10 : j4 < 100000000000L ? 11 : 12 : j4 < 1000000000000000L ? j4 < 10000000000000L ? 13 : j4 < 100000000000000L ? 14 : 15 : j4 < 100000000000000000L ? j4 < 10000000000000000L ? 16 : 17 : j4 < 1000000000000000000L ? 18 : 19;
        } else if (j4 >= 10000) {
            i = j4 < 1000000 ? j4 < 100000 ? 5 : 6 : j4 < 10000000 ? 7 : 8;
        } else if (j4 >= 100) {
            i = j4 < 1000 ? 3 : 4;
        } else if (j4 >= 10) {
            i = 2;
        }
        if (z10) {
            i++;
        }
        x xVarW0 = w0(i);
        int i10 = xVarW0.f38690c + i;
        while (true) {
            bArr = xVarW0.f38688a;
            if (j4 == 0) {
                break;
            }
            long j10 = 10;
            i10--;
            bArr[i10] = ja.a.f43143a[(int) (j4 % j10)];
            j4 /= j10;
        }
        if (z10) {
            bArr[i10 - 1] = 45;
        }
        xVarW0.f38690c += i;
        this.f38643c += i;
    }

    public final byte[] F(long j4) throws EOFException {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(Oo.d(j4, "byteCount: ").toString());
        }
        if (this.f38643c < j4) {
            throw new EOFException();
        }
        int i = (int) j4;
        byte[] bArr = new byte[i];
        int i10 = 0;
        while (i10 < i) {
            int i11 = read(bArr, i10, i - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
        return bArr;
    }

    @Override // ia.g
    public final void F0(long j4) throws EOFException {
        if (this.f38643c < j4) {
            throw new EOFException();
        }
    }

    @Override // ia.f
    public final /* bridge */ /* synthetic */ f H0(long j4) {
        D0(j4);
        return this;
    }

    @Override // ia.g
    public final byte[] I() {
        return F(this.f38643c);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d A[EDGE_INSN: B:43:0x008d->B:37:0x008d BREAK  A[LOOP:0: B:5:0x000b->B:45:?], SYNTHETIC] */
    @Override // ia.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long J0() throws java.io.EOFException {
        /*
            r13 = this;
            long r0 = r13.f38643c
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L94
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            ia.x r6 = r13.f38642b
            kotlin.jvm.internal.l.c(r6)
            int r7 = r6.f38689b
            int r8 = r6.f38690c
        L14:
            if (r7 >= r8) goto L79
            byte[] r9 = r6.f38688a
            r9 = r9[r7]
            r10 = 48
            if (r9 < r10) goto L25
            r10 = 57
            if (r9 > r10) goto L25
            int r10 = r9 + (-48)
            goto L3a
        L25:
            r10 = 97
            if (r9 < r10) goto L30
            r10 = 102(0x66, float:1.43E-43)
            if (r9 > r10) goto L30
            int r10 = r9 + (-87)
            goto L3a
        L30:
            r10 = 65
            if (r9 < r10) goto L65
            r10 = 70
            if (r9 > r10) goto L65
            int r10 = r9 + (-55)
        L3a:
            r11 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r11 = r11 & r4
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 != 0) goto L4a
            r9 = 4
            long r4 = r4 << r9
            long r9 = (long) r10
            long r4 = r4 | r9
            int r7 = r7 + 1
            int r0 = r0 + 1
            goto L14
        L4a:
            ia.d r0 = new ia.d
            r0.<init>()
            r0.N0(r4)
            r0.C0(r9)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.p0()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L65:
            if (r0 == 0) goto L69
            r1 = 1
            goto L79
        L69:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = A9.I.G(r9)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L79:
            if (r7 != r8) goto L85
            ia.x r7 = r6.a()
            r13.f38642b = r7
            ia.y.a(r6)
            goto L87
        L85:
            r6.f38689b = r7
        L87:
            if (r1 != 0) goto L8d
            ia.x r6 = r13.f38642b
            if (r6 != 0) goto Lb
        L8d:
            long r1 = r13.f38643c
            long r6 = (long) r0
            long r1 = r1 - r6
            r13.f38643c = r1
            return r4
        L94:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.C4468d.J0():long");
    }

    @Override // ia.g
    public final boolean K() {
        return this.f38643c == 0;
    }

    @Override // ia.f
    public final /* bridge */ /* synthetic */ f L(int i) {
        C0(i);
        return this;
    }

    @Override // ia.g
    public final InputStream L0() {
        return new a();
    }

    public final void N0(long j4) {
        if (j4 == 0) {
            C0(48);
            return;
        }
        long j10 = (j4 >>> 1) | j4;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + 3) / 4);
        x xVarW0 = w0(i);
        int i10 = xVarW0.f38690c;
        for (int i11 = (i10 + i) - 1; i11 >= i10; i11--) {
            xVarW0.f38688a[i11] = ja.a.f43143a[(int) (15 & j4)];
            j4 >>>= 4;
        }
        xVarW0.f38690c += i;
        this.f38643c += i;
    }

    public final void O0(int i) {
        x xVarW0 = w0(4);
        int i10 = xVarW0.f38690c;
        byte b10 = (byte) ((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = xVarW0.f38688a;
        bArr[i10] = b10;
        bArr[i10 + 1] = (byte) ((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i10 + 2] = (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i10 + 3] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        xVarW0.f38690c = i10 + 4;
        this.f38643c += 4;
    }

    @Override // ia.f
    public final /* bridge */ /* synthetic */ f P(h hVar) {
        y0(hVar);
        return this;
    }

    public final void P0(int i) {
        x xVarW0 = w0(2);
        int i10 = xVarW0.f38690c;
        byte b10 = (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = xVarW0.f38688a;
        bArr[i10] = b10;
        bArr[i10 + 1] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        xVarW0.f38690c = i10 + 2;
        this.f38643c += 2;
    }

    public final void Q0(int i, int i10, String string) {
        char cCharAt;
        kotlin.jvm.internal.l.f(string, "string");
        if (i < 0) {
            throw new IllegalArgumentException(C4356c.h(i, "beginIndex < 0: ").toString());
        }
        if (i10 < i) {
            throw new IllegalArgumentException(H7.n(i10, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i10 > string.length()) {
            StringBuilder sbJ = C4356c.j(i10, "endIndex > string.length: ", " > ");
            sbJ.append(string.length());
            throw new IllegalArgumentException(sbJ.toString().toString());
        }
        while (i < i10) {
            char cCharAt2 = string.charAt(i);
            if (cCharAt2 < 128) {
                x xVarW0 = w0(1);
                int i11 = xVarW0.f38690c - i;
                int iMin = Math.min(i10, 8192 - i11);
                int i12 = i + 1;
                byte[] bArr = xVarW0.f38688a;
                bArr[i + i11] = (byte) cCharAt2;
                while (true) {
                    i = i12;
                    if (i >= iMin || (cCharAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i12 = i + 1;
                    bArr[i + i11] = (byte) cCharAt;
                }
                int i13 = xVarW0.f38690c;
                int i14 = (i11 + i) - i13;
                xVarW0.f38690c = i13 + i14;
                this.f38643c += i14;
            } else {
                if (cCharAt2 < 2048) {
                    x xVarW02 = w0(2);
                    int i15 = xVarW02.f38690c;
                    byte[] bArr2 = xVarW02.f38688a;
                    bArr2[i15] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i15 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    xVarW02.f38690c = i15 + 2;
                    this.f38643c += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    x xVarW03 = w0(3);
                    int i16 = xVarW03.f38690c;
                    byte[] bArr3 = xVarW03.f38688a;
                    bArr3[i16] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i16 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i16 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    xVarW03.f38690c = i16 + 3;
                    this.f38643c += 3;
                } else {
                    int i17 = i + 1;
                    char cCharAt3 = i17 < i10 ? string.charAt(i17) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        C0(63);
                        i = i17;
                    } else {
                        int i18 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        x xVarW04 = w0(4);
                        int i19 = xVarW04.f38690c;
                        byte[] bArr4 = xVarW04.f38688a;
                        bArr4[i19] = (byte) ((i18 >> 18) | 240);
                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                        xVarW04.f38690c = i19 + 4;
                        this.f38643c += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void R0(String string) {
        kotlin.jvm.internal.l.f(string, "string");
        Q0(0, string.length(), string);
    }

    @Override // ia.g
    public final String S(long j4) throws EOFException {
        if (j4 < 0) {
            throw new IllegalArgumentException(Oo.d(j4, "limit < 0: ").toString());
        }
        long j10 = j4 != Long.MAX_VALUE ? j4 + 1 : Long.MAX_VALUE;
        long jN = n((byte) 10, 0L, j10);
        if (jN != -1) {
            return ja.a.a(this, jN);
        }
        if (j10 < this.f38643c && l(j10 - 1) == 13 && l(j10) == 10) {
            return ja.a.a(this, j10);
        }
        C4468d c4468d = new C4468d();
        k(c4468d, 0L, Math.min(32, this.f38643c));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f38643c, j4) + " content=" + c4468d.g(c4468d.f38643c).d() + (char) 8230);
    }

    public final void S0(int i) {
        if (i < 128) {
            C0(i);
            return;
        }
        if (i < 2048) {
            x xVarW0 = w0(2);
            int i10 = xVarW0.f38690c;
            byte[] bArr = xVarW0.f38688a;
            bArr[i10] = (byte) ((i >> 6) | 192);
            bArr[i10 + 1] = (byte) ((i & 63) | 128);
            xVarW0.f38690c = i10 + 2;
            this.f38643c += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            C0(63);
            return;
        }
        if (i < 65536) {
            x xVarW02 = w0(3);
            int i11 = xVarW02.f38690c;
            byte[] bArr2 = xVarW02.f38688a;
            bArr2[i11] = (byte) ((i >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((i & 63) | 128);
            xVarW02.f38690c = i11 + 3;
            this.f38643c += 3;
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(I.H(i)));
        }
        x xVarW03 = w0(4);
        int i12 = xVarW03.f38690c;
        byte[] bArr3 = xVarW03.f38688a;
        bArr3[i12] = (byte) ((i >> 18) | 240);
        bArr3[i12 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i12 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i12 + 3] = (byte) ((i & 63) | 128);
        xVarW03.f38690c = i12 + 4;
        this.f38643c += 4;
    }

    @Override // ia.f
    public final long X(C source) throws IOException {
        kotlin.jvm.internal.l.f(source, "source");
        long j4 = 0;
        while (true) {
            long j10 = source.read(this, 8192L);
            if (j10 == -1) {
                return j4;
            }
            j4 += j10;
        }
    }

    public final void a() throws EOFException {
        skip(this.f38643c);
    }

    @Override // ia.f
    public final /* bridge */ /* synthetic */ f c0(String str) {
        R0(str);
        return this;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C4468d clone() {
        C4468d c4468d = new C4468d();
        if (this.f38643c == 0) {
            return c4468d;
        }
        x xVar = this.f38642b;
        kotlin.jvm.internal.l.c(xVar);
        x xVarC = xVar.c();
        c4468d.f38642b = xVarC;
        xVarC.f38694g = xVarC;
        xVarC.f38693f = xVarC;
        for (x xVar2 = xVar.f38693f; xVar2 != xVar; xVar2 = xVar2.f38693f) {
            x xVar3 = xVarC.f38694g;
            kotlin.jvm.internal.l.c(xVar3);
            kotlin.jvm.internal.l.c(xVar2);
            xVar3.b(xVar2.c());
        }
        c4468d.f38643c = this.f38643c;
        return c4468d;
    }

    @Override // ia.g
    public final String d0(Charset charset) {
        return m0(this.f38643c, charset);
    }

    public final long e() {
        long j4 = this.f38643c;
        if (j4 == 0) {
            return 0L;
        }
        x xVar = this.f38642b;
        kotlin.jvm.internal.l.c(xVar);
        x xVar2 = xVar.f38694g;
        kotlin.jvm.internal.l.c(xVar2);
        return (xVar2.f38690c >= 8192 || !xVar2.f38692e) ? j4 : j4 - (r3 - xVar2.f38689b);
    }

    public final boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        boolean z11 = false;
        if (!(obj instanceof C4468d)) {
            return false;
        }
        long j4 = this.f38643c;
        C4468d c4468d = (C4468d) obj;
        if (j4 != c4468d.f38643c) {
            return false;
        }
        if (j4 == 0) {
            return true;
        }
        x xVar = this.f38642b;
        kotlin.jvm.internal.l.c(xVar);
        x xVar2 = c4468d.f38642b;
        kotlin.jvm.internal.l.c(xVar2);
        int i = xVar.f38689b;
        int i10 = xVar2.f38689b;
        long j10 = 0;
        while (j10 < this.f38643c) {
            long jMin = Math.min(xVar.f38690c - i, xVar2.f38690c - i10);
            long j11 = 0;
            while (j11 < jMin) {
                int i11 = i + 1;
                boolean z12 = z10;
                byte b10 = xVar.f38688a[i];
                int i12 = i10 + 1;
                boolean z13 = z11;
                if (b10 != xVar2.f38688a[i10]) {
                    return z13;
                }
                j11++;
                i10 = i12;
                i = i11;
                z10 = z12;
                z11 = z13;
            }
            boolean z14 = z10;
            boolean z15 = z11;
            if (i == xVar.f38690c) {
                x xVar3 = xVar.f38693f;
                kotlin.jvm.internal.l.c(xVar3);
                i = xVar3.f38689b;
                xVar = xVar3;
            }
            if (i10 == xVar2.f38690c) {
                xVar2 = xVar2.f38693f;
                kotlin.jvm.internal.l.c(xVar2);
                i10 = xVar2.f38689b;
            }
            j10 += jMin;
            z10 = z14;
            z11 = z15;
        }
        return z10;
    }

    @Override // ia.f
    public final /* bridge */ /* synthetic */ f f0(long j4) {
        N0(j4);
        return this;
    }

    @Override // ia.g
    public final h g(long j4) throws EOFException {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(Oo.d(j4, "byteCount: ").toString());
        }
        if (this.f38643c < j4) {
            throw new EOFException();
        }
        if (j4 < 4096) {
            return new h(F(j4));
        }
        h hVarV0 = v0((int) j4);
        skip(j4);
        return hVarV0;
    }

    @Override // ia.g
    public final h h0() {
        return g(this.f38643c);
    }

    public final int hashCode() {
        x xVar = this.f38642b;
        if (xVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i10 = xVar.f38690c;
            for (int i11 = xVar.f38689b; i11 < i10; i11++) {
                i = (i * 31) + xVar.f38688a[i11];
            }
            xVar = xVar.f38693f;
            kotlin.jvm.internal.l.c(xVar);
        } while (xVar != this.f38642b);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // ia.f
    public final /* bridge */ /* synthetic */ f j(int i) {
        P0(i);
        return this;
    }

    public final void k(C4468d out, long j4, long j10) {
        kotlin.jvm.internal.l.f(out, "out");
        long j11 = j4;
        I.m(this.f38643c, j11, j10);
        if (j10 == 0) {
            return;
        }
        out.f38643c += j10;
        x xVar = this.f38642b;
        while (true) {
            kotlin.jvm.internal.l.c(xVar);
            long j12 = xVar.f38690c - xVar.f38689b;
            if (j11 < j12) {
                break;
            }
            j11 -= j12;
            xVar = xVar.f38693f;
        }
        x xVar2 = xVar;
        long j13 = j10;
        while (j13 > 0) {
            kotlin.jvm.internal.l.c(xVar2);
            x xVarC = xVar2.c();
            int i = xVarC.f38689b + ((int) j11);
            xVarC.f38689b = i;
            xVarC.f38690c = Math.min(i + ((int) j13), xVarC.f38690c);
            x xVar3 = out.f38642b;
            if (xVar3 == null) {
                xVarC.f38694g = xVarC;
                xVarC.f38693f = xVarC;
                out.f38642b = xVarC;
            } else {
                x xVar4 = xVar3.f38694g;
                kotlin.jvm.internal.l.c(xVar4);
                xVar4.b(xVarC);
            }
            j13 -= xVarC.f38690c - xVarC.f38689b;
            xVar2 = xVar2.f38693f;
            j11 = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r1 = new ia.C4468d();
        r1.D0(r8);
        r1.C0(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r2 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: ".concat(r1.p0()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long k0() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.C4468d.k0():long");
    }

    public final byte l(long j4) {
        I.m(this.f38643c, j4, 1L);
        x xVar = this.f38642b;
        if (xVar == null) {
            kotlin.jvm.internal.l.c(null);
            throw null;
        }
        long j10 = this.f38643c;
        if (j10 - j4 < j4) {
            while (j10 > j4) {
                xVar = xVar.f38694g;
                kotlin.jvm.internal.l.c(xVar);
                j10 -= xVar.f38690c - xVar.f38689b;
            }
            return xVar.f38688a[(int) ((xVar.f38689b + j4) - j10)];
        }
        long j11 = 0;
        while (true) {
            int i = xVar.f38690c;
            int i10 = xVar.f38689b;
            long j12 = (i - i10) + j11;
            if (j12 > j4) {
                return xVar.f38688a[(int) ((i10 + j4) - j11)];
            }
            xVar = xVar.f38693f;
            kotlin.jvm.internal.l.c(xVar);
            j11 = j12;
        }
    }

    @Override // ia.g
    public final boolean l0(long j4) {
        return this.f38643c >= j4;
    }

    @Override // ia.f
    public final /* bridge */ /* synthetic */ f m(int i) {
        O0(i);
        return this;
    }

    public final String m0(long j4, Charset charset) throws EOFException {
        kotlin.jvm.internal.l.f(charset, "charset");
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(Oo.d(j4, "byteCount: ").toString());
        }
        if (this.f38643c < j4) {
            throw new EOFException();
        }
        if (j4 == 0) {
            return "";
        }
        x xVar = this.f38642b;
        kotlin.jvm.internal.l.c(xVar);
        int i = xVar.f38689b;
        if (i + j4 > xVar.f38690c) {
            return new String(F(j4), charset);
        }
        int i10 = (int) j4;
        String str = new String(xVar.f38688a, i, i10, charset);
        int i11 = xVar.f38689b + i10;
        xVar.f38689b = i11;
        this.f38643c -= j4;
        if (i11 == xVar.f38690c) {
            this.f38642b = xVar.a();
            y.a(xVar);
        }
        return str;
    }

    public final long n(byte b10, long j4, long j10) {
        x xVar;
        long j11 = 0;
        if (0 > j4 || j4 > j10) {
            throw new IllegalArgumentException(("size=" + this.f38643c + " fromIndex=" + j4 + " toIndex=" + j10).toString());
        }
        long j12 = this.f38643c;
        if (j10 > j12) {
            j10 = j12;
        }
        if (j4 == j10 || (xVar = this.f38642b) == null) {
            return -1L;
        }
        if (j12 - j4 < j4) {
            while (j12 > j4) {
                xVar = xVar.f38694g;
                kotlin.jvm.internal.l.c(xVar);
                j12 -= xVar.f38690c - xVar.f38689b;
            }
            while (j12 < j10) {
                int iMin = (int) Math.min(xVar.f38690c, (xVar.f38689b + j10) - j12);
                for (int i = (int) ((xVar.f38689b + j4) - j12); i < iMin; i++) {
                    if (xVar.f38688a[i] == b10) {
                        return (i - xVar.f38689b) + j12;
                    }
                }
                j12 += xVar.f38690c - xVar.f38689b;
                xVar = xVar.f38693f;
                kotlin.jvm.internal.l.c(xVar);
                j4 = j12;
            }
            return -1L;
        }
        while (true) {
            long j13 = (xVar.f38690c - xVar.f38689b) + j11;
            if (j13 > j4) {
                break;
            }
            xVar = xVar.f38693f;
            kotlin.jvm.internal.l.c(xVar);
            j11 = j13;
        }
        while (j11 < j10) {
            int iMin2 = (int) Math.min(xVar.f38690c, (xVar.f38689b + j10) - j11);
            for (int i10 = (int) ((xVar.f38689b + j4) - j11); i10 < iMin2; i10++) {
                if (xVar.f38688a[i10] == b10) {
                    return (i10 - xVar.f38689b) + j11;
                }
            }
            j11 += xVar.f38690c - xVar.f38689b;
            xVar = xVar.f38693f;
            kotlin.jvm.internal.l.c(xVar);
            j4 = j11;
        }
        return -1L;
    }

    @Override // ia.g
    public final long o(C4468d c4468d) throws IOException {
        long j4 = this.f38643c;
        if (j4 > 0) {
            c4468d.write(this, j4);
        }
        return j4;
    }

    @Override // ia.g
    public final String o0() throws EOFException {
        return S(Long.MAX_VALUE);
    }

    public final String p0() {
        return m0(this.f38643c, C5819a.f48359b);
    }

    public final int q0() throws EOFException {
        int i;
        int i10;
        int i11;
        if (this.f38643c == 0) {
            throw new EOFException();
        }
        byte bL = l(0L);
        if ((bL & 128) == 0) {
            i = bL & 127;
            i11 = 0;
            i10 = 1;
        } else if ((bL & 224) == 192) {
            i = bL & 31;
            i10 = 2;
            i11 = 128;
        } else if ((bL & 240) == 224) {
            i = bL & 15;
            i10 = 3;
            i11 = 2048;
        } else {
            if ((bL & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bL & 7;
            i10 = 4;
            i11 = 65536;
        }
        long j4 = i10;
        if (this.f38643c < j4) {
            StringBuilder sbJ = C4356c.j(i10, "size < ", ": ");
            sbJ.append(this.f38643c);
            sbJ.append(" (to read code point prefixed 0x");
            sbJ.append(I.G(bL));
            sbJ.append(')');
            throw new EOFException(sbJ.toString());
        }
        for (int i12 = 1; i12 < i10; i12++) {
            long j10 = i12;
            byte bL2 = l(j10);
            if ((bL2 & 192) != 128) {
                skip(j10);
                return 65533;
            }
            i = (i << 6) | (bL2 & 63);
        }
        skip(j4);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i11) {
            return i;
        }
        return 65533;
    }

    @Override // ia.C
    public final long read(C4468d sink, long j4) {
        kotlin.jvm.internal.l.f(sink, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(Oo.d(j4, "byteCount < 0: ").toString());
        }
        long j10 = this.f38643c;
        if (j10 == 0) {
            return -1L;
        }
        if (j4 > j10) {
            j4 = j10;
        }
        sink.write(this, j4);
        return j4;
    }

    @Override // ia.g
    public final byte readByte() throws EOFException {
        if (this.f38643c == 0) {
            throw new EOFException();
        }
        x xVar = this.f38642b;
        kotlin.jvm.internal.l.c(xVar);
        int i = xVar.f38689b;
        int i10 = xVar.f38690c;
        int i11 = i + 1;
        byte b10 = xVar.f38688a[i];
        this.f38643c--;
        if (i11 != i10) {
            xVar.f38689b = i11;
            return b10;
        }
        this.f38642b = xVar.a();
        y.a(xVar);
        return b10;
    }

    @Override // ia.g
    public final int readInt() throws EOFException {
        if (this.f38643c < 4) {
            throw new EOFException();
        }
        x xVar = this.f38642b;
        kotlin.jvm.internal.l.c(xVar);
        int i = xVar.f38689b;
        int i10 = xVar.f38690c;
        if (i10 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = xVar.f38688a;
        int i11 = i + 3;
        int i12 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i13 = i + 4;
        int i14 = i12 | (bArr[i11] & 255);
        this.f38643c -= 4;
        if (i13 != i10) {
            xVar.f38689b = i13;
            return i14;
        }
        this.f38642b = xVar.a();
        y.a(xVar);
        return i14;
    }

    @Override // ia.g
    public final short readShort() throws EOFException {
        if (this.f38643c < 2) {
            throw new EOFException();
        }
        x xVar = this.f38642b;
        kotlin.jvm.internal.l.c(xVar);
        int i = xVar.f38689b;
        int i10 = xVar.f38690c;
        if (i10 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        int i11 = i + 1;
        byte[] bArr = xVar.f38688a;
        int i12 = (bArr[i] & 255) << 8;
        int i13 = i + 2;
        int i14 = (bArr[i11] & 255) | i12;
        this.f38643c -= 2;
        if (i13 == i10) {
            this.f38642b = xVar.a();
            y.a(xVar);
        } else {
            xVar.f38689b = i13;
        }
        return (short) i14;
    }

    @Override // ia.g
    public final void skip(long j4) throws EOFException {
        while (j4 > 0) {
            x xVar = this.f38642b;
            if (xVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j4, xVar.f38690c - xVar.f38689b);
            long j10 = iMin;
            this.f38643c -= j10;
            j4 -= j10;
            int i = xVar.f38689b + iMin;
            xVar.f38689b = i;
            if (i == xVar.f38690c) {
                this.f38642b = xVar.a();
                y.a(xVar);
            }
        }
    }

    @Override // ia.f
    public final f t0(byte[] source) {
        kotlin.jvm.internal.l.f(source, "source");
        B0(source, 0, source.length);
        return this;
    }

    @Override // ia.C
    public final D timeout() {
        return D.NONE;
    }

    public final String toString() {
        return u0().toString();
    }

    public final h u0() {
        long j4 = this.f38643c;
        if (j4 <= 2147483647L) {
            return v0((int) j4);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f38643c).toString());
    }

    public final h v0(int i) {
        if (i == 0) {
            return h.f38646e;
        }
        I.m(this.f38643c, 0L, i);
        x xVar = this.f38642b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i) {
            kotlin.jvm.internal.l.c(xVar);
            int i13 = xVar.f38690c;
            int i14 = xVar.f38689b;
            if (i13 == i14) {
                throw new AssertionError("s.limit == s.pos");
            }
            i11 += i13 - i14;
            i12++;
            xVar = xVar.f38693f;
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        x xVar2 = this.f38642b;
        int i15 = 0;
        while (i10 < i) {
            kotlin.jvm.internal.l.c(xVar2);
            bArr[i15] = xVar2.f38688a;
            i10 += xVar2.f38690c - xVar2.f38689b;
            iArr[i15] = Math.min(i10, i);
            iArr[i15 + i12] = xVar2.f38689b;
            xVar2.f38691d = true;
            i15++;
            xVar2 = xVar2.f38693f;
        }
        return new z(bArr, iArr);
    }

    public final x w0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        x xVar = this.f38642b;
        if (xVar == null) {
            x xVarB = y.b();
            this.f38642b = xVarB;
            xVarB.f38694g = xVarB;
            xVarB.f38693f = xVarB;
            return xVarB;
        }
        x xVar2 = xVar.f38694g;
        kotlin.jvm.internal.l.c(xVar2);
        if (xVar2.f38690c + i <= 8192 && xVar2.f38692e) {
            return xVar2;
        }
        x xVarB2 = y.b();
        xVar2.b(xVarB2);
        return xVarB2;
    }

    @Override // ia.A
    public final void write(C4468d source, long j4) {
        x xVarB;
        kotlin.jvm.internal.l.f(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        I.m(source.f38643c, 0L, j4);
        while (j4 > 0) {
            x xVar = source.f38642b;
            kotlin.jvm.internal.l.c(xVar);
            int i = xVar.f38690c;
            x xVar2 = source.f38642b;
            kotlin.jvm.internal.l.c(xVar2);
            long j10 = i - xVar2.f38689b;
            int i10 = 0;
            if (j4 < j10) {
                x xVar3 = this.f38642b;
                x xVar4 = xVar3 != null ? xVar3.f38694g : null;
                if (xVar4 != null && xVar4.f38692e) {
                    if ((xVar4.f38690c + j4) - (xVar4.f38691d ? 0 : xVar4.f38689b) <= 8192) {
                        x xVar5 = source.f38642b;
                        kotlin.jvm.internal.l.c(xVar5);
                        xVar5.d(xVar4, (int) j4);
                        source.f38643c -= j4;
                        this.f38643c += j4;
                        return;
                    }
                }
                x xVar6 = source.f38642b;
                kotlin.jvm.internal.l.c(xVar6);
                int i11 = (int) j4;
                if (i11 <= 0 || i11 > xVar6.f38690c - xVar6.f38689b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i11 >= 1024) {
                    xVarB = xVar6.c();
                } else {
                    xVarB = y.b();
                    int i12 = xVar6.f38689b;
                    C2088i.d(xVar6.f38688a, 0, xVarB.f38688a, i12, i12 + i11);
                }
                xVarB.f38690c = xVarB.f38689b + i11;
                xVar6.f38689b += i11;
                x xVar7 = xVar6.f38694g;
                kotlin.jvm.internal.l.c(xVar7);
                xVar7.b(xVarB);
                source.f38642b = xVarB;
            }
            x xVar8 = source.f38642b;
            kotlin.jvm.internal.l.c(xVar8);
            long j11 = xVar8.f38690c - xVar8.f38689b;
            source.f38642b = xVar8.a();
            x xVar9 = this.f38642b;
            if (xVar9 == null) {
                this.f38642b = xVar8;
                xVar8.f38694g = xVar8;
                xVar8.f38693f = xVar8;
            } else {
                x xVar10 = xVar9.f38694g;
                kotlin.jvm.internal.l.c(xVar10);
                xVar10.b(xVar8);
                x xVar11 = xVar8.f38694g;
                if (xVar11 == xVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                kotlin.jvm.internal.l.c(xVar11);
                if (xVar11.f38692e) {
                    int i13 = xVar8.f38690c - xVar8.f38689b;
                    x xVar12 = xVar8.f38694g;
                    kotlin.jvm.internal.l.c(xVar12);
                    int i14 = 8192 - xVar12.f38690c;
                    x xVar13 = xVar8.f38694g;
                    kotlin.jvm.internal.l.c(xVar13);
                    if (!xVar13.f38691d) {
                        x xVar14 = xVar8.f38694g;
                        kotlin.jvm.internal.l.c(xVar14);
                        i10 = xVar14.f38689b;
                    }
                    if (i13 <= i14 + i10) {
                        x xVar15 = xVar8.f38694g;
                        kotlin.jvm.internal.l.c(xVar15);
                        xVar8.d(xVar15, i13);
                        xVar8.a();
                        y.a(xVar8);
                    }
                }
            }
            source.f38643c -= j11;
            this.f38643c += j11;
            j4 -= j11;
        }
    }

    @Override // ia.g
    public final int x0(s options) throws EOFException {
        kotlin.jvm.internal.l.f(options, "options");
        int iB = ja.a.b(this, options, false);
        if (iB == -1) {
            return -1;
        }
        skip(options.f38671b[iB].c());
        return iB;
    }

    public final void y0(h byteString) {
        kotlin.jvm.internal.l.f(byteString, "byteString");
        byteString.k(this, byteString.c());
    }

    /* compiled from: Buffer.kt */
    /* renamed from: ia.d$a */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(C4468d.this.f38643c, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public final int read() {
            C4468d c4468d = C4468d.this;
            if (c4468d.f38643c > 0) {
                return c4468d.readByte() & 255;
            }
            return -1;
        }

        public final String toString() {
            return C4468d.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] sink, int i, int i10) {
            kotlin.jvm.internal.l.f(sink, "sink");
            return C4468d.this.read(sink, i, i10);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) throws IOException {
        kotlin.jvm.internal.l.f(sink, "sink");
        x xVar = this.f38642b;
        if (xVar == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), xVar.f38690c - xVar.f38689b);
        sink.put(xVar.f38688a, xVar.f38689b, iMin);
        int i = xVar.f38689b + iMin;
        xVar.f38689b = i;
        this.f38643c -= iMin;
        if (i == xVar.f38690c) {
            this.f38642b = xVar.a();
            y.a(xVar);
        }
        return iMin;
    }

    public final int read(byte[] bArr, int i, int i10) {
        I.m(bArr.length, i, i10);
        x xVar = this.f38642b;
        if (xVar == null) {
            return -1;
        }
        int iMin = Math.min(i10, xVar.f38690c - xVar.f38689b);
        int i11 = xVar.f38689b;
        C2088i.d(xVar.f38688a, i, bArr, i11, i11 + iMin);
        int i12 = xVar.f38689b + iMin;
        xVar.f38689b = i12;
        this.f38643c -= iMin;
        if (i12 == xVar.f38690c) {
            this.f38642b = xVar.a();
            y.a(xVar);
        }
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, ia.A
    public final void close() {
    }

    @Override // ia.f, ia.A, java.io.Flushable
    public final void flush() {
    }

    @Override // ia.g, ia.f
    public final C4468d q() {
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) throws IOException {
        kotlin.jvm.internal.l.f(source, "source");
        int iRemaining = source.remaining();
        int i = iRemaining;
        while (i > 0) {
            x xVarW0 = w0(1);
            int iMin = Math.min(i, 8192 - xVarW0.f38690c);
            source.get(xVarW0.f38688a, xVarW0.f38690c, iMin);
            i -= iMin;
            xVarW0.f38690c += iMin;
        }
        this.f38643c += iRemaining;
        return iRemaining;
    }
}
