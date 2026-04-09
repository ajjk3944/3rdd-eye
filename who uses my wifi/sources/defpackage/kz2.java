package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kz2 {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final dn3 f = dn3.m(new Object[]{StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE}, 5);
    public static final AtomicBoolean g = new AtomicBoolean();
    public byte[] a;
    public int b;
    public int c;

    public kz2(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
    }

    public static int u(Charset charset) {
        zt0.X(f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean w(byte b) {
        return (b & 192) == 128;
    }

    public static int x(int i, int i2, int i3, int i4) {
        return zt0.T((byte) 0, i41.F(((i & 7) << 2) | ((i2 & 48) >> 4)), i41.F(((i3 & 60) >> 2) | ((i2 & 15) << 4)), i41.F((i4 & 63) | ((i3 & 3) << 6)));
    }

    public final void A(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public final int B() {
        return Math.max(this.c - this.b, 0);
    }

    public final void C(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.a.length) {
            z = true;
        }
        zt0.D(z);
        this.c = i;
    }

    public final int D() {
        return this.b;
    }

    public final void E(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.c) {
            z = true;
        }
        zt0.D(z);
        this.b = i;
    }

    public final byte[] F() {
        return this.a;
    }

    public final void G(int i) {
        E(this.b + i);
    }

    public final void H(byte[] bArr, int i, int i2) {
        v(i2);
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final int I() {
        v(1);
        return this.a[this.b] & 255;
    }

    public final int J() {
        if (B() >= 4) {
            this.b -= 4;
            return b();
        }
        int i = this.b;
        int i2 = this.c;
        throw new IndexOutOfBoundsException(ga1.l(new StringBuilder(String.valueOf(i).length() + 17 + String.valueOf(i2).length()), "position=", i, ", limit=", i2));
    }

    public final int K() {
        v(1);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int L() {
        v(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (bArr[i2] & 255) | (i3 << 8);
    }

    public final int M() {
        v(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final short N() {
        v(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | (i3 << 8));
    }

    public final int O() {
        v(3);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & 255;
        this.b = i + 3;
        return (bArr[i4] & 255) | (i3 << 16) | (i5 << 8);
    }

    public final long P() {
        v(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        this.b = i + 3;
        long j3 = bArr[i3];
        this.b = i + 4;
        return (bArr[r3] & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public final long a() {
        v(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        this.b = i + 3;
        long j3 = bArr[i3];
        this.b = i + 4;
        return ((bArr[r3] & 255) << 24) | (255 & j) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public final int b() {
        v(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.b = i6;
        int i7 = bArr[i4] & 255;
        this.b = i + 4;
        return (bArr[i6] & 255) | (i3 << 24) | (i5 << 16) | (i7 << 8);
    }

    public final int c() {
        v(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.b = i6;
        int i7 = bArr[i4] & 255;
        this.b = i + 4;
        return ((bArr[i6] & 255) << 24) | (i5 << 8) | i3 | (i7 << 16);
    }

    public final long d() {
        v(8);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.b = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.b = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.b = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.b = i7;
        long j6 = bArr[i6];
        this.b = i + 7;
        long j7 = bArr[i7];
        this.b = i + 8;
        return ((j7 & 255) << 8) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | (bArr[r4] & 255);
    }

    public final long e() {
        v(8);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.b = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.b = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.b = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.b = i7;
        long j6 = bArr[i6];
        this.b = i + 7;
        long j7 = bArr[i7];
        this.b = i + 8;
        return ((j7 & 255) << 48) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40) | ((bArr[r4] & 255) << 56);
    }

    public final int f() {
        v(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        int i4 = bArr[i2] & 255;
        this.b = i + 4;
        return (i3 << 8) | i4;
    }

    public final int g() {
        return (K() << 21) | (K() << 14) | (K() << 7) | K();
    }

    public final int h() {
        int iB = b();
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalStateException(ex0.j(new StringBuilder(String.valueOf(iB).length() + 18), "Top bit not zero: ", iB));
    }

    public final int i() {
        int iC = c();
        if (iC >= 0) {
            return iC;
        }
        throw new IllegalStateException(ex0.j(new StringBuilder(String.valueOf(iC).length() + 18), "Top bit not zero: ", iC));
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
        byte[] bArr = this.a;
        int i2 = this.b;
        String str = new String(bArr, i2, i, charset);
        this.b = i2 + i;
        return str;
    }

    public final String l(int i) {
        v(i);
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.c || this.a[i3] != 0) ? i : i - 1;
        byte[] bArr = this.a;
        String str = v23.a;
        String str2 = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.b += i;
        return str2;
    }

    public final String m() {
        if (B() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String str = v23.a;
        String str2 = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
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
            dn3 r0 = defpackage.kz2.f
            boolean r0 = r0.contains(r7)
            java.lang.String r1 = "Unsupported charset: %s"
            defpackage.zt0.X(r0, r1, r7)
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
            int r0 = r6.b
        L5a:
            int r1 = r6.c
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
            byte[] r1 = r6.a
            r1 = r1[r0]
            java.lang.String r5 = defpackage.v23.a
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
            byte[] r1 = r6.a
            r5 = r1[r0]
            if (r5 != 0) goto La2
            int r5 = r0 + 1
            r1 = r1[r5]
            java.lang.String r5 = defpackage.v23.a
            if (r1 == r3) goto Lbe
            if (r1 != r4) goto La2
            goto Lbe
        La2:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto Lbb
            int r1 = r0 + 1
            byte[] r5 = r6.a
            r1 = r5[r1]
            if (r1 != 0) goto Lbb
            r1 = r5[r0]
            java.lang.String r5 = defpackage.v23.a
            if (r1 == r3) goto Lbe
            if (r1 != r4) goto Lbb
            goto Lbe
        Lbb:
            int r0 = r0 + r2
            goto L5a
        Lbd:
            r0 = r1
        Lbe:
            int r1 = r6.b
            int r0 = r0 - r1
            java.lang.String r0 = r6.k(r0, r7)
            int r1 = r6.b
            int r2 = r6.c
            if (r1 == r2) goto Ld8
            char[] r1 = defpackage.kz2.d
            char r1 = r6.s(r7, r1)
            if (r1 != r4) goto Ld8
            char[] r1 = defpackage.kz2.e
            r6.s(r7, r1)
        Ld8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kz2.n(java.nio.charset.Charset):java.lang.String");
    }

    public final long o() {
        int i;
        v(1);
        long j = this.a[this.b];
        int i2 = 7;
        while (true) {
            i = 0;
            if (i2 < 0) {
                break;
            }
            if (((1 << i2) & j) != 0) {
                i2--;
            } else if (i2 < 6) {
                j &= r7 - 1;
                i = 7 - i2;
            } else if (i2 == 7) {
                i = 1;
            }
        }
        if (i == 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 35);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j);
            throw new NumberFormatException(sb.toString());
        }
        v(i);
        for (int i3 = 1; i3 < i; i3++) {
            if ((this.a[this.b + i3] & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 42);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j);
                throw new NumberFormatException(sb2.toString());
            }
            j = (j << 6) | (r3 & 63);
        }
        this.b += i;
        return j;
    }

    public final long p() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.b == this.c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jK = K();
            j |= (127 & jK) << (i * 7);
            if ((jK & 128) == 0) {
                return j;
            }
        }
        return j;
    }

    public final Charset q() {
        if (B() >= 3) {
            byte[] bArr = this.a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (B() < 2) {
            return null;
        }
        byte[] bArr2 = this.a;
        int i2 = this.b;
        byte b = bArr2[i2];
        if (b == -2) {
            if (bArr2[i2 + 1] != -1) {
                return null;
            }
            this.b = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.b = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final char r(int i, ByteOrder byteOrder) {
        byte b;
        byte b2;
        v(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.a;
            int i2 = this.b + i;
            b = bArr[i2];
            b2 = bArr[i2 + 1];
        } else {
            byte[] bArr2 = this.a;
            int i3 = this.b + i;
            b = bArr2[i3 + 1];
            b2 = bArr2[i3];
        }
        return (char) ((b << 8) | (b2 & 255));
    }

    public final char s(Charset charset, char[] cArr) {
        int iT;
        if (B() >= u(charset) && (iT = t(charset)) != 0) {
            if (!Character.isSupplementaryCodePoint(i)) {
                long j = i;
                char c = (char) j;
                zt0.V(((long) c) == j, "Out of range: %s", j);
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.b = zt0.y(iT & 255) + this.b;
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int t(Charset charset) {
        int codePoint;
        int i;
        int unsignedInt;
        zt0.X(f.contains(charset), "Unsupported charset: %s", charset);
        if (B() < u(charset)) {
            int i2 = this.b;
            int i3 = this.c;
            throw new IndexOutOfBoundsException(ga1.l(new StringBuilder(String.valueOf(i2).length() + 17 + String.valueOf(i3).length()), "position=", i2, ", limit=", i3));
        }
        int i4 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.a[this.b];
            if ((b & 128) == 0) {
                codePoint = Byte.toUnsignedInt(b);
                return (codePoint << 8) | i4;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b2 = this.a[this.b];
            if ((b2 & 128) == 0) {
                i = 1;
            } else if ((b2 & 224) == 192 && B() >= 2 && w(this.a[this.b + 1])) {
                i = 2;
            } else {
                if ((this.a[this.b] & 240) == 224 && B() >= 3) {
                    byte[] bArr = this.a;
                    int i5 = this.b;
                    if (w(bArr[i5 + 1]) && w(bArr[i5 + 2])) {
                        i = 3;
                    }
                }
                if ((this.a[this.b] & 248) == 240 && B() >= 4) {
                    byte[] bArr2 = this.a;
                    int i6 = this.b;
                    if (w(bArr2[i6 + 1]) && w(bArr2[i6 + 2]) && w(bArr2[i6 + 3])) {
                        i = 4;
                    }
                }
                i = 0;
            }
            if (i == 1) {
                unsignedInt = Byte.toUnsignedInt(this.a[this.b]);
            } else if (i == 2) {
                byte[] bArr3 = this.a;
                int i7 = this.b;
                unsignedInt = x(0, 0, bArr3[i7], bArr3[i7 + 1]);
            } else {
                if (i != 3) {
                    if (i == 4) {
                        byte[] bArr4 = this.a;
                        int i8 = this.b;
                        unsignedInt = x(bArr4[i8], bArr4[i8 + 1], bArr4[i8 + 2], bArr4[i8 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.a;
                int i9 = this.b;
                unsignedInt = x(0, bArr5[i9] & 15, bArr5[i9 + 1], bArr5[i9 + 2]);
            }
            i4 = i;
            codePoint = unsignedInt;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cR = r(0, byteOrder);
            if (!Character.isHighSurrogate(cR) || B() < 4) {
                codePoint = cR;
                i4 = 2;
            } else {
                codePoint = Character.toCodePoint(cR, r(2, byteOrder));
                i4 = 4;
            }
        }
        return (codePoint << 8) | i4;
    }

    public final void v(int i) {
        if (!g.get() || B() >= i) {
            return;
        }
        int iB = B();
        throw new IndexOutOfBoundsException(ga1.l(new StringBuilder(String.valueOf(i).length() + 25 + String.valueOf(iB).length()), "bytesNeeded= ", i, ", bytesLeft=", iB));
    }

    public final void y(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        z(i, bArr);
    }

    public final void z(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public kz2() {
        this.a = v23.b;
    }

    public kz2(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public kz2(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }
}
