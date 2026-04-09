package com.bytedance.sdk.openadsdk.dg.emc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.rie;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.sup;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.dr;
import com.bytedance.sdk.openadsdk.utils.ee;
import com.bytedance.sdk.openadsdk.utils.sb;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    private static volatile emc ycc;
    private final String bw;
    private final boolean dg = xq();
    private long emc;
    private Context xq;
    private int ypw;

    private emc() {
        Context contextEmc = aa.emc();
        if (contextEmc != null) {
            this.xq = contextEmc.getApplicationContext();
        }
        this.bw = bw();
    }

    private String bw() {
        return DeviceUtils.xq(this.xq) ? "tv" : DeviceUtils.ypw(this.xq) ? "android_pad" : "android";
    }

    private int dg() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static emc emc() {
        if (ycc == null) {
            synchronized (emc.class) {
                try {
                    if (ycc == null) {
                        ycc = new emc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ycc;
    }

    private boolean xq() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private String ycc() {
        StringBuilder sb = new StringBuilder();
        try {
            if (sb.bw()) {
                sb.append("MIUI-");
            } else if (sb.ypw()) {
                sb.append("FLYME-");
            } else {
                String strQh = sb.qh();
                if (sb.emc(strQh)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(strQh)) {
                    sb.append(strQh);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    @SuppressLint({"HardwareIds"})
    public JSONObject ypw() {
        Context contextEmc;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.xq == null && (contextEmc = aa.emc()) != null) {
                this.xq = contextEmc.getApplicationContext();
            }
            jSONObject.put("ua", tp.dg());
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("app_version", tp.msw());
            jSONObject.put("sim_op", emc(this.xq));
            jSONObject.put("root", this.dg ? 1 : 0);
            jSONObject.put("timezone", dg());
            jSONObject.put("access", ee.emc(this.xq));
            jSONObject.put("os", "Android");
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            jSONObject.put("device_type", this.bw);
            jSONObject.put("device_model", Build.MODEL);
            jSONObject.put("device_brand", Build.BRAND);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("language", Locale.getDefault().getLanguage());
            jSONObject.put("resolution", vw.bw(this.xq) + "x" + vw.xq(this.xq));
            jSONObject.put("display_density", emc(vw.ru(this.xq)));
            jSONObject.put("density_dpi", vw.ru(this.xq));
            jSONObject.put("aid", "1371");
            jSONObject.put("device_id", sup.emc(this.xq));
            jSONObject.put("rom", ycc());
            jSONObject.put("cpu_abi", Build.CPU_ABI);
            jSONObject.put("ut", this.ypw);
            jSONObject.put("uid", this.emc);
            jSONObject.put("google_aid", com.bytedance.sdk.openadsdk.ul.emc.ypw.emc.emc().ypw());
            jSONObject.put("locale_language", DeviceUtils.dg());
            jSONObject.put("screen_bright", Math.ceil(DeviceUtils.bw() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", !DeviceUtils.ypw() ? 1 : 0);
            com.bytedance.sdk.openadsdk.core.settings.gbl gblVarDg = aa.dg();
            Context context = this.xq;
            if (context != null) {
                jSONObject.put("force_language", rie.emc(context, "tt_choose_language"));
            }
            if (gblVarDg.sb("mnc")) {
                jSONObject.put("mnc", dr.xq());
            }
            if (gblVarDg.sb("mcc")) {
                jSONObject.put("mcc", dr.ypw());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String emc(List<com.bytedance.sdk.openadsdk.dg.emc> list) {
        String strOptString;
        if (list.size() > 0 && list.get(0) != null && list.get(0).xq() != null) {
            strOptString = list.get(0).xq().optString("app_log_url");
        } else {
            strOptString = "";
        }
        return tp.bw(strOptString);
    }

    private void emc(com.bytedance.sdk.openadsdk.dg.emc emcVar, boolean z10) {
        if (emcVar == null) {
            return;
        }
        try {
            String strOptString = z10 ? emcVar.xq().optJSONObject("params").optString("log_extra", "") : emcVar.xq().optString("log_extra", "");
            long jEmc = com.bytedance.sdk.openadsdk.core.model.rie.emc(strOptString);
            int iDg = com.bytedance.sdk.openadsdk.core.model.rie.dg(strOptString);
            if (jEmc == 0) {
                jEmc = this.emc;
            }
            this.emc = jEmc;
            if (iDg == 0) {
                iDg = this.ypw;
            }
            this.ypw = iDg;
        } catch (Exception e10) {
            ul.xq("AdLogParamsGenerate", "getInfoFromLogExtra exception", e10.getMessage());
        }
    }

    public JSONObject emc(List<com.bytedance.sdk.openadsdk.dg.emc> list, long j10, JSONObject jSONObject, boolean z10) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            emc(list.get(0), z10);
            jSONObject2.put("header", jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<com.bytedance.sdk.openadsdk.dg.emc> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().emc(z10));
            }
            if (z10) {
                jSONObject2.put("event_v3", jSONArray);
                jSONObject2.put("magic_tag", "ss_app_log");
            } else {
                jSONObject2.put(NotificationCompat.CATEGORY_EVENT, jSONArray);
            }
            jSONObject2.put("_gen_time", j10);
            jSONObject2.put("local_time", j10 / 1000);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public List<com.bytedance.sdk.openadsdk.dg.emc> emc(List<com.bytedance.sdk.openadsdk.dg.emc> list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.dg.emc emcVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObjectXq = emcVar.xq();
                jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, jSONObjectXq.optString("label"));
                long jOptLong = jSONObjectXq.optLong("event_ts", System.currentTimeMillis());
                jSONObject.putOpt("local_time_ms", Long.valueOf(jOptLong));
                jSONObject.putOpt("datetime", com.bytedance.sdk.openadsdk.dg.ycc.xq.format(new Date(jOptLong)));
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> itKeys = jSONObjectXq.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!TextUtils.equals(next, "label")) {
                        jSONObject2.putOpt(next, jSONObjectXq.opt(next));
                    }
                }
                if (z10) {
                    jSONObject2.putOpt("_ad_staging_flag", 3);
                }
                jSONObject.putOpt("params", jSONObject2);
                arrayList.add(new com.bytedance.sdk.openadsdk.dg.ycc(emcVar.emc, jSONObject));
            } catch (Exception e10) {
                ul.xq("AdLogParamsGenerate", e10.getMessage());
            }
        }
        return arrayList;
    }

    private String emc(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            return telephonyManager.getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }

    private String emc(int i10) {
        if (i10 == 120) {
            return "ldpi";
        }
        if (i10 == 160) {
            return "mdpi";
        }
        if (i10 == 240) {
            return "hdpi";
        }
        if (i10 == 320) {
            return "xhdpi";
        }
        if (i10 == 480) {
            return "xxhdpi";
        }
        if (i10 != 640) {
            return "mdpi";
        }
        return "xxxhdpi";
    }
}
