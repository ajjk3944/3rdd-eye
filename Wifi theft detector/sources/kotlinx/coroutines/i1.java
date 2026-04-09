package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class i1 extends ExecutorCoroutineDispatcher implements q0 {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f22503c;

    public i1(Executor executor) {
        this.f22503c = executor;
        kotlinx.coroutines.internal.c.a(b0());
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void X(kotlin.coroutines.d dVar, Runnable runnable) {
        try {
            Executor executorB0 = b0();
            c.a();
            executorB0.execute(runnable);
        } catch (RejectedExecutionException e10) {
            c.a();
            c0(dVar, e10);
            w0.b().X(dVar, runnable);
        }
    }

    @Override // kotlinx.coroutines.q0
    public void b(long j10, o oVar) {
        long j11;
        Executor executorB0 = b0();
        ScheduledFuture scheduledFutureD0 = null;
        ScheduledExecutorService scheduledExecutorService = executorB0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorB0 : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            scheduledFutureD0 = d0(scheduledExecutorService, new k2(this, oVar), oVar.getContext(), j11);
        } else {
            j11 = j10;
        }
        if (scheduledFutureD0 != null) {
            u1.e(oVar, scheduledFutureD0);
        } else {
            m0.f22576h.b(j11, oVar);
        }
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public Executor b0() {
        return this.f22503c;
    }

    public final void c0(kotlin.coroutines.d dVar, RejectedExecutionException rejectedExecutionException) {
        u1.c(dVar, h1.a("The task was rejected", rejectedExecutionException));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorB0 = b0();
        ExecutorService executorService = executorB0 instanceof ExecutorService ? (ExecutorService) executorB0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final ScheduledFuture d0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, kotlin.coroutines.d dVar, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            c0(dVar, e10);
            return null;
        }
    }

    @Override // kotlinx.coroutines.q0
    public y0 e(long j10, Runnable runnable, kotlin.coroutines.d dVar) {
        long j11;
        Runnable runnable2;
        kotlin.coroutines.d dVar2;
        Executor executorB0 = b0();
        ScheduledFuture scheduledFutureD0 = null;
        ScheduledExecutorService scheduledExecutorService = executorB0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorB0 : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            runnable2 = runnable;
            dVar2 = dVar;
            scheduledFutureD0 = d0(scheduledExecutorService, runnable2, dVar2, j11);
        } else {
            j11 = j10;
            runnable2 = runnable;
            dVar2 = dVar;
        }
        return scheduledFutureD0 != null ? new x0(scheduledFutureD0) : m0.f22576h.e(j11, runnable2, dVar2);
    }

    public boolean equals(Object obj) {
        return (obj instanceof i1) && ((i1) obj).b0() == b0();
    }

    public int hashCode() {
        return System.identityHashCode(b0());
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return b0().toString();
    }
}
