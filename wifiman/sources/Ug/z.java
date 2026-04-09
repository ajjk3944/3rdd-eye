package ug;

import gg.D;
import hg.InterfaceC6043c;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class z extends gg.s {

    /* renamed from: a, reason: collision with root package name */
    final D f63065a;

    static final class a extends og.g implements gg.B {

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6043c f63066c;

        a(gg.x xVar) {
            super(xVar);
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f63066c, interfaceC6043c)) {
                this.f63066c = interfaceC6043c;
                this.f55692a.c(this);
            }
        }

        @Override // og.g, hg.InterfaceC6043c
        public void dispose() {
            super.dispose();
            this.f63066c.dispose();
        }

        @Override // gg.B
        public void onError(Throwable th2) {
            j(th2);
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            g(obj);
        }
    }

    public z(D d10) {
        this.f63065a = d10;
    }

    public static gg.B i1(gg.x xVar) {
        return new a(xVar);
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        this.f63065a.a(i1(xVar));
    }
}
