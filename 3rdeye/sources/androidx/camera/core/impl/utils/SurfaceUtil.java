package androidx.camera.core.impl.utils;

import android.view.Surface;

/* loaded from: classes.dex */
public class SurfaceUtil {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f15119a;

        /* renamed from: b, reason: collision with root package name */
        public int f15120b;

        /* renamed from: c, reason: collision with root package name */
        public int f15121c;
    }

    static {
        System.loadLibrary("surface_util_jni");
    }

    public static a a(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        a aVar = new a();
        aVar.f15119a = 0;
        aVar.f15120b = 0;
        aVar.f15121c = 0;
        aVar.f15119a = iArrNativeGetSurfaceInfo[0];
        aVar.f15120b = iArrNativeGetSurfaceInfo[1];
        aVar.f15121c = iArrNativeGetSurfaceInfo[2];
        return aVar;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
