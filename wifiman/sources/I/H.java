package I;

import sh.AbstractC7978m;

/* loaded from: classes.dex */
public abstract class H {
    public static final void a(I i10, String str, int i11) {
        if (i10.p()) {
            i10.q(i10.i(), i10.h(), str);
        } else {
            i10.q(i10.o(), i10.n(), str);
        }
        i10.s(AbstractC7978m.k(i11 > 0 ? (r0 + i11) - 1 : (i10.j() + i11) - str.length(), 0, i10.l()));
    }

    public static final void b(I i10) {
        i10.q(0, i10.l(), "");
    }

    public static final void c(I i10, int i11, int i12) {
        if (i11 < 0 || i12 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i11 + " and " + i12 + " respectively.").toString());
        }
        int iN = i10.n();
        int iL = iN + i12;
        if (((i12 ^ iL) & (iN ^ iL)) < 0) {
            iL = i10.l();
        }
        i10.d(i10.n(), Math.min(iL, i10.l()));
        int iO = i10.o();
        int i13 = iO - i11;
        if (((i11 ^ iO) & (iO ^ i13)) < 0) {
            i13 = 0;
        }
        i10.d(Math.max(0, i13), i10.o());
    }

    public static final void d(I i10, int i11, int i12) {
        if (i11 < 0 || i12 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i11 + " and " + i12 + " respectively.").toString());
        }
        int i13 = 0;
        int i14 = 0;
        int iO = 0;
        while (true) {
            if (i14 < i11) {
                int i15 = iO + 1;
                if (i10.o() <= i15) {
                    iO = i10.o();
                    break;
                } else {
                    iO = f(i10.e((i10.o() - i15) + (-1)), i10.e(i10.o() - i15)) ? iO + 2 : i15;
                    i14++;
                }
            } else {
                break;
            }
        }
        int iL = 0;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            int i16 = iL + 1;
            if (i10.n() + i16 >= i10.l()) {
                iL = i10.l() - i10.n();
                break;
            } else {
                iL = f(i10.e((i10.n() + i16) + (-1)), i10.e(i10.n() + i16)) ? iL + 2 : i16;
                i13++;
            }
        }
        i10.d(i10.n(), i10.n() + iL);
        i10.d(i10.o() - iO, i10.o());
    }

    public static final void e(I i10) {
        i10.c();
    }

    private static final boolean f(char c10, char c11) {
        return Character.isHighSurrogate(c10) && Character.isLowSurrogate(c11);
    }

    public static final void g(I i10, int i11, int i12) {
        if (i10.p()) {
            i10.c();
        }
        int iK = AbstractC7978m.k(i11, 0, i10.l());
        int iK2 = AbstractC7978m.k(i12, 0, i10.l());
        if (iK != iK2) {
            if (iK < iK2) {
                i10.r(iK, iK2);
            } else {
                i10.r(iK2, iK);
            }
        }
    }

    public static final void h(I i10, String str, int i11) {
        if (i10.p()) {
            int i12 = i10.i();
            i10.q(i12, i10.h(), str);
            if (str.length() > 0) {
                i10.r(i12, str.length() + i12);
            }
        } else {
            int iO = i10.o();
            i10.q(iO, i10.n(), str);
            if (str.length() > 0) {
                i10.r(iO, str.length() + iO);
            }
        }
        i10.s(AbstractC7978m.k(i11 > 0 ? (r0 + i11) - 1 : (i10.j() + i11) - str.length(), 0, i10.l()));
    }
}
