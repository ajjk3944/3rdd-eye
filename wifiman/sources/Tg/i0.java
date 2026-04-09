package tg;

import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import zg.AbstractC8756i;
import zg.C8750c;

/* loaded from: classes4.dex */
public final class i0 extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final gg.v f62413b;

    static final class a extends AtomicInteger implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62414a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference f62415b = new AtomicReference();

        /* renamed from: c, reason: collision with root package name */
        final C2184a f62416c = new C2184a();

        /* renamed from: d, reason: collision with root package name */
        final C8750c f62417d = new C8750c();

        /* renamed from: tg.i0$a$a, reason: collision with other inner class name */
        final class C2184a extends AtomicReference implements gg.x {
            C2184a() {
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
                EnumC6592b.dispose(this);
                a.this.d();
            }

            @Override // gg.x
            public void onError(Throwable th2) {
                a.this.g(th2);
            }
        }

        a(gg.x xVar) {
            this.f62414a = xVar;
        }

        @Override // gg.x
        public void a() {
            EnumC6592b.dispose(this.f62416c);
            AbstractC8756i.b(this.f62414a, this, this.f62417d);
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.setOnce(this.f62415b, interfaceC6043c);
        }

        void d() {
            EnumC6592b.dispose(this.f62415b);
            AbstractC8756i.b(this.f62414a, this, this.f62417d);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this.f62415b);
            EnumC6592b.dispose(this.f62416c);
        }

        void g(Throwable th2) {
            EnumC6592b.dispose(this.f62415b);
            AbstractC8756i.d(this.f62414a, th2, this, this.f62417d);
        }

        @Override // gg.x
        public void h(Object obj) {
            AbstractC8756i.e(this.f62414a, obj, this, this.f62417d);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) this.f62415b.get());
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            EnumC6592b.dispose(this.f62416c);
            AbstractC8756i.d(this.f62414a, th2, this, this.f62417d);
        }
    }

    public i0(gg.v vVar, gg.v vVar2) {
        super(vVar);
        this.f62413b = vVar2;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        a aVar = new a(xVar);
        xVar.c(aVar);
        this.f62413b.d(aVar.f62416c);
        this.f62287a.d(aVar);
    }
}
