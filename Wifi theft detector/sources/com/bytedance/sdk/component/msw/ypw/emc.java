package com.bytedance.sdk.component.msw.ypw;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    public int dg;
    public int emc;
    public int xq;
    public int ypw;

    public emc(int i10, int i11, int i12, int i13) {
        this.emc = i10;
        this.ypw = i11;
        this.xq = i12;
        this.dg = i13;
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
