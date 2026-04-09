package h;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2681a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f2682b = Executors.newFixedThreadPool(2, new a());

    /* renamed from: c, reason: collision with root package name */
    private volatile Handler f2683c;

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f2684a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f2684a.getAndIncrement())));
            return thread;
        }
    }

    @Override // h.c
    public void a(Runnable runnable) {
        this.f2682b.execute(runnable);
    }

    @Override // h.c
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // h.c
    public void c(Runnable runnable) {
        if (this.f2683c == null) {
            synchronized (this.f2681a) {
                if (this.f2683c == null) {
                    this.f2683c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f2683c.post(runnable);
    }
}
