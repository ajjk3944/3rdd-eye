package w;

import f4.InterfaceFutureC2326a;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k implements InterfaceFutureC2326a {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f23929a;

    /* renamed from: b, reason: collision with root package name */
    public final j f23930b = new j(this);

    public k(h hVar) {
        this.f23929a = new WeakReference(hVar);
    }

    @Override // f4.InterfaceFutureC2326a
    public final void a(Runnable runnable, Executor executor) {
        this.f23930b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        h hVar = (h) this.f23929a.get();
        boolean zCancel = this.f23930b.cancel(z6);
        if (zCancel && hVar != null) {
            hVar.f23924a = null;
            hVar.f23925b = null;
            hVar.f23926c.j(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f23930b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f23930b.f23921a instanceof C2963a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f23930b.isDone();
    }

    public final String toString() {
        return this.f23930b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f23930b.get(j6, timeUnit);
    }
}
