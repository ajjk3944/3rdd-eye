package e2;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5415c {

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadFactory f46152f;

    /* renamed from: g, reason: collision with root package name */
    private static final BlockingQueue f46153g;

    /* renamed from: h, reason: collision with root package name */
    public static final Executor f46154h;

    /* renamed from: i, reason: collision with root package name */
    private static f f46155i;

    /* renamed from: j, reason: collision with root package name */
    private static volatile Executor f46156j;

    /* renamed from: a, reason: collision with root package name */
    private final h f46157a;

    /* renamed from: b, reason: collision with root package name */
    private final FutureTask f46158b;

    /* renamed from: c, reason: collision with root package name */
    private volatile g f46159c = g.PENDING;

    /* renamed from: d, reason: collision with root package name */
    final AtomicBoolean f46160d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    final AtomicBoolean f46161e = new AtomicBoolean();

    /* renamed from: e2.c$a */
    static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f46162a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f46162a.getAndIncrement());
        }
    }

    /* renamed from: e2.c$b */
    class b extends h {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            AbstractC5415c.this.f46161e.set(true);
            Object objB = null;
            try {
                Process.setThreadPriority(10);
                objB = AbstractC5415c.this.b(this.f46168a);
                Binder.flushPendingCommands();
                return objB;
            } finally {
            }
        }
    }

    /* renamed from: e2.c$c, reason: collision with other inner class name */
    class C1727c extends FutureTask {
        C1727c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AbstractC5415c.this.l(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                AbstractC5415c.this.l(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* renamed from: e2.c$d */
    static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46165a;

        static {
            int[] iArr = new int[g.values().length];
            f46165a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46165a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: e2.c$e */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC5415c f46166a;

        /* renamed from: b, reason: collision with root package name */
        final Object[] f46167b;

        e(AbstractC5415c abstractC5415c, Object... objArr) {
            this.f46166a = abstractC5415c;
            this.f46167b = objArr;
        }
    }

    /* renamed from: e2.c$f */
    private static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i10 = message.what;
            if (i10 == 1) {
                eVar.f46166a.d(eVar.f46167b[0]);
            } else {
                if (i10 != 2) {
                    return;
                }
                eVar.f46166a.j(eVar.f46167b);
            }
        }
    }

    /* renamed from: e2.c$g */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: e2.c$h */
    private static abstract class h implements Callable {

        /* renamed from: a, reason: collision with root package name */
        Object[] f46168a;

        h() {
        }
    }

    static {
        a aVar = new a();
        f46152f = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f46153g = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f46154h = threadPoolExecutor;
        f46156j = threadPoolExecutor;
    }

    AbstractC5415c() {
        b bVar = new b();
        this.f46157a = bVar;
        this.f46158b = new C1727c(bVar);
    }

    private static Handler e() {
        f fVar;
        synchronized (AbstractC5415c.class) {
            try {
                if (f46155i == null) {
                    f46155i = new f();
                }
                fVar = f46155i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public final boolean a(boolean z10) {
        this.f46160d.set(true);
        return this.f46158b.cancel(z10);
    }

    protected abstract Object b(Object... objArr);

    public final AbstractC5415c c(Executor executor, Object... objArr) {
        if (this.f46159c == g.PENDING) {
            this.f46159c = g.RUNNING;
            i();
            this.f46157a.f46168a = objArr;
            executor.execute(this.f46158b);
            return this;
        }
        int i10 = d.f46165a[this.f46159c.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    void d(Object obj) {
        if (f()) {
            g(obj);
        } else {
            h(obj);
        }
        this.f46159c = g.FINISHED;
    }

    public final boolean f() {
        return this.f46160d.get();
    }

    protected abstract void g(Object obj);

    protected abstract void h(Object obj);

    protected void i() {
    }

    protected void j(Object... objArr) {
    }

    Object k(Object obj) {
        e().obtainMessage(1, new e(this, obj)).sendToTarget();
        return obj;
    }

    void l(Object obj) {
        if (this.f46161e.get()) {
            return;
        }
        k(obj);
    }
}
