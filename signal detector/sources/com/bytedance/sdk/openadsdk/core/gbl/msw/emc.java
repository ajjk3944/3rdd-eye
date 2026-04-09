package com.bytedance.sdk.openadsdk.core.gbl.msw;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    private String bw;
    private String dg;
    private String emc;
    private String xq;
    private String ypw;

    public String bw() {
        return this.bw;
    }

    public String dg() {
        return this.dg;
    }

    public String emc() {
        return this.emc;
    }

    public String xq() {
        return this.xq;
    }

    public String ypw() {
        return this.ypw;
    }

    public emc bw(String str) {
        this.bw = str;
        return this;
    }

    public emc dg(String str) {
        this.dg = str;
        return this;
    }

    public emc emc(String str) {
        this.emc = str;
        return this;
    }

    public emc xq(String str) {
        this.xq = str;
        return this;
    }

    public emc ypw(String str) {
        this.ypw = str;
        return this;
    }

    public JSONObject emc(emc emcVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.emc);
            jSONObject.put("md5", this.ypw);
            jSONObject.put("url", this.xq);
            if (emcVar != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", emcVar.emc());
                jSONObject2.put("md5", emcVar.ypw());
                jSONObject2.put("url", emcVar.xq());
                jSONObject.put("overlay", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
