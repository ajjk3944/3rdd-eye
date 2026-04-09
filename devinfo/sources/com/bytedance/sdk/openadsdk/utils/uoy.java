package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.x1;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.applovin.shadow.okio.internal.Buffer;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.ko;
import com.bytedance.sdk.openadsdk.rn.ouw.yu;
import d.h;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import v8.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class uoy {

    /* renamed from: cf, reason: collision with root package name */
    private static final HashSet<String> f8737cf;

    /* renamed from: jg, reason: collision with root package name */
    private static String f8738jg;
    private static String ko;
    private static final byte[] mwh;
    public static Integer ouw;
    private static final byte[] ryl;
    private static final ExecutorService vt = Executors.newSingleThreadExecutor();

    /* renamed from: lh, reason: collision with root package name */
    private static volatile boolean f8740lh = false;
    private static final AtomicInteger yu = new AtomicInteger(0);
    private static volatile String fkw = "";

    /* renamed from: le, reason: collision with root package name */
    private static final ReentrantLock f8739le = new ReentrantLock();
    private static String ra = null;
    private static String pno = null;
    private static String bly = null;
    private static final HashSet<String> tlj = new HashSet<>(Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.utils.uoy$2, reason: invalid class name */
    public static class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (TextUtils.isEmpty(uoy.fkw)) {
                    com.bytedance.sdk.component.bly.le leVar = new com.bytedance.sdk.component.bly.le(com.bytedance.sdk.openadsdk.core.zih.ouw(), le.lh.USER_AGENT);
                    leVar.setWebViewClient(new le.ouw());
                    String unused = uoy.fkw = leVar.getUserAgentString();
                    com.bytedance.sdk.component.utils.od.ouw(leVar);
                }
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.qbp.ouw("TTAD.ToolUtils", "", e2);
            } catch (NoClassDefFoundError e10) {
                com.bytedance.sdk.component.utils.qbp.ouw("TTAD.ToolUtils", "", e10);
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw implements Callable<String> {
        private final int ouw = 2;

        private synchronized String lh() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.uoy.ouw.1
                @Override // java.lang.Runnable
                public final void run() {
                    strArr[0] = uoy.ey();
                    com.bytedance.sdk.component.utils.ko.vt("getUA", "webview ua：" + strArr[0]);
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e2) {
                com.bytedance.sdk.component.utils.qbp.lh("TTAD.ToolUtils", e2.getMessage());
            }
            return strArr[0];
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public synchronized String call() throws Exception {
            String strVt;
            try {
                strVt = "unKnow";
                int i4 = this.ouw;
                if (i4 == 1) {
                    strVt = lh();
                } else if (i4 == 2) {
                    strVt = vt();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return strVt;
        }

        private static String vt() {
            String property;
            Throwable th2;
            try {
                property = System.getProperty("http.agent");
                if (property != null) {
                    try {
                        if (!"unKnow".equals(property)) {
                            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                                com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_ua_data", "android_system_ua", property);
                                return property;
                            }
                            com.bytedance.sdk.openadsdk.core.lh.ouw();
                            com.bytedance.sdk.openadsdk.core.lh.ouw("android_system_ua", property);
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        com.bytedance.sdk.component.utils.qbp.lh("getUA", "e:" + th2.getMessage());
                        return property;
                    }
                }
                return property;
            } catch (Throwable th4) {
                property = "unKnow";
                th2 = th4;
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt {
        private static final int ouw;

        static {
            com.bytedance.sdk.component.utils.qbp.ouw("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod start status = 0");
            int i4 = 2;
            try {
                int i10 = x1.f1551b;
                if (x1.class.getDeclaredMethod("getBindingAdapterPosition", null) != null) {
                    i4 = 0;
                }
            } catch (ClassNotFoundException unused) {
                i4 = 1;
            } catch (NoSuchMethodException unused2) {
            }
            ouw = i4;
            com.bytedance.sdk.component.utils.qbp.ouw("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod end status = ".concat(String.valueOf(i4)));
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f8737cf = hashSet;
        hashSet.addAll(Arrays.asList("America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"));
        ouw = null;
        ryl = new byte[]{108, 111, 97, 100, 105, 110, 103};
        mwh = new byte[]{97, 114, 98, 105, 116, 114, 97, 103, 101};
    }

    public static boolean cd() {
        return yu.get() == 1;
    }

    public static String cf() {
        com.bytedance.sdk.openadsdk.core.lh.ouw();
        return com.bytedance.sdk.openadsdk.core.lh.vt("total_memory", "0");
    }

    public static String ex() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.ToolUtils", e2.toString());
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String ey() {
        try {
            WebView webView = new WebView(com.bytedance.sdk.openadsdk.core.zih.ouw());
            webView.setWebViewClient(new le.ouw());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString != null && !"unKnow".equals(userAgentString)) {
                if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                    com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_ua_data", "webview_ua", userAgentString);
                    return userAgentString;
                }
                com.bytedance.sdk.openadsdk.core.lh.ouw();
                com.bytedance.sdk.openadsdk.core.lh.ouw("webview_ua", userAgentString);
            }
            return userAgentString;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("getUA", "e:" + th2.getMessage());
            return "unKnow";
        }
    }

    public static boolean fkw(int i4) {
        return i4 == 5;
    }

    private static String fqk() {
        String strUb = com.bytedance.sdk.openadsdk.core.settings.cf.ub();
        if (!TextUtils.isEmpty(strUb)) {
            return strUb;
        }
        String strVm = com.bytedance.sdk.openadsdk.core.zih.yu().vm();
        return TextUtils.isEmpty(strVm) ? zin.ouw() : strVm;
    }

    public static int fvf() {
        return vt.ouw;
    }

    public static String jae() {
        int i4 = -ksc();
        return i4 >= 0 ? "Etc/GMT+".concat(String.valueOf(i4)) : "Etc/GMT".concat(String.valueOf(i4));
    }

    public static long jg() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String jqy() {
        return "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/renderer/package_tx.json";
    }

    private static boolean jvy() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static long ko() {
        com.bytedance.sdk.openadsdk.core.lh.ouw();
        return com.bytedance.sdk.openadsdk.core.lh.ouw("free_internal_storage").longValue();
    }

    public static int ksc() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static boolean le(int i4) {
        return i4 == 6;
    }

    public static String lh(int i4) {
        return i4 != 1 ? i4 != 2 ? (i4 == 3 || i4 == 4) ? "open_ad" : i4 != 7 ? i4 != 8 ? "embeded_ad" : "fullscreen_interstitial_ad" : "rewarded_video" : "interaction" : "banner_ad";
    }

    public static long mwh() {
        com.bytedance.sdk.openadsdk.core.lh.ouw();
        return com.bytedance.sdk.openadsdk.core.lh.ouw("total_internal_storage").longValue();
    }

    public static boolean od() {
        return false;
    }

    public static /* synthetic */ boolean osn() {
        f8740lh = true;
        return true;
    }

    public static Intent ouw(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static String pd() {
        String str = ko;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(mwh);
        ko = str2;
        return str2;
    }

    public static synchronized String pno() {
        try {
            if (TextUtils.isEmpty(pno) && com.bytedance.sdk.openadsdk.core.zih.ouw() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.zih.ouw().getPackageManager().getPackageInfo(ra(), 0);
                    pno = String.valueOf(packageInfo.versionCode);
                    bly = packageInfo.versionName;
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.qbp.ouw("TTAD.ToolUtils", "ToolUtils getVersionCode throws exception :", th2);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return pno;
    }

    public static String qbp() {
        String strZih = com.bytedance.sdk.openadsdk.core.zih.yu().zih();
        return TextUtils.isEmpty(strZih) ? zin.ouw() : strZih;
    }

    public static int ra(int i4) {
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 4) {
            return 1;
        }
        if (i4 == 5) {
            return 4;
        }
        if (i4 != 6) {
            return i4;
        }
        return 5;
    }

    public static long rn() {
        com.bytedance.sdk.openadsdk.core.lh.ouw();
        return com.bytedance.sdk.openadsdk.core.lh.ouw("total_sdcard_storage").longValue();
    }

    private static String rrs() {
        try {
            ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.zih.ouw().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j = memoryInfo.totalMem;
            if (j > 0) {
                return String.valueOf(j / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String ryl() {
        return cf("MemTotal");
    }

    public static int tc() {
        try {
            String id2 = TimeZone.getDefault().getID();
            if (tlj.contains(id2)) {
                return 2;
            }
            if (id2 != null && id2.startsWith("Asia/")) {
                return 2;
            }
            if (id2 != null && id2.startsWith("Europe/")) {
                return 4;
            }
            if (id2 == null || !id2.startsWith("America/")) {
                return 3;
            }
            return !f8737cf.contains(id2) ? 5 : 3;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.ToolUtils", th2.toString());
            return 0;
        }
    }

    public static boolean th() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String tlj() throws IOException {
        com.bytedance.sdk.openadsdk.core.lh.ouw();
        String strVt = com.bytedance.sdk.openadsdk.core.lh.vt("total_memory", (String) null);
        if (strVt != null && tlj(strVt) > 0) {
            return strVt;
        }
        String strCf = cf("MemTotal");
        if (tlj(strCf) <= 0) {
            strCf = rrs();
        }
        com.bytedance.sdk.openadsdk.core.lh.ouw();
        com.bytedance.sdk.openadsdk.core.lh.ouw("total_memory", strCf);
        return strCf;
    }

    public static String uq() {
        String str = f8738jg;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(ryl);
        f8738jg = str2;
        return str2;
    }

    public static int vm() {
        com.bytedance.sdk.openadsdk.core.lh.ouw();
        return com.bytedance.sdk.openadsdk.core.lh.vt("is_root", -1);
    }

    public static String vpp() {
        return "https://log.byteoversea.com/service/2/app_log_test/";
    }

    public static void vt() {
    }

    public static boolean yu(int i4) {
        return i4 == 4;
    }

    public static long zih() {
        try {
            if (!jvy()) {
                return 0L;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.ToolUtils", th2.getMessage());
            return 0L;
        }
    }

    public static String zin() {
        String strOuw = com.bytedance.sdk.openadsdk.core.zih.yu().pno.ouw("dual_event_url", (String) null);
        if (!TextUtils.isEmpty(strOuw)) {
            return strOuw;
        }
        String strOuw2 = zin.ouw();
        return !TextUtils.isEmpty(strOuw2) ? h.t("https://", strOuw2, "/service/2/dual_events/") : strOuw;
    }

    public static synchronized String bly() {
        try {
            if (TextUtils.isEmpty(bly) && com.bytedance.sdk.openadsdk.core.zih.ouw() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.zih.ouw().getPackageManager().getPackageInfo(ra(), 0);
                    pno = String.valueOf(packageInfo.versionCode);
                    bly = packageInfo.versionName;
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.qbp.ouw("TTAD.ToolUtils", "ToolUtils getVersionName throws exception :", th2);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return bly;
    }

    private static String cf(String str) throws IOException {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                bufferedReader = new BufferedReader(fileReader, Buffer.SEGMENTING_THRESHOLD);
                do {
                    try {
                        line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            com.bytedance.sdk.component.utils.qbp.lh("TTAD.ToolUtils", th.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused) {
                                }
                            }
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception unused2) {
                                }
                            }
                            return null;
                        } finally {
                        }
                    }
                } while (!line.contains(str));
                if (line == null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                    try {
                        fileReader.close();
                    } catch (Exception unused4) {
                    }
                    return null;
                }
                String[] strArrSplit = line.split("\\s+");
                com.bytedance.sdk.component.utils.ko.vt("ToolUtils", "getTotalMemory = " + strArrSplit[1]);
                String str2 = strArrSplit[1];
                try {
                    bufferedReader.close();
                } catch (Exception unused5) {
                }
                try {
                    fileReader.close();
                } catch (Exception unused6) {
                }
                return str2;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileReader = null;
            bufferedReader = null;
        }
    }

    public static String fkw() {
        if (!TextUtils.isEmpty(fkw)) {
            return fkw;
        }
        com.bytedance.sdk.openadsdk.multipro.lh.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw());
        String strOuw = com.bytedance.sdk.openadsdk.core.bly.ouw("sdk_local_web_ua", 86400000L);
        fkw = strOuw;
        if (TextUtils.isEmpty(strOuw)) {
            ReentrantLock reentrantLock = f8739le;
            try {
                if (reentrantLock.tryLock()) {
                    try {
                        if (TextUtils.isEmpty(fkw)) {
                            fkw = WebSettings.getDefaultUserAgent(com.bytedance.sdk.openadsdk.core.zih.ouw());
                        }
                        com.bytedance.sdk.openadsdk.core.bly.ouw("sdk_local_web_ua", fkw);
                        reentrantLock.unlock();
                    } catch (Exception e2) {
                        com.bytedance.sdk.component.utils.qbp.ouw("TTAD.ToolUtils", "", e2);
                        return fkw;
                    } catch (NoClassDefFoundError e10) {
                        com.bytedance.sdk.component.utils.qbp.ouw("TTAD.ToolUtils", "", e10);
                        return fkw;
                    }
                }
            } finally {
                f8739le.unlock();
            }
        }
        return fkw;
    }

    public static String le() {
        return ex.ouw();
    }

    public static synchronized String ra() {
        Context contextOuw;
        try {
            if (TextUtils.isEmpty(ra) && (contextOuw = com.bytedance.sdk.openadsdk.core.zih.ouw()) != null) {
                try {
                    ra = contextOuw.getPackageName();
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.qbp.ouw("TTAD.ToolUtils", "ToolUtils getPackageName throws exception :", th2);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return ra;
    }

    private static String ryl(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("aid", "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", pno()).toString();
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.ToolUtils", e2.getMessage());
            return str;
        }
    }

    public static boolean vt(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                com.bytedance.sdk.component.utils.vt.ouw(context, intent, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static void yu() {
        com.bytedance.sdk.openadsdk.rn.lh.ouw("recycle_version_not_valid", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.utils.uoy.1
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("method_exist", uoy.fvf());
                com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                yuVar.ouw = "recycle_version_not_valid";
                yuVar.bly = jSONObject.toString();
                return yuVar;
            }
        });
    }

    public static void le(final String str) {
        com.bytedance.sdk.openadsdk.rn.lh.ouw();
        com.bytedance.sdk.openadsdk.rn.lh.ouw("reportMultiLog", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.utils.uoy.3
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                if (uoy.f8740lh || !com.bytedance.sdk.openadsdk.core.zih.yu().jae()) {
                    return null;
                }
                uoy.osn();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error", str);
                com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                yuVar.ouw = "reportMultiLog";
                yuVar.bly = jSONObject.toString();
                return yuVar;
            }
        });
    }

    public static boolean yu(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int le(Context context) {
        List<ResolveInfo> listQueryIntentActivities;
        Integer num = ouw;
        if (num != null) {
            return num.intValue();
        }
        if (context == null || (listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0)) == null) {
            return 0;
        }
        int size = listQueryIntentActivities.size();
        ouw = Integer.valueOf(size);
        return size;
    }

    public static int yu(Context context) {
        return ra(com.bytedance.sdk.component.utils.ksc.ouw(context, 0L));
    }

    public static String lh() {
        String strVt;
        String str = "unKnow";
        com.bytedance.sdk.openadsdk.multipro.lh.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw());
        try {
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                strVt = com.bytedance.sdk.openadsdk.multipro.yu.ouw.vt("sp_multi_ua_data", "android_system_ua", "unKnow");
            } else {
                com.bytedance.sdk.openadsdk.core.lh.ouw();
                strVt = com.bytedance.sdk.openadsdk.core.lh.vt("android_system_ua", "unKnow");
            }
        } catch (Exception unused) {
        }
        if (strVt != null && !"unKnow".equals(strVt)) {
            return strVt;
        }
        FutureTask futureTask = new FutureTask(new ouw());
        vt.execute(futureTask);
        str = (String) futureTask.get(500L, TimeUnit.MILLISECONDS);
        com.bytedance.sdk.component.utils.qbp.lh("getUA", " getAndroidSystemUA userAgent".concat(String.valueOf(str)));
        return str;
    }

    public static String ouw(int i4) {
        if (i4 == 1) {
            return "embeded_ad";
        }
        if (i4 == 2) {
            return "banner_ad";
        }
        if (i4 == 3) {
            return "interaction";
        }
        if (i4 == 4) {
            return "open_ad";
        }
        if (i4 == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i4 != 7) {
            return null;
        }
        return "rewarded_video";
    }

    private static boolean ra(Context context) {
        if (context == null) {
            return false;
        }
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    private static long tlj(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String vt(int i4) {
        if (i4 == 1) {
            return "embeded_ad_landingpage";
        }
        if (i4 == 2) {
            return "banner_ad_landingpage";
        }
        if (i4 == 3) {
            return "interaction_landingpage";
        }
        if (i4 == 4) {
            return "splash_ad_landingpage";
        }
        if (i4 == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i4 != 7) {
            return "unknow";
        }
        return "rewarded_video_landingpage";
    }

    public static boolean yu(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        int i4;
        return vppVar != null && vppVar.f8305pd == 3 && vppVar.zin() && ((i4 = vppVar.jcd) == 4 || i4 == 5);
    }

    public static boolean ra(String str) {
        if (com.bytedance.sdk.openadsdk.core.jg.fkw()) {
            return true;
        }
        com.bytedance.sdk.component.utils.qbp.yu(h.t("You must use method '", str, "' after initialization, please check."), new Object[0]);
        return false;
    }

    public static void pno(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        com.bytedance.sdk.component.utils.qbp.yu(h.t("You should use method '", str, "' on the asynchronous thread,it may cause anr, please check."), new Object[0]);
    }

    public static String ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        if (vppVar == null) {
            return null;
        }
        try {
            return lh(vppVar.uoy());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        str.getClass();
        switch (str) {
        }
        return 1;
    }

    public static int vt(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        if (vppVar == null) {
            return -1;
        }
        int iUoy = vppVar.uoy();
        int i4 = 1;
        if (iUoy == 1) {
            return 2;
        }
        if (iUoy == 3) {
            return 4;
        }
        if (iUoy != 5) {
            i4 = 7;
            if (iUoy != 7) {
                return iUoy != 8 ? -1 : 5;
            }
        }
        return i4;
    }

    public static String vt(String str) {
        return ouw(str, false, false);
    }

    public static String fkw(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", "oppo") : "";
    }

    public static String lh(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.bytedance.sdk.openadsdk.core.zih.yu().pno.ouw("app_log_url", "");
        }
        if (TextUtils.isEmpty(str)) {
            return "https://api16-access-ttp.tiktokpangle.us/service/2/app_log/";
        }
        return !str.startsWith("http") ? "https://".concat(str) : str;
    }

    public static String ouw(String str, boolean z3, boolean z10) {
        String strQbp;
        if (str != null && !str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (z10) {
            strQbp = fqk();
        } else {
            strQbp = qbp();
        }
        if (TextUtils.isEmpty(strQbp)) {
            strQbp = "api16-access-ttp.tiktokpangle.us";
        }
        String strT = h.t("https://", strQbp, str);
        if (fvf.ouw() && !z3) {
            strT = fvf.ouw(strT);
        }
        return z3 ? ryl(strT) : strT;
    }

    public static int vt(Context context) {
        int i4 = -1;
        try {
            i4 = context.getApplicationInfo().targetSdkVersion;
            com.bytedance.sdk.component.utils.ko.vt("TTAD.ToolUtils", "targetSdkVersion = ", Integer.valueOf(i4));
            return i4;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.ToolUtils", th2.getMessage());
            return i4;
        }
    }

    public static boolean pno(int i4) {
        if (i4 <= 0) {
            return false;
        }
        if (i4 >= 100) {
            return true;
        }
        int iNextInt = new Random(System.currentTimeMillis()).nextInt(100) + 1;
        com.bytedance.sdk.component.utils.ko.vt("TTAD.ToolUtils", "isMatchProbability: " + iNextInt + "/" + i4);
        return iNextInt <= i4;
    }

    public static void fkw(Context context) {
        try {
            AtomicInteger atomicInteger = yu;
            if (atomicInteger.get() != 0) {
                return;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean zIsEnabled = accessibilityManager.isEnabled();
            boolean zIsTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (zIsEnabled && zIsTouchExplorationEnabled) {
                atomicInteger.set(1);
                final com.bytedance.sdk.openadsdk.rn.lh lhVarOuw = com.bytedance.sdk.openadsdk.rn.lh.ouw();
                com.bytedance.sdk.openadsdk.rn.lh.ouw("blind_mode_status", true, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.rn.lh.7
                    public AnonymousClass7() {
                    }

                    @Override // com.bytedance.sdk.openadsdk.rn.vt
                    public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                        yu yuVar = new yu();
                        yuVar.ouw = "blind_mode_status";
                        return yuVar;
                    }
                });
                return;
            }
            atomicInteger.set(2);
        } catch (Exception unused) {
            yu.set(2);
        }
    }

    public static boolean lh(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        if (vppVar == null) {
            return true;
        }
        int iFqk = vppVar.fqk();
        com.bytedance.sdk.openadsdk.core.zih.yu();
        int iVt = com.bytedance.sdk.openadsdk.core.settings.cf.vt(iFqk);
        int iOuw = com.bytedance.sdk.component.utils.ksc.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 60000L);
        if (iVt == 1) {
            return yu(iOuw);
        }
        if (iVt == 2) {
            return fkw(iOuw) || yu(iOuw) || le(iOuw);
        }
        if (iVt != 3) {
            return iVt != 5 || yu(iOuw) || le(iOuw);
        }
        return false;
    }

    public static long lh(Context context) {
        int i4 = -1;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                i4 = context.getApplicationInfo().minSdkVersion;
                com.bytedance.sdk.component.utils.ko.vt("TTAD.ToolUtils", "minSdkVersion = ", Integer.valueOf(i4));
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.ToolUtils", th2.getMessage());
        }
        return i4;
    }

    public static String ouw(Context context) {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = context.getResources().getConfiguration().getLocales().get(0);
            } else {
                locale = Locale.getDefault();
            }
            return locale.getLanguage();
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.ToolUtils", e2.toString());
            return "";
        }
    }

    public static JSONObject ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, long j, c cVar) throws JSONException {
        if (vppVar == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("creative_id", vppVar.pv);
            jSONObject.put("buffers_time", j);
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.c cVar2 = vppVar.f8309sd;
            if (cVar2 != null) {
                jSONObject.put("video_size", cVar2.f6575c);
                jSONObject.put("video_resolution", cVar2.f6577e);
            }
            if (!jSONObject.has("video_resolution") && cVar != null) {
                try {
                    jSONObject.put("video_resolution", String.format(Locale.getDefault(), "%d×%d", Integer.valueOf(cVar.yu()), Integer.valueOf(cVar.fkw())));
                    return jSONObject;
                } catch (Throwable unused) {
                }
            }
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.qbp.ouw("TTAD.ToolUtils", "getVideoAction json error", e2);
        }
        return jSONObject;
    }

    public static void ouw(String str, String str2, Context context) {
        int i4;
        if (TextUtils.isEmpty(str2) || !ra(context)) {
            return;
        }
        int length = str2.length();
        int i10 = 1;
        if (length % 3572 == 0) {
            i4 = length / 3572;
        } else {
            i4 = (length / 3572) + 1;
        }
        int i11 = 3572;
        int i12 = 0;
        while (i10 <= i4) {
            if (i11 < length) {
                Log.d(str, i4 + "-" + i10 + ":" + str2.substring(i12, i11));
                i10++;
                i12 = i11;
                i11 += 3572;
            } else {
                Log.d(str, i4 + "-" + i10 + ":" + str2.substring(i12));
                return;
            }
        }
    }

    public static void ouw(StringBuilder sb2, String str, String str2) {
        int iIndexOf;
        if (!TextUtils.isEmpty(str) && (iIndexOf = sb2.indexOf(str)) > 0) {
            sb2.replace(iIndexOf, str.length() + iIndexOf, str2);
        }
    }

    public static void ouw(JSONObject jSONObject) {
        int iIntValue;
        try {
            Pair<String, Long> pairVt = com.bytedance.sdk.openadsdk.core.bly.vt("oem_store");
            int i4 = -1;
            if (pairVt != null && ((iIntValue = Integer.valueOf((String) pairVt.first).intValue()) != -2 || System.currentTimeMillis() - ((Long) pairVt.second).longValue() < com.bytedance.sdk.openadsdk.vpp.ouw.ouw("oem_store_state_time", 259200000))) {
                i4 = iIntValue;
            }
            jSONObject.put("oem_store", i4);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.ToolUtils", th2.getMessage());
        }
    }

    public static void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, com.bytedance.sdk.component.bly.le leVar) {
        ouw(vppVar, leVar, false);
    }

    public static int ouw(WebView webView) {
        if (webView == null) {
            return -1;
        }
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            int size = webBackForwardListCopyBackForwardList.getSize();
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < size; i4++) {
                WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i4);
                if (itemAtIndex != null) {
                    String url = itemAtIndex.getUrl();
                    if (!arrayList.contains(url)) {
                        arrayList.add(url);
                    }
                }
            }
            return arrayList.indexOf(webView.getUrl()) + 1;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.ToolUtils", th2.toString());
            return -1;
        }
    }

    public static JSONObject ouw(AdSlot adSlot) {
        JSONObject jSONObject = new JSONObject();
        if (adSlot != null) {
            try {
                jSONObject.put("is_sb", !TextUtils.isEmpty(adSlot.getBidAdm()));
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }

    public static boolean ouw() {
        return (ko.ouw.ouw == null || ko.ouw.ouw.ouw.ouw.get()) ? false : true;
    }

    public static void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str) {
        com.bytedance.sdk.openadsdk.core.model.ryl rylVar;
        if (vppVar != null) {
            try {
                String str2 = vppVar.osn;
                if (TextUtils.isEmpty(str2) && (rylVar = vppVar.kn) != null && rylVar.f8261lh == 1 && !TextUtils.isEmpty(rylVar.vt)) {
                    str2 = vppVar.kn.vt;
                }
                String str3 = str2;
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.uoy.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), str3, vppVar, ouw(str), str, false);
            } catch (Throwable unused) {
            }
        }
    }

    public static com.bytedance.sdk.openadsdk.common.fkw ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, com.bytedance.sdk.component.bly.le leVar, Context context) {
        int i4 = vppVar.jcd;
        if (!vppVar.zin()) {
            return null;
        }
        if (i4 != 1 && i4 != 3) {
            return null;
        }
        com.bytedance.sdk.openadsdk.common.yu yuVar = new com.bytedance.sdk.openadsdk.common.yu(context);
        leVar.vt = yuVar;
        yuVar.setVisibility(8);
        View view = leVar.vt;
        if (view != null && view.getParent() == null) {
            leVar.addView(leVar.vt, new FrameLayout.LayoutParams(-1, -1));
        }
        return new com.bytedance.sdk.openadsdk.common.fkw(vppVar, leVar);
    }

    public static void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, com.bytedance.sdk.component.bly.le leVar, boolean z3) {
        com.bytedance.sdk.component.bly.le leVar2;
        com.bytedance.sdk.openadsdk.core.model.pno pnoVar;
        List<Integer> list;
        if (vppVar == null || leVar == null) {
            return;
        }
        int i4 = vppVar.jcd;
        if (!vppVar.zin() || (!(i4 == 2 || i4 == 3 || i4 == 5) || (pnoVar = vppVar.our) == null)) {
            leVar2 = leVar;
        } else {
            List<Integer> list2 = pnoVar.f8258lh;
            ArrayList arrayList = new ArrayList();
            if (z3) {
                for (int i10 = 0; i10 < list2.size(); i10++) {
                    arrayList.add(Integer.valueOf(list2.get(i10).intValue() - 1));
                }
                list = arrayList;
            } else {
                list = list2;
            }
            leVar2 = leVar;
            leVar2.ouw(pnoVar.ouw, pnoVar.vt, list, pnoVar.yu, pnoVar.fkw);
        }
        int iVh = vppVar.vh();
        long jYib = vppVar.yib();
        if ((iVh == 1 || iVh == 2) && jYib > 0) {
            leVar2.ouw(iVh, jYib);
        }
    }
}
