package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.cj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1003cj implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13662a;

    /* renamed from: b, reason: collision with root package name */
    public final C1431kf f13663b;

    public /* synthetic */ C1003cj(C1431kf c1431kf, int i) {
        this.f13662a = i;
        this.f13663b = c1431kf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f13662a) {
            case 0:
                View view = (View) this.f13663b.f15174c;
                Cr.v(view);
                return view;
            case 1:
                Rt rt = (Rt) this.f13663b.f15175d;
                Cr.v(rt);
                return rt;
            case 2:
                return (InterfaceC1759qj) this.f13663b.f15173b;
            default:
                return (InterfaceC0828Yg) this.f13663b.f15176e;
        }
    }
}
