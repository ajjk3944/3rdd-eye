package com.bytedance.adsdk.emc.ypw.ypw.emc;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bw extends aa {
    public bw() {
        super(com.bytedance.adsdk.emc.ypw.dg.xq.GT_EQ);
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public Object emc(Map<String, JSONObject> map) {
        Object objEmc;
        if (this.emc.emc(map) == null || (objEmc = this.ypw.emc(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) com.bytedance.adsdk.emc.ypw.bw.emc.dg.emc(r0, (Number) objEmc)).booleanValue());
    }
}
