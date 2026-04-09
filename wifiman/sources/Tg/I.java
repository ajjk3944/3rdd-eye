package tg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import ng.InterfaceC6943d;

/* loaded from: classes4.dex */
public final class I extends AbstractC5912b implements InterfaceC6943d {

    /* renamed from: a, reason: collision with root package name */
    final gg.v f62156a;

    static final class a implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f62157a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC6043c f62158b;

        a(InterfaceC5914d interfaceC5914d) {
            this.f62157a = interfaceC5914d;
        }

        @Override // gg.x
        public void a() {
            this.f62157a.a();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f62158b = interfaceC6043c;
            this.f62157a.c(this);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62158b.dispose();
        }

        @Override // gg.x
        public void h(Object obj) {
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62158b.isDisposed();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            this.f62157a.onError(th2);
        }
    }

    public I(gg.v vVar) {
        this.f62156a = vVar;
    }

    @Override // gg.AbstractC5912b
    public void V(InterfaceC5914d interfaceC5914d) {
        this.f62156a.d(new a(interfaceC5914d));
    }

    @Override // ng.InterfaceC6943d
    public gg.s b() {
        return Eg.a.q(new H(this.f62156a));
    }
}
