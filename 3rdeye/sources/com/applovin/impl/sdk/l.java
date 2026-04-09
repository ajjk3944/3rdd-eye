package com.applovin.impl.sdk;

import C.RunnableC0615b;
import C.g0;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
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
import com.applovin.impl.AbstractC2128k0;
import com.applovin.impl.AbstractC2130l0;
import com.applovin.impl.AbstractC2135n0;
import com.applovin.impl.AbstractC2147u;
import com.applovin.impl.C2123i;
import com.applovin.impl.C2132m0;
import com.applovin.impl.a7;
import com.applovin.impl.a8;
import com.applovin.impl.c5;
import com.applovin.impl.e4;
import com.applovin.impl.f6;
import com.applovin.impl.i4;
import com.applovin.impl.l2;
import com.applovin.impl.l4;
import com.applovin.impl.n4;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.w4;
import com.applovin.impl.x6;
import com.applovin.impl.z6;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.singular.sdk.internal.Constants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class l {

    /* renamed from: j, reason: collision with root package name */
    private static String f21251j;

    /* renamed from: k, reason: collision with root package name */
    private static String f21252k;

    /* renamed from: l, reason: collision with root package name */
    private static final AtomicReference f21253l = new AtomicReference();

    /* renamed from: m, reason: collision with root package name */
    private static final AtomicReference f21254m = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    private final k f21255a;

    /* renamed from: b, reason: collision with root package name */
    private final o f21256b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f21257c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f21258d;

    /* renamed from: f, reason: collision with root package name */
    private final Map f21260f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f21261g;

    /* renamed from: h, reason: collision with root package name */
    private Long f21262h;

    /* renamed from: e, reason: collision with root package name */
    private final Object f21259e = new Object();
    private final AtomicReference i = new AtomicReference();

    public class a implements c5.a {
        public a() {
        }

        @Override // com.applovin.impl.c5.a
        public void a(AbstractC2147u.a aVar) {
            l.f21253l.set(aVar);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f21264a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21265b;

        public b(String str, int i) {
            this.f21264a = str;
            this.f21265b = i;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f21266a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f21267b = -1;

        /* renamed from: c, reason: collision with root package name */
        public Boolean f21268c = null;
    }

    public l(k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f21255a = kVar;
        this.f21256b = kVar.O();
        this.f21257c = k.o();
        this.f21258d = A();
        this.f21260f = z();
    }

    private Map A() {
        HashMap map = new HashMap(35);
        map.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        map.put("brand", Build.MANUFACTURER);
        map.put("brand_name", Build.BRAND);
        map.put("hardware", Build.HARDWARE);
        map.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        map.put("aida", Boolean.valueOf(AbstractC2147u.a()));
        map.put(CommonUrlParts.LOCALE, Locale.getDefault().toString());
        map.put(CommonUrlParts.MODEL, Build.MODEL);
        map.put("os", Build.VERSION.RELEASE);
        map.put("platform", x());
        map.put("revision", Build.DEVICE);
        map.put("tz_offset", Double.valueOf(B()));
        map.put("gy", Boolean.valueOf(r()));
        map.put("country_code", k());
        map.put("mcc", v());
        map.put("mnc", w());
        map.put("carrier", i());
        map.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f21257c)));
        map.put(Constants.REVENUE_PRODUCT_CATEGORY_KEY, Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        map.put("hdr", Q());
        map.put("supported_abis", M());
        DisplayMetrics displayMetrics = this.f21257c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            map.put("adns", Float.valueOf(displayMetrics.density));
            map.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            map.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            map.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            AbstractC2128k0.a aVarA = AbstractC2128k0.a(this.f21257c, this.f21255a);
            if (aVarA != null) {
                map.put("tl_cr", Integer.valueOf(aVarA.c()));
                map.put("tr_cr", Integer.valueOf(aVarA.d()));
                map.put("bl_cr", Integer.valueOf(aVarA.a()));
                map.put("br_cr", Integer.valueOf(aVarA.b()));
            }
        }
        map.put("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        map.put("tbalsi_ms", Long.valueOf(this.f21255a.L() - k.n()));
        CollectionUtils.putBooleanIfValid("psase", Boolean.valueOf(e4.e(this.f21257c)), map);
        CollectionUtils.putStringIfValid("process_name", a7.b(this.f21257c), map);
        CollectionUtils.putBooleanIfValid("is_main_process", a7.g(this.f21257c), map);
        try {
            PackageInfo packageInfo = this.f21257c.getPackageManager().getPackageInfo("com.android.vending", 0);
            map.put("ps_version", packageInfo.versionName);
            map.put("ps_version_code", Integer.valueOf(packageInfo.versionCode));
        } catch (Throwable unused) {
            map.put("ps_version", "");
            map.put("ps_version_code", -1);
        }
        CollectionUtils.putBooleanIfValid("play_store_disabled", x6.a(this.f21257c), map);
        a(map);
        return map;
    }

    private double B() {
        return Math.round((TimeZone.getDefault().getOffset(new Date().getTime()) * 10.0d) / 3600000.0d) / 10.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x020b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019c A[Catch: all -> 0x0189, LOOP:2: B:56:0x019a->B:57:0x019c, LOOP_END, TryCatch #5 {all -> 0x0189, blocks: (B:34:0x00e6, B:46:0x0162, B:48:0x0168, B:51:0x018b, B:53:0x0194, B:55:0x0197, B:57:0x019c, B:58:0x01c9, B:59:0x01ce, B:61:0x01d4), top: B:100:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d4 A[Catch: all -> 0x0189, TRY_LEAVE, TryCatch #5 {all -> 0x0189, blocks: (B:34:0x00e6, B:46:0x0162, B:48:0x0168, B:51:0x018b, B:53:0x0194, B:55:0x0197, B:57:0x019c, B:58:0x01c9, B:59:0x01ce, B:61:0x01d4), top: B:100:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONArray C() {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.l.C():org.json.JSONArray");
    }

    public static String G() {
        return f21252k;
    }

    private Map J() {
        return a7.a(a((Map) null, true, false));
    }

    private JSONArray M() {
        if (AbstractC2128k0.d()) {
            return CollectionUtils.toJSONArray(Build.SUPPORTED_ABIS);
        }
        JSONArray jSONArray = new JSONArray();
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI);
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI2);
        return jSONArray;
    }

    private boolean N() {
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

    private boolean O() {
        ConnectivityManager connectivityManager;
        if (!AbstractC2128k0.f() || (connectivityManager = (ConnectivityManager) this.f21257c.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            return connectivityManager.getRestrictBackgroundStatus() == 3;
        } catch (Throwable th) {
            this.f21255a.O();
            if (!o.a()) {
                return false;
            }
            this.f21255a.O().a("DataCollector", "Unable to collect constrained network info.", th);
            return false;
        }
    }

    private boolean P() {
        boolean z10 = this.f21257c.getResources().getConfiguration().keyboard == 2;
        PackageManager packageManager = this.f21257c.getPackageManager();
        return z10 && (packageManager.hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE") || packageManager.hasSystemFeature("android.hardware.type.pc"));
    }

    private Boolean Q() {
        if (AbstractC2128k0.g()) {
            return Boolean.valueOf(this.f21257c.getResources().getConfiguration().isScreenHdr());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S() {
        this.i.set(p());
    }

    private boolean c() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i = 0; i < 9; i++) {
            if (new File(c(strArr[i])).exists()) {
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

    private String g() {
        int orientation = AppLovinSdkUtils.getOrientation(this.f21257c);
        return orientation == 1 ? "portrait" : orientation == 2 ? "landscape" : "none";
    }

    private c h() {
        c cVar = new c();
        Intent intentRegisterReceiver = this.f21257c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : -1;
        int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            cVar.f21267b = -1;
        } else {
            cVar.f21267b = (int) ((intExtra / intExtra2) * 100.0f);
        }
        cVar.f21266a = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        cVar.f21268c = Boolean.valueOf(Settings.Global.getInt(this.f21257c.getContentResolver(), "stay_on_while_plugged_in", -1) > 0);
        return cVar;
    }

    private String i() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f21257c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            return telephonyManager.getNetworkOperatorName();
        } catch (Throwable th) {
            if (!o.a()) {
                return "";
            }
            this.f21256b.a("DataCollector", "Unable to collect carrier", th);
            return "";
        }
    }

    private String k() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f21257c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    private String l() {
        ActivityInfo activityInfo;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://"));
        ResolveInfo resolveInfoResolveActivity = this.f21257c.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null) {
            f21252k = activityInfo.packageName;
        }
        return f21252k;
    }

    private String m() {
        Point pointB = AbstractC2128k0.b(this.f21257c);
        int i = pointB.x;
        int i10 = pointB.y;
        int iC = a7.c(this.f21257c);
        return ((i <= i10 || !(iC == 0 || iC == 2)) && (i10 <= i || !(iC == 1 || iC == 3))) ? b(iC) : a(iC);
    }

    private String o() {
        if (!AbstractC2128k0.f()) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            LocaleList locales = this.f21257c.getResources().getConfiguration().getLocales();
            for (int i = 0; i < locales.size(); i++) {
                sb.append(locales.get(i));
                sb.append(StringUtils.COMMA);
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    private Float p() {
        Float f10 = (Float) this.f21255a.a(l4.f19816Q3);
        Float fB = this.f21255a.q().b();
        if (fB == null) {
            return null;
        }
        return Float.valueOf(f10.floatValue() * fB.floatValue());
    }

    private float q() {
        try {
            return Settings.System.getFloat(this.f21257c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e4) {
            if (!o.a()) {
                return -1.0f;
            }
            this.f21256b.a("DataCollector", "Error collecting font scale", e4);
            return -1.0f;
        }
    }

    private boolean r() {
        SensorManager sensorManager = (SensorManager) this.f21257c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    private Map s() {
        HashMap map = new HashMap();
        CollectionUtils.putIntegerIfValid("IABTCF_gdprApplies", this.f21255a.r0().g(), map);
        CollectionUtils.putStringIfValid("IABTCF_TCString", this.f21255a.r0().j(), map);
        CollectionUtils.putStringIfValid("IABTCF_AddtlConsent", this.f21255a.r0().c(), map);
        return map;
    }

    private Boolean t() {
        AudioManager audioManager = (AudioManager) this.f21257c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isMusicActive());
    }

    private Boolean u() {
        AudioManager audioManager = (AudioManager) this.f21257c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    private String v() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f21257c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(0, Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!o.a()) {
                return "";
            }
            this.f21256b.a("DataCollector", "Unable to collect mobile country code", th);
            return "";
        }
    }

    private String w() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f21257c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!o.a()) {
                return "";
            }
            this.f21256b.a("DataCollector", "Unable to collect mobile network code", th);
            return "";
        }
    }

    private String y() {
        AudioManager audioManager = (AudioManager) this.f21257c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (AbstractC2128k0.e()) {
            for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                sb.append(audioDeviceInfo.getType());
                sb.append(StringUtils.COMMA);
            }
        } else {
            if (audioManager.isWiredHeadsetOn()) {
                sb.append("3,");
            }
            if (audioManager.isBluetoothScoOn()) {
                sb.append("7,");
            }
            if (audioManager.isBluetoothA2dpOn()) {
                sb.append(8);
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        String string = sb.toString();
        if (TextUtils.isEmpty(string) && o.a()) {
            this.f21256b.a("DataCollector", "No sound outputs detected");
        }
        return string;
    }

    private Map z() {
        PackageInfo packageInfo;
        HashMap map = new HashMap();
        PackageManager packageManager = this.f21257c.getPackageManager();
        ApplicationInfo applicationInfo = this.f21257c.getApplicationInfo();
        long jLastModified = new File(applicationInfo.sourceDir).lastModified();
        try {
            packageInfo = packageManager.getPackageInfo(this.f21257c.getPackageName(), 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        String strA = a(applicationInfo.packageName, packageManager, this.f21255a);
        map.put("app_name", packageManager.getApplicationLabel(applicationInfo));
        map.put("app_version", packageInfo != null ? packageInfo.versionName : "");
        map.put("app_version_code", Integer.valueOf(packageInfo != null ? packageInfo.versionCode : -1));
        if (strA == null) {
            strA = "";
        }
        map.put("installer_name", strA);
        map.put("tg", z6.a(this.f21255a));
        map.put("debug", Boolean.valueOf(a7.c(this.f21255a)));
        map.put("ia", Long.valueOf(jLastModified));
        map.put("alts_ms", Long.valueOf(k.n()));
        map.put("session_id", this.f21255a.m0().getSessionId());
        map.put("j8", Boolean.valueOf(k.F0()));
        map.put("ps_tpg", Boolean.valueOf(e4.d(this.f21257c)));
        map.put("ps_apg", Boolean.valueOf(e4.b(this.f21257c)));
        map.put("ps_capg", Boolean.valueOf(e4.c(this.f21257c)));
        map.put("ps_aipg", Boolean.valueOf(e4.a(this.f21257c)));
        k kVar = this.f21255a;
        n4 n4Var = n4.f20575h;
        Long l5 = (Long) kVar.a(n4Var);
        if (l5 != null) {
            map.put("ia_v2", l5);
        } else {
            this.f21255a.b(n4Var, Long.valueOf(jLastModified));
        }
        map.put("sdk_version", AppLovinSdk.VERSION);
        map.put("omid_sdk_version", this.f21255a.d0().c());
        CollectionUtils.putStringIfValid("ad_review_sdk_version", C2123i.b(), map);
        map.put("api_did", this.f21255a.a(l4.f19917f));
        map.put("first_install_v3_ms", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : "");
        CollectionUtils.putLongIfValid("last_launch_ms", this.f21255a.M(), map);
        CollectionUtils.putLongIfValid("app_launch_count", Long.valueOf(this.f21255a.N()), map);
        map.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        if (AbstractC2128k0.f()) {
            map.put("min_sdk", Integer.valueOf(applicationInfo.minSdkVersion));
        }
        if (this.f21255a.H0()) {
            map.put("unity_version", a7.a(this.f21255a.n0()));
        }
        return map;
    }

    public Map D() {
        Map map = CollectionUtils.map(this.f21260f);
        String str = com.applovin.impl.sdk.utils.StringUtils.isValidString(f21251j) ? f21251j : this.f21257c.getApplicationInfo().packageName;
        map.put("package_name", str);
        map.put("vz", com.applovin.impl.sdk.utils.StringUtils.toShortSHA1Hash(str));
        map.put("first_install", Boolean.valueOf(this.f21255a.C0()));
        map.put("first_install_v2", Boolean.valueOf(!this.f21255a.z0()));
        map.put("test_ads", Boolean.valueOf(this.f21261g));
        map.put("test_mode", Integer.valueOf(this.f21255a.s0().c() ? 1 : 0));
        map.put("muted", Boolean.valueOf(this.f21255a.n0().isMuted()));
        if (((Boolean) this.f21255a.a(l4.f20006q3)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f21255a.w0().e(), map);
        }
        if (((Boolean) this.f21255a.a(l4.f20030t3)).booleanValue()) {
            map.put("compass_random_token", this.f21255a.v());
        }
        if (((Boolean) this.f21255a.a(l4.f20046v3)).booleanValue()) {
            map.put("applovin_random_token", this.f21255a.h0());
        }
        if (((Boolean) this.f21255a.a(l4.f20078z3)).booleanValue()) {
            map.put("art", this.f21255a.s());
        }
        map.putAll(s());
        if (this.f21255a.g0() != null) {
            CollectionUtils.putJsonArrayIfValid("ps_topics", this.f21255a.g0().a(), map);
        }
        CollectionUtils.putStringIfValid("template_browser_package_name", (String) this.f21255a.p0().a(n4.f20569N, null), map);
        return map;
    }

    public b E() {
        return (b) f21254m.get();
    }

    public String F() {
        String strEncodeToString = Base64.encodeToString(new JSONObject(J()).toString().getBytes(Charset.defaultCharset()), 2);
        return ((Boolean) this.f21255a.a(l4.f19796N4)).booleanValue() ? i4.b(strEncodeToString, a7.a(this.f21255a), i4.a.a(((Integer) this.f21255a.a(l4.f19803O4)).intValue()), this.f21255a.i0(), this.f21255a) : strEncodeToString;
    }

    public Long H() {
        return this.f21262h;
    }

    public String I() {
        ActivityManager activityManager = (ActivityManager) this.f21257c.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
    }

    public Map K() {
        return CollectionUtils.map(this.f21260f);
    }

    public Map L() {
        return CollectionUtils.map(this.f21258d);
    }

    public boolean R() {
        return this.f21261g;
    }

    public void T() {
        r5 r5VarQ0 = this.f21255a.q0();
        c5 c5Var = new c5(this.f21255a, new a());
        r5.b bVar = r5.b.OTHER;
        r5VarQ0.a((w4) c5Var, bVar);
        this.f21255a.q0().a((w4) new f6(this.f21255a, true, "setDeviceVolume", new g0(this, 18)), bVar);
    }

    public void U() {
        synchronized (this.f21259e) {
            a(this.f21258d);
        }
    }

    public Map e() {
        HashMap map = new HashMap();
        map.put("sc", this.f21255a.a(l4.f19963l));
        map.put("sc2", this.f21255a.a(l4.f19970m));
        map.put("sc3", this.f21255a.a(l4.f19978n));
        map.put("server_installed_at", this.f21255a.a(l4.f19986o));
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f21255a.a(n4.f20561F), map);
        return map;
    }

    public AbstractC2147u.a f() {
        AbstractC2147u.a aVarB = AbstractC2147u.b(this.f21257c);
        if (aVarB == null) {
            return new AbstractC2147u.a();
        }
        if (((Boolean) this.f21255a.a(l4.f19990o3)).booleanValue()) {
            if (aVarB.c() && !((Boolean) this.f21255a.a(l4.f19982n3)).booleanValue()) {
                aVarB.a("");
            }
            f21253l.set(aVarB);
        } else {
            aVarB = new AbstractC2147u.a();
        }
        List<String> testDeviceAdvertisingIds = this.f21255a.K() != null ? this.f21255a.K().getTestDeviceAdvertisingIds() : null;
        if (testDeviceAdvertisingIds == null) {
            this.f21261g = false;
            return aVarB;
        }
        String strA = aVarB.a();
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA)) {
            this.f21261g = testDeviceAdvertisingIds.contains(strA);
        }
        b bVarE = E();
        String str = bVarE != null ? bVarE.f21264a : null;
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            this.f21261g = testDeviceAdvertisingIds.contains(str) | this.f21261g;
        }
        return aVarB;
    }

    public Map j() {
        HashMap map = new HashMap();
        CollectionUtils.putLongIfValid("network_throughput_kbps", H(), map);
        C2132m0.d dVarA = this.f21255a.x().a();
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

    public Map n() {
        return a(false);
    }

    public String x() {
        return AppLovinSdkUtils.isFireOS(this.f21257c) ? "fireos" : ConstantDeviceInfo.APP_PLATFORM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        try {
            String strF = F();
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strF)) {
                this.f21255a.O();
                if (o.a()) {
                    this.f21255a.O().a("DataCollector", "Successfully retrieved bid token");
                }
                l2.a(appLovinBidTokenCollectionListener, strF);
                return;
            }
            this.f21255a.O();
            if (o.a()) {
                this.f21255a.O().b("DataCollector", "Empty bid token");
            }
            l2.b(appLovinBidTokenCollectionListener, "Empty bid token");
        } catch (Throwable th) {
            if (o.a()) {
                this.f21256b.a("DataCollector", "Failed to collect bid token", th);
            }
            this.f21255a.E().a("DataCollector", "collectBidToken", th);
            l2.b(appLovinBidTokenCollectionListener, "Failed to collect bid token");
        }
    }

    public void a(Long l5) {
        this.f21262h = l5;
    }

    public void a(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.f21255a.q0().a((w4) new f6(this.f21255a, ((Boolean) this.f21255a.a(l4.f19721D3)).booleanValue(), "DataCollector", new RunnableC0615b(17, this, appLovinBidTokenCollectionListener)), r5.b.CORE);
    }

    private String c(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = str.charAt(i);
            for (int i10 = 9; i10 >= 0; i10--) {
                cArr[i] = (char) (cArr[i] ^ iArr[i10]);
            }
        }
        return new String(cArr);
    }

    public Map a(Map map, boolean z10, boolean z11) {
        HashMap map2 = new HashMap(64);
        Map mapA = a(z10);
        Map mapD = D();
        Map mapJ = j();
        Map mapK0 = this.f21255a.k0();
        if (z11) {
            map2.put("device_info", mapA);
            map2.put("app_info", mapD);
            if (mapJ != null) {
                map2.put("connection_info", mapJ);
            }
            if (map != null) {
                map2.put("ad_info", map);
            }
            if (!CollectionUtils.isEmpty(mapK0)) {
                map2.put("segments", mapK0);
            }
        } else {
            map2.putAll(mapA);
            map2.putAll(mapD);
            if (mapJ != null) {
                map2.putAll(mapJ);
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
        CollectionUtils.putStringIfValid("mediation_provider", this.f21255a.V(), map2);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.f21255a.D(), map2);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f21255a.a(l4.f19705B3), map2);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.f21255a.t0()), map2);
        if (!((Boolean) this.f21255a.a(l4.f19783L4)).booleanValue()) {
            map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f21255a.i0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.f21255a.r(), map2);
        map2.putAll(e());
        map2.put("rid", UUID.randomUUID().toString());
        return map2;
    }

    private String b(int i) {
        if (i == 0) {
            return "portrait";
        }
        if (i == 1) {
            return "landscape_right";
        }
        if (i == 2) {
            return "portrait_upside_down";
        }
        if (i != 3) {
            return "unknown";
        }
        return "landscape_left";
    }

    private int b(String str) {
        try {
            return Settings.Secure.getInt(this.f21257c.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private boolean b() {
        String str = Build.TAGS;
        return str != null && str.contains(c("lz}$blpz"));
    }

    public Map a(boolean z10) {
        Map map;
        synchronized (this.f21259e) {
            map = CollectionUtils.map(this.f21258d);
        }
        return a(map, z10);
    }

    private void a(Map map) {
        JSONArray jSONArrayC;
        if (((Boolean) this.f21255a.a(l4.f19775K3)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(d()));
        }
        if (((Boolean) this.f21255a.a(l4.f19782L3)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(q()));
        }
        if (((Boolean) this.f21255a.a(l4.f19829S3)).booleanValue() && a7.d(this.f21255a)) {
            a8.a(this.f21255a);
        }
        if (((Boolean) this.f21255a.a(l4.f19907d4)).booleanValue()) {
            a8.b(this.f21255a);
        }
        if (((Boolean) this.f21255a.a(l4.f19822R3)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (((Boolean) this.f21255a.a(l4.f19795N3)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", Boolean.valueOf(O()));
        }
        map.put("is_pc", Boolean.valueOf(P()));
        if (((Boolean) this.f21255a.a(l4.f19922f4)).booleanValue()) {
            CollectionUtils.putStringIfValid("oglv", I(), map);
        }
        if (((Boolean) this.f21255a.a(l4.f19932g6)).booleanValue()) {
            CollectionUtils.putStringIfValid("dbpn", l(), map);
        }
        if (!((Boolean) this.f21255a.a(l4.f19940h6)).booleanValue() || map.containsKey("video_decoders") || (jSONArrayC = C()) == null || jSONArrayC.length() <= 0) {
            return;
        }
        map.put("video_decoders", jSONArrayC);
    }

    private Map a(Map map, boolean z10) {
        AbstractC2147u.a aVarF;
        PowerManager powerManager;
        Map map2 = CollectionUtils.map(map);
        Point pointB = AbstractC2128k0.b(this.f21257c);
        map2.put("dx", Integer.valueOf(pointB.x));
        map2.put("dy", Integer.valueOf(pointB.y));
        if (this.f21257c.getResources().getDisplayMetrics() != null) {
            map2.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow(pointB.y, 2.0d) + Math.pow(pointB.x, 2.0d)) / r4.xdpi));
        }
        map2.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f21257c)));
        if (z10) {
            aVarF = (AbstractC2147u.a) f21253l.get();
            if (aVarF != null) {
                T();
            } else if (a7.h()) {
                aVarF = new AbstractC2147u.a();
                map2.put("inc", Boolean.TRUE);
            } else {
                aVarF = f();
            }
        } else {
            aVarF = f();
        }
        String strA = aVarF.a();
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA)) {
            map2.put("idfa", strA);
        }
        map2.put("dnt", Boolean.valueOf(aVarF.c()));
        map2.put("dnt_code", aVarF.b().b());
        b bVar = (b) f21254m.get();
        if (((Boolean) this.f21255a.a(l4.f19998p3)).booleanValue() && bVar != null) {
            map2.put("idfv", bVar.f21264a);
            map2.put("idfv_scope", Integer.valueOf(bVar.f21265b));
        }
        Boolean boolB = AbstractC2130l0.b().b(this.f21257c);
        if (boolB != null) {
            map2.put("huc", boolB);
        }
        Boolean boolB2 = AbstractC2130l0.c().b(this.f21257c);
        if (boolB2 != null) {
            map2.put("aru", boolB2);
        }
        Boolean boolB3 = AbstractC2130l0.a().b(this.f21257c);
        if (boolB3 != null) {
            map2.put("dns", boolB3);
        }
        if (((Boolean) this.f21255a.a(l4.f19729E3)).booleanValue()) {
            c cVarH = h();
            CollectionUtils.putIntegerIfValid("act", Integer.valueOf(cVarH.f21266a), map2);
            CollectionUtils.putIntegerIfValid("acm", Integer.valueOf(cVarH.f21267b), map2);
            CollectionUtils.putBooleanIfValid("sowpie", cVarH.f21268c, map2);
        }
        if (((Boolean) this.f21255a.a(l4.f19789M3)).booleanValue()) {
            map2.put("mtl", Integer.valueOf(this.f21255a.m0().getLastTrimMemoryLevel()));
        }
        if (((Boolean) this.f21255a.a(l4.f19809P3)).booleanValue()) {
            map2.put("adr", Boolean.valueOf(N()));
        }
        Float fP = z10 ? (Float) this.i.get() : p();
        if (fP != null) {
            map2.put("volume", fP);
        }
        CollectionUtils.putBooleanIfValid("ma", t(), map2);
        CollectionUtils.putBooleanIfValid("spo", u(), map2);
        CollectionUtils.putBooleanIfValid("aif", Boolean.valueOf(!this.f21255a.m0().isApplicationPaused()), map2);
        CollectionUtils.putLongIfValid("af_ts_ms", Long.valueOf(this.f21255a.m0().getAppEnteredForegroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("ab_ts_ms", Long.valueOf(this.f21255a.m0().getAppEnteredBackgroundTimeMillis()), map2);
        try {
            map2.put("sb", Integer.valueOf((int) ((Settings.System.getInt(this.f21257c.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)));
        } catch (Settings.SettingNotFoundException e4) {
            if (o.a()) {
                this.f21256b.a("DataCollector", "Unable to collect screen brightness", e4);
            }
        }
        if (((Boolean) this.f21255a.a(l4.f19829S3)).booleanValue() && a7.d(this.f21255a)) {
            a8.a(this.f21255a);
            String strA2 = a8.a();
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA2)) {
                map2.put("ua", strA2);
            }
        }
        if (((Boolean) this.f21255a.a(l4.f19907d4)).booleanValue()) {
            a8.b(this.f21255a);
            CollectionUtils.putIntegerIfValid("wvvc", Integer.valueOf(a8.d()), map2);
            CollectionUtils.putStringIfValid("wvv", a8.c(), map2);
            CollectionUtils.putStringIfValid("wvpn", a8.b(), map2);
        }
        if (((Boolean) this.f21255a.a(l4.f19744G3)).booleanValue()) {
            try {
                map2.put("fs", Long.valueOf(Environment.getDataDirectory().getFreeSpace()));
                map2.put("tds", Long.valueOf(Environment.getDataDirectory().getTotalSpace()));
            } catch (Throwable th) {
                map2.put("fs", -1);
                map2.put("tds", -1);
                if (o.a()) {
                    this.f21256b.a("DataCollector", "Unable to collect total & free space.", th);
                }
            }
        }
        if (((Boolean) this.f21255a.a(l4.f19752H3)).booleanValue()) {
            ActivityManager.MemoryInfo memoryInfoA = a7.a((ActivityManager) this.f21257c.getSystemService("activity"));
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
        if (((Boolean) this.f21255a.a(l4.f19760I3)).booleanValue() && AbstractC2128k0.a("android.permission.READ_PHONE_STATE", this.f21257c) && AbstractC2128k0.f()) {
            map2.put("rat", Integer.valueOf(((TelephonyManager) this.f21257c.getSystemService("phone")).getDataNetworkType()));
        }
        if (((Boolean) this.f21255a.a(l4.f19736F3)).booleanValue()) {
            String strY = y();
            if (!TextUtils.isEmpty(strY)) {
                map2.put("so", strY);
            }
        }
        map2.put("device_orientation", m());
        map2.put("orientation_lock", g());
        if (((Boolean) this.f21255a.a(l4.f19768J3)).booleanValue()) {
            map2.put("vs", Boolean.valueOf(a7.j()));
        }
        if (AbstractC2128k0.d() && (powerManager = (PowerManager) this.f21257c.getSystemService("power")) != null) {
            map2.put("lpm", Integer.valueOf(powerManager.isPowerSaveMode() ? 1 : 0));
        }
        if (((Boolean) this.f21255a.a(l4.f19843U3)).booleanValue() && this.f21255a.l0() != null) {
            map2.put("da", Float.valueOf(this.f21255a.l0().a()));
        }
        if (((Boolean) this.f21255a.a(l4.f19850V3)).booleanValue() && this.f21255a.l0() != null) {
            map2.put("dm", Float.valueOf(this.f21255a.l0().b()));
        }
        map2.put("mute_switch", Integer.valueOf(this.f21255a.q().c()));
        map2.put("network", AbstractC2135n0.g(this.f21255a));
        String strO = o();
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strO)) {
            map2.put("kb", strO);
        }
        ArrayService arrayServiceP = this.f21255a.p();
        if (arrayServiceP.isAppHubInstalled()) {
            if (arrayServiceP.getIsDirectDownloadEnabled() != null) {
                map2.put("ah_dd_enabled", arrayServiceP.getIsDirectDownloadEnabled());
            }
            map2.put("ah_sdk_version_code", Long.valueOf(arrayServiceP.getAppHubVersionCode()));
            map2.put("ah_random_user_token", com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(arrayServiceP.getRandomUserToken()));
            map2.put("ah_sdk_package_name", com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(arrayServiceP.getAppHubPackageName()));
        }
        return map2;
    }

    private String a(int i) {
        if (i == 0) {
            return "landscape_right";
        }
        if (i == 1) {
            return "portrait_upside_down";
        }
        if (i == 2) {
            return "landscape_left";
        }
        if (i != 3) {
            return "unknown";
        }
        return "portrait";
    }

    public static void a(AbstractC2147u.a aVar) {
        f21253l.set(aVar);
    }

    public static void a(b bVar) {
        f21254m.set(bVar);
    }

    public static void a(String str, k kVar) {
        String strA = a(k.o().getApplicationInfo().packageName, k.o().getPackageManager(), kVar);
        List listC = kVar.c(l4.f20009q6);
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(strA) || listC.contains(strA)) {
            f21251j = str;
        }
    }

    private boolean a(String str) {
        return b(str) == 1;
    }

    private static String a(String str, PackageManager packageManager, k kVar) {
        try {
            if (((Boolean) kVar.a(l4.f19968l4)).booleanValue() && AbstractC2128k0.b()) {
                return packageManager.getInstallSourceInfo(str).getInstallingPackageName();
            }
            return packageManager.getInstallerPackageName(str);
        } catch (Throwable th) {
            kVar.E().a("DataCollector", "getInstallerName", th);
            return null;
        }
    }
}
