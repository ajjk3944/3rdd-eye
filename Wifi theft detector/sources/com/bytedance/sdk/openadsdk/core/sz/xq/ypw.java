package com.bytedance.sdk.openadsdk.core.sz.xq;

import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw {
    public static void emc(rie rieVar) {
        if (dr.ypw(rieVar)) {
            com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVar, "playable_preload", "preload_start", (JSONObject) null);
        }
    }

    public static void emc(rie rieVar, long j10, long j11) throws JSONException {
        if (rieVar != null) {
            if (dr.xq(rieVar) || dr.ypw(rieVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("loadzip_success_time", j10);
                    jSONObject.put("unzip_success_time", j11);
                } catch (JSONException e10) {
                    ul.emc("PlayableEvent", "onSuccess json error", e10);
                }
                com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVar, "playable_preload", "preload_success", jSONObject);
            }
        }
    }

    public static void emc(rie rieVar, int i10, String str) {
        if (rieVar != null) {
            if (dr.xq(rieVar) || dr.ypw(rieVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("error_reason", str);
                } catch (JSONException e10) {
                    ul.emc("PlayableEvent", "onFail json error", e10);
                }
                com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVar, "playable_preload", "preload_fail", jSONObject);
            }
        }
    }
}
