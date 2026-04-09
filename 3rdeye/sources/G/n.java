package G;

import android.os.Handler;
import android.os.Looper;

/* compiled from: Threads.java */
/* loaded from: classes.dex */
public final class n {
    public static void a() {
        A2.l.q("Not in application's main thread", b());
    }

    public static boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void c(Runnable runnable) {
        if (b()) {
            runnable.run();
        } else {
            A2.l.q("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }
}
