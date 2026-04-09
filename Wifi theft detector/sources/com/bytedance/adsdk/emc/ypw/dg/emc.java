package com.bytedance.adsdk.emc.ypw.dg;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum emc implements bw {
    TRUE,
    FALSE,
    NULL;

    private static final Map<String, emc> dg = new HashMap(128);

    static {
        for (emc emcVar : values()) {
            dg.put(emcVar.name().toLowerCase(), emcVar);
        }
    }

    public static emc emc(String str) {
        return dg.get(str.toLowerCase());
    }
}
