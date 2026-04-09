package com.bytedance.sdk.openadsdk.core.cf.le;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno {
    public static void ouw(String str, vpp vppVar, String str2, Map<String, String> map) {
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
                String str4 = vppVar.yhj;
                if (!"sendLogExtra".equals(str) || TextUtils.isEmpty(str4)) {
                    jSONObject.put("log_extra", str4);
                } else {
                    JSONObject jSONObject2 = new JSONObject(str4);
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
                jSONObject.putOpt("ua_policy", Integer.valueOf(vppVar.f8316vi));
                com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, "app_union", str2, str3, Long.parseLong(vppVar.pv), 0L, jSONObject, th.ra(vppVar));
            } catch (Throwable unused) {
            }
        }
    }
}
