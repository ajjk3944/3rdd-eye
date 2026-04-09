package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class jg {
    final int ouw;
    public final int vt;

    public jg(JSONObject jSONObject) {
        this.ouw = jSONObject.optInt("auto_click", 0);
        this.vt = jSONObject.optInt("hidden_bar", 0);
    }

    public final JSONObject ouw() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            int i4 = this.ouw;
            if (i4 == 1) {
                jSONObject.put("auto_click", i4);
            }
            if (this.vt == 1) {
                jSONObject.put("hidden_bar", 1);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
