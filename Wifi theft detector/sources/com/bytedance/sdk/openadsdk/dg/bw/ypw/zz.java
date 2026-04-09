package com.bytedance.sdk.openadsdk.dg.bw.ypw;

import com.bytedance.sdk.component.utils.ul;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zz extends xq {
    private final String emc;
    private final long ypw;

    public zz(String str, long j10) {
        this.emc = str;
        this.ypw = j10;
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
            ul.xq("LoadVideoCancelModel", th.getMessage());
        }
    }
}
