package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import android.util.Log;

/* loaded from: classes.dex */
public final class X7 {

    /* renamed from: b, reason: collision with root package name */
    public static final X7 f35660b = new X7("VisionKit", 2);

    /* renamed from: a, reason: collision with root package name */
    private final String f35661a = "VisionKit";

    public X7(String str, int i10) {
    }

    private final boolean b(int i10) {
        return Log.isLoggable(this.f35661a, i10);
    }

    public final void a(Throwable th2, String str, Object... objArr) {
        if (b(6)) {
            Log.e(this.f35661a, "Error in result from JNI layer", th2);
        }
    }
}
