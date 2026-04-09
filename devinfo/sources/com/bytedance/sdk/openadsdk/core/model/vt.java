package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class vt {
    public boolean fkw;

    /* renamed from: lh, reason: collision with root package name */
    public String f8321lh;
    public String ouw;
    public String vt;
    public String yu;

    public final JSONObject ouw() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("privacy_url", this.f8321lh);
            jSONObject.put("privacy_title", this.yu);
            jSONObject.put("text", this.vt);
            jSONObject.put("icon", this.ouw);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
