package tg;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
final class q0 extends gg.s {

    /* renamed from: a, reason: collision with root package name */
    final Hg.d f62554a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicBoolean f62555b = new AtomicBoolean();

    q0(Hg.d dVar) {
        this.f62554a = dVar;
    }

    @Override // gg.s
    protected void L0(gg.x xVar) {
        this.f62554a.d(xVar);
        this.f62555b.set(true);
    }

    boolean i1() {
        return !this.f62555b.get() && this.f62555b.compareAndSet(false, true);
    }
}
