package N2;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* compiled from: ActiveResources.java */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* compiled from: ActiveResources.java */
    /* renamed from: N2.a$a, reason: collision with other inner class name */
    public class RunnableC0078a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f4465b;

        public RunnableC0078a(Runnable runnable) {
            this.f4465b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() throws SecurityException, IllegalArgumentException {
            Process.setThreadPriority(10);
            this.f4465b.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new RunnableC0078a(runnable), "glide-active-resources");
    }
}
