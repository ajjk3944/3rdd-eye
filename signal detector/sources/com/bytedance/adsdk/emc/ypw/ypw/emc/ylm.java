package com.bytedance.adsdk.emc.ypw.ypw.emc;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ylm implements com.bytedance.adsdk.emc.ypw.ypw.emc {
    private com.bytedance.adsdk.emc.ypw.dg.dg emc;

    public ylm(com.bytedance.adsdk.emc.ypw.dg.dg dgVar) {
        this.emc = dgVar;
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public Object emc(Map<String, JSONObject> map) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return ypw();
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public String ypw() {
        return this.emc.emc();
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public com.bytedance.adsdk.emc.ypw.dg.bw emc() {
        return this.emc;
    }
}
