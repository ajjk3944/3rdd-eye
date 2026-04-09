package com.bytedance.adsdk.ugeno.dg;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ru {
    private static Map<String, uym> emc = new HashMap();

    public static void emc(List<uym> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (uym uymVar : list) {
            if (uymVar != null) {
                emc.put(uymVar.emc(), uymVar);
            }
        }
    }

    public static uym emc(String str) {
        return emc.get(str);
    }
}
