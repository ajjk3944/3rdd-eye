package com.google.android.gms.internal.ads;

import j$.util.Objects;
import q2.C2852x0;

/* loaded from: classes.dex */
public final class Pv extends AbstractBinderC0707Re {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PD f10537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Nt f10538b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ev f10539c;

    public Pv(Ev ev, PD pd, Nt nt) {
        this.f10537a = pd;
        this.f10538b = nt;
        this.f10539c = ev;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0724Se
    public final void a(C2852x0 c2852x0) {
        String string = c2852x0.b().toString();
        Ev ev = this.f10539c;
        String str = ev.f8027e.f23139a;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 51 + String.valueOf(str).length());
        sb.append("Failed to load rewarded ad with error: ");
        sb.append(string);
        sb.append(", adUnitId: ");
        sb.append(str);
        u2.k.h(sb.toString());
        ev.a(c2852x0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0724Se
    public final void b() {
        Objects.requireNonNull(this.f10539c);
        this.f10537a.d(this.f10538b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0724Se
    public final void t(int i) {
    }
}
