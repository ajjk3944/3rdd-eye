package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class u31 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f33899a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f33900b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final Object f33901c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static int[] f33902d = new int[10];

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f33903a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f33904b;

        /* renamed from: c, reason: collision with root package name */
        public final int f33905c;

        /* renamed from: d, reason: collision with root package name */
        public final int f33906d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f33907e;

        /* renamed from: f, reason: collision with root package name */
        public final int f33908f;

        /* renamed from: g, reason: collision with root package name */
        public final float f33909g;

        public a(int i, boolean z10, int i10, int i11, int[] iArr, int i12, int i13, int i14, float f10) {
            this.f33903a = i;
            this.f33904b = z10;
            this.f33905c = i10;
            this.f33906d = i11;
            this.f33907e = iArr;
            this.f33908f = i12;
            this.f33909g = f10;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f33910a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f33911b;

        public b(int i, int i10, boolean z10) {
            this.f33910a = i10;
            this.f33911b = z10;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f33912a;

        /* renamed from: b, reason: collision with root package name */
        public final int f33913b;

        /* renamed from: c, reason: collision with root package name */
        public final int f33914c;

        /* renamed from: d, reason: collision with root package name */
        public final int f33915d;

        /* renamed from: e, reason: collision with root package name */
        public final int f33916e;

        /* renamed from: f, reason: collision with root package name */
        public final int f33917f;

        /* renamed from: g, reason: collision with root package name */
        public final float f33918g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f33919h;
        public final boolean i;

        /* renamed from: j, reason: collision with root package name */
        public final int f33920j;

        /* renamed from: k, reason: collision with root package name */
        public final int f33921k;

        /* renamed from: l, reason: collision with root package name */
        public final int f33922l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f33923m;

        public c(int i, int i10, int i11, int i12, int i13, int i14, float f10, boolean z10, boolean z11, int i15, int i16, int i17, boolean z12) {
            this.f33912a = i;
            this.f33913b = i10;
            this.f33914c = i11;
            this.f33915d = i12;
            this.f33916e = i13;
            this.f33917f = i14;
            this.f33918g = f10;
            this.f33919h = z10;
            this.i = z11;
            this.f33920j = i15;
            this.f33921k = i16;
            this.f33922l = i17;
            this.f33923m = z12;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.yandex.mobile.ads.impl.u31.c b(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.u31.b(byte[], int, int):com.yandex.mobile.ads.impl.u31$c");
    }

    public static int a(byte[] bArr, int i, int i10, boolean[] zArr) {
        int i11 = i10 - i;
        if (i11 < 0) {
            throw new IllegalStateException();
        }
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            a(zArr);
            return i - 3;
        }
        if (i11 > 1 && zArr[1] && bArr[i] == 1) {
            a(zArr);
            return i - 2;
        }
        if (i11 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            a(zArr);
            return i - 1;
        }
        int i12 = i10 - 1;
        int i13 = i + 2;
        while (i13 < i12) {
            byte b10 = bArr[i13];
            if ((b10 & 254) == 0) {
                int i14 = i13 - 2;
                if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b10 == 1) {
                    a(zArr);
                    return i14;
                }
                i13 -= 2;
            }
            i13 += 3;
        }
        zArr[0] = i11 <= 2 ? !(i11 != 2 ? !(zArr[1] && bArr[i12] == 1) : !(zArr[2] && bArr[i10 + (-2)] == 0 && bArr[i12] == 1)) : bArr[i10 + (-3)] == 0 && bArr[i10 + (-2)] == 0 && bArr[i12] == 1;
        zArr[1] = i11 <= 1 ? zArr[2] && bArr[i12] == 0 : bArr[i10 + (-2)] == 0 && bArr[i12] == 0;
        zArr[2] = bArr[i12] == 0;
        return i10;
    }

    public static a a(byte[] bArr, int i, int i10) {
        int i11;
        int i12;
        int i13;
        int i14 = 2;
        vf1 vf1Var = new vf1(bArr, i + 2, i10);
        int i15 = 4;
        vf1Var.d(4);
        int iB = vf1Var.b(3);
        vf1Var.f();
        int iB2 = vf1Var.b(2);
        boolean zC = vf1Var.c();
        int iB3 = vf1Var.b(5);
        int i16 = 0;
        for (int i17 = 0; i17 < 32; i17++) {
            if (vf1Var.c()) {
                i16 |= 1 << i17;
            }
        }
        int i18 = 6;
        int[] iArr = new int[6];
        for (int i19 = 0; i19 < 6; i19++) {
            iArr[i19] = vf1Var.b(8);
        }
        int i20 = i16;
        int iB4 = vf1Var.b(8);
        int i21 = 0;
        for (int i22 = 0; i22 < iB; i22++) {
            if (vf1Var.c()) {
                i21 += 89;
            }
            if (vf1Var.c()) {
                i21 += 8;
            }
        }
        vf1Var.d(i21);
        if (iB > 0) {
            vf1Var.d((8 - iB) * 2);
        }
        vf1Var.e();
        int iE = vf1Var.e();
        if (iE == 3) {
            vf1Var.f();
        }
        int iE2 = vf1Var.e();
        int iE3 = vf1Var.e();
        if (vf1Var.c()) {
            int iE4 = vf1Var.e();
            int iE5 = vf1Var.e();
            int iE6 = vf1Var.e();
            int iE7 = vf1Var.e();
            iE2 -= (iE4 + iE5) * ((iE == 1 || iE == 2) ? 2 : 1);
            iE3 -= (iE6 + iE7) * (iE == 1 ? 2 : 1);
        }
        vf1Var.e();
        vf1Var.e();
        int iE8 = vf1Var.e();
        for (int i23 = vf1Var.c() ? 0 : iB; i23 <= iB; i23++) {
            vf1Var.e();
            vf1Var.e();
            vf1Var.e();
        }
        vf1Var.e();
        vf1Var.e();
        vf1Var.e();
        vf1Var.e();
        vf1Var.e();
        vf1Var.e();
        if (vf1Var.c() && vf1Var.c()) {
            int i24 = 0;
            while (i24 < i15) {
                int i25 = 0;
                while (i25 < i18) {
                    if (!vf1Var.c()) {
                        vf1Var.e();
                    } else {
                        int iMin = Math.min(64, 1 << ((i24 << 1) + 4));
                        if (i24 > 1) {
                            vf1Var.d();
                        }
                        for (int i26 = 0; i26 < iMin; i26++) {
                            vf1Var.d();
                        }
                    }
                    i25 += i24 == 3 ? 3 : 1;
                    i18 = 6;
                }
                i24++;
                i15 = 4;
                i18 = 6;
            }
        }
        vf1Var.d(2);
        if (vf1Var.c()) {
            vf1Var.d(8);
            vf1Var.e();
            vf1Var.e();
            vf1Var.f();
        }
        int iE9 = vf1Var.e();
        int[] iArrCopyOf = new int[0];
        int[] iArrCopyOf2 = new int[0];
        int i27 = -1;
        int i28 = 0;
        int i29 = -1;
        while (i28 < iE9) {
            if (i28 != 0 && vf1Var.c()) {
                i11 = i14;
                int i30 = i27 + i29;
                int iE10 = (1 - ((vf1Var.c() ? 1 : 0) * 2)) * (vf1Var.e() + 1);
                i12 = iE9;
                int i31 = i30 + 1;
                int[] iArr2 = iArrCopyOf;
                boolean[] zArr = new boolean[i31];
                for (int i32 = 0; i32 <= i30; i32++) {
                    if (!vf1Var.c()) {
                        zArr[i32] = vf1Var.c();
                    } else {
                        zArr[i32] = true;
                    }
                }
                int[] iArr3 = new int[i31];
                int[] iArr4 = new int[i31];
                int i33 = 0;
                for (int i34 = i29 - 1; i34 >= 0; i34--) {
                    int i35 = iArrCopyOf2[i34] + iE10;
                    if (i35 < 0 && zArr[i27 + i34]) {
                        iArr3[i33] = i35;
                        i33++;
                    }
                }
                if (iE10 < 0 && zArr[i30]) {
                    iArr3[i33] = iE10;
                    i33++;
                }
                int i36 = i33;
                i13 = iE8;
                for (int i37 = 0; i37 < i27; i37++) {
                    int i38 = iArr2[i37] + iE10;
                    if (i38 < 0 && zArr[i37]) {
                        iArr3[i36] = i38;
                        i36++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr3, i36);
                int i39 = 0;
                for (int i40 = i27 - 1; i40 >= 0; i40--) {
                    int i41 = iArr2[i40] + iE10;
                    if (i41 > 0 && zArr[i40]) {
                        iArr4[i39] = i41;
                        i39++;
                    }
                }
                if (iE10 > 0 && zArr[i30]) {
                    iArr4[i39] = iE10;
                    i39++;
                }
                int i42 = i36;
                int i43 = i39;
                for (int i44 = 0; i44 < i29; i44++) {
                    int i45 = iArrCopyOf2[i44] + iE10;
                    if (i45 > 0 && zArr[i27 + i44]) {
                        iArr4[i43] = i45;
                        i43++;
                    }
                }
                iArrCopyOf2 = Arrays.copyOf(iArr4, i43);
                i29 = i43;
                i27 = i42;
            } else {
                i11 = i14;
                i12 = iE9;
                i13 = iE8;
                int iE11 = vf1Var.e();
                int iE12 = vf1Var.e();
                int[] iArr5 = new int[iE11];
                for (int i46 = 0; i46 < iE11; i46++) {
                    iArr5[i46] = vf1Var.e() + 1;
                    vf1Var.f();
                }
                int[] iArr6 = new int[iE12];
                for (int i47 = 0; i47 < iE12; i47++) {
                    iArr6[i47] = vf1Var.e() + 1;
                    vf1Var.f();
                }
                i27 = iE11;
                iArrCopyOf2 = iArr6;
                iArrCopyOf = iArr5;
                i29 = iE12;
            }
            i28++;
            i14 = i11;
            iE9 = i12;
            iE8 = i13;
        }
        int i48 = i14;
        int i49 = iE8;
        if (vf1Var.c()) {
            for (int i50 = 0; i50 < vf1Var.e(); i50++) {
                vf1Var.d(i49 + 5);
            }
        }
        vf1Var.d(i48);
        float f10 = 1.0f;
        if (vf1Var.c()) {
            if (vf1Var.c()) {
                int iB5 = vf1Var.b(8);
                if (iB5 == 255) {
                    int iB6 = vf1Var.b(16);
                    int iB7 = vf1Var.b(16);
                    if (iB6 != 0 && iB7 != 0) {
                        f10 = iB6 / iB7;
                    }
                } else {
                    float[] fArr = f33900b;
                    if (iB5 < 17) {
                        f10 = fArr[iB5];
                    } else {
                        kr0.a("Unexpected aspect_ratio_idc value: ", iB5, "NalUnitUtil");
                    }
                }
            }
            if (vf1Var.c()) {
                vf1Var.f();
            }
            if (vf1Var.c()) {
                vf1Var.d(4);
                if (vf1Var.c()) {
                    vf1Var.d(24);
                }
            }
            if (vf1Var.c()) {
                vf1Var.e();
                vf1Var.e();
            }
            vf1Var.f();
            if (vf1Var.c()) {
                iE3 *= 2;
            }
        }
        return new a(iB2, zC, iB3, i20, iArr, iB4, iE2, iE3, f10);
    }

    public static int a(int i, byte[] bArr) {
        int i10;
        synchronized (f33901c) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i) {
                while (true) {
                    if (i11 >= i - 2) {
                        i11 = i;
                        break;
                    }
                    try {
                        if (bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 3) {
                            break;
                        }
                        i11++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i11 < i) {
                    int[] iArr = f33902d;
                    if (iArr.length <= i12) {
                        f33902d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f33902d[i12] = i11;
                    i11 += 3;
                    i12++;
                }
            }
            i10 = i - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f33902d[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i17 + 2;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i10 - i13);
        }
        return i10;
    }
}
