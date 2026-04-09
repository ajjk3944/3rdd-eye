package com.pgl.ssdk;

import android.content.Context;
import android.content.res.Configuration;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class ae {

    /* renamed from: a, reason: collision with root package name */
    public static int f21435a;

    /* renamed from: b, reason: collision with root package name */
    public static int f21436b;

    /* renamed from: c, reason: collision with root package name */
    public static int f21437c;

    /* renamed from: d, reason: collision with root package name */
    public static int f21438d;

    /* renamed from: e, reason: collision with root package name */
    public static int f21439e;

    /* renamed from: f, reason: collision with root package name */
    private static int f21440f;
    private static int g;

    /* renamed from: h, reason: collision with root package name */
    private static int f21441h;

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
            f21440f = (int) displayMetrics.density;
            f21439e = displayMetrics.densityDpi;
        } catch (Throwable unused) {
        }
    }

    private static void c(Context context) {
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            g = (int) displayMetrics.xdpi;
            f21441h = (int) displayMetrics.ydpi;
        } catch (Throwable unused) {
        }
    }

    private static void d(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            f21435a = displayMetrics.widthPixels;
            f21436b = displayMetrics.heightPixels;
            Display.Mode mode = defaultDisplay.getMode();
            f21437c = mode.getPhysicalWidth();
            f21438d = mode.getPhysicalHeight();
        } catch (Throwable unused) {
        }
    }

    public static String e(Context context) {
        int i4 = -1;
        if (context != null) {
            try {
                i4 = Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
            } catch (Throwable unused) {
            }
        }
        return String.valueOf(i4);
    }

    public static String f(Context context) {
        try {
            d(context);
            b(context);
            c(context);
        } catch (Throwable unused) {
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f21439e);
        sb2.append("[<!>]");
        sb2.append(f21435a);
        sb2.append(",");
        sb2.append(f21436b);
        sb2.append("[<!>]");
        sb2.append(f21437c);
        sb2.append("x");
        return r5.c.j(f21438d, "[<!>]", sb2);
    }
}
