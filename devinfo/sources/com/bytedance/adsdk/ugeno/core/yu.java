package com.bytedance.adsdk.ugeno.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu {
    private static Map<String, vt> ouw = new HashMap();

    public static void ouw(List<vt> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (vt vtVar : list) {
            if (vtVar != null) {
                ouw.put(vtVar.ouw, vtVar);
            }
        }
    }

    public static vt ouw(String str) {
        return ouw.get(str);
    }
}
