package com.bytedance.adsdk.ouw.vt.vt.ouw;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends zih {
    public yu() {
        super(com.bytedance.adsdk.ouw.vt.yu.lh.EQ);
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final Object ouw(Map<String, JSONObject> map) {
        Object objOuw = this.ouw.ouw(map);
        Object objOuw2 = this.vt.ouw(map);
        return (objOuw == null && objOuw2 == null) ? Boolean.TRUE : (objOuw != null || objOuw2 == null) ? (objOuw == null || objOuw2 != null) ? ((objOuw instanceof Number) && (objOuw2 instanceof Number)) ? Boolean.valueOf(com.bytedance.adsdk.ouw.vt.fkw.ouw.ouw.ouw((Number) objOuw, (Number) objOuw2)) : Boolean.valueOf(objOuw.equals(objOuw2)) : Boolean.FALSE : Boolean.FALSE;
    }
}
