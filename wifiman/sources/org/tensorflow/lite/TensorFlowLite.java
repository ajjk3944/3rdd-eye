package org.tensorflow.lite;

/* loaded from: classes2.dex */
public abstract class TensorFlowLite {

    /* renamed from: a, reason: collision with root package name */
    private static final Throwable f57149a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f57150b = false;

    static {
        try {
            System.loadLibrary("tensorflowlite_jni");
            e = null;
        } catch (UnsatisfiedLinkError e10) {
            e = e10;
        }
        f57149a = e;
    }

    public static void a() {
        if (f57150b) {
            return;
        }
        try {
            nativeRuntimeVersion();
            f57150b = true;
        } catch (UnsatisfiedLinkError e10) {
            e = e10;
            Object obj = f57149a;
            if (obj != null) {
                e = obj;
            }
            throw new UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + e);
        }
    }

    public static String b() {
        a();
        return nativeRuntimeVersion();
    }

    public static native String nativeRuntimeVersion();
}
