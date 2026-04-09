package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* renamed from: com.google.android.gms.internal.ads.Gh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0523Gh implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8417a;

    /* renamed from: b, reason: collision with root package name */
    public final C0540Hh f8418b;

    public /* synthetic */ C0523Gh(C0540Hh c0540Hh, int i) {
        this.f8417a = i;
        this.f8418b = c0540Hh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f8417a) {
            case 0:
                ApplicationInfo applicationInfo = this.f8418b.a().getApplicationInfo();
                Cr.v(applicationInfo);
                return applicationInfo;
            case 1:
                return new Gw(this.f8418b.a(), p2.j.f22785C.f22806t.a());
            case 2:
                return C1338iu.o(this.f8418b.a());
            case 3:
                return new C2249zo(this.f8418b.a());
            case 4:
                return new C0768Uo(this.f8418b.a());
            case 5:
                return new C0785Vo(this.f8418b.a());
            case 6:
                Context contextA = this.f8418b.a();
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new C0633Mp(contextA, c0623Mf);
            case 7:
                C0623Mf c0623Mf2 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf2);
                return new Wr(c0623Mf2, this.f8418b.a(), 2);
            case 8:
                Context contextA2 = this.f8418b.a();
                C0623Mf c0623Mf3 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf3);
                return new Wr(contextA2, c0623Mf3, 7);
            default:
                return new Ys(this.f8418b.a());
        }
    }
}
