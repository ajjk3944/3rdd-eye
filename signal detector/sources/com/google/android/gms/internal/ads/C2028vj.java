package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import f4.InterfaceFutureC2326a;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C2771a;
import q2.C2841s;
import t2.C2911G;
import t2.C2925i;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.vj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2028vj implements InterfaceC1736qD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17321a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17322b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17323c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17324d;

    public /* synthetic */ C2028vj(InterfaceC0956bq interfaceC0956bq, Qt qt, Xt xt, C1437kl c1437kl, int i) {
        this.f17321a = i;
        this.f17322b = interfaceC0956bq;
        this.f17323c = qt;
        this.f17324d = xt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
    public final InterfaceFutureC2326a b(Object obj) throws JSONException {
        C0750Tn c0750Tn;
        switch (this.f17321a) {
            case 0:
                C2136xj c2136xj = (C2136xj) this.f17322b;
                C1726q3 c1726q3 = (C1726q3) this.f17323c;
                InterfaceFutureC2326a interfaceFutureC2326a = (InterfaceFutureC2326a) this.f17324d;
                AbstractC1812rj abstractC1812rj = (AbstractC1812rj) obj;
                c2136xj.getClass();
                if (abstractC1812rj != null) {
                    c1726q3.mo11d(abstractC1812rj);
                }
                return AbstractC1984ut.E(interfaceFutureC2326a, ((Long) AbstractC2019va.f17274a.v()).longValue(), TimeUnit.MILLISECONDS, c2136xj.f17622b);
            case 1:
                C0851Zm c0851Zm = (C0851Zm) this.f17322b;
                C2771a c2771a = (C2771a) this.f17323c;
                InterfaceC1054df interfaceC1054df = (InterfaceC1054df) this.f17324d;
                InterfaceC0828Yg interfaceC0828YgA = c0851Zm.f12951c.a(q2.d1.a(), null, null);
                C2000v8 c2000v8 = new C2000v8(interfaceC0828YgA);
                c0851Zm.a(interfaceC0828YgA, c2771a, interfaceC1054df);
                interfaceC0828YgA.l0().f16015h = new Rx(20, c2000v8);
                interfaceC0828YgA.loadUrl((String) C2841s.f23267e.f23270c.a(H9.f8852w4));
                return c2000v8;
            case 2:
                C1547mn c1547mn = (C1547mn) this.f17322b;
                String str = (String) this.f17323c;
                JSONObject jSONObject = (JSONObject) this.f17324d;
                InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) obj;
                C0415Ab c0415Ab = c1547mn.f15665h;
                c0415Ab.getClass();
                C0657Of c0657Of = new C0657Of();
                C2911G c2911g = p2.j.f22785C.f22790c;
                String string = UUID.randomUUID().toString();
                c0415Ab.b(string, new C0585Kb(c0415Ab, c0657Of));
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", string);
                    jSONObject2.put("args", jSONObject);
                    interfaceC0828Yg.b(str, jSONObject2);
                } catch (Exception e6) {
                    c0657Of.c(e6);
                }
                return c0657Of;
            case 3:
                C1388jq c1388jq = (C1388jq) this.f17322b;
                Qt qt = (Qt) this.f17323c;
                Xt xt = (Xt) this.f17324d;
                C0750Tn c0750Tn2 = c1388jq.i;
                E9 e9 = H9.f8585E2;
                G9 g9 = C2841s.f23267e.f23270c;
                if (((Boolean) g9.a(e9)).booleanValue()) {
                    A.f.r(p2.j.f22785C.f22797k, c0750Tn2.f11461e, "rendering-webview-creation-start");
                }
                C0427An c0427An = c1388jq.f14997b;
                C0960bu c0960bu = c1388jq.f14998c;
                final InterfaceC0828Yg interfaceC0828YgA2 = c0427An.a(c0960bu.f13484f, qt, (St) xt.f12510b.f15174c);
                interfaceC0828YgA2.Z0(qt.f10753W);
                if (((Boolean) g9.a(e9)).booleanValue()) {
                    A.f.r(p2.j.f22785C.f22797k, c0750Tn2.f11461e, "rendering-webview-creation-end");
                }
                C0657Of c0657Of2 = new C0657Of();
                C0761Uh c0761Uh = c1388jq.f14996a;
                C1338iu c1338iu = new C1338iu(xt, qt, (String) null);
                C2951a c2951a = c1388jq.f15000e;
                boolean z6 = c1388jq.f15002g;
                C0500Fb c0500Fb = c1388jq.f15001f;
                C0727Sh c0727Sh = new C0727Sh(c0761Uh.f11735c, c0761Uh.f11736d, c1338iu, new C0697Ql(new C1496lq(c2951a, c0657Of2, qt, interfaceC0828YgA2, c0960bu, z6, c0500Fb, c1388jq.f15003h, c1388jq.f15004j), 16, interfaceC0828YgA2), new V0.m(qt.f10758a0, 4));
                if (((Boolean) g9.a(e9)).booleanValue()) {
                    A.f.r(p2.j.f22785C.f22797k, c0750Tn2.f11461e, "rendering-ad-component-creation-end");
                }
                C1799rN c1799rN = c0727Sh.f11215Z;
                final int i = 0;
                ((C2248zn) c1799rN.c()).a(interfaceC0828YgA2, false, true != z6 ? null : c0500Fb, c0750Tn2.f11461e);
                c0657Of2.b(c0727Sh);
                ((C1867sk) c0727Sh.M.c()).z1(new InterfaceC1921tk() { // from class: com.google.android.gms.internal.ads.iq
                    @Override // com.google.android.gms.internal.ads.InterfaceC1921tk
                    public final /* synthetic */ void z() {
                        switch (i) {
                            case 0:
                                InterfaceC0828Yg interfaceC0828Yg2 = interfaceC0828YgA2;
                                if (interfaceC0828Yg2.l0() != null) {
                                    interfaceC0828Yg2.l0().O();
                                    break;
                                }
                                break;
                            case 1:
                                InterfaceC0828Yg interfaceC0828Yg3 = interfaceC0828YgA2;
                                if (interfaceC0828Yg3.l0() != null) {
                                    interfaceC0828Yg3.l0().O();
                                    break;
                                }
                                break;
                            case 2:
                                InterfaceC0828Yg interfaceC0828Yg4 = interfaceC0828YgA2;
                                if (interfaceC0828Yg4.l0() != null) {
                                    interfaceC0828Yg4.l0().O();
                                    break;
                                }
                                break;
                            default:
                                InterfaceC0828Yg interfaceC0828Yg5 = interfaceC0828YgA2;
                                if (interfaceC0828Yg5.l0() != null) {
                                    interfaceC0828Yg5.l0().O();
                                    break;
                                }
                                break;
                        }
                    }
                }, AbstractC0640Nf.f10011g);
                Ut ut = qt.f10791s;
                String strA = ut.f11811a;
                if (((Boolean) g9.a(H9.d6)).booleanValue() && ((C0820Xp) c0727Sh.f11202L.c()).a()) {
                    strA = AbstractC1810rh.a(strA, AbstractC1810rh.b(qt));
                }
                return AbstractC1984ut.G(C2248zn.b(interfaceC0828YgA2, ut.f11812b, strA, c0750Tn2.f11461e, (Xu) c0761Uh.f11738f.c()), new C0678Pj(interfaceC0828YgA2, qt, c0727Sh, 1), c1388jq.f14999d);
            case 4:
                C1873sq c1873sq = (C1873sq) this.f17322b;
                Xt xt2 = (Xt) this.f17323c;
                Qt qt2 = (Qt) this.f17324d;
                Executor executor = c1873sq.f16803e;
                C0750Tn c0750Tn3 = c1873sq.f16805g;
                E9 e92 = H9.f8585E2;
                G9 g92 = C2841s.f23267e.f23270c;
                if (((Boolean) g92.a(e92)).booleanValue()) {
                    A.f.r(p2.j.f22785C.f22797k, c0750Tn3.f11461e, "rendering-webview-creation-start");
                }
                Context context = c1873sq.f16800b;
                q2.d1 d1VarF = C1476lN.f(context, qt2.f10795u);
                final InterfaceC0828Yg interfaceC0828YgA3 = c1873sq.f16801c.a(d1VarF, qt2, (St) xt2.f12510b.f15174c);
                interfaceC0828YgA3.Z0(qt2.f10753W);
                View viewA = (((Boolean) g92.a(H9.U8)).booleanValue() && qt2.f10769g0) ? ViewTreeObserverOnScrollChangedListenerC1275hj.a(context, interfaceC0828YgA3.b0(), qt2) : new C0461Cn(context, interfaceC0828YgA3.b0(), (C2925i) c1873sq.f16804f.apply(qt2));
                if (((Boolean) g92.a(e92)).booleanValue()) {
                    A.f.r(p2.j.f22785C.f22797k, c0750Tn3.f11461e, "rendering-webview-creation-end");
                }
                C0795Wh c0795Wh = c1873sq.f16799a;
                C0778Vh c0778Vh = new C0778Vh(c0795Wh.f12278d, c0795Wh.f12280e, new C1338iu(xt2, qt2, (String) null), new C1431kf(viewA, interfaceC0828YgA3, new C1819rq(interfaceC0828YgA3), d1VarF.i ? new Rt(-3, 0, true) : new Rt(d1VarF.f23192e, d1VarF.f23189b, false)));
                if (((Boolean) g92.a(e92)).booleanValue()) {
                    A.f.r(p2.j.f22785C.f22797k, c0750Tn3.f11461e, "rendering-ad-component-creation-end");
                }
                C1799rN c1799rN2 = c0778Vh.f12065c0;
                ((C2248zn) c1799rN2.c()).a(interfaceC0828YgA3, false, null, c0750Tn3.f11461e);
                C1867sk c1867sk = (C1867sk) c0778Vh.f12054Q.c();
                final int i3 = 1;
                InterfaceC1921tk interfaceC1921tk = new InterfaceC1921tk() { // from class: com.google.android.gms.internal.ads.iq
                    @Override // com.google.android.gms.internal.ads.InterfaceC1921tk
                    public final /* synthetic */ void z() {
                        switch (i3) {
                            case 0:
                                InterfaceC0828Yg interfaceC0828Yg2 = interfaceC0828YgA3;
                                if (interfaceC0828Yg2.l0() != null) {
                                    interfaceC0828Yg2.l0().O();
                                    break;
                                }
                                break;
                            case 1:
                                InterfaceC0828Yg interfaceC0828Yg3 = interfaceC0828YgA3;
                                if (interfaceC0828Yg3.l0() != null) {
                                    interfaceC0828Yg3.l0().O();
                                    break;
                                }
                                break;
                            case 2:
                                InterfaceC0828Yg interfaceC0828Yg4 = interfaceC0828YgA3;
                                if (interfaceC0828Yg4.l0() != null) {
                                    interfaceC0828Yg4.l0().O();
                                    break;
                                }
                                break;
                            default:
                                InterfaceC0828Yg interfaceC0828Yg5 = interfaceC0828YgA3;
                                if (interfaceC0828Yg5.l0() != null) {
                                    interfaceC0828Yg5.l0().O();
                                    break;
                                }
                                break;
                        }
                    }
                };
                C0623Mf c0623Mf = AbstractC0640Nf.f10011g;
                c1867sk.z1(interfaceC1921tk, c0623Mf);
                Ut ut2 = qt2.f10791s;
                String strA2 = ut2.f11811a;
                if (((Boolean) g92.a(H9.d6)).booleanValue() && ((C0820Xp) c0778Vh.f12052O.c()).a()) {
                    strA2 = AbstractC1810rh.a(strA2, AbstractC1810rh.b(qt2));
                }
                C0657Of c0657OfB = C2248zn.b(interfaceC0828YgA3, ut2.f11812b, strA2, c0750Tn3.f11461e, (Xu) c0795Wh.f12290l.c());
                PD pd = c0657OfB.f10212a;
                if (qt2.M) {
                    pd.a(new RunnableC1219gh(interfaceC0828YgA3, 7), executor);
                }
                pd.a(new RunnableC0786Vp(c1873sq, 2, interfaceC0828YgA3), executor);
                return AbstractC1984ut.G(c0657OfB, new C1754qe(2, c0778Vh), c0623Mf);
            case 5:
                return AbstractC1984ut.e(ViewTreeObserverOnScrollChangedListenerC1275hj.a(((C1604nq) this.f17322b).f15820b, (View) this.f17323c, (Qt) this.f17324d));
            case 6:
                return AbstractC1984ut.e(ViewTreeObserverOnScrollChangedListenerC1275hj.a(((C2035vq) this.f17322b).f17346b, (View) this.f17323c, (Qt) this.f17324d));
            case 7:
                C0464Cq c0464Cq = (C0464Cq) this.f17322b;
                Qt qt3 = (Qt) this.f17323c;
                Xt xt3 = (Xt) this.f17324d;
                C0750Tn c0750Tn4 = c0464Cq.f7674j;
                E9 e93 = H9.f8585E2;
                G9 g93 = C2841s.f23267e.f23270c;
                if (((Boolean) g93.a(e93)).booleanValue()) {
                    A.f.r(p2.j.f22785C.f22797k, c0750Tn4.f11461e, "rendering-webview-creation-start");
                }
                C0427An c0427An2 = c0464Cq.f7668c;
                C0960bu c0960bu2 = c0464Cq.f7669d;
                final InterfaceC0828Yg interfaceC0828YgA4 = c0427An2.a(c0960bu2.f13484f, qt3, (St) xt3.f12510b.f15174c);
                interfaceC0828YgA4.Z0(qt3.f10753W);
                if (((Boolean) g93.a(e93)).booleanValue()) {
                    A.f.r(p2.j.f22785C.f22797k, c0750Tn4.f11461e, "rendering-webview-creation-end");
                }
                C0657Of c0657Of3 = new C0657Of();
                C0893ai c0893ai = (C0893ai) c0464Cq.f7676l;
                C1338iu c1338iu2 = new C1338iu(xt3, qt3, (String) null);
                Context context2 = c0464Cq.f7667b;
                C2951a c2951a2 = c0464Cq.f7671f;
                boolean z7 = c0464Cq.f7673h;
                C0500Fb c0500Fb2 = c0464Cq.f7672g;
                C0846Zh c0846Zh = new C0846Zh(c0893ai.f13187b, c0893ai.f13188c, c1338iu2, new C0697Ql(new C0447Bq(context2, c2951a2, c0657Of3, qt3, interfaceC0828YgA4, c0960bu2, z7, c0500Fb2, c0464Cq.i, c0464Cq.f7675k), 16, interfaceC0828YgA4));
                c0657Of3.b(c0846Zh);
                if (((Boolean) g93.a(e93)).booleanValue()) {
                    c0750Tn = c0750Tn4;
                    A.f.r(p2.j.f22785C.f22797k, c0750Tn.f11461e, "rendering-ad-component-creation-end");
                } else {
                    c0750Tn = c0750Tn4;
                }
                final int i6 = 2;
                ((C1867sk) c0846Zh.f12922L.c()).z1(new InterfaceC1921tk() { // from class: com.google.android.gms.internal.ads.iq
                    @Override // com.google.android.gms.internal.ads.InterfaceC1921tk
                    public final /* synthetic */ void z() {
                        switch (i6) {
                            case 0:
                                InterfaceC0828Yg interfaceC0828Yg2 = interfaceC0828YgA4;
                                if (interfaceC0828Yg2.l0() != null) {
                                    interfaceC0828Yg2.l0().O();
                                    break;
                                }
                                break;
                            case 1:
                                InterfaceC0828Yg interfaceC0828Yg3 = interfaceC0828YgA4;
                                if (interfaceC0828Yg3.l0() != null) {
                                    interfaceC0828Yg3.l0().O();
                                    break;
                                }
                                break;
                            case 2:
                                InterfaceC0828Yg interfaceC0828Yg4 = interfaceC0828YgA4;
                                if (interfaceC0828Yg4.l0() != null) {
                                    interfaceC0828Yg4.l0().O();
                                    break;
                                }
                                break;
                            default:
                                InterfaceC0828Yg interfaceC0828Yg5 = interfaceC0828YgA4;
                                if (interfaceC0828Yg5.l0() != null) {
                                    interfaceC0828Yg5.l0().O();
                                    break;
                                }
                                break;
                        }
                    }
                }, AbstractC0640Nf.f10011g);
                Ut ut3 = qt3.f10791s;
                String strA3 = ut3.f11811a;
                if (((Boolean) g93.a(H9.d6)).booleanValue() && ((C0820Xp) c0846Zh.f12921K.c()).a()) {
                    strA3 = AbstractC1810rh.a(strA3, AbstractC1810rh.b(qt3));
                }
                C1799rN c1799rN3 = c0846Zh.b0;
                ((C2248zn) c1799rN3.c()).a(interfaceC0828YgA4, true, true != z7 ? null : c0500Fb2, c0750Tn.f11461e);
                return AbstractC1984ut.G(C2248zn.b(interfaceC0828YgA4, ut3.f11812b, strA3, c0750Tn.f11461e, (Xu) c0893ai.i.c()), new C0678Pj(interfaceC0828YgA4, qt3, c0846Zh, 2), c0464Cq.f7670e);
            case 8:
                C0532Gq c0532Gq = (C0532Gq) this.f17322b;
                Xt xt4 = (Xt) this.f17323c;
                Qt qt4 = (Qt) this.f17324d;
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.length() == 0) {
                    return AbstractC1984ut.w(new C0836Yo(3));
                }
                int i7 = ((C0960bu) xt4.f12509a.f10110b).f13489l;
                if (i7 <= 1) {
                    return AbstractC1984ut.G(c0532Gq.c(xt4, qt4, jSONArray.getJSONObject(0)), C1563n2.f15718k, c0532Gq.f8447b);
                }
                int length = jSONArray.length();
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.F2)).booleanValue()) {
                    c0532Gq.f8451f.b("nsl", String.valueOf(length));
                }
                c0532Gq.f8449d.a(Math.min(length, i7));
                ArrayList arrayList = new ArrayList(i7);
                for (int i8 = 0; i8 < i7; i8++) {
                    if (i8 < length) {
                        arrayList.add(c0532Gq.c(xt4, qt4, jSONArray.getJSONObject(i8)));
                    } else {
                        arrayList.add(AbstractC1984ut.w(new C0836Yo(3)));
                    }
                }
                return AbstractC1984ut.e(arrayList);
            default:
                C0464Cq c0464Cq2 = (C0464Cq) this.f17322b;
                Qt qt5 = (Qt) this.f17323c;
                Xt xt5 = (Xt) this.f17324d;
                C0750Tn c0750Tn5 = c0464Cq2.f7674j;
                E9 e94 = H9.f8585E2;
                G9 g94 = C2841s.f23267e.f23270c;
                if (((Boolean) g94.a(e94)).booleanValue()) {
                    A.f.r(p2.j.f22785C.f22797k, c0750Tn5.f11461e, "rendering-webview-creation-start");
                }
                C0427An c0427An3 = c0464Cq2.f7668c;
                C0960bu c0960bu3 = c0464Cq2.f7669d;
                final InterfaceC0828Yg interfaceC0828YgA5 = c0427An3.a(c0960bu3.f13484f, qt5, (St) xt5.f12510b.f15174c);
                interfaceC0828YgA5.Z0(qt5.f10753W);
                if (((Boolean) g94.a(e94)).booleanValue()) {
                    A.f.r(p2.j.f22785C.f22797k, c0750Tn5.f11461e, "rendering-webview-creation-end");
                }
                C0657Of c0657Of4 = new C0657Of();
                C1002ci c1002ci = (C1002ci) c0464Cq2.f7676l;
                C1338iu c1338iu3 = new C1338iu(xt5, qt5, (String) null);
                Context context3 = c0464Cq2.f7667b;
                C2951a c2951a3 = c0464Cq2.f7671f;
                C0500Fb c0500Fb3 = c0464Cq2.f7672g;
                boolean z8 = c0464Cq2.f7673h;
                BinderC0718Rp binderC0718Rp = c0464Cq2.i;
                C0750Tn c0750Tn6 = c0464Cq2.f7674j;
                C0948bi c0948bi = new C0948bi(c1002ci.f13639c, c1002ci.f13640d, c1338iu3, new C1978un(new G3.q(context3, c0427An3, c0960bu3, c2951a3, qt5, c0657Of4, interfaceC0828YgA5, c0500Fb3, z8, binderC0718Rp, c0750Tn6, c0464Cq2.f7675k), interfaceC0828YgA5, 0));
                c0657Of4.b(c0948bi);
                if (((Boolean) g94.a(e94)).booleanValue()) {
                    A.f.r(p2.j.f22785C.f22797k, c0750Tn6.f11461e, "rendering-ad-component-creation-end");
                }
                interfaceC0828YgA5.g0("/reward", new C1858sb(5, (C2246zl) c0948bi.f13449a0.c()));
                final int i9 = 3;
                ((C1867sk) c0948bi.f13435L.c()).z1(new InterfaceC1921tk() { // from class: com.google.android.gms.internal.ads.iq
                    @Override // com.google.android.gms.internal.ads.InterfaceC1921tk
                    public final /* synthetic */ void z() {
                        switch (i9) {
                            case 0:
                                InterfaceC0828Yg interfaceC0828Yg2 = interfaceC0828YgA5;
                                if (interfaceC0828Yg2.l0() != null) {
                                    interfaceC0828Yg2.l0().O();
                                    break;
                                }
                                break;
                            case 1:
                                InterfaceC0828Yg interfaceC0828Yg3 = interfaceC0828YgA5;
                                if (interfaceC0828Yg3.l0() != null) {
                                    interfaceC0828Yg3.l0().O();
                                    break;
                                }
                                break;
                            case 2:
                                InterfaceC0828Yg interfaceC0828Yg4 = interfaceC0828YgA5;
                                if (interfaceC0828Yg4.l0() != null) {
                                    interfaceC0828Yg4.l0().O();
                                    break;
                                }
                                break;
                            default:
                                InterfaceC0828Yg interfaceC0828Yg5 = interfaceC0828YgA5;
                                if (interfaceC0828Yg5.l0() != null) {
                                    interfaceC0828Yg5.l0().O();
                                    break;
                                }
                                break;
                        }
                    }
                }, AbstractC0640Nf.f10011g);
                C1799rN c1799rN4 = c0948bi.b0;
                ((C2248zn) c1799rN4.c()).a(interfaceC0828YgA5, true, true != z8 ? null : c0500Fb3, c0750Tn6.f11461e);
                Ut ut4 = qt5.f10791s;
                String strA4 = ut4.f11811a;
                if (((Boolean) g94.a(H9.d6)).booleanValue() && ((C0820Xp) c0948bi.f13434K.c()).a()) {
                    strA4 = AbstractC1810rh.a(strA4, AbstractC1810rh.b(qt5));
                }
                return AbstractC1984ut.G(C2248zn.b(interfaceC0828YgA5, ut4.f11812b, strA4, c0750Tn6.f11461e, (Xu) c1002ci.f13643g.c()), new C0678Pj(interfaceC0828YgA5, qt5, c0948bi, 3), c0464Cq2.f7670e);
        }
    }

    public /* synthetic */ C2028vj(Object obj, Object obj2, Object obj3, int i) {
        this.f17321a = i;
        this.f17322b = obj;
        this.f17323c = obj2;
        this.f17324d = obj3;
    }
}
