package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Zi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0847Zi implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12937a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f12938b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f12939c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2069wN f12940d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2069wN f12941e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2069wN f12942f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2069wN f12943g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC2069wN f12944h;
    public final InterfaceC2069wN i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC2069wN f12945j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2069wN f12946k;

    public C0847Zi(C0457Cj c0457Cj, C1799rN c1799rN, C1003cj c1003cj, C1003cj c1003cj2, C1003cj c1003cj3, C1003cj c1003cj4, C0731Sl c0731Sl, C1799rN c1799rN2, C0922bA c0922bA, C1799rN c1799rN3) {
        this.f12942f = c0457Cj;
        this.f12938b = c1799rN;
        this.f12943g = c1003cj;
        this.f12944h = c1003cj2;
        this.i = c1003cj3;
        this.f12945j = c1003cj4;
        this.f12939c = c0731Sl;
        this.f12940d = c1799rN2;
        this.f12946k = c0922bA;
        this.f12941e = c1799rN3;
    }

    public C0830Yi a() {
        K4.j jVarA = ((C0457Cj) this.f12942f).a();
        Context context = (Context) this.f12938b.c();
        Rt rt = (Rt) ((C1003cj) this.f12943g).f13663b.f15175d;
        Cr.v(rt);
        View view = (View) ((C1003cj) this.f12944h).f13663b.f15174c;
        Cr.v(view);
        InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) ((C1003cj) this.i).f13663b.f15176e;
        InterfaceC1759qj interfaceC1759qj = (InterfaceC1759qj) ((C1003cj) this.f12945j).f13663b.f15173b;
        C1708pm c1708pm = (C1708pm) ((C0731Sl) this.f12939c).f11226a.f10691b;
        Cr.v(c1708pm);
        return new C0830Yi(jVarA, context, rt, view, interfaceC0828Yg, interfaceC1759qj, c1708pm, (C2138xl) this.f12940d.c(), C1799rN.b((C0922bA) this.f12946k), (Executor) this.f12941e.c());
    }

    public C1173fp b() {
        C0710Rh c0710Rh = (C0710Rh) this.f12938b.c();
        Context contextA = ((C0540Hh) this.f12939c).a();
        C2951a c2951aA = ((C0642Nh) this.f12940d).a();
        C0960bu c0960buA = ((C1113ek) this.f12942f).a();
        C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
        Cr.v(c0623Mf);
        return new C1173fp(c0710Rh, contextA, c2951aA, c0960buA, c0623Mf, (String) ((InterfaceC1853sN) this.f12943g).c(), (Xu) this.f12941e.c(), (C0750Tn) this.f12944h.c(), new W9(15), (ScheduledExecutorService) this.i.c(), (C2202yv) this.f12945j.c(), new C0713Rk(((C1329ik) this.f12946k).f14775b.c()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f12937a) {
            case 0:
                return a();
            case 1:
                return new C0851Zm(((C1113ek) this.f12942f).a(), (Executor) this.f12938b.c(), (C0427An) this.f12939c.c(), (Context) this.f12940d.c(), (C0784Vn) this.f12941e.c(), (C2202yv) this.f12943g.c(), (C0633Mp) this.f12944h.c(), (C1709pn) this.i.c(), (C0750Tn) this.f12945j.c(), (C1280ho) this.f12946k.c());
            case 2:
                return new C1655on((C1276hk) this.f12938b.c(), (C2191yk) this.f12939c.c(), (C0492Ek) this.f12940d.c(), (C0543Hk) this.f12941e.c(), (C0849Zk) this.f12942f.c(), (C2030vl) this.f12943g.c(), (C0784Vn) this.f12944h.c(), (C2202yv) this.i.c(), (C0633Mp) this.f12945j.c(), (C2189yi) this.f12946k.c());
            case 3:
                return b();
            case 4:
                return d();
            default:
                return new Xy((ID) this.f12938b.c(), (Yy) this.f12939c.c(), (C1291hz) this.f12940d.c(), (EnumC1450ky) ((C1907tN) this.f12942f).f16902a, (String) ((C1907tN) this.f12943g).f16902a, (S5) ((C1907tN) this.f12944h).f16902a, (C2123xN) this.i, (C2123xN) this.f12945j, (C2123xN) this.f12946k, (C1948uA) this.f12941e.c());
        }
    }

    public C0651Nq d() {
        return new C0651Nq((C0710Rh) this.f12938b.c(), ((C1004ck) this.f12942f).f13665b.b(), ((C1336ir) this.f12943g).f14809b, ((C1330il) this.f12944h).f14777b, (C0697Ql) ((C1811ri) this.i).f16599b, (C0679Pk) ((C1651oj) this.f12945j).f16023a.f13150b, (ViewGroup) ((L6) ((C1811ri) this.f12946k).f16599b).f9620b, (C0896al) this.f12939c.c(), (C0702Qq) this.f12940d.c(), (C1228gq) this.f12941e.c());
    }

    public C0847Zi(C1113ek c1113ek, InterfaceC2069wN interfaceC2069wN, InterfaceC2069wN interfaceC2069wN2, InterfaceC2069wN interfaceC2069wN3, InterfaceC2069wN interfaceC2069wN4, InterfaceC2069wN interfaceC2069wN5, InterfaceC2069wN interfaceC2069wN6, InterfaceC2069wN interfaceC2069wN7, InterfaceC2069wN interfaceC2069wN8, InterfaceC2069wN interfaceC2069wN9) {
        this.f12942f = c1113ek;
        this.f12938b = interfaceC2069wN;
        this.f12939c = interfaceC2069wN2;
        this.f12940d = interfaceC2069wN3;
        this.f12941e = interfaceC2069wN4;
        this.f12943g = interfaceC2069wN5;
        this.f12944h = interfaceC2069wN6;
        this.i = interfaceC2069wN7;
        this.f12945j = interfaceC2069wN8;
        this.f12946k = interfaceC2069wN9;
    }

    public C0847Zi(C1799rN c1799rN, C1799rN c1799rN2, C1799rN c1799rN3, C1799rN c1799rN4, C1799rN c1799rN5, C1799rN c1799rN6, C1799rN c1799rN7, C1799rN c1799rN8, C1799rN c1799rN9, C1799rN c1799rN10) {
        this.f12938b = c1799rN;
        this.f12939c = c1799rN2;
        this.f12940d = c1799rN3;
        this.f12941e = c1799rN4;
        this.f12942f = c1799rN5;
        this.f12943g = c1799rN6;
        this.f12944h = c1799rN7;
        this.i = c1799rN8;
        this.f12945j = c1799rN9;
        this.f12946k = c1799rN10;
    }

    public C0847Zi(C1799rN c1799rN, C1799rN c1799rN2, C1799rN c1799rN3, C1907tN c1907tN, C1907tN c1907tN2, C1907tN c1907tN3, C2123xN c2123xN, C2123xN c2123xN2, C2123xN c2123xN3, C1799rN c1799rN4) {
        this.f12938b = c1799rN;
        this.f12939c = c1799rN2;
        this.f12940d = c1799rN3;
        this.f12942f = c1907tN;
        this.f12943g = c1907tN2;
        this.f12944h = c1907tN3;
        this.i = c2123xN;
        this.f12945j = c2123xN2;
        this.f12946k = c2123xN3;
        this.f12941e = c1799rN4;
    }

    public C0847Zi(InterfaceC2069wN interfaceC2069wN, C1004ck c1004ck, C1336ir c1336ir, C1330il c1330il, C1811ri c1811ri, C1651oj c1651oj, C1811ri c1811ri2, InterfaceC2069wN interfaceC2069wN2, InterfaceC2069wN interfaceC2069wN3, InterfaceC2069wN interfaceC2069wN4) {
        this.f12938b = interfaceC2069wN;
        this.f12942f = c1004ck;
        this.f12943g = c1336ir;
        this.f12944h = c1330il;
        this.i = c1811ri;
        this.f12945j = c1651oj;
        this.f12946k = c1811ri2;
        this.f12939c = interfaceC2069wN2;
        this.f12940d = interfaceC2069wN3;
        this.f12941e = interfaceC2069wN4;
    }

    public C0847Zi(InterfaceC2069wN interfaceC2069wN, InterfaceC2069wN interfaceC2069wN2, InterfaceC2069wN interfaceC2069wN3, C1113ek c1113ek, InterfaceC1853sN interfaceC1853sN, InterfaceC2069wN interfaceC2069wN4, InterfaceC2069wN interfaceC2069wN5, InterfaceC2069wN interfaceC2069wN6, InterfaceC2069wN interfaceC2069wN7, C1329ik c1329ik) {
        this.f12938b = interfaceC2069wN;
        this.f12939c = interfaceC2069wN2;
        this.f12940d = interfaceC2069wN3;
        this.f12942f = c1113ek;
        this.f12943g = interfaceC1853sN;
        this.f12941e = interfaceC2069wN4;
        this.f12944h = interfaceC2069wN5;
        this.i = interfaceC2069wN6;
        this.f12945j = interfaceC2069wN7;
        this.f12946k = c1329ik;
    }
}
