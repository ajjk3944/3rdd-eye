package com.bytedance.sdk.openadsdk.component.uym;

import A.f;
import A2.C0115c;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.component.utils.uym;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.common.sba;
import com.bytedance.sdk.openadsdk.component.ycc;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.multipro.ypw;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    private static AtomicInteger emc = new AtomicInteger(0);

    public static boolean bw() {
        return com.bytedance.sdk.openadsdk.sra.emc.emc("aoa_cache_opt_enable", 0) == 1;
    }

    public static int dg() {
        return qh.ypw.get() ? 1 : 2;
    }

    public static File emc(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(((C0115c) CacheDirFactory.getICacheDir(0)).g());
        return new File(f.p(sb, File.separator, str));
    }

    public static int msw() {
        if (bw()) {
            return com.bytedance.sdk.openadsdk.sra.emc.emc("aoa_cache_count", 3);
        }
        return 1;
    }

    public static int ru() {
        int iEmc = com.bytedance.sdk.openadsdk.sra.emc.emc("aoa_cache_poll_interval", 3600000);
        if (iEmc < 60000) {
            return 3600000;
        }
        return iEmc;
    }

    public static int uym() {
        return emc.get() == 0 ? com.bytedance.sdk.openadsdk.sra.emc.emc("aoa_cold_load_timeout", 3500) : com.bytedance.sdk.openadsdk.sra.emc.emc("aoa_hot_load_timeout", 3500);
    }

    public static int xq() {
        return emc.incrementAndGet();
    }

    public static boolean ycc() {
        return aa.dg().sup() == 1;
    }

    public static File ypw(String str) {
        return emc(aa.emc(), ycc.emc(aa.emc()).ypw(), str);
    }

    public static int zz() {
        int iEmc = com.bytedance.sdk.openadsdk.sra.emc.emc("aoa_cache_refresh_time", 72000000);
        if (iEmc < 60000) {
            return 72000000;
        }
        return iEmc;
    }

    public static long ypw() {
        if (Build.VERSION.SDK_INT >= 24) {
            return SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime();
        }
        return Process.getElapsedCpuTime();
    }

    public static File emc(Context context, String str, String str2) {
        return uym.emc(context, ypw.xq(), str, str2);
    }

    public static void emc(File file) {
        if (file == null) {
            return;
        }
        try {
            uym.ypw(file);
        } catch (Throwable unused) {
        }
    }

    public static void emc(Context context) {
        try {
            ycc.emc(context).emc();
            if (bw()) {
                sba.emc().ypw();
            }
        } catch (Throwable unused) {
        }
    }

    public static String emc() {
        return uym.emc(aa.emc(), ypw.xq(), ycc.emc(aa.emc()).ypw()).getAbsolutePath();
    }

    public static void emc(JSONObject jSONObject, int i, boolean z6) throws JSONException {
        try {
            String strMsw = zz.ypw().msw();
            int iZz = zz.ypw().zz();
            JSONObject jSONObject2 = jSONObject.getJSONObject("creative");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("app_name", strMsw);
            if (!z6) {
                jSONObject3.put("app_icon_id", "@".concat(String.valueOf(iZz)));
            } else if (zz.ypw().zz() != 0) {
                jSONObject3.put("app_icon_id", "local://pag_open_icon_id");
            }
            jSONObject2.put("open_app_info", jSONObject3);
            if (jSONObject2.optJSONObject("video") == null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("video_duration", aa.dg().rie(String.valueOf(i)));
                jSONObject2.put("video", jSONObject4);
            }
        } catch (Exception e6) {
            ul.xq("TTAppOpenUtils", e6.getMessage());
        }
    }

    public static int emc(rie rieVar, int i) {
        return i - rieVar.wy();
    }

    public static void emc(int i) {
        AdSlot adSlotXq;
        if (bw() && (adSlotXq = sba.emc().xq()) != null && TextUtils.isEmpty(adSlotXq.getBidAdm())) {
            adSlotXq.setCacheScene(i);
            ycc.emc(aa.emc()).emc(adSlotXq);
        }
    }

    public static boolean emc(AdSlot adSlot) {
        Map<String, Object> requestExtraMap;
        return (adSlot == null || (requestExtraMap = adSlot.getRequestExtraMap()) == null || requestExtraMap.get("is_from_m") != Boolean.TRUE) ? false : true;
    }
}
