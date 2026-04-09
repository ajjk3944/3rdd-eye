package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static MonitorCrash f5260a = null;

    /* renamed from: b, reason: collision with root package name */
    private static int f5261b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static int f5262c;

    public static MonitorCrash a() {
        if (f5260a == null) {
            MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(com.apm.insight.e.g(), "239017", 20089L, "2008-20250701130429", "com.apm.insight");
            f5260a = monitorCrashInitSDK;
            monitorCrashInitSDK.config().setChannel("release");
        }
        return f5260a;
    }

    public static void a(Throwable th, String str) {
        if (com.apm.insight.e.g() == null) {
            return;
        }
        if (f5261b == -1) {
            f5261b = 5;
        }
        int i10 = f5262c;
        if (i10 < f5261b) {
            f5262c = i10 + 1;
            a().reportCustomErr(str, "INNER", th);
        }
    }
}
