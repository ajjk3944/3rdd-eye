package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.C6042b;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class q extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final gg.f[] f57978a;

    static final class a extends AtomicInteger implements InterfaceC5914d, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f57979a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicBoolean f57980b;

        /* renamed from: c, reason: collision with root package name */
        final C6042b f57981c;

        a(InterfaceC5914d interfaceC5914d, AtomicBoolean atomicBoolean, C6042b c6042b, int i10) {
            this.f57979a = interfaceC5914d;
            this.f57980b = atomicBoolean;
            this.f57981c = c6042b;
            lazySet(i10);
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            if (decrementAndGet() == 0) {
                this.f57979a.a();
            }
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f57981c.a(interfaceC6043c);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f57981c.dispose();
            this.f57980b.set(true);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f57981c.isDisposed();
        }

        @Override // gg.InterfaceC5914d
        public void onError(Throwable th2) {
            this.f57981c.dispose();
            if (this.f57980b.compareAndSet(false, true)) {
                this.f57979a.onError(th2);
            } else {
                Eg.a.v(th2);
            }
        }
    }

    public q(gg.f[] fVarArr) {
        this.f57978a = fVarArr;
    }

    @Override // gg.AbstractC5912b
    public void V(InterfaceC5914d interfaceC5914d) {
        C6042b c6042b = new C6042b();
        a aVar = new a(interfaceC5914d, new AtomicBoolean(), c6042b, this.f57978a.length + 1);
        interfaceC5914d.c(aVar);
        for (gg.f fVar : this.f57978a) {
            if (c6042b.isDisposed()) {
                return;
            }
            if (fVar == null) {
                c6042b.dispose();
                aVar.onError(new NullPointerException("A completable source is null"));
                return;
            }
            fVar.e(aVar);
        }
        aVar.a();
    }
}
