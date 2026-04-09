package com.bytedance.adsdk.ugeno.dg.emc;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class emc {
    private volatile Map<String, xq> emc = new HashMap();

    public xq emc(String str) {
        if (this.emc.containsKey(str) && this.emc.get(str) != null) {
            return this.emc.get(str);
        }
        ypw ypwVar = new ypw();
        this.emc.put(str, ypwVar);
        return ypwVar;
    }

    public void emc(String str, xq xqVar) {
        if (!this.emc.containsKey(str) || this.emc.get(str) == null) {
            this.emc.put(str, xqVar);
        }
    }
}
