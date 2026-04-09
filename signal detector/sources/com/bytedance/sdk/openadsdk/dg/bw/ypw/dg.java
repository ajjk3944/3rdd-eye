package com.bytedance.sdk.openadsdk.dg.bw.ypw;

import com.bytedance.sdk.component.utils.ul;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg extends xq {
    public int dg = 0;
    public long emc;
    public int xq;
    public long ypw;

    public void emc(long j6) {
        this.emc = j6;
    }

    public void ypw(long j6) {
        this.ypw = j6;
    }

    public void emc(int i) {
        this.xq = i;
    }

    public void ypw(int i) {
        this.dg = i;
    }

    @Override // com.bytedance.sdk.openadsdk.dg.bw.ypw.xq
    public void emc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.emc);
            jSONObject.put("buffers_time", this.ypw);
            jSONObject.put("break_reason", this.xq);
            jSONObject.put("video_backup", this.dg);
        } catch (Throwable th) {
            ul.xq("FeedBreakModel", th.getMessage());
        }
    }
}
