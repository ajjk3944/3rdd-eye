package com.bytedance.adsdk.ugeno.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class dg {
    private static Map<String, ypw> emc = new HashMap();

    public static void emc(List<ypw> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (ypw ypwVar : list) {
            if (ypwVar != null) {
                emc.put(ypwVar.emc(), ypwVar);
            }
        }
    }

    public static ypw emc(String str) {
        return emc.get(str);
    }
}
