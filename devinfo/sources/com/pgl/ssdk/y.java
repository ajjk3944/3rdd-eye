package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.os.Build;
import android.view.InputDevice;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    private static int f21558a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static int f21559b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f21560c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static int f21561d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static int f21562e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f21563f = 0;
    public static volatile boolean g = false;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f21564h = false;

    /* renamed from: i, reason: collision with root package name */
    private static InputManager f21565i;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21566a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f21567b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21568c;

        public a(String str, Context context, int i4) {
            this.f21566a = str;
            this.f21567b = context;
            this.f21568c = i4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (y.g) {
                com.pgl.ssdk.ces.a.meta(171, null, this.f21566a);
            }
            InputManager inputManagerB = y.b(this.f21567b);
            if (inputManagerB == null) {
                return;
            }
            InputDevice inputDevice = inputManagerB.getInputDevice(this.f21568c);
            y.h();
            if (inputDevice == null) {
                y.b();
                y.c();
                y.c("nihc");
            } else if (inputDevice.isVirtual()) {
                y.d();
                y.e();
                y.c("vihc");
            } else {
                if (Build.VERSION.SDK_INT < 29 || !inputDevice.isExternal()) {
                    return;
                }
                y.f();
                y.g();
                y.c("eihc");
            }
        }
    }

    public static /* synthetic */ int b() {
        int i4 = f21560c;
        f21560c = i4 + 1;
        return i4;
    }

    public static /* synthetic */ int c() {
        int i4 = f21563f;
        f21563f = i4 + 1;
        return i4;
    }

    public static /* synthetic */ int d() {
        int i4 = f21558a;
        f21558a = i4 + 1;
        return i4;
    }

    public static /* synthetic */ int e() {
        int i4 = f21561d;
        f21561d = i4 + 1;
        return i4;
    }

    public static /* synthetic */ int f() {
        int i4 = f21559b;
        f21559b = i4 + 1;
        return i4;
    }

    public static /* synthetic */ int g() {
        int i4 = f21562e;
        f21562e = i4 + 1;
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h() {
        if (f21564h) {
            return;
        }
        try {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            if (sharedPreferencesA != null) {
                f21563f = sharedPreferencesA.getInt("nihc", 0);
                f21562e = sharedPreferencesA.getInt("eihc", 0);
                f21561d = sharedPreferencesA.getInt("vihc", 0);
                f21564h = true;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(java.lang.String r2) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = -1
            if (r0 == 0) goto L8
            return r1
        L8:
            h()
            r2.getClass()
            int r0 = r2.hashCode()
            switch(r0) {
                case 100415: goto L4e;
                case 109064: goto L43;
                case 116752: goto L38;
                case 3113119: goto L2d;
                case 3381238: goto L22;
                case 3619566: goto L17;
                default: goto L15;
            }
        L15:
            r2 = r1
            goto L58
        L17:
            java.lang.String r0 = "vihc"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L20
            goto L15
        L20:
            r2 = 5
            goto L58
        L22:
            java.lang.String r0 = "nihc"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2b
            goto L15
        L2b:
            r2 = 4
            goto L58
        L2d:
            java.lang.String r0 = "eihc"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L36
            goto L15
        L36:
            r2 = 3
            goto L58
        L38:
            java.lang.String r0 = "vic"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L41
            goto L15
        L41:
            r2 = 2
            goto L58
        L43:
            java.lang.String r0 = "nic"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4c
            goto L15
        L4c:
            r2 = 1
            goto L58
        L4e:
            java.lang.String r0 = "eic"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L57
            goto L15
        L57:
            r2 = 0
        L58:
            switch(r2) {
                case 0: goto L6b;
                case 1: goto L68;
                case 2: goto L65;
                case 3: goto L62;
                case 4: goto L5f;
                case 5: goto L5c;
                default: goto L5b;
            }
        L5b:
            return r1
        L5c:
            int r2 = com.pgl.ssdk.y.f21561d
            return r2
        L5f:
            int r2 = com.pgl.ssdk.y.f21563f
            return r2
        L62:
            int r2 = com.pgl.ssdk.y.f21562e
            return r2
        L65:
            int r2 = com.pgl.ssdk.y.f21558a
            return r2
        L68:
            int r2 = com.pgl.ssdk.y.f21560c
            return r2
        L6b:
            int r2 = com.pgl.ssdk.y.f21559b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.y.b(java.lang.String):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str) {
        try {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt(str, sharedPreferencesA.getInt(str, 0) + 1).apply();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.view.MotionEvent r2, android.content.Context r3) {
        /*
            if (r2 == 0) goto L4f
            if (r3 == 0) goto L4f
            boolean r0 = com.pgl.ssdk.y.g
            if (r0 == 0) goto L42
            r0 = 0
            int r0 = r2.getToolType(r0)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L1c
            int r0 = r2.getSource()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L1c
            int r0 = r2.getSource()     // Catch: java.lang.Throwable -> L42
            r1 = 2
            if (r0 != r1) goto L42
        L1c:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L42
            r0.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = java.util.Arrays.toString(r0)     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "android.view.InputEventReceiver"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L42
            java.lang.String r1 = "android.view.ViewRootImpl$WindowInputEventReceiver"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L42
            java.lang.String r1 = "android.view.ViewRootImpl$InputStage"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L42
            goto L43
        L42:
            r0 = 0
        L43:
            int r2 = r2.getDeviceId()
            com.pgl.ssdk.y$a r1 = new com.pgl.ssdk.y$a
            r1.<init>(r0, r3, r2)
            com.pgl.ssdk.ar.b(r1)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.y.a(android.view.MotionEvent, android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputManager b(Context context) {
        if (f21565i == null) {
            f21565i = (InputManager) context.getSystemService("input");
        }
        return f21565i;
    }
}
