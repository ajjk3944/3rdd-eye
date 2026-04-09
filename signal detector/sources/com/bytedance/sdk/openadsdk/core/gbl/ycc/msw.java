package com.bytedance.sdk.openadsdk.core.gbl.ycc;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.ul;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class msw {
    public void emc(String str, rie rieVar, String str2, Map<String, String> map) {
        if (map != null) {
            try {
                if (map.isEmpty()) {
                    return;
                }
                String str3 = map.get("label");
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                String strWdp = rieVar.wdp();
                if (!"sendLogExtra".equals(str) || TextUtils.isEmpty(strWdp)) {
                    jSONObject.put("log_extra", strWdp);
                } else {
                    JSONObject jSONObject2 = new JSONObject(strWdp);
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (!"label".equals(entry.getKey())) {
                            jSONObject2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject.put("log_extra", jSONObject2.toString());
                }
                JSONObject jSONObject3 = new JSONObject();
                if ("sendAdExtra".equals(str)) {
                    for (Map.Entry<String, String> entry2 : map.entrySet()) {
                        if (!"label".equals(entry2.getKey())) {
                            jSONObject3.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                }
                jSONObject.put("ad_extra_data", jSONObject3.toString());
                jSONObject.putOpt("ua_policy", Integer.valueOf(rieVar.nx()));
                com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, "app_union", str2, str3, Long.parseLong(rieVar.ye()), 0L, jSONObject, ul.uym(rieVar));
            } catch (Throwable unused) {
            }
        }
    }
}
