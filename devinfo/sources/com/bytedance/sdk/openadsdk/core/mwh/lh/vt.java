package com.bytedance.sdk.openadsdk.core.mwh.lh;

import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    public static void ouw(vpp vppVar) {
        if (od.vt(vppVar)) {
            com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, "playable_preload", "preload_start", (JSONObject) null);
        }
    }

    public static void ouw(vpp vppVar, int i4, String str) {
        if (vppVar != null) {
            if (od.lh(vppVar) || od.vt(vppVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i4);
                    jSONObject.put("error_reason", str);
                } catch (JSONException e2) {
                    qbp.ouw("PlayableEvent", "onFail json error", e2);
                }
                com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, "playable_preload", "preload_fail", jSONObject);
            }
        }
    }
}
