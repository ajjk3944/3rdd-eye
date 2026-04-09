package com.bytedance.sdk.openadsdk.dg.bw.ypw;

import com.bytedance.sdk.component.utils.ul;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw extends xq {
    private int dg;
    private long emc;
    private int xq;
    private long ypw;

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
            jSONObject.put("buffers_time", this.emc);
            jSONObject.put("total_duration", this.ypw);
            jSONObject.put("vbtt_skip_type", this.xq);
            jSONObject.put("skip_reason", this.dg);
        } catch (Throwable th) {
            ul.xq("EndcardSkipModel", th.getMessage());
        }
    }
}
