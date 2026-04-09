package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p30 extends o40 {

    /* renamed from: l, reason: collision with root package name */
    public final qz f14877l;

    /* renamed from: m, reason: collision with root package name */
    public final int f14878m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f14879n;

    /* renamed from: o, reason: collision with root package name */
    public final l90 f14880o;

    /* renamed from: p, reason: collision with root package name */
    public final f90 f14881p;

    /* renamed from: q, reason: collision with root package name */
    public final rr0 f14882q;

    /* renamed from: r, reason: collision with root package name */
    public final m60 f14883r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f14884s;

    /* renamed from: t, reason: collision with root package name */
    public final bx f14885t;

    /* renamed from: u, reason: collision with root package name */
    public final qd0 f14886u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f14887v;

    public p30(c1.o oVar, Context context, qz qzVar, int i4, l90 l90Var, f90 f90Var, rr0 rr0Var, m60 m60Var, bx bxVar, qd0 qd0Var) {
        super(oVar);
        this.f14887v = false;
        this.f14877l = qzVar;
        this.f14879n = context;
        this.f14878m = i4;
        this.f14880o = l90Var;
        this.f14881p = f90Var;
        this.f14882q = rr0Var;
        this.f14883r = m60Var;
        this.f14884s = ((Boolean) va.s.f36163e.f36166c.a(sk.f16210l6)).booleanValue();
        this.f14885t = bxVar;
        this.f14886u = qd0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v14, types: [android.content.Context] */
    public final void c(Activity activity, boolean z3) {
        qz qzVar;
        wp0 wp0VarS;
        int iD;
        rr0 rr0Var = this.f14882q;
        m60 m60Var = this.f14883r;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f14879n;
        }
        boolean z10 = this.f14884s;
        if (z10) {
            rr0Var.p1(h80.f11748d);
        }
        ua.j jVar = ua.j.C;
        ya.f0 f0Var = jVar.f35261c;
        f90 f90Var = this.f14881p;
        if (!ya.f0.n(f90Var.a())) {
            pk pkVar = sk.Re;
            va.s sVar = va.s.f36163e;
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                ya.f0.m(activity2, this.f14533b, this.f14886u);
            }
            if (((Boolean) sVar.f36166c.a(sk.Z0)).booleanValue() && ya.f0.h(activity2)) {
                za.i.h("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                m60Var.c();
                if (((Boolean) sVar.f36166c.a(sk.f16035a1)).booleanValue()) {
                    new jv0(activity2.getApplicationContext(), jVar.f35276t.f()).a(((yp0) this.f14532a.f10544b.f9452c).f18820b);
                    return;
                }
                return;
            }
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16144gd)).booleanValue() && (qzVar = this.f14877l) != null && (wp0VarS = qzVar.s()) != null && wp0VarS.f18105r0) {
            int i4 = wp0VarS.f18107s0;
            bx bxVar = this.f14885t;
            synchronized (bxVar.f9834a) {
                iD = bxVar.f9837d.d();
            }
            if (i4 != iD) {
                za.i.h("The app open consent form has been shown.");
                m60Var.J(yo0.A(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f14887v) {
            za.i.h("App open interstitial ad is already visible.");
            m60Var.J(yo0.A(10, null, null));
        }
        if (this.f14887v) {
            return;
        }
        try {
            f90Var.e(z3, activity2, m60Var);
            if (z10) {
                rr0Var.v1();
            }
            this.f14887v = true;
        } catch (e90 e2) {
            m60Var.K(e2);
        }
    }

    public final void d() {
        s60 s60Var = this.f14534c;
        s60Var.getClass();
        s60Var.p1(new nk(null, 2));
        qz qzVar = this.f14877l;
        if (qzVar != null) {
            qzVar.destroy();
        }
    }

    public final void e(int i4, long j) {
        l90 l90Var = this.f14880o;
        rt rtVarA = ((qd0) l90Var.f13426b).a();
        rtVarA.u("gqi", ((yp0) ((dq0) l90Var.f13427c).f10544b.f9452c).f18820b);
        rtVarA.u("action", "ad_closed");
        rtVarA.u("show_time", String.valueOf(j));
        rtVarA.u("ad_format", "app_open_ad");
        int i10 = i4 - 1;
        rtVarA.u("acr", i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        rtVarA.v();
    }
}
