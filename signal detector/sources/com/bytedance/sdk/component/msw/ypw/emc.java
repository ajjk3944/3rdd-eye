package com.bytedance.sdk.component.msw.ypw;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    public int dg;
    public int emc;
    public int xq;
    public int ypw;

    public emc(int i, int i3, int i6, int i7) {
        this.emc = i;
        this.ypw = i3;
        this.xq = i6;
        this.dg = i7;
    }

    public JSONObject emc() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.emc);
            jSONObject.put("sdk_max_thread_num", this.ypw);
            jSONObject.put("app_thread_num", this.xq);
            jSONObject.put("app_max_thread_num", this.dg);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
