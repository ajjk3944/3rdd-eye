package com.bytedance.sdk.component.adexpress.dynamic.fkw;

import d.h;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly {
    public static void ouw(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.has(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public static String vt(String str, String str2) {
        if (!com.bytedance.sdk.component.adexpress.yu.vt()) {
            return ouw.ouw(str);
        }
        if (str.indexOf(46) < 0) {
            str = str.concat(".png");
        }
        return h.E(str2, "static/images/", str);
    }

    public static JSONObject ouw(JSONObject... jSONObjectArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (int i4 = 0; i4 < 3; i4++) {
            JSONObject jSONObject2 = jSONObjectArr[i4];
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String ouw(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOuw = com.bytedance.sdk.component.adexpress.vt.ouw(str);
        if (jSONObjectOuw == null || (jSONObjectOptJSONObject = jSONObjectOuw.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString("data");
    }

    public static String ouw(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOuw = com.bytedance.sdk.component.adexpress.vt.ouw(str);
        if (jSONObjectOuw == null || (jSONObjectOptJSONObject = jSONObjectOuw.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString(str2);
    }
}
