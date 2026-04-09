package H2;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
public final class a implements ExecutorService {

    /* renamed from: b, reason: collision with root package name */
    private static final long f7590b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c, reason: collision with root package name */
    private static volatile int f7591c;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f7592a;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f7593a;

        /* renamed from: b, reason: collision with root package name */
        private int f7594b;

        /* renamed from: c, reason: collision with root package name */
        private int f7595c;

        /* renamed from: d, reason: collision with root package name */
        private ThreadFactory f7596d = new c();

        /* renamed from: e, reason: collision with root package name */
        private e f7597e = e.f7611d;

        /* renamed from: f, reason: collision with root package name */
        private String f7598f;

        /* renamed from: g, reason: collision with root package name */
        private long f7599g;

        b(boolean z10) {
            this.f7593a = z10;
        }

        public a a() {
            if (TextUtils.isEmpty(this.f7598f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f7598f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f7594b, this.f7595c, this.f7599g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f7596d, this.f7598f, this.f7597e, this.f7593a));
            if (this.f7599g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        public b b(String str) {
            this.f7598f = str;
            return this;
        }

        public b c(int i10) {
            this.f7594b = i10;
            this.f7595c = i10;
            return this;
        }
    }

    private static final class c implements ThreadFactory {

        /* renamed from: H2.a$c$a, reason: collision with other inner class name */
        class C0308a extends Thread {
            C0308a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0308a(runnable);
        }
    }

    private static final class d implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final ThreadFactory f7601a;

        /* renamed from: b, reason: collision with root package name */
        private final String f7602b;

        /* renamed from: c, reason: collision with root package name */
        final e f7603c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f7604d;

        /* renamed from: e, reason: collision with root package name */
        private final AtomicInteger f7605e = new AtomicInteger();

        /* renamed from: H2.a$d$a, reason: collision with other inner class name */
        class RunnableC0309a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f7606a;

            RunnableC0309a(Runnable runnable) {
                this.f7606a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f7604d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f7606a.run();
                } catch (Throwable th2) {
                    d.this.f7603c.a(th2);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z10) {
            this.f7601a = threadFactory;
            this.f7602b = str;
            this.f7603c = eVar;
            this.f7604d = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f7601a.newThread(new RunnableC0309a(runnable));
            threadNewThread.setName("glide-" + this.f7602b + "-thread-" + this.f7605e.getAndIncrement());
            return threadNewThread;
        }
    }

    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f7608a = new C0310a();

        /* renamed from: b, reason: collision with root package name */
        public static final e f7609b;

        /* renamed from: c, reason: collision with root package name */
        public static final e f7610c;

        /* renamed from: d, reason: collision with root package name */
        public static final e f7611d;

        /* renamed from: H2.a$e$a, reason: collision with other inner class name */
        class C0310a implements e {
            C0310a() {
            }

            @Override // H2.a.e
            public void a(Throwable th2) {
            }
        }

        class b implements e {
            b() {
            }

            @Override // H2.a.e
            public void a(Throwable th2) {
                if (th2 == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
            }
        }

        class c implements e {
            c() {
            }

            @Override // H2.a.e
            public void a(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }
        }

        static {
            b bVar = new b();
            f7609b = bVar;
            f7610c = new c();
            f7611d = bVar;
        }

        void a(Throwable th2);
    }

    a(ExecutorService executorService) {
        this.f7592a = executorService;
    }

    static int a() {
        return b() >= 4 ? 2 : 1;
    }

    public static int b() {
        if (f7591c == 0) {
            f7591c = Math.min(4, H2.b.a());
        }
        return f7591c;
    }

    public static b c() {
        return new b(true).c(a()).b("animation");
    }

    public static a d() {
        return c().a();
    }

    public static b e() {
        return new b(true).c(1).b("disk-cache");
    }

    public static a f() {
        return e().a();
    }

    public static b h() {
        return new b(false).c(b()).b("source");
    }

    public static a i() {
        return h().a();
    }

    public static a j() {
        return new a(new ThreadPoolExecutor(0, MPv3.MAX_MESSAGE_ID, f7590b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f7611d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f7592a.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f7592a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f7592a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f7592a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f7592a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f7592a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f7592a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f7592a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f7592a.submit(runnable);
    }

    public String toString() {
        return this.f7592a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f7592a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f7592a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f7592a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f7592a.submit(callable);
    }
}
