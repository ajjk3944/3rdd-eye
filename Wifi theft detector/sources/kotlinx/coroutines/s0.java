package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.JvmField;

/* loaded from: classes4.dex */
public final class s0 extends kotlinx.coroutines.internal.y {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22597e = AtomicIntegerFieldUpdater.newUpdater(s0.class, "_decision$volatile");

    @JvmField
    private volatile /* synthetic */ int _decision$volatile;

    public s0(kotlin.coroutines.d dVar, c9.c cVar) {
        super(dVar, cVar);
    }

    private final boolean W0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f22597e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f22597e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean X0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f22597e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f22597e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // kotlinx.coroutines.internal.y, kotlinx.coroutines.y1
    public void H(Object obj) {
        Q0(obj);
    }

    @Override // kotlinx.coroutines.internal.y, kotlinx.coroutines.a
    public void Q0(Object obj) {
        if (W0()) {
            return;
        }
        kotlinx.coroutines.internal.j.c(IntrinsicsKt__IntrinsicsJvmKt.c(this.f22567d), f0.a(obj, this.f22567d), null, 2, null);
    }

    public final Object U0() {
        if (X0()) {
            return kotlin.coroutines.intrinsics.a.f();
        }
        Object objH = z1.h(i0());
        if (objH instanceof c0) {
            throw ((c0) objH).f22236a;
        }
        return objH;
    }
}
