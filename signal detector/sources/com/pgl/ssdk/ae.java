package com.pgl.ssdk;

import android.content.Context;
import android.content.res.Configuration;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public class ae {

    /* renamed from: a, reason: collision with root package name */
    public static int f19560a;

    /* renamed from: b, reason: collision with root package name */
    public static int f19561b;

    /* renamed from: c, reason: collision with root package name */
    public static int f19562c;

    /* renamed from: d, reason: collision with root package name */
    public static int f19563d;

    /* renamed from: e, reason: collision with root package name */
    public static int f19564e;

    /* renamed from: f, reason: collision with root package name */
    private static int f19565f;

    /* renamed from: g, reason: collision with root package name */
    private static int f19566g;

    /* renamed from: h, reason: collision with root package name */
    private static int f19567h;

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
            f19565f = (int) displayMetrics.density;
            f19564e = displayMetrics.densityDpi;
        } catch (Throwable unused) {
        }
    }

    private static void c(Context context) {
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f19566g = (int) displayMetrics.xdpi;
            f19567h = (int) displayMetrics.ydpi;
        } catch (Throwable unused) {
        }
    }

    private static void d(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            f19560a = displayMetrics.widthPixels;
            f19561b = displayMetrics.heightPixels;
            Display.Mode mode = defaultDisplay.getMode();
            f19562c = mode.getPhysicalWidth();
            f19563d = mode.getPhysicalHeight();
        } catch (Throwable unused) {
        }
    }

    public static String e(Context context) {
        int i = -1;
        if (context != null) {
            try {
                i = Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
            } catch (Throwable unused) {
            }
        }
        return String.valueOf(i);
    }

    public static String f(Context context) {
        try {
            d(context);
            b(context);
            c(context);
        } catch (Throwable unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f19564e);
        sb.append("[<!>]");
        sb.append(f19560a);
        sb.append(",");
        sb.append(f19561b);
        sb.append("[<!>]");
        sb.append(f19562c);
        sb.append("x");
        return AbstractC2763b.d(f19563d, "[<!>]", sb);
    }
}
