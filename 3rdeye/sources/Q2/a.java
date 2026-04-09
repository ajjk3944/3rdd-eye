package Q2;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: GlideExecutor.java */
/* loaded from: classes.dex */
public final class a implements ExecutorService {

    /* renamed from: c, reason: collision with root package name */
    public static final long f10919c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: d, reason: collision with root package name */
    public static volatile int f10920d;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadPoolExecutor f10921b;

    /* compiled from: GlideExecutor.java */
    /* renamed from: Q2.a$a, reason: collision with other inner class name */
    public static final class ThreadFactoryC0131a implements ThreadFactory {

        /* compiled from: GlideExecutor.java */
        /* renamed from: Q2.a$a$a, reason: collision with other inner class name */
        public class C0132a extends Thread {
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new C0132a(runnable);
        }
    }

    /* compiled from: GlideExecutor.java */
    public static final class b implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadFactoryC0131a f10922a;

        /* renamed from: b, reason: collision with root package name */
        public final String f10923b;

        /* renamed from: c, reason: collision with root package name */
        public final c.C0134a f10924c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f10925d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicInteger f10926e;

        /* compiled from: GlideExecutor.java */
        /* renamed from: Q2.a$b$a, reason: collision with other inner class name */
        public class RunnableC0133a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Runnable f10927b;

            public RunnableC0133a(Runnable runnable) {
                this.f10927b = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                if (bVar.f10925d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f10927b.run();
                } catch (Throwable th) {
                    bVar.f10924c.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                    }
                }
            }
        }

        public b(ThreadFactoryC0131a threadFactoryC0131a, String str, boolean z10) {
            c.C0134a c0134a = c.f10929a;
            this.f10926e = new AtomicInteger();
            this.f10922a = threadFactoryC0131a;
            this.f10923b = str;
            this.f10924c = c0134a;
            this.f10925d = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            RunnableC0133a runnableC0133a = new RunnableC0133a(runnable);
            this.f10922a.getClass();
            ThreadFactoryC0131a.C0132a c0132a = new ThreadFactoryC0131a.C0132a(runnableC0133a);
            c0132a.setName("glide-" + this.f10923b + "-thread-" + this.f10926e.getAndIncrement());
            return c0132a;
        }
    }

    /* compiled from: GlideExecutor.java */
    public interface c {

        /* renamed from: a, reason: collision with root package name */
        public static final C0134a f10929a = new C0134a();

        /* compiled from: GlideExecutor.java */
        /* renamed from: Q2.a$c$a, reason: collision with other inner class name */
        public class C0134a implements c {
        }
    }

    public a(ThreadPoolExecutor threadPoolExecutor) {
        this.f10921b = threadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j4, TimeUnit timeUnit) throws InterruptedException {
        return this.f10921b.awaitTermination(j4, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f10921b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f10921b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f10921b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f10921b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f10921b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f10921b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.f10921b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f10921b.submit(runnable);
    }

    public final String toString() {
        return this.f10921b.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j4, TimeUnit timeUnit) throws InterruptedException {
        return this.f10921b.invokeAll(collection, j4, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j4, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f10921b.invokeAny(collection, j4, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f10921b.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f10921b.submit(callable);
    }
}
