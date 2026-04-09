package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import t2.C2909E;

/* renamed from: com.google.android.gms.internal.ads.Ol, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0663Ol implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10230a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f10231b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f10232c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2069wN f10233d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1853sN f10234e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2069wN f10235f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2069wN f10236g;

    public C0663Ol(C0540Hh c0540Hh, C1799rN c1799rN, InterfaceC2069wN interfaceC2069wN, C1799rN c1799rN2, C1799rN c1799rN3, C1799rN c1799rN4) {
        this.f10230a = 9;
        this.f10234e = c0540Hh;
        this.f10231b = c1799rN;
        this.f10232c = interfaceC2069wN;
        this.f10233d = c1799rN2;
        this.f10235f = c1799rN3;
        this.f10236g = c1799rN4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f10230a) {
            case 0:
                C2242zh c2242zh = (C2242zh) this.f10234e;
                C1485lf c1485lf = new C1485lf(((C0540Hh) c2242zh.f17895b).a(), ((C1113ek) c2242zh.f17896c).a().f13485g);
                Context contextA = ((C0540Hh) this.f10231b).a();
                C1593nf c1593nf = (C1593nf) this.f10232c.c();
                InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) ((C0510Fl) this.f10235f).f8180b.f10692c;
                return new C0646Nl(c1485lf, contextA, c1593nf, interfaceC0828Yg == null ? null : interfaceC0828Yg.t(), (B8) this.f10233d.c(), ((C2190yj) this.f10236g).a());
            case 1:
                Context contextA2 = ((C0540Hh) this.f10231b).a();
                C0960bu c0960buA = ((C1113ek) this.f10234e).a();
                C1808rf c1808rf = (C1808rf) this.f10235f;
                C0623Mf c0623Mf = AbstractC0640Nf.f10006b;
                Cr.v(c0623Mf);
                C0623Mf c0623Mf2 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf2);
                C1431kf c1431kf = new C1431kf(c0623Mf, c0623Mf2, new C1227gp((Context) ((C0733Sn) c1808rf.f16590b).f11246b.c(), c0623Mf2, 0), C1799rN.b((C1381jj) c1808rf.f16591c), 16, false);
                Cr.v(c0623Mf2);
                return new C1118ep(contextA2, c0960buA, c1431kf, c0623Mf2, (ScheduledExecutorService) this.f10232c.c(), (C0514Fp) this.f10233d.c(), (Xu) this.f10236g.c());
            case 2:
                return new C0600Kq((C0710Rh) this.f10231b.c(), ((C1004ck) this.f10234e).f13665b.b(), ((C1336ir) this.f10235f).f14809b, ((C1330il) this.f10236g).f14777b, (C0702Qq) this.f10232c.c(), (C1228gq) this.f10233d.c());
            case 3:
                return new C0600Kq((C0710Rh) this.f10231b.c(), ((C1004ck) this.f10234e).f13665b.b(), ((C1330il) this.f10235f).f14777b, (Yt) ((C1004ck) this.f10236g).f13665b.f13216d, (C0702Qq) this.f10232c.c(), (C1228gq) this.f10233d.c());
            case 4:
                C2909E c2909eC = ((C0489Eh) this.f10231b).c();
                Context contextA3 = ((C0540Hh) this.f10232c).a();
                C0623Mf c0623Mf3 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf3);
                return new Us(c2909eC, contextA3, c0623Mf3, (ScheduledExecutorService) this.f10233d.c(), new C2083wk(((C0540Hh) ((C0901aq) this.f10234e).f13232b).a()), ((C1113ek) this.f10235f).a(), ((C0642Nh) this.f10236g).a());
            case 5:
                C0538Hf c0538Hf = (C0538Hf) this.f10231b.c();
                boolean z6 = ((C1807re) ((C1013ct) this.f10234e).f13693b.f2570c).f16585k;
                C0623Mf c0623Mf4 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf4);
                Cr.v(((C1807re) ((C1013ct) this.f10233d).f13693b.f2570c).f16579d);
                return new C1067dt(c0538Hf, z6, c0623Mf4, (ScheduledExecutorService) this.f10232c.c(), ((C1013ct) this.f10235f).f13693b.x(), ((C1807re) ((C1013ct) this.f10236g).f13693b.f2570c).f16575C);
            case 6:
                return new C1445kt((Context) ((C1907tN) this.f10234e).f16902a, (Executor) this.f10231b.c(), (C0710Rh) this.f10232c.c(), ((C1927tq) this.f10235f).a(), (C1391jt) this.f10233d.c(), new C0905au(), ((C0642Nh) this.f10236g).a());
            case 7:
                return new Lt((Context) ((C1907tN) this.f10234e).f16902a, (Executor) this.f10231b.c(), (C0710Rh) this.f10232c.c(), ((C1927tq) this.f10235f).a(), (It) this.f10233d.c(), new C0905au(), (Yt) this.f10236g.c());
            case 8:
                return new C1178fu((C2202yv) this.f10231b.c(), (C2094wv) this.f10232c.c(), ((C2190yj) this.f10236g).a(), ((C2190yj) this.f10234e).f17749b.w(), (C2189yi) this.f10233d.c(), (Xu) this.f10235f.c());
            case 9:
                Context contextA4 = ((C0540Hh) this.f10234e).a();
                C0623Mf c0623Mf5 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf5);
                return new C2202yv(contextA4, c0623Mf5, (JD) this.f10231b.c(), (u2.n) this.f10232c.c(), (C2094wv) this.f10233d.c(), (Yu) this.f10235f.c(), (C0421Ah) this.f10236g.c());
            default:
                return new C1936tz((S5) ((C1907tN) this.f10234e).f16902a, (C1291hz) this.f10231b.c(), (EnumC1450ky) ((C1907tN) this.f10233d).f16902a, (Context) ((C1907tN) this.f10235f).f16902a, (Map) ((C1907tN) this.f10236g).f16902a, (C1948uA) this.f10232c.c());
        }
    }

    public C0663Ol(C1799rN c1799rN, C1013ct c1013ct, C1013ct c1013ct2, C1799rN c1799rN2, C1013ct c1013ct3, C1013ct c1013ct4) {
        this.f10230a = 5;
        this.f10231b = c1799rN;
        this.f10234e = c1013ct;
        this.f10233d = c1013ct2;
        this.f10232c = c1799rN2;
        this.f10235f = c1013ct3;
        this.f10236g = c1013ct4;
    }

    public C0663Ol(C1799rN c1799rN, C1799rN c1799rN2, C2190yj c2190yj, C2190yj c2190yj2, C1799rN c1799rN3, C1799rN c1799rN4) {
        this.f10230a = 8;
        this.f10231b = c1799rN;
        this.f10232c = c1799rN2;
        this.f10236g = c2190yj;
        this.f10234e = c2190yj2;
        this.f10233d = c1799rN3;
        this.f10235f = c1799rN4;
    }

    public /* synthetic */ C0663Ol(InterfaceC1853sN interfaceC1853sN, InterfaceC2069wN interfaceC2069wN, Object obj, InterfaceC1853sN interfaceC1853sN2, InterfaceC2069wN interfaceC2069wN2, InterfaceC2069wN interfaceC2069wN3, int i) {
        this.f10230a = i;
        this.f10234e = interfaceC1853sN;
        this.f10231b = interfaceC2069wN;
        this.f10232c = (InterfaceC2069wN) obj;
        this.f10235f = interfaceC1853sN2;
        this.f10233d = interfaceC2069wN2;
        this.f10236g = interfaceC2069wN3;
    }

    public /* synthetic */ C0663Ol(C1907tN c1907tN, C1004ck c1004ck, InterfaceC1853sN interfaceC1853sN, InterfaceC1853sN interfaceC1853sN2, C1799rN c1799rN, C1799rN c1799rN2, int i) {
        this.f10230a = i;
        this.f10231b = c1907tN;
        this.f10234e = c1004ck;
        this.f10235f = interfaceC1853sN;
        this.f10236g = interfaceC1853sN2;
        this.f10232c = c1799rN;
        this.f10233d = c1799rN2;
    }

    public C0663Ol(C1907tN c1907tN, C1799rN c1799rN, C1907tN c1907tN2, C1907tN c1907tN3, C1907tN c1907tN4, C1799rN c1799rN2) {
        this.f10230a = 10;
        this.f10234e = c1907tN;
        this.f10231b = c1799rN;
        this.f10233d = c1907tN2;
        this.f10235f = c1907tN3;
        this.f10236g = c1907tN4;
        this.f10232c = c1799rN2;
    }

    public C0663Ol(InterfaceC2069wN interfaceC2069wN, C1113ek c1113ek, C1808rf c1808rf, InterfaceC2069wN interfaceC2069wN2, InterfaceC2069wN interfaceC2069wN3, InterfaceC2069wN interfaceC2069wN4) {
        this.f10230a = 1;
        this.f10231b = interfaceC2069wN;
        this.f10234e = c1113ek;
        this.f10235f = c1808rf;
        this.f10232c = interfaceC2069wN2;
        this.f10233d = interfaceC2069wN3;
        this.f10236g = interfaceC2069wN4;
    }

    public C0663Ol(InterfaceC2069wN interfaceC2069wN, InterfaceC2069wN interfaceC2069wN2, InterfaceC2069wN interfaceC2069wN3, C0901aq c0901aq, C1113ek c1113ek, InterfaceC2069wN interfaceC2069wN4) {
        this.f10230a = 4;
        this.f10231b = interfaceC2069wN;
        this.f10232c = interfaceC2069wN2;
        this.f10233d = interfaceC2069wN3;
        this.f10234e = c0901aq;
        this.f10235f = c1113ek;
        this.f10236g = interfaceC2069wN4;
    }
}
