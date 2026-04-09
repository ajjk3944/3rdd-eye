package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import q2.C2841s;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.sn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1870sn extends AbstractC1812rj {

    /* renamed from: l, reason: collision with root package name */
    public final Context f16783l;

    /* renamed from: m, reason: collision with root package name */
    public final WeakReference f16784m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0595Kl f16785n;

    /* renamed from: o, reason: collision with root package name */
    public final Lu f16786o;

    /* renamed from: p, reason: collision with root package name */
    public final C1760qk f16787p;

    /* renamed from: q, reason: collision with root package name */
    public final C0492Ek f16788q;

    /* renamed from: r, reason: collision with root package name */
    public final C0423Aj f16789r;

    /* renamed from: s, reason: collision with root package name */
    public final BinderC0826Ye f16790s;

    /* renamed from: t, reason: collision with root package name */
    public final Gw f16791t;

    /* renamed from: u, reason: collision with root package name */
    public final Zt f16792u;

    /* renamed from: v, reason: collision with root package name */
    public final C0784Vn f16793v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f16794w;

    public C1870sn(K4.j jVar, Context context, InterfaceC0828Yg interfaceC0828Yg, InterfaceC0595Kl interfaceC0595Kl, Lu lu, C1760qk c1760qk, C0492Ek c0492Ek, C0423Aj c0423Aj, Qt qt, Gw gw, Zt zt, C0784Vn c0784Vn) {
        super(jVar);
        this.f16794w = false;
        this.f16783l = context;
        this.f16785n = interfaceC0595Kl;
        this.f16784m = new WeakReference(interfaceC0828Yg);
        this.f16786o = lu;
        this.f16787p = c1760qk;
        this.f16788q = c0492Ek;
        this.f16789r = c0423Aj;
        this.f16791t = gw;
        C0520Ge c0520Ge = qt.f10777l;
        this.f16790s = new BinderC0826Ye(c0520Ge != null ? c0520Ge.f8406a : "", c0520Ge != null ? c0520Ge.f8407b : 1);
        this.f16792u = zt;
        this.f16793v = c0784Vn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Activity activity, boolean z6) {
        C2911G c2911g = p2.j.f22785C.f22790c;
        InterfaceC0595Kl interfaceC0595Kl = this.f16785n;
        boolean zN = C2911G.n(interfaceC0595Kl.c());
        Context context = this.f16783l;
        C1760qk c1760qk = this.f16787p;
        if (!zN) {
            E9 e9 = H9.Pe;
            C2841s c2841s = C2841s.f23267e;
            G9 g9 = c2841s.f23270c;
            G9 g92 = c2841s.f23270c;
            if (((Boolean) g9.a(e9)).booleanValue()) {
                C2911G.m(context, this.f16601b, this.f16793v);
            }
            if (((Boolean) g92.a(H9.f8704Z0)).booleanValue() && C2911G.h(context)) {
                u2.k.h("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                c1760qk.b();
                if (((Boolean) g92.a(H9.f8709a1)).booleanValue()) {
                    this.f16791t.a(((St) this.f16600a.f12510b.f15174c).f11269b);
                    return;
                }
                return;
            }
        }
        if (this.f16794w) {
            u2.k.h("The rewarded ad have been showed.");
            c1760qk.V(AbstractC1984ut.A(10, null, null));
            return;
        }
        this.f16794w = true;
        C1437kl c1437kl = C1437kl.f15256e;
        Lu lu = this.f16786o;
        lu.C1(c1437kl);
        if (activity == null) {
            activity = context;
        }
        try {
            interfaceC0595Kl.p(z6, activity, c1760qk);
            lu.H1();
        } catch (C0578Jl e6) {
            c1760qk.W(e6);
        }
    }

    public final Bundle d() {
        Bundle bundle;
        C0492Ek c0492Ek = this.f16788q;
        synchronized (c0492Ek) {
            bundle = new Bundle(c0492Ek.f7990c);
        }
        return bundle;
    }

    public final void finalize() throws Throwable {
        try {
            InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) this.f16784m.get();
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.v7)).booleanValue()) {
                if (!this.f16794w && interfaceC0828Yg != null) {
                    AbstractC0640Nf.f10010f.execute(new RunnableC1219gh(interfaceC0828Yg, 6));
                }
            } else if (interfaceC0828Yg != null) {
                interfaceC0828Yg.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}
