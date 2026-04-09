package com.bytedance.sdk.openadsdk.core;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class osn {
    private static volatile osn vt;
    public Map<String, Map<String, String>> ouw = new ConcurrentHashMap();

    private osn() {
    }

    public static osn ouw() {
        if (vt == null) {
            synchronized (osn.class) {
                try {
                    if (vt == null) {
                        vt = new osn();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return vt;
    }

    public final void ouw(String str) {
        Map<String, Map<String, String>> map = this.ouw;
        if (map != null && map.containsKey(str)) {
            Map<String, String> map2 = this.ouw.get(str);
            if (map2 != null) {
                map2.clear();
            }
            this.ouw.remove(str);
        }
    }
}
