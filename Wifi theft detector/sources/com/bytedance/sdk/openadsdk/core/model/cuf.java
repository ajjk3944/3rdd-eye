package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class cuf {
    private JSONObject bw;
    private String dg;
    private String emc;
    private String xq;
    private emc ycc;
    private String ypw;

    public static class emc {
        private JSONArray emc;
        private JSONArray xq;
        private JSONArray ypw;

        public JSONObject dg() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("image", this.emc);
                jSONObject.put("fetch", this.ypw);
                jSONObject.put("script", this.xq);
                return jSONObject;
            } catch (JSONException e10) {
                e10.getMessage();
                return jSONObject;
            }
        }

        public JSONArray emc() {
            return this.emc;
        }

        public JSONArray xq() {
            return this.xq;
        }

        public JSONArray ypw() {
            return this.ypw;
        }

        public void emc(JSONArray jSONArray) {
            this.emc = jSONArray;
        }

        public void xq(JSONArray jSONArray) {
            this.xq = jSONArray;
        }

        public void ypw(JSONArray jSONArray) {
            this.ypw = jSONArray;
        }

        public static emc emc(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image");
            emc emcVar = new emc();
            emcVar.emc(jSONArrayOptJSONArray);
            emcVar.ypw(jSONObject.optJSONArray("fetch"));
            emcVar.xq(jSONObject.optJSONArray("script"));
            return emcVar;
        }
    }

    public JSONObject bw() {
        return this.bw;
    }

    public String dg() {
        return this.dg;
    }

    public String emc() {
        return this.emc;
    }

    public JSONObject uym() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.emc);
            jSONObject.put("md5", this.ypw);
            jSONObject.put("url", this.xq);
            jSONObject.put("data", this.dg);
            jSONObject.put("custom_components", this.bw);
            emc emcVar = this.ycc;
            if (emcVar != null) {
                jSONObject.put("preload", emcVar.dg());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String xq() {
        return this.xq;
    }

    public emc ycc() {
        return this.ycc;
    }

    public String ypw() {
        return this.ypw;
    }

    public static cuf emc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        cuf cufVar = new cuf();
        cufVar.emc = jSONObject.optString("id");
        cufVar.dg = jSONObject.optString("data");
        cufVar.xq = jSONObject.optString("url");
        cufVar.ypw = jSONObject.optString("md5");
        cufVar.bw = jSONObject.optJSONObject("custom_components");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preload");
        if (jSONObjectOptJSONObject != null) {
            cufVar.ycc = emc.emc(jSONObjectOptJSONObject);
        }
        return cufVar;
    }
}
