package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.vr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2036vr {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f17350d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f17351e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final RB f17352f = RB.n(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f17353g = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public byte[] f17354a;

    /* renamed from: b, reason: collision with root package name */
    public int f17355b;

    /* renamed from: c, reason: collision with root package name */
    public int f17356c;

    public C2036vr(byte[] bArr, int i) {
        this.f17354a = bArr;
        this.f17356c = i;
    }

    public static int u(Charset charset) {
        AbstractC0582Jp.b0(f17352f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean w(byte b5) {
        return (b5 & 192) == 128;
    }

    public static int x(int i, int i3, int i6, int i7) {
        return Cr.G((byte) 0, C1476lN.a(((i & 7) << 2) | ((i3 & 48) >> 4)), C1476lN.a(((i6 & 60) >> 2) | ((i3 & 15) << 4)), C1476lN.a((i7 & 63) | ((i6 & 3) << 6)));
    }

    public final void A(int i) {
        byte[] bArr = this.f17354a;
        if (i > bArr.length) {
            this.f17354a = Arrays.copyOf(bArr, i);
        }
    }

    public final int B() {
        return Math.max(this.f17356c - this.f17355b, 0);
    }

    public final void C(int i) {
        boolean z6 = false;
        if (i >= 0 && i <= this.f17354a.length) {
            z6 = true;
        }
        AbstractC0582Jp.m(z6);
        this.f17356c = i;
    }

    public final int D() {
        return this.f17355b;
    }

    public final void E(int i) {
        boolean z6 = false;
        if (i >= 0 && i <= this.f17356c) {
            z6 = true;
        }
        AbstractC0582Jp.m(z6);
        this.f17355b = i;
    }

    public final byte[] F() {
        return this.f17354a;
    }

    public final void G(int i) {
        E(this.f17355b + i);
    }

    public final void H(int i, int i3, byte[] bArr) {
        v(i3);
        System.arraycopy(this.f17354a, this.f17355b, bArr, i, i3);
        this.f17355b += i3;
    }

    public final int I() {
        v(1);
        return this.f17354a[this.f17355b] & 255;
    }

    public final int J() {
        if (B() >= 4) {
            this.f17355b -= 4;
            return b();
        }
        int i = this.f17355b;
        int i3 = this.f17356c;
        throw new IndexOutOfBoundsException(A.f.o(new StringBuilder(String.valueOf(i).length() + 17 + String.valueOf(i3).length()), "position=", i, ", limit=", i3));
    }

    public final int K() {
        v(1);
        byte[] bArr = this.f17354a;
        int i = this.f17355b;
        this.f17355b = i + 1;
        return bArr[i] & 255;
    }

    public final int L() {
        v(2);
        byte[] bArr = this.f17354a;
        int i = this.f17355b;
        int i3 = i + 1;
        this.f17355b = i3;
        int i6 = bArr[i] & 255;
        this.f17355b = i + 2;
        return (bArr[i3] & 255) | (i6 << 8);
    }

    public final int M() {
        v(2);
        byte[] bArr = this.f17354a;
        int i = this.f17355b;
        int i3 = i + 1;
        this.f17355b = i3;
        int i6 = bArr[i] & 255;
        this.f17355b = i + 2;
        return ((bArr[i3] & 255) << 8) | i6;
    }

    public final short N() {
        v(2);
        byte[] bArr = this.f17354a;
        int i = this.f17355b;
        int i3 = i + 1;
        this.f17355b = i3;
        int i6 = bArr[i] & 255;
        this.f17355b = i + 2;
        return (short) ((bArr[i3] & 255) | (i6 << 8));
    }

    public final int O() {
        v(3);
        byte[] bArr = this.f17354a;
        int i = this.f17355b;
        int i3 = i + 1;
        this.f17355b = i3;
        int i6 = bArr[i] & 255;
        int i7 = i + 2;
        this.f17355b = i7;
        int i8 = bArr[i3] & 255;
        this.f17355b = i + 3;
        return (bArr[i7] & 255) | (i6 << 16) | (i8 << 8);
    }

    public final long P() {
        v(4);
        byte[] bArr = this.f17354a;
        int i = this.f17355b;
        int i3 = i + 1;
        this.f17355b = i3;
        long j6 = bArr[i];
        int i6 = i + 2;
        this.f17355b = i6;
        long j7 = bArr[i3];
        this.f17355b = i + 3;
        long j8 = bArr[i6];
        this.f17355b = i + 4;
        return (bArr[r3] & 255) | ((j6 & 255) << 24) | ((j7 & 255) << 16) | ((j8 & 255) << 8);
    }

    public final long a() {
        v(4);
        byte[] bArr = this.f17354a;
        int i = this.f17355b;
        int i3 = i + 1;
        this.f17355b = i3;
        long j6 = bArr[i];
        int i6 = i + 2;
        this.f17355b = i6;
        long j7 = bArr[i3];
        this.f17355b = i + 3;
        long j8 = bArr[i6];
        this.f17355b = i + 4;
        return ((bArr[r3] & 255) << 24) | (255 & j6) | ((j7 & 255) << 8) | ((j8 & 255) << 16);
    }

    public final int b() {
        v(4);
        byte[] bArr = this.f17354a;
        int i = this.f17355b;
        int i3 = i + 1;
        this.f17355b = i3;
        int i6 = bArr[i] & 255;
        int i7 = i + 2;
        this.f17355b = i7;
        int i8 = bArr[i3] & 255;
        int i9 = i + 3;
        this.f17355b = i9;
        int i10 = bArr[i7] & 255;
        this.f17355b = i + 4;
        return (bArr[i9] & 255) | (i6 << 24) | (i8 << 16) | (i10 << 8);
    }

    public final int c() {
        v(4);
        byte[] bArr = this.f17354a;
        int i = this.f17355b;
        int i3 = i + 1;
        this.f17355b = i3;
        int i6 = bArr[i] & 255;
        int i7 = i + 2;
        this.f17355b = i7;
        int i8 = bArr[i3] & 255;
        int i9 = i + 3;
        this.f17355b = i9;
        int i10 = bArr[i7] & 255;
        this.f17355b = i + 4;
        return ((bArr[i9] & 255) << 24) | (i8 << 8) | i6 | (i10 << 16);
    }

    public final long d() {
        v(8);
        byte[] bArr = this.f17354a;
        int i = this.f17355b;
        int i3 = i + 1;
        this.f17355b = i3;
        long j6 = bArr[i];
        int i6 = i + 2;
        this.f17355b = i6;
        long j7 = bArr[i3];
        int i7 = i + 3;
        this.f17355b = i7;
        long j8 = bArr[i6];
        int i8 = i + 4;
        this.f17355b = i8;
        long j9 = bArr[i7];
        int i9 = i + 5;
        this.f17355b = i9;
        long j10 = bArr[i8];
        int i10 = i + 6;
        this.f17355b = i10;
        long j11 = bArr[i9];
        this.f17355b = i + 7;
        long j12 = bArr[i10];
        this.f17355b = i + 8;
        return ((j12 & 255) << 8) | ((j6 & 255) << 56) | ((j7 & 255) << 48) | ((j8 & 255) << 40) | ((j9 & 255) << 32) | ((j10 & 255) << 24) | ((j11 & 255) << 16) | (bArr[r4] & 255);
    }

    public final long e() {
        v(8);
        byte[] bArr = this.f17354a;
        int i = this.f17355b;
        int i3 = i + 1;
        this.f17355b = i3;
        long j6 = bArr[i];
        int i6 = i + 2;
        this.f17355b = i6;
        long j7 = bArr[i3];
        int i7 = i + 3;
        this.f17355b = i7;
        long j8 = bArr[i6];
        int i8 = i + 4;
        this.f17355b = i8;
        long j9 = bArr[i7];
        int i9 = i + 5;
        this.f17355b = i9;
        long j10 = bArr[i8];
        int i10 = i + 6;
        this.f17355b = i10;
        long j11 = bArr[i9];
        this.f17355b = i + 7;
        long j12 = bArr[i10];
        this.f17355b = i + 8;
        return ((j12 & 255) << 48) | (j6 & 255) | ((j7 & 255) << 8) | ((j8 & 255) << 16) | ((j9 & 255) << 24) | ((j10 & 255) << 32) | ((j11 & 255) << 40) | ((bArr[r4] & 255) << 56);
    }

    public final int f() {
        v(4);
        byte[] bArr = this.f17354a;
        int i = this.f17355b;
        int i3 = i + 1;
        this.f17355b = i3;
        int i6 = bArr[i] & 255;
        this.f17355b = i + 2;
        int i7 = bArr[i3] & 255;
        this.f17355b = i + 4;
        return (i6 << 8) | i7;
    }

    public final int g() {
        return (K() << 21) | (K() << 14) | (K() << 7) | K();
    }

    public final int h() {
        int iB = b();
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalStateException(A.f.i(iB, "Top bit not zero: ", new StringBuilder(String.valueOf(iB).length() + 18)));
    }

    public final int i() {
        int iC = c();
        if (iC >= 0) {
            return iC;
        }
        throw new IllegalStateException(A.f.i(iC, "Top bit not zero: ", new StringBuilder(String.valueOf(iC).length() + 18)));
    }

    public final long j() {
        long jD = d();
        if (jD >= 0) {
            return jD;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(jD).length() + 18);
        sb.append("Top bit not zero: ");
        sb.append(jD);
        throw new IllegalStateException(sb.toString());
    }

    public final String k(int i, Charset charset) {
        v(i);
        byte[] bArr = this.f17354a;
        int i3 = this.f17355b;
        String str = new String(bArr, i3, i, charset);
        this.f17355b = i3 + i;
        return str;
    }

    public final String l(int i) {
        v(i);
        if (i == 0) {
            return "";
        }
        int i3 = this.f17355b;
        int i6 = (i3 + i) - 1;
        int i7 = (i6 >= this.f17356c || this.f17354a[i6] != 0) ? i : i - 1;
        byte[] bArr = this.f17354a;
        String str = Vt.f12096a;
        String str2 = new String(bArr, i3, i7, StandardCharsets.UTF_8);
        this.f17355b += i;
        return str2;
    }

    public final String m() {
        if (B() == 0) {
            return null;
        }
        int i = this.f17355b;
        while (i < this.f17356c && this.f17354a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f17354a;
        int i3 = this.f17355b;
        String str = Vt.f12096a;
        String str2 = new String(bArr, i3, i - i3, StandardCharsets.UTF_8);
        this.f17355b = i;
        if (i < this.f17356c) {
            this.f17355b = i + 1;
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
            com.google.android.gms.internal.ads.RB r0 = com.google.android.gms.internal.ads.C2036vr.f17352f
            boolean r0 = r0.contains(r7)
            java.lang.String r1 = "Unsupported charset: %s"
            com.google.android.gms.internal.ads.AbstractC0582Jp.b0(r0, r1, r7)
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
            int r0 = r6.f17355b
        L5a:
            int r1 = r6.f17356c
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
            byte[] r1 = r6.f17354a
            r1 = r1[r0]
            java.lang.String r5 = com.google.android.gms.internal.ads.Vt.f12096a
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
            byte[] r1 = r6.f17354a
            r5 = r1[r0]
            if (r5 != 0) goto La2
            int r5 = r0 + 1
            r1 = r1[r5]
            java.lang.String r5 = com.google.android.gms.internal.ads.Vt.f12096a
            if (r1 == r3) goto Lbe
            if (r1 != r4) goto La2
            goto Lbe
        La2:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto Lbb
            int r1 = r0 + 1
            byte[] r5 = r6.f17354a
            r1 = r5[r1]
            if (r1 != 0) goto Lbb
            r1 = r5[r0]
            java.lang.String r5 = com.google.android.gms.internal.ads.Vt.f12096a
            if (r1 == r3) goto Lbe
            if (r1 != r4) goto Lbb
            goto Lbe
        Lbb:
            int r0 = r0 + r2
            goto L5a
        Lbd:
            r0 = r1
        Lbe:
            int r1 = r6.f17355b
            int r0 = r0 - r1
            java.lang.String r0 = r6.k(r0, r7)
            int r1 = r6.f17355b
            int r2 = r6.f17356c
            if (r1 == r2) goto Ld8
            char[] r1 = com.google.android.gms.internal.ads.C2036vr.f17350d
            char r1 = r6.s(r7, r1)
            if (r1 != r4) goto Ld8
            char[] r1 = com.google.android.gms.internal.ads.C2036vr.f17351e
            r6.s(r7, r1)
        Ld8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2036vr.n(java.nio.charset.Charset):java.lang.String");
    }

    public final long o() {
        int i;
        v(1);
        long j6 = this.f17354a[this.f17355b];
        int i3 = 7;
        while (true) {
            i = 0;
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j6) != 0) {
                i3--;
            } else if (i3 < 6) {
                j6 &= r7 - 1;
                i = 7 - i3;
            } else if (i3 == 7) {
                i = 1;
            }
        }
        if (i == 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + 35);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j6);
            throw new NumberFormatException(sb.toString());
        }
        v(i);
        for (int i6 = 1; i6 < i; i6++) {
            if ((this.f17354a[this.f17355b + i6] & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(j6).length() + 42);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j6);
                throw new NumberFormatException(sb2.toString());
            }
            j6 = (j6 << 6) | (r3 & 63);
        }
        this.f17355b += i;
        return j6;
    }

    public final long p() {
        long j6 = 0;
        for (int i = 0; i < 9; i++) {
            if (this.f17355b == this.f17356c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jK = K();
            j6 |= (127 & jK) << (i * 7);
            if ((jK & 128) == 0) {
                return j6;
            }
        }
        return j6;
    }

    public final Charset q() {
        if (B() >= 3) {
            byte[] bArr = this.f17354a;
            int i = this.f17355b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f17355b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (B() < 2) {
            return null;
        }
        byte[] bArr2 = this.f17354a;
        int i3 = this.f17355b;
        byte b5 = bArr2[i3];
        if (b5 == -2) {
            if (bArr2[i3 + 1] != -1) {
                return null;
            }
            this.f17355b = i3 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b5 != -1 || bArr2[i3 + 1] != -2) {
            return null;
        }
        this.f17355b = i3 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final char r(int i, ByteOrder byteOrder) {
        byte b5;
        byte b6;
        v(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f17354a;
            int i3 = this.f17355b + i;
            b5 = bArr[i3];
            b6 = bArr[i3 + 1];
        } else {
            byte[] bArr2 = this.f17354a;
            int i6 = this.f17355b + i;
            b5 = bArr2[i6 + 1];
            b6 = bArr2[i6];
        }
        return (char) ((b5 << 8) | (b6 & 255));
    }

    public final char s(Charset charset, char[] cArr) {
        int iT;
        if (B() >= u(charset) && (iT = t(charset)) != 0) {
            if (!Character.isSupplementaryCodePoint(i)) {
                long j6 = i;
                char c6 = (char) j6;
                AbstractC0582Jp.W("Out of range: %s", j6, ((long) c6) == j6);
                for (char c7 : cArr) {
                    if (c7 == c6) {
                        this.f17355b = Cr.b(iT & 255) + this.f17355b;
                        return c6;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int t(Charset charset) {
        int codePoint;
        int i;
        int iX;
        AbstractC0582Jp.b0(f17352f.contains(charset), "Unsupported charset: %s", charset);
        if (B() < u(charset)) {
            int i3 = this.f17355b;
            int i6 = this.f17356c;
            throw new IndexOutOfBoundsException(A.f.o(new StringBuilder(String.valueOf(i3).length() + 17 + String.valueOf(i6).length()), "position=", i3, ", limit=", i6));
        }
        int i7 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b5 = this.f17354a[this.f17355b];
            if ((b5 & 128) == 0) {
                codePoint = b5 & 255;
                return (codePoint << 8) | i7;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b6 = this.f17354a[this.f17355b];
            if ((b6 & 128) == 0) {
                i = 1;
            } else if ((b6 & 224) == 192 && B() >= 2 && w(this.f17354a[this.f17355b + 1])) {
                i = 2;
            } else {
                if ((this.f17354a[this.f17355b] & 240) == 224 && B() >= 3) {
                    byte[] bArr = this.f17354a;
                    int i8 = this.f17355b;
                    if (w(bArr[i8 + 1]) && w(bArr[i8 + 2])) {
                        i = 3;
                    }
                }
                if ((this.f17354a[this.f17355b] & 248) == 240 && B() >= 4) {
                    byte[] bArr2 = this.f17354a;
                    int i9 = this.f17355b;
                    if (w(bArr2[i9 + 1]) && w(bArr2[i9 + 2]) && w(bArr2[i9 + 3])) {
                        i = 4;
                    }
                }
                i = 0;
            }
            if (i == 1) {
                iX = this.f17354a[this.f17355b] & 255;
            } else if (i == 2) {
                byte[] bArr3 = this.f17354a;
                int i10 = this.f17355b;
                iX = x(0, 0, bArr3[i10], bArr3[i10 + 1]);
            } else {
                if (i != 3) {
                    if (i == 4) {
                        byte[] bArr4 = this.f17354a;
                        int i11 = this.f17355b;
                        iX = x(bArr4[i11], bArr4[i11 + 1], bArr4[i11 + 2], bArr4[i11 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.f17354a;
                int i12 = this.f17355b;
                iX = x(0, bArr5[i12] & 15, bArr5[i12 + 1], bArr5[i12 + 2]);
            }
            i7 = i;
            codePoint = iX;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cR = r(0, byteOrder);
            if (!Character.isHighSurrogate(cR) || B() < 4) {
                codePoint = cR;
                i7 = 2;
            } else {
                codePoint = Character.toCodePoint(cR, r(2, byteOrder));
                i7 = 4;
            }
        }
        return (codePoint << 8) | i7;
    }

    public final void v(int i) {
        if (!f17353g.get() || B() >= i) {
            return;
        }
        int iB = B();
        throw new IndexOutOfBoundsException(A.f.o(new StringBuilder(String.valueOf(i).length() + 25 + String.valueOf(iB).length()), "bytesNeeded= ", i, ", bytesLeft=", iB));
    }

    public final void y(int i) {
        byte[] bArr = this.f17354a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        z(i, bArr);
    }

    public final void z(int i, byte[] bArr) {
        this.f17354a = bArr;
        this.f17356c = i;
        this.f17355b = 0;
    }

    public C2036vr() {
        this.f17354a = Vt.f12097b;
    }

    public C2036vr(int i) {
        this.f17354a = new byte[i];
        this.f17356c = i;
    }

    public C2036vr(byte[] bArr) {
        this.f17354a = bArr;
        this.f17356c = bArr.length;
    }
}
