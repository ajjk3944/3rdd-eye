package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j90 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12687a;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f12688b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f12689c;

    /* renamed from: d, reason: collision with root package name */
    public final js1 f12690d;

    /* renamed from: e, reason: collision with root package name */
    public final js1 f12691e;

    /* renamed from: f, reason: collision with root package name */
    public final js1 f12692f;
    public final js1 g;

    public j90(a10 a10Var, es1 es1Var, js1 js1Var, es1 es1Var2, es1 es1Var3, es1 es1Var4) {
        this.f12687a = 11;
        this.f12690d = a10Var;
        this.f12689c = es1Var;
        this.f12688b = js1Var;
        this.f12691e = es1Var2;
        this.f12692f = es1Var3;
        this.g = es1Var4;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f12687a) {
            case 0:
                a40 a40Var = (a40) this.f12690d;
                bw bwVar = new bw(((a10) a40Var.f9202b).b(), ((b60) a40Var.f9203c).b().g);
                Context contextB = ((a10) this.f12688b).b();
                dw dwVar = (dw) this.f12689c.a();
                qz qzVar = (qz) ((c90) this.f12692f).f10020b.f13427c;
                return new i90(bwVar, contextB, dwVar, qzVar == null ? null : qzVar.i(), (mi) this.f12691e.a(), ((v40) this.g).b());
            case 1:
                k10 k10Var = (k10) this.f12688b.a();
                y50 y50VarB = ((z50) this.f12690d).f19021b.b();
                e80 e80Var = ((f80) this.f12691e).f11057b;
                l90 l90Var = (l90) ((m20) this.f12692f).f13731b;
                k70 k70VarA = ((r30) this.f12689c).a();
                nj0 nj0Var = (nj0) ((es1) this.g).a();
                k10 k10Var2 = k10Var.f12924b;
                y50 y50Var = new y50(y50VarB);
                ne0 ne0Var = null;
                fk0 fk0Var = new fk0(0, ne0Var);
                ce1 ce1Var = new ce1(k70VarA, false, ne0Var, 10);
                fk0 fk0Var2 = new fk0(18, ne0Var);
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16270p4)).booleanValue()) {
                    ne0Var = new ne0(7);
                    ne0Var.f14280b = nj0Var;
                }
                al0.E(e80.class, e80Var);
                if (ne0Var == null) {
                    ne0Var = new ne0(7);
                }
                al0.E(l90.class, l90Var);
                q40 q40Var = (q40) new p10(k10Var2, fk0Var2, l90Var, new h80(18), e80Var, y50Var, ne0Var, fk0Var, ce1Var, null, null).f14849r.a();
                al0.z(q40Var);
                return q40Var;
            case 2:
                Context contextB2 = ((a10) this.f12688b).b();
                hq0 hq0VarB = ((b60) this.f12690d).b();
                hw hwVar = (hw) this.f12691e;
                ex exVar = fx.f11275b;
                al0.z(exVar);
                ex exVar2 = fx.f11274a;
                al0.z(exVar2);
                aw awVar = new aw(exVar, exVar2, new dg0((Context) ((xe0) hwVar.f11994b).f18379b.a(), exVar2, 0), es1.c((g40) hwVar.f11995c), 16, false);
                al0.z(exVar2);
                return new bg0(contextB2, hq0VarB, awVar, exVar2, (ScheduledExecutorService) this.f12689c.a(), (eh0) ((es1) this.f12692f).a(), (bs0) ((es1) this.g).a());
            case 3:
                return new hj0((k10) this.f12688b.a(), (l90) ((m20) this.f12690d).f13731b, ((z50) this.f12689c).f19021b.b(), ((f80) this.f12691e).f11057b, (nj0) ((es1) this.f12692f).a(), (ei0) ((es1) this.g).a());
            case 4:
                return new hj0((k10) this.f12688b.a(), ((z50) this.f12690d).f19021b.b(), ((gk0) this.f12689c).f11535b, ((f80) this.f12691e).f11057b, (nj0) ((es1) this.f12692f).a(), (ei0) ((es1) this.g).a());
            case 5:
                return new hj0((k10) this.f12688b.a(), ((z50) this.f12690d).f19021b.b(), ((f80) this.f12689c).f11057b, (eq0) ((z50) this.f12691e).f19021b.f18645d, (nj0) ((es1) this.f12692f).a(), (ei0) ((es1) this.g).a());
            case 6:
                ya.c0 c0VarA = ((x00) this.f12688b).a();
                Context contextB3 = ((a10) this.f12689c).b();
                ex exVar3 = fx.f11274a;
                al0.z(exVar3);
                return new zn0(c0VarA, contextB3, exVar3, (ScheduledExecutorService) this.f12691e.a(), new nk(((a10) ((f20) this.f12690d).f10966b).b(), 3), ((b60) this.f12692f).b(), ((g10) this.g).b());
            case 7:
                zw zwVar = (zw) this.f12688b.a();
                boolean z3 = ((iu) ((jo0) this.f12690d).f12805b.f34474c).f12481k;
                ex exVar4 = fx.f11274a;
                al0.z(exVar4);
                al0.z(((iu) ((jo0) this.f12691e).f12805b.f34474c).f12476d);
                return new ko0(zwVar, z3, exVar4, (ScheduledExecutorService) this.f12689c.a(), ((jo0) this.f12692f).f12805b.G(), ((iu) ((jo0) this.g).f12805b.f34474c).f12485o);
            case 8:
                return new po0((Context) ((gs1) this.f12690d).f11600a, (Executor) this.f12688b.a(), (k10) this.f12689c.a(), ((gp0) this.f12692f).b(), (oo0) ((es1) this.g).a(), new gq0(), ((g10) this.f12691e).b());
            case 9:
                return new qp0((Context) ((gs1) this.f12690d).f11600a, (Executor) this.f12688b.a(), (k10) this.f12689c.a(), ((gp0) this.f12691e).b(), (np0) ((es1) this.f12692f).a(), new gq0(), (eq0) ((es1) this.g).a());
            case 10:
                return new lq0((ct0) this.f12688b.a(), (at0) this.f12689c.a(), ((v40) this.g).b(), ((v40) this.f12690d).f17495b.v(), (t20) ((es1) this.f12692f).a(), (bs0) this.f12691e.a());
            case 11:
                Context contextB4 = ((a10) this.f12690d).b();
                ex exVar5 = fx.f11274a;
                al0.z(exVar5);
                return new ct0(contextB4, exVar5, (x81) ((es1) this.f12689c).a(), (za.l) this.f12688b.a(), (at0) ((es1) this.f12691e).a(), (cs0) ((es1) this.f12692f).a(), (t00) ((es1) this.g).a());
            case 12:
                return new e01((zc) ((gs1) this.f12690d).f11600a, (sz0) this.f12688b.a(), (zx0) ((gs1) this.f12691e).f11600a, (Context) ((gs1) this.f12692f).f11600a, (Map) ((gs1) this.g).f11600a, (g21) this.f12689c.a());
            case 13:
                s11 s11Var = (s11) ((es1) this.f12690d).a();
                f11 f11Var = (f11) ((es1) this.f12692f).a();
                i11 i11Var = (i11) ((es1) this.g).a();
                g21 g21Var = (g21) this.f12688b.a();
                dy0 dy0Var = (dy0) this.f12689c.a();
                sx0 sx0Var = (sx0) this.f12691e.a();
                return new t01(s11Var, f11Var, i11Var, g21Var, dy0Var, sx0Var.M().E(), sx0Var.M().F(), sx0Var.M().G());
            default:
                return new f11((Context) this.f12688b.a(), (ExecutorService) this.f12689c.a(), (sx0) this.f12691e.a(), (cy0) this.f12690d.a(), (g21) this.f12692f.a(), (h11) ((es1) this.g).a());
        }
    }

    public j90(a40 a40Var, a10 a10Var, es1 es1Var, c90 c90Var, fs1 fs1Var, v40 v40Var) {
        this.f12687a = 0;
        this.f12690d = a40Var;
        this.f12688b = a10Var;
        this.f12689c = es1Var;
        this.f12692f = c90Var;
        this.f12691e = fs1Var;
        this.g = v40Var;
    }

    public j90(es1 es1Var, es1 es1Var2, v40 v40Var, v40 v40Var2, es1 es1Var3, es1 es1Var4) {
        this.f12687a = 10;
        this.f12688b = es1Var;
        this.f12689c = es1Var2;
        this.g = v40Var;
        this.f12690d = v40Var2;
        this.f12692f = es1Var3;
        this.f12691e = es1Var4;
    }

    public j90(es1 es1Var, es1 es1Var2, es1 es1Var3, es1 es1Var4, es1 es1Var5, gs1 gs1Var) {
        this.f12687a = 13;
        this.f12690d = es1Var;
        this.f12692f = es1Var2;
        this.g = es1Var3;
        this.f12688b = es1Var4;
        this.f12689c = es1Var5;
        this.f12691e = gs1Var;
    }

    public j90(gs1 gs1Var, es1 es1Var, gs1 gs1Var2, gp0 gp0Var, es1 es1Var2, g10 g10Var) {
        this.f12687a = 8;
        this.f12690d = gs1Var;
        this.f12688b = es1Var;
        this.f12689c = gs1Var2;
        this.f12692f = gp0Var;
        this.g = es1Var2;
        this.f12691e = g10Var;
    }

    public j90(gs1 gs1Var, es1 es1Var, gs1 gs1Var2, gp0 gp0Var, es1 es1Var2, es1 es1Var3) {
        this.f12687a = 9;
        this.f12690d = gs1Var;
        this.f12688b = es1Var;
        this.f12689c = gs1Var2;
        this.f12691e = gp0Var;
        this.f12692f = es1Var2;
        this.g = es1Var3;
    }

    public j90(gs1 gs1Var, es1 es1Var, gs1 gs1Var2, gs1 gs1Var3, gs1 gs1Var4, es1 es1Var2) {
        this.f12687a = 12;
        this.f12690d = gs1Var;
        this.f12688b = es1Var;
        this.f12691e = gs1Var2;
        this.f12692f = gs1Var3;
        this.g = gs1Var4;
        this.f12689c = es1Var2;
    }

    public j90(js1 js1Var, z50 z50Var, f80 f80Var, m20 m20Var, js1 js1Var2, es1 es1Var) {
        this.f12687a = 1;
        this.f12688b = js1Var;
        this.f12690d = z50Var;
        this.f12691e = f80Var;
        this.f12692f = m20Var;
        this.f12689c = js1Var2;
        this.g = es1Var;
    }

    public /* synthetic */ j90(js1 js1Var, fs1 fs1Var, fs1 fs1Var2, fs1 fs1Var3, es1 es1Var, es1 es1Var2, int i4) {
        this.f12687a = i4;
        this.f12688b = js1Var;
        this.f12690d = fs1Var;
        this.f12689c = fs1Var2;
        this.f12691e = fs1Var3;
        this.f12692f = es1Var;
        this.g = es1Var2;
    }

    public /* synthetic */ j90(js1 js1Var, fs1 fs1Var, fs1 fs1Var2, js1 js1Var2, js1 js1Var3, js1 js1Var4, int i4) {
        this.f12687a = i4;
        this.f12688b = js1Var;
        this.f12690d = fs1Var;
        this.f12691e = fs1Var2;
        this.f12689c = js1Var2;
        this.f12692f = js1Var3;
        this.g = js1Var4;
    }

    public /* synthetic */ j90(js1 js1Var, js1 js1Var2, js1 js1Var3, js1 js1Var4, js1 js1Var5, js1 js1Var6, int i4) {
        this.f12687a = i4;
        this.f12688b = js1Var;
        this.f12689c = js1Var2;
        this.f12691e = js1Var3;
        this.f12690d = js1Var4;
        this.f12692f = js1Var5;
        this.g = js1Var6;
    }
}
