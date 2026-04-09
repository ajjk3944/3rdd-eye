package a5;

import com.google.android.gms.internal.measurement.y3;
import java.nio.charset.Charset;
import java.util.Arrays;
import oe.k0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f162d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f163e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final k0 f164f = k0.l(5, ne.g.f17522a, ne.g.f17524c, ne.g.f17527f, ne.g.f17525d, ne.g.f17526e);

    /* renamed from: a, reason: collision with root package name */
    public byte[] f165a;

    /* renamed from: b, reason: collision with root package name */
    public int f166b;

    /* renamed from: c, reason: collision with root package name */
    public int f167c;

    public v() {
        this.f165a = d0.f109e;
    }

    public final Charset A() {
        if (a() >= 3) {
            byte[] bArr = this.f165a;
            int i10 = this.f166b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f166b = i10 + 3;
                return ne.g.f17524c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f165a;
        int i11 = this.f166b;
        byte b2 = bArr2[i11];
        if (b2 == -2 && bArr2[i11 + 1] == -1) {
            this.f166b = i11 + 2;
            return ne.g.f17525d;
        }
        if (b2 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f166b = i11 + 2;
        return ne.g.f17526e;
    }

    public final void B(int i10) {
        byte[] bArr = this.f165a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        C(i10, bArr);
    }

    public final void C(int i10, byte[] bArr) {
        this.f165a = bArr;
        this.f167c = i10;
        this.f166b = 0;
    }

    public final void D(int i10) {
        a.e(i10 >= 0 && i10 <= this.f165a.length);
        this.f167c = i10;
    }

    public final void E(int i10) {
        a.e(i10 >= 0 && i10 <= this.f167c);
        this.f166b = i10;
    }

    public final void F(int i10) {
        E(this.f166b + i10);
    }

    public final int a() {
        return this.f167c - this.f166b;
    }

    public final void b(int i10) {
        byte[] bArr = this.f165a;
        if (i10 > bArr.length) {
            this.f165a = Arrays.copyOf(bArr, i10);
        }
    }

    public final char c(Charset charset) {
        a.d("Unsupported charset: " + charset, f164f.contains(charset));
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        byte b2;
        int i10;
        byte b10;
        byte b11;
        if ((charset.equals(ne.g.f17524c) || charset.equals(ne.g.f17522a)) && a() >= 1) {
            long j = this.f165a[this.f166b] & 255;
            char c4 = (char) j;
            if (!(((long) c4) == j)) {
                throw new IllegalArgumentException(y3.D("Out of range: %s", Long.valueOf(j)));
            }
            b2 = (byte) c4;
            i10 = 1;
        } else {
            i10 = 2;
            if ((charset.equals(ne.g.f17527f) || charset.equals(ne.g.f17525d)) && a() >= 2) {
                byte[] bArr = this.f165a;
                int i11 = this.f166b;
                b10 = bArr[i11];
                b11 = bArr[i11 + 1];
            } else {
                if (!charset.equals(ne.g.f17526e) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f165a;
                int i12 = this.f166b;
                b10 = bArr2[i12 + 1];
                b11 = bArr2[i12];
            }
            b2 = (byte) ((char) ((b11 & 255) | (b10 << 8)));
        }
        long j7 = b2;
        char c10 = (char) j7;
        if (((long) c10) == j7) {
            return (c10 << 16) + i10;
        }
        throw new IllegalArgumentException(y3.D("Out of range: %s", Long.valueOf(j7)));
    }

    public final void e(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f165a, this.f166b, bArr, i10, i11);
        this.f166b += i11;
    }

    public final char f(Charset charset, char[] cArr) {
        int iD = d(charset);
        if (iD != 0) {
            char c4 = (char) (iD >> 16);
            for (char c10 : cArr) {
                if (c10 == c4) {
                    this.f166b += iD & 65535;
                    return c4;
                }
            }
        }
        return (char) 0;
    }

    public final int g() {
        byte[] bArr = this.f165a;
        int i10 = this.f166b;
        int i11 = i10 + 1;
        this.f166b = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i10 + 2;
        this.f166b = i13;
        int i14 = ((bArr[i11] & 255) << 16) | i12;
        int i15 = i10 + 3;
        this.f166b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.f166b = i10 + 4;
        return (bArr[i15] & 255) | i16;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String h(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            oe.k0 r0 = a5.v.f164f
            boolean r0 = r0.contains(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported charset: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            a5.a.d(r1, r0)
            int r0 = r4.a()
            if (r0 != 0) goto L1f
            r5 = 0
            return r5
        L1f:
            java.nio.charset.Charset r0 = ne.g.f17522a
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto L2a
            r4.A()
        L2a:
            java.nio.charset.Charset r1 = ne.g.f17524c
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L66
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L39
            goto L66
        L39:
            java.nio.charset.Charset r0 = ne.g.f17527f
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L64
            java.nio.charset.Charset r0 = ne.g.f17526e
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L64
            java.nio.charset.Charset r0 = ne.g.f17525d
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L52
            goto L64
        L52:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L64:
            r0 = 2
            goto L67
        L66:
            r0 = 1
        L67:
            int r1 = r4.f166b
        L69:
            int r2 = r4.f167c
            int r3 = r0 + (-1)
            int r3 = r2 - r3
            if (r1 >= r3) goto Lc8
            java.nio.charset.Charset r2 = ne.g.f17524c
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L81
            java.nio.charset.Charset r2 = ne.g.f17522a
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L8c
        L81:
            byte[] r2 = r4.f165a
            r2 = r2[r1]
            boolean r2 = a5.d0.D(r2)
            if (r2 == 0) goto L8c
            goto Lc9
        L8c:
            java.nio.charset.Charset r2 = ne.g.f17527f
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L9c
            java.nio.charset.Charset r2 = ne.g.f17525d
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lad
        L9c:
            byte[] r2 = r4.f165a
            r3 = r2[r1]
            if (r3 != 0) goto Lad
            int r3 = r1 + 1
            r2 = r2[r3]
            boolean r2 = a5.d0.D(r2)
            if (r2 == 0) goto Lad
            goto Lc9
        Lad:
            java.nio.charset.Charset r2 = ne.g.f17526e
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lc6
            byte[] r2 = r4.f165a
            int r3 = r1 + 1
            r3 = r2[r3]
            if (r3 != 0) goto Lc6
            r2 = r2[r1]
            boolean r2 = a5.d0.D(r2)
            if (r2 == 0) goto Lc6
            goto Lc9
        Lc6:
            int r1 = r1 + r0
            goto L69
        Lc8:
            r1 = r2
        Lc9:
            int r0 = r4.f166b
            int r1 = r1 - r0
            java.lang.String r0 = r4.r(r1, r5)
            int r1 = r4.f166b
            int r2 = r4.f167c
            if (r1 != r2) goto Ld7
            goto Le6
        Ld7:
            char[] r1 = a5.v.f162d
            char r1 = r4.f(r5, r1)
            r2 = 13
            if (r1 != r2) goto Le6
            char[] r1 = a5.v.f163e
            r4.f(r5, r1)
        Le6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.v.h(java.nio.charset.Charset):java.lang.String");
    }

    public final int i() {
        byte[] bArr = this.f165a;
        int i10 = this.f166b;
        int i11 = i10 + 1;
        this.f166b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f166b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        int i15 = i10 + 3;
        this.f166b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f166b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public final long j() {
        byte[] bArr = this.f165a;
        int i10 = this.f166b;
        this.f166b = i10 + 1;
        this.f166b = i10 + 2;
        this.f166b = i10 + 3;
        long j = (bArr[i10] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f166b = i10 + 4;
        long j7 = j | ((bArr[r8] & 255) << 24);
        this.f166b = i10 + 5;
        long j10 = j7 | ((bArr[r7] & 255) << 32);
        this.f166b = i10 + 6;
        long j11 = j10 | ((bArr[r8] & 255) << 40);
        this.f166b = i10 + 7;
        long j12 = j11 | ((bArr[r7] & 255) << 48);
        this.f166b = i10 + 8;
        return ((bArr[r8] & 255) << 56) | j12;
    }

    public final long k() {
        byte[] bArr = this.f165a;
        int i10 = this.f166b;
        this.f166b = i10 + 1;
        this.f166b = i10 + 2;
        this.f166b = i10 + 3;
        long j = (bArr[i10] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f166b = i10 + 4;
        return ((bArr[r4] & 255) << 24) | j;
    }

    public final int l() {
        int i10 = i();
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalStateException(h0.b.h(i10, "Top bit not zero: "));
    }

    public final int m() {
        byte[] bArr = this.f165a;
        int i10 = this.f166b;
        int i11 = i10 + 1;
        this.f166b = i11;
        int i12 = bArr[i10] & 255;
        this.f166b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final long n() {
        byte[] bArr = this.f165a;
        int i10 = this.f166b;
        this.f166b = i10 + 1;
        this.f166b = i10 + 2;
        this.f166b = i10 + 3;
        long j = ((bArr[i10] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f166b = i10 + 4;
        long j7 = j | ((bArr[r4] & 255) << 32);
        this.f166b = i10 + 5;
        long j10 = j7 | ((bArr[r7] & 255) << 24);
        this.f166b = i10 + 6;
        long j11 = j10 | ((bArr[r4] & 255) << 16);
        this.f166b = i10 + 7;
        long j12 = j11 | ((bArr[r7] & 255) << 8);
        this.f166b = i10 + 8;
        return (bArr[r4] & 255) | j12;
    }

    public final String o() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f166b;
        while (i10 < this.f167c && this.f165a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f165a;
        int i11 = this.f166b;
        int i12 = d0.f105a;
        String str = new String(bArr, i11, i10 - i11, ne.g.f17524c);
        this.f166b = i10;
        if (i10 < this.f167c) {
            this.f166b = i10 + 1;
        }
        return str;
    }

    public final String p(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f166b;
        int i12 = (i11 + i10) - 1;
        int i13 = (i12 >= this.f167c || this.f165a[i12] != 0) ? i10 : i10 - 1;
        byte[] bArr = this.f165a;
        int i14 = d0.f105a;
        String str = new String(bArr, i11, i13, ne.g.f17524c);
        this.f166b += i10;
        return str;
    }

    public final short q() {
        byte[] bArr = this.f165a;
        int i10 = this.f166b;
        int i11 = i10 + 1;
        this.f166b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f166b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public final String r(int i10, Charset charset) {
        String str = new String(this.f165a, this.f166b, i10, charset);
        this.f166b += i10;
        return str;
    }

    public final int s() {
        return (t() << 21) | (t() << 14) | (t() << 7) | t();
    }

    public final int t() {
        byte[] bArr = this.f165a;
        int i10 = this.f166b;
        this.f166b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final long u() {
        byte[] bArr = this.f165a;
        int i10 = this.f166b;
        this.f166b = i10 + 1;
        this.f166b = i10 + 2;
        this.f166b = i10 + 3;
        long j = ((bArr[i10] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f166b = i10 + 4;
        return (bArr[r4] & 255) | j;
    }

    public final int v() {
        byte[] bArr = this.f165a;
        int i10 = this.f166b;
        int i11 = i10 + 1;
        this.f166b = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i10 + 2;
        this.f166b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f166b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public final int w() {
        int iG = g();
        if (iG >= 0) {
            return iG;
        }
        throw new IllegalStateException(h0.b.h(iG, "Top bit not zero: "));
    }

    public final long x() {
        long jN = n();
        if (jN >= 0) {
            return jN;
        }
        throw new IllegalStateException(c7.a.m(jN, "Top bit not zero: "));
    }

    public final int y() {
        byte[] bArr = this.f165a;
        int i10 = this.f166b;
        int i11 = i10 + 1;
        this.f166b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f166b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public final long z() {
        int i10;
        int i11;
        long j = this.f165a[this.f166b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            if (((1 << i12) & j) != 0) {
                i12--;
            } else if (i12 < 6) {
                j &= r6 - 1;
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 == 0) {
            throw new NumberFormatException(c7.a.m(j, "Invalid UTF-8 sequence first byte: "));
        }
        for (i10 = 1; i10 < i11; i10++) {
            if ((this.f165a[this.f166b + i10] & 192) != 128) {
                throw new NumberFormatException(c7.a.m(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | (r3 & 63);
        }
        this.f166b += i11;
        return j;
    }

    public v(int i10) {
        this.f165a = new byte[i10];
        this.f167c = i10;
    }

    public v(byte[] bArr) {
        this.f165a = bArr;
        this.f167c = bArr.length;
    }

    public v(int i10, byte[] bArr) {
        this.f165a = bArr;
        this.f167c = i10;
    }
}
