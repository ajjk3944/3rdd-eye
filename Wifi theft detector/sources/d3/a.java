package d3;

import android.os.Looper;

/* loaded from: classes.dex */
public abstract class a {
    public static boolean a() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }
}
