package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Uq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0770Uq implements InterfaceC1282hq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11798a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f11799b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f11800c;

    /* renamed from: d, reason: collision with root package name */
    public final C1002ci f11801d;

    public /* synthetic */ C0770Uq(Context context, Executor executor, C1002ci c1002ci, int i) {
        this.f11798a = i;
        this.f11799b = context;
        this.f11800c = executor;
        this.f11801d = c1002ci;
    }

    public static final void c(Xt xt, Qt qt, C1119eq c1119eq) {
        try {
            C1392ju c1392ju = (C1392ju) c1119eq.f13987b;
            q2.a1 a1Var = ((C0960bu) xt.f12509a.f10110b).f13482d;
            try {
                c1392ju.f15016a.M2(qt.f10797v.toString(), a1Var);
            } catch (Throwable th) {
                throw new C1123eu(th);
            }
        } catch (Exception e6) {
            u2.k.i("Fail to load ad from adapter ".concat(String.valueOf(c1119eq.f13986a)), e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1282hq
    public final void a(Xt xt, Qt qt, C1119eq c1119eq) {
        C1123eu c1123eu;
        switch (this.f11798a) {
            case 0:
                JSONObject jSONObject = qt.f10797v;
                IInterface iInterface = c1119eq.f13988c;
                Object obj = c1119eq.f13987b;
                Context context = this.f11799b;
                try {
                    C0960bu c0960bu = (C0960bu) xt.f12509a.f10110b;
                    V0.m mVar = c0960bu.f13493p;
                    q2.a1 a1Var = c0960bu.f13482d;
                    if (mVar.f3830b == 3) {
                        C1392ju c1392ju = (C1392ju) obj;
                        try {
                            c1392ju.f15016a.P1(new S2.b(context), a1Var, jSONObject.toString(), (InterfaceC0688Qc) iInterface);
                            return;
                        } finally {
                        }
                    }
                    C1392ju c1392ju2 = (C1392ju) obj;
                    try {
                        c1392ju2.f15016a.y0(new S2.b(context), a1Var, jSONObject.toString(), (InterfaceC0688Qc) iInterface);
                        return;
                    } finally {
                    }
                } catch (Exception e6) {
                    u2.k.i("Fail to load ad from adapter ".concat(String.valueOf(c1119eq.f13986a)), e6);
                    return;
                }
                u2.k.i("Fail to load ad from adapter ".concat(String.valueOf(c1119eq.f13986a)), e6);
                return;
            default:
                C1392ju c1392ju3 = (C1392ju) c1119eq.f13987b;
                if (c1392ju3.a()) {
                    c(xt, qt, c1119eq);
                    return;
                }
                C1431kf c1431kf = new C1431kf(this, xt, qt, c1119eq, 19);
                IInterface iInterface2 = c1119eq.f13988c;
                BinderC0430Aq binderC0430Aq = (BinderC0430Aq) iInterface2;
                synchronized (binderC0430Aq) {
                    binderC0430Aq.f7054c = c1431kf;
                }
                Context context2 = this.f11799b;
                C0960bu c0960bu2 = (C0960bu) xt.f12509a.f10110b;
                InterfaceC0503Fe interfaceC0503Fe = (InterfaceC0503Fe) iInterface2;
                String string = qt.f10797v.toString();
                try {
                    c1392ju3.f15016a.e1(new S2.b(context2), c0960bu2.f13482d, interfaceC0503Fe, string);
                    return;
                } finally {
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1282hq
    public final Object b(Xt xt, Qt qt, C1119eq c1119eq) {
        switch (this.f11798a) {
            case 0:
                C1338iu c1338iu = new C1338iu(xt, qt, c1119eq.f13986a);
                C1978un c1978un = new C1978un(new C1550mq(this, c1119eq, qt, 1), null, 0);
                C1002ci c1002ci = this.f11801d;
                C0948bi c0948bi = new C0948bi(c1002ci.f13639c, c1002ci.f13640d, c1338iu, c1978un);
                ((C2137xk) c0948bi.f13431H.c()).z1(new C2081wi(0, (C1392ju) c1119eq.f13987b), this.f11800c);
                ((BinderC2251zq) c1119eq.f13988c).L3((BinderC0804Wq) c0948bi.f13450c0.c());
                return c0948bi.B();
            default:
                C1338iu c1338iu2 = new C1338iu(xt, qt, c1119eq.f13986a);
                C1978un c1978un2 = new C1978un(new C0697Ql(this, c1119eq, qt, 25), null, 0);
                C1002ci c1002ci2 = this.f11801d;
                C0948bi c0948bi2 = new C0948bi(c1002ci2.f13639c, c1002ci2.f13640d, c1338iu2, c1978un2);
                ((C2137xk) c0948bi2.f13431H.c()).z1(new C2081wi(0, (C1392ju) c1119eq.f13987b), this.f11800c);
                C2191yk c2191yk = (C2191yk) c0948bi2.f13437O.c();
                C1276hk c1276hk = (C1276hk) c0948bi2.f13438P.c();
                C0543Hk c0543Hk = (C0543Hk) c0948bi2.f13443U.c();
                C2246zl c2246zl = (C2246zl) c0948bi2.f13449a0.c();
                BinderC0430Aq binderC0430Aq = (BinderC0430Aq) c1119eq.f13988c;
                BinderC0838Yq binderC0838Yq = new BinderC0838Yq(this, c0543Hk, c1276hk, c2191yk, c2246zl);
                synchronized (binderC0430Aq) {
                    binderC0430Aq.f7052a = binderC0838Yq;
                }
                return c0948bi2.B();
        }
    }
}
