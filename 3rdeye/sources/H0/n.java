package H0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* compiled from: RequestExecutor.java */
/* loaded from: classes.dex */
public final class n implements ThreadFactory {

    /* compiled from: RequestExecutor.java */
    public static class a extends Thread {

        /* renamed from: b, reason: collision with root package name */
        public final int f2011b;

        public a(Runnable runnable) {
            super(runnable, "fonts-androidx");
            this.f2011b = 10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() throws SecurityException, IllegalArgumentException {
            Process.setThreadPriority(this.f2011b);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable);
    }
}
