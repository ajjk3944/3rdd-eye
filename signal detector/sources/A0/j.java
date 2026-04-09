package A0;

import android.view.Choreographer;

/* loaded from: classes.dex */
public abstract class j {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new i(0, runnable));
    }
}
