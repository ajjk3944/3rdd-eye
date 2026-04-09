package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public final class FQ implements MQ {

    /* renamed from: a, reason: collision with root package name */
    public final int f8125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HQ f8126b;

    public FQ(HQ hq, int i) {
        this.f8126b = hq;
        this.f8125a = i;
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final int a(C1879sw c1879sw, FM fm, int i) {
        int i3;
        boolean z6;
        int i6;
        HQ hq = this.f8126b;
        int i7 = this.f8125a;
        if (hq.q()) {
            return -3;
        }
        hq.n(i7);
        LQ lq = hq.f8927G[i7];
        boolean z7 = hq.f8947a0;
        lq.getClass();
        boolean z8 = (i & 2) != 0;
        T2 t22 = lq.f9703b;
        synchronized (lq) {
            try {
                fm.f8094f = false;
                int i8 = lq.f9718r;
                i3 = -4;
                if (i8 != lq.f9715o) {
                    TP tp = ((KQ) lq.f9704c.g(lq.f9716p + i8)).f9486a;
                    if (!z8 && tp == lq.f9707f) {
                        int iK = lq.k(lq.f9718r);
                        if (lq.f9708g != null) {
                            int i9 = lq.f9712l[iK];
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (z6) {
                            int i10 = lq.f9712l[iK];
                            fm.f1097b = i10;
                            if (lq.f9718r == lq.f9715o - 1 && (z7 || lq.f9722v)) {
                                fm.f1097b = 536870912 | i10;
                            }
                            fm.f8095g = lq.f9713m[iK];
                            t22.f11325b = lq.f9711k[iK];
                            t22.f11326c = lq.f9710j[iK];
                            t22.f11327d = lq.f9714n[iK];
                            i6 = -4;
                        } else {
                            fm.f8094f = true;
                            i6 = -3;
                        }
                    }
                    lq.h(tp, c1879sw);
                    i6 = -5;
                } else {
                    if (!z7 && !lq.f9722v) {
                        TP tp2 = lq.f9725y;
                        if (tp2 == null || (!z8 && tp2 == lq.f9707f)) {
                            i6 = -3;
                        }
                        lq.h(tp2, c1879sw);
                        i6 = -5;
                    }
                    fm.f1097b = 4;
                    fm.f8095g = Long.MIN_VALUE;
                    i6 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i6 != -4) {
            i3 = i6;
        } else if (!fm.n(4)) {
            int i11 = i & 1;
            if ((i & 4) == 0) {
                if (i11 != 0) {
                    R0.d dVar = lq.f9702a;
                    R0.d.e((C1187g2) dVar.f3383e, fm, t22, (C2036vr) dVar.f3381c);
                } else {
                    R0.d dVar2 = lq.f9702a;
                    dVar2.f3383e = R0.d.e((C1187g2) dVar2.f3383e, fm, t22, (C2036vr) dVar2.f3381c);
                    lq.f9718r++;
                }
            } else if (i11 == 0) {
                lq.f9718r++;
            }
        }
        if (i3 == -3) {
            hq.p(i7);
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final boolean c() {
        HQ hq = this.f8126b;
        return !hq.q() && hq.f8927G[this.f8125a].o(hq.f8947a0);
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final void f() throws IOException {
        IOException iOException;
        int i = this.f8125a;
        HQ hq = this.f8126b;
        C2255zu c2255zu = hq.f8927G[i].f9708g;
        if (c2255zu != null) {
            throw ((C2125xP) c2255zu.f17990b);
        }
        int i3 = hq.f8936Q == 7 ? 6 : 3;
        C1338iu c1338iu = hq.f8955j;
        IOException iOException2 = (IOException) c1338iu.f14824d;
        if (iOException2 != null) {
            throw iOException2;
        }
        r rVar = (r) c1338iu.f14823c;
        if (rVar != null && (iOException = rVar.f16436c) != null && rVar.f16437d > i3) {
            throw iOException;
        }
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final int g(long j6) {
        int i;
        HQ hq = this.f8126b;
        int i3 = this.f8125a;
        if (hq.q()) {
            return 0;
        }
        hq.n(i3);
        LQ lq = hq.f8927G[i3];
        boolean z6 = hq.f8947a0;
        synchronized (lq) {
            int i6 = lq.f9718r;
            int iK = lq.k(i6);
            int i7 = lq.f9718r;
            int i8 = lq.f9715o;
            if ((i7 != i8) && j6 >= lq.f9713m[iK]) {
                if (j6 <= lq.f9721u || !z6) {
                    i = lq.i(iK, i8 - i6, j6, true);
                    if (i == -1) {
                    }
                } else {
                    i = i8 - i6;
                }
            }
            i = 0;
        }
        lq.q(i);
        if (i != 0) {
            return i;
        }
        hq.p(i3);
        return 0;
    }
}
