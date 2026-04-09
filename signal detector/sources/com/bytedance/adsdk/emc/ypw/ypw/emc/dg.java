package com.bytedance.adsdk.emc.ypw.ypw.emc;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg extends aa {
    public dg() {
        super(com.bytedance.adsdk.emc.ypw.dg.xq.EQ);
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public Object emc(Map<String, JSONObject> map) {
        Object objEmc = this.emc.emc(map);
        Object objEmc2 = this.ypw.emc(map);
        return (objEmc == null && objEmc2 == null) ? Boolean.TRUE : (objEmc != null || objEmc2 == null) ? (objEmc == null || objEmc2 != null) ? ((objEmc instanceof Number) && (objEmc2 instanceof Number)) ? Boolean.valueOf(com.bytedance.adsdk.emc.ypw.bw.emc.ypw.emc((Number) objEmc, (Number) objEmc2)) : Boolean.valueOf(objEmc.equals(objEmc2)) : Boolean.FALSE : Boolean.FALSE;
    }
}
