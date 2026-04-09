package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jt extends ht implements zn {
    public final Executor h;

    public jt(Executor executor) {
        Method method;
        this.h = executor;
        Method method2 = mh.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = mh.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.zn
    public final jp c(long j, u11 u11Var, hk hkVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Executor executor = this.h;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(u11Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                w30 w30Var = (w30) hkVar.h(fr.j);
                if (w30Var != null) {
                    ((g40) w30Var).o(cancellationException);
                }
            }
        }
        return scheduledFutureSchedule != null ? new ip(scheduledFutureSchedule) : an.n.c(j, u11Var, hkVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.h;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jt) && ((jt) obj).h == this.h;
    }

    public final int hashCode() {
        return System.identityHashCode(this.h);
    }

    @Override // defpackage.lk
    public final void k(hk hkVar, Runnable runnable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.h.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            w30 w30Var = (w30) hkVar.h(fr.j);
            if (w30Var != null) {
                ((g40) w30Var).o(cancellationException);
            }
            fp.b.k(hkVar, runnable);
        }
    }

    @Override // defpackage.lk
    public final String toString() {
        return this.h.toString();
    }
}
