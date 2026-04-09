package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.openadsdk.core.settings.fkw;
import com.bytedance.sdk.openadsdk.core.settings.tlj;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends tlj {
    public ouw() {
        super("tt_set_apm.prop", new tlj.ouw() { // from class: com.bytedance.sdk.openadsdk.core.settings.ouw.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.tlj.ouw
            public final void ouw() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.tlj.ouw
            public final void vt() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.fkw
    public final void ouw(JSONObject jSONObject) {
        fkw.ouw ouwVarOuw = ouw();
        if (jSONObject.has("apm_url")) {
            ouwVarOuw.ouw("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("perf_con_apm")) {
                    ouwVarOuw.ouw("perf_con_apm", jSONObjectOptJSONObject.optInt("perf_con_apm"));
                }
            } catch (Exception unused) {
            }
        }
        ouwVarOuw.ouw();
        lh();
    }
}
