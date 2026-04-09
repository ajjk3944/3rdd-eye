package jp.co.cyberagent.android.gpuimage;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public abstract class GPUImageNativeLibrary {
    static {
        System.loadLibrary("yuv-decoder");
    }

    public static native void adjustBitmap(Bitmap bitmap);
}
