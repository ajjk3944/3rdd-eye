package wt;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class l1 extends w0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(l1.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: x, reason: collision with root package name */
    public final Thread f24633x = Thread.currentThread();

    /* renamed from: y, reason: collision with root package name */
    public e0 f24634y;

    public static void n(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    @Override // wt.w0
    public final boolean k() {
        return true;
    }

    @Override // wt.w0
    public final void l(Throwable th2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = B;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                n(i10);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 2));
        this.f24633x.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void m() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = B;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        n(i10);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i10, 1)) {
                e0 e0Var = this.f24634y;
                if (e0Var != null) {
                    e0Var.a();
                    return;
                }
                return;
            }
        }
    }
}
