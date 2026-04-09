package s5;

import android.view.Surface;

/* loaded from: classes.dex */
public abstract class e {
    public static void a(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e4) {
            a5.a.n("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e4);
        }
    }
}
