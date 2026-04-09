package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.openadsdk.core.settings.bw;
import com.bytedance.sdk.openadsdk.core.settings.ru;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc extends ru {
    public emc() {
        super("tt_set_apm.prop", new ru.emc() { // from class: com.bytedance.sdk.openadsdk.core.settings.emc.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.ru.emc
            public void emc() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.ru.emc
            public void ypw() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.bw
    public void emc(JSONObject jSONObject) {
        bw.emc emcVarEmc = emc();
        if (jSONObject.has("apm_url")) {
            emcVarEmc.emc("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("perf_con_apm")) {
                    emcVarEmc.emc("perf_con_apm", jSONObjectOptJSONObject.optInt("perf_con_apm"));
                }
            } catch (Exception unused) {
            }
        }
        emcVarEmc.emc();
        dg();
    }
}
