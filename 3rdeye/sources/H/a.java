package H;

import C.g0;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AudioExecutor.java */
/* loaded from: classes.dex */
public final class a implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static volatile a f1943c;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f1944b = Executors.newFixedThreadPool(2, new ThreadFactoryC0035a());

    /* compiled from: AudioExecutor.java */
    /* renamed from: H.a$a, reason: collision with other inner class name */
    public class ThreadFactoryC0035a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f1945a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(new g0(runnable, 2));
            Locale locale = Locale.US;
            thread.setName("CameraX-camerax_audio_" + this.f1945a.getAndIncrement());
            return thread;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1944b.execute(runnable);
    }
}
