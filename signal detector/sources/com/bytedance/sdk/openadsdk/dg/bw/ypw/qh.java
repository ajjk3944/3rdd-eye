package com.bytedance.sdk.openadsdk.dg.bw.ypw;

import com.bykv.vk.openvk.emc.emc.emc.xq.a;
import com.bytedance.sdk.component.utils.ul;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class qh extends xq {
    private final String bw;
    private final int dg;
    private long emc;
    private final int xq;
    private long ypw;

    public qh(a aVar) {
        this.xq = aVar.f6577a;
        this.dg = aVar.f6578b;
        this.bw = aVar.f6579c;
    }

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
            jSONObject.put("error_code", this.xq);
            jSONObject.put("extra_error_code", this.dg);
            jSONObject.put("error_message", this.bw);
        } catch (Throwable th) {
            ul.xq("PlayErrorModel", th.getMessage());
        }
    }
}
