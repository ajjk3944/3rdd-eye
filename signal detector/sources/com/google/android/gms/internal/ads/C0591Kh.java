package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* renamed from: com.google.android.gms.internal.ads.Kh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0591Kh implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9513a;

    /* renamed from: b, reason: collision with root package name */
    public final C0540Hh f9514b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f9515c;

    public C0591Kh(C0540Hh c0540Hh, C1799rN c1799rN) {
        this.f9513a = 3;
        this.f9515c = c1799rN;
        this.f9514b = c0540Hh;
    }

    public C1014cu a() {
        C0784Vn c0784Vn = (C0784Vn) this.f9515c.c();
        this.f9514b.a();
        return new C1014cu(2, c0784Vn);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f9513a) {
            case 0:
                try {
                    return R2.b.a(this.f9514b.a()).h(0, ((ApplicationInfo) this.f9515c.c()).packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            case 1:
                return new u2.n(this.f9514b.a(), (String) this.f9515c.c());
            case 2:
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new Qr(c0623Mf, this.f9514b.a(), (C0819Xo) this.f9515c.c(), 4);
            default:
                return a();
        }
    }

    public /* synthetic */ C0591Kh(C0540Hh c0540Hh, C1799rN c1799rN, int i) {
        this.f9513a = i;
        this.f9514b = c0540Hh;
        this.f9515c = c1799rN;
    }
}
