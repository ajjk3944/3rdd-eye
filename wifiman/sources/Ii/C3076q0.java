package Ii;

import dh.InterfaceC5384i;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: Ii.q0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3076q0 extends AbstractC3074p0 implements X {

    /* renamed from: d, reason: collision with root package name */
    private final Executor f9353d;

    public C3076q0(Executor executor) {
        this.f9353d = executor;
        if (q0() instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) q0()).setRemoveOnCancelPolicy(true);
        }
    }

    private final void p0(InterfaceC5384i interfaceC5384i, RejectedExecutionException rejectedExecutionException) {
        A0.d(interfaceC5384i, AbstractC3070n0.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture r0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, InterfaceC5384i interfaceC5384i, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            p0(interfaceC5384i, e10);
            return null;
        }
    }

    @Override // Ii.X
    public void J(long j10, InterfaceC3069n interfaceC3069n) {
        Executor executorQ0 = q0();
        ScheduledExecutorService scheduledExecutorService = executorQ0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorQ0 : null;
        ScheduledFuture scheduledFutureR0 = scheduledExecutorService != null ? r0(scheduledExecutorService, new P0(this, interfaceC3069n), interfaceC3069n.getContext(), j10) : null;
        if (scheduledFutureR0 != null) {
            r.c(interfaceC3069n, new C3065l(scheduledFutureR0));
        } else {
            T.f9282i.J(j10, interfaceC3069n);
        }
    }

    @Override // Ii.J
    public void Y(InterfaceC5384i interfaceC5384i, Runnable runnable) {
        try {
            Executor executorQ0 = q0();
            AbstractC3047c.a();
            executorQ0.execute(runnable);
        } catch (RejectedExecutionException e10) {
            AbstractC3047c.a();
            p0(interfaceC5384i, e10);
            C3048c0.b().Y(interfaceC5384i, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorQ0 = q0();
        ExecutorService executorService = executorQ0 instanceof ExecutorService ? (ExecutorService) executorQ0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3076q0) && ((C3076q0) obj).q0() == q0();
    }

    public int hashCode() {
        return System.identityHashCode(q0());
    }

    @Override // Ii.X
    public InterfaceC3052e0 p(long j10, Runnable runnable, InterfaceC5384i interfaceC5384i) {
        Executor executorQ0 = q0();
        ScheduledExecutorService scheduledExecutorService = executorQ0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorQ0 : null;
        ScheduledFuture scheduledFutureR0 = scheduledExecutorService != null ? r0(scheduledExecutorService, runnable, interfaceC5384i, j10) : null;
        return scheduledFutureR0 != null ? new C3050d0(scheduledFutureR0) : T.f9282i.p(j10, runnable, interfaceC5384i);
    }

    public Executor q0() {
        return this.f9353d;
    }

    @Override // Ii.J
    public String toString() {
        return q0().toString();
    }
}
