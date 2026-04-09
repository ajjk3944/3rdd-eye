package com.bytedance.adsdk.emc.ypw.ypw.emc;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sba extends aa {
    private static final ThreadLocal<StringBuilder> dg = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.emc.ypw.ypw.emc.sba.1
        @Override // java.lang.ThreadLocal
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public sba() {
        super(com.bytedance.adsdk.emc.ypw.dg.xq.PLUS);
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public Object emc(Map<String, JSONObject> map) {
        Object objEmc;
        Object objEmc2 = this.emc.emc(map);
        if (objEmc2 == null || (objEmc = this.ypw.emc(map)) == null) {
            return null;
        }
        if (!(objEmc2 instanceof String) && !(objEmc instanceof String)) {
            return com.bytedance.adsdk.emc.ypw.bw.emc.msw.emc((Number) objEmc2, (Number) objEmc);
        }
        StringBuilder sb = dg.get();
        sb.append(objEmc2);
        sb.append(objEmc);
        String string = sb.toString();
        sb.setLength(0);
        return string;
    }
}
