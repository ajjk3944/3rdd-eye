package com.bytedance.sdk.openadsdk.dg;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.model.rie;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ru {
    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject ypw(rie rieVar, String str, int i10, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("error_msg", str);
            }
            jSONObject2.put("ad_show_order", i10 + 1);
            jSONObject2.put("interaction_method", rieVar.nw());
            jSONObject2.put("real_interaction_method", rieVar.fu());
            jSONObject2.put("render_time_out", com.bytedance.sdk.openadsdk.core.aa.dg().mkp());
            jSONObject2.put("has_show_endcard", rieVar.vk());
            jSONObject2.put("video_skip_result", com.bytedance.sdk.openadsdk.core.aa.dg().sz(String.valueOf(rieVar.tx())));
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject2.put(next, jSONObject.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return jSONObject2;
    }

    public static void emc(rie rieVar, String str, String str2, String str3) {
        emc(rieVar, str, str2, str3, null);
    }

    public static void emc(rie rieVar, String str, String str2, String str3, JSONObject jSONObject) {
        emc(rieVar, str, str2, str3, jSONObject, 0);
    }

    public static void emc(final rie rieVar, String str, String str2, final String str3, final JSONObject jSONObject, final int i10) {
        if (rieVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        xq.emc(System.currentTimeMillis(), rieVar, str2, str, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.ru.1
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject emc() {
                return ru.ypw(rieVar, str3, i10, jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() throws JSONException {
                if (jSONObject == null) {
                    return super.ypw();
                }
                long jAa = rieVar.aa();
                if (jAa < 0) {
                    long jZz = rieVar.zz();
                    if (jZz > 0) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - jZz;
                        if (jElapsedRealtime > 0) {
                            jAa = jElapsedRealtime;
                        }
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", jAa);
                    return jSONObject2;
                } catch (Exception e10) {
                    ul.xq(e10.getMessage(), new Object[0]);
                    return jSONObject2;
                }
            }
        });
    }

    public static void emc(String str, boolean z10, boolean z11, rie rieVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("has_close_invoke", z10 ? 1 : 2);
            jSONObject.put("has_show_invoke", z11 ? 1 : 2);
            emc(rieVar, str, rieVar != null ? rieVar.bw() : null, null, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public static void emc(rie rieVar, String str, int i10) {
        emc(rieVar, "close".equals(str) ? "close_listen_empty" : "show_listen_empty", rieVar != null ? rieVar.bw() : null, null, null, i10);
    }
}
