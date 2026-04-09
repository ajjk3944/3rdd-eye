package com.bytedance.sdk.component.ouw;

import android.util.Log;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class pno {
    static boolean ouw;

    public static void ouw(String str) {
        if (ouw) {
            Log.i("JsBridge2", str);
        }
    }

    public static void vt(String str) {
        if (ouw) {
            Log.w("JsBridge2", str);
        }
    }

    public static void ouw(String str, Throwable th2) {
        if (ouw) {
            Log.w("JsBridge2", str, th2);
            Log.w("JsBridge2", "Stacktrace: " + Log.getStackTraceString(th2));
        }
    }

    public static void vt(String str, Throwable th2) {
        if (ouw) {
            Log.e("JsBridge2", str, th2);
            Log.e("JsBridge2", "Stacktrace: " + Log.getStackTraceString(th2));
        }
    }

    public static void ouw(RuntimeException runtimeException) {
        if (ouw) {
            throw runtimeException;
        }
    }
}
