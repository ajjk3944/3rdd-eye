package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sz {
    private String emc;
    private int xq;
    private String ypw;

    public JSONObject dg() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("u", this.emc);
            jSONObject.put("ft", this.xq);
            jSONObject.put("fu", this.ypw);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public String emc() {
        return this.emc;
    }

    public int xq() {
        return this.xq;
    }

    public String ypw() {
        return this.ypw;
    }

    public void emc(String str) {
        this.emc = str;
    }

    public void ypw(String str) {
        this.ypw = str;
    }

    public void emc(int i) {
        this.xq = i;
    }
}
