package rg;

import hg.InterfaceC6043c;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class n extends AbstractC7607a {

    static final class a implements gg.p, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.p f60556a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC6043c f60557b;

        a(gg.p pVar) {
            this.f60556a = pVar;
        }

        @Override // gg.p
        public void a() {
            this.f60557b = EnumC6592b.DISPOSED;
            this.f60556a.a();
        }

        @Override // gg.p
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f60557b, interfaceC6043c)) {
                this.f60557b = interfaceC6043c;
                this.f60556a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f60557b.dispose();
            this.f60557b = EnumC6592b.DISPOSED;
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f60557b.isDisposed();
        }

        @Override // gg.p
        public void onError(Throwable th2) {
            this.f60557b = EnumC6592b.DISPOSED;
            this.f60556a.onError(th2);
        }

        @Override // gg.p
        public void onSuccess(Object obj) {
            this.f60557b = EnumC6592b.DISPOSED;
            this.f60556a.a();
        }
    }

    public n(gg.r rVar) {
        super(rVar);
    }

    @Override // gg.n
    protected void v(gg.p pVar) {
        this.f60507a.a(new a(pVar));
    }
}
