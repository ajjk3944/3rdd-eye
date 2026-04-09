package com.bytedance.adsdk.ouw.vt.vt.ouw;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno extends zih {
    public pno() {
        super(com.bytedance.adsdk.ouw.vt.yu.lh.LT_EQ);
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final Object ouw(Map<String, JSONObject> map) {
        Object objOuw;
        if (this.ouw.ouw(map) == null || (objOuw = this.vt.ouw(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) com.bytedance.adsdk.ouw.vt.fkw.ouw.vt.ouw(r0, (Number) objOuw)).booleanValue());
    }
}
