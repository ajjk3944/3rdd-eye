package com.liuzh.deviceinfo.utilities;

import android.app.Activity;
import android.app.UiModeManager;
import android.appwidget.AppWidgetManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import android.widget.Toast;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.common.WebViewActivity;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f21252a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f21253b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f21254c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f21255d;

    static {
        int i4 = Build.VERSION.SDK_INT;
        f21252a = i4 >= 29;
        f21253b = i4 >= 26;
        f21254c = i4 >= 24;
        f21255d = null;
    }

    public static CharSequence a(int i4) throws Resources.NotFoundException {
        List listS;
        DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
        nk.k.e(deviceInfoApp, "ctx");
        int i10 = i4 - 1;
        String[] stringArray = deviceInfoApp.getResources().getStringArray(R.array.android_version_names);
        nk.k.d(stringArray, "getStringArray(...)");
        if (i10 < 0 || i10 >= stringArray.length) {
            String string = deviceInfoApp.getString(R.string.bu_unknown);
            nk.k.d(string, "getString(...)");
            return string;
        }
        String str = stringArray[i10];
        Pattern patternCompile = Pattern.compile(" ");
        nk.k.d(patternCompile, "compile(...)");
        nk.k.e(str, "input");
        Matcher matcher = patternCompile.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(iEnd, str.length()).toString());
            listS = arrayList;
        } else {
            listS = cm.g.s(str.toString());
        }
        String str2 = ((String[]) listS.toArray(new String[0]))[r0.length - 1];
        if (!vk.p.q0(str2, "mr1") && !vk.p.q0(str2, "mr2")) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new RelativeSizeSpan(0.7f), vk.i.F0(str, str2, 0, false, 6), str.length(), 0);
        return spannableString;
    }

    public static String b(int i4) throws Resources.NotFoundException {
        DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
        nk.k.e(deviceInfoApp, "ctx");
        int i10 = i4 - 1;
        String[] stringArray = deviceInfoApp.getResources().getStringArray(R.array.android_version_number);
        nk.k.d(stringArray, "getStringArray(...)");
        if (i10 >= 0 && i10 < stringArray.length) {
            return stringArray[i10];
        }
        String string = deviceInfoApp.getString(R.string.bu_unknown);
        nk.k.d(string, "getString(...)");
        return string;
    }

    public static void c(Context context) {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        StringBuilder sb2 = new StringBuilder("\n\n\n\nMODEL = ");
        sb2.append(Build.MODEL);
        sb2.append("_");
        sb2.append(Build.BRAND);
        sb2.append("_");
        sb2.append(Build.PRODUCT);
        sb2.append("\nOS = ");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append("\nVERSION = v3.0.1.0_327\nSCREEN  = ");
        sb2.append(displayMetrics.widthPixels);
        sb2.append("x");
        String strJ = r5.c.j(displayMetrics.heightPixels, "\nAPP = com.liuzh.deviceinfo", sb2);
        Intent intentAddFlags = new Intent("android.intent.action.SENDTO").setData(Uri.parse("mailto:support@liuzhosoft.com")).addFlags(268435456);
        if (!TextUtils.isEmpty(strJ)) {
            intentAddFlags.putExtra("android.intent.extra.TEXT", strJ);
        }
        try {
            context.startActivity(intentAddFlags);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, R.string.activity_not_found, 0).show();
        }
    }

    public static void d(i.g gVar) {
        if (l(gVar)) {
            return;
        }
        gVar.getWindow().getDecorView().setSystemUiVisibility(5894);
        g(gVar);
    }

    public static String e(double d10) {
        String str;
        f fVar = f.f21256b;
        if (f.f21257c.getInt("distance_unit", 0) == 0) {
            str = "m";
        } else if (d10 > 1200.0d) {
            d10 = (d10 * 1.0936d) / 1760.0d;
            str = "mi";
        } else {
            d10 *= 1.0936d;
            str = "yd";
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setRoundingMode(RoundingMode.CEILING);
        return decimalFormat.format(d10) + " " + str;
    }

    public static String f(float f10) {
        String str;
        f fVar = f.f21256b;
        if (f.f21257c.getInt("temperature_unit", 0) == 0) {
            str = "℃";
        } else {
            f10 = (f10 * 1.8f) + 32.0f;
            str = "℉";
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        decimalFormat.setRoundingMode(RoundingMode.CEILING);
        return decimalFormat.format(f10) + str;
    }

    public static void g(i.g gVar) {
        WindowManager.LayoutParams attributes = gVar.getWindow().getAttributes();
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        gVar.getWindow().setAttributes(attributes);
    }

    public static String h() {
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        return f10 >= 4.0f ? "xxxhdpi" : f10 >= 3.0f ? "xxhdpi" : f10 >= 2.0f ? "xhdpi" : ((double) f10) >= 1.5d ? "hdpi" : f10 >= 1.0f ? "mdpi" : "ldpi";
    }

    public static float i() {
        Point point = new Point();
        WindowManager windowManager = (WindowManager) DeviceInfoApp.f21145f.getSystemService("window");
        if (windowManager == null) {
            return 0.0f;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        defaultDisplay.getRealSize(point);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        float f10 = point.x / displayMetrics.xdpi;
        return (float) Math.sqrt(Math.pow(point.y / displayMetrics.ydpi, 2.0d) + Math.pow(f10, 2.0d));
    }

    public static void j(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "DevInfo";
        }
        String strConcat = "&referrer=utm_source=com.liuzh.deviceinfo&utm_medium=".concat(str2);
        Intent intentAddFlags = new Intent("android.intent.action.VIEW").setData(Uri.parse("market://details?id=" + str + strConcat)).addFlags(268435456);
        try {
            try {
                context.startActivity(intentAddFlags);
            } catch (ActivityNotFoundException unused) {
                context.startActivity(intentAddFlags.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + str + strConcat)));
            }
        } catch (ActivityNotFoundException unused2) {
            Toast.makeText(context, R.string.activity_not_found, 0).show();
        }
    }

    public static boolean k() {
        Boolean bool = f21255d;
        if (bool != null) {
            return bool.booleanValue();
        }
        DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
        UiModeManager uiModeManager = (UiModeManager) deviceInfoApp.getSystemService("uimode");
        boolean zHasSystemFeature = deviceInfoApp.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
        if (uiModeManager == null) {
            f21255d = Boolean.valueOf(zHasSystemFeature);
        } else {
            f21255d = Boolean.valueOf(uiModeManager.getCurrentModeType() == 4 || zHasSystemFeature);
        }
        return f21255d.booleanValue();
    }

    public static boolean l(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }

    public static boolean m() {
        return (Resources.getSystem().getConfiguration().uiMode & 48) == 32;
    }

    public static void n(Context context) {
        String str = c.f21250c;
        String string = context.getString(R.string.privacy_policy);
        int i4 = WebViewActivity.C;
        Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
        intent.putExtra("url", str);
        intent.putExtra("title", string);
        context.startActivity(intent);
    }

    public static void o(Context context) {
        String str = c.f21251d;
        String string = context.getString(R.string.term_of_service);
        int i4 = WebViewActivity.C;
        Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
        intent.putExtra("url", str);
        intent.putExtra("title", string);
        context.startActivity(intent);
    }

    public static int p(float f10, DisplayMetrics displayMetrics) {
        return Math.round(TypedValue.applyDimension(1, f10, displayMetrics));
    }

    public static int q(float f10, DisplayMetrics displayMetrics) {
        return Math.round(TypedValue.applyDimension(2, f10, displayMetrics));
    }

    public static void r(LayerDrawable layerDrawable, int i4) {
        layerDrawable.findDrawableByLayerId(R.id.src).setTint(i4);
        Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.colored);
        f fVar = f.f21256b;
        if (f.h()) {
            drawableFindDrawableByLayerId.setTint(dj.b.a(0.7f, i4, -16777216));
        } else {
            drawableFindDrawableByLayerId.setTint(dj.b.a(0.4f, i4, -1));
        }
    }

    public static void s(Class cls) {
        DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
        try {
            int[] appWidgetIds = AppWidgetManager.getInstance(deviceInfoApp).getAppWidgetIds(new ComponentName(deviceInfoApp, (Class<?>) cls));
            if (appWidgetIds != null && appWidgetIds.length != 0) {
                Intent intent = new Intent(deviceInfoApp, (Class<?>) cls);
                intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
                intent.putExtra("appWidgetIds", appWidgetIds);
                deviceInfoApp.sendBroadcast(intent);
            }
        } catch (RuntimeException unused) {
        }
    }
}
