package com.pgl.ssdk;

import android.content.Context;
import android.content.res.Configuration;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes3.dex */
public class ae {

    /* renamed from: a, reason: collision with root package name */
    public static int f19816a;

    /* renamed from: b, reason: collision with root package name */
    public static int f19817b;

    /* renamed from: c, reason: collision with root package name */
    public static int f19818c;

    /* renamed from: d, reason: collision with root package name */
    public static int f19819d;

    /* renamed from: e, reason: collision with root package name */
    public static int f19820e;

    /* renamed from: f, reason: collision with root package name */
    private static int f19821f;

    /* renamed from: g, reason: collision with root package name */
    private static int f19822g;

    /* renamed from: h, reason: collision with root package name */
    private static int f19823h;

    public static int a(Context context) {
        try {
            Configuration configuration = context.getResources().getConfiguration();
            if (configuration != null) {
                return configuration.touchscreen;
            }
            return 666666;
        } catch (Throwable unused) {
            return 666666;
        }
    }

    private static void b(Context context) {
        if (context == null) {
            return;
        }
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f19821f = (int) displayMetrics.density;
            f19820e = displayMetrics.densityDpi;
        } catch (Throwable unused) {
        }
    }

    private static void c(Context context) {
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f19822g = (int) displayMetrics.xdpi;
            f19823h = (int) displayMetrics.ydpi;
        } catch (Throwable unused) {
        }
    }

    private static void d(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            f19816a = displayMetrics.widthPixels;
            f19817b = displayMetrics.heightPixels;
            Display.Mode mode = defaultDisplay.getMode();
            f19818c = mode.getPhysicalWidth();
            f19819d = mode.getPhysicalHeight();
        } catch (Throwable unused) {
        }
    }

    public static String e(Context context) {
        int i10 = -1;
        if (context != null) {
            try {
                i10 = Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
            } catch (Throwable unused) {
            }
        }
        return String.valueOf(i10);
    }

    public static String f(Context context) {
        try {
            d(context);
            b(context);
            c(context);
        } catch (Throwable unused) {
        }
        return f19820e + "[<!>]" + f19816a + "," + f19817b + "[<!>]" + f19818c + "x" + f19819d + "[<!>]";
    }
}
