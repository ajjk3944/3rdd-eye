package com.bytedance.sdk.openadsdk.dg.bw.ypw;

import com.bytedance.sdk.component.utils.ul;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg extends xq {
    public int dg = 0;
    public long emc;
    public int xq;
    public long ypw;

    public void emc(long j10) {
        this.emc = j10;
    }

    public void ypw(long j10) {
        this.ypw = j10;
    }

    public void emc(int i10) {
        this.xq = i10;
    }

    public void ypw(int i10) {
        this.dg = i10;
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
