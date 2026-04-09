package com.google.android.gms.internal.ads;

import android.content.Context;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Ko, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0598Ko implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9537a;

    /* renamed from: b, reason: collision with root package name */
    public final C0540Hh f9538b;

    /* renamed from: c, reason: collision with root package name */
    public final C0642Nh f9539c;

    public /* synthetic */ C0598Ko(C0540Hh c0540Hh, C0642Nh c0642Nh, int i) {
        this.f9537a = i;
        this.f9538b = c0540Hh;
        this.f9539c = c0642Nh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f9537a) {
            case 0:
                return new C0615Lo(this.f9538b.a(), this.f9539c.a());
            default:
                Context contextA = this.f9538b.a();
                C2951a c2951aA = this.f9539c.a();
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new C0819Xo(contextA, c2951aA, c0623Mf);
        }
    }
}
