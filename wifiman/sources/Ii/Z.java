package Ii;

import Ni.AbstractC3406h;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes4.dex */
public final class Z extends Ni.y {

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9296e = AtomicIntegerFieldUpdater.newUpdater(Z.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public Z(InterfaceC5384i interfaceC5384i, InterfaceC5380e interfaceC5380e) {
        super(interfaceC5384i, interfaceC5380e);
    }

    private final boolean U0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9296e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f9296e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean V0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9296e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f9296e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // Ni.y, Ii.AbstractC3043a
    protected void N0(Object obj) {
        if (U0()) {
            return;
        }
        AbstractC3406h.b(AbstractC5467b.d(this.f16627d), D.a(obj, this.f16627d));
    }

    public final Object S0() {
        if (V0()) {
            return AbstractC5467b.g();
        }
        Object objH = E0.h(Y());
        if (objH instanceof C) {
            throw ((C) objH).f9236a;
        }
        return objH;
    }

    @Override // Ni.y, Ii.D0
    protected void w(Object obj) {
        N0(obj);
    }
}
