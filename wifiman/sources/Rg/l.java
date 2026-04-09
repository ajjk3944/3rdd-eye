package rg;

import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class l extends gg.n {

    /* renamed from: a, reason: collision with root package name */
    final gg.f f60550a;

    static final class a implements InterfaceC5914d, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.p f60551a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC6043c f60552b;

        a(gg.p pVar) {
            this.f60551a = pVar;
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            this.f60552b = EnumC6592b.DISPOSED;
            this.f60551a.a();
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f60552b, interfaceC6043c)) {
                this.f60552b = interfaceC6043c;
                this.f60551a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f60552b.dispose();
            this.f60552b = EnumC6592b.DISPOSED;
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f60552b.isDisposed();
        }

        @Override // gg.InterfaceC5914d
        public void onError(Throwable th2) {
            this.f60552b = EnumC6592b.DISPOSED;
            this.f60551a.onError(th2);
        }
    }

    public l(gg.f fVar) {
        this.f60550a = fVar;
    }

    @Override // gg.n
    protected void v(gg.p pVar) {
        this.f60550a.e(new a(pVar));
    }
}
