package com.bytedance.sdk.openadsdk.vk.emc;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bw {
    public static void emc(final String str, final String str2, final int i, final String str3) {
        com.bytedance.sdk.openadsdk.vk.xq.emc(str, false, 10, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.vk.emc.bw.1
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public xq emc() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str2);
                jSONObject.put("error_code", i);
                jSONObject.put("error_msg", str3);
                return dg.ypw().emc(str).ypw(jSONObject.toString());
            }
        });
    }
}
