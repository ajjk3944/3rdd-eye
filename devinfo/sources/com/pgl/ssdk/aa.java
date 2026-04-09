package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class aa {

    /* renamed from: a, reason: collision with root package name */
    private static volatile DisplayManager.DisplayListener f21424a = null;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f21425b = false;

    /* renamed from: c, reason: collision with root package name */
    private static String f21426c = null;

    /* renamed from: d, reason: collision with root package name */
    private static String f21427d = null;

    /* renamed from: e, reason: collision with root package name */
    private static String f21428e = null;

    /* renamed from: f, reason: collision with root package name */
    private static volatile boolean f21429f = false;
    private static volatile boolean g = false;

    /* renamed from: h, reason: collision with root package name */
    private static DisplayManager f21430h;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class a implements DisplayManager.DisplayListener {
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i4) {
            aa.b(i4, 1);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i4) {
            aa.b(i4, 3);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i4) {
            aa.b(i4, 2);
        }
    }

    public static void b(Context context) {
        Handler handlerB;
        if (f21425b) {
            return;
        }
        if (f21424a == null) {
            f21424a = new a();
        }
        if (f21430h == null) {
            f21430h = (DisplayManager) context.getSystemService("display");
        }
        if (f21430h == null || (handlerB = ar.b()) == null) {
            return;
        }
        try {
            f21430h.registerDisplayListener(f21424a, handlerB);
            f21425b = true;
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

    private static String a(int i4) {
        Display display = f21430h.getDisplay(i4);
        return display != null ? a(display) : "pd";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i4, int i10) {
        if (i4 == 0) {
            return;
        }
        try {
            String strA = a(i4);
            if (i10 == 1) {
                if (strA.equals(f21426c)) {
                    return;
                }
                f21426c = strA;
            } else {
                if (i10 != 2) {
                    if (i10 != 3 || strA.equals(f21428e)) {
                        return;
                    }
                    f21428e = strA;
                    return;
                }
                if (strA.equals(f21427d)) {
                    return;
                }
                f21427d = strA;
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean a(Context context) {
        Display[] displays;
        if (f21425b && (f21426c != null || f21427d != null || f21428e != null)) {
            return true;
        }
        if (f21425b && f21429f) {
            return g;
        }
        int i4 = 0;
        if (context == null) {
            return false;
        }
        if (f21430h == null) {
            f21430h = (DisplayManager) context.getSystemService("display");
        }
        DisplayManager displayManager = f21430h;
        if (displayManager != null && (displays = displayManager.getDisplays()) != null) {
            int length = displays.length;
            while (true) {
                if (i4 < length) {
                    Display display = displays[i4];
                    if (display != null && display.getDisplayId() != 0) {
                        g = true;
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
        }
        f21429f = true;
        return g;
    }
}
