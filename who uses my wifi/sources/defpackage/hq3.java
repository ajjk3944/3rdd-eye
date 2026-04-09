package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hq3 extends gq3 {
    public final n70 m;

    public hq3(n70 n70Var) {
        n70Var.getClass();
        this.m = n70Var;
    }

    @Override // defpackage.gp3, defpackage.n70
    public final void c(Runnable runnable, Executor executor) {
        this.m.c(runnable, executor);
    }

    @Override // defpackage.gp3, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.m.cancel(z);
    }

    @Override // defpackage.gp3, java.util.concurrent.Future
    public final Object get() {
        return this.m.get();
    }

    @Override // defpackage.gp3, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.m.isCancelled();
    }

    @Override // defpackage.gp3, java.util.concurrent.Future
    public final boolean isDone() {
        return this.m.isDone();
    }

    @Override // defpackage.gp3
    public final String toString() {
        return this.m.toString();
    }

    @Override // defpackage.gp3, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.m.get(j, timeUnit);
    }
}
