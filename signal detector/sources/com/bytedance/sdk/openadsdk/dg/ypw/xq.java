package com.bytedance.sdk.openadsdk.dg.ypw;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xq implements ypw {
    ypw emc;

    @Override // com.bytedance.sdk.openadsdk.dg.ypw.ypw
    public void emc(JSONObject jSONObject, long j6) throws JSONException {
        ypw ypwVar = this.emc;
        if (ypwVar != null) {
            ypwVar.emc(jSONObject, j6);
        }
        if (j6 <= 0) {
            j6 = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j6);
    }
}
