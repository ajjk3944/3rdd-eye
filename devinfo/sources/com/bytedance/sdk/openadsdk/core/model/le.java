package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le {
    public int ra;
    public String ouw = "";
    public String vt = "";

    /* renamed from: lh, reason: collision with root package name */
    public String f8244lh = "";
    public String yu = "";
    public double fkw = -1.0d;

    /* renamed from: le, reason: collision with root package name */
    public int f8243le = -1;

    public final JSONObject ouw() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", this.vt);
            jSONObject.put("app_size", this.ra);
            jSONObject.put("comment_num", this.f8243le);
            jSONObject.put("download_url", this.ouw);
            jSONObject.put("package_name", this.f8244lh);
            jSONObject.put("score", this.fkw);
            jSONObject.put("app_category", this.yu);
            return jSONObject;
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.qbp.yu(e2.toString(), new Object[0]);
            return jSONObject;
        }
    }
}
