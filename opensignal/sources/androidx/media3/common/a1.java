package androidx.media3.common;

import android.util.Pair;

/* loaded from: classes.dex */
public abstract class a1 implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final x0 f1564a = new x0();

    static {
        int i10 = a5.d0.f105a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public int a(boolean z10) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i10, y0 y0Var, z0 z0Var, int i11, boolean z10) {
        int i12 = f(i10, y0Var, false).f1829g;
        if (m(i12, z0Var, 0L).L != i10) {
            return i10 + 1;
        }
        int iE = e(i12, z10, i11);
        if (iE == -1) {
            return -1;
        }
        return m(iE, z0Var, 0L).K;
    }

    public int e(int i10, boolean z10, int i11) {
        if (i11 == 0) {
            if (i10 == c(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == c(z10) ? a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof a1) {
                a1 a1Var = (a1) obj;
                if (a1Var.o() == o() && a1Var.h() == h()) {
                    z0 z0Var = new z0();
                    y0 y0Var = new y0();
                    z0 z0Var2 = new z0();
                    y0 y0Var2 = new y0();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= o()) {
                            int i11 = 0;
                            while (true) {
                                if (i11 >= h()) {
                                    int iA = a(true);
                                    if (iA == a1Var.a(true) && (iC = c(true)) == a1Var.c(true)) {
                                        while (iA != iC) {
                                            int iE = e(iA, true, 0);
                                            if (iE == a1Var.e(iA, true, 0)) {
                                                iA = iE;
                                            }
                                        }
                                    }
                                } else {
                                    if (!f(i11, y0Var, true).equals(a1Var.f(i11, y0Var2, true))) {
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        } else {
                            if (!m(i10, z0Var, 0L).equals(a1Var.m(i10, z0Var2, 0L))) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract y0 f(int i10, y0 y0Var, boolean z10);

    public y0 g(Object obj, y0 y0Var) {
        return f(b(obj), y0Var, true);
    }

    public abstract int h();

    public final int hashCode() {
        z0 z0Var = new z0();
        y0 y0Var = new y0();
        int iO = o() + 217;
        for (int i10 = 0; i10 < o(); i10++) {
            iO = (iO * 31) + m(i10, z0Var, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i11 = 0; i11 < h(); i11++) {
            iH = (iH * 31) + f(i11, y0Var, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, true, 0);
        }
        return iH;
    }

    public final Pair i(z0 z0Var, y0 y0Var, int i10, long j) {
        Pair pairJ = j(z0Var, y0Var, i10, j, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(z0 z0Var, y0 y0Var, int i10, long j, long j7) {
        a5.a.g(i10, o());
        m(i10, z0Var, j7);
        if (j == -9223372036854775807L) {
            j = z0Var.I;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = z0Var.K;
        f(i11, y0Var, false);
        while (i11 < z0Var.L && y0Var.f1831x != j) {
            int i12 = i11 + 1;
            if (f(i12, y0Var, false).f1831x > j) {
                break;
            }
            i11 = i12;
        }
        f(i11, y0Var, true);
        long jMin = j - y0Var.f1831x;
        long j10 = y0Var.f1830r;
        if (j10 != -9223372036854775807L) {
            jMin = Math.min(jMin, j10 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = y0Var.f1828d;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i10, boolean z10, int i11) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? c(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i10);

    public abstract z0 m(int i10, z0 z0Var, long j);

    public final void n(int i10, z0 z0Var) {
        m(i10, z0Var, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
