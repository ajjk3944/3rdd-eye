package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public class sb {
    private static String bw = null;
    public static boolean emc = false;
    private static int ycc = Integer.MAX_VALUE;
    public static boolean ypw = false;
    private static final CharSequence xq = "amigo";
    private static final CharSequence dg = "funtouch";
    private static final ConcurrentHashMap<String, String> uym = new ConcurrentHashMap<>();

    public static class emc implements Callable<String> {
        private final String emc;

        public emc(String str) {
            this.emc = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public String call() throws IOException {
            String str = (String) sb.uym.get(this.emc);
            if (str != null) {
                return str;
            }
            System.currentTimeMillis();
            String strXq = sb.xq(this.emc);
            System.currentTimeMillis();
            if (strXq != null) {
                sb.uym.put(this.emc, strXq);
            }
            return strXq;
        }
    }

    public static String aa() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase().contains("flyme")) ? "" : str;
    }

    public static boolean bw() throws ClassNotFoundException {
        if (!ypw) {
            try {
                Class.forName("miui.os.Build");
                emc = true;
                ypw = true;
                return true;
            } catch (Exception unused) {
                ypw = true;
            }
        }
        return emc;
    }

    public static boolean cf() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    public static boolean dg() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    public static String emc() throws JSONException {
        if (!TextUtils.isEmpty(bw)) {
            return bw;
        }
        String strEmc = com.bytedance.sdk.openadsdk.core.zz.emc("sdk_local_rom_info", 604800000L);
        bw = strEmc;
        if (TextUtils.isEmpty(strEmc)) {
            String strSra = sra();
            bw = strSra;
            com.bytedance.sdk.openadsdk.core.zz.emc("sdk_local_rom_info", strSra);
        }
        return bw;
    }

    public static boolean gbl() {
        return !TextUtils.isEmpty(dg("ro.letv.release.version"));
    }

    public static boolean msw() {
        String str = Build.DISPLAY;
        return !TextUtils.isEmpty(str) && str.toLowerCase().contains(xq);
    }

    public static String qh() {
        return dg("ro.build.version.emui");
    }

    public static String ru() {
        if (!gbl()) {
            return "";
        }
        return "eui_" + dg("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    public static boolean sba() {
        if (ycc == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String strUym = tp.uym("kllk");
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(strUym)) {
                ycc = 0;
            } else {
                ycc = 1;
            }
        }
        return ycc == 1;
    }

    private static String sra() {
        if (cf()) {
            return vk();
        }
        if (bw()) {
            return sup();
        }
        if (ypw()) {
            return aa();
        }
        if (sba()) {
            return yzg();
        }
        String strSz = sz();
        if (!TextUtils.isEmpty(strSz)) {
            return strSz;
        }
        if (uym()) {
            return ycc();
        }
        if (msw()) {
            return zz();
        }
        if (dg()) {
            return xq();
        }
        String strRu = ru();
        return !TextUtils.isEmpty(strRu) ? strRu : Build.DISPLAY;
    }

    public static String sup() {
        if (!bw()) {
            return "";
        }
        return "miui_" + dg("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    public static String sz() {
        String strQh = qh();
        if (strQh == null || !strQh.toLowerCase().contains("emotionui")) {
            return "";
        }
        StringBuilder sbB = AbstractC2984e.b(strQh, "_");
        sbB.append(Build.DISPLAY);
        return sbB.toString();
    }

    public static boolean ul() {
        try {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("huawei")) {
                String str2 = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str2)) {
                    return false;
                }
                if (!str2.toLowerCase().startsWith("huawei")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean uym() {
        String strDg = dg("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(strDg) && strDg.toLowerCase().contains(dg);
    }

    public static String vk() {
        if (cf()) {
            try {
                return "smartisan_".concat(String.valueOf(dg("ro.smartisan.version")));
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    public static String xq() {
        return dg("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    public static String ycc() {
        return dg("ro.vivo.os.build.display.id") + "_" + dg("ro.vivo.product.version");
    }

    public static String yzg() {
        if (!sba()) {
            return "";
        }
        return "coloros_" + dg(tp.uym("ro.build.version.kllkrom")) + "_" + Build.DISPLAY;
    }

    public static String zz() {
        return Build.DISPLAY + "_" + dg("ro.gn.sv.version");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String xq(String str) throws IOException {
        BufferedReader bufferedReader;
        Throwable th;
        String line = "";
        Process process = null;
        try {
            try {
                Process processExec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 1024);
                    try {
                        line = bufferedReader.readLine();
                        processExec.exitValue();
                    } catch (IllegalThreadStateException unused) {
                        process = processExec;
                        try {
                            process.destroy();
                        } catch (Throwable unused2) {
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return line;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            com.bytedance.sdk.component.utils.ul.emc("ToolUtils", "Unable to read sysprop ".concat(String.valueOf(str)), th);
                            return line;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e6) {
                                    com.bytedance.sdk.component.utils.ul.emc("ToolUtils", "Exception while closing InputStream", e6);
                                }
                            }
                        }
                    }
                } catch (IllegalThreadStateException unused3) {
                    bufferedReader = null;
                }
            } catch (IllegalThreadStateException unused4) {
                bufferedReader = null;
            }
            try {
                bufferedReader.close();
            } catch (IOException e7) {
                com.bytedance.sdk.component.utils.ul.emc("ToolUtils", "Exception while closing InputStream", e7);
            }
            return line;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    public static boolean ypw() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String dg(String str) {
        String str2;
        String str3 = uym.get(str);
        if (str3 != null) {
            return str3;
        }
        if (!TextUtils.isEmpty("")) {
            str2 = "";
        } else {
            final com.bytedance.sdk.component.msw.uym uymVar = new com.bytedance.sdk.component.msw.uym(new emc(str), 5, 2);
            iyl.ypw(new com.bytedance.sdk.component.msw.msw("_getSystemPropertyTask") { // from class: com.bytedance.sdk.openadsdk.utils.sb.1
                @Override // java.lang.Runnable
                public void run() {
                    uymVar.run();
                }
            });
            str2 = (String) uymVar.get(1L, TimeUnit.SECONDS);
        }
        return str2 == null ? "" : str2;
    }

    public static boolean emc(String str) {
        if (TextUtils.isEmpty(str)) {
            str = qh();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || ul();
    }
}
