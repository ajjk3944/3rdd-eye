package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.rf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1808rf implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16589a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16590b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f16591c;

    public /* synthetic */ C1808rf(Object obj, InterfaceC2069wN interfaceC2069wN, int i) {
        this.f16589a = i;
        this.f16590b = obj;
        this.f16591c = interfaceC2069wN;
    }

    public C0697Ql a() {
        return new C0697Ql(new C0480Dp(((C0540Hh) ((C0733Sn) this.f16590b).f11246b).a()), 22, (ID) this.f16591c.c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f16589a) {
            case 0:
                Context context = (Context) ((C1907tN) this.f16590b).f16902a;
                C1377jf c1377jf = (C1377jf) this.f16591c;
                return new C1755qf(context, new C0697Ql((Q2.a) c1377jf.f14967c.f16902a, 10, (C1217gf) c1377jf.f14966b.c()));
            case 1:
                return new C0697Ql(((C1961uN) this.f16590b).c(), 13, ((C1961uN) this.f16591c).c());
            case 2:
                return ((C1431kf) this.f16590b).w(((C2123xN) this.f16591c).c());
            case 3:
                return new Lr(((C1271hf) this.f16590b).d(), ((Integer) C2841s.f23267e.f23270c.a(H9.Hd)).intValue(), (ScheduledExecutorService) this.f16591c.c());
            case 4:
                return new Lr(new Gr(2, ((C2032vn) this.f16590b).f17334b.a()), ((Integer) C2841s.f23267e.f23270c.a(H9.Md)).intValue(), (ScheduledExecutorService) this.f16591c.c());
            case 5:
                return new Lr(((C1271hf) this.f16590b).e(), ((Integer) C2841s.f23267e.f23270c.a(H9.Id)).intValue(), (ScheduledExecutorService) this.f16591c.c());
            case 6:
                Boolean bool = (Boolean) C2841s.f23267e.f23270c.a(H9.u6);
                bool.booleanValue();
                return true == bool.booleanValue() ? ((C0847Zi) this.f16590b).d() : ((C0745Ti) this.f16591c).a();
            case 7:
                return new C1221gj((InterfaceC0828Yg) ((C1003cj) this.f16590b).f13663b.f15176e, (Executor) this.f16591c.c());
            case 8:
                Set setC = ((C2123xN) this.f16591c).c();
                C1277hl c1277hl = (C1277hl) this.f16590b;
                if (((C1490lk) c1277hl.f14542E) == null) {
                    c1277hl.f14542E = new C1490lk(setC);
                }
                C1490lk c1490lk = (C1490lk) c1277hl.f14542E;
                Cr.v(c1490lk);
                return c1490lk;
            case 9:
                return new C0476Dl((C0495En) ((InterfaceC2069wN) this.f16590b).c(), ((C2190yj) this.f16591c).f17749b.w());
            case 10:
                Qt qtA = ((C2190yj) this.f16590b).a();
                JSONObject jSONObject = (JSONObject) ((C0850Zl) this.f16591c).f12948b.f15173b;
                Cr.v(jSONObject);
                return new C1546mm(qtA, jSONObject);
            case 11:
                return new C1922tl(new C1763qn(((C0952bm) this.f16590b).f13460b.a()), (Executor) this.f16591c.c());
            case 12:
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new C1338iu(c0623Mf, ((C0749Tm) this.f16590b).c(), (C0750Tn) this.f16591c.c(), 16, false);
            case 13:
                C1278hm c1278hm = (C1278hm) ((C0922bA) this.f16590b).c();
                C1492lm c1492lmA = ((C1811ri) this.f16591c).a();
                ViewTreeObserverOnGlobalLayoutListenerC0953bn viewTreeObserverOnGlobalLayoutListenerC0953bn = new ViewTreeObserverOnGlobalLayoutListenerC0953bn("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
                viewTreeObserverOnGlobalLayoutListenerC0953bn.f13461a = c1492lmA.j();
                viewTreeObserverOnGlobalLayoutListenerC0953bn.f13462b = c1492lmA.X();
                viewTreeObserverOnGlobalLayoutListenerC0953bn.f13463c = c1278hm;
                viewTreeObserverOnGlobalLayoutListenerC0953bn.f13464d = false;
                viewTreeObserverOnGlobalLayoutListenerC0953bn.f13465e = false;
                if (c1492lmA.r() != null) {
                    c1492lmA.r().y0(viewTreeObserverOnGlobalLayoutListenerC0953bn);
                }
                return viewTreeObserverOnGlobalLayoutListenerC0953bn;
            case 14:
                return new C0563In(C1338iu.o(((C0523Gh) this.f16590b).f8418b.a()), (C0546Hn) this.f16591c.c());
            case 15:
                return new C0648Nn((A8) ((InterfaceC2069wN) this.f16590b).c(), ((C1961uN) this.f16591c).c());
            case 16:
                return new BinderC1494lo((C0829Yh) ((C1907tN) this.f16590b).f16902a, new C1283hr(20, (C0636Nb) ((C1440ko) this.f16591c).f15278b.f16902a));
            case 17:
                C0623Mf c0623Mf2 = AbstractC0640Nf.f10006b;
                Cr.v(c0623Mf2);
                C0623Mf c0623Mf3 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf3);
                return new C1431kf(c0623Mf2, c0623Mf3, new C1227gp((Context) ((C0733Sn) this.f16590b).f11246b.c(), c0623Mf3, 0), C1799rN.b((C1381jj) this.f16591c), 16, false);
            case 18:
                Map map = ((C2015vN) this.f16590b).f16350a;
                C0623Mf c0623Mf4 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf4);
                return new C1657op(map, c0623Mf4, new C0713Rk(((C1329ik) this.f16591c).f14775b.c()));
            case 19:
                C0623Mf c0623Mf5 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf5);
                return new C1338iu(c0623Mf5, ((C0733Sn) this.f16590b).a(), C1799rN.b((C1381jj) this.f16591c), 17, false);
            case 20:
                return a();
            case 21:
                return new C0497Ep(((C1381jj) this.f16590b).b(), ((C0489Eh) this.f16591c).c());
            case 22:
                return new C0531Gp(((C1808rf) this.f16590b).a(), ((C0489Eh) this.f16591c).c());
            case 23:
                C0514Fp c0514Fp = (C0514Fp) ((InterfaceC2069wN) this.f16590b).c();
                C1808rf c1808rf = (C1808rf) this.f16591c;
                return new C0648Nn(c0514Fp, new C0531Gp(((C1808rf) c1808rf.f16590b).a(), ((C0489Eh) c1808rf.f16591c).c()));
            case 24:
                return new Lr(((C0491Ej) this.f16590b).b(), ((Integer) C2841s.f23267e.f23270c.a(H9.Ed)).intValue(), (ScheduledExecutorService) this.f16591c.c());
            case 25:
                return new Lr(((C0559Ij) this.f16590b).a(), ((Integer) C2841s.f23267e.f23270c.a(H9.Dd)).intValue(), (ScheduledExecutorService) this.f16591c.c());
            case 26:
                return new Lr(((V9) this.f16590b).a(), ((Integer) C2841s.f23267e.f23270c.a(H9.Fd)).intValue(), (ScheduledExecutorService) this.f16591c.c());
            case 27:
                C0901aq c0901aq = (C0901aq) this.f16590b;
                C0623Mf c0623Mf6 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf6);
                return new Lr(new Wr(c0623Mf6, ((C0540Hh) c0901aq.f13232b).a(), 0), ((Integer) C2841s.f23267e.f23270c.a(H9.Nd)).intValue(), (ScheduledExecutorService) this.f16591c.c());
            case 28:
                return new Lr(new Gr(3, (C1822rt) ((C1440ko) this.f16590b).f15278b.f16902a), ((Integer) C2841s.f23267e.f23270c.a(H9.yd)).intValue(), (ScheduledExecutorService) this.f16591c.c());
            default:
                return new Lr(((C0491Ej) this.f16590b).a(), ((Integer) C2841s.f23267e.f23270c.a(H9.Gd)).intValue(), (ScheduledExecutorService) this.f16591c.c());
        }
    }
}
