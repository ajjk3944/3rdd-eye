package xk;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d0 extends cl.r {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f37176e = AtomicIntegerFieldUpdater.newUpdater(d0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // cl.r, xk.f1
    public final void o(Object obj) {
        q(obj);
    }

    @Override // cl.r, xk.f1
    public final void q(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f37176e;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                cl.b.h(a.a.r(this.f2937d), x.x(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
