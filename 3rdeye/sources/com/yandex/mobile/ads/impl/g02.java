package com.yandex.mobile.ads.impl;

import c9.C2092m;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g02 {

    /* renamed from: a, reason: collision with root package name */
    private final e02 f27505a = new e02();

    /* renamed from: b, reason: collision with root package name */
    private final oi f27506b = new oi();

    public final f02 a(JSONObject jsonValue) throws JSONException {
        xz1 xz1Var;
        ni niVarA;
        ArrayList arrayList;
        g02 g02Var = this;
        kotlin.jvm.internal.l.f(jsonValue, "jsonValue");
        Object objOpt = jsonValue.opt("ColorWizButton");
        String str = objOpt instanceof String ? (String) objOpt : null;
        Object objOpt2 = jsonValue.opt("ColorWizButtonText");
        String str2 = objOpt2 instanceof String ? (String) objOpt2 : null;
        Object objOpt3 = jsonValue.opt("ColorWizBack");
        String str3 = objOpt3 instanceof String ? (String) objOpt3 : null;
        Object objOpt4 = jsonValue.opt("ColorWizBackRight");
        String str4 = objOpt4 instanceof String ? (String) objOpt4 : null;
        JSONObject jSONObjectOptJSONObject = jsonValue.optJSONObject("backgroundColors");
        JSONObject jSONObjectOptJSONObject2 = jsonValue.optJSONObject("smart-center");
        JSONArray jSONArrayOptJSONArray = jsonValue.optJSONArray("smart-centers");
        if (jSONObjectOptJSONObject2 != null) {
            g02Var.f27505a.getClass();
            xz1Var = new xz1(jSONObjectOptJSONObject2.getInt("x"), jSONObjectOptJSONObject2.getInt("y"), jSONObjectOptJSONObject2.getInt("w"), jSONObjectOptJSONObject2.getInt("h"));
        } else {
            xz1Var = null;
        }
        if (jSONObjectOptJSONObject != null) {
            g02Var.f27506b.getClass();
            niVarA = oi.a(jSONObjectOptJSONObject);
        } else {
            niVarA = null;
        }
        if (jSONArrayOptJSONArray != null) {
            v9.g gVarO = v9.h.O(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList2 = new ArrayList(C2092m.T(gVarO, 10));
            v9.f it = gVarO.iterator();
            while (it.f47101d) {
                int iA = it.a();
                e02 e02Var = g02Var.f27505a;
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(iA);
                kotlin.jvm.internal.l.e(jSONObjectOptJSONObject3, "optJSONObject(...)");
                e02Var.getClass();
                arrayList2.add(new xz1(jSONObjectOptJSONObject3.getInt("x"), jSONObjectOptJSONObject3.getInt("y"), jSONObjectOptJSONObject3.getInt("w"), jSONObjectOptJSONObject3.getInt("h")));
                g02Var = this;
                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                niVarA = niVarA;
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new f02(str, str2, str3, str4, niVarA, xz1Var, arrayList);
    }
}
