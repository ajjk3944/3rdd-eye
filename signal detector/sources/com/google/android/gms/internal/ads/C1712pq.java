package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import j2.EnumC2546b;
import org.json.JSONObject;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.pq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1712pq implements InterfaceC1282hq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16225a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16226b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16227c;

    public /* synthetic */ C1712pq(int i, Context context, Object obj) {
        this.f16225a = i;
        this.f16226b = context;
        this.f16227c = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1282hq
    public final void a(Xt xt, Qt qt, C1119eq c1119eq) throws C1123eu {
        switch (this.f16225a) {
            case 0:
                try {
                    InterfaceC1860sd interfaceC1860sd = (InterfaceC1860sd) c1119eq.f13987b;
                    interfaceC1860sd.z2(qt.f10756Z);
                    interfaceC1860sd.y3(qt.f10751U, qt.f10797v.toString(), ((C0960bu) xt.f12509a.f10110b).f13482d, new S2.b(this.f16226b), new BinderC1658oq(c1119eq), (InterfaceC0688Qc) c1119eq.f13988c);
                    return;
                } catch (RemoteException e6) {
                    AbstractC2907C.n("Remote exception loading an app open RTB ad", e6);
                    throw new C1123eu(e6);
                }
            case 1:
                try {
                    InterfaceC1860sd interfaceC1860sd2 = (InterfaceC1860sd) c1119eq.f13987b;
                    interfaceC1860sd2.z2(qt.f10756Z);
                    interfaceC1860sd2.c1(qt.f10751U, qt.f10797v.toString(), ((C0960bu) xt.f12509a.f10110b).f13482d, new S2.b(this.f16226b), new BinderC0481Dq(this, c1119eq), (InterfaceC0688Qc) c1119eq.f13988c);
                    return;
                } catch (RemoteException e7) {
                    AbstractC2907C.n("Remote exception loading a interstitial RTB ad", e7);
                    throw new C1123eu(e7);
                }
            default:
                try {
                    Object obj = c1119eq.f13987b;
                    IInterface iInterface = c1119eq.f13988c;
                    InterfaceC1860sd interfaceC1860sd3 = (InterfaceC1860sd) obj;
                    String str = qt.f10756Z;
                    JSONObject jSONObject = qt.f10797v;
                    interfaceC1860sd3.z2(str);
                    C0960bu c0960bu = (C0960bu) xt.f12509a.f10110b;
                    int i = c0960bu.f13493p.f3830b;
                    Context context = this.f16226b;
                    if (i == 3) {
                        interfaceC1860sd3.h2(qt.f10751U, jSONObject.toString(), c0960bu.f13482d, new S2.b(context), new BinderC0787Vq(this, c1119eq), (InterfaceC0688Qc) iInterface);
                    } else {
                        interfaceC1860sd3.t0(qt.f10751U, jSONObject.toString(), c0960bu.f13482d, new S2.b(context), new BinderC0787Vq(this, c1119eq), (InterfaceC0688Qc) iInterface);
                    }
                    return;
                } catch (RemoteException e8) {
                    AbstractC2907C.n("Remote exception loading a rewarded RTB ad", e8);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1282hq
    public final Object b(Xt xt, Qt qt, C1119eq c1119eq) {
        switch (this.f16225a) {
            case 0:
                C1431kf c1431kf = new C1431kf(qt, (InterfaceC1860sd) c1119eq.f13987b, EnumC2546b.APP_OPEN_AD);
                C1338iu c1338iu = new C1338iu(xt, qt, c1119eq.f13986a);
                C0697Ql c0697Ql = new C0697Ql(c1431kf, 16, (Object) null);
                V0.m mVar = new V0.m(qt.f10758a0, 4);
                C0761Uh c0761Uh = (C0761Uh) this.f16227c;
                C0710Rh c0710Rh = c0761Uh.f11735c;
                C0761Uh c0761Uh2 = c0761Uh.f11736d;
                C0727Sh c0727Sh = new C0727Sh(c0710Rh, c0761Uh2, c1338iu, c0697Ql, mVar);
                C1799rN c1799rN = c0727Sh.M;
                c1431kf.f15176e = (C1867sk) c1799rN.c();
                ((BinderC2251zq) c1119eq.f13988c).L3(new BinderC1011cr((C1276hk) c0727Sh.f11206Q.c(), (C2030vl) c0727Sh.f11208S.c(), (C1867sk) c1799rN.c(), (C2191yk) c0727Sh.f11205P.c(), (C0424Ak) c0727Sh.f11209T.c(), (C0849Zk) c0761Uh2.f11726R.c(), (C0543Hk) c0727Sh.f11210U.c(), (C0459Cl) c0727Sh.f11211V.c(), (C0815Xk) c0727Sh.f11212W.c(), (C1760qk) c0727Sh.f11214Y.c()));
                return c0727Sh.B();
            case 1:
                C1431kf c1431kf2 = new C1431kf(qt, (InterfaceC1860sd) c1119eq.f13987b, EnumC2546b.INTERSTITIAL);
                C1338iu c1338iu2 = new C1338iu(xt, qt, c1119eq.f13986a);
                C0697Ql c0697Ql2 = new C0697Ql(c1431kf2, 16, (Object) null);
                C0893ai c0893ai = (C0893ai) this.f16227c;
                C0710Rh c0710Rh2 = c0893ai.f13187b;
                C0893ai c0893ai2 = c0893ai.f13188c;
                C0846Zh c0846Zh = new C0846Zh(c0710Rh2, c0893ai2, c1338iu2, c0697Ql2);
                C1799rN c1799rN2 = c0846Zh.f12922L;
                c1431kf2.f15176e = (C1867sk) c1799rN2.c();
                ((BinderC2251zq) c1119eq.f13988c).L3(new BinderC1011cr((C1276hk) c0846Zh.f12925P.c(), (C2030vl) c0846Zh.f12928S.c(), (C1867sk) c1799rN2.c(), (C2191yk) c0846Zh.f12924O.c(), (C0424Ak) c0846Zh.f12929T.c(), (C0849Zk) c0893ai2.f13179R.c(), (C0543Hk) c0846Zh.f12931V.c(), (C0459Cl) c0846Zh.f12932W.c(), (C0815Xk) c0846Zh.f12933X.c(), (C1760qk) c0846Zh.f12935Z.c()));
                return c0846Zh.B();
            default:
                C1431kf c1431kf3 = new C1431kf(qt, (InterfaceC1860sd) c1119eq.f13987b, EnumC2546b.REWARDED);
                C1338iu c1338iu3 = new C1338iu(xt, qt, c1119eq.f13986a);
                C1978un c1978un = new C1978un(c1431kf3, null, 0);
                C1002ci c1002ci = (C1002ci) this.f16227c;
                C0710Rh c0710Rh3 = c1002ci.f13639c;
                C1002ci c1002ci2 = c1002ci.f13640d;
                C0948bi c0948bi = new C0948bi(c0710Rh3, c1002ci2, c1338iu3, c1978un);
                C1799rN c1799rN3 = c0948bi.f13435L;
                c1431kf3.f15176e = (C1867sk) c1799rN3.c();
                ((BinderC2251zq) c1119eq.f13988c).L3(new BinderC0957br((C1276hk) c0948bi.f13438P.c(), (C2030vl) c0948bi.f13440R.c(), (C1867sk) c1799rN3.c(), (C2191yk) c0948bi.f13437O.c(), (C0424Ak) c0948bi.f13441S.c(), (C1760qk) c0948bi.f13447Y.c(), (C0849Zk) c1002ci2.f13631V.c(), (C0459Cl) c0948bi.f13444V.c(), (C0543Hk) c0948bi.f13443U.c(), (C2246zl) c0948bi.f13449a0.c(), (C0815Xk) c0948bi.f13445W.c()));
                return c0948bi.B();
        }
    }
}
