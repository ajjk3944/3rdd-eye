package rg;

import hg.InterfaceC6043c;

/* loaded from: classes4.dex */
public final class p extends gg.n implements Dg.e {

    /* renamed from: a, reason: collision with root package name */
    final Object f60561a;

    public p(Object obj) {
        this.f60561a = obj;
    }

    @Override // Dg.e, kg.q
    public Object get() {
        return this.f60561a;
    }

    @Override // gg.n
    protected void v(gg.p pVar) {
        pVar.c(InterfaceC6043c.n());
        pVar.onSuccess(this.f60561a);
    }
}
