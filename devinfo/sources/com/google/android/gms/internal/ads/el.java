package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class el implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10813a;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f10814b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f10815c;

    /* renamed from: d, reason: collision with root package name */
    public final js1 f10816d;

    /* renamed from: e, reason: collision with root package name */
    public final js1 f10817e;

    public el(a10 a10Var, g10 g10Var, es1 es1Var, es1 es1Var2) {
        this.f10813a = 15;
        this.f10816d = a10Var;
        this.f10817e = g10Var;
        this.f10814b = es1Var;
        this.f10815c = es1Var2;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f10813a) {
            case 0:
                return b();
            case 1:
                sr0 sr0Var = (sr0) ((es1) this.f10814b).a();
                w81 w81Var = (w81) this.f10815c.a();
                zv zvVar = (zv) this.f10816d;
                return new ck0(sr0Var, w81Var, ((g30) this.f10817e).b(), new ni0(0, (Context) zvVar.f19187b.a(), (n10) zvVar.f19188c.f11600a), 0);
            case 2:
                sr0 sr0Var2 = (sr0) ((es1) this.f10814b).a();
                w81 w81Var2 = (w81) this.f10815c.a();
                zv zvVar2 = (zv) this.f10816d;
                return new ck0(sr0Var2, w81Var2, ((g30) this.f10817e).b(), new si0((Context) zvVar2.f19187b.a(), (p10) zvVar2.f19188c.f11600a), 0);
            case 3:
                return new h40(((v40) this.f10817e).b(), (o60) ((es1) this.f10814b).a(), (a70) ((es1) this.f10815c).a(), (f70) ((es1) this.f10816d).a());
            case 4:
                return new d50((tb.a) this.f10815c.a(), (e50) this.f10816d.a(), ((b60) this.f10817e).b(), (String) ((es1) this.f10814b).a());
            case 5:
                sr0 sr0Var3 = (sr0) ((es1) this.f10814b).a();
                w81 w81Var3 = (w81) this.f10815c.a();
                zv zvVar3 = (zv) this.f10816d;
                return new ck0(sr0Var3, w81Var3, ((g30) this.f10817e).b(), new ni0(1, (Context) zvVar3.f19187b.a(), (t10) zvVar3.f19188c.f11600a), 0);
            case 6:
                wc0 wc0Var = (wc0) this.f10815c.a();
                hc0 hc0Var = (hc0) ((t90) this.f10816d).f16758b.f9452c;
                al0.z(hc0Var);
                m30 m30Var = (m30) ((es1) this.f10814b).a();
                r90 r90Var = (r90) ((u90) this.f10817e).f17131b.a();
                al0.z(r90Var);
                return new wa0(wc0Var, hc0Var, m30Var, r90Var);
            case 7:
                return new ac0(((a10) this.f10814b).b(), ((m20) this.f10815c).b(), ((qa0) this.f10816d).b(), (ca0) ((zm0) this.f10817e).a());
            case 8:
                return new bc0((String) ((v40) this.f10814b).f17495b.f15075d, (ca0) ((zm0) this.f10815c).a(), ((m20) this.f10816d).b(), (qd0) this.f10817e.a());
            case 9:
                sr0 sr0Var4 = (sr0) ((es1) this.f10814b).a();
                w81 w81Var4 = (w81) this.f10815c.a();
                zv zvVar4 = (zv) this.f10816d;
                return new ck0(sr0Var4, w81Var4, ((g30) this.f10817e).b(), new ni0(2, (Context) zvVar4.f19187b.a(), (w10) zvVar4.f19188c.f11600a), 0);
            case 10:
                return new sf0((rf0) ((es1) this.f10814b).a(), (qd0) ((es1) this.f10815c).a(), ((a10) this.f10816d).b(), ((x00) this.f10817e).a());
            case 11:
                return new qh0(((a10) this.f10816d).b(), (lh0) ((es1) this.f10814b).a(), (za.l) this.f10817e.a(), (qd0) ((es1) this.f10815c).a());
            case 12:
                return c();
            case 13:
                return new ck0((sr0) ((es1) this.f10814b).a(), (w81) this.f10815c.a(), (xk) ((gk0) this.f10816d).f11535b.f11194b, new ne0(9, (t10) ((ee0) this.f10817e).f10768b.f11600a), 1);
            case 14:
                return d();
            case 15:
                return new cs0(((a10) this.f10816d).b(), ((g10) this.f10817e).b(), (dd0) ((es1) this.f10814b).a(), new hl(15), (t00) ((es1) this.f10815c).a());
            case 16:
                return new mt0((rt0) ((es1) this.f10814b).a(), ((d10) this.f10816d).b(), ((a10) this.f10817e).b(), (tb.a) ((es1) this.f10815c).a());
            default:
                return new ny0(es1.c((ks1) this.f10815c), es1.c((ks1) this.f10816d), (ExecutorService) ((gs1) this.f10817e).f11600a, es1.c((es1) this.f10814b));
        }
    }

    public dl b() {
        return new dl((ScheduledExecutorService) ((es1) this.f10814b).a(), (fb.z) ((es1) this.f10815c).a(), (fb.v) ((es1) this.f10816d).a(), (ud0) ((es1) this.f10817e).a());
    }

    public ck0 c() {
        return new ck0((sr0) ((es1) this.f10814b).a(), (w81) this.f10815c.a(), (bi0) this.f10816d.a(), (fi0) ((fs1) this.f10817e).a(), 0);
    }

    public tn0 d() {
        Context contextB = ((a10) this.f10815c).b();
        ex exVar = fx.f11274a;
        al0.z(exVar);
        return new tn0(contextB, exVar, ((ks1) this.f10816d).a(), (bs0) ((es1) this.f10814b).a(), (qd0) this.f10817e.a());
    }

    public el(a10 a10Var, es1 es1Var, js1 js1Var, es1 es1Var2) {
        this.f10813a = 11;
        this.f10816d = a10Var;
        this.f10814b = es1Var;
        this.f10817e = js1Var;
        this.f10815c = es1Var2;
    }

    public el(v40 v40Var, es1 es1Var, es1 es1Var2, es1 es1Var3) {
        this.f10813a = 3;
        this.f10817e = v40Var;
        this.f10814b = es1Var;
        this.f10815c = es1Var2;
        this.f10816d = es1Var3;
    }

    public el(es1 es1Var, d10 d10Var, a10 a10Var, es1 es1Var2) {
        this.f10813a = 16;
        this.f10814b = es1Var;
        this.f10816d = d10Var;
        this.f10817e = a10Var;
        this.f10815c = es1Var2;
    }

    public /* synthetic */ el(js1 js1Var, fs1 fs1Var, es1 es1Var, js1 js1Var2, int i4) {
        this.f10813a = i4;
        this.f10815c = js1Var;
        this.f10816d = fs1Var;
        this.f10814b = es1Var;
        this.f10817e = js1Var2;
    }

    public /* synthetic */ el(js1 js1Var, js1 js1Var2, fs1 fs1Var, es1 es1Var, int i4) {
        this.f10813a = i4;
        this.f10815c = js1Var;
        this.f10816d = js1Var2;
        this.f10817e = fs1Var;
        this.f10814b = es1Var;
    }

    public /* synthetic */ el(js1 js1Var, js1 js1Var2, js1 js1Var3, js1 js1Var4, int i4) {
        this.f10813a = i4;
        this.f10814b = js1Var;
        this.f10815c = js1Var2;
        this.f10816d = js1Var3;
        this.f10817e = js1Var4;
    }
}
