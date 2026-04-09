package com.pgl.ssdk;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import java.io.File;

/* loaded from: classes3.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private static String f19945a;

    /* renamed from: b, reason: collision with root package name */
    private static String f19946b;

    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TextUtils.isEmpty(w.f19946b)) {
                String unused = w.f19946b = w.d();
                ax.b(z.a(), "romtype", w.f19946b);
            }
        }
    }

    private static boolean c(String str) {
        try {
            return new File(str).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d() {
        return (b("com.samsung.android.knox.SemPersonaManager") || b("com.samsung.android.knoxguard.KnoxGuardManager")) ? "samsung" : (b("androidhnext.Manifest") || b("androidhnext.R")) ? "honor" : (b("androidhwext.Manifest") || b("androidhwext.R")) ? "huawei" : (b("oppo.Manifest") || b("oppo.R") || b("oplus.Manifest") || b("oplus.R") || b("com.oneplus.Manifest") || b("com.oneplus.R")) ? "oppo" : (b("vivo.Manifest") || b("vivo.R")) ? "vivo" : (b("miui.Manifest") || b("miui.R") || b("miui.os.Build")) ? "xiaomi" : (b("lineageos.platform.Manifest") || b("lineageos.platform.R")) ? "lineage" : c("/system/framework/com.motorola.motosignature.jar") ? "moto" : (c("/system/framework/transsion-framework.jar") || c("/system/framework/transsion-services.jar")) ? "transsion" : "other";
    }

    private static boolean b(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String c() {
        if (!TextUtils.isEmpty(f19946b)) {
            return f19946b;
        }
        String strA = ax.a(z.a(), "romtype", (String) null);
        f19946b = strA;
        if (!TextUtils.isEmpty(strA)) {
            return f19946b;
        }
        ar.b(new a());
        return "";
    }

    public static String a(Context context) {
        String str = f19945a;
        if (str != null) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            f19945a = Settings.Global.getString(context.getContentResolver(), "boot_count");
        } else {
            f19945a = "lowapi";
        }
        return f19945a;
    }
}
