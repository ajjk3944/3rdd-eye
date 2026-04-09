package tg;

import hg.InterfaceC6043c;

/* loaded from: classes4.dex */
public final class H extends AbstractC8090a {

    static final class a implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62154a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC6043c f62155b;

        a(gg.x xVar) {
            this.f62154a = xVar;
        }

        @Override // gg.x
        public void a() {
            this.f62154a.a();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f62155b = interfaceC6043c;
            this.f62154a.c(this);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62155b.dispose();
        }

        @Override // gg.x
        public void h(Object obj) {
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62155b.isDisposed();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            this.f62154a.onError(th2);
        }
    }

    public H(gg.v vVar) {
        super(vVar);
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        this.f62287a.d(new a(xVar));
    }
}
