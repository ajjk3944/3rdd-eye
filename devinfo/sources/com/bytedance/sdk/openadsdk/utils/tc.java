package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.text.TextUtils;
import com.applovin.shadow.okio.Segment;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tc {
    private static String fkw = null;

    /* renamed from: le, reason: collision with root package name */
    private static int f8735le = Integer.MAX_VALUE;
    public static boolean ouw = false;
    public static boolean vt = false;

    /* renamed from: lh, reason: collision with root package name */
    private static final CharSequence f8736lh = "amigo";
    private static final CharSequence yu = "funtouch";
    private static final ConcurrentHashMap<String, String> ra = new ConcurrentHashMap<>();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw implements Callable<String> {
        private final String ouw;

        public ouw(String str) {
            this.ouw = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ String call() throws Exception {
            String str = (String) tc.ra.get(this.ouw);
            if (str != null) {
                return str;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strLh = tc.lh(this.ouw);
            com.bytedance.sdk.component.utils.ko.vt("RomUtils", "property:" + strLh + ", use time :" + (System.currentTimeMillis() - jCurrentTimeMillis));
            if (strLh != null) {
                tc.ra.put(this.ouw, strLh);
            }
            return strLh;
        }
    }

    private static boolean bly() {
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

    private static boolean le() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    public static boolean lh() throws ClassNotFoundException {
        if (!vt) {
            try {
                Class.forName("miui.os.Build");
                ouw = true;
                vt = true;
                return true;
            } catch (Exception unused) {
                vt = true;
            }
        }
        return ouw;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[PHI: r1
  0x0056: PHI (r1v9 java.lang.String) = 
  (r1v1 java.lang.String)
  (r1v0 java.lang.String)
  (r1v0 java.lang.String)
  (r1v0 java.lang.String)
  (r1v0 java.lang.String)
 binds: [B:59:0x0182, B:27:0x007b, B:20:0x0061, B:22:0x006d, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String ouw() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.tc.ouw():java.lang.String");
    }

    private static boolean pno() {
        if (f8735le == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String strFkw = uoy.fkw("kllk");
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(strFkw)) {
                f8735le = 0;
            } else {
                f8735le = 1;
            }
        }
        return f8735le == 1;
    }

    private static String ra() {
        if (le()) {
            try {
                return "smartisan_".concat(String.valueOf(yu("ro.smartisan.version")));
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    public static String yu() {
        return yu("ro.build.version.emui");
    }

    public static boolean vt() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String yu(String str) {
        String str2;
        com.bytedance.sdk.component.utils.ko.ouw("RomUtils", "getSystemPropertyTask() called with: propName = [", str, "]");
        String str3 = ra.get(str);
        if (str3 != null) {
            return str3;
        }
        if (TextUtils.isEmpty("")) {
            final com.bytedance.sdk.component.pno.ra raVar = new com.bytedance.sdk.component.pno.ra(new ouw(str));
            bs.vt(new com.bytedance.sdk.component.pno.pno("_getSystemPropertyTask") { // from class: com.bytedance.sdk.openadsdk.utils.tc.1
                @Override // java.lang.Runnable
                public final void run() {
                    raVar.run();
                }
            });
            str2 = (String) raVar.get(1L, TimeUnit.SECONDS);
        } else {
            str2 = "";
        }
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String lh(String str) throws IOException {
        BufferedReader bufferedReader;
        Throwable th2;
        String line = "";
        Process process = null;
        try {
            try {
                Process processExec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()), Segment.SHARE_MINIMUM);
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
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            com.bytedance.sdk.component.utils.qbp.ouw("ToolUtils", "Unable to read sysprop ".concat(String.valueOf(str)), th2);
                            return line;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e2) {
                                    com.bytedance.sdk.component.utils.qbp.ouw("ToolUtils", "Exception while closing InputStream", e2);
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
            } catch (IOException e10) {
                com.bytedance.sdk.component.utils.qbp.ouw("ToolUtils", "Exception while closing InputStream", e10);
            }
            return line;
        } catch (Throwable th4) {
            bufferedReader = null;
            th2 = th4;
        }
    }

    public static boolean ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            str = yu("ro.build.version.emui");
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || bly();
    }
}
