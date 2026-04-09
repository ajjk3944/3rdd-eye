package com.yandex.mobile.ads.impl;

import c9.C2092m;
import c9.C2097r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class y20 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f35599a = C2092m.W("native_ad_view", "timer_container", "timer_value", "skip_button", "linear_progress_view", "video_progress", "mute_button");

    public final Set<n20> a(JSONObject designCard) throws JSONException {
        kotlin.jvm.internal.l.f(designCard, "designCard");
        ArrayList arrayList = new ArrayList();
        a(designCard, o20.f31139b, new x20(this, arrayList));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!f35599a.contains(((n20) next).a())) {
                arrayList2.add(next);
            }
        }
        return C2097r.L0(arrayList2);
    }

    private static void a(JSONArray jSONArray, o20 o20Var, p9.p pVar) throws JSONException {
        Object obj;
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                obj = jSONArray.get(i);
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof JSONObject) {
                a((JSONObject) obj, o20Var, pVar);
            } else if (obj instanceof JSONArray) {
                a((JSONArray) obj, o20Var, pVar);
            }
        }
    }

    private static void a(JSONObject jSONObject, o20 o20Var, p9.p pVar) throws JSONException {
        Object obj;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("extensions");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                if (kotlin.jvm.internal.l.b((jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("params")) == null) ? null : jSONObjectOptJSONObject.optString("view_name"), "native_ad_view")) {
                    o20Var = o20.f31140c;
                    break;
                }
                i++;
            }
        }
        ((x20) pVar).invoke(jSONObject, o20Var);
        Iterator<String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.l.e(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            kotlin.jvm.internal.l.c(next);
            try {
                obj = jSONObject.get(next);
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof JSONObject) {
                a((JSONObject) obj, o20Var, pVar);
            } else if (obj instanceof JSONArray) {
                a((JSONArray) obj, o20Var, pVar);
            }
        }
    }
}
