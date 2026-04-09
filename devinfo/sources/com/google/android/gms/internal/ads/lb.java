package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lb {

    /* renamed from: a, reason: collision with root package name */
    public int[] f13440a;

    /* renamed from: b, reason: collision with root package name */
    public int f13441b;

    public lb(int i4, int[] iArr) {
        int length = iArr.length;
        if (length == 4) {
            this.f13441b = i4;
            this.f13440a = iArr;
        } else {
            StringBuilder sb2 = new StringBuilder(r5.c.e(length, 44));
            sb2.append(qb.a("Ake3rgkWMjm+UlOd1Tg3PHccqBbIRJQk3bhyKj5k"));
            sb2.append(length);
            sb2.append(qb.a("a0CvvBEaN339T0zNlXk="));
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public int a(int i4) {
        int i10 = this.f13441b - 1;
        return i10 >= 0 ? this.f13440a[i10] : i4;
    }

    public int b() {
        int[] iArr = this.f13440a;
        int i4 = this.f13441b - 1;
        this.f13441b = i4;
        return iArr[i4];
    }

    public void c(int i4) {
        int[] iArrCopyOf = this.f13440a;
        if (this.f13441b >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            nk.k.d(iArrCopyOf, "copyOf(...)");
            this.f13440a = iArrCopyOf;
        }
        int i10 = this.f13441b;
        this.f13441b = i10 + 1;
        iArrCopyOf[i10] = i4;
    }

    public void d(int i4, int i10, int i11) {
        int i12 = this.f13441b;
        int[] iArrCopyOf = this.f13440a;
        int i13 = i12 + 3;
        if (i13 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            nk.k.d(iArrCopyOf, "copyOf(...)");
            this.f13440a = iArrCopyOf;
        }
        iArrCopyOf[i12] = i4 + i11;
        iArrCopyOf[i12 + 1] = i10 + i11;
        iArrCopyOf[i12 + 2] = i11;
        this.f13441b = i13;
    }

    public void e(int i4, int i10, int i11, int i12) {
        int i13 = this.f13441b;
        int[] iArrCopyOf = this.f13440a;
        int i14 = i13 + 4;
        if (i14 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            nk.k.d(iArrCopyOf, "copyOf(...)");
            this.f13440a = iArrCopyOf;
        }
        iArrCopyOf[i13] = i4;
        iArrCopyOf[i13 + 1] = i10;
        iArrCopyOf[i13 + 2] = i11;
        iArrCopyOf[i13 + 3] = i12;
        this.f13441b = i14;
    }

    public void f(int i4, int i10) {
        if (i4 < i10) {
            int i11 = i4 - 3;
            for (int i12 = i4; i12 < i10; i12 += 3) {
                int[] iArr = this.f13440a;
                int i13 = iArr[i12];
                int i14 = iArr[i10];
                if (i13 < i14 || (i13 == i14 && iArr[i12 + 1] <= iArr[i10 + 1])) {
                    i11 += 3;
                    g(i11, i12);
                }
            }
            g(i11 + 3, i10);
            f(i4, i11);
            f(i11 + 6, i10);
        }
    }

    public void g(int i4, int i10) {
        int[] iArr = this.f13440a;
        int i11 = iArr[i4];
        iArr[i4] = iArr[i10];
        iArr[i10] = i11;
        int i12 = i4 + 1;
        int i13 = i10 + 1;
        int i14 = iArr[i12];
        iArr[i12] = iArr[i13];
        iArr[i13] = i14;
        int i15 = i4 + 2;
        int i16 = i10 + 2;
        int i17 = iArr[i15];
        iArr[i15] = iArr[i16];
        iArr[i16] = i17;
    }

    public void h(int i4, byte[] bArr) {
        int i10 = 1777080124;
        int i11 = 1777080124;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        char c9 = 0;
        int i24 = 0;
        char c10 = 0;
        char c11 = 0;
        while (true) {
            if (i11 == 719824015) {
                int i25 = (-235787554) + i11;
                i11 += 799411447;
                if (i12 == i13) {
                    i11 = i25;
                }
            } else if (i11 == 1519235462) {
                int[] iArr = this.f13440a;
                i14 += (((i15 << i16) ^ (i15 >>> i17)) + i15) ^ (i12 + iArr[i12 & i18]);
                i12 += i19;
                i15 += (iArr[(i12 >>> i20) & i18] + i12) ^ (((i14 << i16) ^ (i14 >>> i17)) + i14);
                i11 -= 799411447;
            } else {
                if (i11 != i10) {
                    bArr[0] = (byte) (i14 >> i21);
                    bArr[1] = (byte) ((((i14 >> i22) & i23) << i21) >> i21);
                    bArr[c9] = (byte) ((((i14 >> i24) & i23) << i21) >> i21);
                    bArr[i18] = (byte) (((i14 & i23) << i21) >> i21);
                    bArr[i16] = (byte) (i15 >> i21);
                    bArr[i17] = (byte) ((((i15 >> i22) & i23) << i21) >> i21);
                    bArr[c10] = (byte) ((((i15 >> i24) & i23) << i21) >> i21);
                    bArr[c11] = (byte) (((i15 & i23) << i21) >> i21);
                    return;
                }
                i14 = this.f13441b;
                i11 -= 1057256109;
                i18 = 3;
                i23 = 255;
                c11 = 7;
                c10 = 6;
                c9 = 2;
                i21 = 24;
                i20 = 11;
                i19 = 1340169305;
                i17 = 5;
                i16 = 4;
                i13 = -64255200;
                i22 = 16;
                i24 = 8;
                i15 = i4;
                i12 = 0;
            }
            i10 = 1777080124;
        }
    }

    public lb() {
        this.f13440a = new int[10];
    }

    public lb(int i4) {
        this.f13440a = new int[i4];
    }
}
