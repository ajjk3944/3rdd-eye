package com.bytedance.sdk.openadsdk.dg.bw.ypw;

import com.bytedance.sdk.component.utils.ul;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sup extends xq {
    private long dg;
    private String emc;
    private long xq;
    private long ypw;

    public void emc(String str) {
        this.emc = str;
    }

    public void xq(long j10) {
        this.dg = j10;
    }

    public void ypw(long j10) {
        this.xq = j10;
    }

    public void emc(long j10) {
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
            jSONObject.put("load_time", this.xq);
            jSONObject.put("local_cache", this.dg);
        } catch (Throwable th) {
            ul.xq("LoadVideoSuccessModel", th.getMessage());
        }
    }
}
