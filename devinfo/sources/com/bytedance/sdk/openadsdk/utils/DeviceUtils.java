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
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.bytedance.sdk.openadsdk.core.settings.tlj;
import com.bytedance.sdk.openadsdk.utils.ra;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class DeviceUtils {
    private static int bly = 0;

    /* renamed from: jg, reason: collision with root package name */
    private static int f8684jg = 0;
    private static int ko = 0;
    private static int mwh = 0;
    public static String ouw = "";
    private static int pno;
    private static int rn;
    private static volatile long vt = System.currentTimeMillis();

    /* renamed from: lh, reason: collision with root package name */
    private static volatile boolean f8686lh = false;
    private static volatile boolean yu = false;
    private static volatile boolean fkw = false;

    /* renamed from: le, reason: collision with root package name */
    private static volatile boolean f8685le = true;
    private static long ra = 0;
    private static String tlj = "";

    /* renamed from: cf, reason: collision with root package name */
    private static int f8683cf = 0;
    private static final AtomicBoolean ryl = new AtomicBoolean(false);
    private static AtomicBoolean zih = new AtomicBoolean(false);

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class lh extends com.bytedance.sdk.component.pno.pno {
        public lh() {
            super("gaid_task");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v2, types: [int] */
        /* JADX WARN: Type inference failed for: r3v4 */
        @Override // java.lang.Runnable
        public final void run() {
            ?? r32;
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(com.bytedance.sdk.openadsdk.core.zih.ouw());
                if (advertisingIdInfo != null) {
                    boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                    if (zIsLimitAdTrackingEnabled) {
                        com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().ouw = 1;
                        com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().ouw(2, "lmt");
                    }
                    DeviceUtils.ouw(advertisingIdInfo, zIsLimitAdTrackingEnabled);
                    r32 = zIsLimitAdTrackingEnabled;
                } else {
                    r32 = -1;
                }
                if (r32 != -1) {
                    com.bytedance.sdk.openadsdk.core.lh.ouw();
                    com.bytedance.sdk.openadsdk.core.lh.ouw("limit_ad_track", (int) r32);
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().ouw = 2;
                com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().ouw(false, 3, "", th2);
                com.bytedance.sdk.component.utils.qbp.lh("TTAD.DeviceUtils", th2.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw extends BroadcastReceiver {
        private ouw() {
        }

        public static /* synthetic */ void ouw(Context context) {
            int i4 = Build.VERSION.SDK_INT;
            if (context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                if (i4 >= 33) {
                    context.registerReceiver(new ouw(), intentFilter, 2);
                } else {
                    context.registerReceiver(new ouw(), intentFilter);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || context == null) {
                return;
            }
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                DeviceUtils.tlj(context);
            } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                int unused = DeviceUtils.rn = intent.getIntExtra("state", 0) == 1 ? 1 : 0;
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = DeviceUtils.f8685le = true;
                com.bytedance.sdk.component.utils.ko.lh("TTAD.DeviceUtils", "screen_on");
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = DeviceUtils.f8685le = false;
                com.bytedance.sdk.component.utils.ko.lh("TTAD.DeviceUtils", "screen_off");
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                long unused3 = DeviceUtils.vt = System.currentTimeMillis();
            }
        }
    }

    private static void cf(Context context) {
        if (context == null || !ryl.compareAndSet(false, true)) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.vpp.ouw.ouw("gp_v_enable", 0) == 1) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 0);
                tlj = packageInfo.versionName;
                f8683cf = packageInfo.versionCode;
            }
        } catch (Throwable unused) {
        }
    }

    public static int fkw(Context context) {
        if (!ryl.get()) {
            cf(context);
        }
        return f8683cf;
    }

    public static JSONObject le(Context context) {
        return ouw(context, false);
    }

    public static /* synthetic */ boolean mwh() {
        yu = true;
        return true;
    }

    public static int pno() {
        return bly;
    }

    public static int ra() {
        return mwh;
    }

    private static int rn(Context context) {
        try {
            String str = Build.MANUFACTURER;
            return str.equalsIgnoreCase("XIAOMI") ? Settings.System.getInt(context.getContentResolver(), "POWER_SAVE_MODE_OPEN") == 1 ? 1 : 0 : (str.equalsIgnoreCase("HUAWEI") && Settings.System.getInt(context.getContentResolver(), "SmartModeStatus") == 4) ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static void tlj() throws IOException, ClassNotFoundException {
        com.bytedance.sdk.openadsdk.core.settings.cf.ouw(new tlj.ouw() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.tlj.ouw
            public final void ouw() {
                com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().ouw(true);
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.tlj.ouw
            public final void vt() {
                com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().ouw(true);
            }
        });
        Context contextOuw = com.bytedance.sdk.openadsdk.core.zih.ouw();
        if (contextOuw != null) {
            int iOuw = tlj.ouw();
            com.bytedance.sdk.openadsdk.core.lh.ouw();
            com.bytedance.sdk.openadsdk.core.lh.ouw("cpu_count", iOuw);
            int iOuw2 = tlj.ouw(tlj.ouw());
            com.bytedance.sdk.openadsdk.core.lh.ouw();
            com.bytedance.sdk.openadsdk.core.lh.ouw("cpu_max_frequency", iOuw2);
            int iVt = tlj.vt(tlj.ouw());
            com.bytedance.sdk.openadsdk.core.lh.ouw();
            com.bytedance.sdk.openadsdk.core.lh.ouw("cpu_min_frequency", iVt);
            String strRyl = uoy.ryl();
            if (strRyl != null) {
                com.bytedance.sdk.openadsdk.core.lh.ouw();
                com.bytedance.sdk.openadsdk.core.lh.ouw("total_memory", strRyl);
            }
            long jJg = uoy.jg();
            com.bytedance.sdk.openadsdk.core.lh.ouw();
            com.bytedance.sdk.openadsdk.core.lh.ouw("total_internal_storage", jJg);
            long jOuw = com.bytedance.sdk.component.utils.zih.ouw();
            com.bytedance.sdk.openadsdk.core.lh.ouw();
            com.bytedance.sdk.openadsdk.core.lh.ouw("free_internal_storage", jOuw);
            long jZih = uoy.zih();
            com.bytedance.sdk.openadsdk.core.lh.ouw();
            com.bytedance.sdk.openadsdk.core.lh.ouw("total_sdcard_storage", jZih);
            boolean zTh = uoy.th();
            com.bytedance.sdk.openadsdk.core.lh.ouw();
            com.bytedance.sdk.openadsdk.core.lh.ouw("is_root", zTh ? 1 : 0);
            if (TextUtils.isEmpty(bly())) {
                try {
                    Class.forName("com.unity3d.player.UnityPlayer");
                    ouw = "unity";
                } catch (ClassNotFoundException unused) {
                    ouw = "native";
                }
                com.bytedance.sdk.openadsdk.core.lh.ouw();
                com.bytedance.sdk.openadsdk.core.lh.ouw("framework_name", ouw);
            }
            cf();
            try {
                AudioManager audioManager = (AudioManager) contextOuw.getSystemService("audio");
                bly = audioManager.getStreamMaxVolume(3);
                int streamVolume = audioManager.getStreamVolume(3);
                mwh = streamVolume;
                f8684jg = (int) ((streamVolume / bly) * 100.0d);
            } catch (Throwable unused2) {
            }
            rn = ko(contextOuw);
            pno.ouw(contextOuw);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class AudioInfoReceiver extends BroadcastReceiver {
        static final CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.mwh.pno> ouw = new CopyOnWriteArrayList<>();

        public static void ouw(com.bytedance.sdk.openadsdk.mwh.pno pnoVar) {
            if (pnoVar != null) {
                CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.mwh.pno> copyOnWriteArrayList = ouw;
                if (copyOnWriteArrayList.contains(pnoVar)) {
                    return;
                }
                copyOnWriteArrayList.add(pnoVar);
            }
        }

        public static void vt(com.bytedance.sdk.openadsdk.mwh.pno pnoVar) {
            ouw.remove(pnoVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                        int unused = DeviceUtils.ko = intent.getIntExtra("state", 0);
                    }
                } else if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                    int unused2 = DeviceUtils.mwh = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                    if (!ouw.isEmpty()) {
                        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                Iterator<com.bytedance.sdk.openadsdk.mwh.pno> it = AudioInfoReceiver.ouw.iterator();
                                while (it.hasNext()) {
                                    it.next().vt(DeviceUtils.mwh);
                                }
                            }
                        });
                    }
                    if (DeviceUtils.bly != 0) {
                        int unused3 = DeviceUtils.f8684jg = (int) ((DeviceUtils.mwh / DeviceUtils.bly) * 100.0d);
                    }
                }
            } catch (Exception unused4) {
            }
        }

        public static /* synthetic */ void ouw(Context context) {
            if (DeviceUtils.yu || context == null) {
                return;
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                context.registerReceiver(new AudioInfoReceiver(), intentFilter, null, com.bytedance.sdk.component.utils.bly.ouw());
                DeviceUtils.mwh();
            } catch (Throwable unused) {
            }
        }
    }

    public static String bly() {
        if (TextUtils.isEmpty(ouw)) {
            com.bytedance.sdk.openadsdk.core.lh.ouw();
            ouw = com.bytedance.sdk.openadsdk.core.lh.vt("framework_name", "");
        }
        return ouw;
    }

    private static int jg(Context context) {
        int i4;
        try {
            i4 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } catch (Throwable unused) {
        }
        if (i4 == 32) {
            return 1;
        }
        return i4 == 16 ? 0 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ko(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            String str = Build.MANUFACTURER;
            if (!str.equalsIgnoreCase("XIAOMI") && !str.equalsIgnoreCase("HUAWEI")) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
            }
            return rn(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int le() {
        return pno;
    }

    public static boolean lh(Context context) {
        return (context.getResources().getConfiguration().uiMode & 15) == 4;
    }

    private static int mwh(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static void pno(Context context) {
        Context applicationContext;
        if (fkw || context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            if (Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                final Context applicationContext2 = applicationContext.getApplicationContext();
                if (applicationContext2 != null) {
                    applicationContext.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver(null) { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.3
                        @Override // android.database.ContentObserver
                        public final void onChange(boolean z3) {
                            super.onChange(z3);
                            DeviceUtils.tlj(applicationContext2);
                        }
                    });
                }
            } else {
                ouw.ouw(applicationContext);
            }
            fkw = true;
        } catch (Throwable unused) {
        }
    }

    public static void ra(Context context) {
        AudioInfoReceiver.ouw(context);
    }

    private static int ryl(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.DeviceUtils", th2.getMessage());
            return -1;
        }
    }

    public static boolean vt() {
        if (SystemClock.elapsedRealtime() - ra >= 20000) {
            ra = SystemClock.elapsedRealtime();
            try {
                PowerManager powerManager = (PowerManager) com.bytedance.sdk.openadsdk.core.zih.ouw().getSystemService("power");
                if (powerManager != null) {
                    f8685le = powerManager.isInteractive();
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.lh("TTAD.DeviceUtils", th2.getMessage());
            }
        }
        return f8685le;
    }

    public static String yu(Context context) {
        if (!ryl.get()) {
            cf(context);
        }
        return tlj;
    }

    public static int lh() {
        com.bytedance.sdk.openadsdk.core.lh.ouw();
        return com.bytedance.sdk.openadsdk.core.lh.vt("limit_ad_track", -1);
    }

    public static float fkw() {
        int i4 = -1;
        try {
            Context contextOuw = com.bytedance.sdk.openadsdk.core.zih.ouw();
            if (contextOuw != null) {
                i4 = Settings.System.getInt(contextOuw.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.DeviceUtils", th2.getMessage());
        }
        if (i4 < 0) {
            return -1.0f;
        }
        return Math.round((i4 / 255.0f) * 10.0f) / 10.0f;
    }

    public static void ouw(Context context) {
        if (f8686lh) {
            return;
        }
        try {
            vt vtVar = new vt();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            context.getApplicationContext().registerReceiver(vtVar, intentFilter);
            f8686lh = true;
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static String yu() {
        String languageTag = Locale.getDefault().toLanguageTag();
        return !TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    public static void cf() {
        try {
            int ringerMode = ((AudioManager) com.bytedance.sdk.openadsdk.core.zih.ouw().getSystemService("audio")).getRingerMode();
            if (ringerMode == 2) {
                pno = 1;
            } else if (ringerMode == 1) {
                pno = 2;
            } else {
                pno = 0;
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean vt(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static long ouw() {
        return vt;
    }

    public static JSONObject ouw(Context context, boolean z3) throws JSONException {
        int i4;
        String strCf;
        int i10;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", ryl(context));
            jSONObject.put("model", Build.MODEL);
            com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().ouw(jSONObject);
            if (lh(context)) {
                i4 = 3;
            } else {
                i4 = vt(context) ? 2 : 1;
            }
            jSONObject.put("type", i4);
            jSONObject.put("os", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("conn_type", uoy.yu(context));
            jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.yu.lh());
            jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.yu.vt());
            jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.yu.yu());
            jSONObject.put("screen_scale", osn.ra(context));
            jSONObject.put("density", osn.bly(context));
            jSONObject.put("screen_width", osn.yu(context));
            jSONObject.put("screen_height", osn.le(context));
            jSONObject.put("sec_did", com.bytedance.sdk.openadsdk.core.tlj.lh.le());
            com.bytedance.sdk.openadsdk.core.settings.cf cfVarYu = com.bytedance.sdk.openadsdk.core.zih.yu();
            if (cfVarYu.zin("boot")) {
                jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                jSONObject.put("power_on_time", String.valueOf(SystemClock.elapsedRealtime()));
            }
            jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.ryl.lh(context));
            jSONObject.put("rom_version", tc.ouw());
            jSONObject.put("sys_compiling_time", com.bytedance.sdk.openadsdk.core.ryl.vt(context));
            jSONObject.put("timezone", uoy.jae());
            jSONObject.put("language", com.bytedance.sdk.openadsdk.core.ryl.vt());
            jSONObject.put("carrier_name", jae.ouw());
            if (z3) {
                strCf = uoy.tlj();
            } else {
                strCf = uoy.cf();
            }
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(strCf) * RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE));
            jSONObject.put("locale_language", yu());
            jSONObject.put("screen_bright", Math.ceil(fkw() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", !vt() ? 1 : 0);
            com.bytedance.sdk.openadsdk.core.lh.ouw();
            jSONObject.put("cpu_num", com.bytedance.sdk.openadsdk.core.lh.vt("cpu_count", 0));
            com.bytedance.sdk.openadsdk.core.lh.ouw();
            jSONObject.put("cpu_max_freq", com.bytedance.sdk.openadsdk.core.lh.vt("cpu_max_frequency", 0));
            com.bytedance.sdk.openadsdk.core.lh.ouw();
            jSONObject.put("cpu_min_freq", com.bytedance.sdk.openadsdk.core.lh.vt("cpu_min_frequency", 0));
            ra.ouw ouwVarOuw = ra.ouw();
            jSONObject.put("battery_remaining_pct", (int) ouwVarOuw.vt);
            jSONObject.put("is_charging", ouwVarOuw.ouw);
            jSONObject.put("total_space", String.valueOf(uoy.mwh()));
            jSONObject.put("free_space_in", String.valueOf(uoy.ko()));
            jSONObject.put("sdcard_size", String.valueOf(uoy.rn()));
            jSONObject.put("rooted", uoy.vm());
            AccessibilityManager accessibilityManager = (AccessibilityManager) com.bytedance.sdk.openadsdk.core.zih.ouw().getSystemService("accessibility");
            if (accessibilityManager == null) {
                i10 = -1;
            } else {
                i10 = accessibilityManager.isEnabled() ? 1 : 0;
            }
            jSONObject.put("enable_assisted_clicking", i10);
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.vpp.ouw(context, "tt_choose_language"));
            jSONObject.put("airplane", mwh(context));
            jSONObject.put("darkmode", jg(context));
            jSONObject.put("headset", ko);
            jSONObject.put("ringmute", pno);
            jSONObject.put("screenscale", context.getResources().getDisplayMetrics().density);
            jSONObject.put("volume", f8684jg);
            jSONObject.put("low_power_mode", rn);
            jSONObject.put("enable_draw_feed", uoy.fvf());
            if (z3) {
                pno.ouw(jSONObject, context);
                jSONObject.put("gp_v_name", yu(context));
                jSONObject.put("gp_v_code", fkw(context));
            }
            if (cfVarYu.zin("mnc")) {
                jSONObject.put("mnc", jae.lh());
            }
            if (cfVarYu.zin("mcc")) {
                jSONObject.put("mcc", jae.vt());
            }
            jSONObject.put("act", com.bytedance.sdk.openadsdk.core.ouw.ouw.vt(context));
            jSONObject.put("act_event", com.bytedance.sdk.openadsdk.core.ouw.ouw.ouw());
            String strLh = com.bytedance.sdk.openadsdk.core.tlj.lh.lh();
            com.bytedance.sdk.component.utils.ko.lh("tmp", "getEnvcodeForBidding:", Long.valueOf(com.bytedance.sdk.openadsdk.core.tlj.lh.yu()));
            if (!TextUtils.isEmpty(strLh)) {
                jSONObject.put("sof_chara", strLh);
            }
            String strVt = com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            if (!strVt.isEmpty()) {
                jSONObject.put("ipv6", strVt);
            }
            jSONObject.put("is_multi", com.bytedance.sdk.openadsdk.multipro.vt.lh());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static /* synthetic */ void tlj(Context context) {
        if (context != null) {
            final Context applicationContext = context.getApplicationContext();
            bs.vt(new com.bytedance.sdk.component.pno.pno("DeviceUtils_get_low_power_mode") { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.2
                @Override // java.lang.Runnable
                public final void run() {
                    int unused = DeviceUtils.rn = DeviceUtils.ko(applicationContext);
                }
            });
        }
    }

    public static /* synthetic */ void ouw(AdvertisingIdClient.Info info, boolean z3) {
        com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw();
        if (!com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.lh()) {
            com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().ouw(1, "not in privacy fields allowed");
            return;
        }
        if (z3) {
            return;
        }
        com.bytedance.sdk.component.utils.ko.vt("TTAD.DeviceUtils", "The gaid is updated only once during a cold start.");
        String id2 = info.getId();
        String strVt = com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().vt();
        if (!TextUtils.isEmpty(id2)) {
            com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().vt = id2;
            com.bytedance.sdk.openadsdk.core.tlj.lh.ouw(id2);
            com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().ouw(true, 0, "", null);
        } else {
            com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().ouw(4, "empty gaid");
        }
        if (strVt.equals(id2)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.ryl.ouw();
    }
}
