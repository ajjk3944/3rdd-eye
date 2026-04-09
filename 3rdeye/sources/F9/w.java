package F9;

import A9.F0;
import F9.w;
import f9.InterfaceC4350h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: classes3.dex */
public abstract class w<S extends w<S>> extends AbstractC0662e<S> implements F0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1785e = AtomicIntegerFieldUpdater.newUpdater(w.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final long f1786d;

    public w(long j4, S s10, int i) {
        super(s10);
        this.f1786d = j4;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // F9.AbstractC0662e
    public final boolean d() {
        return f1785e.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return f1785e.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i, InterfaceC4350h interfaceC4350h);

    public final void i() {
        if (f1785e.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f1785e;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
