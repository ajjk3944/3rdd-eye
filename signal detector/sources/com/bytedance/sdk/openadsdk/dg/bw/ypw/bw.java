package com.bytedance.sdk.openadsdk.dg.bw.ypw;

import com.bytedance.sdk.component.utils.ul;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bw extends xq {
    private long emc;
    private long ypw;

    public void emc(long j6) {
        this.emc = j6;
    }

    public void ypw(long j6) {
        this.ypw = j6;
    }

    @Override // com.bytedance.sdk.openadsdk.dg.bw.ypw.xq
    public void emc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.emc);
            jSONObject.put("total_duration", this.ypw);
        } catch (Throwable th) {
            ul.xq("FeedContinueModel", th.getMessage());
        }
    }
}
