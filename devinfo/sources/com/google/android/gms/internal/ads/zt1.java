package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zt1 implements oy1, sw1 {

    /* renamed from: a, reason: collision with root package name */
    public final bu1 f19180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wj0 f19181b;

    public zt1(wj0 wj0Var, bu1 bu1Var) {
        this.f19181b = wj0Var;
        this.f19180a = bu1Var;
    }

    public final Pair a(jy1 jy1Var) {
        jy1 jy1VarA;
        bu1 bu1Var = this.f19180a;
        jy1 jy1Var2 = null;
        if (jy1Var != null) {
            int i4 = 0;
            while (true) {
                ArrayList arrayList = bu1Var.f9808c;
                if (i4 >= arrayList.size()) {
                    jy1VarA = null;
                    break;
                }
                if (((jy1) arrayList.get(i4)).f12878d == jy1Var.f12878d) {
                    Object obj = jy1Var.f12875a;
                    Object obj2 = bu1Var.f9807b;
                    int i10 = ju1.f12837k;
                    jy1VarA = jy1Var.a(Pair.create(obj2, obj));
                    break;
                }
                i4++;
            }
            if (jy1VarA == null) {
                return null;
            }
            jy1Var2 = jy1VarA;
        }
        return Pair.create(Integer.valueOf(bu1Var.f9809d), jy1Var2);
    }

    @Override // com.google.android.gms.internal.ads.oy1
    public final void g(int i4, jy1 jy1Var, final cy1 cy1Var, final a0.c0 c0Var, final int i10) {
        final Pair pairA = a(jy1Var);
        if (pairA != null) {
            ((no0) this.f19181b.j).e(new Runnable() { // from class: com.google.android.gms.internal.ads.yt1
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairA;
                    int iIntValue = ((Integer) pair.first).intValue();
                    jy1 jy1Var2 = (jy1) pair.second;
                    ((wu1) this.f18861a.f19181b.f18038i).g(iIntValue, jy1Var2, cy1Var, c0Var, i10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.oy1
    public final void h(int i4, jy1 jy1Var, cy1 cy1Var, a0.c0 c0Var) {
        Pair pairA = a(jy1Var);
        if (pairA != null) {
            ((no0) this.f19181b.j).e(new xt1(this, pairA, cy1Var, c0Var, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.oy1
    public final void i(int i4, jy1 jy1Var, cy1 cy1Var, a0.c0 c0Var, IOException iOException, boolean z3) {
        Pair pairA = a(jy1Var);
        if (pairA != null) {
            ((no0) this.f19181b.j).e(new ay0(this, pairA, cy1Var, c0Var, iOException, z3));
        }
    }

    @Override // com.google.android.gms.internal.ads.oy1
    public final void j(int i4, jy1 jy1Var, cy1 cy1Var, a0.c0 c0Var) {
        Pair pairA = a(jy1Var);
        if (pairA != null) {
            ((no0) this.f19181b.j).e(new xt1(this, pairA, cy1Var, c0Var, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.oy1
    public final void k(int i4, jy1 jy1Var, a0.c0 c0Var) {
        Pair pairA = a(jy1Var);
        if (pairA != null) {
            ((no0) this.f19181b.j).e(new d1(this, pairA, c0Var, 13));
        }
    }
}
