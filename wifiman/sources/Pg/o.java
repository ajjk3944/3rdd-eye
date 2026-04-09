package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;

/* loaded from: classes4.dex */
public final class o extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final gg.D f57975a;

    static final class a implements gg.B {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f57976a;

        a(InterfaceC5914d interfaceC5914d) {
            this.f57976a = interfaceC5914d;
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f57976a.c(interfaceC6043c);
        }

        @Override // gg.B
        public void onError(Throwable th2) {
            this.f57976a.onError(th2);
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            this.f57976a.a();
        }
    }

    public o(gg.D d10) {
        this.f57975a = d10;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        this.f57975a.a(new a(interfaceC5914d));
    }
}
