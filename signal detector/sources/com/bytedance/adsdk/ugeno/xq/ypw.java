package com.bytedance.adsdk.ugeno.xq;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.bw;
import com.bytedance.adsdk.ugeno.xq.emc;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw {
    public static String emc(String str, JSONObject jSONObject) {
        emc emcVarXq;
        emc.InterfaceC0013emc interfaceC0013emcEmc;
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                if (str.startsWith("${") && str.endsWith("}") && (emcVarXq = bw.emc().xq()) != null && (interfaceC0013emcEmc = emcVarXq.emc(str.substring(2, str.length() - 1))) != null) {
                    return (String) interfaceC0013emcEmc.emc(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }
}
