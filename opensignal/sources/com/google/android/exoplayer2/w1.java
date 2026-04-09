package com.google.android.exoplayer2;

import android.util.Pair;

/* loaded from: classes.dex */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final t1 f4774a = new t1();

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

    public final int d(int i10, u1 u1Var, v1 v1Var, int i11, boolean z10) {
        int i12 = f(i10, u1Var, false).f4596c;
        if (m(i12, v1Var, 0L).f4753p != i10) {
            return i10 + 1;
        }
        int iE = e(i12, z10, i11);
        if (iE == -1) {
            return -1;
        }
        return m(iE, v1Var, 0L).f4752o;
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
        if (this != obj) {
            if (obj instanceof w1) {
                w1 w1Var = (w1) obj;
                if (w1Var.o() == o() && w1Var.h() == h()) {
                    v1 v1Var = new v1();
                    u1 u1Var = new u1();
                    v1 v1Var2 = new v1();
                    u1 u1Var2 = new u1();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= o()) {
                            for (int i11 = 0; i11 < h(); i11++) {
                                if (f(i11, u1Var, true).equals(w1Var.f(i11, u1Var2, true))) {
                                }
                            }
                        } else {
                            if (!m(i10, v1Var, 0L).equals(w1Var.m(i10, v1Var2, 0L))) {
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

    public abstract u1 f(int i10, u1 u1Var, boolean z10);

    public u1 g(Object obj, u1 u1Var) {
        return f(b(obj), u1Var, true);
    }

    public abstract int h();

    public final int hashCode() {
        v1 v1Var = new v1();
        u1 u1Var = new u1();
        int iO = o() + 217;
        for (int i10 = 0; i10 < o(); i10++) {
            iO = (iO * 31) + m(i10, v1Var, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i11 = 0; i11 < h(); i11++) {
            iH = (iH * 31) + f(i11, u1Var, true).hashCode();
        }
        return iH;
    }

    public final Pair i(v1 v1Var, u1 u1Var, int i10, long j) {
        Pair pairJ = j(v1Var, u1Var, i10, j, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(v1 v1Var, u1 u1Var, int i10, long j, long j7) {
        qb.b.i(i10, o());
        m(i10, v1Var, j7);
        if (j == -9223372036854775807L) {
            j = v1Var.f4750m;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = v1Var.f4752o;
        f(i11, u1Var, false);
        while (i11 < v1Var.f4753p && u1Var.f4598e != j) {
            int i12 = i11 + 1;
            if (f(i12, u1Var, false).f4598e > j) {
                break;
            }
            i11 = i12;
        }
        f(i11, u1Var, true);
        long jMin = j - u1Var.f4598e;
        long j10 = u1Var.f4597d;
        if (j10 != -9223372036854775807L) {
            jMin = Math.min(jMin, j10 - 1);
        }
        long jMax = Math.max(0L, jMin);
        if (jMax == 9) {
            io.sentry.android.core.e0.d("XXX", "YYY");
        }
        Object obj = u1Var.f4595b;
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

    public abstract v1 m(int i10, v1 v1Var, long j);

    public final void n(int i10, v1 v1Var) {
        m(i10, v1Var, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
