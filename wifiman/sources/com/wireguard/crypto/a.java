package com.wireguard.crypto;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: l, reason: collision with root package name */
    private final int[] f45651l = new int[10];

    /* renamed from: m, reason: collision with root package name */
    private final int[] f45652m = new int[10];

    /* renamed from: n, reason: collision with root package name */
    private final int[] f45653n = new int[10];

    /* renamed from: o, reason: collision with root package name */
    private final int[] f45654o = new int[10];

    /* renamed from: p, reason: collision with root package name */
    private final int[] f45655p = new int[10];

    /* renamed from: a, reason: collision with root package name */
    private final int[] f45640a = new int[10];

    /* renamed from: c, reason: collision with root package name */
    private final int[] f45642c = new int[10];

    /* renamed from: e, reason: collision with root package name */
    private final int[] f45644e = new int[10];

    /* renamed from: g, reason: collision with root package name */
    private final int[] f45646g = new int[10];

    /* renamed from: i, reason: collision with root package name */
    private final int[] f45648i = new int[10];

    /* renamed from: b, reason: collision with root package name */
    private final int[] f45641b = new int[10];

    /* renamed from: d, reason: collision with root package name */
    private final int[] f45643d = new int[10];

    /* renamed from: h, reason: collision with root package name */
    private final int[] f45647h = new int[10];

    /* renamed from: f, reason: collision with root package name */
    private final int[] f45645f = new int[10];

    /* renamed from: j, reason: collision with root package name */
    private final long[] f45649j = new long[20];

    /* renamed from: k, reason: collision with root package name */
    private final int[] f45650k = new int[20];

    private a() {
    }

    private void a(int[] iArr, int[] iArr2, int[] iArr3) {
        int i10 = iArr2[0] + iArr3[0];
        iArr[0] = i10 & 67108863;
        for (int i11 = 1; i11 < 10; i11++) {
            i10 = (i10 >> 26) + iArr2[i11] + iArr3[i11];
            iArr[i11] = i10 & 67108863;
        }
        k(iArr);
    }

    private static void b(int i10, int[] iArr, int[] iArr2) {
        int i11 = -i10;
        for (int i12 = 0; i12 < 10; i12++) {
            int i13 = iArr[i12];
            int i14 = (iArr2[i12] ^ i13) & i11;
            iArr[i12] = i13 ^ i14;
            iArr2[i12] = iArr2[i12] ^ i14;
        }
    }

    private void c() {
        Arrays.fill(this.f45651l, 0);
        Arrays.fill(this.f45652m, 0);
        Arrays.fill(this.f45653n, 0);
        Arrays.fill(this.f45654o, 0);
        Arrays.fill(this.f45655p, 0);
        Arrays.fill(this.f45640a, 0);
        Arrays.fill(this.f45642c, 0);
        Arrays.fill(this.f45644e, 0);
        Arrays.fill(this.f45646g, 0);
        Arrays.fill(this.f45648i, 0);
        Arrays.fill(this.f45641b, 0);
        Arrays.fill(this.f45643d, 0);
        Arrays.fill(this.f45647h, 0);
        Arrays.fill(this.f45645f, 0);
        Arrays.fill(this.f45649j, 0L);
        Arrays.fill(this.f45650k, 0);
    }

    public static void d(byte[] bArr, int i10, byte[] bArr2, byte[] bArr3) {
        a aVar = new a();
        try {
            Arrays.fill(aVar.f45651l, 0);
            if (bArr3 != null) {
                for (int i11 = 0; i11 < 32; i11++) {
                    int i12 = i11 * 8;
                    int i13 = i12 % 26;
                    int i14 = i12 / 26;
                    int i15 = bArr3[i11] & 255;
                    if (i13 <= 18) {
                        int[] iArr = aVar.f45651l;
                        iArr[i14] = (i15 << i13) | iArr[i14];
                    } else {
                        int[] iArr2 = aVar.f45651l;
                        int i16 = iArr2[i14] | (i15 << i13);
                        iArr2[i14] = i16;
                        iArr2[i14] = i16 & 67108863;
                        int i17 = i14 + 1;
                        iArr2[i17] = (i15 >> (26 - i13)) | iArr2[i17];
                    }
                }
                aVar.k(aVar.f45651l);
                aVar.k(aVar.f45651l);
            } else {
                aVar.f45651l[0] = 9;
            }
            Arrays.fill(aVar.f45652m, 0);
            aVar.f45652m[0] = 1;
            Arrays.fill(aVar.f45654o, 0);
            int[] iArr3 = aVar.f45651l;
            System.arraycopy(iArr3, 0, aVar.f45653n, 0, iArr3.length);
            Arrays.fill(aVar.f45655p, 0);
            aVar.f45655p[0] = 1;
            aVar.e(bArr2);
            aVar.i(aVar.f45655p, aVar.f45654o);
            int[] iArr4 = aVar.f45652m;
            aVar.f(iArr4, iArr4, aVar.f45655p);
            for (int i18 = 0; i18 < 32; i18++) {
                int i19 = i18 * 8;
                int i20 = i19 % 26;
                int i21 = i19 / 26;
                if (i20 <= 18) {
                    bArr[i10 + i18] = (byte) (aVar.f45652m[i21] >> i20);
                } else {
                    int[] iArr5 = aVar.f45652m;
                    bArr[i10 + i18] = (byte) ((iArr5[i21 + 1] << (26 - i20)) | (iArr5[i21] >> i20));
                }
            }
            aVar.c();
        } catch (Throwable th2) {
            aVar.c();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6 */
    private void e(byte[] bArr) {
        byte b10;
        int i10 = 31;
        int i11 = bArr[31] | 64;
        int i12 = 6;
        int i13 = 0;
        while (true) {
            int i14 = (i11 >> i12) & 1;
            int i15 = i13 ^ i14;
            b(i15, this.f45652m, this.f45653n);
            b(i15, this.f45654o, this.f45655p);
            a(this.f45640a, this.f45652m, this.f45654o);
            l(this.f45641b, this.f45640a);
            m(this.f45642c, this.f45652m, this.f45654o);
            l(this.f45643d, this.f45642c);
            m(this.f45648i, this.f45641b, this.f45643d);
            a(this.f45644e, this.f45653n, this.f45655p);
            m(this.f45646g, this.f45653n, this.f45655p);
            f(this.f45647h, this.f45646g, this.f45640a);
            f(this.f45645f, this.f45644e, this.f45642c);
            a(this.f45653n, this.f45647h, this.f45645f);
            int[] iArr = this.f45653n;
            l(iArr, iArr);
            m(this.f45655p, this.f45647h, this.f45645f);
            int[] iArr2 = this.f45655p;
            l(iArr2, iArr2);
            int[] iArr3 = this.f45655p;
            f(iArr3, iArr3, this.f45651l);
            f(this.f45652m, this.f45641b, this.f45643d);
            g(this.f45654o, this.f45648i);
            int[] iArr4 = this.f45654o;
            a(iArr4, iArr4, this.f45641b);
            int[] iArr5 = this.f45654o;
            f(iArr5, iArr5, this.f45648i);
            if (i12 > 0) {
                i12--;
            } else {
                if (i10 == 0) {
                    b(i14, this.f45652m, this.f45653n);
                    b(i14, this.f45654o, this.f45655p);
                    return;
                }
                if (i10 == 1) {
                    i10--;
                    b10 = bArr[i10] & 248;
                } else {
                    i10--;
                    b10 = bArr[i10];
                }
                byte b11 = b10;
                i12 = 7;
                i11 = b11;
            }
            i13 = i14;
        }
    }

    private void f(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = iArr2[0];
        for (int i10 = 0; i10 < 10; i10++) {
            this.f45649j[i10] = iArr3[i10] * j10;
        }
        for (int i11 = 1; i11 < 10; i11++) {
            long j11 = iArr2[i11];
            for (int i12 = 0; i12 < 9; i12++) {
                long[] jArr = this.f45649j;
                int i13 = i11 + i12;
                jArr[i13] = jArr[i13] + (iArr3[i12] * j11);
            }
            this.f45649j[i11 + 9] = j11 * iArr3[9];
        }
        long j12 = this.f45649j[0];
        this.f45650k[0] = ((int) j12) & 67108863;
        for (int i14 = 1; i14 < 20; i14++) {
            j12 = this.f45649j[i14] + (j12 >> 26);
            this.f45650k[i14] = ((int) j12) & 67108863;
        }
        j(iArr, this.f45650k, 10);
    }

    private void g(int[] iArr, int[] iArr2) {
        long j10 = 0;
        for (int i10 = 0; i10 < 10; i10++) {
            long j11 = j10 + (iArr2[i10] * 121665);
            this.f45650k[i10] = 67108863 & ((int) j11);
            j10 = j11 >> 26;
        }
        int[] iArr3 = this.f45650k;
        iArr3[10] = ((int) j10) & 67108863;
        j(iArr, iArr3, 1);
    }

    private void h(int[] iArr, int[] iArr2) {
        l(this.f45640a, iArr2);
        for (int i10 = 0; i10 < 9; i10++) {
            int[] iArr3 = this.f45640a;
            l(iArr3, iArr3);
        }
        f(iArr, this.f45640a, iArr2);
        for (int i11 = 0; i11 < 23; i11++) {
            for (int i12 = 0; i12 < 10; i12++) {
                int[] iArr4 = this.f45640a;
                l(iArr4, iArr4);
            }
            f(iArr, iArr, this.f45640a);
        }
        l(this.f45640a, iArr);
        f(iArr, iArr, this.f45640a);
        for (int i13 = 0; i13 < 8; i13++) {
            int[] iArr5 = this.f45640a;
            l(iArr5, iArr5);
            f(iArr, iArr, this.f45640a);
        }
    }

    private void i(int[] iArr, int[] iArr2) {
        h(iArr, iArr2);
        l(iArr, iArr);
        l(iArr, iArr);
        f(iArr, iArr, iArr2);
        l(iArr, iArr);
        l(iArr, iArr);
        f(iArr, iArr, iArr2);
        l(iArr, iArr);
        f(iArr, iArr, iArr2);
    }

    private void j(int[] iArr, int[] iArr2, int i10) {
        int i11 = iArr2[9];
        int i12 = i11 >> 21;
        iArr2[9] = i11 & 2097151;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = i12 + (iArr2[i14 + 10] << 5);
            int i16 = i13 + ((i15 & 67108863) * 19) + iArr2[i14];
            iArr2[i14] = 67108863 & i16;
            i12 = i15 >> 26;
            i13 = i16 >> 26;
        }
        if (i10 < 10) {
            while (i10 < 10) {
                int i17 = i13 + iArr2[i10];
                iArr2[i10] = i17 & 67108863;
                i13 = i17 >> 26;
                i10++;
            }
        }
        int i18 = iArr2[9];
        int i19 = (i18 >> 21) * 19;
        iArr2[9] = i18 & 2097151;
        for (int i20 = 0; i20 < 10; i20++) {
            int i21 = i19 + iArr2[i20];
            iArr[i20] = i21 & 67108863;
            i19 = i21 >> 26;
        }
        k(iArr);
    }

    private void k(int[] iArr) {
        int i10 = 19;
        for (int i11 = 0; i11 < 10; i11++) {
            int i12 = i10 + iArr[i11];
            this.f45650k[i11] = 67108863 & i12;
            i10 = i12 >> 26;
        }
        int[] iArr2 = this.f45650k;
        int i13 = iArr2[9];
        int i14 = -((i13 >> 21) & 1);
        int i15 = ~i14;
        iArr2[9] = i13 & 2097151;
        for (int i16 = 0; i16 < 10; i16++) {
            iArr[i16] = (iArr[i16] & i15) | (this.f45650k[i16] & i14);
        }
    }

    private void l(int[] iArr, int[] iArr2) {
        f(iArr, iArr2, iArr2);
    }

    private static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        int i10 = 0;
        for (int i11 = 0; i11 < 10; i11++) {
            i10 = (iArr2[i11] - iArr3[i11]) - ((i10 >> 26) & 1);
            iArr[i11] = i10 & 67108863;
        }
        int i12 = iArr[0] - ((-((i10 >> 26) & 1)) & 19);
        iArr[0] = i12 & 67108863;
        for (int i13 = 1; i13 < 10; i13++) {
            i12 = iArr[i13] - ((i12 >> 26) & 1);
            iArr[i13] = i12 & 67108863;
        }
        iArr[9] = iArr[9] & 2097151;
    }
}
