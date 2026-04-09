package z5;

import h5.InterfaceC2375i;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class M extends L implements A {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f24499c;

    public M(Executor executor) {
        Method method;
        this.f24499c = executor;
        Method method2 = E5.c.f1379a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = E5.c.f1379a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // z5.A
    public final void b(long j6, C3030f c3030f) {
        Executor executor = this.f24499c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            f1.i iVar = new f1.i(this, 10, c3030f);
            InterfaceC2375i interfaceC2375i = c3030f.f24532e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(iVar, j6, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e6) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e6);
                AbstractC3046w.d(interfaceC2375i, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            c3030f.v(new C3028d(0, scheduledFutureSchedule));
        } else {
            RunnableC3047x.i.b(j6, c3030f);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f24499c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // z5.AbstractC3042s
    public final void d(InterfaceC2375i interfaceC2375i, Runnable runnable) {
        try {
            this.f24499c.execute(runnable);
        } catch (RejectedExecutionException e6) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e6);
            AbstractC3046w.d(interfaceC2375i, cancellationException);
            D.f24486b.d(interfaceC2375i, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof M) && ((M) obj).f24499c == this.f24499c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f24499c);
    }

    @Override // z5.AbstractC3042s
    public final String toString() {
        return this.f24499c.toString();
    }
}
