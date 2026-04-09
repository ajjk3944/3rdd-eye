package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

/* loaded from: classes.dex */
public class aa {

    /* renamed from: a, reason: collision with root package name */
    private static volatile DisplayManager.DisplayListener f19548a = null;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f19549b = false;

    /* renamed from: c, reason: collision with root package name */
    private static String f19550c = null;

    /* renamed from: d, reason: collision with root package name */
    private static String f19551d = null;

    /* renamed from: e, reason: collision with root package name */
    private static String f19552e = null;

    /* renamed from: f, reason: collision with root package name */
    private static volatile boolean f19553f = false;

    /* renamed from: g, reason: collision with root package name */
    private static volatile boolean f19554g = false;

    /* renamed from: h, reason: collision with root package name */
    private static DisplayManager f19555h;

    public static class a implements DisplayManager.DisplayListener {
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
            aa.b(i, 1);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            aa.b(i, 3);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
            aa.b(i, 2);
        }
    }

    public static void b(Context context) {
        Handler handlerB;
        if (f19549b) {
            return;
        }
        if (f19548a == null) {
            f19548a = new a();
        }
        if (f19555h == null) {
            f19555h = (DisplayManager) context.getSystemService("display");
        }
        if (f19555h == null || (handlerB = ar.b()) == null) {
            return;
        }
        try {
            f19555h.registerDisplayListener(f19548a, handlerB);
            f19549b = true;
        } catch (Exception unused) {
        }
    }

    private static String a(Display display) {
        String name = display.getName();
        Object objA = av.a(display, display.getClass(), "getType", new Class[0], new Object[0]);
        Object objA2 = av.a(display, display.getClass(), "getOwnerPackageName", new Class[0], new Object[0]);
        Object objA3 = av.a(null, display.getClass(), "TYPE_VIRTUAL", null);
        return String.format("%s#%s#%b", objA2, name, Boolean.valueOf((objA == null || objA3 == null || ((Integer) objA).intValue() != ((Integer) objA3).intValue()) ? false : true));
    }

    private static String a(int i) {
        Display display = f19555h.getDisplay(i);
        return display != null ? a(display) : "pd";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i, int i3) {
        if (i == 0) {
            return;
        }
        try {
            String strA = a(i);
            if (i3 == 1) {
                if (strA.equals(f19550c)) {
                    return;
                }
                f19550c = strA;
            } else {
                if (i3 != 2) {
                    if (i3 != 3 || strA.equals(f19552e)) {
                        return;
                    }
                    f19552e = strA;
                    return;
                }
                if (strA.equals(f19551d)) {
                    return;
                }
                f19551d = strA;
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean a(Context context) {
        Display[] displays;
        if (f19549b && (f19550c != null || f19551d != null || f19552e != null)) {
            return true;
        }
        if (f19549b && f19553f) {
            return f19554g;
        }
        int i = 0;
        if (context == null) {
            return false;
        }
        if (f19555h == null) {
            f19555h = (DisplayManager) context.getSystemService("display");
        }
        DisplayManager displayManager = f19555h;
        if (displayManager != null && (displays = displayManager.getDisplays()) != null) {
            int length = displays.length;
            while (true) {
                if (i < length) {
                    Display display = displays[i];
                    if (display != null && display.getDisplayId() != 0) {
                        f19554g = true;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        f19553f = true;
        return f19554g;
    }
}
