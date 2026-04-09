package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w50 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17903a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f17904b;

    /* renamed from: c, reason: collision with root package name */
    public final es1 f17905c;

    /* renamed from: d, reason: collision with root package name */
    public final es1 f17906d;

    /* renamed from: e, reason: collision with root package name */
    public final es1 f17907e;

    /* renamed from: f, reason: collision with root package name */
    public final es1 f17908f;
    public final js1 g;

    /* renamed from: h, reason: collision with root package name */
    public final es1 f17909h;

    /* renamed from: i, reason: collision with root package name */
    public final js1 f17910i;
    public final js1 j;

    /* renamed from: k, reason: collision with root package name */
    public final js1 f17911k;

    /* renamed from: l, reason: collision with root package name */
    public final js1 f17912l;

    /* renamed from: m, reason: collision with root package name */
    public final js1 f17913m;

    public w50(es1 es1Var, js1 js1Var, js1 js1Var2, f20 f20Var, js1 js1Var3, es1 es1Var2, js1 js1Var4, es1 es1Var3, el elVar, b60 b60Var, es1 es1Var4, es1 es1Var5) {
        this.f17905c = es1Var;
        this.f17904b = js1Var;
        this.g = js1Var2;
        this.f17911k = f20Var;
        this.f17910i = js1Var3;
        this.f17906d = es1Var2;
        this.j = js1Var4;
        this.f17907e = es1Var3;
        this.f17912l = elVar;
        this.f17913m = b60Var;
        this.f17908f = es1Var4;
        this.f17909h = es1Var5;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f17903a) {
            case 0:
                return b();
            case 1:
                return c();
            default:
                k10 k10Var = (k10) ((gs1) this.f17904b).f11600a;
                Context contextB = ((a10) this.g).b();
                oe oeVar = (oe) this.f17905c.a();
                rq0 rq0Var = (rq0) this.f17906d.a();
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new fb.h(k10Var, contextB, oeVar, rq0Var, exVar, (ScheduledExecutorService) this.f17907e.a(), (ud0) this.f17908f.a(), (ct0) this.f17909h.a(), ((g10) this.f17910i).b(), ((el) this.j).b(), (jq0) ((es1) this.f17911k).a(), (fb.z) ((es1) this.f17912l).a(), (fb.v) ((es1) this.f17913m).a());
        }
    }

    public v50 b() {
        sr0 sr0Var = (sr0) this.f17905c.a();
        za.a aVarB = ((g10) this.f17904b).b();
        ApplicationInfo applicationInfo = (ApplicationInfo) this.g.a();
        String packageName = ((a10) ((f20) this.f17911k).f10966b).b().getPackageName();
        al0.z(packageName);
        pk pkVar = sk.f16033a;
        return new v50(sr0Var, aVarB, applicationInfo, packageName, va.s.f36163e.f36164a.A(), (PackageInfo) this.f17910i.a(), es1.c(this.f17906d), ((x00) this.j).a(), (String) this.f17907e.a(), ((el) this.f17912l).d(), ((b60) this.f17913m).b(), (z70) this.f17908f.a(), ((Integer) this.f17909h.a()).intValue());
    }

    public rj0 c() {
        Context contextB = ((a10) this.f17904b).b();
        sr0 sr0Var = (sr0) this.f17905c.a();
        nj0 nj0Var = (nj0) this.f17906d.a();
        h60 h60Var = (h60) this.f17907e.a();
        bt0 bt0Var = (bt0) this.f17908f.a();
        ct0 ct0Var = (ct0) this.g.a();
        q40 q40Var = (q40) this.f17909h.a();
        ex exVar = fx.f11274a;
        al0.z(exVar);
        return new rj0(contextB, sr0Var, nj0Var, h60Var, bt0Var, ct0Var, q40Var, exVar, (ScheduledExecutorService) this.f17910i.a(), (ei0) ((es1) this.j).a(), (bs0) ((es1) this.f17911k).a(), ((gj0) this.f17912l).b(), (od0) ((es1) this.f17913m).a());
    }

    public w50(gs1 gs1Var, a10 a10Var, es1 es1Var, es1 es1Var2, es1 es1Var3, es1 es1Var4, es1 es1Var5, g10 g10Var, el elVar, es1 es1Var6, es1 es1Var7, es1 es1Var8) {
        this.f17904b = gs1Var;
        this.g = a10Var;
        this.f17905c = es1Var;
        this.f17906d = es1Var2;
        this.f17907e = es1Var3;
        this.f17908f = es1Var4;
        this.f17909h = es1Var5;
        this.f17910i = g10Var;
        this.j = elVar;
        this.f17911k = es1Var6;
        this.f17912l = es1Var7;
        this.f17913m = es1Var8;
    }

    public w50(js1 js1Var, es1 es1Var, es1 es1Var2, es1 es1Var3, es1 es1Var4, js1 js1Var2, es1 es1Var5, js1 js1Var3, es1 es1Var6, es1 es1Var7, gj0 gj0Var, es1 es1Var8) {
        this.f17904b = js1Var;
        this.f17905c = es1Var;
        this.f17906d = es1Var2;
        this.f17907e = es1Var3;
        this.f17908f = es1Var4;
        this.g = js1Var2;
        this.f17909h = es1Var5;
        this.f17910i = js1Var3;
        this.j = es1Var6;
        this.f17911k = es1Var7;
        this.f17912l = gj0Var;
        this.f17913m = es1Var8;
    }
}
