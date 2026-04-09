package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class da0 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final z40 f10389a;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f10390b;

    /* renamed from: c, reason: collision with root package name */
    public final m20 f10391c;

    /* renamed from: d, reason: collision with root package name */
    public final fs1 f10392d;

    /* renamed from: e, reason: collision with root package name */
    public final qa0 f10393e;

    /* renamed from: f, reason: collision with root package name */
    public final js1 f10394f;
    public final js1 g;

    /* renamed from: h, reason: collision with root package name */
    public final es1 f10395h;

    /* renamed from: i, reason: collision with root package name */
    public final es1 f10396i;
    public final es1 j;

    /* renamed from: k, reason: collision with root package name */
    public final es1 f10397k;

    /* renamed from: l, reason: collision with root package name */
    public final es1 f10398l;

    /* renamed from: m, reason: collision with root package name */
    public final la0 f10399m;

    /* renamed from: n, reason: collision with root package name */
    public final js1 f10400n;

    /* renamed from: o, reason: collision with root package name */
    public final js1 f10401o;

    /* renamed from: p, reason: collision with root package name */
    public final js1 f10402p;

    /* renamed from: q, reason: collision with root package name */
    public final es1 f10403q;

    /* renamed from: r, reason: collision with root package name */
    public final es1 f10404r;

    /* renamed from: s, reason: collision with root package name */
    public final js1 f10405s;

    public da0(z40 z40Var, es1 es1Var, m20 m20Var, fs1 fs1Var, qa0 qa0Var, js1 js1Var, n90 n90Var, es1 es1Var2, es1 es1Var3, es1 es1Var4, es1 es1Var5, es1 es1Var6, la0 la0Var, es1 es1Var7, g10 g10Var, a10 a10Var, es1 es1Var8, es1 es1Var9, es1 es1Var10) {
        this.f10389a = z40Var;
        this.f10390b = es1Var;
        this.f10391c = m20Var;
        this.f10392d = fs1Var;
        this.f10393e = qa0Var;
        this.f10394f = js1Var;
        this.g = n90Var;
        this.f10395h = es1Var2;
        this.f10396i = es1Var3;
        this.j = es1Var4;
        this.f10397k = es1Var5;
        this.f10398l = es1Var6;
        this.f10399m = la0Var;
        this.f10400n = es1Var7;
        this.f10401o = g10Var;
        this.f10402p = a10Var;
        this.f10403q = es1Var8;
        this.f10404r = es1Var9;
        this.f10405s = es1Var10;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        c1.o oVarB = this.f10389a.b();
        Executor executor = (Executor) this.f10390b.a();
        ga0 ga0VarB = this.f10391c.b();
        ja0 ja0Var = (ja0) this.f10392d.a();
        pa0 pa0VarB = this.f10393e.b();
        ia0 ia0Var = (ia0) this.f10394f.a();
        ka0 ka0Var = (ka0) ((n90) this.g).f14185a.f13426b;
        al0.z(ka0Var);
        cs1 cs1VarC = es1.c(this.f10395h);
        cs1 cs1VarC2 = es1.c(this.f10396i);
        cs1 cs1VarC3 = es1.c(this.j);
        cs1 cs1VarC4 = es1.c(this.f10397k);
        cs1 cs1VarC5 = es1.c(this.f10398l);
        la0 la0Var = this.f10399m;
        bw bwVar = new bw(((a10) la0Var.f13433c).b(), la0Var.f13432b.b().g);
        oe oeVar = (oe) this.f10400n.a();
        za.a aVarB = ((g10) this.f10401o).b();
        Context contextB = ((a10) this.f10402p).b();
        ea0 ea0Var = (ea0) this.f10403q.a();
        vk0 vk0Var = (vk0) this.f10404r.a();
        return new ca0(oVarB, executor, ga0VarB, ja0Var, pa0VarB, ia0Var, ka0Var, cs1VarC, cs1VarC2, cs1VarC3, cs1VarC4, cs1VarC5, bwVar, oeVar, aVarB, contextB, ea0Var, vk0Var);
    }
}
