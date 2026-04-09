package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
import q2.C2841s;
import t2.C2909E;
import t2.C2911G;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.hf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1271hf implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14515a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f14516b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f14517c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2069wN f14518d;

    public /* synthetic */ C1271hf(InterfaceC2069wN interfaceC2069wN, InterfaceC2069wN interfaceC2069wN2, InterfaceC2069wN interfaceC2069wN3, int i) {
        this.f14515a = i;
        this.f14516b = interfaceC2069wN;
        this.f14517c = interfaceC2069wN2;
        this.f14518d = interfaceC2069wN3;
    }

    public C1726q3 a() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f14516b.c();
        C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
        Cr.v(c0623Mf);
        C0623Mf c0623Mf2 = AbstractC0640Nf.f10006b;
        Cr.v(c0623Mf2);
        Context contextA = ((C0540Hh) ((C0733Sn) this.f14517c).f11246b).a();
        Cr.v(c0623Mf);
        return new C1726q3(scheduledExecutorService, c0623Mf, c0623Mf2, new C1227gp(contextA, c0623Mf, 1), C1799rN.b((C1381jj) this.f14518d), 3);
    }

    public C1431kf b() {
        C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
        Cr.v(c0623Mf);
        C0732Sm c0732SmA = ((C0749Tm) this.f14516b).c();
        C1808rf c1808rf = (C1808rf) this.f14517c;
        Cr.v(c0623Mf);
        return new C1431kf(c0623Mf, c0732SmA, new C1338iu(c0623Mf, ((C0749Tm) c1808rf.f16590b).c(), (C0750Tn) c1808rf.f16591c.c(), 16, false), (C0750Tn) this.f14518d.c(), 13, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        Set setSingleton;
        switch (this.f14515a) {
            case 0:
                C2909E c2909e = (C2909E) ((C1907tN) this.f14517c).f16902a;
                return new C1217gf(c2909e);
            case 1:
                E9 e9 = H9.f8671T;
                C2841s c2841s = C2841s.f23267e;
                Integer num = (Integer) c2841s.f23270c.a(e9);
                num.getClass();
                int iIntValue = num.intValue();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f14516b.c();
                C1014cu c1014cuA = ((C0591Kh) this.f14517c).a();
                Q2.a aVar = (Q2.a) this.f14518d.c();
                if (((Boolean) c2841s.f23270c.a(H9.f8642O)).booleanValue()) {
                    return new Av(iIntValue, scheduledExecutorService, c1014cuA, aVar);
                }
                return null;
            case 2:
                C2951a c2951aA = ((C0642Nh) this.f14516b).a();
                JSONObject jSONObject = (JSONObject) this.f14517c.c();
                String str = (String) ((InterfaceC1853sN) this.f14518d).c();
                boolean zEquals = "native".equals(str);
                C2911G c2911g = p2.j.f22785C.f22790c;
                return new K7(UUID.randomUUID().toString(), c2951aA, str, jSONObject, zEquals);
            case 3:
                return new C1112ej((InterfaceC0828Yg) ((C1003cj) this.f14516b).f13663b.f15176e, (C0784Vn) this.f14517c.c(), ((C2190yj) this.f14518d).a());
            case 4:
                Context context = (Context) this.f14516b.c();
                C2951a c2951aA2 = ((C0642Nh) this.f14517c).a();
                Qt qtA = ((C2190yj) this.f14518d).a();
                C0999cf c0999cf = qtA.f10724A;
                if (c0999cf == null) {
                    return null;
                }
                Ut ut = qtA.f10791s;
                return new C0945bf(context, c2951aA2, c0999cf, ut != null ? ut.f11812b : null);
            case 5:
                C1706pk c1706pk = new C1706pk(((C1329ik) this.f14516b).f14775b.c());
                Set setC = ((C2123xN) this.f14517c).c();
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new C1760qk(c1706pk, setC, c0623Mf, (ScheduledExecutorService) this.f14518d.c());
            case 6:
                return new C0560Ik(((C2123xN) this.f14516b).c(), ((C2190yj) this.f14517c).a(), ((C2190yj) this.f14518d).b());
            case 7:
                return new C1976ul((Context) this.f14516b.c(), ((C2123xN) this.f14517c).c(), ((C2190yj) this.f14518d).a());
            case 8:
                C1492lm c1492lmA = ((C1811ri) this.f14516b).a();
                C1546mm c1546mm = (C1546mm) ((C0527Gl) this.f14517c).f8437b.c();
                Cr.v(c1546mm);
                Executor executor = (Executor) this.f14518d.c();
                C0623Mf c0623Mf2 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf2);
                return new C0545Hm(c1492lmA, c1546mm, executor, c0623Mf2);
            case 9:
                return b();
            case 10:
                int i = ((C1113ek) this.f14518d).a().f13493p.f3830b;
                if (i != 0) {
                    return i + (-1) != 0 ? ((C0745Ti) this.f14517c).a() : ((C0745Ti) this.f14516b).a();
                }
                throw null;
            case 11:
                String str2 = ((C1807re) ((C1013ct) this.f14516b).f13693b.f2570c).f16583h;
                Cr.v(str2);
                Context contextA = ((C0540Hh) this.f14517c).a();
                C0623Mf c0623Mf3 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf3);
                Map mapC = ((C1961uN) this.f14518d).c();
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.U5)).booleanValue()) {
                    A8 a8 = new A8(new A1.w(contextA, 7));
                    synchronized (a8) {
                        if (a8.f6938c) {
                            try {
                                C2055w9 c2055w9 = a8.f6937b;
                                c2055w9.b();
                                ((C2109x9) c2055w9.f13551b).B(str2);
                            } catch (NullPointerException e6) {
                                p2.j.f22785C.f22795h.f("AdMobClearcutLogger.modify", e6);
                            }
                        }
                    }
                    setSingleton = Collections.singleton(new C1922tl(new C0648Nn(a8, mapC), c0623Mf3));
                } else {
                    setSingleton = Collections.EMPTY_SET;
                }
                Cr.v(setSingleton);
                return setSingleton;
            case 12:
                return new C0835Yn((C0750Tn) this.f14516b.c(), ((C2123xN) this.f14517c).c(), (Q2.a) this.f14518d.c());
            case 13:
                C0623Mf c0623Mf4 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf4);
                u2.n nVar = (u2.n) this.f14516b.c();
                A2.H h6 = (A2.H) this.f14517c;
                return new C0852Zn(c0623Mf4, nVar, new V2.e((Context) h6.f170b.c(), (C2951a) ((C0642Nh) h6.f171c).c()), new B2.a(0), ((C0540Hh) this.f14518d).a());
            case 14:
                Context contextA2 = ((C0540Hh) this.f14516b).a();
                WeakReference weakReference = ((C0506Fh) this.f14517c).f8158b.f7824d;
                Cr.v(weakReference);
                C0615Lo c0615Lo = (C0615Lo) this.f14518d.c();
                C0623Mf c0623Mf5 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf5);
                return new BinderC0751To(contextA2, weakReference, c0615Lo, c0623Mf5);
            case 15:
                return a();
            case 16:
                return d();
            case 17:
                C0523Gh c0523Gh = (C0523Gh) this.f14516b;
                C0623Mf c0623Mf6 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf6);
                Wr wr = new Wr(c0623Mf6, c0523Gh.f8418b.a(), 2);
                Q2.a aVar2 = (Q2.a) this.f14517c.c();
                Cr.v(c0623Mf6);
                return new C1552ms(wr, ((Long) AbstractC0885aa.f13137c.v()).longValue(), aVar2, c0623Mf6, (C0784Vn) this.f14518d.c());
            case 18:
                Context contextA3 = ((C0523Gh) this.f14516b).f8418b.a();
                C0623Mf c0623Mf7 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf7);
                Wr wr2 = new Wr(contextA3, c0623Mf7, 7);
                Q2.a aVar3 = (Q2.a) this.f14517c.c();
                Cr.v(c0623Mf7);
                return new C1552ms(wr2, 2147483647L, aVar3, c0623Mf7, (C0784Vn) this.f14518d.c());
            case 19:
                C0591Kh c0591Kh = (C0591Kh) this.f14516b;
                C0623Mf c0623Mf8 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf8);
                Qr qr = new Qr(c0623Mf8, c0591Kh.f9514b.a(), (C0819Xo) c0591Kh.f9515c.c(), 4);
                Q2.a aVar4 = (Q2.a) this.f14517c.c();
                Cr.v(c0623Mf8);
                return new C1552ms(qr, ((Long) AbstractC0885aa.f13138d.v()).longValue(), aVar4, c0623Mf8, (C0784Vn) this.f14518d.c());
            case 20:
                Gr gr = new Gr(0, ((C0540Hh) ((Ir) this.f14516b).f9171a).a());
                Q2.a aVar5 = (Q2.a) this.f14517c.c();
                C0623Mf c0623Mf9 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf9);
                return new C1552ms(gr, 2147483647L, aVar5, c0623Mf9, (C0784Vn) this.f14518d.c());
            case 21:
                Yr yrC = ((Zr) this.f14516b).c();
                Q2.a aVar6 = (Q2.a) this.f14517c.c();
                C0623Mf c0623Mf10 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf10);
                return new C1552ms(yrC, ((Long) AbstractC0885aa.f13135a.v()).longValue(), aVar6, c0623Mf10, (C0784Vn) this.f14518d.c());
            case 22:
                Yr yrC2 = ((C1176fs) this.f14516b).c();
                Q2.a aVar7 = (Q2.a) this.f14517c.c();
                C0623Mf c0623Mf11 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf11);
                return new C1552ms(yrC2, 2147483647L, aVar7, c0623Mf11, (C0784Vn) this.f14518d.c());
            case 23:
                Wr wrC = ((C1284hs) this.f14516b).c();
                Q2.a aVar8 = (Q2.a) this.f14517c.c();
                C0623Mf c0623Mf12 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf12);
                return new C1552ms(wrC, ((Long) AbstractC0885aa.f13136b.v()).longValue(), aVar8, c0623Mf12, (C0784Vn) this.f14518d.c());
            case 24:
                Yr yrC3 = ((C2037vs) this.f14516b).c();
                Q2.a aVar9 = (Q2.a) this.f14517c.c();
                C0623Mf c0623Mf13 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf13);
                return new C1552ms(yrC3, ((Long) AbstractC0885aa.f13139e.v()).longValue(), aVar9, c0623Mf13, (C0784Vn) this.f14518d.c());
            case 25:
                Qr qrC = ((Bs) this.f14516b).c();
                Q2.a aVar10 = (Q2.a) this.f14517c.c();
                C0623Mf c0623Mf14 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf14);
                return new C1552ms(qrC, 2147483647L, aVar10, c0623Mf14, (C0784Vn) this.f14518d.c());
            case 26:
                Jr jrC = ((Js) this.f14516b).c();
                Q2.a aVar11 = (Q2.a) this.f14517c.c();
                C0623Mf c0623Mf15 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf15);
                return new C1552ms(jrC, ((Long) AbstractC0885aa.f13141g.v()).longValue(), aVar11, c0623Mf15, (C0784Vn) this.f14518d.c());
            case 27:
                Wr wrC2 = ((Ts) this.f14516b).c();
                Q2.a aVar12 = (Q2.a) this.f14517c.c();
                C0623Mf c0623Mf16 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf16);
                return new C1552ms(wrC2, ((Long) AbstractC0885aa.f13142h.v()).longValue(), aVar12, c0623Mf16, (C0784Vn) this.f14518d.c());
            default:
                return e();
        }
    }

    public Jr d() {
        C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
        Cr.v(c0623Mf);
        return new Jr(c0623Mf, ((C0540Hh) this.f14516b).a(), ((C1113ek) this.f14517c).a(), (ViewGroup) ((L6) ((C1811ri) this.f14518d).f16599b).f9620b, 0);
    }

    public Jr e() {
        C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
        Cr.v(c0623Mf);
        return new Jr(c0623Mf, (ViewGroup) ((L6) ((C1811ri) this.f14516b).f16599b).f9620b, (Context) this.f14517c.c(), ((C2123xN) this.f14518d).c());
    }
}
