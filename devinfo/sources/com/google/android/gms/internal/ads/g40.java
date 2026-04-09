package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g40 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11367a;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f11368b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f11369c;

    /* renamed from: d, reason: collision with root package name */
    public final js1 f11370d;

    /* renamed from: e, reason: collision with root package name */
    public final js1 f11371e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f11372f;

    public g40(a10 a10Var, g10 g10Var, v40 v40Var, fs1 fs1Var, es1 es1Var) {
        this.f11367a = 10;
        this.f11370d = a10Var;
        this.f11371e = g10Var;
        this.f11369c = v40Var;
        this.f11372f = fs1Var;
        this.f11368b = es1Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f11367a) {
            case 0:
                return new f40(((a10) this.f11370d).b(), (qz) ((y30) this.f11372f).f18622b.f9454e, ((v40) this.f11369c).b(), ((g10) this.f11371e).b(), (wh0) ((es1) this.f11368b).a());
            case 1:
                o60 o60Var = (o60) ((es1) this.f11368b).a();
                wp0 wp0VarB = ((v40) this.f11369c).b();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f11370d.a();
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new n50(o60Var, wp0VarB, scheduledExecutorService, exVar, (String) ((v40) this.f11371e).f17495b.f15075d, (f70) ((es1) this.f11372f).a());
            case 2:
                return new s50(((v40) this.f11372f).c(), ((v40) this.f11369c).b(), (tb.a) this.f11370d.a(), (qd0) this.f11371e.a(), (ScheduledExecutorService) this.f11368b.a());
            case 3:
                return b();
            case 4:
                return new g90(((a10) this.f11370d).b(), (qz) ((c90) this.f11372f).f10020b.f13427c, ((v40) this.f11369c).b(), ((g10) this.f11371e).b(), (wh0) ((es1) this.f11368b).a());
            case 5:
                Map mapC = ((hs1) this.f11370d).a();
                Map mapC2 = ((hs1) this.f11371e).a();
                Map mapC3 = ((hs1) this.f11372f).a();
                ka0 ka0Var = (ka0) ((n90) this.f11369c).f14185a.f13426b;
                al0.z(ka0Var);
                return new k90(mapC, mapC2, mapC3, (es1) this.f11368b, ka0Var);
            case 6:
                return new sb0((Executor) this.f11370d.a(), (m30) ((es1) this.f11368b).a(), (r80) ((es1) this.f11371e).a(), (t20) ((es1) this.f11372f).a(), (o50) ((es1) this.f11369c).a());
            case 7:
                Context contextB = ((a10) this.f11370d).b();
                String packageName = ((a10) ((f20) this.f11372f).f10966b).b().getPackageName();
                al0.z(packageName);
                za.a aVarB = ((g10) this.f11371e).b();
                mi miVar = (mi) this.f11369c.a();
                String str = (String) ((es1) this.f11368b).a();
                li liVar = new li(new m8.s(contextB, 2));
                cj cjVarB = dj.B();
                int i4 = aVarB.f38130b;
                cjVarB.b();
                ((dj) cjVarB.f14755b).C(i4);
                int i10 = aVarB.f38131c;
                cjVarB.b();
                ((dj) cjVarB.f14755b).D(i10);
                int i11 = true != aVarB.f38132d ? 2 : 0;
                cjVarB.b();
                ((dj) cjVarB.f14755b).A(i11);
                liVar.a(new aw(miVar, packageName, (dj) cjVarB.e(), str, 15, false));
                return liVar;
            case 8:
                Context contextB2 = ((a10) this.f11370d).b();
                ex exVar2 = fx.f11274a;
                al0.z(exVar2);
                hl hlVar = new hl(15);
                k10 k10Var = (k10) ((e10) this.f11371e).f10665a.f11600a;
                al0.z(k10Var);
                return new xg0(contextB2, exVar2, hlVar, k10Var, new ix0(29, ((i10) ((f20) this.f11372f).f10966b).a()), (ArrayDeque) this.f11369c.a(), (cs0) this.f11368b.a());
            case 9:
                return c();
            case 10:
                return new wh0(((a10) this.f11370d).b(), ((g10) this.f11371e).b(), ((v40) this.f11369c).b(), (qz) ((fs1) this.f11372f).a(), (qd0) this.f11368b.a());
            case 11:
                return new ui0((Context) ((es1) this.f11368b).a(), (Executor) this.f11370d.a(), (t10) ((gs1) this.f11372f).f11600a, (vp0) this.f11371e.a(), (qd0) this.f11369c.a());
            case 12:
                return new jj0((k10) this.f11370d.a(), ((z50) this.f11371e).f19021b.b(), ((f80) this.f11372f).f11057b, (nj0) ((es1) this.f11368b).a(), (ei0) ((es1) this.f11369c).a());
            case 13:
                tb.a aVar = (tb.a) this.f11370d.a();
                pj0 pj0Var = (pj0) this.f11369c;
                pq0 pq0Var = new pq0((oq0) pj0Var.f15016b.a(), (dd0) pj0Var.f15017c.a(), (qd0) pj0Var.f15018d.a(), false, 24);
                ei0 ei0Var = (ei0) ((es1) this.f11368b).a();
                ct0 ct0Var = (ct0) this.f11371e.a();
                nj0 nj0Var = (nj0) ((ne0) this.f11372f).f14280b;
                return nj0Var != null ? nj0Var : new nj0(aVar, pq0Var, ei0Var, ct0Var);
            case 14:
                return new ui0((Context) ((es1) this.f11368b).a(), (p10) ((gs1) this.f11371e).f11600a, (sr0) ((es1) this.f11372f).a(), (w81) this.f11370d.a(), (xk) ((gk0) this.f11369c).f11535b.f11194b);
            case 15:
                return new ok0((Context) this.f11370d.a(), (va.y) ((m90) this.f11371e).f13806a.f13427c, ((b60) ((js1) this.f11372f)).b(), ((v30) ((m20) this.f11369c).f13731b).b(), (qd0) this.f11368b.a());
            case 16:
                tw twVar = new tw();
                Context contextB3 = ((a10) this.f11370d).b();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f11371e.a();
                ex exVar3 = fx.f11274a;
                al0.z(exVar3);
                return new bo0(twVar, contextB3, scheduledExecutorService2, exVar3, ((jo0) this.f11372f).f12805b.f34473b, ((iu) ((jo0) this.f11369c).f12805b.f34474c).f12482l, ((iu) ((jo0) this.f11368b).f12805b.f34474c).f12481k);
            case 17:
                return new lp0((Context) ((gs1) this.f11372f).f11600a, (Executor) this.f11370d.a(), (k10) this.f11371e.a(), (uk0) ((es1) this.f11368b).a(), (np0) ((es1) this.f11369c).a(), new gq0());
            case 18:
                return new gt0((rt0) ((es1) this.f11368b).a(), ((d10) this.f11370d).b(), ((a10) this.f11371e).b(), (tb.a) ((es1) this.f11372f).a(), (et0) ((es1) this.f11369c).a());
            case 19:
                Context context = (Context) ((gs1) this.f11370d).f11600a;
                dy0 dy0Var = (dy0) ((es1) this.f11368b).a();
                ExecutorService executorService = (ExecutorService) ((gs1) this.f11371e).f11600a;
                cy0 cy0Var = (cy0) ((es1) this.f11372f).a();
                sx0 sx0Var = (sx0) ((gs1) this.f11369c).f11600a;
                return new vy0(context, dy0Var, executorService, cy0Var, new Random(), sx0Var.I().A(), sx0Var.I().C(), sx0Var.I().D(), sx0Var.I().B(), sx0Var.G(), sx0Var.D() - 1);
            case 20:
                return new dz0(es1.c((es1) this.f11368b), es1.c((es1) this.f11370d), es1.c((es1) this.f11371e), (ExecutorService) ((gs1) this.f11372f).f11600a, (g21) ((es1) this.f11369c).a());
            case 21:
                return new ez0((sx0) ((gs1) this.f11370d).f11600a, (dz0) ((es1) this.f11368b).a(), (bz0) ((es1) this.f11371e).a(), (ExecutorService) ((gs1) this.f11372f).f11600a, (g21) ((es1) this.f11369c).a());
            default:
                return new vz0((zc) ((gs1) this.f11372f).f11600a, (sz0) this.f11370d.a(), (Map) ((gs1) this.f11369c).f11600a, (Context) this.f11371e.a(), (g21) this.f11368b.a());
        }
    }

    public c60 b() {
        return new c60(((v40) this.f11369c).b(), (String) ((v40) this.f11372f).f17495b.f15075d, (ei0) this.f11370d.a(), ((v40) this.f11368b).f17495b.v(), (String) this.f11371e.a());
    }

    public gh0 c() {
        return new gh0(((a10) this.f11370d).b(), ((w50) this.f11372f).b(), (eh0) ((es1) this.f11368b).a(), ((hw) this.f11369c).b(), ((x00) this.f11371e).a());
    }

    public g40(a10 a10Var, f20 f20Var, g10 g10Var, js1 js1Var, es1 es1Var) {
        this.f11367a = 7;
        this.f11370d = a10Var;
        this.f11372f = f20Var;
        this.f11371e = g10Var;
        this.f11369c = js1Var;
        this.f11368b = es1Var;
    }

    public /* synthetic */ g40(a10 a10Var, fs1 fs1Var, v40 v40Var, g10 g10Var, es1 es1Var, int i4) {
        this.f11367a = i4;
        this.f11370d = a10Var;
        this.f11372f = fs1Var;
        this.f11369c = v40Var;
        this.f11371e = g10Var;
        this.f11368b = es1Var;
    }

    public g40(v40 v40Var, v40 v40Var2, es1 es1Var, v40 v40Var3, es1 es1Var2) {
        this.f11367a = 3;
        this.f11369c = v40Var;
        this.f11372f = v40Var2;
        this.f11370d = es1Var;
        this.f11368b = v40Var3;
        this.f11371e = es1Var2;
    }

    public g40(v40 v40Var, v40 v40Var2, es1 es1Var, es1 es1Var2, es1 es1Var3) {
        this.f11367a = 2;
        this.f11372f = v40Var;
        this.f11369c = v40Var2;
        this.f11370d = es1Var;
        this.f11371e = es1Var2;
        this.f11368b = es1Var3;
    }

    public g40(ne0 ne0Var, js1 js1Var, pj0 pj0Var, es1 es1Var, js1 js1Var2) {
        this.f11367a = 13;
        this.f11372f = ne0Var;
        this.f11370d = js1Var;
        this.f11369c = pj0Var;
        this.f11368b = es1Var;
        this.f11371e = js1Var2;
    }

    public g40(es1 es1Var, v40 v40Var, es1 es1Var2, v40 v40Var2, es1 es1Var3) {
        this.f11367a = 1;
        this.f11368b = es1Var;
        this.f11369c = v40Var;
        this.f11370d = es1Var2;
        this.f11371e = v40Var2;
        this.f11372f = es1Var3;
    }

    public g40(es1 es1Var, es1 es1Var2, es1 es1Var3, es1 es1Var4, gs1 gs1Var) {
        this.f11367a = 11;
        this.f11368b = es1Var;
        this.f11370d = es1Var2;
        this.f11372f = gs1Var;
        this.f11371e = es1Var3;
        this.f11369c = es1Var4;
    }

    public g40(es1 es1Var, gs1 gs1Var, es1 es1Var2, js1 js1Var, gk0 gk0Var) {
        this.f11367a = 14;
        this.f11368b = es1Var;
        this.f11371e = gs1Var;
        this.f11372f = es1Var2;
        this.f11370d = js1Var;
        this.f11369c = gk0Var;
    }

    public /* synthetic */ g40(es1 es1Var, js1 js1Var, js1 js1Var2, Object obj, es1 es1Var2, int i4) {
        this.f11367a = i4;
        this.f11368b = es1Var;
        this.f11370d = js1Var;
        this.f11371e = js1Var2;
        this.f11372f = obj;
        this.f11369c = es1Var2;
    }

    public /* synthetic */ g40(fs1 fs1Var, fs1 fs1Var2, fs1 fs1Var3, es1 es1Var, js1 js1Var, int i4) {
        this.f11367a = i4;
        this.f11370d = fs1Var;
        this.f11371e = fs1Var2;
        this.f11372f = fs1Var3;
        this.f11368b = es1Var;
        this.f11369c = js1Var;
    }

    public g40(gs1 gs1Var, es1 es1Var, gs1 gs1Var2, es1 es1Var2, es1 es1Var3) {
        this.f11367a = 17;
        this.f11372f = gs1Var;
        this.f11370d = es1Var;
        this.f11371e = gs1Var2;
        this.f11368b = es1Var2;
        this.f11369c = es1Var3;
    }

    public g40(gs1 gs1Var, es1 es1Var, gs1 gs1Var2, gs1 gs1Var3, es1 es1Var2) {
        this.f11367a = 22;
        this.f11372f = gs1Var;
        this.f11370d = es1Var;
        this.f11369c = gs1Var2;
        this.f11371e = gs1Var3;
        this.f11368b = es1Var2;
    }

    public g40(js1 js1Var, w50 w50Var, es1 es1Var, hw hwVar, js1 js1Var2) {
        this.f11367a = 9;
        this.f11370d = js1Var;
        this.f11372f = w50Var;
        this.f11368b = es1Var;
        this.f11369c = hwVar;
        this.f11371e = js1Var2;
    }

    public /* synthetic */ g40(js1 js1Var, js1 js1Var2, fs1 fs1Var, js1 js1Var3, js1 js1Var4, int i4) {
        this.f11367a = i4;
        this.f11370d = js1Var;
        this.f11371e = js1Var2;
        this.f11372f = fs1Var;
        this.f11369c = js1Var3;
        this.f11368b = js1Var4;
    }

    public /* synthetic */ g40(Object obj, es1 es1Var, Object obj2, Object obj3, Object obj4, int i4) {
        this.f11367a = i4;
        this.f11370d = (js1) obj;
        this.f11368b = es1Var;
        this.f11371e = (js1) obj2;
        this.f11372f = obj3;
        this.f11369c = (js1) obj4;
    }
}
