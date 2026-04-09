package C;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CameraExecutor.java */
/* renamed from: C.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0629p implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public static final a f763d = new a();

    /* renamed from: b, reason: collision with root package name */
    public final Object f764b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public ThreadPoolExecutor f765c;

    /* compiled from: CameraExecutor.java */
    /* renamed from: C.p$a */
    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f766a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            Locale locale = Locale.US;
            thread.setName("CameraX-core_camera_" + this.f766a.getAndIncrement());
            return thread;
        }
    }

    public ExecutorC0629p() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f763d);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandlerC0628o());
        this.f765c = threadPoolExecutor;
    }

    public final void a(androidx.camera.core.impl.H h10) {
        ThreadPoolExecutor threadPoolExecutor;
        h10.getClass();
        synchronized (this.f764b) {
            try {
                if (this.f765c.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f763d);
                    threadPoolExecutor2.setRejectedExecutionHandler(new RejectedExecutionHandlerC0628o());
                    this.f765c = threadPoolExecutor2;
                }
                threadPoolExecutor = this.f765c;
            } catch (Throwable th) {
                throw th;
            }
        }
        int iMax = Math.max(1, h10.a().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f764b) {
            this.f765c.execute(runnable);
        }
    }
}
