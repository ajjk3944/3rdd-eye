package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

/* loaded from: classes3.dex */
public class aa {

    /* renamed from: a, reason: collision with root package name */
    private static volatile DisplayManager.DisplayListener f19804a = null;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f19805b = false;

    /* renamed from: c, reason: collision with root package name */
    private static String f19806c = null;

    /* renamed from: d, reason: collision with root package name */
    private static String f19807d = null;

    /* renamed from: e, reason: collision with root package name */
    private static String f19808e = null;

    /* renamed from: f, reason: collision with root package name */
    private static volatile boolean f19809f = false;

    /* renamed from: g, reason: collision with root package name */
    private static volatile boolean f19810g = false;

    /* renamed from: h, reason: collision with root package name */
    private static DisplayManager f19811h;

    public static class a implements DisplayManager.DisplayListener {
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
            aa.b(i10, 1);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            aa.b(i10, 3);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
            aa.b(i10, 2);
        }
    }

    public static void b(Context context) {
        Handler handlerB;
        if (f19805b) {
            return;
        }
        if (f19804a == null) {
            f19804a = new a();
        }
        if (f19811h == null) {
            f19811h = (DisplayManager) context.getSystemService("display");
        }
        if (f19811h == null || (handlerB = ar.b()) == null) {
            return;
        }
        try {
            f19811h.registerDisplayListener(f19804a, handlerB);
            f19805b = true;
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

    private static String a(int i10) {
        Display display = f19811h.getDisplay(i10);
        return display != null ? a(display) : "pd";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        try {
            String strA = a(i10);
            if (i11 == 1) {
                if (strA.equals(f19806c)) {
                    return;
                }
                f19806c = strA;
            } else {
                if (i11 != 2) {
                    if (i11 != 3 || strA.equals(f19808e)) {
                        return;
                    }
                    f19808e = strA;
                    return;
                }
                if (strA.equals(f19807d)) {
                    return;
                }
                f19807d = strA;
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean a(Context context) {
        Display[] displays;
        if (f19805b && (f19806c != null || f19807d != null || f19808e != null)) {
            return true;
        }
        if (f19805b && f19809f) {
            return f19810g;
        }
        int i10 = 0;
        if (context == null) {
            return false;
        }
        if (f19811h == null) {
            f19811h = (DisplayManager) context.getSystemService("display");
        }
        DisplayManager displayManager = f19811h;
        if (displayManager != null && (displays = displayManager.getDisplays()) != null) {
            int length = displays.length;
            while (true) {
                if (i10 < length) {
                    Display display = displays[i10];
                    if (display != null && display.getDisplayId() != 0) {
                        f19810g = true;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
        }
        f19809f = true;
        return f19810g;
    }
}
