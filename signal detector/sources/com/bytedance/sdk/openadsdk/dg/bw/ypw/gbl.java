package com.bytedance.sdk.openadsdk.dg.bw.ypw;

import com.bytedance.sdk.component.utils.ul;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class gbl extends xq {
    private final String emc;
    private final long ypw;

    public gbl(String str, long j6) {
        this.emc = str;
        this.ypw = j6;
    }

    @Override // com.bytedance.sdk.openadsdk.dg.bw.ypw.xq
    public void emc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.emc);
            jSONObject.put("preload_size", this.ypw);
        } catch (Throwable th) {
            ul.xq("LoadVideoStartModel", th.getMessage());
        }
    }
}
