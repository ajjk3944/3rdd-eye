package com.bytedance.sdk.openadsdk.core;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg {
    public static void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, String str, int i, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVar, str, "convert_track", jSONObject);
    }
}
