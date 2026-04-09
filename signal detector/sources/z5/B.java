package z5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public final class B extends E5.s {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24483e = AtomicIntegerFieldUpdater.newUpdater(B.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // E5.s, z5.c0
    public final void c(Object obj) {
        f(obj);
    }

    @Override // E5.s, z5.c0
    public final void f(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f24483e;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                E5.a.g(com.bumptech.glide.c.B(this.f1411d), AbstractC3046w.m(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
