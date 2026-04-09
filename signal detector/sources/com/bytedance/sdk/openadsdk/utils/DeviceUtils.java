package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.sdk.openadsdk.core.settings.ru;
import com.bytedance.sdk.openadsdk.utils.uym;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DeviceUtils {
    private static int cf = 0;
    public static String emc = "";
    private static int msw;
    private static int qh;
    private static int sz;
    private static int vk;
    private static int zz;
    private static volatile long ypw = System.currentTimeMillis();
    private static volatile boolean xq = false;
    private static volatile boolean dg = false;
    private static volatile boolean bw = false;
    private static volatile boolean ycc = true;
    private static long uym = 0;
    private static String ru = "";
    private static int gbl = 0;
    private static final AtomicBoolean sup = new AtomicBoolean(false);
    private static AtomicBoolean aa = new AtomicBoolean(false);

    public static class AudioInfoReceiver extends BroadcastReceiver {
        static final CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.sz.msw> emc = new CopyOnWriteArrayList<>();

        /* JADX INFO: Access modifiers changed from: private */
        public static void ypw(Context context) {
            if (DeviceUtils.dg || context == null) {
                return;
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                context.registerReceiver(new AudioInfoReceiver(), intentFilter, null, com.bytedance.sdk.component.utils.zz.emc());
                boolean unused = DeviceUtils.dg = true;
            } catch (Throwable unused2) {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                        int unused = DeviceUtils.cf = intent.getIntExtra("state", 0);
                    }
                } else if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                    int unused2 = DeviceUtils.sz = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                    if (!emc.isEmpty()) {
                        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Iterator<com.bytedance.sdk.openadsdk.sz.msw> it = AudioInfoReceiver.emc.iterator();
                                while (it.hasNext()) {
                                    it.next().ypw(DeviceUtils.sz);
                                }
                            }
                        });
                    }
                    if (DeviceUtils.zz != 0) {
                        int unused3 = DeviceUtils.qh = (int) ((DeviceUtils.sz / DeviceUtils.zz) * 100.0d);
                    }
                }
            } catch (Exception unused4) {
            }
        }

        public static void emc(com.bytedance.sdk.openadsdk.sz.msw mswVar) {
            if (mswVar != null) {
                CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.sz.msw> copyOnWriteArrayList = emc;
                if (copyOnWriteArrayList.contains(mswVar)) {
                    return;
                }
                copyOnWriteArrayList.add(mswVar);
            }
        }

        public static void ypw(com.bytedance.sdk.openadsdk.sz.msw mswVar) {
            if (mswVar == null) {
                return;
            }
            emc.remove(mswVar);
        }
    }

    public static class emc extends BroadcastReceiver {
        private emc() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void ypw(Context context) {
            int i = Build.VERSION.SDK_INT;
            if (context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                if (i >= 33) {
                    context.registerReceiver(new emc(), intentFilter, 2);
                } else {
                    context.registerReceiver(new emc(), intentFilter);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || context == null) {
                return;
            }
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                DeviceUtils.ylm(context);
            } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                int unused = DeviceUtils.vk = intent.getIntExtra("state", 0) == 1 ? 1 : 0;
            }
        }
    }

    public static class ypw extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = DeviceUtils.ycc = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = DeviceUtils.ycc = false;
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                long unused3 = DeviceUtils.ypw = System.currentTimeMillis();
            }
        }
    }

    private static int aa(Context context) {
        return cf;
    }

    public static String bw(Context context) {
        if (!sup.get()) {
            cf(context);
        }
        return ru;
    }

    public static void gbl() throws IOException, ClassNotFoundException {
        com.bytedance.sdk.openadsdk.core.settings.gbl.emc(new ru.emc() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.ru.emc
            public void emc() {
                com.bytedance.sdk.openadsdk.ul.emc.ypw.emc.emc().emc(true);
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.ru.emc
            public void ypw() {
                com.bytedance.sdk.openadsdk.ul.emc.ypw.emc.emc().emc(true);
            }
        });
        Context contextEmc = com.bytedance.sdk.openadsdk.core.aa.emc();
        if (contextEmc != null) {
            com.bytedance.sdk.openadsdk.core.xq.emc().emc("cpu_count", ru.emc());
            com.bytedance.sdk.openadsdk.core.xq.emc().emc("cpu_max_frequency", ru.emc(ru.emc()));
            com.bytedance.sdk.openadsdk.core.xq.emc().emc("cpu_min_frequency", ru.ypw(ru.emc()));
            String strGbl = tp.gbl();
            if (strGbl != null) {
                com.bytedance.sdk.openadsdk.core.xq.emc().emc("total_memory", strGbl);
            }
            com.bytedance.sdk.openadsdk.core.xq.emc().emc("total_internal_storage", tp.sup());
            com.bytedance.sdk.openadsdk.core.xq.emc().emc("free_internal_storage", com.bytedance.sdk.component.utils.aa.emc());
            com.bytedance.sdk.openadsdk.core.xq.emc().emc("total_sdcard_storage", tp.cf());
            com.bytedance.sdk.openadsdk.core.xq.emc().emc("is_root", tp.aa() ? 1 : 0);
            if (TextUtils.isEmpty(ru())) {
                try {
                    Class.forName("com.unity3d.player.UnityPlayer");
                    emc = "unity";
                } catch (ClassNotFoundException unused) {
                    emc = "native";
                }
                com.bytedance.sdk.openadsdk.core.xq.emc().emc("framework_name", emc);
            }
            sup();
            ul(contextEmc);
            vk = sra(contextEmc);
            msw.emc(contextEmc);
        }
    }

    private static void hxp(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver(null) { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.3
            @Override // android.database.ContentObserver
            public void onChange(boolean z6) {
                super.onChange(z6);
                DeviceUtils.ylm(applicationContext);
            }
        });
    }

    public static int msw(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("TTAD.DeviceUtils", th.getMessage());
            return -1;
        }
    }

    private static int rie(Context context) {
        try {
            String str = Build.MANUFACTURER;
            return str.equalsIgnoreCase("XIAOMI") ? Settings.System.getInt(context.getContentResolver(), "POWER_SAVE_MODE_OPEN") == 1 ? 1 : 0 : (str.equalsIgnoreCase("HUAWEI") && Settings.System.getInt(context.getContentResolver(), "SmartModeStatus") == 4) ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int ru(Context context) {
        return msw;
    }

    private static float sba(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int sra(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            String str = Build.MANUFACTURER;
            if (!str.equalsIgnoreCase("XIAOMI") && !str.equalsIgnoreCase("HUAWEI")) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
            }
            return rie(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static void sup() {
        try {
            int ringerMode = ((AudioManager) com.bytedance.sdk.openadsdk.core.aa.emc().getSystemService("audio")).getRingerMode();
            if (ringerMode == 2) {
                msw = 1;
            } else if (ringerMode == 1) {
                msw = 2;
            } else {
                msw = 0;
            }
        } catch (Throwable unused) {
        }
    }

    private static void ul(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            zz = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            sz = streamVolume;
            qh = (int) ((streamVolume / zz) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    public static JSONObject uym(Context context) {
        return emc(context, false);
    }

    private static int vk(Context context) {
        int i;
        try {
            i = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } catch (Throwable unused) {
        }
        if (i == 32) {
            return 1;
        }
        return i == 16 ? 0 : -1;
    }

    public static int ycc(Context context) {
        if (!sup.get()) {
            cf(context);
        }
        return gbl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ylm(Context context) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        iyl.ypw(new com.bytedance.sdk.component.msw.msw("DeviceUtils_get_low_power_mode") { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.2
            @Override // java.lang.Runnable
            public void run() {
                int unused = DeviceUtils.vk = DeviceUtils.sra(applicationContext);
            }
        });
    }

    private static int yzg(Context context) {
        return vk;
    }

    public static int zz(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static void cf(Context context) {
        if (context == null || !sup.compareAndSet(false, true)) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.sra.emc.emc("gp_v_enable", 0) == 1) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 0);
                ru = packageInfo.versionName;
                gbl = packageInfo.versionCode;
            }
        } catch (Throwable unused) {
        }
    }

    public static int dg(Context context) {
        if (xq(context)) {
            return 3;
        }
        return ypw(context) ? 2 : 1;
    }

    public static String ru() {
        if (TextUtils.isEmpty(emc)) {
            emc = com.bytedance.sdk.openadsdk.core.xq.emc().ypw("framework_name", "");
        }
        return emc;
    }

    public static int uym() {
        return sz;
    }

    public static boolean xq(Context context) {
        return (context.getResources().getConfiguration().uiMode & 15) == 4;
    }

    public static int zz() {
        return zz;
    }

    public static int msw() {
        return qh;
    }

    public static int xq() {
        return com.bytedance.sdk.openadsdk.core.xq.emc().ypw("limit_ad_track", -1);
    }

    public static boolean ypw() {
        if (SystemClock.elapsedRealtime() - uym >= 20000) {
            uym = SystemClock.elapsedRealtime();
            try {
                PowerManager powerManager = (PowerManager) com.bytedance.sdk.openadsdk.core.aa.emc().getSystemService("power");
                if (powerManager != null) {
                    ycc = powerManager.isInteractive();
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ul.xq("TTAD.DeviceUtils", th.getMessage());
            }
        }
        return ycc;
    }

    public static float bw() {
        int i = -1;
        try {
            Context contextEmc = com.bytedance.sdk.openadsdk.core.aa.emc();
            if (contextEmc != null) {
                i = Settings.System.getInt(contextEmc.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("TTAD.DeviceUtils", th.getMessage());
        }
        if (i < 0) {
            return -1.0f;
        }
        return Math.round((i / 255.0f) * 10.0f) / 10.0f;
    }

    public static String dg() {
        String languageTag = Locale.getDefault().toLanguageTag();
        return !TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    public static void emc(Context context) {
        if (xq) {
            return;
        }
        try {
            ypw ypwVar = new ypw();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            context.getApplicationContext().registerReceiver(ypwVar, intentFilter);
            xq = true;
        } catch (Throwable unused) {
        }
    }

    public static int ycc() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) com.bytedance.sdk.openadsdk.core.aa.emc().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    public static void sup(Context context) {
        Context applicationContext;
        if (bw || context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            if (!Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                emc.ypw(applicationContext);
            } else {
                hxp(applicationContext);
            }
            bw = true;
        } catch (Throwable unused) {
        }
    }

    public static boolean ypw(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    private static void ypw(JSONObject jSONObject) throws JSONException {
        jSONObject.put("model", Build.MODEL);
        com.bytedance.sdk.openadsdk.ul.emc.ypw.emc.emc().emc(jSONObject);
    }

    public static long emc() {
        return ypw;
    }

    private static void emc(JSONObject jSONObject) throws JSONException {
        ypw(jSONObject);
    }

    public static JSONObject emc(Context context, boolean z6) throws JSONException {
        String strRu;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", msw(context));
            emc(jSONObject);
            jSONObject.put("type", dg(context));
            jSONObject.put("os", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("conn_type", tp.msw(context));
            jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.dg.xq());
            jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.dg.ypw());
            jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.dg.dg());
            jSONObject.put("screen_scale", vw.ycc(context));
            jSONObject.put("density", vw.msw(context));
            jSONObject.put("screen_width", vw.xq(context));
            jSONObject.put("screen_height", vw.bw(context));
            jSONObject.put("sec_did", com.bytedance.sdk.openadsdk.core.ru.xq.ycc());
            com.bytedance.sdk.openadsdk.core.settings.gbl gblVarDg = com.bytedance.sdk.openadsdk.core.aa.dg();
            if (gblVarDg.sb("boot")) {
                jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                jSONObject.put("power_on_time", String.valueOf(SystemClock.elapsedRealtime()));
            }
            jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.sup.xq(context));
            jSONObject.put("rom_version", sb.emc());
            jSONObject.put("sys_compiling_time", com.bytedance.sdk.openadsdk.core.sup.ypw(context));
            jSONObject.put("timezone", tp.db());
            jSONObject.put("language", com.bytedance.sdk.openadsdk.core.sup.ypw());
            jSONObject.put("carrier_name", dr.emc());
            if (z6) {
                strRu = tp.emc(context);
            } else {
                strRu = tp.ru();
            }
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(strRu) * 1024));
            jSONObject.put("locale_language", dg());
            jSONObject.put("screen_bright", Math.ceil(bw() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", 1 ^ (ypw() ? 1 : 0));
            jSONObject.put("cpu_num", ru.ypw());
            jSONObject.put("cpu_max_freq", ru.xq());
            jSONObject.put("cpu_min_freq", ru.dg());
            uym.emc emcVarEmc = uym.emc();
            jSONObject.put("battery_remaining_pct", (int) emcVarEmc.ypw);
            jSONObject.put("is_charging", emcVarEmc.emc);
            jSONObject.put("total_space", String.valueOf(tp.ypw(context)));
            jSONObject.put("free_space_in", String.valueOf(tp.sz()));
            jSONObject.put("sdcard_size", String.valueOf(tp.qh()));
            jSONObject.put("rooted", tp.vk());
            jSONObject.put("enable_assisted_clicking", ycc());
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.rie.emc(context, "tt_choose_language"));
            jSONObject.put("airplane", zz(context));
            jSONObject.put("darkmode", vk(context));
            jSONObject.put("headset", aa(context));
            jSONObject.put("ringmute", ru(context));
            jSONObject.put("screenscale", sba(context));
            jSONObject.put("volume", msw());
            jSONObject.put("low_power_mode", yzg(context));
            jSONObject.put("enable_draw_feed", tp.xmt());
            if (z6) {
                msw.emc(jSONObject, context);
                jSONObject.put("gp_v_name", bw(context));
                jSONObject.put("gp_v_code", ycc(context));
            }
            if (gblVarDg.sb("mnc")) {
                jSONObject.put("mnc", dr.xq());
            }
            if (gblVarDg.sb("mcc")) {
                jSONObject.put("mcc", dr.ypw());
            }
            jSONObject.put("act", com.bytedance.sdk.openadsdk.core.emc.emc.ypw(context));
            jSONObject.put("act_event", com.bytedance.sdk.openadsdk.core.emc.emc.emc());
            String strXq = com.bytedance.sdk.openadsdk.core.ru.xq.xq();
            com.bytedance.sdk.openadsdk.core.ru.xq.dg();
            if (!TextUtils.isEmpty(strXq)) {
                jSONObject.put("sof_chara", strXq);
            }
            String strYpw = com.bytedance.sdk.openadsdk.multipro.dg.dg.ypw("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            if (!strYpw.isEmpty()) {
                jSONObject.put("ipv6", strYpw);
            }
            jSONObject.put("is_multi", com.bytedance.sdk.openadsdk.multipro.ypw.xq());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static void gbl(Context context) {
        AudioInfoReceiver.ypw(context);
    }
}
