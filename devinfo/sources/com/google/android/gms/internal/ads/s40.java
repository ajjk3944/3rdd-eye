package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class s40 implements e81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15862b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15863c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15864d;

    public /* synthetic */ s40(zh0 zh0Var, wp0 wp0Var, dq0 dq0Var, h80 h80Var, int i4) {
        this.f15861a = i4;
        this.f15862b = zh0Var;
        this.f15863c = wp0Var;
        this.f15864d = dq0Var;
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final vd.b c(Object obj) throws JSONException {
        od0 od0Var;
        switch (this.f15861a) {
            case 0:
                u40 u40Var = (u40) this.f15862b;
                r7 r7Var = (r7) this.f15863c;
                vd.b bVar = (vd.b) this.f15864d;
                o40 o40Var = (o40) obj;
                u40Var.getClass();
                if (o40Var != null) {
                    r7Var.mo163h(o40Var);
                }
                return yo0.E(bVar, ((Long) gm.f11552a.u()).longValue(), TimeUnit.MILLISECONDS, u40Var.f17084b);
            case 1:
                ub0 ub0Var = (ub0) this.f15862b;
                ua.a aVar = (ua.a) this.f15863c;
                uv uvVar = (uv) this.f15864d;
                qz qzVarA = ub0Var.f17141c.a(va.c3.a(), null, null);
                gi giVar = new gi(qzVarA);
                ub0Var.a(qzVarA, aVar, uvVar);
                qzVarA.X().f12087h = new mx0(24, giVar);
                qzVarA.loadUrl((String) va.s.f36163e.f36166c.a(sk.f16381w4));
                return giVar;
            case 2:
                hc0 hc0Var = (hc0) this.f15862b;
                String str = (String) this.f15863c;
                JSONObject jSONObject = (JSONObject) this.f15864d;
                qz qzVar = (qz) obj;
                lo loVar = hc0Var.f11833h;
                loVar.getClass();
                gx gxVar = new gx();
                ya.f0 f0Var = ua.j.C.f35261c;
                String string = UUID.randomUUID().toString();
                loVar.b(string, new vo(loVar, gxVar));
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(FacebookMediationAdapter.KEY_ID, string);
                    jSONObject2.put("args", jSONObject);
                    qzVar.c(str, jSONObject2);
                } catch (Exception e2) {
                    gxVar.d(e2);
                }
                return gxVar;
            case 3:
                hi0 hi0Var = (hi0) this.f15862b;
                wp0 wp0Var = (wp0) this.f15863c;
                dq0 dq0Var = (dq0) this.f15864d;
                od0 od0Var2 = hi0Var.f11886i;
                pk pkVar = sk.E2;
                rk rkVar = va.s.f36163e.f36166c;
                if (((Boolean) rkVar.a(pkVar)).booleanValue()) {
                    d.h.D(ua.j.C.f35267k, od0Var2.f14678e, "rendering-webview-creation-start");
                }
                wc0 wc0Var = hi0Var.f11880b;
                hq0 hq0Var = hi0Var.f11881c;
                final qz qzVarA2 = wc0Var.a(hq0Var.f11946f, wp0Var, (yp0) dq0Var.f10544b.f9452c);
                qzVarA2.N0(wp0Var.W);
                if (((Boolean) rkVar.a(pkVar)).booleanValue()) {
                    d.h.D(ua.j.C.f35267k, od0Var2.f14678e, "rendering-webview-creation-end");
                }
                gx gxVar2 = new gx();
                n10 n10Var = hi0Var.f11879a;
                pq0 pq0Var = new pq0(dq0Var, wp0Var, (String) null);
                za.a aVar2 = hi0Var.f11883e;
                boolean z3 = hi0Var.g;
                qo qoVar = hi0Var.f11884f;
                l10 l10Var = new l10(n10Var.f14105c, n10Var.f14106d, pq0Var, new l90(11, new ji0(aVar2, gxVar2, wp0Var, qzVarA2, hq0Var, z3, qoVar, hi0Var.f11885h, hi0Var.j), qzVarA2), new s9(wp0Var.f18073a0, 1));
                if (((Boolean) rkVar.a(pkVar)).booleanValue()) {
                    d.h.D(ua.j.C.f35267k, od0Var2.f14678e, "rendering-ad-component-creation-end");
                }
                es1 es1Var = l10Var.f13326d0;
                final int i4 = 0;
                ((vc0) es1Var.a()).a(qzVarA2, false, true != z3 ? null : qoVar, od0Var2.f14678e);
                gxVar2.b(l10Var);
                ((o60) l10Var.Q.a()).m1(new p60() { // from class: com.google.android.gms.internal.ads.gi0
                    @Override // com.google.android.gms.internal.ads.p60
                    public final /* synthetic */ void n() {
                        switch (i4) {
                            case 0:
                                qz qzVar2 = qzVarA2;
                                if (qzVar2.X() != null) {
                                    qzVar2.X().G();
                                    break;
                                }
                                break;
                            case 1:
                                qz qzVar3 = qzVarA2;
                                if (qzVar3.X() != null) {
                                    qzVar3.X().G();
                                    break;
                                }
                                break;
                            case 2:
                                qz qzVar4 = qzVarA2;
                                if (qzVar4.X() != null) {
                                    qzVar4.X().G();
                                    break;
                                }
                                break;
                            default:
                                qz qzVar5 = qzVarA2;
                                if (qzVar5.X() != null) {
                                    qzVar5.X().G();
                                    break;
                                }
                                break;
                        }
                    }
                }, fx.g);
                aq0 aq0Var = wp0Var.f18106s;
                String strA = aq0Var.f9386a;
                if (((Boolean) rkVar.a(sk.f16090d6)).booleanValue() && ((wh0) l10Var.P.a()).a()) {
                    strA = l00.a(strA, l00.b(wp0Var));
                }
                return yo0.G(vc0.b(qzVarA2, aq0Var.f9387b, strA, od0Var2.f14678e, (bs0) n10Var.f14108f.a()), new l50(qzVarA2, wp0Var, l10Var, 1), hi0Var.f11882d);
            case 4:
                pi0 pi0Var = (pi0) this.f15862b;
                dq0 dq0Var2 = (dq0) this.f15863c;
                wp0 wp0Var2 = (wp0) this.f15864d;
                Executor executor = pi0Var.f15013e;
                od0 od0Var3 = pi0Var.g;
                pk pkVar2 = sk.E2;
                rk rkVar2 = va.s.f36163e.f36166c;
                if (((Boolean) rkVar2.a(pkVar2)).booleanValue()) {
                    d.h.D(ua.j.C.f35267k, od0Var3.f14678e, "rendering-webview-creation-start");
                }
                Context context = pi0Var.f15010b;
                va.c3 c3VarF = yr1.f(context, wp0Var2.f18110u);
                final qz qzVarA3 = pi0Var.f15011c.a(c3VarF, wp0Var2, (yp0) dq0Var2.f10544b.f9452c);
                qzVarA3.N0(wp0Var2.W);
                View viewA = (((Boolean) rkVar2.a(sk.U8)).booleanValue() && wp0Var2.f18084g0) ? e40.a(context, qzVarA3.N(), wp0Var2) : new yc0(context, qzVarA3.N(), (ya.g) pi0Var.f15014f.apply(wp0Var2));
                if (((Boolean) rkVar2.a(pkVar2)).booleanValue()) {
                    d.h.D(ua.j.C.f35267k, od0Var3.f14678e, "rendering-webview-creation-end");
                }
                p10 p10Var = pi0Var.f15009a;
                o10 o10Var = new o10(p10Var.f14832d, p10Var.f14834e, new pq0(dq0Var2, wp0Var2, (String) null), new aw(viewA, qzVarA3, new ne0(6, qzVarA3), c3VarF.f36045i ? new xp0(-3, 0, true) : new xp0(c3VarF.f36042e, c3VarF.f36039b, false)));
                if (((Boolean) rkVar2.a(pkVar2)).booleanValue()) {
                    d.h.D(ua.j.C.f35267k, od0Var3.f14678e, "rendering-ad-component-creation-end");
                }
                es1 es1Var2 = o10Var.f14510g0;
                ((vc0) es1Var2.a()).a(qzVarA3, false, null, od0Var3.f14678e);
                o60 o60Var = (o60) o10Var.U.a();
                final int i10 = 1;
                p60 p60Var = new p60() { // from class: com.google.android.gms.internal.ads.gi0
                    @Override // com.google.android.gms.internal.ads.p60
                    public final /* synthetic */ void n() {
                        switch (i10) {
                            case 0:
                                qz qzVar2 = qzVarA3;
                                if (qzVar2.X() != null) {
                                    qzVar2.X().G();
                                    break;
                                }
                                break;
                            case 1:
                                qz qzVar3 = qzVarA3;
                                if (qzVar3.X() != null) {
                                    qzVar3.X().G();
                                    break;
                                }
                                break;
                            case 2:
                                qz qzVar4 = qzVarA3;
                                if (qzVar4.X() != null) {
                                    qzVar4.X().G();
                                    break;
                                }
                                break;
                            default:
                                qz qzVar5 = qzVarA3;
                                if (qzVar5.X() != null) {
                                    qzVar5.X().G();
                                    break;
                                }
                                break;
                        }
                    }
                };
                ex exVar = fx.g;
                o60Var.m1(p60Var, exVar);
                aq0 aq0Var2 = wp0Var2.f18106s;
                String strA2 = aq0Var2.f9386a;
                if (((Boolean) rkVar2.a(sk.f16090d6)).booleanValue() && ((wh0) o10Var.S.a()).a()) {
                    strA2 = l00.a(strA2, l00.b(wp0Var2));
                }
                gx gxVarB = vc0.b(qzVarA3, aq0Var2.f9387b, strA2, od0Var3.f14678e, (bs0) p10Var.f14843l.a());
                d91 d91Var = gxVarB.f11625a;
                if (wp0Var2.M) {
                    d91Var.a(new a00(qzVarA3, 7), executor);
                }
                d91Var.a(new uh0(1, pi0Var, qzVarA3), executor);
                return yo0.G(gxVarB, new hu(2, o10Var), exVar);
            case 5:
                return yo0.e(e40.a(((li0) this.f15862b).f13498b, (View) this.f15863c, (wp0) this.f15864d));
            case 6:
                return yo0.e(e40.a(((si0) this.f15862b).f16019b, (View) this.f15863c, (wp0) this.f15864d));
            case 7:
                yi0 yi0Var = (yi0) this.f15862b;
                wp0 wp0Var3 = (wp0) this.f15863c;
                dq0 dq0Var3 = (dq0) this.f15864d;
                od0 od0Var4 = yi0Var.j;
                pk pkVar3 = sk.E2;
                rk rkVar3 = va.s.f36163e.f36166c;
                if (((Boolean) rkVar3.a(pkVar3)).booleanValue()) {
                    d.h.D(ua.j.C.f35267k, od0Var4.f14678e, "rendering-webview-creation-start");
                }
                wc0 wc0Var2 = yi0Var.f18757c;
                hq0 hq0Var2 = yi0Var.f18758d;
                final qz qzVarA4 = wc0Var2.a(hq0Var2.f11946f, wp0Var3, (yp0) dq0Var3.f10544b.f9452c);
                qzVarA4.N0(wp0Var3.W);
                if (((Boolean) rkVar3.a(pkVar3)).booleanValue()) {
                    d.h.D(ua.j.C.f35267k, od0Var4.f14678e, "rendering-webview-creation-end");
                }
                gx gxVar3 = new gx();
                t10 t10Var = (t10) yi0Var.f18764l;
                pq0 pq0Var2 = new pq0(dq0Var3, wp0Var3, (String) null);
                Context context2 = yi0Var.f18756b;
                za.a aVar3 = yi0Var.f18760f;
                boolean z10 = yi0Var.f18761h;
                qo qoVar2 = yi0Var.g;
                s10 s10Var = new s10(t10Var.f16640b, t10Var.f16641c, pq0Var2, new l90(11, new xi0(context2, aVar3, gxVar3, wp0Var3, qzVarA4, hq0Var2, z10, qoVar2, yi0Var.f18762i, yi0Var.f18763k), qzVarA4));
                gxVar3.b(s10Var);
                if (((Boolean) rkVar3.a(pkVar3)).booleanValue()) {
                    od0Var = od0Var4;
                    d.h.D(ua.j.C.f35267k, od0Var.f14678e, "rendering-ad-component-creation-end");
                } else {
                    od0Var = od0Var4;
                }
                final int i11 = 2;
                ((o60) s10Var.P.a()).m1(new p60() { // from class: com.google.android.gms.internal.ads.gi0
                    @Override // com.google.android.gms.internal.ads.p60
                    public final /* synthetic */ void n() {
                        switch (i11) {
                            case 0:
                                qz qzVar2 = qzVarA4;
                                if (qzVar2.X() != null) {
                                    qzVar2.X().G();
                                    break;
                                }
                                break;
                            case 1:
                                qz qzVar3 = qzVarA4;
                                if (qzVar3.X() != null) {
                                    qzVar3.X().G();
                                    break;
                                }
                                break;
                            case 2:
                                qz qzVar4 = qzVarA4;
                                if (qzVar4.X() != null) {
                                    qzVar4.X().G();
                                    break;
                                }
                                break;
                            default:
                                qz qzVar5 = qzVarA4;
                                if (qzVar5.X() != null) {
                                    qzVar5.X().G();
                                    break;
                                }
                                break;
                        }
                    }
                }, fx.g);
                aq0 aq0Var3 = wp0Var3.f18106s;
                String strA3 = aq0Var3.f9386a;
                if (((Boolean) rkVar3.a(sk.f16090d6)).booleanValue() && ((wh0) s10Var.O.a()).a()) {
                    strA3 = l00.a(strA3, l00.b(wp0Var3));
                }
                es1 es1Var3 = s10Var.f15839f0;
                ((vc0) es1Var3.a()).a(qzVarA4, true, true != z10 ? null : qoVar2, od0Var.f14678e);
                return yo0.G(vc0.b(qzVarA4, aq0Var3.f9387b, strA3, od0Var.f14678e, (bs0) t10Var.f16646i.a()), new l50(qzVarA4, wp0Var3, s10Var, 2), yi0Var.f18759e);
            case 8:
                cj0 cj0Var = (cj0) this.f15862b;
                dq0 dq0Var4 = (dq0) this.f15863c;
                wp0 wp0Var4 = (wp0) this.f15864d;
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.length() == 0) {
                    return yo0.w(new uf0(3));
                }
                int i12 = ((hq0) dq0Var4.f10543a.f15651b).f11950l;
                if (i12 <= 1) {
                    return yo0.G(cj0Var.c(dq0Var4, wp0Var4, jSONArray.getJSONObject(0)), o5.f14548k, cj0Var.f10138b);
                }
                int length = jSONArray.length();
                if (((Boolean) va.s.f36163e.f36166c.a(sk.F2)).booleanValue()) {
                    cj0Var.f10142f.b("nsl", String.valueOf(length));
                }
                cj0Var.f10140d.a(Math.min(length, i12));
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 < i12; i13++) {
                    if (i13 < length) {
                        arrayList.add(cj0Var.c(dq0Var4, wp0Var4, jSONArray.getJSONObject(i13)));
                    } else {
                        arrayList.add(yo0.w(new uf0(3)));
                    }
                }
                return yo0.e(arrayList);
            default:
                yi0 yi0Var2 = (yi0) this.f15862b;
                wp0 wp0Var5 = (wp0) this.f15863c;
                dq0 dq0Var5 = (dq0) this.f15864d;
                od0 od0Var5 = yi0Var2.j;
                pk pkVar4 = sk.E2;
                rk rkVar4 = va.s.f36163e.f36166c;
                if (((Boolean) rkVar4.a(pkVar4)).booleanValue()) {
                    d.h.D(ua.j.C.f35267k, od0Var5.f14678e, "rendering-webview-creation-start");
                }
                wc0 wc0Var3 = yi0Var2.f18757c;
                hq0 hq0Var3 = yi0Var2.f18758d;
                final qz qzVarA5 = wc0Var3.a(hq0Var3.f11946f, wp0Var5, (yp0) dq0Var5.f10544b.f9452c);
                qzVarA5.N0(wp0Var5.W);
                if (((Boolean) rkVar4.a(pkVar4)).booleanValue()) {
                    d.h.D(ua.j.C.f35267k, od0Var5.f14678e, "rendering-webview-creation-end");
                }
                gx gxVar4 = new gx();
                w10 w10Var = (w10) yi0Var2.f18764l;
                pq0 pq0Var3 = new pq0(dq0Var5, wp0Var5, (String) null);
                Context context3 = yi0Var2.f18756b;
                za.a aVar4 = yi0Var2.f18760f;
                qo qoVar3 = yi0Var2.g;
                boolean z11 = yi0Var2.f18761h;
                qh0 qh0Var = yi0Var2.f18762i;
                od0 od0Var6 = yi0Var2.j;
                v10 v10Var = new v10(w10Var.f17822c, w10Var.f17823d, pq0Var3, new qc0(new wj0(context3, wc0Var3, hq0Var3, aVar4, wp0Var5, gxVar4, qzVarA5, qoVar3, z11, qh0Var, od0Var6, yi0Var2.f18763k), qzVarA5, 0));
                gxVar4.b(v10Var);
                if (((Boolean) rkVar4.a(pkVar4)).booleanValue()) {
                    d.h.D(ua.j.C.f35267k, od0Var6.f14678e, "rendering-ad-component-creation-end");
                }
                qzVarA5.Z("/reward", new co(5, (w80) v10Var.f17425e0.a()));
                final int i14 = 3;
                ((o60) v10Var.P.a()).m1(new p60() { // from class: com.google.android.gms.internal.ads.gi0
                    @Override // com.google.android.gms.internal.ads.p60
                    public final /* synthetic */ void n() {
                        switch (i14) {
                            case 0:
                                qz qzVar2 = qzVarA5;
                                if (qzVar2.X() != null) {
                                    qzVar2.X().G();
                                    break;
                                }
                                break;
                            case 1:
                                qz qzVar3 = qzVarA5;
                                if (qzVar3.X() != null) {
                                    qzVar3.X().G();
                                    break;
                                }
                                break;
                            case 2:
                                qz qzVar4 = qzVarA5;
                                if (qzVar4.X() != null) {
                                    qzVar4.X().G();
                                    break;
                                }
                                break;
                            default:
                                qz qzVar5 = qzVarA5;
                                if (qzVar5.X() != null) {
                                    qzVar5.X().G();
                                    break;
                                }
                                break;
                        }
                    }
                }, fx.g);
                es1 es1Var4 = v10Var.f17426f0;
                ((vc0) es1Var4.a()).a(qzVarA5, true, true != z11 ? null : qoVar3, od0Var6.f14678e);
                aq0 aq0Var4 = wp0Var5.f18106s;
                String strA4 = aq0Var4.f9386a;
                if (((Boolean) rkVar4.a(sk.f16090d6)).booleanValue() && ((wh0) v10Var.O.a()).a()) {
                    strA4 = l00.a(strA4, l00.b(wp0Var5));
                }
                return yo0.G(vc0.b(qzVarA5, aq0Var4.f9387b, strA4, od0Var6.f14678e, (bs0) w10Var.g.a()), new l50(qzVarA5, wp0Var5, v10Var, 3), yi0Var2.f18759e);
        }
    }

    public /* synthetic */ s40(Object obj, Object obj2, Object obj3, int i4) {
        this.f15861a = i4;
        this.f15862b = obj;
        this.f15863c = obj2;
        this.f15864d = obj3;
    }
}
