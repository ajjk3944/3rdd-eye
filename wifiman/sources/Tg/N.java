package tg;

import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import zg.AbstractC8756i;
import zg.C8750c;

/* loaded from: classes4.dex */
public final class N extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final gg.f f62171b;

    static final class a extends AtomicInteger implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62172a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference f62173b = new AtomicReference();

        /* renamed from: c, reason: collision with root package name */
        final C2179a f62174c = new C2179a(this);

        /* renamed from: d, reason: collision with root package name */
        final C8750c f62175d = new C8750c();

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f62176e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f62177f;

        /* renamed from: tg.N$a$a, reason: collision with other inner class name */
        static final class C2179a extends AtomicReference implements InterfaceC5914d {

            /* renamed from: a, reason: collision with root package name */
            final a f62178a;

            C2179a(a aVar) {
                this.f62178a = aVar;
            }

            @Override // gg.InterfaceC5914d
            public void a() {
                this.f62178a.d();
            }

            @Override // gg.InterfaceC5914d
            public void c(InterfaceC6043c interfaceC6043c) {
                EnumC6592b.setOnce(this, interfaceC6043c);
            }

            @Override // gg.InterfaceC5914d
            public void onError(Throwable th2) {
                this.f62178a.g(th2);
            }
        }

        a(gg.x xVar) {
            this.f62172a = xVar;
        }

        @Override // gg.x
        public void a() {
            this.f62176e = true;
            if (this.f62177f) {
                AbstractC8756i.b(this.f62172a, this, this.f62175d);
            }
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.setOnce(this.f62173b, interfaceC6043c);
        }

        void d() {
            this.f62177f = true;
            if (this.f62176e) {
                AbstractC8756i.b(this.f62172a, this, this.f62175d);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this.f62173b);
            EnumC6592b.dispose(this.f62174c);
            this.f62175d.h();
        }

        void g(Throwable th2) {
            EnumC6592b.dispose(this.f62173b);
            AbstractC8756i.d(this.f62172a, th2, this, this.f62175d);
        }

        @Override // gg.x
        public void h(Object obj) {
            AbstractC8756i.e(this.f62172a, obj, this, this.f62175d);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) this.f62173b.get());
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            EnumC6592b.dispose(this.f62174c);
            AbstractC8756i.d(this.f62172a, th2, this, this.f62175d);
        }
    }

    public N(gg.s sVar, gg.f fVar) {
        super(sVar);
        this.f62171b = fVar;
    }

    @Override // gg.s
    protected void L0(gg.x xVar) {
        a aVar = new a(xVar);
        xVar.c(aVar);
        this.f62287a.d(aVar);
        this.f62171b.e(aVar.f62174c);
    }
}
