package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sq3 extends pu1 implements ScheduledFuture, n70, Future {
    public final gp3 v;
    public final ScheduledFuture w;

    public sq3(gp3 gp3Var, ScheduledFuture scheduledFuture) {
        this.v = gp3Var;
        this.w = scheduledFuture;
    }

    @Override // defpackage.n70
    public final void c(Runnable runnable, Executor executor) {
        this.v.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = this.v.cancel(z);
        if (zCancel) {
            this.w.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.w.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.v.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.w.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.v.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.v.isDone();
    }

    @Override // defpackage.pu1
    public final /* synthetic */ Object w() {
        return this.v;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.v.get(j, timeUnit);
    }
}
