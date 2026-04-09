package rg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import lg.EnumC6592b;
import ng.InterfaceC6942c;

/* loaded from: classes4.dex */
public final class o extends AbstractC5912b implements InterfaceC6942c {

    /* renamed from: a, reason: collision with root package name */
    final gg.r f60558a;

    static final class a implements gg.p, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f60559a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC6043c f60560b;

        a(InterfaceC5914d interfaceC5914d) {
            this.f60559a = interfaceC5914d;
        }

        @Override // gg.p
        public void a() {
            this.f60560b = EnumC6592b.DISPOSED;
            this.f60559a.a();
        }

        @Override // gg.p
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f60560b, interfaceC6043c)) {
                this.f60560b = interfaceC6043c;
                this.f60559a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f60560b.dispose();
            this.f60560b = EnumC6592b.DISPOSED;
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f60560b.isDisposed();
        }

        @Override // gg.p
        public void onError(Throwable th2) {
            this.f60560b = EnumC6592b.DISPOSED;
            this.f60559a.onError(th2);
        }

        @Override // gg.p
        public void onSuccess(Object obj) {
            this.f60560b = EnumC6592b.DISPOSED;
            this.f60559a.a();
        }
    }

    public o(gg.r rVar) {
        this.f60558a = rVar;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        this.f60558a.a(new a(interfaceC5914d));
    }

    @Override // ng.InterfaceC6942c
    public gg.n d() {
        return Eg.a.p(new n(this.f60558a));
    }
}
