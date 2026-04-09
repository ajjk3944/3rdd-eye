package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hq0 {
    public static HashMap a(JSONObject jsonObject) throws JSONException {
        Object obj;
        kotlin.jvm.internal.l.f(jsonObject, "jsonObject");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jsonObject.keys();
        kotlin.jvm.internal.l.c(itKeys);
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            kotlin.jvm.internal.l.c(next);
            try {
                obj = jsonObject.get(next);
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj != null) {
                if (obj instanceof JSONObject) {
                    map.put(next, a((JSONObject) obj));
                } else {
                    map.put(next, obj);
                }
            }
        }
        return map;
    }
}
