package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno {
    private static final AtomicReference<Boolean> ouw = new AtomicReference<>(null);
    private static final AtomicReference<String> vt = new AtomicReference<>(null);

    private static PackageInfo bly(Context context) {
        try {
            String str = Build.VERSION.SDK_INT <= 23 ? (String) Class.forName("android.webkit.WebViewFactory").getMethod("getWebViewPackageName", null).invoke(null, null) : (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean cf() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName("com.samsung.android.feature.SemFloatingFeature");
            Object objInvoke = cls.getMethod("getInstance", null).invoke(null, null);
            Method declaredMethod = cls.getDeclaredMethod("getString", String.class);
            if ("TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FOLD"))) {
                return true;
            }
            return "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FLIP"));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            com.bytedance.sdk.component.utils.qbp.lh("PAG_BANNER", "get ss fold device error: " + e2.getMessage());
            return false;
        }
    }

    private static boolean fkw(Context context) throws ClassNotFoundException {
        try {
            Class.forName("com.facebook.react.ReactActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libreactnativejni.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    private static String le(Context context) {
        try {
            return String.valueOf(context.getApplicationInfo().targetSdkVersion);
        } catch (Throwable unused) {
            return "";
        }
    }

    private static boolean lh(Context context) throws ClassNotFoundException {
        try {
            Class.forName("com.unity3d.player.UnityPlayerActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libunity.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    private static String mwh() {
        return com.bytedance.sdk.openadsdk.vpp.ouw.ouw("fold_config", "fold_default", "");
    }

    public static void ouw(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (ryl()) {
                com.bytedance.sdk.openadsdk.core.lh.ouw();
                com.bytedance.sdk.openadsdk.core.lh.ouw("w_ver", ra(context));
                com.bytedance.sdk.openadsdk.core.lh.ouw("bp", vt(context));
                com.bytedance.sdk.openadsdk.core.lh.ouw("is_fold", vt() ? 1 : 0);
                com.bytedance.sdk.openadsdk.core.lh.ouw("abi", tlj());
                com.bytedance.sdk.openadsdk.core.lh.ouw("t_ver", le(context));
                com.bytedance.sdk.openadsdk.core.lh.ouw("aab", ouw());
            }
        } catch (Throwable unused) {
        }
    }

    private static PackageInfo pno(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                return WebView.getCurrentWebViewPackage();
            }
            PackageInfo packageInfo = (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
            return packageInfo != null ? packageInfo : bly(context);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static String ra(Context context) {
        try {
            AtomicReference<String> atomicReference = vt;
            String str = atomicReference.get();
            if (str != null) {
                return str;
            }
            PackageInfo packageInfoPno = pno(context);
            String str2 = packageInfoPno != null ? packageInfoPno.versionName : "";
            while (!atomicReference.compareAndSet(null, str2) && atomicReference.get() == null) {
            }
            return str2;
        } catch (Throwable unused) {
            AtomicReference<String> atomicReference2 = vt;
            while (!atomicReference2.compareAndSet(null, "") && atomicReference2.get() == null) {
            }
            return "";
        }
    }

    private static boolean ryl() {
        return com.bytedance.sdk.openadsdk.vpp.ouw.ouw("fold_config", "enable", 0) == 1;
    }

    private static String tlj() {
        try {
            return Build.SUPPORTED_ABIS[0];
        } catch (Exception unused) {
            return "";
        }
    }

    private static int vt(Context context) {
        if (lh(context)) {
            return 1;
        }
        if (yu(context)) {
            return 2;
        }
        return fkw(context) ? 3 : 4;
    }

    private static boolean yu(Context context) throws ClassNotFoundException {
        try {
            Class.forName("io.flutter.embedding.android.FlutterActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libflutter.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    private static boolean fkw() {
        if (le()) {
            return true;
        }
        String[] strArr = {"V2330", "V2178A", "V2229A", "V2303A", "V2337A", "V2256A", "V2266A"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i4 = 0; i4 < 7; i4++) {
                    if (lowerCase.contains(strArr[i4].toLowerCase())) {
                        return true;
                    }
                }
                if (ryl()) {
                    String strMwh = mwh();
                    if (TextUtils.isEmpty(strMwh)) {
                        return false;
                    }
                    for (String str : strMwh.split(",")) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean le() {
        try {
            return "foldable".equals(Class.forName("android.util.FtDeviceInfo").getMethod("getDeviceType", null).invoke(null, null));
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("BED", "isVIVOFoldDevice return false " + th2.getMessage());
            return false;
        }
    }

    private static boolean lh() {
        String lowerCase;
        if (cf()) {
            return true;
        }
        String[] strArr = {"sm-f9000", "sm-f9160", "sm-f9260", "sm-f9360", "sm-f9460", "sm-f9560", "sm-f7000", "sm-f7070", "sm-f7110", "sm-f7210", "sm-f7310", "sm-f7410"};
        String[] strArr2 = {"winner", "f2q", "q2q", "q4q", "q5q", "q6q", "bloomq", "bloomxq", "b2q", "b4q", "b5q", "b6q"};
        try {
            String lowerCase2 = Build.DEVICE.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase2)) {
                for (int i4 = 0; i4 < 12; i4++) {
                    if (lowerCase2.contains(strArr2[i4])) {
                        return true;
                    }
                }
            }
            lowerCase = Build.MODEL.toLowerCase();
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(lowerCase)) {
            return false;
        }
        for (int i10 = 0; i10 < 12; i10++) {
            if (lowerCase.contains(strArr[i10])) {
                return true;
            }
        }
        if (ryl()) {
            String strOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("fold_config", "fold_samung", "");
            if (TextUtils.isEmpty(strOuw)) {
                return false;
            }
            for (String str : strOuw.split(",")) {
                if (lowerCase.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0057. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean vt() {
        /*
            r0 = 0
            r1 = 0
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r2 = com.bytedance.sdk.openadsdk.utils.pno.ouw     // Catch: java.lang.Throwable -> Ldd
            java.lang.Object r3 = r2.get()     // Catch: java.lang.Throwable -> Ldd
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> Ldd
            if (r3 == 0) goto L11
            boolean r0 = r3.booleanValue()     // Catch: java.lang.Throwable -> Ldd
            return r0
        L11:
            java.lang.String r3 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> Ldd
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Ldd
            if (r4 != 0) goto L1d
            java.lang.String r3 = r3.toLowerCase()     // Catch: java.lang.Throwable -> Ldd
        L1d:
            java.lang.String r4 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> Ldd
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Ldd
            if (r5 != 0) goto L29
            java.lang.String r4 = r4.toLowerCase()     // Catch: java.lang.Throwable -> Ldd
        L29:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Ldd
            if (r5 == 0) goto L45
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Ldd
            if (r5 == 0) goto L45
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Ldd
        L37:
            boolean r4 = r2.compareAndSet(r0, r3)     // Catch: java.lang.Throwable -> Ldd
            if (r4 == 0) goto L3e
            goto L44
        L3e:
            java.lang.Object r4 = r2.get()     // Catch: java.lang.Throwable -> Ldd
            if (r4 == 0) goto L37
        L44:
            return r1
        L45:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r6 = "xiaomi"
            java.lang.String r7 = "oppo"
            java.lang.String r8 = "vivo"
            java.lang.String r9 = "samsung"
            if (r5 != 0) goto L8c
            int r5 = r3.hashCode()     // Catch: java.lang.Throwable -> Ldd
            switch(r5) {
                case -759499589: goto L7e;
                case 3418016: goto L73;
                case 3620012: goto L68;
                case 1864941562: goto L5b;
                default: goto L5a;
            }     // Catch: java.lang.Throwable -> Ldd
        L5a:
            goto L89
        L5b:
            boolean r3 = r3.equals(r9)     // Catch: java.lang.Throwable -> Ldd
            if (r3 == 0) goto L89
            boolean r3 = lh()     // Catch: java.lang.Throwable -> Ldd
        L65:
            r5 = r3
            r3 = r1
            goto L8e
        L68:
            boolean r3 = r3.equals(r8)     // Catch: java.lang.Throwable -> Ldd
            if (r3 == 0) goto L89
            boolean r3 = fkw()     // Catch: java.lang.Throwable -> Ldd
            goto L65
        L73:
            boolean r3 = r3.equals(r7)     // Catch: java.lang.Throwable -> Ldd
            if (r3 == 0) goto L89
            boolean r3 = pno()     // Catch: java.lang.Throwable -> Ldd
            goto L65
        L7e:
            boolean r3 = r3.equals(r6)     // Catch: java.lang.Throwable -> Ldd
            if (r3 == 0) goto L89
            boolean r3 = yu()     // Catch: java.lang.Throwable -> Ldd
            goto L65
        L89:
            r3 = 1
            r5 = r1
            goto L8e
        L8c:
            r3 = r1
            r5 = r3
        L8e:
            if (r3 == 0) goto Lcb
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Ldd
            if (r3 != 0) goto Lcb
            int r3 = r4.hashCode()     // Catch: java.lang.Throwable -> Ldd
            switch(r3) {
                case -759499589: goto Lbf;
                case 3418016: goto Lb4;
                case 3620012: goto La9;
                case 1864941562: goto L9e;
                default: goto L9d;
            }     // Catch: java.lang.Throwable -> Ldd
        L9d:
            goto Lca
        L9e:
            boolean r3 = r4.equals(r9)     // Catch: java.lang.Throwable -> Ldd
            if (r3 == 0) goto Lca
            boolean r5 = lh()     // Catch: java.lang.Throwable -> Ldd
            goto Lcb
        La9:
            boolean r3 = r4.equals(r8)     // Catch: java.lang.Throwable -> Ldd
            if (r3 == 0) goto Lca
            boolean r5 = fkw()     // Catch: java.lang.Throwable -> Ldd
            goto Lcb
        Lb4:
            boolean r3 = r4.equals(r7)     // Catch: java.lang.Throwable -> Ldd
            if (r3 == 0) goto Lca
            boolean r5 = pno()     // Catch: java.lang.Throwable -> Ldd
            goto Lcb
        Lbf:
            boolean r3 = r4.equals(r6)     // Catch: java.lang.Throwable -> Ldd
            if (r3 == 0) goto Lca
            boolean r5 = yu()     // Catch: java.lang.Throwable -> Ldd
            goto Lcb
        Lca:
            r5 = r1
        Lcb:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> Ldd
        Lcf:
            boolean r4 = r2.compareAndSet(r0, r3)     // Catch: java.lang.Throwable -> Ldd
            if (r4 == 0) goto Ld6
            return r5
        Ld6:
            java.lang.Object r4 = r2.get()     // Catch: java.lang.Throwable -> Ldd
            if (r4 == 0) goto Lcf
            return r5
        Ldd:
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r2 = com.bytedance.sdk.openadsdk.utils.pno.ouw
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
        Le1:
            boolean r4 = r2.compareAndSet(r0, r3)
            if (r4 == 0) goto Le8
            goto Lee
        Le8:
            java.lang.Object r4 = r2.get()
            if (r4 == 0) goto Le1
        Lee:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.pno.vt():boolean");
    }

    private static boolean yu() {
        if (ra()) {
            return true;
        }
        String[] strArr = {"M2011J18C", "22061218C", "2308CPXD0C", "24072PX77C", "2405CPX3DC", "2405CPX3DG"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i4 = 0; i4 < 6; i4++) {
                    if (lowerCase.contains(strArr[i4])) {
                        return true;
                    }
                }
                if (ryl()) {
                    String strMwh = mwh();
                    if (TextUtils.isEmpty(strMwh)) {
                        return false;
                    }
                    for (String str : strMwh.split(",")) {
                        if (lowerCase.contains(str)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean ra() {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("BED", "isXiaomiFold return false " + th2.getMessage());
            return false;
        }
    }

    private static boolean pno() {
        if (bly()) {
            return true;
        }
        String[] strArr = {"CPH2439", "CPH2437", "CPH2499", "CPH2519", "PEUM00", "PGU110", "PGT110", "PHN110", "PHT110"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i4 = 0; i4 < 9; i4++) {
                    if (lowerCase.contains(strArr[i4].toLowerCase())) {
                        return true;
                    }
                }
                if (ryl()) {
                    String strMwh = mwh();
                    if (TextUtils.isEmpty(strMwh)) {
                        return false;
                    }
                    for (String str : strMwh.split(",")) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean bly() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object objInvoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod("getInstance", null).invoke(null, null), "oplus.hardware.type.fold");
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
        } catch (ClassNotFoundException e2) {
            e = e2;
            com.bytedance.sdk.component.utils.qbp.lh("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (IllegalAccessException e10) {
            e = e10;
            com.bytedance.sdk.component.utils.qbp.lh("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (NoSuchMethodException e11) {
            e = e11;
            com.bytedance.sdk.component.utils.qbp.lh("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (InvocationTargetException e12) {
            e = e12;
            com.bytedance.sdk.component.utils.qbp.lh("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (Throwable unused) {
        }
        return false;
    }

    private static int ouw() throws ClassNotFoundException {
        try {
            Class.forName("com.google.android.play.core.splitinstall.SplitInstallManager");
            return 1;
        } catch (ClassNotFoundException unused) {
            return 0;
        }
    }

    public static void ouw(JSONObject jSONObject, Context context) {
        if (context == null) {
            return;
        }
        try {
            if (ryl()) {
                com.bytedance.sdk.openadsdk.core.lh.ouw();
                String strVt = com.bytedance.sdk.openadsdk.core.lh.vt("md", com.bytedance.sdk.openadsdk.core.bly.ouw().ra());
                if (!TextUtils.isEmpty(strVt)) {
                    jSONObject.put("md", strVt);
                }
                int iVt = com.bytedance.sdk.openadsdk.core.lh.vt("bp", vt(context));
                if (iVt != 4) {
                    jSONObject.put("bp", iVt);
                }
                String strVt2 = com.bytedance.sdk.openadsdk.core.lh.vt("t_ver", le(context));
                if (!TextUtils.isEmpty(strVt2)) {
                    jSONObject.put("t_ver", strVt2);
                }
                jSONObject.put("is_fold", com.bytedance.sdk.openadsdk.core.lh.vt("is_fold", vt() ? 1 : 0));
                jSONObject.put("aab", com.bytedance.sdk.openadsdk.core.lh.vt("aab", ouw()));
                String strVt3 = com.bytedance.sdk.openadsdk.core.lh.vt("w_ver", ra(context));
                if (!TextUtils.isEmpty(strVt3)) {
                    jSONObject.put("w_ver", strVt3);
                }
                String strVt4 = com.bytedance.sdk.openadsdk.core.lh.vt("abi", tlj());
                if (TextUtils.isEmpty(strVt4)) {
                    return;
                }
                jSONObject.put("abi", strVt4);
            }
        } catch (Throwable unused) {
        }
    }
}
