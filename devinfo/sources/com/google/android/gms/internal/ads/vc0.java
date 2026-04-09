package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vc0 {

    /* renamed from: a, reason: collision with root package name */
    public final e60 f17581a;

    /* renamed from: b, reason: collision with root package name */
    public final s80 f17582b;

    /* renamed from: c, reason: collision with root package name */
    public final t60 f17583c;

    /* renamed from: d, reason: collision with root package name */
    public final z60 f17584d;

    /* renamed from: e, reason: collision with root package name */
    public final c70 f17585e;

    /* renamed from: f, reason: collision with root package name */
    public final v70 f17586f;
    public final Executor g;

    /* renamed from: h, reason: collision with root package name */
    public final r80 f17587h;

    /* renamed from: i, reason: collision with root package name */
    public final j30 f17588i;
    public final ua.a j;

    /* renamed from: k, reason: collision with root package name */
    public final uv f17589k;

    /* renamed from: l, reason: collision with root package name */
    public final oe f17590l;

    /* renamed from: m, reason: collision with root package name */
    public final q70 f17591m;

    /* renamed from: n, reason: collision with root package name */
    public final lh0 f17592n;

    /* renamed from: o, reason: collision with root package name */
    public final ct0 f17593o;

    /* renamed from: p, reason: collision with root package name */
    public final qd0 f17594p;

    /* renamed from: q, reason: collision with root package name */
    public final t20 f17595q;

    /* renamed from: r, reason: collision with root package name */
    public final zc0 f17596r;

    /* renamed from: s, reason: collision with root package name */
    public final be0 f17597s;

    /* renamed from: t, reason: collision with root package name */
    public final s50 f17598t;

    /* renamed from: u, reason: collision with root package name */
    public final o50 f17599u;

    public vc0(e60 e60Var, t60 t60Var, z60 z60Var, c70 c70Var, v70 v70Var, Executor executor, r80 r80Var, j30 j30Var, ua.a aVar, uv uvVar, oe oeVar, q70 q70Var, lh0 lh0Var, ct0 ct0Var, qd0 qd0Var, s80 s80Var, t20 t20Var, zc0 zc0Var, be0 be0Var, s50 s50Var, o50 o50Var) {
        this.f17581a = e60Var;
        this.f17583c = t60Var;
        this.f17584d = z60Var;
        this.f17585e = c70Var;
        this.f17586f = v70Var;
        this.g = executor;
        this.f17587h = r80Var;
        this.f17588i = j30Var;
        this.j = aVar;
        this.f17589k = uvVar;
        this.f17590l = oeVar;
        this.f17591m = q70Var;
        this.f17592n = lh0Var;
        this.f17593o = ct0Var;
        this.f17594p = qd0Var;
        this.f17582b = s80Var;
        this.f17595q = t20Var;
        this.f17596r = zc0Var;
        this.f17597s = be0Var;
        this.f17598t = s50Var;
        this.f17599u = o50Var;
    }

    public static final gx b(qz qzVar, String str, String str2, Bundle bundle, bs0 bs0Var) {
        pk pkVar = sk.E2;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            d.h.D(ua.j.C.f35267k, bundle, "rendering-webview-load-html-start");
        }
        gx gxVar = new gx();
        if (((Boolean) sVar.f36166c.a(sk.f16094da)).booleanValue()) {
            yr0 yr0VarC = d7.C(AppLovinMediationAdapter.ERROR_CHILD_USER, qzVar.getContext());
            yr0VarC.b();
            yr1.H(gxVar, bs0Var, yr0VarC, false);
        }
        qzVar.X().g = new ce1(bundle, false, gxVar, 13);
        qzVar.p0(str, str2);
        return gxVar;
    }

    public final void a(qz qzVar, boolean z3, qo qoVar, Bundle bundle) {
        me meVar;
        pk pkVar = sk.E2;
        va.s sVar = va.s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        if (((Boolean) rkVar.a(pkVar)).booleanValue()) {
            d.h.D(ua.j.C.f35267k, bundle, "rendering-configure-webview-start");
        }
        qzVar.X().j(new va.a() { // from class: com.google.android.gms.internal.ads.uc0
            @Override // va.a
            public final /* synthetic */ void onAdClicked() {
                this.f17171a.f17581a.onAdClicked();
            }
        }, this.f17584d, this.f17585e, new fo() { // from class: com.google.android.gms.internal.ads.sc0
            @Override // com.google.android.gms.internal.ads.fo
            public final /* synthetic */ void Y(String str, String str2) {
                this.f15989a.f17586f.Y(str, str2);
            }
        }, new ec0(2, this), z3, qoVar, this.j, new dz1(this), this.f17589k, this.f17592n, this.f17593o, this.f17594p, null, this.f17582b, null, null, null, this.f17595q, this.f17597s, this.f17598t, this.f17599u);
        qzVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.tc0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                vc0 vc0Var = this.f16781a;
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16261ob)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
                    vc0Var.f17596r.f19057a = motionEvent;
                }
                vc0Var.j.f35223b = true;
                if (view == null) {
                    return false;
                }
                view.performClick();
                return false;
            }
        });
        qzVar.setOnClickListener(new ss(this));
        if (((Boolean) rkVar2.a(sk.f16150h3)).booleanValue() && (meVar = this.f17590l.f14684b) != null) {
            meVar.g(qzVar.N());
        }
        r80 r80Var = this.f17587h;
        Executor executor = this.g;
        r80Var.m1(qzVar, executor);
        r80Var.m1(new qb0(qzVar, 2), executor);
        r80Var.v1(qzVar.N());
        qzVar.Z("/trackActiveViewUnit", new lo(5, this, qzVar));
        j30 j30Var = this.f17588i;
        j30Var.getClass();
        j30Var.j = new WeakReference(qzVar);
        if (((Boolean) rkVar2.a(pkVar)).booleanValue()) {
            d.h.D(ua.j.C.f35267k, bundle, "rendering-configure-webview-end");
        }
    }
}
