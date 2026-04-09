package com.bytedance.sdk.openadsdk.core;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg {
    public static void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, String str, int i10, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, i10);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVar, str, "convert_track", jSONObject);
    }
}
