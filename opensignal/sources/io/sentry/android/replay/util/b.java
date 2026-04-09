package io.sentry.android.replay.util;

import a5.o;
import br.l;
import io.sentry.b5;
import io.sentry.u0;
import io.sentry.x5;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import tt.s;

/* loaded from: classes.dex */
public final class b implements ScheduledExecutorService {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f11997a;

    /* renamed from: d, reason: collision with root package name */
    public final x5 f11998d;

    public b(ScheduledExecutorService scheduledExecutorService, x5 x5Var) {
        l.e(x5Var, "options");
        this.f11997a = scheduledExecutorService;
        this.f11998d = x5Var;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f11997a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f11997a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.f11997a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.f11997a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f11997a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f11997a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f11997a.schedule(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j7, TimeUnit timeUnit) {
        return this.f11997a.scheduleAtFixedRate(runnable, j, j7, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j7, TimeUnit timeUnit) {
        return this.f11997a.scheduleWithFixedDelay(runnable, j, j7, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        synchronized (this) {
            if (!this.f11997a.isShutdown()) {
                this.f11997a.shutdown();
            }
            try {
                if (!this.f11997a.awaitTermination(this.f11998d.getShutdownTimeoutMillis(), TimeUnit.MILLISECONDS)) {
                    shutdownNow();
                }
            } catch (InterruptedException unused) {
                shutdownNow();
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f11997a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.f11997a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.f11997a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f11997a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.f11997a.schedule(callable, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.f11997a.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        String str;
        l.e(runnable, "task");
        String name = Thread.currentThread().getName();
        l.d(name, "getName(...)");
        if (s.n0(name, "SentryReplayIntegration", false)) {
            runnable.run();
            return null;
        }
        try {
            return this.f11997a.submit(new o(runnable, 29, this));
        } catch (Throwable th2) {
            u0 logger = this.f11998d.getLogger();
            b5 b5Var = b5.ERROR;
            StringBuilder sb2 = new StringBuilder("Failed to submit task ");
            if (runnable instanceof c) {
                str = ((c) runnable).f11999a;
            } else {
                str = "";
            }
            logger.g(b5Var, w.g.j(sb2, str, " to executor"), th2);
            return null;
        }
    }
}
