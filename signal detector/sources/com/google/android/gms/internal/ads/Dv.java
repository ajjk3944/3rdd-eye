package com.google.android.gms.internal.ads;

import j$.util.Objects;
import q2.C2852x0;

/* loaded from: classes.dex */
public final class Dv extends AbstractBinderC1301i8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PD f7850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2.U0 f7851b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ev f7852c;

    public Dv(Ev ev, PD pd, q2.U0 u02) {
        this.f7850a = pd;
        this.f7851b = u02;
        this.f7852c = ev;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1407k8
    public final void E(int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1407k8
    public final void c2(InterfaceC1193g8 interfaceC1193g8) {
        Objects.requireNonNull(this.f7852c);
        this.f7850a.d(interfaceC1193g8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1407k8
    public final void j0(C2852x0 c2852x0) {
        String string = c2852x0.b().toString();
        String str = this.f7851b.f23139a;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 60 + String.valueOf(str).length());
        sb.append("Failed to load app open ad with error parcel: ");
        sb.append(string);
        sb.append(" for ad unit: ");
        sb.append(str);
        u2.k.h(sb.toString());
        Ev ev = this.f7852c;
        Objects.requireNonNull(ev);
        ev.a(c2852x0);
    }
}
