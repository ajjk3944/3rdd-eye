package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static MonitorCrash f3475a = null;

    /* renamed from: b, reason: collision with root package name */
    private static int f3476b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static int f3477c;

    public static MonitorCrash a() {
        if (f3475a == null) {
            MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(com.apm.insight.e.g(), "239017", 20089L, "2008-20250701130429", "com.apm.insight");
            f3475a = monitorCrashInitSDK;
            monitorCrashInitSDK.config().setChannel("release");
        }
        return f3475a;
    }

    public static void a(Throwable th2, String str) {
        if (com.apm.insight.e.g() == null) {
            return;
        }
        if (f3476b == -1) {
            f3476b = 5;
        }
        int i4 = f3477c;
        if (i4 < f3476b) {
            f3477c = i4 + 1;
            a().reportCustomErr(str, "INNER", th2);
        }
    }
}
