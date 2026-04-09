package com.google.android.gms.internal.ads;

import A2.C0127o;
import android.content.Context;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import q2.InterfaceC2853y;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.jj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1381jj implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14984a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f14985b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f14986c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2069wN f14987d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2069wN f14988e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f14989f;

    public C1381jj(C0540Hh c0540Hh, C0642Nh c0642Nh, C2190yj c2190yj, InterfaceC1853sN interfaceC1853sN, C1799rN c1799rN) {
        this.f14984a = 9;
        this.f14985b = c0540Hh;
        this.f14987d = c0642Nh;
        this.f14986c = c2190yj;
        this.f14989f = interfaceC1853sN;
        this.f14988e = c1799rN;
    }

    public BinderC1168fk a() {
        return new BinderC1168fk(((C2190yj) this.f14986c).a(), (String) ((C2190yj) this.f14988e).f17749b.f14824d, (C1228gq) this.f14985b.c(), ((C2190yj) this.f14989f).f17749b.w(), (String) this.f14987d.c());
    }

    public C0548Hp b() {
        return new C0548Hp(((C0540Hh) this.f14985b).a(), ((C0127o) this.f14989f).a(), (C0514Fp) this.f14987d.c(), ((C1808rf) this.f14986c).a(), ((C0489Eh) this.f14988e).c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f14984a) {
            case 0:
                return new C1328ij(((C0540Hh) this.f14985b).a(), (InterfaceC0828Yg) ((C1003cj) this.f14989f).f13663b.f15176e, ((C2190yj) this.f14986c).a(), ((C0642Nh) this.f14987d).a(), (C0820Xp) this.f14988e.c());
            case 1:
                C1867sk c1867sk = (C1867sk) this.f14985b.c();
                Qt qtA = ((C2190yj) this.f14986c).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f14987d.c();
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new C0695Qj(c1867sk, qtA, scheduledExecutorService, c0623Mf, (String) ((C2190yj) this.f14989f).f17749b.f14824d, (C0594Kk) this.f14988e.c());
            case 2:
                return new C0780Vj(((C2190yj) this.f14989f).b(), ((C2190yj) this.f14986c).a(), (Q2.a) this.f14985b.c(), (C0784Vn) this.f14987d.c(), (ScheduledExecutorService) this.f14988e.c());
            case 3:
                return a();
            case 4:
                return new C0612Ll(((C0540Hh) this.f14985b).a(), (InterfaceC0828Yg) ((C0510Fl) this.f14989f).f8180b.f10692c, ((C2190yj) this.f14986c).a(), ((C0642Nh) this.f14987d).a(), (C0820Xp) this.f14988e.c());
            case 5:
                Map mapC = ((C1961uN) this.f14987d).c();
                Map mapC2 = ((C1961uN) this.f14988e).c();
                Map mapC3 = ((C1961uN) this.f14989f).c();
                C1708pm c1708pm = (C1708pm) ((C0731Sl) this.f14986c).f11226a.f10691b;
                Cr.v(c1708pm);
                return new C0680Pl(mapC, mapC2, mapC3, this.f14985b, c1708pm);
            case 6:
                Context contextA = ((C0540Hh) this.f14985b).a();
                String packageName = ((C0540Hh) ((C0733Sn) this.f14989f).f11246b).a().getPackageName();
                Cr.v(packageName);
                C2951a c2951aA = ((C0642Nh) this.f14987d).a();
                B8 b8 = (B8) this.f14988e.c();
                String str = (String) this.f14986c.c();
                A8 a8 = new A8(new A1.w(contextA, 7));
                R8 r8B = S8.B();
                int i = c2951aA.f23785b;
                r8B.b();
                ((S8) r8B.f13551b).C(i);
                int i3 = c2951aA.f23786c;
                r8B.b();
                ((S8) r8B.f13551b).D(i3);
                int i6 = true != c2951aA.f23787d ? 2 : 0;
                r8B.b();
                ((S8) r8B.f13551b).A(i6);
                a8.a(new C1431kf(b8, packageName, (S8) r8B.d(), str, 15, false));
                return a8;
            case 7:
                Context contextA2 = ((C0540Hh) this.f14985b).a();
                C0623Mf c0623Mf2 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf2);
                W9 w9 = new W9(15);
                C0710Rh c0710Rh = (C0710Rh) ((C0608Lh) this.f14987d).f9733a.f16902a;
                Cr.v(c0710Rh);
                return new BinderC2196yp(contextA2, c0623Mf2, w9, c0710Rh, new Rx(25, ((C0676Ph) ((C0733Sn) this.f14989f).f11246b).c()), (ArrayDeque) this.f14988e.c(), (Yu) this.f14986c.c());
            case 8:
                return b();
            case 9:
                return new C0820Xp(((C0540Hh) this.f14985b).a(), ((C0642Nh) this.f14987d).a(), ((C2190yj) this.f14986c).a(), (InterfaceC0828Yg) ((InterfaceC1853sN) this.f14989f).c(), (C0784Vn) this.f14988e.c());
            case 10:
                return new C0634Mq((C0710Rh) this.f14985b.c(), ((C1004ck) this.f14989f).f13665b.b(), ((C1330il) this.f14986c).f14777b, (C0702Qq) this.f14987d.c(), (C1228gq) this.f14988e.c());
            case 11:
                Q2.a aVar = (Q2.a) this.f14985b.c();
                V9 v9 = (V9) this.f14986c;
                C1338iu c1338iu = new C1338iu((C1286hu) v9.f11959b.c(), (C0546Hn) v9.f11960c.c(), (C0784Vn) v9.f11961d.c(), 24, false);
                C1228gq c1228gq = (C1228gq) this.f14987d.c();
                C2202yv c2202yv = (C2202yv) this.f14988e.c();
                C0702Qq c0702Qq = (C0702Qq) ((Nx) this.f14989f).f10110b;
                return c0702Qq != null ? c0702Qq : new C0702Qq(aVar, c1338iu, c1228gq, c2202yv);
            case 12:
                return new C2143xq((Context) this.f14985b.c(), (C0795Wh) ((C1907tN) this.f14989f).f16902a, (Mu) this.f14987d.c(), (ID) this.f14988e.c(), (N9) ((C1336ir) this.f14986c).f14809b.f14592b);
            case 13:
                return new BinderC1820rr((Context) this.f14985b.c(), (InterfaceC2853y) ((C0714Rl) this.f14987d).f11036a.f10692c, ((C1113ek) this.f14988e).a(), ((C0847Zi) ((C1811ri) this.f14989f).f16599b).a(), (C0784Vn) this.f14986c.c());
            case 14:
                W9 w92 = new W9(18);
                Context contextA3 = ((C0540Hh) this.f14985b).a();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f14987d.c();
                C0623Mf c0623Mf3 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf3);
                return new Ws(w92, contextA3, scheduledExecutorService2, c0623Mf3, ((C1013ct) this.f14988e).f13693b.f2569b, ((C1807re) ((C1013ct) this.f14989f).f13693b.f2570c).f16586l, ((C1807re) ((C1013ct) this.f14986c).f13693b.f2570c).f16585k);
            default:
                return new Cv((Nv) this.f14985b.c(), ((C0591Kh) this.f14989f).a(), ((C0540Hh) this.f14986c).a(), (Q2.a) this.f14987d.c(), (Av) this.f14988e.c());
        }
    }

    public C1381jj(C2190yj c2190yj, C2190yj c2190yj2, C1799rN c1799rN, C2190yj c2190yj3, C1799rN c1799rN2) {
        this.f14984a = 3;
        this.f14986c = c2190yj;
        this.f14988e = c2190yj2;
        this.f14985b = c1799rN;
        this.f14989f = c2190yj3;
        this.f14987d = c1799rN2;
    }

    public C1381jj(C2190yj c2190yj, C2190yj c2190yj2, C1799rN c1799rN, C1799rN c1799rN2, C1799rN c1799rN3) {
        this.f14984a = 2;
        this.f14989f = c2190yj;
        this.f14986c = c2190yj2;
        this.f14985b = c1799rN;
        this.f14987d = c1799rN2;
        this.f14988e = c1799rN3;
    }

    public C1381jj(Nx nx, InterfaceC2069wN interfaceC2069wN, V9 v9, InterfaceC2069wN interfaceC2069wN2, InterfaceC2069wN interfaceC2069wN3) {
        this.f14984a = 11;
        this.f14989f = nx;
        this.f14985b = interfaceC2069wN;
        this.f14986c = v9;
        this.f14987d = interfaceC2069wN2;
        this.f14988e = interfaceC2069wN3;
    }

    public C1381jj(C1799rN c1799rN, C2190yj c2190yj, C1799rN c1799rN2, C2190yj c2190yj2, C1799rN c1799rN3) {
        this.f14984a = 1;
        this.f14985b = c1799rN;
        this.f14986c = c2190yj;
        this.f14987d = c1799rN2;
        this.f14989f = c2190yj2;
        this.f14988e = c1799rN3;
    }

    public C1381jj(C1961uN c1961uN, C1961uN c1961uN2, C1961uN c1961uN3, InterfaceC2069wN interfaceC2069wN, C0731Sl c0731Sl) {
        this.f14984a = 5;
        this.f14987d = c1961uN;
        this.f14988e = c1961uN2;
        this.f14989f = c1961uN3;
        this.f14985b = interfaceC2069wN;
        this.f14986c = c0731Sl;
    }

    public C1381jj(InterfaceC2069wN interfaceC2069wN, C0127o c0127o, InterfaceC2069wN interfaceC2069wN2, C1808rf c1808rf, InterfaceC2069wN interfaceC2069wN3) {
        this.f14984a = 8;
        this.f14985b = interfaceC2069wN;
        this.f14989f = c0127o;
        this.f14987d = interfaceC2069wN2;
        this.f14986c = c1808rf;
        this.f14988e = interfaceC2069wN3;
    }

    public /* synthetic */ C1381jj(InterfaceC2069wN interfaceC2069wN, InterfaceC1853sN interfaceC1853sN, InterfaceC1853sN interfaceC1853sN2, InterfaceC2069wN interfaceC2069wN2, C1799rN c1799rN, int i) {
        this.f14984a = i;
        this.f14985b = interfaceC2069wN;
        this.f14989f = interfaceC1853sN;
        this.f14986c = interfaceC1853sN2;
        this.f14987d = interfaceC2069wN2;
        this.f14988e = c1799rN;
    }

    public /* synthetic */ C1381jj(InterfaceC2069wN interfaceC2069wN, InterfaceC1853sN interfaceC1853sN, InterfaceC2069wN interfaceC2069wN2, InterfaceC2069wN interfaceC2069wN3, InterfaceC2069wN interfaceC2069wN4, int i) {
        this.f14984a = i;
        this.f14985b = interfaceC2069wN;
        this.f14989f = interfaceC1853sN;
        this.f14987d = interfaceC2069wN2;
        this.f14988e = interfaceC2069wN3;
        this.f14986c = interfaceC2069wN4;
    }

    public C1381jj(InterfaceC2069wN interfaceC2069wN, InterfaceC2069wN interfaceC2069wN2, C0733Sn c0733Sn, InterfaceC2069wN interfaceC2069wN3, InterfaceC2069wN interfaceC2069wN4) {
        this.f14984a = 7;
        this.f14985b = interfaceC2069wN;
        this.f14987d = interfaceC2069wN2;
        this.f14989f = c0733Sn;
        this.f14988e = interfaceC2069wN3;
        this.f14986c = interfaceC2069wN4;
    }

    public /* synthetic */ C1381jj(InterfaceC2069wN interfaceC2069wN, InterfaceC2069wN interfaceC2069wN2, InterfaceC1853sN interfaceC1853sN, InterfaceC1853sN interfaceC1853sN2, InterfaceC2069wN interfaceC2069wN3, int i) {
        this.f14984a = i;
        this.f14985b = interfaceC2069wN;
        this.f14987d = interfaceC2069wN2;
        this.f14988e = interfaceC1853sN;
        this.f14989f = interfaceC1853sN2;
        this.f14986c = interfaceC2069wN3;
    }
}
