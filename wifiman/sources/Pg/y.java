package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class y extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC5912b f58021a;

    /* renamed from: b, reason: collision with root package name */
    final gg.f f58022b;

    static final class a extends AtomicReference implements InterfaceC5914d, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f58023a;

        /* renamed from: b, reason: collision with root package name */
        final C2043a f58024b = new C2043a(this);

        /* renamed from: c, reason: collision with root package name */
        final AtomicBoolean f58025c = new AtomicBoolean();

        /* renamed from: pg.y$a$a, reason: collision with other inner class name */
        static final class C2043a extends AtomicReference implements InterfaceC5914d {

            /* renamed from: a, reason: collision with root package name */
            final a f58026a;

            C2043a(a aVar) {
                this.f58026a = aVar;
            }

            @Override // gg.InterfaceC5914d
            public void a() {
                this.f58026a.d();
            }

            @Override // gg.InterfaceC5914d
            public void c(InterfaceC6043c interfaceC6043c) {
                EnumC6592b.setOnce(this, interfaceC6043c);
            }

            @Override // gg.InterfaceC5914d
            public void onError(Throwable th2) {
                this.f58026a.g(th2);
            }
        }

        a(InterfaceC5914d interfaceC5914d) {
            this.f58023a = interfaceC5914d;
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            if (this.f58025c.compareAndSet(false, true)) {
                EnumC6592b.dispose(this.f58024b);
                this.f58023a.a();
            }
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.setOnce(this, interfaceC6043c);
        }

        void d() {
            if (this.f58025c.compareAndSet(false, true)) {
                EnumC6592b.dispose(this);
                this.f58023a.a();
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (this.f58025c.compareAndSet(false, true)) {
                EnumC6592b.dispose(this);
                EnumC6592b.dispose(this.f58024b);
            }
        }

        void g(Throwable th2) {
            if (!this.f58025c.compareAndSet(false, true)) {
                Eg.a.v(th2);
            } else {
                EnumC6592b.dispose(this);
                this.f58023a.onError(th2);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f58025c.get();
        }

        @Override // gg.InterfaceC5914d
        public void onError(Throwable th2) {
            if (!this.f58025c.compareAndSet(false, true)) {
                Eg.a.v(th2);
            } else {
                EnumC6592b.dispose(this.f58024b);
                this.f58023a.onError(th2);
            }
        }
    }

    public y(AbstractC5912b abstractC5912b, gg.f fVar) {
        this.f58021a = abstractC5912b;
        this.f58022b = fVar;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        a aVar = new a(interfaceC5914d);
        interfaceC5914d.c(aVar);
        this.f58022b.e(aVar.f58024b);
        this.f58021a.e(aVar);
    }
}
