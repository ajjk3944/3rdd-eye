package com.bytedance.adsdk.emc.ypw.ypw.emc;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ycc extends aa {
    public ycc() {
        super(com.bytedance.adsdk.emc.ypw.dg.xq.GT);
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public Object emc(Map<String, JSONObject> map) {
        Object objEmc;
        Object objEmc2 = this.emc.emc(map);
        if (objEmc2 == null || (objEmc = this.ypw.emc(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.emc.ypw.bw.emc.xq.emc(objEmc2, (Number) objEmc);
    }
}
