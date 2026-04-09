package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.app.ApplicationStartInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.applovin.impl.c4;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.k7;
import com.applovin.impl.m7;
import com.applovin.impl.n7;
import com.applovin.impl.n8;
import com.applovin.impl.o0;
import com.applovin.impl.o5;
import com.applovin.impl.p0;
import com.applovin.impl.q0;
import com.applovin.impl.r0;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.u4;
import com.applovin.impl.v;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class l {
    private static String j;

    /* renamed from: k, reason: collision with root package name */
    private static String f5575k;

    /* renamed from: l, reason: collision with root package name */
    private static final AtomicReference f5576l = new AtomicReference();

    /* renamed from: m, reason: collision with root package name */
    private static final AtomicReference f5577m = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    private final k f5578a;

    /* renamed from: b, reason: collision with root package name */
    private final o f5579b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f5580c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f5581d;

    /* renamed from: f, reason: collision with root package name */
    private final Map f5583f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5584h;

    /* renamed from: e, reason: collision with root package name */
    private final Object f5582e = new Object();
    private final Object g = new Object();

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference f5585i = new AtomicReference();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements o5.a {
        public a() {
        }

        @Override // com.applovin.impl.o5.a
        public void a(v.a aVar) {
            l.f5576l.set(aVar);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f5587a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5588b;

        public b(String str, int i4) {
            this.f5587a = str;
            this.f5588b = i4;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f5589a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f5590b = -1;

        /* renamed from: c, reason: collision with root package name */
        public Boolean f5591c = null;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface d {
        String a(ContentResolver contentResolver, String str);
    }

    public l(k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f5578a = kVar;
        this.f5579b = kVar.O();
        this.f5580c = k.o();
        this.f5581d = D();
        this.f5583f = C();
    }

    private String B() {
        AudioManager audioManager = (AudioManager) this.f5580c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (o0.e()) {
            for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                sb2.append(audioDeviceInfo.getType());
                sb2.append(",");
            }
        } else {
            if (audioManager.isWiredHeadsetOn()) {
                sb2.append("3,");
            }
            if (audioManager.isBluetoothScoOn()) {
                sb2.append("7,");
            }
            if (audioManager.isBluetoothA2dpOn()) {
                sb2.append(8);
            }
        }
        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        String string = sb2.toString();
        if (TextUtils.isEmpty(string) && o.a()) {
            this.f5579b.a("DataCollector", "No sound outputs detected");
        }
        return string;
    }

    private Map C() {
        HashMap map = new HashMap();
        PackageManager packageManager = this.f5580c.getPackageManager();
        ApplicationInfo applicationInfo = this.f5580c.getApplicationInfo();
        long jLastModified = new File(applicationInfo.sourceDir).lastModified();
        int i4 = o0.h() ? 134238224 : 20560;
        PackageInfo packageInfoA = n7.a(this.f5580c, 0);
        PackageInfo packageInfoA2 = n7.a(this.f5580c, i4);
        String strA = a(applicationInfo.packageName, packageManager, this.f5578a);
        String strA2 = a(applicationInfo.packageName, packageManager);
        map.put("app_name", packageManager.getApplicationLabel(applicationInfo));
        map.put("app_version", packageInfoA != null ? packageInfoA.versionName : "");
        map.put("app_version_code", Integer.valueOf(packageInfoA != null ? packageInfoA.versionCode : -1));
        map.put("installer_name", StringUtils.emptyIfNull(strA));
        map.put("originating_name", StringUtils.emptyIfNull(strA2));
        map.put("tg", m7.a(this.f5578a));
        map.put("debug", Boolean.valueOf(n7.c(this.f5578a)));
        map.put("ia", Long.valueOf(jLastModified));
        map.put("alts_ms", Long.valueOf(k.n()));
        map.put("session_id", this.f5578a.m0().getSessionId());
        map.put("j8", Boolean.valueOf(k.F0()));
        map.put("app_info_flags", Integer.valueOf(applicationInfo.flags));
        map.put("last_update_ms", Long.valueOf(packageInfoA != null ? packageInfoA.lastUpdateTime : 0L));
        List listD = d(packageInfoA2);
        if (!CollectionUtils.isEmpty(listD)) {
            map.put("signing_info", listD);
        }
        List listA = a(packageInfoA2);
        if (!CollectionUtils.isEmpty(listA)) {
            map.put("instrumentation", listA);
        }
        if (o0.d()) {
            map.put("install_location", Integer.valueOf(packageInfoA != null ? packageInfoA.installLocation : 0));
            map.put("split_names", packageInfoA != null ? packageInfoA.splitNames : Collections.EMPTY_LIST);
        }
        if (((Boolean) this.f5578a.a(x4.L4)).booleanValue()) {
            Map mapC = c(packageInfoA2);
            if (CollectionUtils.isEmpty(mapC)) {
                map.put("req_p", mapC);
            }
            List listB = b(packageInfoA2);
            if (CollectionUtils.isEmpty(listB)) {
                map.put("req_f", listB);
            }
        }
        k kVar = this.f5578a;
        z4 z4Var = z4.f6315h;
        Long l10 = (Long) kVar.a(z4Var);
        if (l10 != null) {
            map.put("ia_v2", l10);
        } else {
            this.f5578a.b(z4Var, Long.valueOf(jLastModified));
        }
        map.put("sdk_version", AppLovinSdk.VERSION);
        map.put("omid_sdk_version", this.f5578a.e0().c());
        CollectionUtils.putStringIfValid("ad_review_sdk_version", com.applovin.impl.j.b(), map);
        map.put("api_did", this.f5578a.a(x4.f6028f));
        map.put("first_install_v3_ms", packageInfoA != null ? Long.valueOf(packageInfoA.firstInstallTime) : "");
        CollectionUtils.putLongIfValid("last_launch_ms", this.f5578a.L(), map);
        CollectionUtils.putLongIfValid("app_launch_count", Long.valueOf(this.f5578a.M()), map);
        map.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        if (o0.f()) {
            map.put("min_sdk", Integer.valueOf(applicationInfo.minSdkVersion));
        }
        if (this.f5578a.H0()) {
            map.put("unity_version", n7.a(this.f5578a.n0()));
        }
        List listI = i();
        if (!CollectionUtils.isEmpty(listI)) {
            map.put("application_start_info", listI);
        }
        List listG = g();
        if (!CollectionUtils.isEmpty(listG)) {
            map.put("application_exit_info", listG);
        }
        if (o0.g()) {
            map.put("instant_app", Boolean.valueOf(packageManager.isInstantApp()));
        }
        return map;
    }

    private Map D() {
        HashMap map = new HashMap(35);
        map.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        map.put("brand", Build.MANUFACTURER);
        map.put("brand_name", Build.BRAND);
        map.put("hardware", Build.HARDWARE);
        map.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        map.put("aida", Boolean.valueOf(com.applovin.impl.v.a()));
        map.put("locale", Locale.getDefault().toString());
        map.put("model", Build.MODEL);
        map.put("os", Build.VERSION.RELEASE);
        map.put("platform", A());
        map.put("revision", Build.DEVICE);
        map.put("tz_offset", Double.valueOf(E()));
        map.put("gy", Boolean.valueOf(u()));
        map.put("country_code", n());
        map.put("mcc", y());
        map.put("mnc", z());
        map.put("carrier", l());
        map.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f5580c)));
        map.put("pc", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        map.put("hdr", T());
        map.put("supported_abis", O());
        map.put("type", Build.TYPE);
        map.put(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT);
        DisplayMetrics displayMetrics = this.f5580c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            map.put("adns", Float.valueOf(displayMetrics.density));
            map.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            map.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            map.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            o0.b bVarA = o0.a(this.f5580c, this.f5578a);
            if (bVarA != null) {
                map.put("tl_cr", Integer.valueOf(bVarA.c()));
                map.put("tr_cr", Integer.valueOf(bVarA.d()));
                map.put("bl_cr", Integer.valueOf(bVarA.a()));
                map.put("br_cr", Integer.valueOf(bVarA.b()));
            }
        }
        map.put("bt_ms", Long.valueOf(k()));
        map.put("tbalsi_ms", Long.valueOf(this.f5578a.K() - k.n()));
        CollectionUtils.putStringIfValid("process_name", n7.c(this.f5580c), map);
        CollectionUtils.putBooleanIfValid("is_main_process", n7.i(this.f5580c), map);
        try {
            PackageInfo packageInfo = this.f5580c.getPackageManager().getPackageInfo("com.android.vending", 0);
            map.put("ps_version", packageInfo.versionName);
            map.put("ps_version_code", Integer.valueOf(packageInfo.versionCode));
        } catch (Throwable unused) {
            map.put("ps_version", "");
            map.put("ps_version_code", -1);
        }
        CollectionUtils.putBooleanIfValid("play_store_disabled", k7.a(this.f5580c), map);
        a(map);
        return map;
    }

    private double E() {
        return Math.round((TimeZone.getDefault().getOffset(new Date().getTime()) * 10.0d) / 3600000.0d) / 10.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONArray F() {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.l.F():org.json.JSONArray");
    }

    public static String J() {
        return f5575k;
    }

    private Map L() {
        return n7.a(a((Map) null, true, false));
    }

    private JSONArray O() {
        if (o0.d()) {
            return CollectionUtils.toJSONArray(Build.SUPPORTED_ABIS);
        }
        JSONArray jSONArray = new JSONArray();
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI);
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI2);
        return jSONArray;
    }

    private boolean P() {
        try {
            if (!b()) {
                if (!c()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private Boolean Q() {
        if (o0.i()) {
            return null;
        }
        return Boolean.valueOf(!CollectionUtils.isEmpty(n7.a("/proc/net/tcp", Collections.singletonList(":69A2"), this.f5578a)));
    }

    private boolean R() {
        ConnectivityManager connectivityManager;
        if (o0.f() && (connectivityManager = (ConnectivityManager) this.f5580c.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getRestrictBackgroundStatus() == 3;
            } catch (Throwable th2) {
                this.f5578a.O();
                if (o.a()) {
                    this.f5578a.O().a("DataCollector", "Unable to collect constrained network info.", th2);
                }
            }
        }
        return false;
    }

    private boolean S() {
        boolean z3 = this.f5580c.getResources().getConfiguration().keyboard == 2;
        PackageManager packageManager = this.f5580c.getPackageManager();
        return z3 && (packageManager.hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE") || packageManager.hasSystemFeature("android.hardware.type.pc"));
    }

    private Boolean T() {
        if (o0.g()) {
            return Boolean.valueOf(this.f5580c.getResources().getConfiguration().isScreenHdr());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V() {
        this.f5585i.set(s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W() {
        Map mapY = Y();
        List listX = X();
        synchronized (this.g) {
            if (mapY != null) {
                try {
                    this.f5583f.putAll(mapY);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (listX != null) {
                this.f5583f.put("dl", listX);
            }
        }
    }

    private List X() {
        List listC = this.f5578a.c(x4.H4);
        if (CollectionUtils.isEmpty(listC)) {
            return null;
        }
        return n7.a("/proc/self/maps", listC, this.f5578a);
    }

    private Map Y() {
        boolean z3;
        int i4;
        Throwable th2;
        if (!((Boolean) this.f5578a.a(x4.G4)).booleanValue()) {
            return null;
        }
        HashMap map = new HashMap();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            z3 = false;
            i4 = 0;
            while (it.hasNext()) {
                try {
                    for (StackTraceElement stackTraceElement : it.next().getValue()) {
                        String string = stackTraceElement.toString();
                        if (!z3 && string.contains("de.robv.android.xposed")) {
                            z3 = true;
                        }
                        if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                            i4++;
                        }
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    this.f5578a.D().b("DataCollector", "collectHookingSignals", th2);
                    map.put("xpd", Boolean.valueOf(z3));
                    map.put("zi_count", Integer.valueOf(i4));
                    CollectionUtils.putBooleanIfValid("fpd", Q(), map);
                    return map;
                }
            }
        } catch (Throwable th4) {
            z3 = false;
            i4 = 0;
            th2 = th4;
        }
        map.put("xpd", Boolean.valueOf(z3));
        map.put("zi_count", Integer.valueOf(i4));
        CollectionUtils.putBooleanIfValid("fpd", Q(), map);
        return map;
    }

    private void a0() {
        this.f5578a.q0().a((i5) new r6(this.f5578a, "collectPostInitAppInfo", new y(this, 0)), d6.b.OTHER);
    }

    private List g() {
        ActivityManager activityManager;
        if (!o0.b()) {
            return null;
        }
        Integer num = (Integer) this.f5578a.a(x4.A4);
        if (num.intValue() < 0 || (activityManager = (ActivityManager) this.f5580c.getSystemService("activity")) == null) {
            return null;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(((Boolean) this.f5578a.a(x4.B4)).booleanValue() ? this.f5580c.getPackageName() : null, 0, num.intValue());
        if (CollectionUtils.isEmpty(historicalProcessExitReasons)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons.size());
        Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoC = a0.x.c(it.next());
            HashMap map = new HashMap(13);
            int reason = applicationExitInfoC.getReason();
            map.put("reason", Integer.valueOf(reason));
            String description = applicationExitInfoC.getDescription();
            CollectionUtils.putStringIfValid("description", description, map);
            map.put("timestamp", Long.valueOf(applicationExitInfoC.getTimestamp()));
            map.put("status", Integer.valueOf(applicationExitInfoC.getStatus()));
            map.put("importance", Integer.valueOf(applicationExitInfoC.getImportance()));
            map.put("pss", Long.valueOf(applicationExitInfoC.getPss()));
            map.put("rss", Long.valueOf(applicationExitInfoC.getRss()));
            CollectionUtils.putStringIfValid("process_name", applicationExitInfoC.getProcessName(), map);
            map.put("pid", Integer.valueOf(applicationExitInfoC.getPid()));
            map.put("ruid", Integer.valueOf(applicationExitInfoC.getRealUid()));
            map.put("puid", Integer.valueOf(applicationExitInfoC.getPackageUid()));
            map.put("duid", Integer.valueOf(applicationExitInfoC.getDefiningUid()));
            String strA = a(applicationExitInfoC, reason);
            if (StringUtils.isValidString(strA)) {
                map.put("stack_trace", strA);
                b(strA, reason, description);
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    private String h() {
        int orientation = AppLovinSdkUtils.getOrientation(this.f5580c);
        return orientation == 1 ? "portrait" : orientation == 2 ? "landscape" : "none";
    }

    private List i() {
        ActivityManager activityManager;
        if (!o0.c()) {
            return null;
        }
        Integer num = (Integer) this.f5578a.a(x4.f6189z4);
        if (num.intValue() < 0 || (activityManager = (ActivityManager) this.f5580c.getSystemService("activity")) == null) {
            return null;
        }
        List<ApplicationStartInfo> historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(num.intValue());
        if (CollectionUtils.isEmpty(historicalProcessStartReasons)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(historicalProcessStartReasons.size());
        for (ApplicationStartInfo applicationStartInfo : historicalProcessStartReasons) {
            HashMap map = new HashMap(11);
            map.put("reason", Integer.valueOf(applicationStartInfo.getReason()));
            map.put("startup_state", Integer.valueOf(applicationStartInfo.getStartupState()));
            map.put("start_type", Integer.valueOf(applicationStartInfo.getStartType()));
            map.put("was_force_stopped", Boolean.valueOf(applicationStartInfo.wasForceStopped()));
            map.put("startup_timestamps", applicationStartInfo.getStartupTimestamps());
            CollectionUtils.putStringIfValid("process_name", applicationStartInfo.getProcessName(), map);
            map.put("pid", Integer.valueOf(applicationStartInfo.getPid()));
            map.put("ruid", Integer.valueOf(applicationStartInfo.getRealUid()));
            map.put("puid", Integer.valueOf(applicationStartInfo.getPackageUid()));
            map.put("duid", Integer.valueOf(applicationStartInfo.getDefiningUid()));
            map.put("launch_mode", Integer.valueOf(applicationStartInfo.getLaunchMode()));
            map.put("intent", a(applicationStartInfo.getIntent()));
            arrayList.add(map);
        }
        return arrayList;
    }

    private c j() {
        c cVar = new c();
        Intent intentRegisterReceiver = this.f5580c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : -1;
        int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            cVar.f5590b = -1;
        } else {
            cVar.f5590b = (int) ((intExtra / intExtra2) * 100.0f);
        }
        cVar.f5589a = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        cVar.f5591c = Boolean.valueOf(Settings.Global.getInt(this.f5580c.getContentResolver(), "stay_on_while_plugged_in", -1) > 0);
        return cVar;
    }

    private long k() {
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        Long l10 = (Long) this.f5578a.a(x4.F4);
        return l10.longValue() * (jCurrentTimeMillis / l10.longValue());
    }

    private String l() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f5580c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            return telephonyManager.getNetworkOperatorName();
        } catch (Throwable th2) {
            if (!o.a()) {
                return "";
            }
            this.f5579b.a("DataCollector", "Unable to collect carrier", th2);
            return "";
        }
    }

    private String n() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f5580c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    private String o() {
        ActivityInfo activityInfo;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://"));
        ResolveInfo resolveInfoResolveActivity = this.f5580c.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null) {
            f5575k = activityInfo.packageName;
        }
        return f5575k;
    }

    private String q() {
        if (!o0.f()) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            LocaleList locales = this.f5580c.getResources().getConfiguration().getLocales();
            for (int i4 = 0; i4 < locales.size(); i4++) {
                sb2.append(locales.get(i4));
                sb2.append(",");
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    private Map r() {
        HashMap map = new HashMap();
        JSONObject jSONObjectDeserialize = JsonUtils.deserialize((String) this.f5578a.a(x4.I4));
        if (JsonUtils.isValid(jSONObjectDeserialize)) {
            map.putAll(a(jSONObjectDeserialize, new a0.x(19)));
        }
        JSONObject jSONObjectDeserialize2 = JsonUtils.deserialize((String) this.f5578a.a(x4.J4));
        if (JsonUtils.isValid(jSONObjectDeserialize2)) {
            map.putAll(a(jSONObjectDeserialize2, new a0.x(20)));
        }
        JSONObject jSONObjectDeserialize3 = JsonUtils.deserialize((String) this.f5578a.a(x4.K4));
        if (JsonUtils.isValid(jSONObjectDeserialize3)) {
            map.putAll(a(jSONObjectDeserialize3, new a0.x(21)));
        }
        return map;
    }

    private Float s() {
        Float f10 = (Float) this.f5578a.a(x4.f5990a4);
        Float fB = this.f5578a.p().b();
        if (fB == null) {
            return null;
        }
        return Float.valueOf(f10.floatValue() * fB.floatValue());
    }

    private float t() {
        try {
            return Settings.System.getFloat(this.f5580c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e2) {
            if (!o.a()) {
                return -1.0f;
            }
            this.f5579b.a("DataCollector", "Error collecting font scale", e2);
            return -1.0f;
        }
    }

    private boolean u() {
        SensorManager sensorManager = (SensorManager) this.f5580c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    private Map v() {
        HashMap map = new HashMap();
        CollectionUtils.putIntegerIfValid("IABTCF_gdprApplies", this.f5578a.r0().g(), map);
        CollectionUtils.putStringIfValid("IABTCF_TCString", this.f5578a.r0().j(), map);
        CollectionUtils.putStringIfValid("IABTCF_AddtlConsent", this.f5578a.r0().c(), map);
        return map;
    }

    private Boolean w() {
        AudioManager audioManager = (AudioManager) this.f5580c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isMusicActive());
    }

    private Boolean x() {
        AudioManager audioManager = (AudioManager) this.f5580c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    private String y() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f5580c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(0, Math.min(3, networkOperator.length()));
        } catch (Throwable th2) {
            if (!o.a()) {
                return "";
            }
            this.f5579b.a("DataCollector", "Unable to collect mobile country code", th2);
            return "";
        }
    }

    private String z() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f5580c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(Math.min(3, networkOperator.length()));
        } catch (Throwable th2) {
            if (!o.a()) {
                return "";
            }
            this.f5579b.a("DataCollector", "Unable to collect mobile network code", th2);
            return "";
        }
    }

    public String A() {
        return AppLovinSdkUtils.isFireOS(this.f5580c) ? "fireos" : "android";
    }

    public Map G() {
        Map map;
        synchronized (this.g) {
            map = CollectionUtils.map(this.f5583f);
        }
        String str = StringUtils.isValidString(j) ? j : this.f5580c.getApplicationInfo().packageName;
        map.put("package_name", str);
        map.put("vz", StringUtils.toShortSHA1Hash(str));
        map.put("first_install", Boolean.valueOf(this.f5578a.C0()));
        map.put("first_install_v2", Boolean.valueOf(!this.f5578a.z0()));
        map.put("test_ads", Boolean.valueOf(this.f5584h));
        map.put("test_mode", Integer.valueOf(this.f5578a.s0().c() ? 1 : 0));
        map.put("muted", Boolean.valueOf(this.f5578a.n0().isMuted()));
        if (((Boolean) this.f5578a.a(x4.A3)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f5578a.w0().e(), map);
        }
        if (((Boolean) this.f5578a.a(x4.D3)).booleanValue()) {
            map.put("compass_random_token", this.f5578a.u());
        }
        if (((Boolean) this.f5578a.a(x4.F3)).booleanValue()) {
            map.put("applovin_random_token", this.f5578a.h0());
        }
        if (((Boolean) this.f5578a.a(x4.J3)).booleanValue()) {
            map.put("art", this.f5578a.r());
        }
        map.putAll(v());
        CollectionUtils.putStringIfValid("template_browser_package_name", (String) this.f5578a.p0().a(z4.T, null), map);
        return map;
    }

    public b H() {
        return (b) f5577m.get();
    }

    public String I() {
        String strEncodeToString = Base64.encodeToString(new JSONObject(L()).toString().getBytes(Charset.defaultCharset()), 2);
        return ((Boolean) this.f5578a.a(x4.m5)).booleanValue() ? u4.b(strEncodeToString, n7.a(this.f5578a), u4.a.a(((Integer) this.f5578a.a(x4.f6098n5)).intValue()), this.f5578a.i0(), this.f5578a) : strEncodeToString;
    }

    public String K() {
        ActivityManager activityManager = (ActivityManager) this.f5580c.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
    }

    public Map M() {
        Map map;
        synchronized (this.g) {
            map = CollectionUtils.map(this.f5583f);
        }
        return map;
    }

    public Map N() {
        Map map;
        synchronized (this.f5582e) {
            map = CollectionUtils.map(this.f5581d);
        }
        return map;
    }

    public boolean U() {
        return this.f5584h;
    }

    public void Z() {
        d6 d6VarQ0 = this.f5578a.q0();
        o5 o5Var = new o5(this.f5578a, new a());
        d6.b bVar = d6.b.OTHER;
        d6VarQ0.a((i5) o5Var, bVar);
        this.f5578a.q0().a((i5) new r6(this.f5578a, true, "setDeviceVolume", new y(this, 1)), bVar);
    }

    public void b0() {
        synchronized (this.f5582e) {
            a(this.f5581d);
        }
        a0();
    }

    public Map e() {
        HashMap map = new HashMap();
        map.put("sc", this.f5578a.a(x4.f6077l));
        map.put("sc2", this.f5578a.a(x4.f6086m));
        map.put("sc3", this.f5578a.a(x4.f6092n));
        map.put("server_installed_at", this.f5578a.a(x4.f6100o));
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f5578a.a(z4.H), map);
        return map;
    }

    public v.a f() {
        v.a aVarB = com.applovin.impl.v.b(this.f5580c);
        if (aVarB == null) {
            return new v.a();
        }
        if (((Boolean) this.f5578a.a(x4.f6181y3)).booleanValue()) {
            if (aVarB.c() && !((Boolean) this.f5578a.a(x4.f6173x3)).booleanValue()) {
                aVarB.a("");
            }
            f5576l.set(aVarB);
        } else {
            aVarB = new v.a();
        }
        List<String> testDeviceAdvertisingIds = this.f5578a.J() != null ? this.f5578a.J().getTestDeviceAdvertisingIds() : null;
        if (testDeviceAdvertisingIds == null) {
            this.f5584h = false;
            return aVarB;
        }
        String strA = aVarB.a();
        if (StringUtils.isValidString(strA)) {
            this.f5584h = testDeviceAdvertisingIds.contains(strA);
        }
        b bVarH = H();
        String str = bVarH != null ? bVarH.f5587a : null;
        if (StringUtils.isValidString(str)) {
            this.f5584h = testDeviceAdvertisingIds.contains(str) | this.f5584h;
        }
        return aVarB;
    }

    public Map m() {
        HashMap map = new HashMap();
        c4 c4VarD0 = this.f5578a.d0();
        Deque dequeB = c4VarD0.b();
        if (!CollectionUtils.isEmpty(dequeB)) {
            map.put("network_throughput_info", dequeB);
        }
        CollectionUtils.putLongIfValid("network_throughput_kbps", c4VarD0.a(), map);
        q0.d dVarA = this.f5578a.w().a();
        if (dVarA != null) {
            map.put("lrm_ts_ms", String.valueOf(dVarA.c()));
            map.put("lrm_url", dVarA.d());
            map.put("lrm_ct_ms", String.valueOf(dVarA.a()));
            map.put("lrm_rs", String.valueOf(dVarA.b()));
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public Map p() {
        return a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        try {
            String strI = I();
            if (StringUtils.isValidString(strI)) {
                this.f5578a.O();
                if (o.a()) {
                    this.f5578a.O().a("DataCollector", "Successfully retrieved bid token");
                }
                t2.a(appLovinBidTokenCollectionListener, strI);
                return;
            }
            this.f5578a.O();
            if (o.a()) {
                this.f5578a.O().b("DataCollector", "Empty bid token");
            }
            t2.b(appLovinBidTokenCollectionListener, "Empty bid token");
        } catch (Throwable th2) {
            if (o.a()) {
                this.f5579b.a("DataCollector", "Failed to collect bid token", th2);
            }
            this.f5578a.D().a("DataCollector", "collectBidToken", th2);
            t2.b(appLovinBidTokenCollectionListener, "Failed to collect bid token");
        }
    }

    private Map c(PackageInfo packageInfo) {
        HashMap map = null;
        if (packageInfo == null) {
            return null;
        }
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && iArr != null && strArr.length != 0 && strArr.length == iArr.length) {
            map = new HashMap();
            for (int i4 = 0; i4 < strArr.length; i4++) {
                CollectionUtils.putIntegerIfValid(strArr[i4], Integer.valueOf(iArr[i4]), map);
            }
        }
        return map;
    }

    private List d(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return null;
        }
        if (o0.h()) {
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo != null) {
                return a(signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory());
            }
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                return a(signatureArr);
            }
        }
        return null;
    }

    public void a(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.f5578a.q0().a((i5) new r6(this.f5578a, ((Boolean) this.f5578a.a(x4.N3)).booleanValue(), "DataCollector", new t(4, this, appLovinBidTokenCollectionListener)), d6.b.CORE);
    }

    public Map a(Map map, boolean z3, boolean z10) {
        HashMap map2 = new HashMap(64);
        Map mapA = a(z3);
        Map mapG = G();
        Map mapM = m();
        Map mapK0 = this.f5578a.k0();
        if (z10) {
            map2.put("device_info", mapA);
            map2.put("app_info", mapG);
            if (mapM != null) {
                map2.put("connection_info", mapM);
            }
            if (map != null) {
                map2.put("ad_info", map);
            }
            if (!CollectionUtils.isEmpty(mapK0)) {
                map2.put("segments", mapK0);
            }
        } else {
            map2.putAll(mapA);
            map2.putAll(mapG);
            if (mapM != null) {
                map2.putAll(mapM);
            }
            if (map != null) {
                map2.putAll(map);
            }
            if (!CollectionUtils.isEmpty(mapK0)) {
                map2.putAll(mapK0);
            }
        }
        map2.put("accept", "custom_size,launch_app,video");
        map2.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.f5578a.V(), map2);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.f5578a.C(), map2);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f5578a.a(x4.L3), map2);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.f5578a.t0()), map2);
        if (!((Boolean) this.f5578a.a(x4.f6074k5)).booleanValue()) {
            map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f5578a.i0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.f5578a.q(), map2);
        map2.putAll(e());
        map2.put("rid", UUID.randomUUID().toString());
        return map2;
    }

    private boolean c() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i4 = 0; i4 < 9; i4++) {
            if (new File(c(strArr[i4])).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private long d() {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.l.d():long");
    }

    private List b(PackageInfo packageInfo) {
        FeatureInfo[] featureInfoArr;
        if (packageInfo == null || (featureInfoArr = packageInfo.reqFeatures) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FeatureInfo featureInfo : featureInfoArr) {
            arrayList.add(featureInfo.name);
        }
        return arrayList;
    }

    private String c(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i4 = 0; i4 < length; i4++) {
            cArr[i4] = str.charAt(i4);
            for (int i10 = 9; i10 >= 0; i10--) {
                cArr[i4] = (char) (cArr[i4] ^ iArr[i10]);
            }
        }
        return new String(cArr);
    }

    private void b(String str, int i4, String str2) {
        this.f5578a.q0().a((i5) new r6(this.f5578a, "reportAppExitInfoStackTrace", new z(i4, 0, this, str, str2)), d6.b.OTHER);
    }

    private int b(String str) {
        try {
            return Settings.Secure.getInt(this.f5580c.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private boolean b() {
        String str = Build.TAGS;
        return str != null && str.contains(c("lz}$blpz"));
    }

    private Map a(boolean z3) {
        Map map;
        synchronized (this.f5582e) {
            map = CollectionUtils.map(this.f5581d);
        }
        return a(map, z3);
    }

    private void a(Map map) {
        JSONArray jSONArrayF;
        if (((Boolean) this.f5578a.a(x4.U3)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(d()));
        }
        if (((Boolean) this.f5578a.a(x4.V3)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(t()));
        }
        if (((Boolean) this.f5578a.a(x4.f6007c4)).booleanValue() && n7.d(this.f5578a)) {
            n8.a(this.f5578a);
        }
        if (((Boolean) this.f5578a.a(x4.f6097n4)).booleanValue()) {
            n8.b(this.f5578a);
        }
        if (((Boolean) this.f5578a.a(x4.f5998b4)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (((Boolean) this.f5578a.a(x4.X3)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", Boolean.valueOf(R()));
        }
        map.put("is_pc", Boolean.valueOf(S()));
        if (((Boolean) this.f5578a.a(x4.f6112p4)).booleanValue()) {
            CollectionUtils.putStringIfValid("oglv", K(), map);
        }
        if (((Boolean) this.f5578a.a(x4.K6)).booleanValue()) {
            CollectionUtils.putStringIfValid("dbpn", o(), map);
        }
        if (!((Boolean) this.f5578a.a(x4.L6)).booleanValue() || map.containsKey("video_decoders") || (jSONArrayF = F()) == null || jSONArrayF.length() <= 0) {
            return;
        }
        map.put("video_decoders", jSONArrayF);
    }

    private Map a(Map map, boolean z3) {
        v.a aVarF;
        PowerManager powerManager;
        Map map2 = CollectionUtils.map(map);
        Point pointB = o0.b(this.f5580c);
        map2.put("dx", Integer.valueOf(pointB.x));
        map2.put("dy", Integer.valueOf(pointB.y));
        if (this.f5580c.getResources().getDisplayMetrics() != null) {
            map2.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow(pointB.y, 2.0d) + Math.pow(pointB.x, 2.0d)) / r5.xdpi));
        }
        map2.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f5580c)));
        if (((Boolean) this.f5578a.a(x4.E4)).booleanValue()) {
            String strB = n7.b(this.f5580c);
            Map mapA = o0.a(strB);
            if (mapA != null) {
                map2.put("display_cutout_insets", mapA);
            }
            Map mapC = o0.c(strB);
            if (mapC != null) {
                map2.put("status_bar_insets", mapC);
            }
            Map mapB = o0.b(strB);
            if (mapB != null) {
                map2.put("nav_bar_insets", mapB);
            }
        }
        if (z3) {
            aVarF = (v.a) f5576l.get();
            if (aVarF != null) {
                Z();
            } else if (n7.i()) {
                aVarF = new v.a();
                map2.put("inc", Boolean.TRUE);
            } else {
                aVarF = f();
            }
        } else {
            aVarF = f();
        }
        String strA = aVarF.a();
        if (StringUtils.isValidString(strA)) {
            map2.put("idfa", strA);
        }
        map2.put("dnt", Boolean.valueOf(aVarF.c()));
        map2.put("dnt_code", aVarF.b().b());
        b bVar = (b) f5577m.get();
        if (((Boolean) this.f5578a.a(x4.z3)).booleanValue() && bVar != null) {
            map2.put("idfv", bVar.f5587a);
            map2.put("idfv_scope", Integer.valueOf(bVar.f5588b));
        }
        Boolean boolB = p0.b().b(this.f5580c);
        if (boolB != null) {
            map2.put("huc", boolB);
        }
        Boolean boolB2 = p0.c().b(this.f5580c);
        if (boolB2 != null) {
            map2.put("aru", boolB2);
        }
        Boolean boolB3 = p0.a().b(this.f5580c);
        if (boolB3 != null) {
            map2.put("dns", boolB3);
        }
        if (((Boolean) this.f5578a.a(x4.O3)).booleanValue()) {
            c cVarJ = j();
            CollectionUtils.putIntegerIfValid("act", Integer.valueOf(cVarJ.f5589a), map2);
            CollectionUtils.putIntegerIfValid("acm", Integer.valueOf(cVarJ.f5590b), map2);
            CollectionUtils.putBooleanIfValid("sowpie", cVarJ.f5591c, map2);
        }
        if (((Boolean) this.f5578a.a(x4.W3)).booleanValue()) {
            map2.put("mtl", Integer.valueOf(this.f5578a.m0().getLastTrimMemoryLevel()));
        }
        if (((Boolean) this.f5578a.a(x4.Z3)).booleanValue()) {
            map2.put("adr", Boolean.valueOf(P()));
        }
        Float fS = z3 ? (Float) this.f5585i.get() : s();
        if (fS != null) {
            map2.put("volume", fS);
        }
        CollectionUtils.putBooleanIfValid("ma", w(), map2);
        CollectionUtils.putBooleanIfValid("spo", x(), map2);
        CollectionUtils.putBooleanIfValid("aif", Boolean.valueOf(!this.f5578a.m0().isApplicationPaused()), map2);
        CollectionUtils.putLongIfValid("af_ts_ms", Long.valueOf(this.f5578a.m0().getAppEnteredForegroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("ab_ts_ms", Long.valueOf(this.f5578a.m0().getAppEnteredBackgroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("abd_ms", Long.valueOf(this.f5578a.m0().getTotalBackgroundDurationMillis()), map2);
        try {
            map2.put("sb", Integer.valueOf((int) ((Settings.System.getInt(this.f5580c.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)));
        } catch (Settings.SettingNotFoundException e2) {
            if (o.a()) {
                this.f5579b.a("DataCollector", "Unable to collect screen brightness", e2);
            }
        }
        if (((Boolean) this.f5578a.a(x4.f6007c4)).booleanValue() && n7.d(this.f5578a)) {
            n8.a(this.f5578a);
            String strA2 = n8.a();
            if (StringUtils.isValidString(strA2)) {
                map2.put("ua", strA2);
            }
        }
        if (((Boolean) this.f5578a.a(x4.f6097n4)).booleanValue()) {
            n8.b(this.f5578a);
            CollectionUtils.putIntegerIfValid("wvvc", Integer.valueOf(n8.d()), map2);
            CollectionUtils.putStringIfValid("wvv", n8.c(), map2);
            CollectionUtils.putStringIfValid("wvpn", n8.b(), map2);
        }
        if (((Boolean) this.f5578a.a(x4.Q3)).booleanValue()) {
            try {
                map2.put("fs", Long.valueOf(Environment.getDataDirectory().getFreeSpace()));
                map2.put("tds", Long.valueOf(Environment.getDataDirectory().getTotalSpace()));
            } catch (Throwable th2) {
                map2.put("fs", -1);
                map2.put("tds", -1);
                if (o.a()) {
                    this.f5579b.a("DataCollector", "Unable to collect total & free space.", th2);
                }
            }
        }
        if (((Boolean) this.f5578a.a(x4.R3)).booleanValue()) {
            ActivityManager.MemoryInfo memoryInfoA = n7.a((ActivityManager) this.f5580c.getSystemService("activity"));
            if (memoryInfoA != null) {
                map2.put("fm", Long.valueOf(memoryInfoA.availMem));
                map2.put("tm", Long.valueOf(memoryInfoA.totalMem));
                map2.put("lmt", Long.valueOf(memoryInfoA.threshold));
                map2.put("lm", Boolean.valueOf(memoryInfoA.lowMemory));
            } else {
                map2.put("fm", -1);
                map2.put("tm", -1);
                map2.put("lmt", -1);
            }
        }
        if (((Boolean) this.f5578a.a(x4.S3)).booleanValue() && o0.a("android.permission.READ_PHONE_STATE", this.f5580c) && o0.f()) {
            map2.put("rat", Integer.valueOf(((TelephonyManager) this.f5580c.getSystemService("phone")).getDataNetworkType()));
        }
        if (((Boolean) this.f5578a.a(x4.P3)).booleanValue()) {
            String strB2 = B();
            if (!TextUtils.isEmpty(strB2)) {
                map2.put("so", strB2);
            }
        }
        map2.put("device_orientation", n7.b(this.f5580c));
        map2.put("orientation_lock", h());
        if (((Boolean) this.f5578a.a(x4.T3)).booleanValue()) {
            map2.put("vs", Boolean.valueOf(n7.k()));
        }
        if (o0.d() && (powerManager = (PowerManager) this.f5580c.getSystemService("power")) != null) {
            map2.put("lpm", Integer.valueOf(powerManager.isPowerSaveMode() ? 1 : 0));
        }
        if (((Boolean) this.f5578a.a(x4.f6024e4)).booleanValue() && this.f5578a.l0() != null) {
            map2.put("da", Float.valueOf(this.f5578a.l0().a()));
        }
        if (((Boolean) this.f5578a.a(x4.f6033f4)).booleanValue() && this.f5578a.l0() != null) {
            map2.put("dm", Float.valueOf(this.f5578a.l0().b()));
        }
        map2.put("mute_switch", Integer.valueOf(this.f5578a.p().c()));
        map2.put("network", r0.g(this.f5578a));
        String strQ = q();
        if (StringUtils.isValidString(strQ)) {
            map2.put("kb", strQ);
        }
        Map mapR = r();
        if (!CollectionUtils.isEmpty(mapR)) {
            map2.put("ds", mapR);
        }
        return map2;
    }

    private List a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (Signature signature : signatureArr) {
                messageDigest.update(signature.toByteArray());
                arrayList.add(StringUtils.toHexString(messageDigest.digest()));
            }
            return arrayList;
        } catch (Throwable th2) {
            this.f5578a.D().b("DataCollector", "parseSignatures", th2);
            return arrayList;
        }
    }

    private List a(PackageInfo packageInfo) {
        InstrumentationInfo[] instrumentationInfoArr;
        if (packageInfo == null || (instrumentationInfoArr = packageInfo.instrumentation) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InstrumentationInfo instrumentationInfo : instrumentationInfoArr) {
            HashMap map = new HashMap();
            map.put("name", instrumentationInfo.name);
            map.put("hp", Boolean.valueOf(instrumentationInfo.handleProfiling));
            map.put("ft", Boolean.valueOf(instrumentationInfo.functionalTest));
            map.put("t_pa", instrumentationInfo.targetPackage);
            if (o0.g()) {
                map.put("t_pr", instrumentationInfo.targetProcesses);
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    private Map a(Intent intent) {
        if (intent == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(5);
        map.put("action", StringUtils.emptyIfNull(intent.getAction()));
        map.put("data", StringUtils.emptyIfNull(intent.getDataString()));
        map.put("flags", Integer.valueOf(intent.getFlags()));
        ComponentName component = intent.getComponent();
        map.put("component", component != null ? component.flattenToString() : "");
        Set<String> categories = intent.getCategories();
        map.put("categories", categories != null ? new ArrayList(categories) : Collections.EMPTY_LIST);
        return map;
    }

    private String a(ApplicationExitInfo applicationExitInfo, int i4) {
        InputStream traceInputStream;
        String line;
        if (this.f5578a.c(x4.D4).contains(Integer.toString(i4))) {
            return null;
        }
        Integer num = (Integer) this.f5578a.a(x4.C4);
        if (num.intValue() <= 0) {
            return null;
        }
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
        } catch (Throwable th2) {
            this.f5578a.O();
            if (o.a()) {
                this.f5578a.O().a("DataCollector", "Failed to obtain trace input stream from application exit info", th2);
            }
            this.f5578a.D().b("DataCollector", "getTraceInputStream", th2);
            traceInputStream = null;
        }
        if (traceInputStream == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream));
            for (int i10 = 0; i10 < num.intValue() && (line = bufferedReader.readLine()) != null; i10++) {
                try {
                    sb2.append(line);
                    sb2.append('\n');
                } finally {
                }
            }
            bufferedReader.close();
        } catch (Throwable th3) {
            this.f5578a.O();
            if (o.a()) {
                this.f5578a.O().a("DataCollector", "Failed to read stack trace from input stream", th3);
            }
            this.f5578a.D().b("DataCollector", "readStackTraceFromInputStream", th3);
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, int i4, String str2) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", str);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(i4), mapHashMap);
        CollectionUtils.putStringIfValid("error_message", str2, mapHashMap);
        this.f5578a.D().d(d2.G0, mapHashMap);
    }

    public static void a(v.a aVar) {
        f5576l.set(aVar);
    }

    public static void a(b bVar) {
        f5577m.set(bVar);
    }

    public static void a(String str, k kVar) {
        String strA = a(k.o().getApplicationInfo().packageName, k.o().getPackageManager(), kVar);
        List listC = kVar.c(x4.X6);
        if (!StringUtils.isValidString(strA) || listC.contains(strA)) {
            j = str;
        }
    }

    private boolean a(String str) {
        return b(str) == 1;
    }

    private Map a(JSONObject jSONObject, d dVar) {
        ContentResolver contentResolver = this.f5580c.getContentResolver();
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string = JsonUtils.getString(jSONObject, next, null);
            if (StringUtils.isValidString(string)) {
                map.put(next, StringUtils.emptyIfNull(a(dVar, contentResolver, string)));
            }
        }
        return map;
    }

    private String a(d dVar, ContentResolver contentResolver, String str) {
        try {
            return dVar.a(contentResolver, str);
        } catch (Throwable th2) {
            this.f5578a.D().a("DataCollector", "retrieveSystemSettingValue", th2, CollectionUtils.hashMap("details", str));
            return null;
        }
    }

    private String a(String str, PackageManager packageManager) {
        if (!o0.b()) {
            return null;
        }
        try {
            return packageManager.getInstallSourceInfo(str).getOriginatingPackageName();
        } catch (Throwable th2) {
            this.f5578a.D().b("DataCollector", "getOriginatingName", th2);
            return null;
        }
    }

    private static String a(String str, PackageManager packageManager, k kVar) {
        try {
            if (((Boolean) kVar.a(x4.f6174x4)).booleanValue() && o0.b()) {
                return packageManager.getInstallSourceInfo(str).getInstallingPackageName();
            }
            return packageManager.getInstallerPackageName(str);
        } catch (Throwable th2) {
            kVar.D().b("DataCollector", "getInstallerName", th2);
            return null;
        }
    }
}
