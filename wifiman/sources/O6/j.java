package O6;

import I6.q;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
class j implements i {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f17618a = new AtomicBoolean(false);

    j() {
    }

    public synchronized void a() {
        while (!this.f17618a.get()) {
            try {
                wait();
            } catch (InterruptedException e10) {
                if (!this.f17618a.get()) {
                    q.r(e10, "Queue's awaitRelease() has been interrupted abruptly while it wasn't released by the release() method.", new Object[0]);
                }
            }
        }
    }

    @Override // O6.i
    public synchronized void release() {
        if (this.f17618a.compareAndSet(false, true)) {
            notify();
        }
    }
}
