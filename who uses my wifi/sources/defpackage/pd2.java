package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class pd2 implements n70 {
    public final wq3 f = new wq3();

    public final boolean a(Object obj) {
        boolean zD = this.f.d(obj);
        if (!zD) {
            hg4.C.h.e("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return zD;
    }

    public final void b(Throwable th) {
        if (this.f.e(th)) {
            return;
        }
        hg4.C.h.e("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
    }

    @Override // defpackage.n70
    public final void c(Runnable runnable, Executor executor) {
        this.f.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f.f instanceof zo3;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f.get(j, timeUnit);
    }
}
