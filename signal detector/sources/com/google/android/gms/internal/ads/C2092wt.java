package com.google.android.gms.internal.ads;

import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.wt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2092wt implements NA {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1431kf f17514b;

    public /* synthetic */ C2092wt(C1431kf c1431kf, int i) {
        this.f17513a = i;
        this.f17514b = c1431kf;
    }

    @Override // com.google.android.gms.internal.ads.NA
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f17513a) {
            case 0:
                u2.k.f("", (C1765qp) obj);
                AbstractC2907C.m("Failed to get a cache key, reverting to legacy flow.");
                C1431kf c1431kf = this.f17514b;
                C2146xt c2146xt = new C2146xt(null, c1431kf.x());
                c1431kf.f15176e = c2146xt;
                return c2146xt;
            default:
                C1807re c1807re = (C1807re) obj;
                C2146xt c2146xt2 = new C2146xt(c1807re, new C2039vu(c1807re.f16584j));
                this.f17514b.f15176e = c2146xt2;
                return c2146xt2;
        }
    }
}
