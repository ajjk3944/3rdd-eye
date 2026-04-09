package com.bytedance.adsdk.emc.ypw.ypw.emc;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zz extends aa {
    public zz() {
        super(com.bytedance.adsdk.emc.ypw.dg.xq.LT);
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public Object emc(Map<String, JSONObject> map) {
        Object objEmc;
        Object objEmc2 = this.emc.emc(map);
        if (objEmc2 == null || (objEmc = this.ypw.emc(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.emc.ypw.bw.emc.dg.emc(objEmc2, (Number) objEmc);
    }
}
