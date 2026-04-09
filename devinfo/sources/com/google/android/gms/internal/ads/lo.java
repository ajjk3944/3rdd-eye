package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class lo implements oo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13561a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13562b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13563c;

    public /* synthetic */ lo(int i4, Object obj, Object obj2) {
        this.f13561a = i4;
        this.f13562b = obj;
        this.f13563c = obj2;
    }

    private final void a(Object obj, Map map) {
        vc0 vc0Var = (vc0) this.f13562b;
        qz qzVar = (qz) this.f13563c;
        j30 j30Var = vc0Var.f17588i;
        synchronized (j30Var) {
            j30Var.f12609c.add(qzVar);
            e30 e30Var = j30Var.f12607a;
            qzVar.Z("/updateActiveView", e30Var.f10690e);
            qzVar.Z("/untrackActiveViewUnit", e30Var.f10691f);
        }
    }

    public void b(String str, wo woVar) {
        synchronized (this.f13562b) {
            ((HashMap) this.f13563c).put(str, woVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.oo
    public final void k(Object obj, Map map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        wo woVar;
        String str;
        switch (this.f13561a) {
            case 0:
                qz qzVar = (qz) obj;
                no.b(map, (t80) this.f13562b);
                String str2 = (String) map.get("u");
                if (str2 == null) {
                    za.i.h("URL missing from click GMSG.");
                    return;
                }
                t20 t20Var = (t20) this.f13563c;
                n81 n81VarS = n81.s(no.a(qzVar, str2));
                mo moVar = new mo(t20Var, str2, 0);
                ex exVar = fx.f11274a;
                w71 w71VarF = yo0.F(n81VarS, moVar, exVar);
                w71VarF.a(new q81(0, w71VarF, new jo(qzVar)), exVar);
                return;
            case 1:
                Map map2 = (Map) this.f13563c;
                ua.j jVar = ua.j.C;
                dw dwVar = jVar.f35281y;
                dw dwVar2 = jVar.f35281y;
                Context context = (Context) this.f13562b;
                if (dwVar.a(context)) {
                    String str3 = (String) map.get("eventName");
                    String str4 = (String) map.get("eventId");
                    int iHashCode = str3.hashCode();
                    if (iHashCode != 94399) {
                        if (iHashCode != 94401) {
                            if (iHashCode == 94407 && str3.equals("_ai")) {
                                Map map3 = (Map) map2.get("_ai");
                                dwVar2.getClass();
                                dwVar2.h(context, "_ai", str4, dw.f(map3));
                                return;
                            }
                        } else if (str3.equals("_ac")) {
                            Map map4 = (Map) map2.get("_ac");
                            dwVar2.getClass();
                            dwVar2.h(context, "_ac", str4, dw.f(map4));
                            return;
                        }
                    } else if (str3.equals("_aa")) {
                        dwVar2.h(context, "_aa", str4, null);
                        return;
                    }
                    za.i.e("logScionEvent gmsg contained unsupported eventName");
                    return;
                }
                return;
            case 2:
                String str5 = (String) map.get(FacebookMediationAdapter.KEY_ID);
                String str6 = (String) map.get("fail");
                String str7 = (String) map.get("fail_reason");
                String str8 = (String) map.get("fail_stack");
                String str9 = (String) map.get("result");
                if (true == TextUtils.isEmpty(str8)) {
                    str7 = "Unknown Fail Reason.";
                }
                String strConcat = TextUtils.isEmpty(str8) ? "" : "\n".concat(String.valueOf(str8));
                synchronized (this.f13562b) {
                    try {
                        woVar = (wo) ((HashMap) this.f13563c).remove(str5);
                    } catch (JSONException e2) {
                        woVar.j(e2.getMessage());
                    } finally {
                    }
                    if (woVar == null) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 50);
                        sb2.append("Received result for unexpected method invocation: ");
                        sb2.append(str5);
                        za.i.h(sb2.toString());
                        return;
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str7).length() + strConcat.length());
                        sb3.append(str7);
                        sb3.append(strConcat);
                        woVar.j(sb3.toString());
                        return;
                    }
                    if (str9 == null) {
                        woVar.k(null);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str9);
                    if (ya.a0.o()) {
                        String string = jSONObject.toString(2);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(string).length() + 13);
                        sb4.append("Result GMSG: ");
                        sb4.append(string);
                        ya.a0.m(sb4.toString());
                    }
                    woVar.k(jSONObject);
                    return;
                }
            case 3:
                r90 r90Var = (r90) ((WeakReference) this.f13562b).get();
                if (r90Var == null) {
                    return;
                }
                r90Var.g.a();
                pk pkVar = sk.f16174ie;
                va.s sVar = va.s.f36163e;
                if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                    View view = (View) ((WeakReference) this.f13563c).get();
                    wp0 wp0Var = r90Var.j;
                    ra0 ra0Var = r90Var.E;
                    ra0Var.getClass();
                    if (!((Boolean) sVar.f36166c.a(pkVar)).booleanValue() || view == null) {
                        return;
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (parent == null) {
                            str = "0";
                        } else if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                            str = "1";
                        } else {
                            parent = parent.getParent();
                        }
                    }
                    rt rtVarA = ra0Var.f15603a.a();
                    rtVarA.u("action", "hcp");
                    rtVarA.u("hcp", str);
                    rtVarA.q(wp0Var);
                    rtVarA.v();
                    return;
                }
                return;
            case 4:
                ta0 ta0Var = (ta0) this.f13562b;
                try {
                    ta0Var.f16765f = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    za.i.e("Failed to call parse unconfirmedClickTimestamp.");
                }
                vn vnVar = (vn) this.f13563c;
                ta0Var.f16764e = (String) map.get(FacebookMediationAdapter.KEY_ID);
                String str10 = (String) map.get("asset_id");
                if (vnVar == null) {
                    za.i.c("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    Parcel parcelT = vnVar.T();
                    parcelT.writeString(str10);
                    vnVar.g1(parcelT, 1);
                    return;
                } catch (RemoteException e10) {
                    za.i.k("#007 Could not call remote method.", e10);
                    return;
                }
            case 5:
                a(obj, map);
                return;
            default:
                qz qzVar2 = (qz) obj;
                String str11 = (String) map.get("u");
                if (str11 == null) {
                    za.i.h("URL missing from httpTrack GMSG.");
                    return;
                }
                wp0 wp0VarS = qzVar2.s();
                if (wp0VarS != null && !wp0VarS.f18088i0) {
                    ((ct0) this.f13562b).b(str11, wp0VarS.f18117x0, null, null);
                    return;
                }
                yp0 yp0VarN0 = qzVar2.n0();
                if (yp0VarN0 == null) {
                    ua.j.C.f35265h.f("BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                    return;
                }
                lh0 lh0Var = (lh0) this.f13563c;
                ua.j.C.f35267k.getClass();
                sa saVar = new sa(yp0VarN0.f18820b, str11, 2, System.currentTimeMillis());
                lh0Var.getClass();
                lh0Var.c(new ce1(lh0Var, false, saVar, 15));
                return;
        }
    }

    public lo() {
        this.f13561a = 2;
        this.f13562b = new Object();
        this.f13563c = new HashMap();
    }

    public lo(r90 r90Var, View view) {
        this.f13561a = 3;
        this.f13562b = new WeakReference(r90Var);
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16174ie)).booleanValue()) {
            this.f13563c = new WeakReference(view);
        } else {
            this.f13563c = new WeakReference(null);
        }
    }
}
