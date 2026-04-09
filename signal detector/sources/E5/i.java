package E5;

import h5.InterfaceC2375i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import z5.A;
import z5.AbstractC3042s;
import z5.AbstractC3048y;
import z5.C3030f;

/* loaded from: classes3.dex */
public final class i extends AbstractC3042s implements A {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1390h = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC3042s f1391c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A f1393e;

    /* renamed from: f, reason: collision with root package name */
    public final l f1394f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1395g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public i(AbstractC3042s abstractC3042s, int i) {
        this.f1391c = abstractC3042s;
        this.f1392d = i;
        A a6 = abstractC3042s instanceof A ? (A) abstractC3042s : null;
        this.f1393e = a6 == null ? AbstractC3048y.f24568a : a6;
        this.f1394f = new l();
        this.f1395g = new Object();
    }

    @Override // z5.A
    public final void b(long j6, C3030f c3030f) {
        this.f1393e.b(j6, c3030f);
    }

    @Override // z5.AbstractC3042s
    public final void d(InterfaceC2375i interfaceC2375i, Runnable runnable) {
        this.f1394f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1390h;
        if (atomicIntegerFieldUpdater.get(this) < this.f1392d) {
            synchronized (this.f1395g) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f1392d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableK = k();
                if (runnableK == null) {
                    return;
                }
                this.f1391c.d(this, new A1.d(this, 5, runnableK));
            }
        }
    }

    public final Runnable k() {
        while (true) {
            Runnable runnable = (Runnable) this.f1394f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f1395g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1390h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1394f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
