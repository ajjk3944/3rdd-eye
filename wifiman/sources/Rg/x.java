package rg;

import hg.InterfaceC6043c;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class x extends gg.s {

    /* renamed from: a, reason: collision with root package name */
    final gg.r f60597a;

    static final class a extends og.g implements gg.p {

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6043c f60598c;

        a(gg.x xVar) {
            super(xVar);
        }

        @Override // gg.p
        public void a() {
            d();
        }

        @Override // gg.p
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f60598c, interfaceC6043c)) {
                this.f60598c = interfaceC6043c;
                this.f55692a.c(this);
            }
        }

        @Override // og.g, hg.InterfaceC6043c
        public void dispose() {
            super.dispose();
            this.f60598c.dispose();
        }

        @Override // gg.p
        public void onError(Throwable th2) {
            j(th2);
        }

        @Override // gg.p
        public void onSuccess(Object obj) {
            g(obj);
        }
    }

    public x(gg.r rVar) {
        this.f60597a = rVar;
    }

    public static gg.p i1(gg.x xVar) {
        return new a(xVar);
    }

    @Override // gg.s
    protected void L0(gg.x xVar) {
        this.f60597a.a(i1(xVar));
    }
}
