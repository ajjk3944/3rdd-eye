package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class oc0 extends o40 {

    /* renamed from: l, reason: collision with root package name */
    public final Context f14656l;

    /* renamed from: m, reason: collision with root package name */
    public final WeakReference f14657m;

    /* renamed from: n, reason: collision with root package name */
    public final f90 f14658n;

    /* renamed from: o, reason: collision with root package name */
    public final rr0 f14659o;

    /* renamed from: p, reason: collision with root package name */
    public final m60 f14660p;

    /* renamed from: q, reason: collision with root package name */
    public final z60 f14661q;

    /* renamed from: r, reason: collision with root package name */
    public final x40 f14662r;

    /* renamed from: s, reason: collision with root package name */
    public final pv f14663s;

    /* renamed from: t, reason: collision with root package name */
    public final jv0 f14664t;

    /* renamed from: u, reason: collision with root package name */
    public final fq0 f14665u;

    /* renamed from: v, reason: collision with root package name */
    public final qd0 f14666v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14667w;

    public oc0(c1.o oVar, Context context, qz qzVar, f90 f90Var, rr0 rr0Var, m60 m60Var, z60 z60Var, x40 x40Var, wp0 wp0Var, jv0 jv0Var, fq0 fq0Var, qd0 qd0Var) {
        super(oVar);
        this.f14667w = false;
        this.f14656l = context;
        this.f14658n = f90Var;
        this.f14657m = new WeakReference(qzVar);
        this.f14659o = rr0Var;
        this.f14660p = m60Var;
        this.f14661q = z60Var;
        this.f14662r = x40Var;
        this.f14664t = jv0Var;
        xu xuVar = wp0Var.f18092l;
        this.f14663s = new pv(xuVar != null ? xuVar.f18498a : "", xuVar != null ? xuVar.f18499b : 1);
        this.f14665u = fq0Var;
        this.f14666v = qd0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Activity activity, boolean z3) {
        ya.f0 f0Var = ua.j.C.f35261c;
        f90 f90Var = this.f14658n;
        boolean zN = ya.f0.n(f90Var.a());
        Context context = this.f14656l;
        m60 m60Var = this.f14660p;
        if (!zN) {
            pk pkVar = sk.Re;
            va.s sVar = va.s.f36163e;
            rk rkVar = sVar.f36166c;
            rk rkVar2 = sVar.f36166c;
            if (((Boolean) rkVar.a(pkVar)).booleanValue()) {
                ya.f0.m(context, this.f14533b, this.f14666v);
            }
            if (((Boolean) rkVar2.a(sk.Z0)).booleanValue() && ya.f0.h(context)) {
                za.i.h("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                m60Var.c();
                if (((Boolean) rkVar2.a(sk.f16035a1)).booleanValue()) {
                    this.f14664t.a(((yp0) this.f14532a.f10544b.f9452c).f18820b);
                    return;
                }
                return;
            }
        }
        if (this.f14667w) {
            za.i.h("The rewarded ad have been showed.");
            m60Var.J(yo0.A(10, null, null));
            return;
        }
        this.f14667w = true;
        h80 h80Var = h80.f11748d;
        rr0 rr0Var = this.f14659o;
        rr0Var.p1(h80Var);
        if (activity == null) {
            activity = context;
        }
        try {
            f90Var.e(z3, activity, m60Var);
            rr0Var.v1();
        } catch (e90 e2) {
            m60Var.K(e2);
        }
    }

    public final Bundle d() {
        Bundle bundle;
        z60 z60Var = this.f14661q;
        synchronized (z60Var) {
            bundle = new Bundle(z60Var.f19027c);
        }
        return bundle;
    }

    public final void finalize() throws Throwable {
        try {
            qz qzVar = (qz) this.f14657m.get();
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16368v7)).booleanValue()) {
                if (!this.f14667w && qzVar != null) {
                    fx.f11279f.execute(new a00(qzVar, 6));
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
