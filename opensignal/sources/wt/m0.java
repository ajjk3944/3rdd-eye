package wt;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m0 extends l0 implements a0 {

    /* renamed from: g, reason: collision with root package name */
    public final Executor f24635g;

    public m0(Executor executor) {
        this.f24635g = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // wt.a0
    public final void G(long j, g gVar) {
        Executor executor = this.f24635g;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            re.a aVar = new re.a(this, 22, gVar);
            pq.h hVar = gVar.f24618x;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(aVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e4) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e4);
                w.e(hVar, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            gVar.y(new e(0, scheduledFutureSchedule));
        } else {
            x.F.G(j, gVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f24635g;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m0) && ((m0) obj).f24635g == this.f24635g;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f24635g);
    }

    @Override // wt.q
    public final void n0(pq.h hVar, Runnable runnable) {
        try {
            this.f24635g.execute(runnable);
        } catch (RejectedExecutionException e4) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e4);
            w.e(hVar, cancellationException);
            du.f fVar = d0.f24610a;
            du.e.f7570g.n0(hVar, runnable);
        }
    }

    @Override // wt.q
    public final String toString() {
        return this.f24635g.toString();
    }
}
