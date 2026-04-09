package com.bytedance.sdk.openadsdk.utils;

import A.f;
import J1.b;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
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
import androidx.recyclerview.widget.g0;
import com.bykv.vk.openvk.emc.emc.emc.xq.c;
import com.bytedance.sdk.component.zz.ycc;
import com.bytedance.sdk.openadsdk.AdSlot;
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

/* loaded from: classes.dex */
public class tp {
    private static String cf;
    public static Integer emc;
    private static final HashSet<String> gbl;
    private static String qh;
    private static final byte[] sup;
    private static final byte[] sz;
    private static final ExecutorService ypw = Executors.newSingleThreadExecutor();
    private static volatile boolean xq = false;
    private static final AtomicInteger dg = new AtomicInteger(0);
    private static volatile String bw = "";
    private static final ReentrantLock ycc = new ReentrantLock();
    private static String uym = null;
    private static String msw = null;
    private static String zz = null;
    private static final HashSet<String> ru = new HashSet<>(Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    /* renamed from: com.bytedance.sdk.openadsdk.utils.tp$2, reason: invalid class name */
    public static class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (TextUtils.isEmpty(tp.bw)) {
                    com.bytedance.sdk.component.zz.ycc yccVar = new com.bytedance.sdk.component.zz.ycc(com.bytedance.sdk.openadsdk.core.aa.emc(), ycc.xq.USER_AGENT);
                    yccVar.setWebViewClient(new ycc.emc());
                    String unused = tp.bw = yccVar.getUserAgentString();
                    com.bytedance.sdk.component.utils.dr.emc(yccVar);
                }
            } catch (Exception e6) {
                com.bytedance.sdk.component.utils.ul.emc("TTAD.ToolUtils", "", e6);
            } catch (NoClassDefFoundError e7) {
                com.bytedance.sdk.component.utils.ul.emc("TTAD.ToolUtils", "", e7);
            }
        }
    }

    public static class emc implements Callable<String> {
        private final int emc;

        public emc(int i) {
            this.emc = i;
        }

        private synchronized String xq() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.tp.emc.1
                @Override // java.lang.Runnable
                public void run() {
                    strArr[0] = tp.mkp();
                    String str = strArr[0];
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e6) {
                com.bytedance.sdk.component.utils.ul.xq("TTAD.ToolUtils", e6.getMessage());
            }
            return strArr[0];
        }

        private String ypw() {
            String property;
            Throwable th;
            try {
                property = System.getProperty("http.agent");
                if (property != null) {
                    try {
                        if (!"unKnow".equals(property)) {
                            if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                                com.bytedance.sdk.openadsdk.multipro.dg.emc.emc("sp_multi_ua_data", "android_system_ua", property);
                                return property;
                            }
                            com.bytedance.sdk.openadsdk.core.xq.emc().emc("android_system_ua", property);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        com.bytedance.sdk.component.utils.ul.xq("getUA", "e:" + th.getMessage());
                        return property;
                    }
                }
                return property;
            } catch (Throwable th3) {
                property = "unKnow";
                th = th3;
            }
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public synchronized String call() {
            String strYpw;
            try {
                strYpw = "unKnow";
                int i = this.emc;
                if (i == 1) {
                    strYpw = xq();
                } else if (i == 2) {
                    strYpw = ypw();
                }
            } catch (Throwable th) {
                throw th;
            }
            return strYpw;
        }
    }

    public static class xq {
        private static final int emc;

        static {
            com.bytedance.sdk.component.utils.ul.emc("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod start status = 0");
            int i = 2;
            try {
                int i3 = g0.f5478a;
                if (g0.class.getDeclaredMethod("getBindingAdapterPosition", null) != null) {
                    i = 0;
                }
            } catch (ClassNotFoundException unused) {
                i = 1;
            } catch (NoSuchMethodException unused2) {
            }
            emc = i;
            com.bytedance.sdk.component.utils.ul.emc("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod end status = ".concat(String.valueOf(i)));
        }
    }

    public static class ypw {
        public final ComponentName emc;
        public final int ypw;

        public ypw(ComponentName componentName, int i) {
            this.emc = componentName;
            this.ypw = i;
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        gbl = hashSet;
        hashSet.addAll(Arrays.asList("America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"));
        emc = null;
        sup = new byte[]{108, 111, 97, 100, 105, 110, 103};
        sz = new byte[]{97, 114, 98, 105, 116, 114, 97, 103, 101};
    }

    public static boolean aa() {
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

    public static boolean bw(int i) {
        return i == 5;
    }

    public static long cf() {
        try {
            if (!iyl()) {
                return 0L;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("TTAD.ToolUtils", th.getMessage());
            return 0L;
        }
    }

    public static String db() {
        int i = -ee();
        return i >= 0 ? "Etc/GMT+".concat(String.valueOf(i)) : "Etc/GMT".concat(String.valueOf(i));
    }

    public static boolean dg(int i) {
        return i == 4;
    }

    public static String dr() {
        String str = cf;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(sz);
        cf = str2;
        return str2;
    }

    public static int ee() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, View view) {
    }

    public static int hxp() {
        try {
            String id = TimeZone.getDefault().getID();
            if (ru.contains(id)) {
                return 2;
            }
            if (id != null && id.startsWith("Asia/")) {
                return 2;
            }
            if (id != null && id.startsWith("Europe/")) {
                return 4;
            }
            if (id == null || !id.startsWith("America/")) {
                return 3;
            }
            return !gbl.contains(id) ? 5 : 3;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("TTAD.ToolUtils", th.toString());
            return 0;
        }
    }

    private static boolean iyl() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String mkp() {
        try {
            WebView webView = new WebView(com.bytedance.sdk.openadsdk.core.aa.emc());
            webView.setWebViewClient(new ycc.emc());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString != null && !"unKnow".equals(userAgentString)) {
                if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                    com.bytedance.sdk.openadsdk.multipro.dg.emc.emc("sp_multi_ua_data", "webview_ua", userAgentString);
                    return userAgentString;
                }
                com.bytedance.sdk.openadsdk.core.xq.emc().emc("webview_ua", userAgentString);
            }
            return userAgentString;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("getUA", "e:" + th.getMessage());
            return "unKnow";
        }
    }

    public static synchronized String msw() {
        try {
            if (TextUtils.isEmpty(zz) && com.bytedance.sdk.openadsdk.core.aa.emc() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.aa.emc().getPackageManager().getPackageInfo(ycc(), 0);
                    msw = String.valueOf(packageInfo.versionCode);
                    zz = packageInfo.versionName;
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.ul.emc("TTAD.ToolUtils", "ToolUtils getVersionName throws exception :", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zz;
    }

    public static long qh() {
        return com.bytedance.sdk.openadsdk.core.xq.emc().ypw("total_sdcard_storage", 0L).longValue();
    }

    public static String rie() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e6) {
            com.bytedance.sdk.component.utils.ul.xq("TTAD.ToolUtils", e6.toString());
            return "";
        }
    }

    public static String ru() {
        return com.bytedance.sdk.openadsdk.core.xq.emc().ypw("total_memory", "0");
    }

    public static boolean sb() {
        return dg.get() == 1;
    }

    public static String sba() {
        String strVw = com.bytedance.sdk.openadsdk.core.aa.dg().vw();
        return TextUtils.isEmpty(strVw) ? sra.emc() : strVw;
    }

    public static String sf() {
        String str = qh;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(sup);
        qh = str2;
        return str2;
    }

    public static String sra() {
        return "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/renderer/package_tx.json";
    }

    public static long sup() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static long sz() {
        return com.bytedance.sdk.openadsdk.core.xq.emc().ypw("free_internal_storage", 0L).longValue();
    }

    public static String ul() {
        String strZhk = com.bytedance.sdk.openadsdk.core.settings.gbl.zhk();
        if (!TextUtils.isEmpty(strZhk)) {
            return strZhk;
        }
        String strRa = com.bytedance.sdk.openadsdk.core.aa.dg().ra();
        return TextUtils.isEmpty(strRa) ? sra.emc() : strRa;
    }

    public static int uym(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 4) {
            return 1;
        }
        if (i == 5) {
            return 4;
        }
        if (i != 6) {
            return i;
        }
        return 5;
    }

    public static int vk() {
        return com.bytedance.sdk.openadsdk.core.xq.emc().ypw("is_root", -1);
    }

    public static int xmt() {
        return xq.emc;
    }

    public static String xq(int i) {
        return i != 1 ? i != 2 ? (i == 3 || i == 4) ? "open_ad" : i != 7 ? i != 8 ? "embeded_ad" : "fullscreen_interstitial_ad" : "rewarded_video" : "interaction" : "banner_ad";
    }

    public static boolean ycc(int i) {
        return i == 6;
    }

    public static String ylm() {
        return "https://log.byteoversea.com/service/2/app_log_test/";
    }

    public static boolean ypw(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                com.bytedance.sdk.component.utils.ypw.emc(context, intent, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String yzg() {
        String strVhn = com.bytedance.sdk.openadsdk.core.aa.dg().vhn();
        if (!TextUtils.isEmpty(strVhn)) {
            return strVhn;
        }
        String strEmc = sra.emc();
        return !TextUtils.isEmpty(strEmc) ? f.m("https://", strEmc, "/service/2/dual_events/") : strVhn;
    }

    public static String zz() {
        try {
            ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.aa.emc().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j6 = memoryInfo.totalMem;
            if (j6 > 0) {
                return String.valueOf(j6 / 1024);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String bw() {
        return db.emc();
    }

    public static boolean dg(Context context) {
        return false;
    }

    public static String gbl() {
        return xq("MemTotal");
    }

    public static void ru(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        com.bytedance.sdk.component.utils.ul.xq(f.m("You should use method '", str, "' on the asynchronous thread,it may cause anr, please check."), new Object[0]);
    }

    public static synchronized String uym() {
        try {
            if (TextUtils.isEmpty(msw) && com.bytedance.sdk.openadsdk.core.aa.emc() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.aa.emc().getPackageManager().getPackageInfo(ycc(), 0);
                    msw = String.valueOf(packageInfo.versionCode);
                    zz = packageInfo.versionName;
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.ul.emc("TTAD.ToolUtils", "ToolUtils getVersionCode throws exception :", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return msw;
    }

    public static synchronized String ycc() {
        Context contextEmc;
        try {
            if (TextUtils.isEmpty(uym) && (contextEmc = com.bytedance.sdk.openadsdk.core.aa.emc()) != null) {
                try {
                    uym = contextEmc.getPackageName();
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.ul.emc("TTAD.ToolUtils", "ToolUtils getPackageName throws exception :", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return uym;
    }

    public static String bw(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.bytedance.sdk.openadsdk.core.aa.dg().wo();
        }
        if (TextUtils.isEmpty(str)) {
            return "https://api16-access-ttp.tiktokpangle.us/service/2/app_log/";
        }
        return !str.startsWith("http") ? "https://".concat(str) : str;
    }

    public static String dg() {
        if (!TextUtils.isEmpty(bw)) {
            return bw;
        }
        com.bytedance.sdk.openadsdk.multipro.xq.emc(com.bytedance.sdk.openadsdk.core.aa.emc());
        String strEmc = com.bytedance.sdk.openadsdk.core.zz.emc("sdk_local_web_ua", 86400000L);
        bw = strEmc;
        if (TextUtils.isEmpty(strEmc)) {
            ReentrantLock reentrantLock = ycc;
            try {
                if (reentrantLock.tryLock()) {
                    try {
                        if (TextUtils.isEmpty(bw)) {
                            bw = WebSettings.getDefaultUserAgent(com.bytedance.sdk.openadsdk.core.aa.emc());
                        }
                        com.bytedance.sdk.openadsdk.core.zz.emc("sdk_local_web_ua", bw);
                        reentrantLock.unlock();
                    } catch (Exception e6) {
                        com.bytedance.sdk.component.utils.ul.emc("TTAD.ToolUtils", "", e6);
                        return bw;
                    } catch (NoClassDefFoundError e7) {
                        com.bytedance.sdk.component.utils.ul.emc("TTAD.ToolUtils", "", e7);
                        return bw;
                    }
                }
            } finally {
                ycc.unlock();
            }
        }
        return bw;
    }

    public static Intent emc(Context context, String str) {
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

    private static String sup(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("aid", "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", uym()).toString();
        } catch (Exception e6) {
            com.bytedance.sdk.component.utils.ul.xq("TTAD.ToolUtils", e6.getMessage());
            return str;
        }
    }

    public static void xq() {
        com.bytedance.sdk.openadsdk.vk.xq.emc("recycle_version_not_valid", false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.utils.tp.1
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("method_exist", tp.xmt());
                return com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc("recycle_version_not_valid").ypw(jSONObject.toString());
            }
        });
    }

    public static boolean ycc(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String ypw(int i) {
        if (i == 1) {
            return "embeded_ad_landingpage";
        }
        if (i == 2) {
            return "banner_ad_landingpage";
        }
        if (i == 3) {
            return "interaction_landingpage";
        }
        if (i == 4) {
            return "splash_ad_landingpage";
        }
        if (i == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i != 7) {
            return "unknow";
        }
        return "rewarded_video_landingpage";
    }

    public static boolean zz(String str) {
        if (com.bytedance.sdk.openadsdk.core.qh.bw()) {
            return true;
        }
        com.bytedance.sdk.component.utils.ul.xq(f.m("You must use method '", str, "' after initialization, please check."), new Object[0]);
        return false;
    }

    public static boolean bw(Context context) {
        if (context == null) {
            return false;
        }
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static String xq(String str) throws IOException {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                bufferedReader = new BufferedReader(fileReader, 4096);
                do {
                    try {
                        line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            com.bytedance.sdk.component.utils.ul.xq("TTAD.ToolUtils", th.getMessage());
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
                String str2 = line.split("\\s+")[1];
                try {
                    bufferedReader.close();
                } catch (Exception unused5) {
                }
                try {
                    fileReader.close();
                } catch (Exception unused6) {
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
            bufferedReader = null;
        }
    }

    public static ypw emc(Context context, Intent intent) {
        return new ypw(null, 0);
    }

    public static boolean emc() {
        return (com.bytedance.sdk.openadsdk.core.cf.emc() == null || com.bytedance.sdk.openadsdk.core.cf.emc().dg()) ? false : true;
    }

    public static void msw(final String str) {
        com.bytedance.sdk.openadsdk.vk.xq.emc();
        com.bytedance.sdk.openadsdk.vk.xq.emc("reportMultiLog", false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.utils.tp.3
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws JSONException {
                if (tp.xq || !com.bytedance.sdk.openadsdk.core.aa.dg().cn()) {
                    return null;
                }
                boolean unused = tp.xq = true;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error", str);
                return com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc("reportMultiLog").ypw(jSONObject.toString());
            }
        });
    }

    public static int ycc(Context context) {
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("TTAD.ToolUtils", th.getMessage());
            return -1;
        }
    }

    public static String emc(int i) {
        if (i == 1) {
            return "embeded_ad";
        }
        if (i == 2) {
            return "banner_ad";
        }
        if (i == 3) {
            return "interaction";
        }
        if (i == 4) {
            return "open_ad";
        }
        if (i == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i != 7) {
            return null;
        }
        return "rewarded_video";
    }

    public static int msw(Context context) {
        return uym(com.bytedance.sdk.component.utils.sb.emc(context, 0L));
    }

    public static int ru(Context context) {
        List<ResolveInfo> listQueryIntentActivities;
        Integer num = emc;
        if (num != null) {
            return num.intValue();
        }
        if (context == null || (listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0)) == null) {
            return 0;
        }
        int size = listQueryIntentActivities.size();
        emc = Integer.valueOf(size);
        return size;
    }

    public static String uym(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", "oppo") : "";
    }

    public static boolean msw(int i) {
        if (i <= 0) {
            return false;
        }
        return i >= 100 || new Random(System.currentTimeMillis()).nextInt(100) + 1 <= i;
    }

    public static int ypw(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        if (rieVar == null) {
            return -1;
        }
        int iMfx = rieVar.mfx();
        int i = 1;
        if (iMfx == 1) {
            return 2;
        }
        if (iMfx == 3) {
            return 4;
        }
        if (iMfx != 5) {
            i = 7;
            if (iMfx != 7) {
                return iMfx != 8 ? -1 : 5;
            }
        }
        return i;
    }

    public static String ypw() {
        String strYpw;
        String str = "unKnow";
        com.bytedance.sdk.openadsdk.multipro.xq.emc(com.bytedance.sdk.openadsdk.core.aa.emc());
        try {
            strYpw = com.bytedance.sdk.openadsdk.multipro.ypw.xq() ? com.bytedance.sdk.openadsdk.multipro.dg.emc.ypw("sp_multi_ua_data", "android_system_ua", "unKnow") : com.bytedance.sdk.openadsdk.core.xq.emc().ypw("android_system_ua", "unKnow");
        } catch (Exception unused) {
        }
        if (strYpw != null && !"unKnow".equals(strYpw)) {
            return strYpw;
        }
        FutureTask futureTask = new FutureTask(new emc(2));
        ypw.execute(futureTask);
        str = (String) futureTask.get(500L, TimeUnit.MILLISECONDS);
        com.bytedance.sdk.component.utils.ul.xq("getUA", " getAndroidSystemUA userAgent".concat(String.valueOf(str)));
        return str;
    }

    public static long uym(Context context) {
        int i = -1;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                i = context.getApplicationInfo().minSdkVersion;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("TTAD.ToolUtils", th.getMessage());
        }
        return i;
    }

    public static void zz(Context context) {
        try {
            AtomicInteger atomicInteger = dg;
            if (atomicInteger.get() != 0) {
                return;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean zIsEnabled = accessibilityManager.isEnabled();
            boolean zIsTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (zIsEnabled && zIsTouchExplorationEnabled) {
                atomicInteger.set(1);
                com.bytedance.sdk.openadsdk.vk.xq.emc().xq();
            } else {
                atomicInteger.set(2);
            }
        } catch (Exception unused) {
            dg.set(2);
        }
    }

    public static String emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        if (rieVar == null) {
            return null;
        }
        try {
            return xq(rieVar.mfx());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String dg(String str) {
        return emc(str, false, false);
    }

    public static boolean dg(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        return rieVar != null && rieVar.sx() == 3 && rieVar.oug() && (rieVar.knr() == 4 || rieVar.knr() == 5);
    }

    public static int emc(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        str.getClass();
        switch (str) {
        }
        return 1;
    }

    public static String emc(Context context) throws IOException {
        String strYpw = com.bytedance.sdk.openadsdk.core.xq.emc().ypw("total_memory", (String) null);
        if (strYpw != null && ypw(strYpw) > 0) {
            return strYpw;
        }
        String strXq = xq("MemTotal");
        if (ypw(strXq) <= 0) {
            strXq = zz();
        }
        com.bytedance.sdk.openadsdk.core.xq.emc().emc("total_memory", strXq);
        return strXq;
    }

    public static String xq(Context context) {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = context.getResources().getConfiguration().getLocales().get(0);
            } else {
                locale = Locale.getDefault();
            }
            return locale.getLanguage();
        } catch (Exception e6) {
            com.bytedance.sdk.component.utils.ul.xq("TTAD.ToolUtils", e6.toString());
            return "";
        }
    }

    public static long ypw(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static long ypw(Context context) {
        return com.bytedance.sdk.openadsdk.core.xq.emc().ypw("total_internal_storage", 0L).longValue();
    }

    public static String emc(String str, boolean z6, boolean z7) {
        String strSba;
        if (str != null && !str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (z7) {
            strSba = ul();
        } else {
            strSba = sba();
        }
        if (TextUtils.isEmpty(strSba)) {
            strSba = "api16-access-ttp.tiktokpangle.us";
        }
        String strM = f.m("https://", strSba, str);
        if (mkp.emc() && !z6) {
            strM = mkp.emc(strM);
        }
        return z6 ? sup(strM) : strM;
    }

    public static boolean xq(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        if (rieVar == null) {
            return true;
        }
        int iYpw = com.bytedance.sdk.openadsdk.core.aa.dg().ypw(rieVar.tx());
        int iXq = com.bytedance.sdk.component.utils.sba.xq(com.bytedance.sdk.openadsdk.core.aa.emc());
        if (iYpw == 1) {
            return dg(iXq);
        }
        if (iYpw == 2) {
            return bw(iXq) || dg(iXq) || ycc(iXq);
        }
        if (iYpw != 3) {
            return iYpw != 5 || dg(iXq) || ycc(iXq);
        }
        return false;
    }

    public static JSONObject emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, long j6, b bVar) throws JSONException {
        if (rieVar == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("creative_id", rieVar.ye());
            jSONObject.put("buffers_time", j6);
            c cVarIat = rieVar.iat();
            if (cVarIat != null) {
                jSONObject.put("video_size", cVarIat.f6582c);
                jSONObject.put("video_resolution", cVarIat.f6584e);
            }
            emc(jSONObject, bVar);
            return jSONObject;
        } catch (JSONException e6) {
            com.bytedance.sdk.component.utils.ul.emc("TTAD.ToolUtils", "getVideoAction json error", e6);
            return jSONObject;
        }
    }

    private static void emc(JSONObject jSONObject, b bVar) {
        if (jSONObject.has("video_resolution") || bVar == null) {
            return;
        }
        try {
            jSONObject.put("video_resolution", String.format(Locale.getDefault(), "%d×%d", Integer.valueOf(bVar.dg()), Integer.valueOf(bVar.bw())));
        } catch (Throwable unused) {
        }
    }

    public static void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, String str) {
        if (rieVar != null) {
            try {
                String strXst = rieVar.xst();
                if (TextUtils.isEmpty(strXst) && rieVar.kda() != null && rieVar.kda().xq() == 1 && !TextUtils.isEmpty(rieVar.kda().ypw())) {
                    strXst = rieVar.kda().ypw();
                }
                String str2 = strXst;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.iyl.emc(com.bytedance.sdk.openadsdk.core.aa.emc(), str2, rieVar, emc(str), str, false);
            } catch (Throwable unused) {
            }
        }
    }

    public static void emc(String str, String str2, Context context) {
        int i;
        if (TextUtils.isEmpty(str2) || !bw(context)) {
            return;
        }
        int length = str2.length();
        int i3 = 1;
        if (length % 3572 == 0) {
            i = length / 3572;
        } else {
            i = (length / 3572) + 1;
        }
        int i6 = 3572;
        int i7 = 0;
        while (i3 <= i) {
            if (i6 < length) {
                Log.d(str, i + "-" + i3 + ":" + str2.substring(i7, i6));
                i3++;
                i7 = i6;
                i6 += 3572;
            } else {
                Log.d(str, i + "-" + i3 + ":" + str2.substring(i7));
                return;
            }
        }
    }

    public static void emc(StringBuilder sb, String str, String str2) {
        int iIndexOf;
        if (sb == null || TextUtils.isEmpty(str) || (iIndexOf = sb.indexOf(str)) <= 0) {
            return;
        }
        sb.replace(iIndexOf, str.length() + iIndexOf, str2);
    }

    public static com.bytedance.sdk.openadsdk.common.bw emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, com.bytedance.sdk.component.zz.ycc yccVar, Context context, String str) {
        int iKnr = rieVar.knr();
        if (!rieVar.oug()) {
            return null;
        }
        if (iKnr != 1 && iKnr != 3) {
            return null;
        }
        yccVar.emc(true, (View) new com.bytedance.sdk.openadsdk.common.dg(context));
        return new com.bytedance.sdk.openadsdk.common.bw(rieVar, yccVar, str, false);
    }

    public static void emc(JSONObject jSONObject) {
        int iIntValue;
        try {
            Pair<String, Long> pairDg = com.bytedance.sdk.openadsdk.core.zz.dg("oem_store");
            int i = -1;
            if (pairDg != null && ((iIntValue = Integer.valueOf((String) pairDg.first).intValue()) != -2 || System.currentTimeMillis() - ((Long) pairDg.second).longValue() < com.bytedance.sdk.openadsdk.sra.emc.emc("oem_store_state_time", 259200000))) {
                i = iIntValue;
            }
            jSONObject.put("oem_store", i);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("TTAD.ToolUtils", th.getMessage());
        }
    }

    public static void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, com.bytedance.sdk.component.zz.ycc yccVar) {
        emc(rieVar, yccVar, false);
    }

    public static void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, com.bytedance.sdk.component.zz.ycc yccVar, boolean z6) {
        com.bytedance.sdk.component.zz.ycc yccVar2;
        com.bytedance.sdk.openadsdk.core.model.msw mswVarEe;
        List<Integer> list;
        if (rieVar == null || yccVar == null) {
            return;
        }
        int iKnr = rieVar.knr();
        if (!rieVar.oug() || (!(iKnr == 2 || iKnr == 3 || iKnr == 5) || (mswVarEe = rieVar.ee()) == null)) {
            yccVar2 = yccVar;
        } else {
            List<Integer> listYcc = mswVarEe.ycc();
            ArrayList arrayList = new ArrayList();
            if (z6) {
                for (int i = 0; i < listYcc.size(); i++) {
                    arrayList.add(Integer.valueOf(listYcc.get(i).intValue() - 1));
                }
                list = arrayList;
            } else {
                list = listYcc;
            }
            yccVar2 = yccVar;
            yccVar2.emc(true, mswVarEe.dg(), mswVarEe.bw(), list, mswVarEe.uym(), mswVarEe.xq());
        }
        int iLtf = rieVar.ltf();
        long jOt = rieVar.ot();
        if ((iLtf == 1 || iLtf == 2) && jOt > 0) {
            yccVar2.emc(iLtf, jOt);
        }
    }

    public static int emc(WebView webView) {
        if (webView == null) {
            return -1;
        }
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            int size = webBackForwardListCopyBackForwardList.getSize();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i);
                if (itemAtIndex != null) {
                    String url = itemAtIndex.getUrl();
                    if (!arrayList.contains(url)) {
                        arrayList.add(url);
                    }
                }
            }
            return arrayList.indexOf(webView.getUrl()) + 1;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("TTAD.ToolUtils", th.toString());
            return -1;
        }
    }

    public static JSONObject emc(AdSlot adSlot) {
        JSONObject jSONObject = new JSONObject();
        if (adSlot != null) {
            try {
                jSONObject.put("is_sb", !TextUtils.isEmpty(adSlot.getBidAdm()));
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }
}
