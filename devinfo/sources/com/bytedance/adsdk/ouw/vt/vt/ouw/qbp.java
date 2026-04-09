package com.bytedance.adsdk.ouw.vt.vt.ouw;

import d.h;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class qbp implements com.bytedance.adsdk.ouw.vt.vt.ouw {
    private final String ouw;

    public qbp(String str) {
        this.ouw = str;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final Object ouw(Map<String, JSONObject> map) {
        return this.ouw;
    }

    public final String toString() {
        return vt();
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final String vt() {
        return h.w(new StringBuilder("'"), this.ouw, "'");
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final com.bytedance.adsdk.ouw.vt.yu.fkw ouw() {
        return com.bytedance.adsdk.ouw.vt.yu.le.STRING;
    }
}
