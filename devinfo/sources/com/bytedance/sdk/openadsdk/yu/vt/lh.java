package com.bytedance.sdk.openadsdk.yu.vt;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh implements vt {
    vt ouw;

    @Override // com.bytedance.sdk.openadsdk.yu.vt.vt
    public final void ouw(JSONObject jSONObject, long j) throws JSONException {
        vt vtVar = this.ouw;
        if (vtVar != null) {
            vtVar.ouw(jSONObject, j);
        }
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j);
    }
}
