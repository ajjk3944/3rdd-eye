package E0;

/* loaded from: classes.dex */
public abstract class Y {
    private static final void b(C2645x c2645x, InterfaceC2638p interfaceC2638p) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < c2645x.c()) {
            int i13 = i10 + 2;
            int iB = c2645x.b(i10) - c2645x.b(i13);
            int iB2 = c2645x.b(i10 + 1) - c2645x.b(i13);
            int iB3 = c2645x.b(i13);
            i10 += 3;
            while (i11 < iB) {
                interfaceC2638p.a(i12, i11);
                i11++;
            }
            while (i12 < iB2) {
                interfaceC2638p.d(i12);
                i12++;
            }
            while (true) {
                int i14 = iB3 - 1;
                if (iB3 > 0) {
                    interfaceC2638p.c(i11, i12);
                    i11++;
                    i12++;
                    iB3 = i14;
                }
            }
        }
    }

    private static final boolean c(int i10, int i11, int i12, int i13, InterfaceC2638p interfaceC2638p, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iB;
        int i15;
        int i16;
        int i17 = (i11 - i10) - (i13 - i12);
        boolean z10 = i17 % 2 == 0;
        int i18 = -i14;
        for (int i19 = i18; i19 <= i14; i19 += 2) {
            if (i19 == i18 || (i19 != i14 && AbstractC2628f.b(iArr2, i19 + 1) < AbstractC2628f.b(iArr2, i19 - 1))) {
                iB = AbstractC2628f.b(iArr2, i19 + 1);
                i15 = iB;
            } else {
                iB = AbstractC2628f.b(iArr2, i19 - 1);
                i15 = iB - 1;
            }
            int i20 = i13 - ((i11 - i15) - i19);
            int i21 = (i14 == 0 || i15 != iB) ? i20 : i20 + 1;
            while (i15 > i10 && i20 > i12) {
                if (!interfaceC2638p.b(i15 - 1, i20 - 1)) {
                    break;
                }
                i15--;
                i20--;
            }
            AbstractC2628f.d(iArr2, i19, i15);
            if (z10 && (i16 = i17 - i19) >= i18 && i16 <= i14) {
                if (AbstractC2628f.b(iArr, i16) >= i15) {
                    f(i15, i20, iB, i21, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final C2645x d(int i10, int i11, InterfaceC2638p interfaceC2638p) {
        int i12 = ((i10 + i11) + 1) / 2;
        C2645x c2645x = new C2645x(i12 * 3);
        C2645x c2645x2 = new C2645x(i12 * 4);
        c2645x2.h(0, i10, 0, i11);
        int i13 = (i12 * 2) + 1;
        int[] iArrA = AbstractC2628f.a(new int[i13]);
        int[] iArrA2 = AbstractC2628f.a(new int[i13]);
        int[] iArrB = x0.b(new int[5]);
        while (c2645x2.d()) {
            int iF = c2645x2.f();
            int iF2 = c2645x2.f();
            int iF3 = c2645x2.f();
            int iF4 = c2645x2.f();
            int[] iArr = iArrA;
            int[] iArr2 = iArrA2;
            if (h(iF4, iF3, iF2, iF, interfaceC2638p, iArrA, iArrA2, iArrB)) {
                if (x0.c(iArrB) > 0) {
                    x0.a(iArrB, c2645x);
                }
                c2645x2.h(iF4, x0.h(iArrB), iF2, x0.i(iArrB));
                c2645x2.h(x0.d(iArrB), iF3, x0.e(iArrB), iF);
            }
            iArrA = iArr;
            iArrA2 = iArr2;
        }
        c2645x.j();
        c2645x.g(i10, i11, 0);
        return c2645x;
    }

    public static final void e(int i10, int i11, InterfaceC2638p interfaceC2638p) {
        b(d(i10, i11, interfaceC2638p), interfaceC2638p);
    }

    public static final void f(int i10, int i11, int i12, int i13, boolean z10, int[] iArr) {
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        iArr[3] = i13;
        iArr[4] = z10 ? 1 : 0;
    }

    private static final boolean g(int i10, int i11, int i12, int i13, InterfaceC2638p interfaceC2638p, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iB;
        int i15;
        int i16;
        int i17 = (i11 - i10) - (i13 - i12);
        boolean z10 = Math.abs(i17) % 2 == 1;
        int i18 = -i14;
        for (int i19 = i18; i19 <= i14; i19 += 2) {
            if (i19 == i18 || (i19 != i14 && AbstractC2628f.b(iArr, i19 + 1) > AbstractC2628f.b(iArr, i19 - 1))) {
                iB = AbstractC2628f.b(iArr, i19 + 1);
                i15 = iB;
            } else {
                iB = AbstractC2628f.b(iArr, i19 - 1);
                i15 = iB + 1;
            }
            int i20 = (i12 + (i15 - i10)) - i19;
            int i21 = (i14 == 0 || i15 != iB) ? i20 : i20 - 1;
            while (i15 < i11 && i20 < i13) {
                if (!interfaceC2638p.b(i15, i20)) {
                    break;
                }
                i15++;
                i20++;
            }
            AbstractC2628f.d(iArr, i19, i15);
            if (z10 && (i16 = i17 - i19) >= i18 + 1 && i16 <= i14 - 1) {
                if (AbstractC2628f.b(iArr2, i16) <= i15) {
                    f(iB, i21, i15, i20, false, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean h(int i10, int i11, int i12, int i13, InterfaceC2638p interfaceC2638p, int[] iArr, int[] iArr2, int[] iArr3) {
        int i14 = i11 - i10;
        int i15 = i13 - i12;
        if (i14 >= 1 && i15 >= 1) {
            int i16 = ((i14 + i15) + 1) / 2;
            AbstractC2628f.d(iArr, 1, i10);
            AbstractC2628f.d(iArr2, 1, i11);
            int i17 = 0;
            while (i17 < i16) {
                int i18 = i17;
                if (g(i10, i11, i12, i13, interfaceC2638p, iArr, iArr2, i17, iArr3) || c(i10, i11, i12, i13, interfaceC2638p, iArr, iArr2, i18, iArr3)) {
                    return true;
                }
                i17 = i18 + 1;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(int[] iArr, int i10, int i11) {
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
    }
}
