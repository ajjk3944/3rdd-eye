package com.bytedance.sdk.openadsdk.component.yu;

import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.uq;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.fak;
import com.bytedance.sdk.openadsdk.yu.lh;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public static void ouw(vpp vppVar, int i4, int i10, float f10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            ouw(jSONObject, vppVar);
            jSONObject.put("openad_creative_type", vpp.fkw(vppVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("total_time", f10);
            lh.ouw(jSONObject, i10, i4);
        } catch (JSONException e2) {
            qbp.ouw("TTAppOpenAdReport", "reportSkip json error", e2);
        }
        lh.ouw(vppVar, "skip", i4, jSONObject);
    }

    public static void vt(vpp vppVar, long j, boolean z3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("size", vppVar.f8309sd.f6575c);
            jSONObject.put("video_duration", vppVar.f8309sd.f6576d);
            jSONObject.put("order", z3 ? 1 : 2);
        } catch (JSONException unused) {
        }
        lh.ouw(vppVar, "download_video_duration", j, jSONObject);
    }

    public static void ouw(vpp vppVar, long j, float f10, boolean z3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            ouw(jSONObject, vppVar);
            jSONObject.put("openad_creative_type", vpp.fkw(vppVar) ? "video_normal_ad" : "image_normal_ad");
            if (z3) {
                double d10 = f10;
                jSONObject.put("video_duration", d10);
                jSONObject.put("video_percent", (int) (((j * 1.0d) / 10.0d) / d10));
            } else {
                jSONObject.put("image_duration", f10);
            }
        } catch (JSONException e2) {
            qbp.ouw("TTAppOpenAdReport", "reportDestroy json error", e2);
        }
        lh.lh(vppVar, "destroy", jSONObject);
    }

    public static void ouw(vpp vppVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openad_creative_type", vpp.fkw(vppVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException e2) {
            qbp.ouw("TTAppOpenAdReport", "reportCacheLoss json error", e2);
        }
        lh.lh(vppVar, "cache_loss", jSONObject);
    }

    public static void ouw(vpp vppVar, long j, boolean z3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("order", z3 ? 1 : 2);
        } catch (JSONException unused) {
        }
        lh.ouw(vppVar, "download_image_duration", j, jSONObject);
    }

    public static void ouw(vpp vppVar, int i4, uq uqVar) {
        JSONObject jSONObject = new JSONObject();
        long j = 0;
        try {
            jSONObject.put("openad_creative_type", vpp.fkw(vppVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("open_ad_cache_type", i4);
            if (uqVar != null) {
                uqVar.ouw(fak.ouw());
                ouw(jSONObject, vppVar);
                jSONObject.put("client_start_time", uqVar.vt);
                jSONObject.put("sever_time", uqVar.yu);
                jSONObject.put("network_time", uqVar.f8285lh);
                jSONObject.put("client_end_time", uqVar.fkw);
                jSONObject.put("download_resource_duration", uqVar.ra);
                jSONObject.put("resource_source", uqVar.pno);
                jSONObject.put("is_bidding", uqVar.bly ? 1 : 0);
                if (uqVar.bly) {
                    jSONObject.put("load_wait_time", uqVar.tlj);
                }
                j = uqVar.f8284le;
            }
        } catch (JSONException e2) {
            qbp.ouw("TTAppOpenAdReport", "reportLoadNetDuration json error", e2);
        }
        lh.ouw(vppVar, "load_net_duration", j, jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ouw(org.json.JSONObject r1, com.bytedance.sdk.openadsdk.core.model.vpp r2) throws org.json.JSONException {
        /*
            java.lang.String r0 = "is_icon_only"
            if (r2 == 0) goto Lc
            boolean r2 = r2.ra()     // Catch: org.json.JSONException -> L11
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L11
            return
        L11:
            r1 = move-exception
            java.lang.String r2 = "TTAppOpenAdReport"
            java.lang.String r1 = r1.getMessage()
            com.bytedance.sdk.component.utils.qbp.lh(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.yu.ouw.ouw(org.json.JSONObject, com.bytedance.sdk.openadsdk.core.model.vpp):void");
    }
}
