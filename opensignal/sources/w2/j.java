package w2;

import dd.p;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j implements re.b {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f24188a;

    /* renamed from: d, reason: collision with root package name */
    public final i f24189d = new i(this);

    public j(h hVar) {
        this.f24188a = new WeakReference(hVar);
    }

    @Override // re.b
    public final void a(re.a aVar, p pVar) {
        this.f24189d.a(aVar, pVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        h hVar = (h) this.f24188a.get();
        boolean zCancel = this.f24189d.cancel(z10);
        if (zCancel && hVar != null) {
            hVar.f24184a = null;
            hVar.f24185b = null;
            hVar.f24186c.j(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f24189d.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f24189d.f24181a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f24189d.isDone();
    }

    public final String toString() {
        return this.f24189d.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f24189d.get(j, timeUnit);
    }
}
