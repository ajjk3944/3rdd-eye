package Y2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class y implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final ThreadPoolExecutor f4383b;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f4382a = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f4384c = new WeakReference(null);

    public y() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new x(this));
        this.f4383b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f4384c.get()) {
            runnable.run();
        } else {
            this.f4383b.execute(runnable);
        }
    }
}
