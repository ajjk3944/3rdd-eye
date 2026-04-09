package qg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import ng.InterfaceC6941b;
import yg.EnumC8672g;

/* loaded from: classes4.dex */
public final class I extends AbstractC5912b implements InterfaceC6941b {

    /* renamed from: a, reason: collision with root package name */
    final gg.i f58721a;

    static final class a implements gg.l, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f58722a;

        /* renamed from: b, reason: collision with root package name */
        Dj.c f58723b;

        a(InterfaceC5914d interfaceC5914d) {
            this.f58722a = interfaceC5914d;
        }

        @Override // Dj.b
        public void a() {
            this.f58723b = EnumC8672g.CANCELLED;
            this.f58722a.a();
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f58723b.cancel();
            this.f58723b = EnumC8672g.CANCELLED;
        }

        @Override // Dj.b
        public void h(Object obj) {
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f58723b == EnumC8672g.CANCELLED;
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f58723b, cVar)) {
                this.f58723b = cVar;
                this.f58722a.c(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f58723b = EnumC8672g.CANCELLED;
            this.f58722a.onError(th2);
        }
    }

    public I(gg.i iVar) {
        this.f58721a = iVar;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        this.f58721a.D1(new a(interfaceC5914d));
    }

    @Override // ng.InterfaceC6941b
    public gg.i f() {
        return Eg.a.o(new H(this.f58721a));
    }
}
