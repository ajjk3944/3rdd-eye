package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b90 extends o40 {

    /* renamed from: l, reason: collision with root package name */
    public final Context f9625l;

    /* renamed from: m, reason: collision with root package name */
    public final WeakReference f9626m;

    /* renamed from: n, reason: collision with root package name */
    public final rr0 f9627n;

    /* renamed from: o, reason: collision with root package name */
    public final f90 f9628o;

    /* renamed from: p, reason: collision with root package name */
    public final x40 f9629p;

    /* renamed from: q, reason: collision with root package name */
    public final jv0 f9630q;

    /* renamed from: r, reason: collision with root package name */
    public final m60 f9631r;

    /* renamed from: s, reason: collision with root package name */
    public final bx f9632s;

    /* renamed from: t, reason: collision with root package name */
    public final qd0 f9633t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9634u;

    public b90(c1.o oVar, Context context, qz qzVar, rr0 rr0Var, f90 f90Var, x40 x40Var, jv0 jv0Var, m60 m60Var, bx bxVar, qd0 qd0Var) {
        super(oVar);
        this.f9634u = false;
        this.f9625l = context;
        this.f9626m = new WeakReference(qzVar);
        this.f9627n = rr0Var;
        this.f9628o = f90Var;
        this.f9629p = x40Var;
        this.f9630q = jv0Var;
        this.f9631r = m60Var;
        this.f9632s = bxVar;
        this.f9633t = qd0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Activity activity, boolean z3) {
        wp0 wp0VarS;
        int iD;
        Context context = this.f9625l;
        m60 m60Var = this.f9631r;
        rr0 rr0Var = this.f9627n;
        rr0Var.p1(h80.f11748d);
        ya.f0 f0Var = ua.j.C.f35261c;
        f90 f90Var = this.f9628o;
        if (!ya.f0.n(f90Var.a())) {
            pk pkVar = sk.Re;
            va.s sVar = va.s.f36163e;
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                ya.f0.m(context, this.f14533b, this.f9633t);
            }
            if (((Boolean) sVar.f36166c.a(sk.Z0)).booleanValue() && ya.f0.h(context)) {
                za.i.h("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                m60Var.c();
                if (((Boolean) sVar.f36166c.a(sk.f16035a1)).booleanValue()) {
                    this.f9630q.a(((yp0) this.f14532a.f10544b.f9452c).f18820b);
                    return;
                }
                return;
            }
        }
        qz qzVar = (qz) this.f9626m.get();
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16144gd)).booleanValue() && qzVar != null && (wp0VarS = qzVar.s()) != null && wp0VarS.f18105r0) {
            int i4 = wp0VarS.f18107s0;
            bx bxVar = this.f9632s;
            synchronized (bxVar.f9834a) {
                iD = bxVar.f9837d.d();
            }
            if (i4 != iD) {
                za.i.h("The interstitial consent form has been shown.");
                m60Var.J(yo0.A(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f9634u) {
            za.i.h("The interstitial ad has been shown.");
            m60Var.J(yo0.A(10, null, null));
        }
        if (this.f9634u) {
            return;
        }
        if (activity == null) {
            activity = context;
        }
        try {
            f90Var.e(z3, activity, m60Var);
            rr0Var.v1();
            this.f9634u = true;
        } catch (e90 e2) {
            m60Var.K(e2);
        }
    }

    public final void finalize() throws Throwable {
        try {
            qz qzVar = (qz) this.f9626m.get();
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16368v7)).booleanValue()) {
                if (!this.f9634u && qzVar != null) {
                    fx.f11279f.execute(new a00(qzVar, 4));
                }
            } else if (qzVar != null) {
                qzVar.destroy();
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }
}
