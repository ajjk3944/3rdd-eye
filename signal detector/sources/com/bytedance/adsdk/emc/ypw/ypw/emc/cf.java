package com.bytedance.adsdk.emc.ypw.ypw.emc;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class cf implements com.bytedance.adsdk.emc.ypw.ypw.emc {
    private Number emc;

    public cf(String str) throws NumberFormatException {
        if (str.indexOf(46) < 0) {
            try {
                this.emc = Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                this.emc = Long.valueOf(str);
            }
        } else {
            Float fValueOf = Float.valueOf(str);
            this.emc = fValueOf;
            if (Float.isInfinite(fValueOf.floatValue())) {
                this.emc = Double.valueOf(str);
            }
        }
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public Object emc(Map<String, JSONObject> map) {
        return this.emc;
    }

    public String toString() {
        return ypw();
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public String ypw() {
        return this.emc.toString();
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public com.bytedance.adsdk.emc.ypw.dg.bw emc() {
        return com.bytedance.adsdk.emc.ypw.dg.ycc.NUMBER;
    }
}
