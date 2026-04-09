package com.bytedance.sdk.component.adexpress.dynamic.bw;

import java.util.Iterator;
import o4.AbstractC2763b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zz {
    public static void emc(String str, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectYid = com.bytedance.sdk.component.adexpress.ypw.yid(str);
        if (jSONObjectYid == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectYid.optJSONObject("values");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        emc(jSONObjectOptJSONObject, jSONObject);
    }

    public static String ypw(String str, String str2) {
        if (!com.bytedance.sdk.component.adexpress.dg.ypw()) {
            return emc.emc(str);
        }
        if (str.indexOf(46) < 0) {
            str = str.concat(".png");
        }
        return AbstractC2763b.f(str2, "static/images/", str);
    }

    public static JSONObject emc(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectYid = com.bytedance.sdk.component.adexpress.ypw.yid(str);
        if (jSONObjectYid == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return emc(jSONObject2, jSONObjectYid.optJSONObject("themeValues"), jSONObject);
    }

    private static void emc(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
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
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static JSONObject emc(JSONObject... jSONObjectArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String emc(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectYid = com.bytedance.sdk.component.adexpress.ypw.yid(str);
        if (jSONObjectYid == null || (jSONObjectOptJSONObject = jSONObjectYid.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString("data");
    }

    public static String emc(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectYid = com.bytedance.sdk.component.adexpress.ypw.yid(str);
        if (jSONObjectYid == null || (jSONObjectOptJSONObject = jSONObjectYid.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString(str2);
    }

    public static JSONObject emc(JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("values");
    }
}
