package com.bytedance.sdk.openadsdk.dg.bw.ypw;

import com.bytedance.sdk.component.utils.ul;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw extends xq {
    private int dg;
    private long emc;
    private int xq;
    private long ypw;

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
            jSONObject.put("buffers_time", this.emc);
            jSONObject.put("total_duration", this.ypw);
            jSONObject.put("vbtt_skip_type", this.xq);
            jSONObject.put("skip_reason", this.dg);
        } catch (Throwable th) {
            ul.xq("EndcardSkipModel", th.getMessage());
        }
    }
}
