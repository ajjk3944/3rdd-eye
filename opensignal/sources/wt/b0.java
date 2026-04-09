package wt;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class b0 extends bu.q {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24603x = AtomicIntegerFieldUpdater.newUpdater(b0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // bu.q, wt.b1
    public final void d(Object obj) {
        l(obj);
    }

    @Override // bu.q, wt.b1
    public final void l(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f24603x;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                bu.a.h(w.u(obj), xu.l.D(this.f2985r));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
