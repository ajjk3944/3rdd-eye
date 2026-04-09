package com.bytedance.sdk.openadsdk.component.dg;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.msw.msw;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.lt;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.mxo;
import com.bytedance.sdk.openadsdk.vk.emc.dg;
import com.bytedance.sdk.openadsdk.vk.xq;
import com.bytedance.sdk.openadsdk.vk.ypw;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    public static void emc(final int i10, final int i11, final lt ltVar) {
        xq.emc("openad_load_ad_timeout", false, new ypw() { // from class: com.bytedance.sdk.openadsdk.component.dg.emc.1
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeout_type", i10);
                jSONObject.put("user_timeout_time", i11);
                lt ltVar2 = ltVar;
                if (ltVar2 != null) {
                    jSONObject.put("start_type", ltVar2.ru() == 1);
                    jSONObject.put("load_index", ltVar.ru());
                }
                jSONObject.put("start_type_backup", com.bytedance.sdk.openadsdk.component.uym.emc.dg());
                jSONObject.put("app_running_time", com.bytedance.sdk.openadsdk.component.uym.emc.ypw());
                return dg.ypw().emc("openad_load_ad_timeout").ypw(jSONObject.toString());
            }
        });
    }

    public static void ypw(rie rieVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openad_creative_type", rie.bw(rieVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException e10) {
            ul.emc("TTAppOpenAdReport", "reportCacheLoss json error", e10);
        }
        com.bytedance.sdk.openadsdk.dg.xq.xq(rieVar, "cache_loss", jSONObject);
    }

    public static void emc(rie rieVar, int i10, int i11, float f10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            emc(jSONObject, rieVar);
            jSONObject.put("openad_creative_type", rie.bw(rieVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("total_time", f10);
            com.bytedance.sdk.openadsdk.dg.xq.emc(jSONObject, i11, i10);
        } catch (JSONException e10) {
            ul.emc("TTAppOpenAdReport", "reportSkip json error", e10);
        }
        com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, "skip", i10, jSONObject, (JSONObject) null);
    }

    public static void ypw(rie rieVar, long j10, boolean z10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("size", rieVar.iat().b());
            jSONObject.put("video_duration", rieVar.iat().E());
            jSONObject.put("order", z10 ? 1 : 2);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, "download_video_duration", j10, jSONObject, (JSONObject) null);
    }

    public static void emc(rie rieVar, long j10, float f10, boolean z10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            emc(jSONObject, rieVar);
            jSONObject.put("openad_creative_type", rie.bw(rieVar) ? "video_normal_ad" : "image_normal_ad");
            if (z10) {
                double d10 = f10;
                jSONObject.put("video_duration", d10);
                jSONObject.put("video_percent", (int) (((j10 * 1.0d) / 10.0d) / d10));
            } else {
                jSONObject.put("image_duration", f10);
            }
        } catch (JSONException e10) {
            ul.emc("TTAppOpenAdReport", "reportDestroy json error", e10);
        }
        com.bytedance.sdk.openadsdk.dg.xq.xq(rieVar, "destroy", jSONObject);
    }

    public static void emc(rie rieVar) {
        com.bytedance.sdk.openadsdk.dg.xq.xq(rieVar, "cache_expire", (JSONObject) null);
    }

    public static void emc(final String str, final int i10, final int i11, final boolean z10) {
        iyl.xq(new msw("opencache") { // from class: com.bytedance.sdk.openadsdk.component.dg.emc.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.model.emc emcVarYpw;
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("cypher")) {
                        jSONObject = aa.xq().emc(jSONObject);
                    }
                    if (jSONObject == null || !jSONObject.has("creatives") || (emcVarYpw = com.bytedance.sdk.openadsdk.core.model.emc.ypw(jSONObject)) == null || !emcVarYpw.bw()) {
                        return;
                    }
                    emc.emc(emcVarYpw.ycc(), i10, i11, z10);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static void emc(rie rieVar, int i10, int i11, boolean z10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cache_lib", i10);
            jSONObject.put("cache_replace", z10 ? 1 : 0);
            jSONObject.put("cache_refresh_scene", i11);
            if (i11 == 0) {
                jSONObject.put("cache_preload", 0);
            } else {
                jSONObject.put("cache_preload", 1);
            }
            jSONObject.put("aoa_cache_count", com.bytedance.sdk.openadsdk.component.uym.emc.msw());
            com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, "cache_refresh", -1L, (JSONObject) null, jSONObject);
        } catch (JSONException e10) {
            ul.emc("TTAppOpenAdReport", "reportCacheRefresh json error", e10);
        }
    }

    public static void emc(rie rieVar, long j10, boolean z10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("order", z10 ? 1 : 2);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, "download_image_duration", j10, jSONObject, (JSONObject) null);
    }

    public static void emc(rie rieVar, int i10, lt ltVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        long jYcc = 0;
        try {
            jSONObject.put("openad_creative_type", rie.bw(rieVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("open_ad_cache_type", i10);
            if (ltVar != null) {
                ltVar.ypw(mxo.ypw());
                emc(jSONObject, rieVar);
                jSONObject.put("client_start_time", ltVar.ypw());
                jSONObject.put("sever_time", ltVar.dg());
                jSONObject.put("network_time", ltVar.xq());
                jSONObject.put("client_end_time", ltVar.bw());
                jSONObject.put("download_resource_duration", ltVar.uym());
                jSONObject.put("resource_source", ltVar.msw());
                jSONObject.put("is_bidding", ltVar.emc ? 1 : 0);
                if (ltVar.emc) {
                    jSONObject.put("load_wait_time", ltVar.ypw);
                }
                jYcc = ltVar.ycc();
            }
        } catch (JSONException e10) {
            ul.emc("TTAppOpenAdReport", "reportLoadNetDuration json error", e10);
        }
        com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, "load_net_duration", jYcc, jSONObject, (JSONObject) null);
    }

    public static void emc(rie rieVar, long j10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            emc(jSONObject, rieVar);
            jSONObject.put("openad_creative_type", rie.bw(rieVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException unused) {
            ul.xq("TTAppOpenAdReport", "reportLoadCacheDuration json error");
        }
        com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, "load_cache_duration", j10, jSONObject, (JSONObject) null);
    }

    public static void emc(final lt ltVar, final int i10, final int i11) {
        if (ltVar == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        xq.emc("app_running_time", false, new ypw() { // from class: com.bytedance.sdk.openadsdk.component.dg.emc.3
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("app_running_time", ltVar.zz());
                jSONObject.put("loaded_app_running_time", com.bytedance.sdk.openadsdk.component.uym.emc.ypw());
                jSONObject.put("load_time", ltVar.emc().dg());
                jSONObject.put("load_from", i10);
                jSONObject.put("load_result", i11);
                int iRu = ltVar.ru();
                jSONObject.put("load_index", iRu);
                if (iRu == 1) {
                    jSONObject.put("init_to_ad_load_time", SystemClock.elapsedRealtime() - qh.dg);
                }
                return dg.ypw().emc("app_running_time").ypw(jSONObject.toString());
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void emc(org.json.JSONObject r1, com.bytedance.sdk.openadsdk.core.model.rie r2) throws org.json.JSONException {
        /*
            java.lang.String r0 = "is_icon_only"
            if (r2 == 0) goto Lc
            boolean r2 = r2.xmt()     // Catch: org.json.JSONException -> L11
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
            com.bytedance.sdk.component.utils.ul.xq(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.dg.emc.emc(org.json.JSONObject, com.bytedance.sdk.openadsdk.core.model.rie):void");
    }
}
