package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import q2.C2841s;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.El, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0493El extends AbstractC1812rj {

    /* renamed from: l, reason: collision with root package name */
    public final Context f7991l;

    /* renamed from: m, reason: collision with root package name */
    public final WeakReference f7992m;

    /* renamed from: n, reason: collision with root package name */
    public final Lu f7993n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0595Kl f7994o;

    /* renamed from: p, reason: collision with root package name */
    public final C0423Aj f7995p;

    /* renamed from: q, reason: collision with root package name */
    public final Gw f7996q;

    /* renamed from: r, reason: collision with root package name */
    public final C1760qk f7997r;

    /* renamed from: s, reason: collision with root package name */
    public final C0572Jf f7998s;

    /* renamed from: t, reason: collision with root package name */
    public final C0784Vn f7999t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8000u;

    public C0493El(K4.j jVar, Context context, InterfaceC0828Yg interfaceC0828Yg, Lu lu, InterfaceC0595Kl interfaceC0595Kl, C0423Aj c0423Aj, Gw gw, C1760qk c1760qk, C0572Jf c0572Jf, C0784Vn c0784Vn) {
        super(jVar);
        this.f8000u = false;
        this.f7991l = context;
        this.f7992m = new WeakReference(interfaceC0828Yg);
        this.f7993n = lu;
        this.f7994o = interfaceC0595Kl;
        this.f7995p = c0423Aj;
        this.f7996q = gw;
        this.f7997r = c1760qk;
        this.f7998s = c0572Jf;
        this.f7999t = c0784Vn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Activity activity, boolean z6) {
        Qt qtJ;
        int iD;
        Context context = this.f7991l;
        C1760qk c1760qk = this.f7997r;
        Lu lu = this.f7993n;
        lu.C1(C1437kl.f15256e);
        C2911G c2911g = p2.j.f22785C.f22790c;
        InterfaceC0595Kl interfaceC0595Kl = this.f7994o;
        if (!C2911G.n(interfaceC0595Kl.c())) {
            E9 e9 = H9.Pe;
            C2841s c2841s = C2841s.f23267e;
            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                C2911G.m(context, this.f16601b, this.f7999t);
            }
            if (((Boolean) c2841s.f23270c.a(H9.f8704Z0)).booleanValue() && C2911G.h(context)) {
                u2.k.h("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                c1760qk.b();
                if (((Boolean) c2841s.f23270c.a(H9.f8709a1)).booleanValue()) {
                    this.f7996q.a(((St) this.f16600a.f12510b.f15174c).f11269b);
                    return;
                }
                return;
            }
        }
        InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) this.f7992m.get();
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.ed)).booleanValue() && interfaceC0828Yg != null && (qtJ = interfaceC0828Yg.J()) != null && qtJ.f10790r0) {
            int i = qtJ.f10792s0;
            C0572Jf c0572Jf = this.f7998s;
            synchronized (c0572Jf.f9319a) {
                iD = c0572Jf.f9322d.d();
            }
            if (i != iD) {
                u2.k.h("The interstitial consent form has been shown.");
                c1760qk.V(AbstractC1984ut.A(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f8000u) {
            u2.k.h("The interstitial ad has been shown.");
            c1760qk.V(AbstractC1984ut.A(10, null, null));
        }
        if (this.f8000u) {
            return;
        }
        if (activity == null) {
            activity = context;
        }
        try {
            interfaceC0595Kl.p(z6, activity, c1760qk);
            lu.H1();
            this.f8000u = true;
        } catch (C0578Jl e6) {
            c1760qk.W(e6);
        }
    }

    public final void finalize() throws Throwable {
        try {
            InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) this.f7992m.get();
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.v7)).booleanValue()) {
                if (!this.f8000u && interfaceC0828Yg != null) {
                    AbstractC0640Nf.f10010f.execute(new RunnableC1219gh(interfaceC0828Yg, 4));
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
