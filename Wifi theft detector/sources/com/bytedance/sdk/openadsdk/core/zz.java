package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.dg.uym;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zz {
    public static sz emc = null;
    private static boolean sz = false;
    public static final Set<String> ypw = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.zz.1
        {
            add("8025677");
            add("5001121");
        }
    };

    /* renamed from: aa, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.sz.xq.xq f9307aa;
    private String bw;
    private boolean cf;

    @NonNull
    private String dg;
    private Integer gbl;

    @Nullable
    private String msw;
    private String qh;
    private Bitmap ru;
    private volatile ConcurrentHashMap<String, uym.emc> sba;
    private int sup;
    private int uym;
    private String vk;
    private boolean xq;

    @NonNull
    private String ycc;
    private int zz;

    public static class emc {
        private static final zz emc = new zz();
    }

    public static int bw() {
        try {
            String strEmc = emc("domain_index", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strEmc)) {
                return 0;
            }
            return Integer.valueOf(strEmc).intValue();
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }

    public static void rie() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            sz = true;
        }
    }

    public static boolean sra() {
        return sz;
    }

    public static int ycc() {
        try {
            String strEmc = emc("config_fail_times", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strEmc)) {
                return 0;
            }
            return Integer.valueOf(strEmc).intValue();
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }

    @NonNull
    public static zz ypw() {
        return emc.emc;
    }

    public boolean aa() {
        return ypw.contains(this.dg);
    }

    public boolean cf() {
        return true;
    }

    @Nullable
    public String dg() {
        if (TextUtils.isEmpty(this.dg)) {
            String strEmc = emc(MBridgeConstans.APP_ID, Long.MAX_VALUE);
            if (!TextUtils.isEmpty(strEmc)) {
                this.dg = strEmc;
            }
        }
        return this.dg;
    }

    public int gbl() {
        return this.sup;
    }

    public String hxp() {
        return com.bytedance.sdk.openadsdk.multipro.ypw.xq() ? com.bytedance.sdk.openadsdk.multipro.dg.dg.ypw("sp_global_file", "adx_id", "") : this.qh;
    }

    @NonNull
    public String msw() {
        if (TextUtils.isEmpty(this.ycc)) {
            this.ycc = emc(aa.emc());
        }
        return this.ycc;
    }

    public com.bytedance.sdk.openadsdk.core.sz.xq.xq qh() {
        if (this.f9307aa == null) {
            this.f9307aa = new com.bytedance.sdk.openadsdk.core.sz.xq.xq(10, 8);
        }
        return this.f9307aa;
    }

    public int ru() {
        Integer num = this.gbl;
        return num != null ? num.intValue() : com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("sp_global_privacy", "tt_gdpr", -1);
    }

    public boolean sba() {
        return "5001121".contains(this.dg);
    }

    public boolean sup() {
        int i10 = this.sup;
        return i10 < -1 || i10 > 1;
    }

    @Nullable
    public String sz() {
        return com.bytedance.sdk.openadsdk.multipro.ypw.xq() ? com.bytedance.sdk.openadsdk.multipro.dg.dg.ypw("sp_global_file", "extra_data", null) : this.msw;
    }

    public String ul() {
        if (!TextUtils.isEmpty(this.vk)) {
            return this.vk;
        }
        String strEmc = com.bytedance.sdk.openadsdk.utils.sup.emc();
        this.vk = strEmc;
        if (!TextUtils.isEmpty(strEmc)) {
            return this.vk;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        com.bytedance.sdk.openadsdk.utils.sup.emc(strValueOf);
        this.vk = strValueOf;
        return strValueOf;
    }

    public String uym() {
        String str = this.bw;
        if (str != null) {
            return str;
        }
        String strEmc = emc("mediation_info", Long.MAX_VALUE);
        this.bw = strEmc;
        if (strEmc == null) {
            this.bw = "";
        }
        return this.bw;
    }

    public Bitmap vk() {
        return com.bytedance.sdk.openadsdk.multipro.ypw.xq() ? com.bytedance.sdk.component.utils.dg.emc(com.bytedance.sdk.openadsdk.multipro.dg.dg.ypw("sp_global_file", "pause_icon", null)) : this.ru;
    }

    public boolean xq() {
        return com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("sp_global_file", "sdk_activate_init", true);
    }

    public void ylm() {
        try {
            if (this.sba == null || this.sba.size() != 0) {
                return;
            }
            this.sba = null;
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public boolean yzg() {
        return "com.union_test.internationad".equals(com.bytedance.sdk.openadsdk.utils.tp.ycc());
    }

    public int zz() {
        return com.bytedance.sdk.openadsdk.multipro.ypw.xq() ? com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("sp_global_icon_id", "icon_id", 0) : this.uym;
    }

    private zz() {
        this.xq = false;
        this.zz = 0;
        this.ru = null;
        this.gbl = null;
        this.sup = -1;
        this.sba = null;
    }

    private static void gbl(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        sz szVar = emc;
        if (szVar != null) {
            szVar.emc(4000, "Data is very long, the longest is 1000");
        }
        com.bytedance.sdk.component.utils.ul.xq("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
    }

    private static JSONObject sup(String str) {
        String strYpw = com.bytedance.sdk.openadsdk.multipro.dg.dg.ypw("sp_global_file", str, null);
        if (TextUtils.isEmpty(strYpw)) {
            return null;
        }
        try {
            return new JSONObject(strYpw);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ul.xq("TTAD.GlobalInfo", e10.getMessage());
            return null;
        }
    }

    public void xq(int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("sp_global_icon_id", "icon_id", Integer.valueOf(i10));
        }
        this.uym = i10;
    }

    public void ypw(boolean z10) {
        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("sp_global_file", "sdk_activate_init", Boolean.valueOf(z10));
    }

    public static void emc(sz szVar) {
        emc = szVar;
    }

    public static void ypw(int i10) throws JSONException {
        if (i10 >= 0) {
            emc("config_fail_times", String.valueOf(i10));
        }
    }

    private static void ru(String str) {
        sz szVar;
        if (TextUtils.isEmpty(str) && (szVar = emc) != null) {
            szVar.emc(4000, "appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.ul.xq("TTAD.GlobalInfo", "appid cannot be empty");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zz(String str) {
        if (!TextUtils.isEmpty(this.msw)) {
            try {
                HashMap map = new HashMap();
                JSONArray jSONArray = new JSONArray(this.msw);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("name");
                        if (!TextUtils.isEmpty(strOptString)) {
                            map.put(strOptString, jSONObjectOptJSONObject);
                        }
                    }
                }
                JSONArray jSONArray2 = new JSONArray(str);
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i11);
                    if (jSONObjectOptJSONObject2 != null) {
                        String strOptString2 = jSONObjectOptJSONObject2.optString("name");
                        String strOptString3 = jSONObjectOptJSONObject2.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
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
                this.msw = jSONArray3.toString();
            } catch (Throwable th) {
                th.getMessage();
            }
        } else {
            this.msw = str;
        }
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("sp_global_file", "extra_data", this.msw);
        }
    }

    public boolean emc() {
        return this.cf;
    }

    public void msw(String str) {
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("sp_global_file", "adx_id", str);
        }
        this.qh = str;
    }

    public void ypw(String str) throws JSONException {
        this.bw = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        emc("mediation_info", str);
    }

    public static boolean uym(String str) {
        return (TextUtils.isEmpty(str) || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    public void bw(int i10) {
        this.sup = i10;
    }

    public void emc(boolean z10) {
        this.cf = z10;
    }

    public void xq(@Nullable final String str) {
        gbl(str);
        if (com.bytedance.sdk.openadsdk.utils.iyl.ycc()) {
            qh.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.3
                @Override // java.lang.Runnable
                public void run() {
                    zz.this.zz(str);
                }
            });
        } else {
            zz(str);
        }
    }

    public void ycc(int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("sp_global_file", "title_bar_theme", Integer.valueOf(i10));
        }
        this.zz = i10;
    }

    public static void emc(int i10) throws JSONException {
        if (i10 >= 0) {
            emc("domain_index", String.valueOf(i10));
        }
    }

    public uym.emc bw(String str) {
        try {
            if (this.sba == null || str == null) {
                return null;
            }
            return this.sba.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void dg(final int i10) {
        if (i10 == 1) {
            i10 = 0;
        } else if (i10 == 0) {
            i10 = 1;
        }
        if (i10 == 0 || i10 == 1 || i10 == -1) {
            final Integer num = this.gbl;
            if (num == null || num.intValue() != i10) {
                this.gbl = Integer.valueOf(i10);
                if (!com.bytedance.sdk.openadsdk.utils.iyl.ycc()) {
                    emc(num, i10);
                } else {
                    qh.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.2
                        @Override // java.lang.Runnable
                        public void run() {
                            zz.this.emc(num, i10);
                        }
                    });
                }
            }
        }
    }

    public void emc(@NonNull String str) throws JSONException {
        ru(str);
        this.dg = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        emc(MBridgeConstans.APP_ID, str);
        com.bytedance.sdk.openadsdk.core.settings.gbl.xq().dg(7);
    }

    public void ycc(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                com.bytedance.sdk.openadsdk.xq.ru.emc(6, str);
            } else if (this.sba != null) {
                this.sba.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    public void xq(boolean z10) {
        this.xq = z10;
    }

    public static Pair<String, Long> dg(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectSup = sup(str);
            if (jSONObjectSup == null) {
                return null;
            }
            return new Pair<>(jSONObjectSup.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE), Long.valueOf(jSONObjectSup.getLong("time")));
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ul.xq("TTAD.GlobalInfo", e10.getMessage());
            return null;
        }
    }

    private String emc(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(Integer num, int i10) {
        if (num != null) {
            com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("sp_global_privacy", "tt_gdpr", Integer.valueOf(i10));
            com.bytedance.sdk.openadsdk.core.settings.gbl.xq().emc(4, true);
        } else if (com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("sp_global_privacy", "tt_gdpr", -1) != i10) {
            com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("sp_global_privacy", "tt_gdpr", Integer.valueOf(i10));
            com.bytedance.sdk.openadsdk.core.settings.gbl.xq().emc(4, true);
        }
    }

    public static void emc(String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str2);
            jSONObject.put("time", System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ul.xq("TTAD.GlobalInfo", e10.getMessage());
        }
    }

    public static String emc(String str, long j10) {
        JSONObject jSONObjectSup;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            jSONObjectSup = sup(str);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ul.xq("TTAD.GlobalInfo", e10.getMessage());
        }
        if (jSONObjectSup == null) {
            return null;
        }
        if (System.currentTimeMillis() - jSONObjectSup.getLong("time") <= j10) {
            return jSONObjectSup.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        }
        return null;
    }

    public void emc(String str, uym.emc emcVar) {
        try {
            if (TextUtils.isEmpty(str) || emcVar == null) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                com.bytedance.sdk.openadsdk.xq.ru.emc(6, str, emcVar);
                return;
            }
            if (this.sba == null) {
                synchronized (zz.class) {
                    try {
                        if (this.sba == null) {
                            this.sba = new ConcurrentHashMap<>();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (this.sba != null) {
                this.sba.put(str, emcVar);
            }
        } catch (Throwable unused) {
        }
    }
}
