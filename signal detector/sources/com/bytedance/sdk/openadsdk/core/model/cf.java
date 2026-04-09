package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class cf {
    private final int emc;
    private final int ypw;

    public cf(JSONObject jSONObject) {
        this.emc = jSONObject.optInt("auto_click", 0);
        this.ypw = jSONObject.optInt("hidden_bar", 0);
    }

    public int emc() {
        return this.emc;
    }

    public JSONObject xq() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            int i = this.emc;
            if (i == 1) {
                jSONObject.put("auto_click", i);
            }
            if (this.ypw == 1) {
                jSONObject.put("hidden_bar", 1);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public boolean ypw() {
        return this.ypw == 1;
    }

    public static boolean emc(rie rieVar) {
        if (rieVar == null || !rieVar.ak() || rieVar.alt() == null) {
            return false;
        }
        return rieVar.alt().ypw();
    }
}
