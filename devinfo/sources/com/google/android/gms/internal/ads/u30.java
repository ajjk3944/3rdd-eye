package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u30 extends o40 {

    /* renamed from: l, reason: collision with root package name */
    public final Context f17042l;

    /* renamed from: m, reason: collision with root package name */
    public final View f17043m;

    /* renamed from: n, reason: collision with root package name */
    public final qz f17044n;

    /* renamed from: o, reason: collision with root package name */
    public final xp0 f17045o;

    /* renamed from: p, reason: collision with root package name */
    public final n40 f17046p;

    /* renamed from: q, reason: collision with root package name */
    public final ka0 f17047q;

    /* renamed from: r, reason: collision with root package name */
    public final u80 f17048r;

    /* renamed from: s, reason: collision with root package name */
    public final cs1 f17049s;

    /* renamed from: t, reason: collision with root package name */
    public final Executor f17050t;

    /* renamed from: u, reason: collision with root package name */
    public va.c3 f17051u;

    public u30(c1.o oVar, Context context, xp0 xp0Var, View view, qz qzVar, n40 n40Var, ka0 ka0Var, u80 u80Var, cs1 cs1Var, Executor executor) {
        super(oVar);
        this.f17042l = context;
        this.f17043m = view;
        this.f17044n = qzVar;
        this.f17045o = xp0Var;
        this.f17046p = n40Var;
        this.f17047q = ka0Var;
        this.f17048r = u80Var;
        this.f17049s = cs1Var;
        this.f17050t = executor;
    }

    @Override // com.google.android.gms.internal.ads.o40
    public final void a() {
        this.f17050t.execute(new s30(0, this));
        super.a();
    }

    public final xp0 c() {
        va.c3 c3Var = this.f17051u;
        if (c3Var != null) {
            return c3Var.f36045i ? new xp0(-3, 0, true) : new xp0(c3Var.f36042e, c3Var.f36039b, false);
        }
        wp0 wp0Var = this.f14533b;
        if (wp0Var.f18077c0) {
            for (String str : wp0Var.f18072a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f17043m;
            return new xp0(view.getWidth(), view.getHeight(), false);
        }
        return (xp0) wp0Var.f18104r.get(0);
    }

    public final int d() {
        pk pkVar = sk.U8;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue() && this.f14533b.f18084g0) {
            if (!((Boolean) sVar.f36166c.a(sk.V8)).booleanValue()) {
                return 0;
            }
        }
        return ((yp0) this.f14532a.f10544b.f9452c).f18821c;
    }

    public final void e() {
        u80 u80Var = this.f17048r;
        synchronized (u80Var) {
            u80Var.p1(h80.j);
        }
    }
}
