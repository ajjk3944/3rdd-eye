package com.bytedance.sdk.openadsdk.vk.xq;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg {

    public static class emc {
        public final String emc;
        public final JSONObject ypw;

        public emc(String str, JSONObject jSONObject) throws JSONException {
            this.emc = str;
            this.ypw = jSONObject;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("device_info");
            if (jSONObjectOptJSONObject != null) {
                try {
                    jSONObjectOptJSONObject.put("gaid", com.bytedance.sdk.openadsdk.ul.emc.ypw.emc.emc().ypw());
                    jSONObject.put("device_info", jSONObjectOptJSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static xq emc() {
        return bw.emc();
    }
}
