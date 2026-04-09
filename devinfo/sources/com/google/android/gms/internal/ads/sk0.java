package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Utf8;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sk0 {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f16443d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f16444e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final e51 f16445f = e51.r(new Object[]{StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE}, 5);
    public static final AtomicBoolean g = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public byte[] f16446a;

    /* renamed from: b, reason: collision with root package name */
    public int f16447b;

    /* renamed from: c, reason: collision with root package name */
    public int f16448c;

    public sk0(byte[] bArr, int i4) {
        this.f16446a = bArr;
        this.f16448c = i4;
    }

    public static int u(Charset charset) {
        mq0.Z(f16445f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean w(byte b10) {
        return (b10 & 192) == 128;
    }

    public static int x(int i4, int i10, int i11, int i12) {
        return al0.J((byte) 0, yr1.a(((i4 & 7) << 2) | ((i10 & 48) >> 4)), yr1.a(((i11 & 60) >> 2) | ((i10 & 15) << 4)), yr1.a((i12 & 63) | ((i11 & 3) << 6)));
    }

    public final void A(int i4) {
        byte[] bArr = this.f16446a;
        if (i4 > bArr.length) {
            this.f16446a = Arrays.copyOf(bArr, i4);
        }
    }

    public final int B() {
        return Math.max(this.f16448c - this.f16447b, 0);
    }

    public final void C(int i4) {
        boolean z3 = false;
        if (i4 >= 0 && i4 <= this.f16446a.length) {
            z3 = true;
        }
        mq0.m(z3);
        this.f16448c = i4;
    }

    public final int D() {
        return this.f16447b;
    }

    public final void E(int i4) {
        boolean z3 = false;
        if (i4 >= 0 && i4 <= this.f16448c) {
            z3 = true;
        }
        mq0.m(z3);
        this.f16447b = i4;
    }

    public final byte[] F() {
        return this.f16446a;
    }

    public final void G(int i4) {
        E(this.f16447b + i4);
    }

    public final void H(int i4, int i10, byte[] bArr) {
        v(i10);
        System.arraycopy(this.f16446a, this.f16447b, bArr, i4, i10);
        this.f16447b += i10;
    }

    public final int I() {
        v(1);
        return this.f16446a[this.f16447b] & 255;
    }

    public final int J() {
        if (B() >= 4) {
            this.f16447b -= 4;
            return b();
        }
        int i4 = this.f16447b;
        int i10 = this.f16448c;
        throw new IndexOutOfBoundsException(je.u.q(i4, i10, "position=", ", limit=", new StringBuilder(String.valueOf(i4).length() + 17 + String.valueOf(i10).length())));
    }

    public final int K() {
        v(1);
        byte[] bArr = this.f16446a;
        int i4 = this.f16447b;
        this.f16447b = i4 + 1;
        return bArr[i4] & 255;
    }

    public final int L() {
        v(2);
        byte[] bArr = this.f16446a;
        int i4 = this.f16447b;
        int i10 = i4 + 1;
        this.f16447b = i10;
        int i11 = bArr[i4] & 255;
        this.f16447b = i4 + 2;
        return (bArr[i10] & 255) | (i11 << 8);
    }

    public final int M() {
        v(2);
        byte[] bArr = this.f16446a;
        int i4 = this.f16447b;
        int i10 = i4 + 1;
        this.f16447b = i10;
        int i11 = bArr[i4] & 255;
        this.f16447b = i4 + 2;
        return ((bArr[i10] & 255) << 8) | i11;
    }

    public final short N() {
        v(2);
        byte[] bArr = this.f16446a;
        int i4 = this.f16447b;
        int i10 = i4 + 1;
        this.f16447b = i10;
        int i11 = bArr[i4] & 255;
        this.f16447b = i4 + 2;
        return (short) ((bArr[i10] & 255) | (i11 << 8));
    }

    public final int O() {
        v(3);
        byte[] bArr = this.f16446a;
        int i4 = this.f16447b;
        int i10 = i4 + 1;
        this.f16447b = i10;
        int i11 = bArr[i4] & 255;
        int i12 = i4 + 2;
        this.f16447b = i12;
        int i13 = bArr[i10] & 255;
        this.f16447b = i4 + 3;
        return (bArr[i12] & 255) | (i11 << 16) | (i13 << 8);
    }

    public final long P() {
        v(4);
        byte[] bArr = this.f16446a;
        int i4 = this.f16447b;
        int i10 = i4 + 1;
        this.f16447b = i10;
        long j = bArr[i4];
        int i11 = i4 + 2;
        this.f16447b = i11;
        long j8 = bArr[i10];
        this.f16447b = i4 + 3;
        long j9 = bArr[i11];
        this.f16447b = i4 + 4;
        return (bArr[r3] & 255) | ((j & 255) << 24) | ((j8 & 255) << 16) | ((j9 & 255) << 8);
    }

    public final long a() {
        v(4);
        byte[] bArr = this.f16446a;
        int i4 = this.f16447b;
        int i10 = i4 + 1;
        this.f16447b = i10;
        long j = bArr[i4];
        int i11 = i4 + 2;
        this.f16447b = i11;
        long j8 = bArr[i10];
        this.f16447b = i4 + 3;
        long j9 = bArr[i11];
        this.f16447b = i4 + 4;
        return ((bArr[r3] & 255) << 24) | (255 & j) | ((j8 & 255) << 8) | ((j9 & 255) << 16);
    }

    public final int b() {
        v(4);
        byte[] bArr = this.f16446a;
        int i4 = this.f16447b;
        int i10 = i4 + 1;
        this.f16447b = i10;
        int i11 = bArr[i4] & 255;
        int i12 = i4 + 2;
        this.f16447b = i12;
        int i13 = bArr[i10] & 255;
        int i14 = i4 + 3;
        this.f16447b = i14;
        int i15 = bArr[i12] & 255;
        this.f16447b = i4 + 4;
        return (bArr[i14] & 255) | (i11 << 24) | (i13 << 16) | (i15 << 8);
    }

    public final int c() {
        v(4);
        byte[] bArr = this.f16446a;
        int i4 = this.f16447b;
        int i10 = i4 + 1;
        this.f16447b = i10;
        int i11 = bArr[i4] & 255;
        int i12 = i4 + 2;
        this.f16447b = i12;
        int i13 = bArr[i10] & 255;
        int i14 = i4 + 3;
        this.f16447b = i14;
        int i15 = bArr[i12] & 255;
        this.f16447b = i4 + 4;
        return ((bArr[i14] & 255) << 24) | (i13 << 8) | i11 | (i15 << 16);
    }

    public final long d() {
        v(8);
        byte[] bArr = this.f16446a;
        int i4 = this.f16447b;
        int i10 = i4 + 1;
        this.f16447b = i10;
        long j = bArr[i4];
        int i11 = i4 + 2;
        this.f16447b = i11;
        long j8 = bArr[i10];
        int i12 = i4 + 3;
        this.f16447b = i12;
        long j9 = bArr[i11];
        int i13 = i4 + 4;
        this.f16447b = i13;
        long j10 = bArr[i12];
        int i14 = i4 + 5;
        this.f16447b = i14;
        long j11 = bArr[i13];
        int i15 = i4 + 6;
        this.f16447b = i15;
        long j12 = bArr[i14];
        this.f16447b = i4 + 7;
        long j13 = bArr[i15];
        this.f16447b = i4 + 8;
        return ((j13 & 255) << 8) | ((j & 255) << 56) | ((j8 & 255) << 48) | ((j9 & 255) << 40) | ((j10 & 255) << 32) | ((j11 & 255) << 24) | ((j12 & 255) << 16) | (bArr[r4] & 255);
    }

    public final long e() {
        v(8);
        byte[] bArr = this.f16446a;
        int i4 = this.f16447b;
        int i10 = i4 + 1;
        this.f16447b = i10;
        long j = bArr[i4];
        int i11 = i4 + 2;
        this.f16447b = i11;
        long j8 = bArr[i10];
        int i12 = i4 + 3;
        this.f16447b = i12;
        long j9 = bArr[i11];
        int i13 = i4 + 4;
        this.f16447b = i13;
        long j10 = bArr[i12];
        int i14 = i4 + 5;
        this.f16447b = i14;
        long j11 = bArr[i13];
        int i15 = i4 + 6;
        this.f16447b = i15;
        long j12 = bArr[i14];
        this.f16447b = i4 + 7;
        long j13 = bArr[i15];
        this.f16447b = i4 + 8;
        return ((j13 & 255) << 48) | (j & 255) | ((j8 & 255) << 8) | ((j9 & 255) << 16) | ((j10 & 255) << 24) | ((j11 & 255) << 32) | ((j12 & 255) << 40) | ((bArr[r4] & 255) << 56);
    }

    public final int f() {
        v(4);
        byte[] bArr = this.f16446a;
        int i4 = this.f16447b;
        int i10 = i4 + 1;
        this.f16447b = i10;
        int i11 = bArr[i4] & 255;
        this.f16447b = i4 + 2;
        int i12 = bArr[i10] & 255;
        this.f16447b = i4 + 4;
        return (i11 << 8) | i12;
    }

    public final int g() {
        return (K() << 21) | (K() << 14) | (K() << 7) | K();
    }

    public final int h() {
        int iB = b();
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalStateException(d.h.q(iB, "Top bit not zero: ", new StringBuilder(String.valueOf(iB).length() + 18)));
    }

    public final int i() {
        int iC = c();
        if (iC >= 0) {
            return iC;
        }
        throw new IllegalStateException(d.h.q(iC, "Top bit not zero: ", new StringBuilder(String.valueOf(iC).length() + 18)));
    }

    public final long j() {
        long jD = d();
        if (jD >= 0) {
            return jD;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(jD).length() + 18);
        sb2.append("Top bit not zero: ");
        sb2.append(jD);
        throw new IllegalStateException(sb2.toString());
    }

    public final String k(int i4, Charset charset) {
        v(i4);
        byte[] bArr = this.f16446a;
        int i10 = this.f16447b;
        String str = new String(bArr, i10, i4, charset);
        this.f16447b = i10 + i4;
        return str;
    }

    public final String l(int i4) {
        v(i4);
        if (i4 == 0) {
            return "";
        }
        int i10 = this.f16447b;
        int i11 = (i10 + i4) - 1;
        int i12 = (i11 >= this.f16448c || this.f16446a[i11] != 0) ? i4 : i4 - 1;
        byte[] bArr = this.f16446a;
        String str = bq0.f9768a;
        String str2 = new String(bArr, i10, i12, StandardCharsets.UTF_8);
        this.f16447b += i4;
        return str2;
    }

    public final String m() {
        if (B() == 0) {
            return null;
        }
        int i4 = this.f16447b;
        while (i4 < this.f16448c && this.f16446a[i4] != 0) {
            i4++;
        }
        byte[] bArr = this.f16446a;
        int i10 = this.f16447b;
        String str = bq0.f9768a;
        String str2 = new String(bArr, i10, i4 - i10, StandardCharsets.UTF_8);
        this.f16447b = i4;
        if (i4 < this.f16448c) {
            this.f16447b = i4 + 1;
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String n(java.nio.charset.Charset r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.e51 r0 = com.google.android.gms.internal.ads.sk0.f16445f
            boolean r0 = r0.contains(r7)
            java.lang.String r1 = "Unsupported charset: %s"
            com.google.android.gms.internal.ads.mq0.Z(r0, r1, r7)
            int r0 = r6.B()
            if (r0 != 0) goto L13
            r7 = 0
            return r7
        L13:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r1 = r7.equals(r0)
            if (r1 != 0) goto L1e
            r6.q()
        L1e:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            boolean r1 = r7.equals(r1)
            r2 = 1
            if (r1 != 0) goto L58
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L2e
            goto L58
        L2e:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r7.equals(r0)
            r2 = 2
            if (r0 != 0) goto L58
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L58
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L48
            goto L58
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r1 = "Unsupported charset: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L58:
            int r0 = r6.f16447b
        L5a:
            int r1 = r6.f16448c
            int r3 = r2 + (-1)
            int r3 = r1 - r3
            r4 = 13
            if (r0 >= r3) goto Lbd
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            boolean r1 = r7.equals(r1)
            r3 = 10
            if (r1 != 0) goto L76
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L81
        L76:
            byte[] r1 = r6.f16446a
            r1 = r1[r0]
            java.lang.String r5 = com.google.android.gms.internal.ads.bq0.f9768a
            if (r1 == r3) goto Lbe
            if (r1 != r4) goto L81
            goto Lbe
        L81:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L91
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto La2
        L91:
            byte[] r1 = r6.f16446a
            r5 = r1[r0]
            if (r5 != 0) goto La2
            int r5 = r0 + 1
            r1 = r1[r5]
            java.lang.String r5 = com.google.android.gms.internal.ads.bq0.f9768a
            if (r1 == r3) goto Lbe
            if (r1 != r4) goto La2
            goto Lbe
        La2:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto Lbb
            int r1 = r0 + 1
            byte[] r5 = r6.f16446a
            r1 = r5[r1]
            if (r1 != 0) goto Lbb
            r1 = r5[r0]
            java.lang.String r5 = com.google.android.gms.internal.ads.bq0.f9768a
            if (r1 == r3) goto Lbe
            if (r1 != r4) goto Lbb
            goto Lbe
        Lbb:
            int r0 = r0 + r2
            goto L5a
        Lbd:
            r0 = r1
        Lbe:
            int r1 = r6.f16447b
            int r0 = r0 - r1
            java.lang.String r0 = r6.k(r0, r7)
            int r1 = r6.f16447b
            int r2 = r6.f16448c
            if (r1 == r2) goto Ld8
            char[] r1 = com.google.android.gms.internal.ads.sk0.f16443d
            char r1 = r6.s(r7, r1)
            if (r1 != r4) goto Ld8
            char[] r1 = com.google.android.gms.internal.ads.sk0.f16444e
            r6.s(r7, r1)
        Ld8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sk0.n(java.nio.charset.Charset):java.lang.String");
    }

    public final long o() {
        int i4;
        v(1);
        long j = this.f16446a[this.f16447b];
        int i10 = 7;
        while (true) {
            i4 = 0;
            if (i10 < 0) {
                break;
            }
            if (((1 << i10) & j) != 0) {
                i10--;
            } else if (i10 < 6) {
                j &= r7 - 1;
                i4 = 7 - i10;
            } else if (i10 == 7) {
                i4 = 1;
            }
        }
        if (i4 == 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 35);
            sb2.append("Invalid UTF-8 sequence first byte: ");
            sb2.append(j);
            throw new NumberFormatException(sb2.toString());
        }
        v(i4);
        for (int i11 = 1; i11 < i4; i11++) {
            if ((this.f16446a[this.f16447b + i11] & 192) != 128) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 42);
                sb3.append("Invalid UTF-8 sequence continuation byte: ");
                sb3.append(j);
                throw new NumberFormatException(sb3.toString());
            }
            j = (j << 6) | (r3 & Utf8.REPLACEMENT_BYTE);
        }
        this.f16447b += i4;
        return j;
    }

    public final long p() {
        long j = 0;
        for (int i4 = 0; i4 < 9; i4++) {
            if (this.f16447b == this.f16448c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jK = K();
            j |= (127 & jK) << (i4 * 7);
            if ((jK & 128) == 0) {
                return j;
            }
        }
        return j;
    }

    public final Charset q() {
        if (B() >= 3) {
            byte[] bArr = this.f16446a;
            int i4 = this.f16447b;
            if (bArr[i4] == -17 && bArr[i4 + 1] == -69 && bArr[i4 + 2] == -65) {
                this.f16447b = i4 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (B() < 2) {
            return null;
        }
        byte[] bArr2 = this.f16446a;
        int i10 = this.f16447b;
        byte b10 = bArr2[i10];
        if (b10 == -2) {
            if (bArr2[i10 + 1] != -1) {
                return null;
            }
            this.f16447b = i10 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i10 + 1] != -2) {
            return null;
        }
        this.f16447b = i10 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final char r(int i4, ByteOrder byteOrder) {
        byte b10;
        byte b11;
        v(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f16446a;
            int i10 = this.f16447b + i4;
            b10 = bArr[i10];
            b11 = bArr[i10 + 1];
        } else {
            byte[] bArr2 = this.f16446a;
            int i11 = this.f16447b + i4;
            b10 = bArr2[i11 + 1];
            b11 = bArr2[i11];
        }
        return (char) ((b10 << 8) | (b11 & 255));
    }

    public final char s(Charset charset, char[] cArr) {
        int iT;
        if (B() >= u(charset) && (iT = t(charset)) != 0) {
            if (!Character.isSupplementaryCodePoint(i)) {
                long j = i;
                char c9 = (char) j;
                mq0.U("Out of range: %s", j, ((long) c9) == j);
                for (char c10 : cArr) {
                    if (c10 == c9) {
                        this.f16447b = al0.d(iT & 255) + this.f16447b;
                        return c9;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int t(Charset charset) {
        int codePoint;
        int i4;
        int iX;
        mq0.Z(f16445f.contains(charset), "Unsupported charset: %s", charset);
        if (B() < u(charset)) {
            int i10 = this.f16447b;
            int i11 = this.f16448c;
            throw new IndexOutOfBoundsException(je.u.q(i10, i11, "position=", ", limit=", new StringBuilder(String.valueOf(i10).length() + 17 + String.valueOf(i11).length())));
        }
        int i12 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b10 = this.f16446a[this.f16447b];
            if ((b10 & 128) == 0) {
                codePoint = b10 & 255;
                return (codePoint << 8) | i12;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b11 = this.f16446a[this.f16447b];
            if ((b11 & 128) == 0) {
                i4 = 1;
            } else if ((b11 & 224) == 192 && B() >= 2 && w(this.f16446a[this.f16447b + 1])) {
                i4 = 2;
            } else {
                if ((this.f16446a[this.f16447b] & 240) == 224 && B() >= 3) {
                    byte[] bArr = this.f16446a;
                    int i13 = this.f16447b;
                    if (w(bArr[i13 + 1]) && w(bArr[i13 + 2])) {
                        i4 = 3;
                    }
                }
                if ((this.f16446a[this.f16447b] & 248) == 240 && B() >= 4) {
                    byte[] bArr2 = this.f16446a;
                    int i14 = this.f16447b;
                    if (w(bArr2[i14 + 1]) && w(bArr2[i14 + 2]) && w(bArr2[i14 + 3])) {
                        i4 = 4;
                    }
                }
                i4 = 0;
            }
            if (i4 == 1) {
                iX = this.f16446a[this.f16447b] & 255;
            } else if (i4 == 2) {
                byte[] bArr3 = this.f16446a;
                int i15 = this.f16447b;
                iX = x(0, 0, bArr3[i15], bArr3[i15 + 1]);
            } else {
                if (i4 != 3) {
                    if (i4 == 4) {
                        byte[] bArr4 = this.f16446a;
                        int i16 = this.f16447b;
                        iX = x(bArr4[i16], bArr4[i16 + 1], bArr4[i16 + 2], bArr4[i16 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.f16446a;
                int i17 = this.f16447b;
                iX = x(0, bArr5[i17] & 15, bArr5[i17 + 1], bArr5[i17 + 2]);
            }
            i12 = i4;
            codePoint = iX;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cR = r(0, byteOrder);
            if (!Character.isHighSurrogate(cR) || B() < 4) {
                codePoint = cR;
                i12 = 2;
            } else {
                codePoint = Character.toCodePoint(cR, r(2, byteOrder));
                i12 = 4;
            }
        }
        return (codePoint << 8) | i12;
    }

    public final void v(int i4) {
        if (!g.get() || B() >= i4) {
            return;
        }
        int iB = B();
        throw new IndexOutOfBoundsException(je.u.q(i4, iB, "bytesNeeded= ", ", bytesLeft=", new StringBuilder(String.valueOf(i4).length() + 25 + String.valueOf(iB).length())));
    }

    public final void y(int i4) {
        byte[] bArr = this.f16446a;
        if (bArr.length < i4) {
            bArr = new byte[i4];
        }
        z(i4, bArr);
    }

    public final void z(int i4, byte[] bArr) {
        this.f16446a = bArr;
        this.f16448c = i4;
        this.f16447b = 0;
    }

    public sk0() {
        this.f16446a = bq0.f9769b;
    }

    public sk0(int i4) {
        this.f16446a = new byte[i4];
        this.f16448c = i4;
    }

    public sk0(byte[] bArr) {
        this.f16446a = bArr;
        this.f16448c = bArr.length;
    }
}
