package com.google.android.gms.internal.ads;

import j$.util.Objects;
import q2.AbstractBinderC2802A;
import q2.C2852x0;

/* loaded from: classes.dex */
public final class Gv extends AbstractBinderC2802A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PD f8478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BinderC2252zr f8479b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ev f8480c;

    public Gv(Ev ev, PD pd, BinderC2252zr binderC2252zr) {
        this.f8478a = pd;
        this.f8479b = binderC2252zr;
        this.f8480c = ev;
    }

    @Override // q2.InterfaceC2803B
    public final void V(C2852x0 c2852x0) {
        String string = c2852x0.b().toString();
        Ev ev = this.f8480c;
        String str = ev.f8027e.f23139a;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 57 + String.valueOf(str).length());
        sb.append("Failed to load interstitial ad with error: ");
        sb.append(string);
        sb.append(" for ad unit: ");
        sb.append(str);
        u2.k.h(sb.toString());
        ev.a(c2852x0);
    }

    @Override // q2.InterfaceC2803B
    public final void z() {
        Objects.requireNonNull(this.f8480c);
        this.f8478a.d(this.f8479b);
    }
}
