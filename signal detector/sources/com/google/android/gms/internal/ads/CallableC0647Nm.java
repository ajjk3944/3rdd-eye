package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.apm.insight.R;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import q2.C2841s;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.Nm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0647Nm implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10057a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10058b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10059c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10061e;

    public /* synthetic */ CallableC0647Nm(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f10057a = i;
        this.f10058b = obj;
        this.f10059c = obj2;
        this.f10060d = obj3;
        this.f10061e = obj4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws C0736Sq {
        Bundle bundle;
        switch (this.f10057a) {
            case 0:
                C1431kf c1431kf = (C1431kf) this.f10058b;
                Xt xt = (Xt) this.f10059c;
                Qt qt = (Qt) this.f10060d;
                JSONObject jSONObject = (JSONObject) this.f10061e;
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8610I2)).booleanValue()) {
                    A.f.r(p2.j.f22785C.f22797k, ((C0750Tn) c1431kf.f15176e).f11461e, "native-assets-loading-basic-start");
                }
                C1492lm c1492lm = new C1492lm();
                int iOptInt = jSONObject.optInt("template_id", -1);
                synchronized (c1492lm) {
                    c1492lm.f15435a = iOptInt;
                }
                c1492lm.M(jSONObject.optString("custom_template_id"));
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
                c1492lm.U(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null);
                C0960bu c0960bu = (C0960bu) xt.f12509a.f10110b;
                if (!c0960bu.f13486h.contains(Integer.toString(c1492lm.W()))) {
                    int iW = c1492lm.W();
                    throw new C0736Sq(1, A.f.i(iW, "Invalid template ID: ", new StringBuilder(String.valueOf(iW).length() + 21)));
                }
                if (c1492lm.W() == 3) {
                    if (c1492lm.q() == null) {
                        throw new C0736Sq(1, "No custom template id for custom template ad response.");
                    }
                    if (!c0960bu.i.contains(c1492lm.q())) {
                        throw new C0736Sq(1, "Unexpected custom template id in the response.");
                    }
                }
                c1492lm.J(jSONObject.optDouble("rating", -1.0d));
                String strOptString = jSONObject.optString("headline", null);
                if (qt.M) {
                    p2.j jVar = p2.j.f22785C;
                    C2911G c2911g = jVar.f22790c;
                    Resources resourcesE = jVar.f22795h.e();
                    String string = resourcesE != null ? resourcesE.getString(R.string.s7) : "Test Ad";
                    strOptString = AbstractC1135f5.n(new StringBuilder(String.valueOf(string).length() + 3 + String.valueOf(strOptString).length()), string, " : ", strOptString);
                }
                c1492lm.S("headline", strOptString);
                c1492lm.S("body", jSONObject.optString("body", null));
                c1492lm.S("call_to_action", jSONObject.optString("call_to_action", null));
                c1492lm.S("store", jSONObject.optString("store", null));
                c1492lm.S("price", jSONObject.optString("price", null));
                c1492lm.S("advertiser", jSONObject.optString("advertiser", null));
                return c1492lm;
            case 1:
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8565B2)).booleanValue() && (bundle = ((C1807re) this.f10058b).f16587m) != null) {
                    A.f.r(p2.j.f22785C.f22797k, bundle, "http-response-ready");
                }
                return new C2088wp((C0429Ap) ((Ju) this.f10059c).f9394c.get(), (JSONObject) ((Ju) this.f10060d).f9394c.get(), (C1861se) ((Ju) this.f10061e).f9394c.get());
            case 2:
                View view = (View) this.f10060d;
                Activity activity = (Activity) this.f10061e;
                Nz nz = (Nz) this.f10058b;
                Context context = (Context) this.f10059c;
                C1948uA c1948uA = nz.f10114d;
                Ww wwB = nz.f10111a.b();
                if (wwB == null) {
                    c1948uA.b(15004);
                    return "";
                }
                String strE = wwB.e(context, view, activity);
                if (strE != null) {
                    return strE;
                }
                c1948uA.b(15007);
                return "";
            case 3:
                Nz nz2 = (Nz) this.f10058b;
                Context context2 = (Context) this.f10059c;
                String str = (String) this.f10060d;
                View view2 = (View) this.f10061e;
                C1948uA c1948uA2 = nz2.f10114d;
                Ww wwB2 = nz2.f10111a.b();
                if (wwB2 == null) {
                    c1948uA2.b(15004);
                    return "";
                }
                String strG = wwB2.g(context2, str, view2, null);
                if (strG != null) {
                    return strG;
                }
                c1948uA2.b(15008);
                return "";
            case 4:
                View view3 = (View) this.f10060d;
                Activity activity2 = (Activity) this.f10061e;
                Pz pz = (Pz) this.f10058b;
                Context context3 = (Context) this.f10059c;
                HashMap map = new HashMap();
                pz.f10550e.f(20106, new RunnableC0437Bg(pz, map, context3, view3, activity2));
                String strI = pz.i(map);
                map.clear();
                return strI;
            case 5:
                Pz pz2 = (Pz) this.f10058b;
                Context context4 = (Context) this.f10059c;
                String str2 = (String) this.f10060d;
                View view4 = (View) this.f10061e;
                HashMap map2 = new HashMap();
                pz2.f10550e.f(20106, new RunnableC0437Bg(pz2, map2, context4, view4, str2));
                String strI2 = pz2.i(map2);
                map2.clear();
                return strI2;
            default:
                ((C1031dA) this.f10058b).f13734a.a((Ly) this.f10059c, (byte[]) this.f10060d, (byte[]) this.f10061e);
                return null;
        }
    }
}
