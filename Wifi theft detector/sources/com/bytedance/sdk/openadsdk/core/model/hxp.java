package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class hxp {
    private final int dg;
    private final int emc;
    private final int xq;
    private final int ypw;

    public hxp(JSONObject jSONObject) {
        this.emc = jSONObject.optInt("max_time", 0);
        this.ypw = jSONObject.optInt("auto_skip_time", -1);
        this.xq = jSONObject.optInt("show_after_inactivity", 10);
        this.dg = jSONObject.optInt("user_wait_time", 10);
    }

    public JSONObject dg() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("max_time", this.emc);
            jSONObject.put("auto_skip_time", this.ypw);
            jSONObject.put("show_after_inactivity", this.xq);
            jSONObject.put("user_wait_time", this.dg);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public int emc() {
        return this.emc;
    }

    public int xq() {
        return this.dg;
    }

    public int ypw() {
        return this.xq;
    }
}
