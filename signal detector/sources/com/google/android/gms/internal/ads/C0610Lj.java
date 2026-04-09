package com.google.android.gms.internal.ads;

import android.content.Context;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Lj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0610Lj implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9737a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final C0540Hh f9738b;

    /* renamed from: c, reason: collision with root package name */
    public final C0642Nh f9739c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2069wN f9740d;

    public C0610Lj(C0540Hh c0540Hh, C0642Nh c0642Nh, C1799rN c1799rN) {
        this.f9738b = c0540Hh;
        this.f9739c = c0642Nh;
        this.f9740d = c1799rN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f9737a) {
            case 0:
                Context contextA = this.f9738b.a();
                Yu yu = (Yu) this.f9740d.c();
                C2951a c2951aA = this.f9739c.a();
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new C0593Kj(contextA, yu, c2951aA, c0623Mf);
            default:
                C0416Ac c0416AcM = new C1431kf(6).m(this.f9738b.a(), this.f9739c.a(), (Yu) this.f9740d.c());
                Cr.v(c0416AcM);
                return c0416AcM;
        }
    }

    public C0610Lj(C0540Hh c0540Hh, C1799rN c1799rN, C0642Nh c0642Nh) {
        this.f9738b = c0540Hh;
        this.f9740d = c1799rN;
        this.f9739c = c0642Nh;
    }
}
