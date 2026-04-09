package E5;

import h5.InterfaceC2375i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import z5.f0;

/* loaded from: classes3.dex */
public abstract class t extends d implements f0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1412d = AtomicIntegerFieldUpdater.newUpdater(t.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f1413c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public t(long j6, t tVar, int i) {
        super(tVar);
        this.f1413c = j6;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // E5.d
    public final boolean c() {
        return f1412d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f1412d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i, InterfaceC2375i interfaceC2375i);

    public final void h() {
        if (f1412d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f1412d;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
