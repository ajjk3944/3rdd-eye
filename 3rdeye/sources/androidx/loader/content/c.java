package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ModernAsyncTask.java */
/* loaded from: classes.dex */
public abstract class c<Params, Progress, Result> {

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadPoolExecutor f16196g;

    /* renamed from: h, reason: collision with root package name */
    public static f f16197h;
    public static volatile ThreadPoolExecutor i;

    /* renamed from: b, reason: collision with root package name */
    public final b f16198b;

    /* renamed from: c, reason: collision with root package name */
    public final C0250c f16199c;

    /* renamed from: d, reason: collision with root package name */
    public volatile g f16200d = g.PENDING;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f16201e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f16202f = new AtomicBoolean();

    /* compiled from: ModernAsyncTask.java */
    public static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f16203a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f16203a.getAndIncrement());
        }
    }

    /* compiled from: ModernAsyncTask.java */
    public class b extends h<Params, Result> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        public final Result call() throws Exception {
            c cVar = c.this;
            cVar.f16202f.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) cVar.a();
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: androidx.loader.content.c$c, reason: collision with other inner class name */
    public class C0250c extends FutureTask<Result> {
        public C0250c(b bVar) {
            super(bVar);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            c cVar = c.this;
            AtomicBoolean atomicBoolean = cVar.f16202f;
            try {
                Result result = get();
                if (atomicBoolean.get()) {
                    return;
                }
                cVar.d(result);
            } catch (InterruptedException e4) {
                Log.w("AsyncTask", e4);
            } catch (CancellationException unused) {
                if (atomicBoolean.get()) {
                    return;
                }
                cVar.d(null);
            } catch (ExecutionException e10) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e10.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16206a;

        static {
            int[] iArr = new int[g.values().length];
            f16206a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16206a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    public static class e<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final c f16207a;

        /* renamed from: b, reason: collision with root package name */
        public final Data[] f16208b;

        public e(c cVar, Data... dataArr) {
            this.f16207a = cVar;
            this.f16208b = dataArr;
        }
    }

    /* compiled from: ModernAsyncTask.java */
    public static class f extends Handler {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                eVar.f16207a.getClass();
            } else {
                c cVar = eVar.f16207a;
                Object obj = eVar.f16208b[0];
                if (cVar.f16201e.get()) {
                    cVar.b(obj);
                } else {
                    cVar.c(obj);
                }
                cVar.f16200d = g.FINISHED;
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* compiled from: ModernAsyncTask.java */
    public static abstract class h<Params, Result> implements Callable<Result> {
    }

    static {
        a aVar = new a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), aVar);
        f16196g = threadPoolExecutor;
        i = threadPoolExecutor;
    }

    public c() {
        b bVar = new b();
        this.f16198b = bVar;
        this.f16199c = new C0250c(bVar);
    }

    public abstract Object a();

    public final void d(Object obj) {
        f fVar;
        synchronized (c.class) {
            try {
                if (f16197h == null) {
                    f16197h = new f(Looper.getMainLooper());
                }
                fVar = f16197h;
            } catch (Throwable th) {
                throw th;
            }
        }
        fVar.obtainMessage(1, new e(this, obj)).sendToTarget();
    }

    public void b(Result result) {
    }

    public void c(Result result) {
    }
}
