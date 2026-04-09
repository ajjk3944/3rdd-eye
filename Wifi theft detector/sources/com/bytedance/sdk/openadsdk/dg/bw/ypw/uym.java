package com.bytedance.sdk.openadsdk.dg.bw.ypw;

import com.bytedance.sdk.component.utils.ul;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class uym extends xq {
    private long emc;
    private long ypw;

    public void emc(long j10) {
        this.emc = j10;
    }

    public void ypw(long j10) {
        this.ypw = j10;
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
            ul.xq("FeedPauseModel", th.getMessage());
        }
    }
}
