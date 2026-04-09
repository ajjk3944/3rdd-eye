package com.yandex.mobile.ads.impl;

import c9.C2079C;
import com.yandex.mobile.ads.impl.ns;
import d9.C4285c;
import d9.C4289g;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pa {
    public static Map a(JSONObject jsonObject) {
        kotlin.jvm.internal.l.f(jsonObject, "jsonObject");
        C4285c c4285c = new C4285c();
        Iterator<String> itKeys = jsonObject.keys();
        kotlin.jvm.internal.l.e(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            ns.a aVar = ns.f30987c;
            kotlin.jvm.internal.l.c(next);
            aVar.getClass();
            ns nsVarA = ns.a.a(next);
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray(next);
            if (nsVarA != null && jSONArrayOptJSONArray != null) {
                C4289g c4289g = new C4289g();
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    c4289g.add(jSONArrayOptJSONArray.getString(i));
                }
                c4285c.put(nsVarA, C2079C.a(c4289g));
            }
        }
        return c4285c.c();
    }

    public static String a(Map map) throws JSONException {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put(((ns) entry.getKey()).b(), new JSONArray((Collection) entry.getValue()));
        }
        return jSONObject.toString();
    }
}
