package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import q2.C2841s;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.Ui, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0762Ui extends AbstractC1812rj {

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0828Yg f11758l;

    /* renamed from: m, reason: collision with root package name */
    public final int f11759m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f11760n;

    /* renamed from: o, reason: collision with root package name */
    public final C0697Ql f11761o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC0595Kl f11762p;

    /* renamed from: q, reason: collision with root package name */
    public final Lu f11763q;

    /* renamed from: r, reason: collision with root package name */
    public final C1760qk f11764r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f11765s;

    /* renamed from: t, reason: collision with root package name */
    public final C0572Jf f11766t;

    /* renamed from: u, reason: collision with root package name */
    public final C0784Vn f11767u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f11768v;

    public C0762Ui(K4.j jVar, Context context, InterfaceC0828Yg interfaceC0828Yg, int i, C0697Ql c0697Ql, InterfaceC0595Kl interfaceC0595Kl, Lu lu, C1760qk c1760qk, C0572Jf c0572Jf, C0784Vn c0784Vn) {
        super(jVar);
        this.f11768v = false;
        this.f11758l = interfaceC0828Yg;
        this.f11760n = context;
        this.f11759m = i;
        this.f11761o = c0697Ql;
        this.f11762p = interfaceC0595Kl;
        this.f11763q = lu;
        this.f11764r = c1760qk;
        this.f11765s = ((Boolean) C2841s.f23267e.f23270c.a(H9.l6)).booleanValue();
        this.f11766t = c0572Jf;
        this.f11767u = c0784Vn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v14, types: [android.content.Context] */
    public final void c(Activity activity, boolean z6) {
        InterfaceC0828Yg interfaceC0828Yg;
        Qt qtJ;
        int iD;
        Lu lu = this.f11763q;
        C1760qk c1760qk = this.f11764r;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f11760n;
        }
        boolean z7 = this.f11765s;
        if (z7) {
            lu.C1(C1437kl.f15256e);
        }
        p2.j jVar = p2.j.f22785C;
        C2911G c2911g = jVar.f22790c;
        InterfaceC0595Kl interfaceC0595Kl = this.f11762p;
        if (!C2911G.n(interfaceC0595Kl.c())) {
            E9 e9 = H9.Pe;
            C2841s c2841s = C2841s.f23267e;
            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                C2911G.m(activity2, this.f16601b, this.f11767u);
            }
            if (((Boolean) c2841s.f23270c.a(H9.f8704Z0)).booleanValue() && C2911G.h(activity2)) {
                u2.k.h("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                c1760qk.b();
                if (((Boolean) c2841s.f23270c.a(H9.f8709a1)).booleanValue()) {
                    new Gw(activity2.getApplicationContext(), jVar.f22806t.a()).a(((St) this.f16600a.f12510b.f15174c).f11269b);
                    return;
                }
                return;
            }
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.ed)).booleanValue() && (interfaceC0828Yg = this.f11758l) != null && (qtJ = interfaceC0828Yg.J()) != null && qtJ.f10790r0) {
            int i = qtJ.f10792s0;
            C0572Jf c0572Jf = this.f11766t;
            synchronized (c0572Jf.f9319a) {
                iD = c0572Jf.f9322d.d();
            }
            if (i != iD) {
                u2.k.h("The app open consent form has been shown.");
                c1760qk.V(AbstractC1984ut.A(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f11768v) {
            u2.k.h("App open interstitial ad is already visible.");
            c1760qk.V(AbstractC1984ut.A(10, null, null));
        }
        if (this.f11768v) {
            return;
        }
        try {
            interfaceC0595Kl.p(z6, activity2, c1760qk);
            if (z7) {
                lu.H1();
            }
            this.f11768v = true;
        } catch (C0578Jl e6) {
            c1760qk.W(e6);
        }
    }

    public final void d() {
        C2137xk c2137xk = this.f16602c;
        c2137xk.getClass();
        c2137xk.C1(new C9(null, false));
        InterfaceC0828Yg interfaceC0828Yg = this.f11758l;
        if (interfaceC0828Yg != null) {
            interfaceC0828Yg.destroy();
        }
    }

    public final void e(int i, long j6) {
        C0697Ql c0697Ql = this.f11761o;
        C0697Ql c0697QlA = ((C0784Vn) c0697Ql.f10691b).a();
        c0697QlA.r("gqi", ((St) ((Xt) c0697Ql.f10692c).f12510b.f15174c).f11269b);
        c0697QlA.r("action", "ad_closed");
        c0697QlA.r("show_time", String.valueOf(j6));
        c0697QlA.r("ad_format", "app_open_ad");
        int i3 = i - 1;
        c0697QlA.r("acr", i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        c0697QlA.s();
    }
}
