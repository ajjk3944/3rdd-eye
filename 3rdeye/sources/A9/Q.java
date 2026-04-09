package A9;

import F9.C0658a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: Builders.common.kt */
/* loaded from: classes3.dex */
public final class Q<T> extends F9.v<T> {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f201f = AtomicIntegerFieldUpdater.newUpdater(Q.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public Q() {
        throw null;
    }

    @Override // F9.v, A9.C0605u0
    public final void r(Object obj) {
        s(obj);
    }

    @Override // F9.v, A9.C0605u0
    public final void s(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f201f;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                C0658a.a(com.google.gson.internal.c.r(this.f1784e), A0.a(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
