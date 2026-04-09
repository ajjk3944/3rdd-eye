package com.bytedance.sdk.openadsdk.core.bly;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.pd;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class cf {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void ouw(String str, int i4, String str2, String str3, String str4, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.openadsdk.core.pno.ouw(i4);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_source", str);
            vpp.ouw ouwVar = vppVar.xn;
            if (ouwVar != null) {
                jSONObject.put("tpl_id", ouwVar.ouw);
                if ("Web".equals(str)) {
                    if (ouwVar.ouw()) {
                        jSONObject.put("engine_version", "v3");
                    } else {
                        jSONObject.put("engine_version", "v1");
                    }
                }
            } else {
                pd pdVar = vppVar.lht;
                if (pdVar != null) {
                    jSONObject.put("tpl_id", pdVar.ouw);
                    if ("Web".equals(str)) {
                        jSONObject.put("engine_version", "v3");
                    }
                }
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
        str3.getClass();
        int i10 = 3;
        char c9 = 65535;
        switch (str3.hashCode()) {
            case -1695837674:
                if (str3.equals("banner_ad")) {
                    c9 = 0;
                    break;
                }
                break;
            case -1364000502:
                if (str3.equals("rewarded_video")) {
                    c9 = 1;
                    break;
                }
                break;
            case -1263194568:
                if (str3.equals("open_ad")) {
                    c9 = 2;
                    break;
                }
                break;
            case -764631662:
                if (str3.equals("fullscreen_interstitial_ad")) {
                    c9 = 3;
                    break;
                }
                break;
            case -712491894:
                if (str3.equals("embeded_ad")) {
                    c9 = 4;
                    break;
                }
                break;
            case 1844104722:
                if (str3.equals("interaction")) {
                    c9 = 5;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                i10 = 1;
                break;
            case 1:
                i10 = 7;
                break;
            case 2:
                break;
            case 3:
                i10 = 8;
                break;
            case 4:
            default:
                i10 = 5;
                break;
            case 5:
                i10 = 2;
                break;
        }
        yuVar.yu = i10;
        yuVar.vt = str4;
        yuVar.fkw = vppVar != null ? vppVar.ux() : "";
        yuVar.f8641le = i4;
        yuVar.bly = jSONObject.toString();
        yuVar.ra = str2;
        com.bytedance.sdk.openadsdk.rn.lh.ouw().ouw(yuVar);
    }
}
