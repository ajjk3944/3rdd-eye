package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.C6042b;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicInteger;
import zg.C8750c;

/* loaded from: classes4.dex */
public final class r extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final gg.f[] f57982a;

    static final class a implements InterfaceC5914d {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f57983a;

        /* renamed from: b, reason: collision with root package name */
        final C6042b f57984b;

        /* renamed from: c, reason: collision with root package name */
        final C8750c f57985c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicInteger f57986d;

        a(InterfaceC5914d interfaceC5914d, C6042b c6042b, C8750c c8750c, AtomicInteger atomicInteger) {
            this.f57983a = interfaceC5914d;
            this.f57984b = c6042b;
            this.f57985c = c8750c;
            this.f57986d = atomicInteger;
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            b();
        }

        void b() {
            if (this.f57986d.decrementAndGet() == 0) {
                this.f57985c.l(this.f57983a);
            }
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f57984b.a(interfaceC6043c);
        }

        @Override // gg.InterfaceC5914d
        public void onError(Throwable th2) {
            if (this.f57985c.g(th2)) {
                b();
            }
        }
    }

    static final class b implements InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final C8750c f57987a;

        b(C8750c c8750c) {
            this.f57987a = c8750c;
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f57987a.h();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f57987a.a();
        }
    }

    public r(gg.f[] fVarArr) {
        this.f57982a = fVarArr;
    }

    @Override // gg.AbstractC5912b
    public void V(InterfaceC5914d interfaceC5914d) {
        C6042b c6042b = new C6042b();
        AtomicInteger atomicInteger = new AtomicInteger(this.f57982a.length + 1);
        C8750c c8750c = new C8750c();
        c6042b.a(new b(c8750c));
        interfaceC5914d.c(c6042b);
        for (gg.f fVar : this.f57982a) {
            if (c6042b.isDisposed()) {
                return;
            }
            if (fVar == null) {
                c8750c.g(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                fVar.e(new a(interfaceC5914d, c6042b, c8750c, atomicInteger));
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            c8750c.l(interfaceC5914d);
        }
    }
}
