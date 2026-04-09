package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes4.dex */
public final class p1 extends s1 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22587f = AtomicIntegerFieldUpdater.newUpdater(p1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final l9.l f22588e;

    public p1(l9.l lVar) {
        this.f22588e = lVar;
    }

    @Override // l9.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        y((Throwable) obj);
        return y8.s.f25199a;
    }

    @Override // kotlinx.coroutines.e0
    public void y(Throwable th) {
        if (f22587f.compareAndSet(this, 0, 1)) {
            this.f22588e.invoke(th);
        }
    }
}
