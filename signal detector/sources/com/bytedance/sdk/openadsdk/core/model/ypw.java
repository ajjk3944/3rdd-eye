package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw {
    private boolean bw;
    private String dg;
    private String emc;
    private String xq;
    private String ypw;

    public boolean bw() {
        return this.bw;
    }

    public String dg() {
        return this.dg;
    }

    public void emc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.emc = jSONObject.optString("icon");
        this.ypw = jSONObject.optString("text");
        this.xq = jSONObject.optString("privacy_url");
        this.dg = jSONObject.optString("privacy_title");
    }

    public String xq() {
        return this.xq;
    }

    public JSONObject ycc() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("privacy_url", this.xq);
            jSONObject.put("privacy_title", this.dg);
            jSONObject.put("text", this.ypw);
            jSONObject.put("icon", this.emc);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String ypw() {
        return this.ypw;
    }

    public String emc() {
        return this.emc;
    }

    public void emc(boolean z6) {
        this.bw = z6;
    }
}
