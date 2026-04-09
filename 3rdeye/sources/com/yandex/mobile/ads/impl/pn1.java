package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pn1 {
    public static on1 a(String readyResponse) throws JSONException {
        kotlin.jvm.internal.l.f(readyResponse, "readyResponse");
        JSONObject jSONObject = new JSONObject(rj.b(readyResponse));
        HashMap map = new HashMap();
        String string = jSONObject.getString("body");
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string2 = jSONObject2.getString(next);
            kotlin.jvm.internal.l.c(next);
            kotlin.jvm.internal.l.c(string2);
            map.put(next, string2);
        }
        kotlin.jvm.internal.l.c(string);
        return new on1(string, map);
    }
}
