package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import yg.EnumC8672g;

/* loaded from: classes4.dex */
public final class n extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final Dj.a f57972a;

    static final class a implements gg.l, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f57973a;

        /* renamed from: b, reason: collision with root package name */
        Dj.c f57974b;

        a(InterfaceC5914d interfaceC5914d) {
            this.f57973a = interfaceC5914d;
        }

        @Override // Dj.b
        public void a() {
            this.f57973a.a();
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f57974b.cancel();
            this.f57974b = EnumC8672g.CANCELLED;
        }

        @Override // Dj.b
        public void h(Object obj) {
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f57974b == EnumC8672g.CANCELLED;
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f57974b, cVar)) {
                this.f57974b = cVar;
                this.f57973a.c(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f57973a.onError(th2);
        }
    }

    public n(Dj.a aVar) {
        this.f57972a = aVar;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        this.f57972a.b(new a(interfaceC5914d));
    }
}
