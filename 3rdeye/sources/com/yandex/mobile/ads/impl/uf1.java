package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.impl.Oo;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class uf1 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f34052a;

    /* renamed from: b, reason: collision with root package name */
    private int f34053b;

    /* renamed from: c, reason: collision with root package name */
    private int f34054c;

    public uf1() {
        this.f34052a = s82.f32904f;
    }

    public final long A() {
        int i;
        int i10;
        long j4 = this.f34052a[this.f34053b];
        int i11 = 7;
        while (true) {
            if (i11 < 0) {
                break;
            }
            if (((1 << i11) & j4) != 0) {
                i11--;
            } else if (i11 < 6) {
                j4 &= r6 - 1;
                i10 = 7 - i11;
            } else if (i11 == 7) {
                i10 = 1;
            }
        }
        i10 = 0;
        if (i10 == 0) {
            throw new NumberFormatException(Oo.d(j4, "Invalid UTF-8 sequence first byte: "));
        }
        for (i = 1; i < i10; i++) {
            if ((this.f34052a[this.f34053b + i] & 192) != 128) {
                throw new NumberFormatException(Oo.d(j4, "Invalid UTF-8 sequence continuation byte: "));
            }
            j4 = (j4 << 6) | (r3 & 63);
        }
        this.f34053b += i10;
        return j4;
    }

    public final int a() {
        return this.f34054c - this.f34053b;
    }

    public final int b() {
        return this.f34052a.length;
    }

    public final byte[] c() {
        return this.f34052a;
    }

    public final int d() {
        return this.f34053b;
    }

    public final int e() {
        return this.f34054c;
    }

    public final char f() {
        byte[] bArr = this.f34052a;
        int i = this.f34053b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public final int g() {
        return this.f34052a[this.f34053b] & 255;
    }

    public final int h() {
        byte[] bArr = this.f34052a;
        int i = this.f34053b;
        int i10 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
        int i11 = i + 3;
        int i12 = i10 | ((bArr[i + 2] & 255) << 8);
        this.f34053b = i + 4;
        return (bArr[i11] & 255) | i12;
    }

    public final int i() {
        byte[] bArr = this.f34052a;
        int i = this.f34053b;
        int i10 = i + 2;
        int i11 = ((bArr[i + 1] & 255) << 8) | (((bArr[i] & 255) << 24) >> 8);
        this.f34053b = i + 3;
        return (bArr[i10] & 255) | i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String j() {
        /*
            r8 = this;
            int r0 = r8.f34054c
            int r1 = r8.f34053b
            int r0 = r0 - r1
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            int r0 = r8.f34054c
            r2 = 13
            r3 = 10
            if (r1 >= r0) goto L1f
            byte[] r0 = r8.f34052a
            r0 = r0[r1]
            int r4 = com.yandex.mobile.ads.impl.s82.f32899a
            if (r0 == r3) goto L1f
            if (r0 != r2) goto L1c
            goto L1f
        L1c:
            int r1 = r1 + 1
            goto L9
        L1f:
            int r0 = r8.f34053b
            int r4 = r1 - r0
            r5 = 3
            if (r4 < r5) goto L41
            byte[] r4 = r8.f34052a
            r6 = r4[r0]
            r7 = -17
            if (r6 != r7) goto L41
            int r6 = r0 + 1
            r6 = r4[r6]
            r7 = -69
            if (r6 != r7) goto L41
            int r6 = r0 + 2
            r4 = r4[r6]
            r6 = -65
            if (r4 != r6) goto L41
            int r0 = r0 + r5
            r8.f34053b = r0
        L41:
            byte[] r0 = r8.f34052a
            int r4 = r8.f34053b
            int r5 = r1 - r4
            java.lang.String r0 = com.yandex.mobile.ads.impl.s82.a(r0, r4, r5)
            r8.f34053b = r1
            int r4 = r8.f34054c
            if (r1 != r4) goto L52
            goto L69
        L52:
            byte[] r5 = r8.f34052a
            r6 = r5[r1]
            if (r6 != r2) goto L5f
            int r1 = r1 + 1
            r8.f34053b = r1
            if (r1 != r4) goto L5f
            goto L69
        L5f:
            int r1 = r8.f34053b
            r2 = r5[r1]
            if (r2 != r3) goto L69
            int r1 = r1 + 1
            r8.f34053b = r1
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.uf1.j():java.lang.String");
    }

    public final int k() {
        byte[] bArr = this.f34052a;
        int i = this.f34053b;
        int i10 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        int i11 = i + 3;
        int i12 = i10 | ((bArr[i + 2] & 255) << 16);
        this.f34053b = i + 4;
        return ((bArr[i11] & 255) << 24) | i12;
    }

    public final long l() {
        byte[] bArr = this.f34052a;
        int i = this.f34053b;
        int i10 = i + 7;
        long j4 = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        this.f34053b = i + 8;
        return ((bArr[i10] & 255) << 56) | j4;
    }

    public final short m() {
        byte[] bArr = this.f34052a;
        int i = this.f34053b;
        int i10 = i + 1;
        int i11 = bArr[i] & 255;
        this.f34053b = i + 2;
        return (short) (((bArr[i10] & 255) << 8) | i11);
    }

    public final long n() {
        byte[] bArr = this.f34052a;
        int i = this.f34053b;
        int i10 = i + 3;
        long j4 = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        this.f34053b = i + 4;
        return ((bArr[i10] & 255) << 24) | j4;
    }

    public final int o() {
        byte[] bArr = this.f34052a;
        int i = this.f34053b;
        int i10 = i + 1;
        int i11 = bArr[i] & 255;
        this.f34053b = i + 2;
        return ((bArr[i10] & 255) << 8) | i11;
    }

    public final long p() {
        byte[] bArr = this.f34052a;
        int i = this.f34053b;
        int i10 = i + 7;
        long j4 = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        this.f34053b = i + 8;
        return (bArr[i10] & 255) | j4;
    }

    public final String q() {
        int i = this.f34054c;
        int i10 = this.f34053b;
        if (i - i10 == 0) {
            return null;
        }
        while (i10 < this.f34054c && this.f34052a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f34052a;
        int i11 = this.f34053b;
        String strA = s82.a(bArr, i11, i10 - i11);
        this.f34053b = i10;
        if (i10 < this.f34054c) {
            this.f34053b = i10 + 1;
        }
        return strA;
    }

    public final short r() {
        byte[] bArr = this.f34052a;
        int i = this.f34053b;
        int i10 = i + 1;
        int i11 = (bArr[i] & 255) << 8;
        this.f34053b = i + 2;
        return (short) ((bArr[i10] & 255) | i11);
    }

    public final int s() {
        return (t() << 21) | (t() << 14) | (t() << 7) | t();
    }

    public final int t() {
        byte[] bArr = this.f34052a;
        int i = this.f34053b;
        this.f34053b = i + 1;
        return bArr[i] & 255;
    }

    public final int u() {
        byte[] bArr = this.f34052a;
        int i = this.f34053b;
        int i10 = (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
        this.f34053b = i + 4;
        return i10;
    }

    public final long v() {
        byte[] bArr = this.f34052a;
        int i = this.f34053b;
        int i10 = i + 3;
        long j4 = ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        this.f34053b = i + 4;
        return (bArr[i10] & 255) | j4;
    }

    public final int w() {
        byte[] bArr = this.f34052a;
        int i = this.f34053b;
        int i10 = i + 2;
        int i11 = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
        this.f34053b = i + 3;
        return (bArr[i10] & 255) | i11;
    }

    public final int x() {
        int iH = h();
        if (iH >= 0) {
            return iH;
        }
        throw new IllegalStateException(fe.a("Top bit not zero: ", iH));
    }

    public final long y() {
        long jP = p();
        if (jP >= 0) {
            return jP;
        }
        throw new IllegalStateException(Oo.d(jP, "Top bit not zero: "));
    }

    public final int z() {
        byte[] bArr = this.f34052a;
        int i = this.f34053b;
        int i10 = i + 1;
        int i11 = (bArr[i] & 255) << 8;
        this.f34053b = i + 2;
        return (bArr[i10] & 255) | i11;
    }

    public final void a(int i) {
        byte[] bArr = this.f34052a;
        if (i > bArr.length) {
            this.f34052a = Arrays.copyOf(bArr, i);
        }
    }

    public final String b(int i) {
        if (i == 0) {
            return "";
        }
        int i10 = this.f34053b;
        int i11 = (i10 + i) - 1;
        String strA = s82.a(this.f34052a, i10, (i11 >= this.f34054c || this.f34052a[i11] != 0) ? i : i - 1);
        this.f34053b += i;
        return strA;
    }

    public final void c(int i) {
        byte[] bArr = this.f34052a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        this.f34052a = bArr;
        this.f34054c = i;
        this.f34053b = 0;
    }

    public final void d(int i) {
        if (i < 0 || i > this.f34052a.length) {
            throw new IllegalArgumentException();
        }
        this.f34054c = i;
    }

    public final void e(int i) {
        if (i < 0 || i > this.f34054c) {
            throw new IllegalArgumentException();
        }
        this.f34053b = i;
    }

    public final void f(int i) {
        e(this.f34053b + i);
    }

    public uf1(int i) {
        this.f34052a = new byte[i];
        this.f34054c = i;
    }

    public final void a(byte[] bArr, int i, int i10) {
        System.arraycopy(this.f34052a, this.f34053b, bArr, i, i10);
        this.f34053b += i10;
    }

    public uf1(int i, byte[] bArr) {
        this.f34052a = bArr;
        this.f34054c = i;
    }

    public final void a(int i, byte[] bArr) {
        this.f34052a = bArr;
        this.f34054c = i;
        this.f34053b = 0;
    }

    public uf1(byte[] bArr) {
        this.f34052a = bArr;
        this.f34054c = bArr.length;
    }

    public final void a(byte[] bArr) {
        int length = bArr.length;
        this.f34052a = bArr;
        this.f34054c = length;
        this.f34053b = 0;
    }

    public final String a(int i, Charset charset) {
        String str = new String(this.f34052a, this.f34053b, i, charset);
        this.f34053b += i;
        return str;
    }
}
