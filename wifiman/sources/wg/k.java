package wg;

/* loaded from: classes4.dex */
public final class k extends AbstractC8338a implements Runnable {
    public k(Runnable runnable, boolean z10) {
        super(runnable, z10);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f64905c = Thread.currentThread();
        try {
            this.f64903a.run();
            this.f64905c = null;
        } catch (Throwable th2) {
            dispose();
            this.f64905c = null;
            Eg.a.v(th2);
            throw th2;
        }
    }

    @Override // wg.AbstractC8338a, java.util.concurrent.atomic.AtomicReference
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
