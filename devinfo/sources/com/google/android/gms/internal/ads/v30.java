package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v30 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17441a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f17442b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f17443c;

    /* renamed from: d, reason: collision with root package name */
    public final js1 f17444d;

    /* renamed from: e, reason: collision with root package name */
    public final js1 f17445e;

    /* renamed from: f, reason: collision with root package name */
    public final js1 f17446f;
    public final js1 g;

    /* renamed from: h, reason: collision with root package name */
    public final js1 f17447h;

    /* renamed from: i, reason: collision with root package name */
    public final js1 f17448i;
    public final js1 j;

    /* renamed from: k, reason: collision with root package name */
    public final js1 f17449k;

    public v30(z40 z40Var, es1 es1Var, y30 y30Var, y30 y30Var2, y30 y30Var3, y30 y30Var4, n90 n90Var, es1 es1Var2, zm0 zm0Var, es1 es1Var3) {
        this.f17446f = z40Var;
        this.f17442b = es1Var;
        this.g = y30Var;
        this.f17447h = y30Var2;
        this.f17448i = y30Var3;
        this.j = y30Var4;
        this.f17444d = n90Var;
        this.f17443c = es1Var2;
        this.f17449k = zm0Var;
        this.f17445e = es1Var3;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f17441a) {
            case 0:
                return b();
            case 1:
                return new ub0(((b60) this.f17446f).b(), (Executor) this.f17442b.a(), (wc0) ((es1) this.f17443c).a(), (Context) ((es1) this.g).a(), (qd0) this.f17444d.a(), (ct0) this.f17445e.a(), (lh0) this.f17447h.a(), (lc0) ((es1) this.f17448i).a(), (od0) ((es1) this.j).a(), (be0) this.f17449k.a());
            case 2:
                return new kc0((e60) ((es1) this.f17443c).a(), (t60) ((es1) this.f17446f).a(), (z60) this.f17442b.a(), (c70) ((es1) this.g).a(), (v70) this.f17444d.a(), (s80) ((es1) this.f17447h).a(), (qd0) this.f17445e.a(), (ct0) this.f17448i.a(), (lh0) this.j.a(), (t20) ((es1) this.f17449k).a());
            case 3:
                return c();
            case 4:
                return d();
            default:
                return new kz0((w81) this.f17442b.a(), (lz0) this.f17444d.a(), (sz0) this.f17445e.a(), (zx0) ((gs1) this.f17446f).f11600a, (String) ((gs1) this.g).f11600a, (zc) ((gs1) this.f17447h).f11600a, (ks1) this.f17448i, (ks1) this.j, (ks1) this.f17443c, (g21) this.f17449k.a());
        }
    }

    public u30 b() {
        c1.o oVarB = ((z40) this.f17446f).b();
        Context context = (Context) this.f17442b.a();
        xp0 xp0Var = (xp0) ((y30) this.g).f18622b.f9453d;
        al0.z(xp0Var);
        View view = (View) ((y30) this.f17447h).f18622b.f9452c;
        al0.z(view);
        qz qzVar = (qz) ((y30) this.f17448i).f18622b.f9454e;
        n40 n40Var = (n40) ((y30) this.j).f18622b.f9451b;
        ka0 ka0Var = (ka0) ((n90) this.f17444d).f14185a.f13426b;
        al0.z(ka0Var);
        return new u30(oVarB, context, xp0Var, view, qzVar, n40Var, ka0Var, (u80) ((es1) this.f17443c).a(), es1.c((zm0) this.f17449k), (Executor) this.f17445e.a());
    }

    public cg0 c() {
        k10 k10Var = (k10) this.f17442b.a();
        Context contextB = ((a10) this.f17444d).b();
        za.a aVarB = ((g10) this.f17445e).b();
        hq0 hq0VarB = ((b60) this.f17446f).b();
        ex exVar = fx.f11274a;
        al0.z(exVar);
        return new cg0(k10Var, contextB, aVarB, hq0VarB, exVar, (String) ((fs1) this.g).a(), (bs0) ((es1) this.f17443c).a(), (od0) ((es1) this.f17447h).a(), new hl(15), (ScheduledExecutorService) this.f17448i.a(), (ct0) this.j.a(), new m70(((f60) this.f17449k).f11019b.a()));
    }

    public kj0 d() {
        return new kj0((k10) this.f17442b.a(), ((z50) this.f17446f).f19021b.b(), ((gk0) this.f17444d).f11535b, ((f80) this.f17445e).f11057b, (l90) ((m20) this.g).f13731b, (k70) ((l40) this.f17447h).f13368a.f10094b, (ViewGroup) ((fk0) ((m20) this.f17448i).f13731b).f11194b, (w70) ((es1) this.f17443c).a(), (nj0) ((es1) this.j).a(), (ei0) ((es1) this.f17449k).a());
    }

    public v30(b60 b60Var, js1 js1Var, es1 es1Var, es1 es1Var2, js1 js1Var2, js1 js1Var3, js1 js1Var4, es1 es1Var3, es1 es1Var4, js1 js1Var5) {
        this.f17446f = b60Var;
        this.f17442b = js1Var;
        this.f17443c = es1Var;
        this.g = es1Var2;
        this.f17444d = js1Var2;
        this.f17445e = js1Var3;
        this.f17447h = js1Var4;
        this.f17448i = es1Var3;
        this.j = es1Var4;
        this.f17449k = js1Var5;
    }

    public v30(es1 es1Var, es1 es1Var2, es1 es1Var3, es1 es1Var4, es1 es1Var5, es1 es1Var6, es1 es1Var7, es1 es1Var8, es1 es1Var9, es1 es1Var10) {
        this.f17443c = es1Var;
        this.f17446f = es1Var2;
        this.f17442b = es1Var3;
        this.g = es1Var4;
        this.f17444d = es1Var5;
        this.f17447h = es1Var6;
        this.f17445e = es1Var7;
        this.f17448i = es1Var8;
        this.j = es1Var9;
        this.f17449k = es1Var10;
    }

    public v30(es1 es1Var, es1 es1Var2, es1 es1Var3, gs1 gs1Var, gs1 gs1Var2, gs1 gs1Var3, ks1 ks1Var, ks1 ks1Var2, ks1 ks1Var3, es1 es1Var4) {
        this.f17442b = es1Var;
        this.f17444d = es1Var2;
        this.f17445e = es1Var3;
        this.f17446f = gs1Var;
        this.g = gs1Var2;
        this.f17447h = gs1Var3;
        this.f17448i = ks1Var;
        this.j = ks1Var2;
        this.f17443c = ks1Var3;
        this.f17449k = es1Var4;
    }

    public v30(js1 js1Var, z50 z50Var, gk0 gk0Var, f80 f80Var, m20 m20Var, l40 l40Var, m20 m20Var2, es1 es1Var, es1 es1Var2, es1 es1Var3) {
        this.f17442b = js1Var;
        this.f17446f = z50Var;
        this.f17444d = gk0Var;
        this.f17445e = f80Var;
        this.g = m20Var;
        this.f17447h = l40Var;
        this.f17448i = m20Var2;
        this.f17443c = es1Var;
        this.j = es1Var2;
        this.f17449k = es1Var3;
    }

    public v30(js1 js1Var, js1 js1Var2, js1 js1Var3, b60 b60Var, fs1 fs1Var, es1 es1Var, es1 es1Var2, js1 js1Var4, js1 js1Var5, f60 f60Var) {
        this.f17442b = js1Var;
        this.f17444d = js1Var2;
        this.f17445e = js1Var3;
        this.f17446f = b60Var;
        this.g = fs1Var;
        this.f17443c = es1Var;
        this.f17447h = es1Var2;
        this.f17448i = js1Var4;
        this.j = js1Var5;
        this.f17449k = f60Var;
    }
}
