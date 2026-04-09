package c0;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.RenderNode;
import android.hardware.camera2.CameraCharacteristics;
import android.view.WindowInsets;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract /* synthetic */ class f1 {
    public static /* synthetic */ BlendModeColorFilter a(int i4, BlendMode blendMode) {
        return new BlendModeColorFilter(i4, blendMode);
    }

    public static /* synthetic */ RenderNode b() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    public static /* synthetic */ CameraCharacteristics.Key c(String str) {
        return new CameraCharacteristics.Key(str, Integer[].class);
    }

    public static /* synthetic */ WindowInsets.Builder d() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder e(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ void f() {
    }
}
