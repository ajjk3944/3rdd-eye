package com.bytedance.sdk.openadsdk.dg.bw.ypw;

import com.bytedance.sdk.component.utils.ul;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ru extends xq {
    private String bw;
    private int dg;
    private String emc;
    private long xq;
    private String ycc;
    private long ypw;

    public void emc(String str) {
        this.emc = str;
    }

    public void xq(String str) {
        this.ycc = str;
    }

    public void ypw(long j6) {
        this.xq = j6;
    }

    public void emc(long j6) {
        this.ypw = j6;
    }

    public void ypw(String str) {
        this.bw = str;
    }

    public void emc(int i) {
        this.dg = i;
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
            jSONObject.put("error_code", this.dg);
            jSONObject.put("error_message", this.bw);
            jSONObject.put("error_message_server", this.ycc);
        } catch (Throwable th) {
            ul.xq("LoadVideoErrorModel", th.getMessage());
        }
    }
}
