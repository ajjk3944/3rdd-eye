package org.tensorflow.lite;

/* loaded from: classes3.dex */
public final class TensorFlowLite {
    static {
        a();
    }

    public static void a() {
        try {
            System.loadLibrary("tensorflowlite_jni");
        } catch (UnsatisfiedLinkError e4) {
            System.err.println("TensorFlowLite: failed to load native library: " + e4.getMessage());
        }
    }

    public static native String version();
}
