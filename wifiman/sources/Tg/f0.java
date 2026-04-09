package tg;

import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class f0 extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final gg.y f62364b;

    static final class a extends AtomicReference implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62365a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference f62366b = new AtomicReference();

        a(gg.x xVar) {
            this.f62365a = xVar;
        }

        @Override // gg.x
        public void a() {
            this.f62365a.a();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.setOnce(this.f62366b, interfaceC6043c);
        }

        void d(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.setOnce(this, interfaceC6043c);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this.f62366b);
            EnumC6592b.dispose(this);
        }

        @Override // gg.x
        public void h(Object obj) {
            this.f62365a.h(obj);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) get());
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            this.f62365a.onError(th2);
        }
    }

    final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final a f62367a;

        b(a aVar) {
            this.f62367a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            f0.this.f62287a.d(this.f62367a);
        }
    }

    public f0(gg.v vVar, gg.y yVar) {
        super(vVar);
        this.f62364b = yVar;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        a aVar = new a(xVar);
        xVar.c(aVar);
        aVar.d(this.f62364b.e(new b(aVar)));
    }
}
