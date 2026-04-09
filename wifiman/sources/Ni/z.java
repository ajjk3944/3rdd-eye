package Ni;

import Ii.L0;
import com.google.ar.core.ImageMetadata;
import dh.InterfaceC5384i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes4.dex */
public abstract class z extends AbstractC3400b implements L0 {

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f16628d = AtomicIntegerFieldUpdater.newUpdater(z.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f16629c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public z(long j10, z zVar, int i10) {
        super(zVar);
        this.f16629c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // Ni.AbstractC3400b
    public boolean k() {
        return f16628d.get(this) == r() && !l();
    }

    public final boolean p() {
        return f16628d.addAndGet(this, -65536) == r() && !l();
    }

    public abstract int r();

    public abstract void s(int i10, Throwable th2, InterfaceC5384i interfaceC5384i);

    public final void t() {
        if (f16628d.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f16628d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == r() && !l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE + i10));
        return true;
    }
}
