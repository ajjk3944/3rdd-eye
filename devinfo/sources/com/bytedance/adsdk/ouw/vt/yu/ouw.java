package com.bytedance.adsdk.ouw.vt.yu;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public enum ouw implements fkw {
    TRUE,
    FALSE,
    NULL;

    private static final Map<String, ouw> yu = new HashMap(128);

    static {
        for (ouw ouwVar : values()) {
            yu.put(ouwVar.name().toLowerCase(), ouwVar);
        }
    }

    public static ouw ouw(String str) {
        return yu.get(str.toLowerCase());
    }
}
