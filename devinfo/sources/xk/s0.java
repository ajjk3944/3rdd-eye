package xk;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s0 extends r0 implements b0 {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f37236c;

    public s0(Executor executor) {
        Method method;
        this.f37236c = executor;
        Method method2 = cl.a.f2901a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = cl.a.f2901a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // xk.b0
    public final void A(long j, h hVar) {
        Executor executor = this.f37236c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            fb.r rVar = new fb.r(23, this, hVar);
            ck.h hVar2 = hVar.f37194e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(rVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e2);
                x.f(hVar2, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            hVar.v(new e(0, scheduledFutureSchedule));
        } else {
            y.j.A(j, hVar);
        }
    }

    @Override // xk.b0
    public final i0 F(long j, Runnable runnable, ck.h hVar) {
        Executor executor = this.f37236c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e2);
                x.f(hVar, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new h0(scheduledFutureSchedule) : y.j.F(j, runnable, hVar);
    }

    @Override // xk.r
    public final void T(ck.h hVar, Runnable runnable) {
        try {
            this.f37236c.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            x.f(hVar, cancellationException);
            el.e eVar = g0.f37189a;
            el.d.f23561c.T(hVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f37236c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s0) && ((s0) obj).f37236c == this.f37236c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f37236c);
    }

    @Override // xk.r
    public final String toString() {
        return this.f37236c.toString();
    }
}
