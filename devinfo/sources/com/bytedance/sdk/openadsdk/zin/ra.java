package com.bytedance.sdk.openadsdk.zin;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra {
    public static ouw ouw;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw(String str, String str2);

        void ouw(String str, String str2, Throwable th2);
    }

    public static boolean ouw() {
        return ouw != null;
    }

    public static void ouw(String str, String str2) {
        ouw ouwVar = ouw;
        if (ouwVar == null) {
            return;
        }
        ouwVar.ouw(str, str2);
    }

    public static void ouw(String str, String str2, Throwable th2) {
        ouw ouwVar = ouw;
        if (ouwVar == null) {
            return;
        }
        ouwVar.ouw(str, str2, th2);
    }
}
