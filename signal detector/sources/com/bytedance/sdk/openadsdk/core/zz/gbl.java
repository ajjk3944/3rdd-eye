package com.bytedance.sdk.openadsdk.core.zz;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.rie;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class gbl {
    public static void emc(String str, int i, String str2, String str3, String str4, com.bytedance.sdk.openadsdk.core.model.rie rieVar) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.openadsdk.core.msw.emc(i);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_source", str);
            rie.emc emcVarZhk = rieVar.zhk();
            if (emcVarZhk != null) {
                jSONObject.put("tpl_id", emcVarZhk.dg());
                if ("Web".equals(str)) {
                    if (emcVarZhk.sup()) {
                        jSONObject.put("engine_version", "v3");
                    } else {
                        jSONObject.put("engine_version", "v1");
                    }
                }
            } else if (rieVar.kv() != null) {
                jSONObject.put("tpl_id", rieVar.kv().emc());
                if ("Web".equals(str)) {
                    jSONObject.put("engine_version", "v3");
                }
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.vk.xq.emc().emc(com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc(emc(str3)).xq(str4).bw(rieVar != null ? rieVar.lvs() : "").ypw(i).ypw(jSONObject.toString()).ycc(str2));
    }

    private static int emc(String str) {
        str.getClass();
        switch (str) {
            case "banner_ad":
                return 1;
            case "rewarded_video":
                return 7;
            case "open_ad":
                return 3;
            case "fullscreen_interstitial_ad":
                return 8;
            case "interaction":
                return 2;
            default:
                return 5;
        }
    }
}
