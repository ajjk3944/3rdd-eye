package xk;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x0 extends b1 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f37258f = AtomicIntegerFieldUpdater.newUpdater(x0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final c0.a f37259e;

    public x0(c0.a aVar) {
        this.f37259e = aVar;
    }

    @Override // xk.b1
    public final boolean k() {
        return true;
    }

    @Override // xk.b1
    public final void l(Throwable th2) {
        if (f37258f.compareAndSet(this, 0, 1)) {
            this.f37259e.invoke(th2);
        }
    }
}
