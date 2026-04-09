package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.dg.ypw;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sba {
    public static void emc(Context context, boolean z6, JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.rie rieVar, String str, int i, WebView webView, com.bytedance.sdk.openadsdk.core.widget.bw bwVar) {
        int iOptInt = jSONObject.optInt("landingStyle");
        String strOptString = jSONObject.optString("url");
        String strOptString2 = jSONObject.optString("fallback_url");
        String strOptString3 = jSONObject.optString("title", "");
        boolean z7 = false;
        boolean z8 = jSONObject.optInt("only_loading", 0) == 1;
        try {
            jSONObject.put("is_activity", z6);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, str, 1, jSONObject);
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        if (iOptInt == 0) {
            if (webView != null) {
                webView.loadUrl(strOptString);
                com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, str, 2, (JSONObject) null);
            } else {
                com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, str, -1, (JSONObject) null);
            }
        } else if (iOptInt == 1 || iOptInt == 8) {
            com.bytedance.sdk.openadsdk.vk.emc.ypw ypwVar = new com.bytedance.sdk.openadsdk.vk.emc.ypw();
            ypwVar.emc(ypw.emc.ypw);
            ypwVar.emc(rieVar);
            ypwVar.ypw(str);
            ypwVar.emc(-1);
            ypwVar.emc(false);
            ypwVar.ypw(rieVar.sx());
            com.bytedance.sdk.openadsdk.dg.xq.emc(ypwVar);
            com.bytedance.sdk.openadsdk.utils.rie.emc(context, strOptString, rieVar, ypw.emc.ypw);
        } else {
            if (iOptInt != 2) {
                if (iOptInt == 3) {
                    yzg yzgVar = new yzg(rieVar);
                    yzgVar.emc(strOptString3);
                    yzgVar.emc(z8);
                    iyl.emc(context, strOptString, rieVar, i, str, false, yzgVar);
                }
                if (bwVar == null && z7) {
                    bwVar.emc();
                    return;
                }
            }
            if (!com.bytedance.sdk.openadsdk.utils.rie.ypw(context, strOptString, rieVar, str)) {
                com.bytedance.sdk.openadsdk.vk.emc.ypw ypwVar2 = new com.bytedance.sdk.openadsdk.vk.emc.ypw();
                ypwVar2.emc(ypw.emc.ypw);
                ypwVar2.emc(rieVar);
                ypwVar2.ypw(str);
                ypwVar2.emc(-1);
                ypwVar2.emc(false);
                ypwVar2.ypw(rieVar.sx());
                com.bytedance.sdk.openadsdk.dg.xq.emc(ypwVar2);
                HashMap map = new HashMap();
                map.put("deeplink_url", strOptString);
                map.put("fallback_url", strOptString2);
                map.put("jsb_deeplink", 1);
                com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, str, "open_fallback_url", map);
                com.bytedance.sdk.openadsdk.utils.rie.emc(context, strOptString2, rieVar, ypw.emc.ypw);
            }
        }
        z7 = true;
        if (bwVar == null) {
        }
    }
}
