package ug;

import gg.D;
import hg.InterfaceC6043c;
import lg.EnumC6592b;
import yg.AbstractC8668c;

/* loaded from: classes4.dex */
public final class y extends gg.i {

    /* renamed from: b, reason: collision with root package name */
    final D f63063b;

    static final class a extends AbstractC8668c implements gg.B {

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6043c f63064c;

        a(Dj.b bVar) {
            super(bVar);
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f63064c, interfaceC6043c)) {
                this.f63064c = interfaceC6043c;
                this.f66766a.j(this);
            }
        }

        @Override // yg.AbstractC8668c, Dj.c
        public void cancel() {
            super.cancel();
            this.f63064c.dispose();
        }

        @Override // gg.B
        public void onError(Throwable th2) {
            this.f66766a.onError(th2);
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            d(obj);
        }
    }

    public y(D d10) {
        this.f63063b = d10;
    }

    @Override // gg.i
    public void E1(Dj.b bVar) {
        this.f63063b.a(new a(bVar));
    }
}
