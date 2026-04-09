package A9;

import F9.C0660c;
import f9.InterfaceC4350h;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Executors.kt */
/* renamed from: A9.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0578g0 extends AbstractC0576f0 implements N {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f246c;

    public C0578g0(Executor executor) {
        Method method;
        this.f246c = executor;
        Method method2 = C0660c.f1748a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = C0660c.f1748a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // A9.N
    public final W B0(long j4, P0 p02, InterfaceC4350h interfaceC4350h) {
        Executor executor = this.f246c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(p02, j4, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e4) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e4);
                C0572d0.b(interfaceC4350h, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new V(scheduledFutureSchedule) : J.f192j.B0(j4, p02, interfaceC4350h);
    }

    @Override // A9.A
    public final void N0(InterfaceC4350h interfaceC4350h, Runnable runnable) {
        try {
            this.f246c.execute(runnable);
        } catch (RejectedExecutionException e4) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e4);
            C0572d0.b(interfaceC4350h, cancellationException);
            U.f212b.N0(interfaceC4350h, runnable);
        }
    }

    @Override // A9.AbstractC0576f0
    public final Executor R0() {
        return this.f246c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f246c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0578g0) && ((C0578g0) obj).f246c == this.f246c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f246c);
    }

    @Override // A9.A
    public final String toString() {
        return this.f246c.toString();
    }

    @Override // A9.N
    public final void y0(long j4, C0583j c0583j) {
        Executor executor = this.f246c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(new J0(0, this, c0583j), j4, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e4) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e4);
                C0572d0.b(c0583j.f253f, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            c0583j.v(new C0577g(scheduledFutureSchedule));
        } else {
            J.f192j.y0(j4, c0583j);
        }
    }
}
