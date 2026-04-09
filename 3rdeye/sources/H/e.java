package H;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: IoExecutor.java */
/* loaded from: classes.dex */
public final class e implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static volatile e f1959c;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f1960b = Executors.newFixedThreadPool(2, new a());

    /* compiled from: IoExecutor.java */
    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f1961a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            Locale locale = Locale.US;
            thread.setName("CameraX-camerax_io_" + this.f1961a.getAndIncrement());
            return thread;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1960b.execute(runnable);
    }
}
