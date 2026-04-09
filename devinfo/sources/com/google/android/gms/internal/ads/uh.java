package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class uh {

    /* renamed from: a, reason: collision with root package name */
    public static final ag f17203a = new ag();

    static {
        String str = bq0.f9768a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public abstract int a();

    public abstract fh b(int i4, fh fhVar, long j);

    public abstract int c();

    public abstract tg d(int i4, tg tgVar, boolean z3);

    public abstract int e(Object obj);

    public final boolean equals(Object obj) {
        int iJ;
        if (this != obj) {
            if (obj instanceof uh) {
                uh uhVar = (uh) obj;
                if (uhVar.a() == a() && uhVar.c() == c()) {
                    fh fhVar = new fh();
                    tg tgVar = new tg();
                    fh fhVar2 = new fh();
                    tg tgVar2 = new tg();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= a()) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= c()) {
                                    int iK = k(true);
                                    if (iK == uhVar.k(true) && (iJ = j(true)) == uhVar.j(true)) {
                                        while (iK != iJ) {
                                            int iH = h(iK, 0, true);
                                            if (iH == uhVar.h(iK, 0, true)) {
                                                iK = iH;
                                            }
                                        }
                                    }
                                } else {
                                    if (!d(i10, tgVar, true).equals(uhVar.d(i10, tgVar2, true))) {
                                        break;
                                    }
                                    i10++;
                                }
                            }
                        } else {
                            if (!b(i4, fhVar, 0L).equals(uhVar.b(i4, fhVar2, 0L))) {
                                break;
                            }
                            i4++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract Object f(int i4);

    public final boolean g() {
        return a() == 0;
    }

    public int h(int i4, int i10, boolean z3) {
        if (i10 == 0) {
            if (i4 == j(z3)) {
                return -1;
            }
            return i4 + 1;
        }
        if (i10 == 1) {
            return i4;
        }
        if (i10 == 2) {
            return i4 == j(z3) ? k(z3) : i4 + 1;
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        int i4;
        fh fhVar = new fh();
        tg tgVar = new tg();
        int iA = a() + 217;
        int i10 = 0;
        while (true) {
            i4 = iA * 31;
            if (i10 >= a()) {
                break;
            }
            iA = i4 + b(i10, fhVar, 0L).hashCode();
            i10++;
        }
        int iC = c() + i4;
        for (int i11 = 0; i11 < c(); i11++) {
            iC = (iC * 31) + d(i11, tgVar, true).hashCode();
        }
        int iK = k(true);
        while (iK != -1) {
            iC = (iC * 31) + iK;
            iK = h(iK, 0, true);
        }
        return iC;
    }

    public int i(int i4) {
        if (i4 == k(false)) {
            return -1;
        }
        return i4 - 1;
    }

    public int j(boolean z3) {
        if (g()) {
            return -1;
        }
        return a() - 1;
    }

    public int k(boolean z3) {
        return g() ? -1 : 0;
    }

    public final int l(int i4, tg tgVar, fh fhVar, int i10, boolean z3) {
        int i11 = d(i4, tgVar, false).f16811c;
        if (b(i11, fhVar, 0L).f11173l != i4) {
            return i4 + 1;
        }
        int iH = h(i11, i10, z3);
        if (iH == -1) {
            return -1;
        }
        return b(iH, fhVar, 0L).f11172k;
    }

    public final Pair m(fh fhVar, tg tgVar, int i4, long j) {
        Pair pairN = n(fhVar, tgVar, i4, j, 0L);
        pairN.getClass();
        return pairN;
    }

    public final Pair n(fh fhVar, tg tgVar, int i4, long j, long j8) {
        mq0.f0(i4, a());
        b(i4, fhVar, j8);
        if (j == -9223372036854775807L) {
            fhVar.getClass();
            j = 0;
        }
        int i10 = fhVar.f11172k;
        d(i10, tgVar, false);
        while (i10 < fhVar.f11173l) {
            tgVar.getClass();
            if (j == 0) {
                break;
            }
            int i11 = i10 + 1;
            d(i11, tgVar, false).getClass();
            if (j < 0) {
                break;
            }
            i10 = i11;
        }
        d(i10, tgVar, true);
        tgVar.getClass();
        long j9 = tgVar.f16812d;
        if (j9 != -9223372036854775807L) {
            j = Math.min(j, j9 - 1);
        }
        long jMax = Math.max(0L, j);
        Object obj = tgVar.f16810b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public tg o(Object obj, tg tgVar) {
        return d(e(obj), tgVar, true);
    }
}
