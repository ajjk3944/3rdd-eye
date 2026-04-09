package wg;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class l extends AbstractC8338a implements Callable {
    public l(Runnable runnable, boolean z10) {
        super(runnable, z10);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Void call() {
        this.f64905c = Thread.currentThread();
        try {
            try {
                this.f64903a.run();
                return null;
            } finally {
                lazySet(AbstractC8338a.f64901d);
                this.f64905c = null;
            }
        } catch (Throwable th2) {
            Eg.a.v(th2);
            throw th2;
        }
    }

    @Override // wg.AbstractC8338a, java.util.concurrent.atomic.AtomicReference
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
