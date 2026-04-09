package com.bytedance.adsdk.emc.ypw.ypw.emc;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class msw extends aa {
    public msw() {
        super(com.bytedance.adsdk.emc.ypw.dg.xq.LT_EQ);
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public Object emc(Map<String, JSONObject> map) {
        Object objEmc;
        if (this.emc.emc(map) == null || (objEmc = this.ypw.emc(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) com.bytedance.adsdk.emc.ypw.bw.emc.xq.emc(r0, (Number) objEmc)).booleanValue());
    }
}
