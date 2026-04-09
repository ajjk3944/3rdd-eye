package com.bytedance.sdk.openadsdk.dg.bw.ypw;

import com.bytedance.sdk.component.utils.ul;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sz extends xq {
    public long emc;
    public long xq;
    public int ypw;

    public void emc(long j6) {
        this.emc = j6;
    }

    public void ypw(long j6) {
        this.xq = j6;
    }

    public void emc(int i) {
        this.ypw = i;
    }

    @Override // com.bytedance.sdk.openadsdk.dg.bw.ypw.xq
    public void emc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.emc);
            jSONObject.put("buffers_count", this.ypw);
            jSONObject.put("total_duration", this.xq);
        } catch (Throwable th) {
            ul.xq("PlayBufferModel", th.getMessage());
        }
    }
}
