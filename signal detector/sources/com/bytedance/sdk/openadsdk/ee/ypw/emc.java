package com.bytedance.sdk.openadsdk.ee.ypw;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    private final int emc;
    private final float xq;
    private final int ypw;

    public emc(int i, int i3, float f2) {
        this.emc = i;
        this.ypw = i3;
        this.xq = f2;
    }

    public static JSONObject emc(emc emcVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", emcVar.emc);
        jSONObject.put("height", emcVar.ypw);
        jSONObject.put("alpha", emcVar.xq);
        return jSONObject;
    }
}
