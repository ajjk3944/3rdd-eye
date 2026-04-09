package com.bytedance.sdk.openadsdk.ee.ypw;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    private final int emc;
    private final float xq;
    private final int ypw;

    public emc(int i10, int i11, float f10) {
        this.emc = i10;
        this.ypw = i11;
        this.xq = f10;
    }

    public static JSONObject emc(emc emcVar) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", emcVar.emc);
        jSONObject.put("height", emcVar.ypw);
        jSONObject.put("alpha", emcVar.xq);
        return jSONObject;
    }
}
