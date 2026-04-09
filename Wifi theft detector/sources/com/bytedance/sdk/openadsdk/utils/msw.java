package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.lifecycle.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.core.fid.Constants;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class msw {
    private static final AtomicReference<Boolean> emc = new AtomicReference<>(null);
    private static final AtomicReference<String> ypw = new AtomicReference<>(null);

    public static String bw(Context context) {
        try {
            AtomicReference<String> atomicReference = ypw;
            String str = atomicReference.get();
            if (str != null) {
                return str;
            }
            PackageInfo packageInfoYcc = ycc(context);
            String str2 = packageInfoYcc != null ? packageInfoYcc.versionName : "";
            k.a(atomicReference, null, str2);
            return str2;
        } catch (Throwable unused) {
            k.a(ypw, null, "");
            return "";
        }
    }

    public static int dg(Context context) throws ClassNotFoundException {
        try {
            Class.forName("com.google.android.play.core.splitinstall.SplitInstallManager");
            return 1;
        } catch (ClassNotFoundException unused) {
            return 0;
        }
    }

    public static void emc(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (ypw()) {
                com.bytedance.sdk.openadsdk.core.xq xqVarEmc = com.bytedance.sdk.openadsdk.core.xq.emc();
                xqVarEmc.emc("w_ver", bw(context));
                xqVarEmc.emc("bp", ypw(context));
                xqVarEmc.emc("is_fold", uym(context) ? 1 : 0);
                xqVarEmc.emc("abi", emc());
                xqVarEmc.emc("t_ver", xq(context));
                xqVarEmc.emc(CampaignEx.JSON_KEY_AAB, dg(context));
            }
        } catch (Throwable unused) {
        }
    }

    private static PackageInfo gbl(Context context) {
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

    private static boolean msw(Context context) throws ClassNotFoundException {
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

    private static boolean ru(Context context) throws ClassNotFoundException {
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean uym(android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.msw.uym(android.content.Context):boolean");
    }

    public static String xq(Context context) {
        try {
            return String.valueOf(context.getApplicationInfo().targetSdkVersion);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static PackageInfo ycc(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                return WebView.getCurrentWebViewPackage();
            }
            PackageInfo packageInfo = (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
            return packageInfo != null ? packageInfo : gbl(context);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static int ypw(Context context) {
        if (msw(context)) {
            return 1;
        }
        if (zz(context)) {
            return 2;
        }
        return ru(context) ? 3 : 4;
    }

    private static boolean zz(Context context) throws ClassNotFoundException {
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

    private static boolean dg() {
        String lowerCase;
        if (gbl()) {
            return true;
        }
        String[] strArr = {"sm-f9000", "sm-f9160", "sm-f9260", "sm-f9360", "sm-f9460", "sm-f9560", "sm-f7000", "sm-f7070", "sm-f7110", "sm-f7210", "sm-f7310", "sm-f7410"};
        String[] strArr2 = {"winner", "f2q", "q2q", "q4q", "q5q", "q6q", "bloomq", "bloomxq", "b2q", "b4q", "b5q", "b6q"};
        try {
            String lowerCase2 = Build.DEVICE.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase2)) {
                for (int i10 = 0; i10 < 12; i10++) {
                    if (lowerCase2.contains(strArr2[i10])) {
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
        for (int i11 = 0; i11 < 12; i11++) {
            if (lowerCase.contains(strArr[i11])) {
                return true;
            }
        }
        if (ypw()) {
            String strEmc = com.bytedance.sdk.openadsdk.sra.emc.emc("fold_config", "fold_samung", "");
            if (TextUtils.isEmpty(strEmc)) {
                return false;
            }
            for (String str : strEmc.split(",")) {
                if (lowerCase.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean msw() {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("BED", "isXiaomiFold return false " + th.getMessage());
            return false;
        }
    }

    private static boolean ru() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object objInvoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod(Constants.GET_INSTANCE, null).invoke(null, null), "oplus.hardware.type.fold");
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
        } catch (ClassNotFoundException e10) {
            e = e10;
            com.bytedance.sdk.component.utils.ul.xq("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (IllegalAccessException e11) {
            e = e11;
            com.bytedance.sdk.component.utils.ul.xq("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (NoSuchMethodException e12) {
            e = e12;
            com.bytedance.sdk.component.utils.ul.xq("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (InvocationTargetException e13) {
            e = e13;
            com.bytedance.sdk.component.utils.ul.xq("BED", "get oppo fold properties error, msg: " + e.getMessage());
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String xq() {
        return com.bytedance.sdk.openadsdk.sra.emc.emc("fold_config", "fold_default", "");
    }

    public static boolean ypw() {
        return com.bytedance.sdk.openadsdk.sra.emc.emc("fold_config", "enable", 0) == 1;
    }

    private static boolean zz() {
        if (ru()) {
            return true;
        }
        String[] strArr = {"CPH2439", "CPH2437", "CPH2499", "CPH2519", "PEUM00", "PGU110", "PGT110", "PHN110", "PHT110"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i10 = 0; i10 < 9; i10++) {
                    if (lowerCase.contains(strArr[i10].toLowerCase())) {
                        return true;
                    }
                }
                if (ypw()) {
                    String strXq = xq();
                    if (TextUtils.isEmpty(strXq)) {
                        return false;
                    }
                    for (String str : strXq.split(",")) {
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

    private static boolean bw() {
        if (msw()) {
            return true;
        }
        String[] strArr = {"M2011J18C", "22061218C", "2308CPXD0C", "24072PX77C", "2405CPX3DC", "2405CPX3DG"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i10 = 0; i10 < 6; i10++) {
                    if (lowerCase.contains(strArr[i10])) {
                        return true;
                    }
                }
                if (ypw()) {
                    String strXq = xq();
                    if (TextUtils.isEmpty(strXq)) {
                        return false;
                    }
                    for (String str : strXq.split(",")) {
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

    private static boolean ycc() {
        if (uym()) {
            return true;
        }
        String[] strArr = {"V2330", "V2178A", "V2229A", "V2303A", "V2337A", "V2256A", "V2266A"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i10 = 0; i10 < 7; i10++) {
                    if (lowerCase.contains(strArr[i10].toLowerCase())) {
                        return true;
                    }
                }
                if (ypw()) {
                    String strXq = xq();
                    if (TextUtils.isEmpty(strXq)) {
                        return false;
                    }
                    for (String str : strXq.split(",")) {
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

    private static boolean gbl() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName("com.samsung.android.feature.SemFloatingFeature");
            Object objInvoke = cls.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
            Method declaredMethod = cls.getDeclaredMethod("getString", String.class);
            if ("TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FOLD"))) {
                return true;
            }
            return "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FLIP"));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            com.bytedance.sdk.component.utils.ul.xq("PAG_BANNER", "get ss fold device error: " + e10.getMessage());
            return false;
        }
    }

    public static String emc() {
        try {
            return Build.SUPPORTED_ABIS[0];
        } catch (Exception unused) {
            return "";
        }
    }

    public static void emc(JSONObject jSONObject, Context context) {
        if (context == null) {
            return;
        }
        try {
            if (ypw()) {
                com.bytedance.sdk.openadsdk.core.xq xqVarEmc = com.bytedance.sdk.openadsdk.core.xq.emc();
                String strYpw = xqVarEmc.ypw("md", com.bytedance.sdk.openadsdk.core.zz.ypw().uym());
                if (!TextUtils.isEmpty(strYpw)) {
                    jSONObject.put("md", strYpw);
                }
                int iYpw = xqVarEmc.ypw("bp", ypw(context));
                if (iYpw != 4) {
                    jSONObject.put("bp", iYpw);
                }
                String strYpw2 = xqVarEmc.ypw("t_ver", xq(context));
                if (!TextUtils.isEmpty(strYpw2)) {
                    jSONObject.put("t_ver", strYpw2);
                }
                jSONObject.put("is_fold", xqVarEmc.ypw("is_fold", uym(context) ? 1 : 0));
                jSONObject.put(CampaignEx.JSON_KEY_AAB, xqVarEmc.ypw(CampaignEx.JSON_KEY_AAB, dg(context)));
                String strYpw3 = xqVarEmc.ypw("w_ver", bw(context));
                if (!TextUtils.isEmpty(strYpw3)) {
                    jSONObject.put("w_ver", strYpw3);
                }
                String strYpw4 = xqVarEmc.ypw("abi", emc());
                if (TextUtils.isEmpty(strYpw4)) {
                    return;
                }
                jSONObject.put("abi", strYpw4);
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean uym() {
        try {
            return "foldable".equals(Class.forName("android.util.FtDeviceInfo").getMethod("getDeviceType", null).invoke(null, null));
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("BED", "isVIVOFoldDevice return false " + th.getMessage());
            return false;
        }
    }
}
