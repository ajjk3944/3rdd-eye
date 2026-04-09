package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.lO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1477lO implements InterfaceC1964uQ, AP {

    /* renamed from: a, reason: collision with root package name */
    public final C1585nO f15384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G3.q f15385b;

    public C1477lO(G3.q qVar, C1585nO c1585nO) {
        this.f15385b = qVar;
        this.f15384a = c1585nO;
    }

    public final Pair a(C1749qQ c1749qQ) {
        C1749qQ c1749qQA;
        C1585nO c1585nO = this.f15384a;
        C1749qQ c1749qQ2 = null;
        if (c1749qQ != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = c1585nO.f15773c;
                if (i >= arrayList.size()) {
                    c1749qQA = null;
                    break;
                }
                if (((C1749qQ) arrayList.get(i)).f16377d == c1749qQ.f16377d) {
                    Object obj = c1749qQ.f16374a;
                    Object obj2 = c1585nO.f15772b;
                    int i3 = C2016vO.f17263k;
                    c1749qQA = c1749qQ.a(Pair.create(obj2, obj));
                    break;
                }
                i++;
            }
            if (c1749qQA == null) {
                return null;
            }
            c1749qQ2 = c1749qQA;
        }
        return Pair.create(Integer.valueOf(c1585nO.f15774d), c1749qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1964uQ
    public final void j(int i, C1749qQ c1749qQ, C1319iQ c1319iQ, C1587nQ c1587nQ) {
        Pair pairA = a(c1749qQ);
        if (pairA != null) {
            ((C1231gt) this.f15385b.f1644j).e(new RunnableC1369jO(this, pairA, c1319iQ, c1587nQ, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1964uQ
    public final void n(int i, C1749qQ c1749qQ, C1319iQ c1319iQ, C1587nQ c1587nQ, IOException iOException, boolean z6) {
        Pair pairA = a(c1749qQ);
        if (pairA != null) {
            ((C1231gt) this.f15385b.f1644j).e(new RunnableC1504ly(this, pairA, c1319iQ, c1587nQ, iOException, z6));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1964uQ
    public final void o(int i, C1749qQ c1749qQ, C1319iQ c1319iQ, C1587nQ c1587nQ) {
        Pair pairA = a(c1749qQ);
        if (pairA != null) {
            ((C1231gt) this.f15385b.f1644j).e(new RunnableC1369jO(this, pairA, c1319iQ, c1587nQ, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1964uQ
    public final void p(int i, C1749qQ c1749qQ, C1587nQ c1587nQ) {
        Pair pairA = a(c1749qQ);
        if (pairA != null) {
            ((C1231gt) this.f15385b.f1644j).e(new RunnableC0912b0(this, pairA, c1587nQ, 13));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1964uQ
    public final void s(int i, C1749qQ c1749qQ, final C1319iQ c1319iQ, final C1587nQ c1587nQ, final int i3) {
        final Pair pairA = a(c1749qQ);
        if (pairA != null) {
            ((C1231gt) this.f15385b.f1644j).e(new Runnable() { // from class: com.google.android.gms.internal.ads.kO
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairA;
                    int iIntValue = ((Integer) pair.first).intValue();
                    C1749qQ c1749qQ2 = (C1749qQ) pair.second;
                    ((GO) this.f15141a.f15385b.i).s(iIntValue, c1749qQ2, c1319iQ, c1587nQ, i3);
                }
            });
        }
    }
}
