package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.openadsdk.core.yu.ra;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class bly {
    public static final Set<String> bly = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.bly.1
        {
            add("8025677");
            add("5001121");
        }
    };
    public static mwh ouw = null;
    private static boolean vm = false;

    /* renamed from: cf, reason: collision with root package name */
    public String f8048cf;
    int fkw;

    /* renamed from: jg, reason: collision with root package name */
    private boolean f8049jg;
    private String ko;

    /* renamed from: le, reason: collision with root package name */
    Integer f8050le;

    /* renamed from: lh, reason: collision with root package name */
    String f8051lh;
    public volatile ConcurrentHashMap<String, ra.ouw> mwh;
    String pno;
    public int ra;
    private String rn;
    public com.bytedance.sdk.openadsdk.core.mwh.lh.lh ryl;
    public boolean tlj;
    String vt;
    int yu;
    private Bitmap zih;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        private static final bly ouw = new bly(0);
    }

    public /* synthetic */ bly(byte b10) {
        this();
    }

    public static int fkw() {
        try {
            String strOuw = ouw("domain_index", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strOuw)) {
                return 0;
            }
            return Integer.valueOf(strOuw).intValue();
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.yu("TTAD.GlobalInfo", "getDomainIndex", th2.getMessage());
            return 0;
        }
    }

    public static boolean ko() {
        return "com.union_test.internationad".equals(com.bytedance.sdk.openadsdk.utils.uoy.ra());
    }

    public static int le() {
        try {
            String strOuw = ouw("config_fail_times", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strOuw)) {
                return 0;
            }
            return Integer.valueOf(strOuw).intValue();
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.yu("TTAD.GlobalInfo", "getConfigFailTimes", th2.getMessage());
            return 0;
        }
    }

    public static void lh() {
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_file", "sdk_activate_init", Boolean.FALSE);
    }

    public static boolean rn() {
        return vm;
    }

    public static void zih() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            vm = true;
        }
    }

    public final int bly() {
        return com.bytedance.sdk.openadsdk.multipro.vt.lh() ? com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_icon_id", "icon_id", 0) : this.yu;
    }

    public final boolean cf() {
        int i4 = this.ra;
        return i4 < -1 || i4 > 1;
    }

    public final boolean jg() {
        return bly.contains(this.vt);
    }

    public final Bitmap mwh() {
        return com.bytedance.sdk.openadsdk.multipro.vt.lh() ? com.bytedance.sdk.component.utils.yu.ouw(com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("sp_global_file", "pause_icon", null)) : this.zih;
    }

    public final String pno() {
        if (TextUtils.isEmpty(this.ko)) {
            this.ko = ouw(zih.ouw());
        }
        return this.ko;
    }

    public final String ra() {
        String str = this.f8051lh;
        if (str != null) {
            return str;
        }
        String strOuw = ouw("mediation_info", Long.MAX_VALUE);
        this.f8051lh = strOuw;
        if (strOuw == null) {
            this.f8051lh = "";
        }
        return this.f8051lh;
    }

    public final String ryl() {
        return com.bytedance.sdk.openadsdk.multipro.vt.lh() ? com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("sp_global_file", "extra_data", null) : this.rn;
    }

    public final int tlj() {
        Integer num = this.f8050le;
        return num != null ? num.intValue() : com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_privacy", "tt_gdpr", -1);
    }

    public final String vm() {
        return com.bytedance.sdk.openadsdk.multipro.vt.lh() ? com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("sp_global_file", "adx_id", "") : this.pno;
    }

    public final String yu() {
        if (TextUtils.isEmpty(this.vt)) {
            String strOuw = ouw("app_id", Long.MAX_VALUE);
            if (!TextUtils.isEmpty(strOuw)) {
                this.vt = strOuw;
            }
        }
        return this.vt;
    }

    private bly() {
        this.f8049jg = false;
        this.fkw = 0;
        this.zih = null;
        this.f8050le = null;
        this.ra = -1;
        this.mwh = null;
    }

    public static void ouw(mwh mwhVar) {
        ouw = mwhVar;
    }

    public static boolean vt() {
        return com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_file", "sdk_activate_init");
    }

    public final ra.ouw lh(String str) {
        try {
            if (this.mwh == null || str == null) {
                return null;
            }
            return this.mwh.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void vt(int i4) throws JSONException {
        if (i4 >= 0) {
            ouw("config_fail_times", String.valueOf(i4));
        }
    }

    public final void ouw(boolean z3) {
        this.tlj = z3;
    }

    public static bly ouw() {
        return ouw.ouw;
    }

    public static Pair<String, Long> vt(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectRa = ra(str);
            if (jSONObjectRa == null) {
                return null;
            }
            return new Pair<>(jSONObjectRa.getString("value"), Long.valueOf(jSONObjectRa.getLong("time")));
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.GlobalInfo", e2.getMessage());
            return null;
        }
    }

    public static boolean fkw(String str) {
        return (TextUtils.isEmpty(str) || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void le(String str) {
        if (!TextUtils.isEmpty(this.rn)) {
            try {
                HashMap map = new HashMap();
                JSONArray jSONArray = new JSONArray(this.rn);
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i4);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("name");
                        if (!TextUtils.isEmpty(strOptString)) {
                            map.put(strOptString, jSONObjectOptJSONObject);
                        }
                    }
                }
                JSONArray jSONArray2 = new JSONArray(str);
                for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i10);
                    if (jSONObjectOptJSONObject2 != null) {
                        String strOptString2 = jSONObjectOptJSONObject2.optString("name");
                        String strOptString3 = jSONObjectOptJSONObject2.optString("value");
                        if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3)) {
                            map.put(strOptString2, jSONObjectOptJSONObject2);
                        }
                    }
                }
                Collection collectionValues = map.values();
                JSONArray jSONArray3 = new JSONArray();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    jSONArray3.put((JSONObject) it.next());
                }
                this.rn = jSONArray3.toString();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ko.fkw("TTAD.GlobalInfo", th2.getMessage());
            }
        } else {
            this.rn = str;
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_file", "extra_data", this.rn);
        }
    }

    public static void ouw(int i4) throws JSONException {
        if (i4 >= 0) {
            ouw("domain_index", String.valueOf(i4));
        }
    }

    private static JSONObject ra(String str) {
        String strVt = com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("sp_global_file", str, null);
        if (TextUtils.isEmpty(strVt)) {
            return null;
        }
        try {
            return new JSONObject(strVt);
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.GlobalInfo", e2.getMessage());
            return null;
        }
    }

    private static String ouw(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (Throwable unused) {
            return "";
        }
    }

    public final void yu(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                com.bytedance.sdk.openadsdk.lh.tlj.ouw(str);
            } else if (this.mwh != null) {
                this.mwh.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    public static void ouw(Integer num, int i4) {
        if (num != null) {
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_privacy", "tt_gdpr", Integer.valueOf(i4));
            com.bytedance.sdk.openadsdk.core.settings.cf.vt().ouw(4, true);
        } else if (com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_privacy", "tt_gdpr", -1) != i4) {
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_privacy", "tt_gdpr", Integer.valueOf(i4));
            com.bytedance.sdk.openadsdk.core.settings.cf.vt().ouw(4, true);
        }
    }

    public final void vt(boolean z3) {
        this.f8049jg = z3;
    }

    public static void ouw(String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", str2);
            jSONObject.put("time", System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.GlobalInfo", e2.getMessage());
        }
    }

    public static String ouw(String str, long j) {
        JSONObject jSONObjectRa;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            jSONObjectRa = ra(str);
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.GlobalInfo", e2.getMessage());
        }
        if (jSONObjectRa == null) {
            return null;
        }
        if (System.currentTimeMillis() - jSONObjectRa.getLong("time") <= j) {
            return jSONObjectRa.getString("value");
        }
        return null;
    }

    public final void ouw(String str, ra.ouw ouwVar) {
        try {
            if (TextUtils.isEmpty(str) || ouwVar == null) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                com.bytedance.sdk.openadsdk.lh.tlj.ouw(str, ouwVar);
                return;
            }
            if (this.mwh == null) {
                synchronized (bly.class) {
                    try {
                        if (this.mwh == null) {
                            this.mwh = new ConcurrentHashMap<>();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (this.mwh != null) {
                this.mwh.put(str, ouwVar);
            }
        } catch (Throwable unused) {
        }
    }

    public final void ouw(final String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 1000) {
            mwh mwhVar = ouw;
            if (mwhVar != null) {
                mwhVar.ouw("Data is very long, the longest is 1000");
            }
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
        }
        if (com.bytedance.sdk.openadsdk.utils.bs.le()) {
            jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.3
                @Override // java.lang.Runnable
                public final void run() {
                    bly.this.le(str);
                }
            });
        } else {
            le(str);
        }
    }
}
