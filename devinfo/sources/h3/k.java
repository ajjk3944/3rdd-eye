package h3;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k implements vd.b {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f24838a;

    /* renamed from: b, reason: collision with root package name */
    public final j f24839b = new j(this);

    public k(h hVar) {
        this.f24838a = new WeakReference(hVar);
    }

    @Override // vd.b
    public final void a(Runnable runnable, Executor executor) {
        this.f24839b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        h hVar = (h) this.f24838a.get();
        boolean zCancel = this.f24839b.cancel(z3);
        if (zCancel && hVar != null) {
            hVar.f24833a = null;
            hVar.f24834b = null;
            hVar.f24835c.k(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f24839b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f24839b.f24830a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f24839b.isDone();
    }

    public final String toString() {
        return this.f24839b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f24839b.get(j, timeUnit);
    }
}
