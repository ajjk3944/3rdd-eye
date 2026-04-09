package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class sq implements e81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16511b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16512c;

    public /* synthetic */ sq(int i4, Object obj, Object obj2) {
        this.f16510a = i4;
        this.f16511b = obj;
        this.f16512c = obj2;
    }

    private final vd.b a(Object obj) {
        ar0 ar0Var;
        pq0 pq0Var = (pq0) this.f16511b;
        x50 x50Var = (x50) this.f16512c;
        bp0 bp0Var = (bp0) obj;
        pq0 pq0Var2 = (pq0) pq0Var.f15073b;
        br0 br0Var = bp0Var.f9755b;
        iu iuVar = bp0Var.f9754a;
        synchronized (pq0Var2) {
            try {
                uq0 uq0Var = (uq0) ((ConcurrentHashMap) pq0Var2.f15073b).get(br0Var);
                ar0Var = null;
                if (uq0Var != null) {
                    ir0 ir0Var = uq0Var.f17294d;
                    ir0Var.getClass();
                    ua.j.C.f35267k.getClass();
                    ir0Var.f12423c = System.currentTimeMillis();
                    ir0Var.f12424d++;
                    uq0Var.a();
                    LinkedList linkedList = uq0Var.f17291a;
                    if (!linkedList.isEmpty() && (ar0Var = (ar0) linkedList.remove()) != null) {
                        ir0Var.f12425e++;
                        ir0Var.f12422b.f11962a = true;
                    }
                    if (ar0Var == null) {
                        ((xq0) pq0Var2.f15075d).f18448e++;
                    }
                    hr0 hr0Var = uq0Var.f17294d.f12422b;
                    hr0 hr0VarClone = hr0Var.clone();
                    hr0Var.f11962a = false;
                    hr0Var.f11963b = 0;
                    if (ar0Var != null) {
                        kj kjVarA = pj.A();
                        ij ijVarB = jj.B();
                        ijVarB.b();
                        ((jj) ijVarB.f14755b).C();
                        lj ljVarA = mj.A();
                        boolean z3 = hr0VarClone.f11962a;
                        ljVarA.b();
                        ((mj) ljVarA.f14755b).C(z3);
                        int i4 = hr0VarClone.f11963b;
                        ljVarA.b();
                        ((mj) ljVarA.f14755b).D(i4);
                        ijVarB.b();
                        ((jj) ijVarB.f14755b).D((mj) ljVarA.e());
                        kjVarA.b();
                        ((pj) kjVarA.f14755b).B((jj) ijVarB.e());
                        ar0Var.f9390a.b().f18632f.m((pj) kjVarA.e());
                    }
                    pq0Var2.C();
                } else {
                    ((xq0) pq0Var2.f15075d).f18447d++;
                    pq0Var2.C();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (ar0Var != null && iuVar != null) {
            y40 y40VarB = x50Var.b();
            pq0 pq0Var3 = y40VarB.f18633h;
            pr0 pr0VarT = y40VarB.f18629c.a(qr0.NOTIFY_CACHE_HIT, pq0Var3.D(iuVar, new ix0(28, pq0Var3), new rg0(0, pq0Var3), k20.f12993f)).t();
            pr0VarT.a(new q81(0, pr0VarT, new mx0(17, y40VarB)), y40VarB.j);
            pr0VarT.a(new q81(0, pr0VarT, (tk0) pq0Var.f15075d), (Executor) pq0Var.f15074c);
        }
        return yo0.e(new wo0(br0Var, iuVar, ar0Var));
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final vd.b c(Object obj) throws JSONException, lq {
        qj0 qj0Var;
        boolean z3 = false;
        switch (this.f16510a) {
            case 0:
                jq jqVar = (jq) obj;
                jqVar.e((String) this.f16511b, (oo) this.f16512c);
                return yo0.e(jqVar);
            case 1:
                vq vqVar = (vq) this.f16511b;
                Object obj2 = this.f16512c;
                gx gxVar = new gx();
                ya.f0 f0Var = ua.j.C.f35261c;
                String string = UUID.randomUUID().toString();
                no.j.b(string, new vo(vqVar, gxVar));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(FacebookMediationAdapter.KEY_ID, string);
                jSONObject.put("args", (JSONObject) obj2);
                ((jq) obj).c("google.afma.activeView.handleUpdate", jSONObject);
                return gxVar;
            case 2:
                t20 t20Var = (t20) this.f16511b;
                Uri.Builder builder = (Uri.Builder) this.f16512c;
                ((ex) t20Var.f16674e).c(new s20(t20Var, (Throwable) obj, 0));
                builder.appendQueryParameter((String) va.s.f36163e.f36166c.a(sk.f16405xb), "9");
                return yo0.e(builder.toString());
            case 3:
                y40 y40Var = (y40) this.f16511b;
                iu iuVar = (iu) obj;
                iuVar.f12480i = (zq0) this.f16512c;
                pq0 pq0Var = y40Var.f18633h;
                int i4 = 2;
                return pq0Var.D(iuVar, new mx0(29, (jg0) pq0Var.f15074c), new ne0(i4, pq0Var), new xf0(iuVar, i4));
            case 4:
                ub0 ub0Var = (ub0) this.f16511b;
                JSONObject jSONObject2 = (JSONObject) this.f16512c;
                qz qzVar = (qz) obj;
                op opVar = ub0Var.f17139a.f11942b;
                gi giVar = new gi(qzVar);
                if (opVar != null) {
                    qzVar.D0(new h0(5, 0, 0));
                } else {
                    qzVar.D0(new h0(4, 0, 0));
                }
                qzVar.X().g = new tb0(ub0Var, qzVar, giVar, 1);
                qzVar.c("google.afma.nativeAds.renderVideo", jSONObject2);
                return giVar;
            case 5:
                cg0 cg0Var = (cg0) this.f16511b;
                qq qqVar = (qq) this.f16512c;
                JSONObject jSONObject3 = (JSONObject) obj;
                if (((Boolean) va.s.f36163e.f36166c.a(sk.D2)).booleanValue()) {
                    d.h.D(ua.j.C.f35267k, cg0Var.f10112i.f14678e, "scar-preloader-processing-done");
                }
                return qqVar.a(jSONObject3);
            case 6:
                cg0 cg0Var2 = (cg0) this.f16511b;
                List list = (List) this.f16512c;
                Exception exc = (Exception) obj;
                ua.j.C.f35265h.g("PreloadedLoader.getTypeTwoAdResponseString", exc);
                if (exc instanceof TimeoutException) {
                    qj0Var = new qj0(1, "Timed out waiting for ad response.");
                } else if (exc instanceof qj0) {
                    qj0Var = (qj0) exc;
                } else {
                    qj0Var = new qj0(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                }
                String message = qj0Var.getMessage() == null ? "" : qj0Var.getMessage();
                if (list != null && !list.isEmpty()) {
                    String str = "0.6.0.0";
                    if (!TextUtils.isEmpty(message)) {
                        if (message.contains("Timed out waiting for ad response.")) {
                            message = "timeout";
                            str = "0.2.0.0";
                        } else if (message.contains("Received HTTP error code from ad server:")) {
                            List listR = rg0.k(new y21(':')).r(message);
                            if (listR.size() == 2) {
                                message = (String) listR.get(1);
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(bt0.c(bt0.c((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
                    }
                    cg0Var2.j.a(arrayList, null);
                }
                return yo0.w(qj0Var);
            case 7:
                return ((ng0) ((js1) this.f16511b).a()).j((iu) this.f16512c);
            case 8:
                Bundle bundle = (Bundle) obj;
                aw awVar = (aw) this.f16511b;
                t7.m mVar = (t7.m) awVar.f9451b;
                k10 k10Var = (k10) awVar.f9454e;
                Context context = k10Var.f12922a.f17809b;
                al0.z(context);
                ex exVar = fx.f11274a;
                al0.z(exVar);
                iu iuVar2 = (iu) mVar.f34474c;
                al0.z(iuVar2.f12476d);
                ho0 ho0Var = new ho0();
                es1 es1Var = k10Var.f12928d;
                jl0 jl0Var = new jl0(ho0Var, 0L, (ScheduledExecutorService) es1Var.a());
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) es1Var.a();
                Context context2 = k10Var.f12922a.f17809b;
                al0.z(context2);
                jl0 jl0Var2 = new jl0(new el0(6, scheduledExecutorService), ((Long) va.s.f36163e.f36166c.a(sk.U4)).longValue(), (ScheduledExecutorService) es1Var.a());
                tw twVar = new tw();
                al0.z(context2);
                jl0 jl0Var3 = new jl0(new bo0(twVar, context2, (ScheduledExecutorService) es1Var.a(), exVar, mVar.f34473b, iuVar2.f12482l, iuVar2.f12481k), 0L, (ScheduledExecutorService) es1Var.a());
                jl0 jl0Var4 = new jl0(new nm0(exVar, 4), 0L, (ScheduledExecutorService) es1Var.a());
                nm0 nm0Var = new nm0(exVar, 3);
                al0.z(exVar);
                List list2 = ((iu) mVar.f34474c).f12477e;
                al0.z(list2);
                xl0 xl0Var = new xl0(7, exVar, list2);
                t7.m mVar2 = (t7.m) awVar.f9451b;
                ex exVar2 = fx.f11274a;
                al0.z(exVar2);
                iu iuVar3 = (iu) mVar2.f34474c;
                String string2 = iuVar3.f12473a.getString("ms");
                if (string2 == null) {
                    string2 = "";
                }
                PackageInfo packageInfo = iuVar3.f12478f;
                xl0 xl0Var2 = new xl0(6, exVar2, string2);
                qn0 qn0Var = (qn0) k10Var.O0.a();
                es1 es1Var2 = k10Var.B;
                al0.z(iuVar2.f12476d);
                return new tn0(context, exVar, e51.k(jl0Var, jl0Var2, jl0Var3, jl0Var4, nm0Var, xl0Var, xl0Var2, qn0Var, new ol0((zw) es1Var2.a(), (ScheduledExecutorService) es1Var.a(), exVar), new ko0((zw) es1Var2.a(), iuVar2.f12481k, exVar, (ScheduledExecutorService) es1Var.a(), mVar.G(), iuVar2.f12485o)), (bs0) ((es1) awVar.f9452c).a(), (qd0) k10Var.j.a()).a(va.r.g.f36157a.k(bundle), ((iu) this.f16512c).f12483m, false);
            case 9:
                return ((tn0) this.f16511b).a(va.r.g.f36157a.k((Bundle) obj), ((iu) this.f16512c).f12483m, false);
            case 10:
                cj0 cj0Var = (cj0) this.f16511b;
                hc0 hc0Var = (hc0) this.f16512c;
                JSONObject jSONObject4 = (JSONObject) obj;
                rq0 rq0Var = cj0Var.f10140d;
                s81 s81VarE = yo0.e(hc0Var);
                synchronized (rq0Var) {
                    rq0Var.f15730a.addFirst(s81VarE);
                }
                if (!jSONObject4.optBoolean("success")) {
                    throw new lq("process json failed");
                }
                if (((Boolean) va.s.f36163e.f36166c.a(sk.D2)).booleanValue()) {
                    d.h.D(ua.j.C.f35267k, cj0Var.f10142f.f14678e, "rendering-native-ads-preprocess-end");
                }
                return yo0.e(jSONObject4.getJSONObject("json").getJSONArray("ads"));
            case 11:
                cj0 cj0Var2 = (cj0) this.f16511b;
                wp0 wp0Var = (wp0) this.f16512c;
                hc0 hc0Var2 = (hc0) obj;
                pk pkVar = sk.D2;
                va.s sVar = va.s.f36163e;
                if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                    d.h.D(ua.j.C.f35267k, cj0Var2.f10142f.f14678e, "rendering-native-ads-preprocess-start");
                }
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("isNonagon", true);
                if (((Boolean) sVar.f36166c.a(sk.O9)).booleanValue() && tb.b.h()) {
                    jSONObject5.put("skipDeepLinkValidation", true);
                }
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("response", wp0Var.f18106s.f9388c);
                jSONObject6.put("sdk_params", jSONObject5);
                return yo0.F(hc0Var2.a("google.afma.nativeAds.preProcessJson", jSONObject6), new sq(10, cj0Var2, hc0Var2), cj0Var2.f10138b);
            case 12:
                dq0 dq0Var = (dq0) obj;
                ((ar0) this.f16511b).f9391b = dq0Var;
                Iterator it2 = ((List) dq0Var.f10544b.f9451b).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Iterator it3 = ((wp0) it2.next()).f18072a.iterator();
                        while (it3.hasNext()) {
                            if (((String) it3.next()).contains("FirstPartyRenderer")) {
                                z3 = true;
                            }
                        }
                    } else if (z3) {
                        return ((y40) this.f16512c).c(yo0.e(dq0Var));
                    }
                }
                return s81.f15906b;
            case 13:
                return a(obj);
            default:
                return ((az0) ((px0) this.f16511b).f15135b.f10931f.get()).f((Context) this.f16512c);
        }
    }
}
