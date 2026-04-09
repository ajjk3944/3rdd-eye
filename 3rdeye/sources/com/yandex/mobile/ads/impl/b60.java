package com.yandex.mobile.ads.impl;

import b9.m;
import c9.C2079C;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import d9.C4289g;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b60 {
    public static Set a(String jsonData) {
        Object objA;
        kotlin.jvm.internal.l.f(jsonData, "jsonData");
        try {
            objA = a(new JSONArray(jsonData));
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (b9.m.a(objA) != null) {
            fp0.b(new Object[0]);
        }
        if (objA instanceof m.a) {
            objA = null;
        }
        return (Set) objA;
    }

    public static Set a(JSONArray jsonArray) {
        Object objA;
        kotlin.jvm.internal.l.f(jsonArray, "jsonArray");
        try {
            C4289g c4289g = new C4289g();
            int length = jsonArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jsonArray.getJSONObject(i);
                String string = jSONObject.getString("type");
                kotlin.jvm.internal.l.e(string, "getString(...)");
                a60 a60VarValueOf = a60.valueOf(string);
                String string2 = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                kotlin.jvm.internal.l.e(string2, "getString(...)");
                c4289g.add(new z50(a60VarValueOf, string2));
            }
            objA = C2079C.a(c4289g);
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (b9.m.a(objA) != null) {
            jsonArray.toString();
            fp0.b(new Object[0]);
        }
        if (objA instanceof m.a) {
            objA = null;
        }
        return (Set) objA;
    }

    public static String a(Set set) throws JSONException {
        if (set == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            z50 z50Var = (z50) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", z50Var.a().name());
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, z50Var.b());
            jSONArray = jSONArray.put(jSONObject);
            kotlin.jvm.internal.l.e(jSONArray, "put(...)");
        }
        return jSONArray.toString();
    }
}
