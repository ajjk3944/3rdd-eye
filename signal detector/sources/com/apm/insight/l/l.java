package com.apm.insight.l;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.util.Locale;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final CharSequence f6312a = "amigo";

    /* renamed from: b, reason: collision with root package name */
    private static final CharSequence f6313b = "funtouch";

    public static String a() {
        String string;
        if (d.b()) {
            if (!d.b()) {
                return "";
            }
            return "miui_" + a("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
        }
        if (d.c()) {
            String str = Build.DISPLAY;
            return (str == null || !str.toLowerCase(Locale.getDefault()).contains("flyme")) ? "" : str;
        }
        if (b()) {
            if (!b()) {
                return "";
            }
            return "coloros_" + a("ro.build.version.opporom") + "_" + Build.DISPLAY;
        }
        String strA = d.a();
        if (strA == null || !strA.toLowerCase(Locale.getDefault()).contains("emotionui")) {
            string = "";
        } else {
            StringBuilder sbB = AbstractC2984e.b(strA, "_");
            sbB.append(Build.DISPLAY);
            string = sbB.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strA2 = a("ro.vivo.os.build.display.id");
        if (!TextUtils.isEmpty(strA2) && strA2.toLowerCase(Locale.getDefault()).contains(f6313b)) {
            return a("ro.vivo.os.build.display.id") + "_" + a("ro.vivo.product.version");
        }
        String str2 = Build.DISPLAY;
        if (!TextUtils.isEmpty(str2) && str2.toLowerCase(Locale.getDefault()).contains(f6312a)) {
            StringBuilder sbB2 = AbstractC2984e.b(str2, "_");
            sbB2.append(a("ro.gn.sv.version"));
            return sbB2.toString();
        }
        String str3 = Build.MANUFACTURER + Build.BRAND;
        if (!TextUtils.isEmpty(str3)) {
            String lowerCase = str3.toLowerCase(Locale.getDefault());
            if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
                return AbstractC1135f5.n(new StringBuilder(), a("ro.build.uiversion"), "_", str2);
            }
        }
        String strN = TextUtils.isEmpty(a("ro.letv.release.version")) ? "" : AbstractC1135f5.n(new StringBuilder("eui_"), a("ro.letv.release.version"), "_", str2);
        return !TextUtils.isEmpty(strN) ? strN : str2;
    }

    private static boolean b() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.toLowerCase(Locale.getDefault()).contains("oppo");
    }

    private static String a(String str) {
        BufferedReader bufferedReader;
        Process processExec;
        String line = "";
        try {
            processExec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
            bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 1024);
        } catch (Throwable unused) {
            bufferedReader = null;
        }
        try {
            line = bufferedReader.readLine();
            processExec.destroy();
            com.apm.insight.a.a((Closeable) bufferedReader);
            return line;
        } catch (Throwable unused2) {
            com.apm.insight.a.a((Closeable) bufferedReader);
            return line;
        }
    }
}
