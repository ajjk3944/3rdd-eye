package tg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import lg.EnumC6593c;
import zg.AbstractC8756i;
import zg.C8750c;

/* loaded from: classes4.dex */
public final class Z extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final kg.n f62277b;

    static final class a extends AtomicInteger implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62278a;

        /* renamed from: d, reason: collision with root package name */
        final Hg.d f62281d;

        /* renamed from: g, reason: collision with root package name */
        final gg.v f62284g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f62285h;

        /* renamed from: b, reason: collision with root package name */
        final AtomicInteger f62279b = new AtomicInteger();

        /* renamed from: c, reason: collision with root package name */
        final C8750c f62280c = new C8750c();

        /* renamed from: e, reason: collision with root package name */
        final C2181a f62282e = new C2181a();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference f62283f = new AtomicReference();

        /* renamed from: tg.Z$a$a, reason: collision with other inner class name */
        final class C2181a extends AtomicReference implements gg.x {
            C2181a() {
            }

            @Override // gg.x
            public void a() {
                a.this.d();
            }

            @Override // gg.x
            public void c(InterfaceC6043c interfaceC6043c) {
                EnumC6592b.setOnce(this, interfaceC6043c);
            }

            @Override // gg.x
            public void h(Object obj) {
                a.this.j();
            }

            @Override // gg.x
            public void onError(Throwable th2) {
                a.this.g(th2);
            }
        }

        a(gg.x xVar, Hg.d dVar, gg.v vVar) {
            this.f62278a = xVar;
            this.f62281d = dVar;
            this.f62284g = vVar;
        }

        @Override // gg.x
        public void a() {
            EnumC6592b.dispose(this.f62282e);
            AbstractC8756i.b(this.f62278a, this, this.f62280c);
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.replace(this.f62283f, interfaceC6043c);
        }

        void d() {
            EnumC6592b.dispose(this.f62283f);
            AbstractC8756i.b(this.f62278a, this, this.f62280c);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this.f62283f);
            EnumC6592b.dispose(this.f62282e);
        }

        void g(Throwable th2) {
            EnumC6592b.dispose(this.f62283f);
            AbstractC8756i.d(this.f62278a, th2, this, this.f62280c);
        }

        @Override // gg.x
        public void h(Object obj) {
            AbstractC8756i.e(this.f62278a, obj, this, this.f62280c);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) this.f62283f.get());
        }

        void j() {
            m();
        }

        void m() {
            if (this.f62279b.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f62285h) {
                        this.f62285h = true;
                        this.f62284g.d(this);
                    }
                    if (this.f62279b.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            EnumC6592b.replace(this.f62283f, null);
            this.f62285h = false;
            this.f62281d.h(th2);
        }
    }

    public Z(gg.v vVar, kg.n nVar) {
        super(vVar);
        this.f62277b = nVar;
    }

    @Override // gg.s
    protected void L0(gg.x xVar) {
        Hg.d dVarI1 = Hg.b.k1().i1();
        try {
            Object objApply = this.f62277b.apply(dVarI1);
            Objects.requireNonNull(objApply, "The handler returned a null ObservableSource");
            gg.v vVar = (gg.v) objApply;
            a aVar = new a(xVar, dVarI1, this.f62287a);
            xVar.c(aVar);
            vVar.d(aVar.f62282e);
            aVar.m();
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            EnumC6593c.error(th2, xVar);
        }
    }
}
