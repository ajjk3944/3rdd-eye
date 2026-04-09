package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c30 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final js1 f9954a;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f9955b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f9956c;

    /* renamed from: d, reason: collision with root package name */
    public final v40 f9957d;

    /* renamed from: e, reason: collision with root package name */
    public final v40 f9958e;

    /* renamed from: f, reason: collision with root package name */
    public final js1 f9959f;
    public final es1 g;

    /* renamed from: h, reason: collision with root package name */
    public final fs1 f9960h;

    /* renamed from: i, reason: collision with root package name */
    public final fs1 f9961i;
    public final js1 j;

    /* renamed from: k, reason: collision with root package name */
    public final js1 f9962k;

    /* renamed from: l, reason: collision with root package name */
    public final js1 f9963l;

    /* renamed from: m, reason: collision with root package name */
    public final js1 f9964m;

    /* renamed from: n, reason: collision with root package name */
    public final es1 f9965n;

    /* renamed from: o, reason: collision with root package name */
    public final es1 f9966o;

    /* renamed from: p, reason: collision with root package name */
    public final js1 f9967p;

    public c30(a10 a10Var, es1 es1Var, es1 es1Var2, v40 v40Var, v40 v40Var2, es1 es1Var3, es1 es1Var4, fs1 fs1Var, fs1 fs1Var2, es1 es1Var5, es1 es1Var6, es1 es1Var7, a60 a60Var, es1 es1Var8, es1 es1Var9, ks1 ks1Var) {
        this.f9954a = a10Var;
        this.f9955b = es1Var;
        this.f9956c = es1Var2;
        this.f9957d = v40Var;
        this.f9958e = v40Var2;
        this.f9959f = es1Var3;
        this.g = es1Var4;
        this.f9960h = fs1Var;
        this.f9961i = fs1Var2;
        this.j = es1Var5;
        this.f9962k = es1Var6;
        this.f9963l = es1Var7;
        this.f9964m = a60Var;
        this.f9965n = es1Var8;
        this.f9966o = es1Var9;
        this.f9967p = ks1Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        Context contextB = ((a10) this.f9954a).b();
        ex exVar = fx.f11274a;
        al0.z(exVar);
        Executor executor = (Executor) this.f9955b.a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f9956c.a();
        dq0 dq0VarC = this.f9957d.c();
        wp0 wp0VarB = this.f9958e.b();
        bt0 bt0Var = (bt0) this.f9959f.a();
        lq0 lq0Var = (lq0) this.g.a();
        View view = (View) this.f9960h.a();
        qz qzVar = (qz) this.f9961i.a();
        oe oeVar = (oe) this.j.a();
        fl flVar = (fl) this.f9962k.a();
        return new b30(contextB, exVar, executor, scheduledExecutorService, dq0VarC, wp0VarB, bt0Var, lq0Var, view, qzVar, oeVar, flVar, (pq0) ((a60) this.f9964m).f9223a.f18646e, (d70) this.f9965n.a(), (o50) this.f9966o.a(), ((ks1) this.f9967p).a());
    }
}
