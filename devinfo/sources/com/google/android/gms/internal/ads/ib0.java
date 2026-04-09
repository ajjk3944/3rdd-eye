package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.liuzh.deviceinfo.R;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ib0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12191c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12193e;

    public /* synthetic */ ib0(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.f12189a = i4;
        this.f12190b = obj;
        this.f12191c = obj2;
        this.f12192d = obj3;
        this.f12193e = obj4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws qj0 {
        Bundle bundle;
        switch (this.f12189a) {
            case 0:
                aw awVar = (aw) this.f12190b;
                dq0 dq0Var = (dq0) this.f12191c;
                wp0 wp0Var = (wp0) this.f12192d;
                JSONObject jSONObject = (JSONObject) this.f12193e;
                if (((Boolean) va.s.f36163e.f36166c.a(sk.I2)).booleanValue()) {
                    d.h.D(ua.j.C.f35267k, ((od0) awVar.f9454e).f14678e, "native-assets-loading-basic-start");
                }
                ga0 ga0Var = new ga0();
                int iOptInt = jSONObject.optInt("template_id", -1);
                synchronized (ga0Var) {
                    ga0Var.f11413a = iOptInt;
                }
                ga0Var.M(jSONObject.optString("custom_template_id"));
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
                ga0Var.U(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null);
                hq0 hq0Var = (hq0) dq0Var.f10543a.f15651b;
                if (!hq0Var.f11947h.contains(Integer.toString(ga0Var.W()))) {
                    int iW = ga0Var.W();
                    throw new qj0(1, d.h.q(iW, "Invalid template ID: ", new StringBuilder(String.valueOf(iW).length() + 21)));
                }
                if (ga0Var.W() == 3) {
                    if (ga0Var.q() == null) {
                        throw new qj0(1, "No custom template id for custom template ad response.");
                    }
                    if (!hq0Var.f11948i.contains(ga0Var.q())) {
                        throw new qj0(1, "Unexpected custom template id in the response.");
                    }
                }
                ga0Var.J(jSONObject.optDouble("rating", -1.0d));
                String strOptString = jSONObject.optString("headline", null);
                if (wp0Var.M) {
                    ua.j jVar = ua.j.C;
                    ya.f0 f0Var = jVar.f35261c;
                    Resources resourcesE = jVar.f35265h.e();
                    String string = resourcesE != null ? resourcesE.getString(R.string.s7) : "Test Ad";
                    strOptString = r5.c.m(new StringBuilder(String.valueOf(string).length() + 3 + String.valueOf(strOptString).length()), string, " : ", strOptString);
                }
                ga0Var.S("headline", strOptString);
                ga0Var.S("body", jSONObject.optString("body", null));
                ga0Var.S("call_to_action", jSONObject.optString("call_to_action", null));
                ga0Var.S("store", jSONObject.optString("store", null));
                ga0Var.S("price", jSONObject.optString("price", null));
                ga0Var.S("advertiser", jSONObject.optString("advertiser", null));
                return ga0Var;
            case 1:
                if (((Boolean) va.s.f36163e.f36166c.a(sk.B2)).booleanValue() && (bundle = ((iu) this.f12190b).f12483m) != null) {
                    d.h.D(ua.j.C.f35267k, bundle, "http-response-ready");
                }
                return new vg0((zg0) ((pr0) this.f12191c).f15081c.get(), (JSONObject) ((pr0) this.f12192d).f15081c.get(), (ju) ((pr0) this.f12193e).f15081c.get());
            case 2:
                View view = (View) this.f12192d;
                Activity activity = (Activity) this.f12193e;
                a11 a11Var = (a11) this.f12190b;
                Context context = (Context) this.f12191c;
                g21 g21Var = a11Var.f9186d;
                aw0 aw0VarB = a11Var.f9183a.b();
                if (aw0VarB == null) {
                    g21Var.b(15004);
                    return "";
                }
                String strE = aw0VarB.e(context, view, activity);
                if (strE != null) {
                    return strE;
                }
                g21Var.b(15007);
                return "";
            case 3:
                a11 a11Var2 = (a11) this.f12190b;
                Context context2 = (Context) this.f12191c;
                String str = (String) this.f12192d;
                View view2 = (View) this.f12193e;
                g21 g21Var2 = a11Var2.f9186d;
                aw0 aw0VarB2 = a11Var2.f9183a.b();
                if (aw0VarB2 == null) {
                    g21Var2.b(15004);
                    return "";
                }
                String strG = aw0VarB2.g(context2, str, view2, null);
                if (strG != null) {
                    return strG;
                }
                g21Var2.b(15008);
                return "";
            case 4:
                View view3 = (View) this.f12192d;
                Activity activity2 = (Activity) this.f12193e;
                c11 c11Var = (c11) this.f12190b;
                Context context3 = (Context) this.f12191c;
                HashMap map = new HashMap();
                c11Var.f9919e.f(20106, new ty(c11Var, map, context3, view3, activity2));
                String strI = c11Var.i(map);
                map.clear();
                return strI;
            case 5:
                c11 c11Var2 = (c11) this.f12190b;
                Context context4 = (Context) this.f12191c;
                String str2 = (String) this.f12192d;
                View view4 = (View) this.f12193e;
                HashMap map2 = new HashMap();
                c11Var2.f9919e.f(20106, new ty(c11Var2, map2, context4, view4, str2));
                String strI2 = c11Var2.i(map2);
                map2.clear();
                return strI2;
            default:
                ((p11) this.f12190b).f14858a.a((zy0) this.f12191c, (byte[]) this.f12192d, (byte[]) this.f12193e);
                return null;
        }
    }
}
