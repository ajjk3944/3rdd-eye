package com.bytedance.sdk.openadsdk.core;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu {
    public static void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str, int i4, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i4);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, str, "convert_track", jSONObject);
    }
}
