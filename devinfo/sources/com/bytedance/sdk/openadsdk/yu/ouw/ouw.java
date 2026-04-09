package com.bytedance.sdk.openadsdk.yu.ouw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.jae;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.tc;
import com.bytedance.sdk.openadsdk.utils.uoy;
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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw {

    /* renamed from: le, reason: collision with root package name */
    private static volatile ouw f8831le;
    private final String fkw;

    /* renamed from: lh, reason: collision with root package name */
    private Context f8832lh;
    private long ouw;
    private int vt;
    private final boolean yu = lh();

    private ouw() {
        Context contextOuw = zih.ouw();
        if (contextOuw != null) {
            this.f8832lh = contextOuw.getApplicationContext();
        }
        this.fkw = DeviceUtils.lh(this.f8832lh) ? "tv" : DeviceUtils.vt(this.f8832lh) ? "android_pad" : "android";
    }

    private static boolean lh() {
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

    public static ouw ouw() {
        if (f8831le == null) {
            synchronized (ouw.class) {
                try {
                    if (f8831le == null) {
                        f8831le = new ouw();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f8831le;
    }

    public static List<com.bytedance.sdk.openadsdk.yu.ouw> vt(List<com.bytedance.sdk.openadsdk.yu.ouw> list) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.yu.ouw ouwVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObjectYu = ouwVar.yu();
                jSONObject.putOpt("event", jSONObjectYu.optString("label"));
                long jOptLong = jSONObjectYu.optLong("event_ts", System.currentTimeMillis());
                jSONObject.putOpt("local_time_ms", Long.valueOf(jOptLong));
                jSONObject.putOpt("datetime", com.bytedance.sdk.openadsdk.yu.le.f8779lh.format(new Date(jOptLong)));
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> itKeys = jSONObjectYu.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!TextUtils.equals(next, "label")) {
                        jSONObject2.putOpt(next, jSONObjectYu.opt(next));
                    }
                }
                jSONObject.putOpt("params", jSONObject2);
                arrayList.add(new com.bytedance.sdk.openadsdk.yu.le(ouwVar.ouw, jSONObject));
            } catch (Exception e2) {
                qbp.lh("AdLogParamsGenerate", e2.getMessage());
            }
        }
        return arrayList;
    }

    private static String yu() {
        StringBuilder sb2 = new StringBuilder();
        try {
            if (tc.lh()) {
                sb2.append("MIUI-");
            } else if (tc.vt()) {
                sb2.append("FLYME-");
            } else {
                String strYu = tc.yu();
                if (tc.ouw(strYu)) {
                    sb2.append("EMUI-");
                }
                if (!TextUtils.isEmpty(strYu)) {
                    sb2.append(strYu);
                    sb2.append("-");
                }
            }
            sb2.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb2.toString();
    }

    public static String ouw(List<com.bytedance.sdk.openadsdk.yu.ouw> list) {
        String strOptString;
        if (list.size() > 0 && list.get(0) != null && list.get(0).yu() != null) {
            strOptString = list.get(0).yu().optString("app_log_url");
        } else {
            strOptString = "";
        }
        return uoy.lh(strOptString);
    }

    public final JSONObject ouw(List<com.bytedance.sdk.openadsdk.yu.ouw> list, long j, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        try {
            com.bytedance.sdk.openadsdk.yu.ouw ouwVar = list.get(0);
            if (ouwVar != null) {
                try {
                    String strOptString = ouwVar.yu().optJSONObject("params").optString("log_extra", "");
                    long jOuw = vpp.ouw(strOptString);
                    int iLh = vpp.lh(strOptString);
                    if (jOuw == 0) {
                        jOuw = this.ouw;
                    }
                    this.ouw = jOuw;
                    if (iLh == 0) {
                        iLh = this.vt;
                    }
                    this.vt = iLh;
                } catch (Exception e2) {
                    qbp.yu("AdLogParamsGenerate", "getInfoFromLogExtra exception", e2.getMessage());
                }
            }
            jSONObject2.put("header", jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<com.bytedance.sdk.openadsdk.yu.ouw> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().fkw());
            }
            jSONObject2.put("event_v3", jSONArray);
            jSONObject2.put("magic_tag", "ss_app_log");
            jSONObject2.put("_gen_time", j);
            jSONObject2.put("local_time", j / 1000);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    @SuppressLint({"HardwareIds"})
    public final JSONObject vt() throws JSONException {
        String str;
        String str2;
        Context contextOuw;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f8832lh == null && (contextOuw = zih.ouw()) != null) {
                this.f8832lh = contextOuw.getApplicationContext();
            }
            jSONObject.put("ua", uoy.fkw());
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("app_version", uoy.bly());
            jSONObject.put("sim_op", ouw(this.f8832lh));
            jSONObject.put("root", this.yu ? 1 : 0);
            int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
            if (rawOffset < -12) {
                rawOffset = -12;
            }
            if (rawOffset > 12) {
                rawOffset = 12;
            }
            jSONObject.put("timezone", rawOffset);
            int iOuw = ksc.ouw(this.f8832lh, 0L);
            if (iOuw == 2) {
                str = "2g";
            } else if (iOuw == 3) {
                str = "3g";
            } else if (iOuw == 4) {
                str = "wifi";
            } else if (iOuw == 5) {
                str = "4g";
            } else if (iOuw != 6) {
                str = "mobile";
            } else {
                str = "5g";
            }
            jSONObject.put("access", str);
            jSONObject.put("os", "Android");
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            jSONObject.put("device_type", this.fkw);
            jSONObject.put("device_model", Build.MODEL);
            jSONObject.put("device_brand", Build.BRAND);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("language", Locale.getDefault().getLanguage());
            jSONObject.put("resolution", osn.le(this.f8832lh) + "x" + osn.yu(this.f8832lh));
            int iCf = osn.cf(this.f8832lh);
            if (iCf != 120) {
                str2 = "mdpi";
                if (iCf != 160) {
                    if (iCf == 240) {
                        str2 = "hdpi";
                    } else if (iCf == 320) {
                        str2 = "xhdpi";
                    } else if (iCf == 480) {
                        str2 = "xxhdpi";
                    } else if (iCf == 640) {
                        str2 = "xxxhdpi";
                    }
                }
            } else {
                str2 = "ldpi";
            }
            jSONObject.put("display_density", str2);
            jSONObject.put("density_dpi", osn.cf(this.f8832lh));
            jSONObject.put("aid", "1371");
            jSONObject.put("device_id", ryl.ouw(this.f8832lh));
            jSONObject.put("rom", yu());
            jSONObject.put("cpu_abi", Build.CPU_ABI);
            jSONObject.put("ut", this.vt);
            jSONObject.put("uid", this.ouw);
            jSONObject.put("google_aid", com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().vt());
            jSONObject.put("locale_language", DeviceUtils.yu());
            jSONObject.put("screen_bright", Math.ceil(DeviceUtils.fkw() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", !DeviceUtils.vt() ? 1 : 0);
            com.bytedance.sdk.openadsdk.core.settings.cf cfVarYu = zih.yu();
            Context context = this.f8832lh;
            if (context != null) {
                jSONObject.put("force_language", com.bytedance.sdk.component.utils.vpp.ouw(context, "tt_choose_language"));
            }
            if (cfVarYu.zin("mnc")) {
                jSONObject.put("mnc", jae.lh());
            }
            if (cfVarYu.zin("mcc")) {
                jSONObject.put("mcc", jae.vt());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String ouw(Context context) {
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
}
