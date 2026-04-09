package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class ld2 extends AbstractExecutorService implements pq3, AutoCloseable {
    public final /* synthetic */ int f = 0;
    public final Executor g;

    public ld2(Executor executor) {
        this.g = executor;
    }

    public final n70 a(Runnable runnable) {
        return (n70) super.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.g).awaitTermination(j, timeUnit);
        }
    }

    public final n70 c(Callable callable) {
        return (n70) super.submit(callable);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f) {
            case 0:
                this.g.execute(runnable);
                break;
            default:
                ((ExecutorService) this.g).execute(runnable);
                break;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.f) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.g).isShutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.f) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.g).isTerminated();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new ar3(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                ((ExecutorService) this.g).shutdown();
                return;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.g).shutdownNow();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (n70) super.submit(runnable);
    }

    public String toString() {
        switch (this.f) {
            case 1:
                ExecutorService executorService = (ExecutorService) this.g;
                String string = super.toString();
                String strValueOf = String.valueOf(executorService);
                return ex0.m(new StringBuilder(String.valueOf(string).length() + 1 + strValueOf.length() + 1), string, "[", strValueOf, "]");
            default:
                return super.toString();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new ar3(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (n70) super.submit(runnable, obj);
    }

    public ld2(ExecutorService executorService) {
        executorService.getClass();
        this.g = executorService;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (n70) super.submit(callable);
    }
}
