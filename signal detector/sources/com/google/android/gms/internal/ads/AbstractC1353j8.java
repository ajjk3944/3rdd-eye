package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.j8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1353j8 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1730q7 f14909a = new C1730q7();

    static {
        String str = Vt.f12096a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public abstract int a();

    public abstract U7 b(int i, U7 u7, long j6);

    public abstract int c();

    public abstract I7 d(int i, I7 i7, boolean z6);

    public abstract int e(Object obj);

    public final boolean equals(Object obj) {
        int iJ;
        if (this != obj) {
            if (obj instanceof AbstractC1353j8) {
                AbstractC1353j8 abstractC1353j8 = (AbstractC1353j8) obj;
                if (abstractC1353j8.a() == a() && abstractC1353j8.c() == c()) {
                    U7 u7 = new U7();
                    I7 i7 = new I7();
                    U7 u72 = new U7();
                    I7 i72 = new I7();
                    int i = 0;
                    while (true) {
                        if (i >= a()) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= c()) {
                                    int iK = k(true);
                                    if (iK == abstractC1353j8.k(true) && (iJ = j(true)) == abstractC1353j8.j(true)) {
                                        while (iK != iJ) {
                                            int iH = h(iK, 0, true);
                                            if (iH == abstractC1353j8.h(iK, 0, true)) {
                                                iK = iH;
                                            }
                                        }
                                    }
                                } else {
                                    if (!d(i3, i7, true).equals(abstractC1353j8.d(i3, i72, true))) {
                                        break;
                                    }
                                    i3++;
                                }
                            }
                        } else {
                            if (!b(i, u7, 0L).equals(abstractC1353j8.b(i, u72, 0L))) {
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

    public int h(int i, int i3, boolean z6) {
        if (i3 == 0) {
            if (i == j(z6)) {
                return -1;
            }
            return i + 1;
        }
        if (i3 == 1) {
            return i;
        }
        if (i3 == 2) {
            return i == j(z6) ? k(z6) : i + 1;
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        int i;
        U7 u7 = new U7();
        I7 i7 = new I7();
        int iA = a() + 217;
        int i3 = 0;
        while (true) {
            i = iA * 31;
            if (i3 >= a()) {
                break;
            }
            iA = i + b(i3, u7, 0L).hashCode();
            i3++;
        }
        int iC = c() + i;
        for (int i6 = 0; i6 < c(); i6++) {
            iC = (iC * 31) + d(i6, i7, true).hashCode();
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

    public int j(boolean z6) {
        if (g()) {
            return -1;
        }
        return a() - 1;
    }

    public int k(boolean z6) {
        return g() ? -1 : 0;
    }

    public final int l(int i, I7 i7, U7 u7, int i3, boolean z6) {
        int i6 = d(i, i7, false).f9072c;
        if (b(i6, u7, 0L).f11613l != i) {
            return i + 1;
        }
        int iH = h(i6, i3, z6);
        if (iH == -1) {
            return -1;
        }
        return b(iH, u7, 0L).f11612k;
    }

    public final Pair m(U7 u7, I7 i7, int i, long j6) {
        Pair pairN = n(u7, i7, i, j6, 0L);
        pairN.getClass();
        return pairN;
    }

    public final Pair n(U7 u7, I7 i7, int i, long j6, long j7) {
        AbstractC0582Jp.k0(i, a());
        b(i, u7, j7);
        if (j6 == -9223372036854775807L) {
            u7.getClass();
            j6 = 0;
        }
        int i3 = u7.f11612k;
        d(i3, i7, false);
        while (i3 < u7.f11613l) {
            i7.getClass();
            if (j6 == 0) {
                break;
            }
            int i6 = i3 + 1;
            d(i6, i7, false).getClass();
            if (j6 < 0) {
                break;
            }
            i3 = i6;
        }
        d(i3, i7, true);
        i7.getClass();
        long j8 = i7.f9073d;
        if (j8 != -9223372036854775807L) {
            j6 = Math.min(j6, j8 - 1);
        }
        long jMax = Math.max(0L, j6);
        Object obj = i7.f9071b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public I7 o(Object obj, I7 i7) {
        return d(e(obj), i7, true);
    }
}
