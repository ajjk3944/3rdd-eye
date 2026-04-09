package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z40 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19002a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final es1 f19003b;

    /* renamed from: c, reason: collision with root package name */
    public final es1 f19004c;

    /* renamed from: d, reason: collision with root package name */
    public final es1 f19005d;

    /* renamed from: e, reason: collision with root package name */
    public final js1 f19006e;

    /* renamed from: f, reason: collision with root package name */
    public final js1 f19007f;
    public final js1 g;

    /* renamed from: h, reason: collision with root package name */
    public final js1 f19008h;

    /* renamed from: i, reason: collision with root package name */
    public final js1 f19009i;
    public final js1 j;

    /* renamed from: k, reason: collision with root package name */
    public final js1 f19010k;

    /* renamed from: l, reason: collision with root package name */
    public final js1 f19011l;

    public z40(v30 v30Var, b60 b60Var, es1 es1Var, hw hwVar, w50 w50Var, es1 es1Var2, gs1 gs1Var, hw hwVar2, w50 w50Var2, hw hwVar3, es1 es1Var3) {
        this.f19006e = v30Var;
        this.f19007f = b60Var;
        this.f19003b = es1Var;
        this.g = hwVar;
        this.f19008h = w50Var;
        this.f19004c = es1Var2;
        this.f19009i = gs1Var;
        this.j = hwVar2;
        this.f19010k = w50Var2;
        this.f19011l = hwVar3;
        this.f19005d = es1Var3;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f19002a) {
            case 0:
                cg0 cg0VarC = ((v30) this.f19006e).c();
                hq0 hq0VarB = ((b60) this.f19007f).b();
                sr0 sr0Var = (sr0) this.f19003b.a();
                hw hwVar = (hw) this.g;
                ce1 ce1Var = new ce1(((hs1) hwVar.f11994b).a(), false, ((hs1) hwVar.f11995c).a(), 9);
                rj0 rj0VarC = ((w50) this.f19008h).c();
                x70 x70Var = (x70) this.f19004c.a();
                dq0 dq0Var = (dq0) ((gs1) this.f19009i).f11600a;
                hw hwVar2 = (hw) this.j;
                ex exVar = fx.f11274a;
                al0.z(exVar);
                pq0 pq0Var = new pq0(exVar, ((f20) hwVar2.f11994b).b(), es1.c((g40) hwVar2.f11995c), false, 17);
                v50 v50VarB = ((w50) this.f19010k).b();
                al0.z(exVar);
                hw hwVar3 = (hw) this.f19011l;
                Map map = ((is1) hwVar3.f11994b).f10546a;
                al0.z(exVar);
                return new y40(cg0VarC, hq0VarB, sr0Var, ce1Var, rj0VarC, x70Var, dq0Var, pq0Var, v50VarB, exVar, new mg0(map, exVar, new m70(((f60) hwVar3.f11995c).f11019b.a())), (ei0) this.f19005d.a());
            case 1:
                return b();
            case 2:
                return new db0((ir) ((eb0) this.f19006e).f10753b.f15075d, (jr) ((eb0) this.g).f10753b.f15074c, (lr) ((eb0) this.f19008h).f10753b.f15073b, (o60) this.f19003b.a(), (f70) this.f19004c.a(), (e60) this.f19005d.a(), (s80) ((es1) this.f19009i).a(), (Context) this.j.a(), ((v40) this.f19010k).b(), ((g10) this.f19011l).b(), ((b60) this.f19007f).b());
            case 3:
                Context context = (Context) this.f19003b.a();
                oe oeVar = (oe) this.f19006e.a();
                fl flVar = (fl) this.f19004c.a();
                za.a aVarB = ((g10) this.f19007f).b();
                hl hlVar = ((y10) this.g).f18600a;
                return new wc0(context, oeVar, flVar, aVarB, y10.b(), (li) this.f19005d.a(), (k70) ((fs1) this.f19008h).a(), (qh0) this.f19009i.a(), (jq0) this.j.a(), (qd0) this.f19010k.a(), (o00) this.f19011l.a());
            default:
                return new uj0((e60) this.f19003b.a(), (s80) this.f19004c.a(), (o60) this.f19005d.a(), (t60) ((es1) this.f19006e).a(), (v60) ((es1) this.f19007f).a(), (m60) ((es1) this.g).a(), (v70) this.f19008h.a(), (z80) ((es1) this.f19009i).a(), (c70) ((es1) this.j).a(), (w80) ((es1) this.f19010k).a(), (s70) ((es1) this.f19011l).a());
        }
    }

    public c1.o b() {
        return new c1.o(((v40) this.f19006e).c(), ((v40) this.f19007f).b(), (s60) this.f19003b.a(), (v60) this.g.a(), (oo0) ((g80) this.f19008h).f11400a.f10741o, ((g40) this.f19009i).b(), (p70) this.f19004c.a(), new x60(((f60) this.j).f11019b.a()), (o80) this.f19005d.a(), (o50) ((es1) this.f19010k).a(), (be0) this.f19011l.a());
    }

    public z40(v40 v40Var, v40 v40Var2, es1 es1Var, js1 js1Var, g80 g80Var, g40 g40Var, es1 es1Var2, f60 f60Var, es1 es1Var3, es1 es1Var4, es1 es1Var5) {
        this.f19006e = v40Var;
        this.f19007f = v40Var2;
        this.f19003b = es1Var;
        this.g = js1Var;
        this.f19008h = g80Var;
        this.f19009i = g40Var;
        this.f19004c = es1Var2;
        this.j = f60Var;
        this.f19005d = es1Var3;
        this.f19010k = es1Var4;
        this.f19011l = es1Var5;
    }

    public z40(eb0 eb0Var, eb0 eb0Var2, eb0 eb0Var3, es1 es1Var, es1 es1Var2, es1 es1Var3, es1 es1Var4, es1 es1Var5, v40 v40Var, g10 g10Var, b60 b60Var) {
        this.f19006e = eb0Var;
        this.g = eb0Var2;
        this.f19008h = eb0Var3;
        this.f19003b = es1Var;
        this.f19004c = es1Var2;
        this.f19005d = es1Var3;
        this.f19009i = es1Var4;
        this.j = es1Var5;
        this.f19010k = v40Var;
        this.f19011l = g10Var;
        this.f19007f = b60Var;
    }

    public z40(es1 es1Var, es1 es1Var2, es1 es1Var3, es1 es1Var4, es1 es1Var5, es1 es1Var6, es1 es1Var7, es1 es1Var8, es1 es1Var9, es1 es1Var10, es1 es1Var11) {
        this.f19003b = es1Var;
        this.f19004c = es1Var2;
        this.f19005d = es1Var3;
        this.f19006e = es1Var4;
        this.f19007f = es1Var5;
        this.g = es1Var6;
        this.f19008h = es1Var7;
        this.f19009i = es1Var8;
        this.j = es1Var9;
        this.f19010k = es1Var10;
        this.f19011l = es1Var11;
    }

    public z40(es1 es1Var, js1 js1Var, es1 es1Var2, js1 js1Var2, js1 js1Var3, es1 es1Var3, fs1 fs1Var, js1 js1Var4, js1 js1Var5, js1 js1Var6, js1 js1Var7) {
        this.f19003b = es1Var;
        this.f19006e = js1Var;
        this.f19004c = es1Var2;
        this.f19007f = js1Var2;
        this.g = js1Var3;
        this.f19005d = es1Var3;
        this.f19008h = fs1Var;
        this.f19009i = js1Var4;
        this.j = js1Var5;
        this.f19010k = js1Var6;
        this.f19011l = js1Var7;
    }
}
