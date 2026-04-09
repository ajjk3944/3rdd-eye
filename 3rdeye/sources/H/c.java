package H;

import E.u;
import I.m;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import o0.b;

/* compiled from: HandlerScheduledExecutorService.java */
/* loaded from: classes.dex */
public final class c extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: b, reason: collision with root package name */
    public final Handler f1947b;

    /* compiled from: HandlerScheduledExecutorService.java */
    public class a extends ThreadLocal<ScheduledExecutorService> {
        @Override // java.lang.ThreadLocal
        public final ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return u.H();
            }
            if (Looper.myLooper() != null) {
                return new c(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* compiled from: HandlerScheduledExecutorService.java */
    public class b implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f1948a;

        public b(Runnable runnable) {
            this.f1948a = runnable;
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            this.f1948a.run();
            return null;
        }
    }

    static {
        new a();
    }

    public c(Handler handler) {
        this.f1947b = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j4, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler = this.f1947b;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(Runnable runnable, long j4, TimeUnit timeUnit) {
        return schedule(new b(runnable), j4, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j4, long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName().concat(" does not yet support fixed-rate scheduling."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j4, long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName().concat(" does not yet support fixed-delay scheduling."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException(c.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(c.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    /* compiled from: HandlerScheduledExecutorService.java */
    /* renamed from: H.c$c, reason: collision with other inner class name */
    public static class RunnableScheduledFutureC0036c<V> implements RunnableScheduledFuture<V> {

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<b.a<V>> f1949b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        public final long f1950c;

        /* renamed from: d, reason: collision with root package name */
        public final Callable<V> f1951d;

        /* renamed from: e, reason: collision with root package name */
        public final b.d f1952e;

        /* compiled from: HandlerScheduledExecutorService.java */
        /* renamed from: H.c$c$a */
        public class a implements b.c<V> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Handler f1953b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Callable f1954c;

            /* compiled from: HandlerScheduledExecutorService.java */
            /* renamed from: H.c$c$a$a, reason: collision with other inner class name */
            public class RunnableC0037a implements Runnable {
                public RunnableC0037a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    if (RunnableScheduledFutureC0036c.this.f1949b.getAndSet(null) != null) {
                        aVar.f1953b.removeCallbacks(RunnableScheduledFutureC0036c.this);
                    }
                }
            }

            public a(Handler handler, Callable callable) {
                this.f1953b = handler;
                this.f1954c = callable;
            }

            @Override // o0.b.c
            public final Object i(b.a<V> aVar) throws RejectedExecutionException {
                aVar.a(new RunnableC0037a(), u.y());
                RunnableScheduledFutureC0036c.this.f1949b.set(aVar);
                return "HandlerScheduledFuture-" + this.f1954c.toString();
            }
        }

        public RunnableScheduledFutureC0036c(Handler handler, long j4, Callable<V> callable) {
            this.f1950c = j4;
            this.f1951d = callable;
            this.f1952e = o0.b.a(new a(handler, callable));
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return this.f1952e.cancel(z10);
        }

        @Override // java.lang.Comparable
        public final int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public final V get() throws ExecutionException, InterruptedException {
            return (V) this.f1952e.f44804c.get();
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f1950c - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f1952e.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.f1952e.f44804c.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public final boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public final void run() {
            b.a andSet = this.f1949b.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.b(this.f1951d.call());
                } catch (Exception e4) {
                    andSet.d(e4);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public final V get(long j4, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) this.f1952e.f44804c.get(j4, timeUnit);
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j4, TimeUnit timeUnit) {
        long jConvert = TimeUnit.MILLISECONDS.convert(j4, timeUnit) + SystemClock.uptimeMillis();
        Handler handler = this.f1947b;
        RunnableScheduledFutureC0036c runnableScheduledFutureC0036c = new RunnableScheduledFutureC0036c(handler, jConvert, callable);
        if (handler.postAtTime(runnableScheduledFutureC0036c, jConvert)) {
            return runnableScheduledFutureC0036c;
        }
        return new m.b(new RejectedExecutionException(handler + " is shutting down"));
    }
}
