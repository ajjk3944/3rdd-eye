package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class oz1 {
    public static final aw1 a = new aw1();

    static {
        String str = v23.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public abstract int a();

    public abstract ez1 b(int i, ez1 ez1Var, long j);

    public abstract int c();

    public abstract sw1 d(int i, sw1 sw1Var, boolean z);

    public abstract int e(Object obj);

    public final boolean equals(Object obj) {
        int iJ;
        if (this != obj) {
            if (obj instanceof oz1) {
                oz1 oz1Var = (oz1) obj;
                if (oz1Var.a() == a() && oz1Var.c() == c()) {
                    ez1 ez1Var = new ez1();
                    sw1 sw1Var = new sw1();
                    ez1 ez1Var2 = new ez1();
                    sw1 sw1Var2 = new sw1();
                    int i = 0;
                    while (true) {
                        if (i >= a()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= c()) {
                                    int iK = k(true);
                                    if (iK == oz1Var.k(true) && (iJ = j(true)) == oz1Var.j(true)) {
                                        while (iK != iJ) {
                                            int iH = h(iK, 0, true);
                                            if (iH == oz1Var.h(iK, 0, true)) {
                                                iK = iH;
                                            }
                                        }
                                    }
                                } else {
                                    if (!d(i2, sw1Var, true).equals(oz1Var.d(i2, sw1Var2, true))) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else {
                            if (!b(i, ez1Var, 0L).equals(oz1Var.b(i, ez1Var2, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract Object f(int i);

    public final boolean g() {
        return a() == 0;
    }

    public int h(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == j(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == j(z) ? k(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        int i;
        ez1 ez1Var = new ez1();
        sw1 sw1Var = new sw1();
        int iA = a() + 217;
        int i2 = 0;
        while (true) {
            i = iA * 31;
            if (i2 >= a()) {
                break;
            }
            iA = i + b(i2, ez1Var, 0L).hashCode();
            i2++;
        }
        int iC = c() + i;
        for (int i3 = 0; i3 < c(); i3++) {
            iC = (iC * 31) + d(i3, sw1Var, true).hashCode();
        }
        int iK = k(true);
        while (iK != -1) {
            iC = (iC * 31) + iK;
            iK = h(iK, 0, true);
        }
        return iC;
    }

    public int i(int i) {
        if (i == k(false)) {
            return -1;
        }
        return i - 1;
    }

    public int j(boolean z) {
        if (g()) {
            return -1;
        }
        return a() - 1;
    }

    public int k(boolean z) {
        return g() ? -1 : 0;
    }

    public final int l(int i, sw1 sw1Var, ez1 ez1Var, int i2, boolean z) {
        int i3 = d(i, sw1Var, false).c;
        if (b(i3, ez1Var, 0L).l != i) {
            return i + 1;
        }
        int iH = h(i3, i2, z);
        if (iH == -1) {
            return -1;
        }
        return b(iH, ez1Var, 0L).k;
    }

    public final Pair m(ez1 ez1Var, sw1 sw1Var, int i, long j) {
        Pair pairN = n(ez1Var, sw1Var, i, j, 0L);
        pairN.getClass();
        return pairN;
    }

    public final Pair n(ez1 ez1Var, sw1 sw1Var, int i, long j, long j2) {
        zt0.e0(i, a());
        b(i, ez1Var, j2);
        if (j == -9223372036854775807L) {
            ez1Var.getClass();
            j = 0;
        }
        int i2 = ez1Var.k;
        d(i2, sw1Var, false);
        while (i2 < ez1Var.l) {
            sw1Var.getClass();
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            d(i3, sw1Var, false).getClass();
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        d(i2, sw1Var, true);
        sw1Var.getClass();
        long j3 = sw1Var.d;
        if (j3 != -9223372036854775807L) {
            j = Math.min(j, j3 - 1);
        }
        long jMax = Math.max(0L, j);
        Object obj = sw1Var.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public sw1 o(Object obj, sw1 sw1Var) {
        return d(e(obj), sw1Var, true);
    }
}
