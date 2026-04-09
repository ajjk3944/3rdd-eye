package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class p30 extends y30 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(p30.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final f30 j;

    public p30(f30 f30Var) {
        this.j = f30Var;
    }

    @Override // defpackage.f30
    public final void d(Throwable th) {
        if (k.compareAndSet(this, 0, 1)) {
            this.j.d(th);
        }
    }
}
