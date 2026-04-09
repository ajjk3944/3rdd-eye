package rg;

import hg.InterfaceC6043c;
import lg.EnumC6592b;
import yg.AbstractC8668c;

/* loaded from: classes4.dex */
public final class w extends gg.i {

    /* renamed from: b, reason: collision with root package name */
    final gg.r f60595b;

    static final class a extends AbstractC8668c implements gg.p {

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6043c f60596c;

        a(Dj.b bVar) {
            super(bVar);
        }

        @Override // gg.p
        public void a() {
            this.f66766a.a();
        }

        @Override // gg.p
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f60596c, interfaceC6043c)) {
                this.f60596c = interfaceC6043c;
                this.f66766a.j(this);
            }
        }

        @Override // yg.AbstractC8668c, Dj.c
        public void cancel() {
            super.cancel();
            this.f60596c.dispose();
        }

        @Override // gg.p
        public void onError(Throwable th2) {
            this.f66766a.onError(th2);
        }

        @Override // gg.p
        public void onSuccess(Object obj) {
            d(obj);
        }
    }

    public w(gg.r rVar) {
        this.f60595b = rVar;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f60595b.a(new a(bVar));
    }
}
