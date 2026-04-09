package com.bytedance.sdk.openadsdk.core.msw;

import com.bytedance.sdk.component.uym.ypw.dg;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.sra;
import com.bytedance.sdk.openadsdk.utils.tp;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xq {
    public static void emc(String str, long j6) throws JSONException {
        JSONObject jSONObjectYpw = ypw(str, j6);
        dg dgVarYpw = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().ypw();
        dgVarYpw.ypw(tp.dg("/api/ad/union/sdk/stats/"));
        dgVarYpw.dg(jSONObjectYpw.toString());
        dgVarYpw.emc(6);
        dgVarYpw.emc("uploadFrequentEvent");
        dgVarYpw.emc(new com.bytedance.sdk.component.uym.emc.emc() { // from class: com.bytedance.sdk.openadsdk.core.msw.xq.1
            @Override // com.bytedance.sdk.component.uym.emc.emc
            public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, com.bytedance.sdk.component.uym.ypw ypwVar) {
            }

            @Override // com.bytedance.sdk.component.uym.emc.emc
            public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, IOException iOException) {
                iOException.getMessage();
                if (xqVar != null) {
                    sra.emc(xqVar.dg());
                }
            }
        });
    }

    private static JSONObject ypw(String str, long j6) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "over_freq");
            jSONObject.put("rit", str);
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("timestamp", j6);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
