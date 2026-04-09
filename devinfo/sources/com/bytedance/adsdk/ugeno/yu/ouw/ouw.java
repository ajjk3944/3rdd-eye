package com.bytedance.adsdk.ugeno.yu.ouw;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public volatile Map<String, lh> ouw = new HashMap();

    public final lh ouw(String str) {
        if (this.ouw.containsKey(str) && this.ouw.get(str) != null) {
            return this.ouw.get(str);
        }
        vt vtVar = new vt();
        this.ouw.put(str, vtVar);
        return vtVar;
    }
}
