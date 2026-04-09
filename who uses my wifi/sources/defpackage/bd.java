package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bd implements n70 {
    public final WeakReference f;
    public final ad g = new ad(this);

    public bd(yc ycVar) {
        this.f = new WeakReference(ycVar);
    }

    @Override // defpackage.n70
    public final void c(Runnable runnable, Executor executor) {
        this.g.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        yc ycVar = (yc) this.f.get();
        boolean zCancel = this.g.cancel(z);
        if (zCancel && ycVar != null) {
            ycVar.a = null;
            ycVar.b = null;
            ycVar.c.j(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.g.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.g.f instanceof e0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.g.isDone();
    }

    public final String toString() {
        return this.g.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.g.get(j, timeUnit);
    }
}
