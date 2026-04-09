package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bw {
    private static WeakReference<com.bytedance.sdk.openadsdk.core.model.rie> emc;
    private static boolean xq;
    private static long ypw;

    public static void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        com.bytedance.sdk.openadsdk.core.model.ycc yccVarMjd = rieVar.mjd();
        if (yccVarMjd == null || TextUtils.isEmpty(yccVarMjd.emc())) {
            return;
        }
        emc = new WeakReference<>(rieVar);
    }

    public static boolean xq() {
        WeakReference<com.bytedance.sdk.openadsdk.core.model.rie> weakReference = emc;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        xq = true;
        return true;
    }

    private static void ypw(final long j10) {
        com.bytedance.sdk.openadsdk.core.model.rie rieVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.model.rie> weakReference = emc;
        if (weakReference == null || j10 <= 0 || (rieVar = weakReference.get()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), rieVar, rieVar.bw(), "store_duration", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.utils.bw.1
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
        emc = null;
        xq = false;
    }

    public static void emc(long j10) {
        ypw(j10);
    }

    public static void emc() {
        if (emc == null || xq) {
            return;
        }
        if (ypw > 0) {
            ypw(SystemClock.elapsedRealtime() - ypw);
        }
        emc = null;
        ypw = 0L;
    }

    public static void ypw() {
        if (emc == null || xq) {
            return;
        }
        ypw = SystemClock.elapsedRealtime();
    }
}
