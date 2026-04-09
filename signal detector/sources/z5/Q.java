package z5;

import c5.C0412i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public final class Q extends V {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24502f = AtomicIntegerFieldUpdater.newUpdater(Q.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final p5.l f24503e;

    public Q(p5.l lVar) {
        this.f24503e = lVar;
    }

    @Override // p5.l
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        o((Throwable) obj);
        return C0412i.f5929a;
    }

    @Override // z5.X
    public final void o(Throwable th) {
        if (f24502f.compareAndSet(this, 0, 1)) {
            this.f24503e.f(th);
        }
    }
}
