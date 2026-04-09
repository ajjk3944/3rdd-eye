package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static MonitorCrash f6437a = null;

    /* renamed from: b, reason: collision with root package name */
    private static int f6438b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static int f6439c;

    public static MonitorCrash a() {
        if (f6437a == null) {
            MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(com.apm.insight.e.g(), "239017", 20089L, "2008-20250701130429", "com.apm.insight");
            f6437a = monitorCrashInitSDK;
            monitorCrashInitSDK.config().setChannel("release");
        }
        return f6437a;
    }

    public static void a(Throwable th, String str) {
        if (com.apm.insight.e.g() == null) {
            return;
        }
        if (f6438b == -1) {
            f6438b = 5;
        }
        int i = f6439c;
        if (i < f6438b) {
            f6439c = i + 1;
            a().reportCustomErr(str, "INNER", th);
        }
    }
}
