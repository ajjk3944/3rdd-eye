package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Yi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0830Yi extends AbstractC1812rj {

    /* renamed from: l, reason: collision with root package name */
    public final Context f12653l;

    /* renamed from: m, reason: collision with root package name */
    public final View f12654m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0828Yg f12655n;

    /* renamed from: o, reason: collision with root package name */
    public final Rt f12656o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC1759qj f12657p;

    /* renamed from: q, reason: collision with root package name */
    public final C1708pm f12658q;

    /* renamed from: r, reason: collision with root package name */
    public final C2138xl f12659r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC1692pN f12660s;

    /* renamed from: t, reason: collision with root package name */
    public final Executor f12661t;

    /* renamed from: u, reason: collision with root package name */
    public q2.d1 f12662u;

    public C0830Yi(K4.j jVar, Context context, Rt rt, View view, InterfaceC0828Yg interfaceC0828Yg, InterfaceC1759qj interfaceC1759qj, C1708pm c1708pm, C2138xl c2138xl, InterfaceC1692pN interfaceC1692pN, Executor executor) {
        super(jVar);
        this.f12653l = context;
        this.f12654m = view;
        this.f12655n = interfaceC0828Yg;
        this.f12656o = rt;
        this.f12657p = interfaceC1759qj;
        this.f12658q = c1708pm;
        this.f12659r = c2138xl;
        this.f12660s = interfaceC1692pN;
        this.f12661t = executor;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1812rj
    public final void a() {
        this.f12661t.execute(new RunnableC0558Ii(1, this));
        super.a();
    }

    public final Rt c() {
        q2.d1 d1Var = this.f12662u;
        if (d1Var != null) {
            return d1Var.i ? new Rt(-3, 0, true) : new Rt(d1Var.f23192e, d1Var.f23189b, false);
        }
        Qt qt = this.f16601b;
        if (qt.f10761c0) {
            for (String str : qt.f10757a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f12654m;
            return new Rt(view.getWidth(), view.getHeight(), false);
        }
        return (Rt) qt.f10789r.get(0);
    }

    public final int d() {
        E9 e9 = H9.U8;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue() && this.f16601b.f10769g0) {
            if (!((Boolean) c2841s.f23270c.a(H9.V8)).booleanValue()) {
                return 0;
            }
        }
        return ((St) this.f16600a.f12510b.f15174c).f11270c;
    }

    public final void e() {
        C2138xl c2138xl = this.f12659r;
        synchronized (c2138xl) {
            c2138xl.C1(C1437kl.f15261k);
        }
    }
}
