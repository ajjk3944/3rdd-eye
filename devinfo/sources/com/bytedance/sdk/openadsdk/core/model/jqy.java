package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class jqy {

    /* renamed from: lh, reason: collision with root package name */
    public final int f8231lh;
    public final int ouw;
    public final int vt;
    private final int yu;

    public jqy(JSONObject jSONObject) {
        this.ouw = jSONObject.optInt("max_time", 0);
        this.yu = jSONObject.optInt("auto_skip_time", -1);
        this.vt = jSONObject.optInt("show_after_inactivity", 10);
        this.f8231lh = jSONObject.optInt("user_wait_time", 10);
    }

    public final JSONObject ouw() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("max_time", this.ouw);
            jSONObject.put("auto_skip_time", this.yu);
            jSONObject.put("show_after_inactivity", this.vt);
            jSONObject.put("user_wait_time", this.f8231lh);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
