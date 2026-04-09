package qg;

import ig.AbstractC6152a;
import kg.InterfaceC6469f;

/* loaded from: classes4.dex */
public final class X extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC6469f f58822c;

    static final class a extends AbstractC7482a {

        /* renamed from: h, reason: collision with root package name */
        final InterfaceC6469f f58823h;

        a(Dj.b bVar, InterfaceC6469f interfaceC6469f) {
            super(bVar);
            this.f58823h = interfaceC6469f;
        }

        @Override // Dj.b
        public void h(Object obj) {
            Object andSet = this.f58838g.getAndSet(obj);
            InterfaceC6469f interfaceC6469f = this.f58823h;
            if (interfaceC6469f != null && andSet != null) {
                try {
                    interfaceC6469f.accept(andSet);
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    this.f58833b.cancel();
                    this.f58832a.onError(th2);
                }
            }
            d();
        }
    }

    public X(gg.i iVar, InterfaceC6469f interfaceC6469f) {
        super(iVar);
        this.f58822c = interfaceC6469f;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58857b.D1(new a(bVar, this.f58822c));
    }
}
