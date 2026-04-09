package m;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: m.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6654d extends AbstractC6655e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f52779a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f52780b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c, reason: collision with root package name */
    private volatile Handler f52781c;

    /* renamed from: m.d$a */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f52782a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f52782a.getAndIncrement());
            return thread;
        }
    }

    /* renamed from: m.d$b */
    private static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    private static Handler d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // m.AbstractC6655e
    public void a(Runnable runnable) {
        this.f52780b.execute(runnable);
    }

    @Override // m.AbstractC6655e
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // m.AbstractC6655e
    public void c(Runnable runnable) {
        if (this.f52781c == null) {
            synchronized (this.f52779a) {
                try {
                    if (this.f52781c == null) {
                        this.f52781c = d(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f52781c.post(runnable);
    }
}
