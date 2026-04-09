package tg;

import tg.a0;

/* loaded from: classes4.dex */
public final class L extends gg.s implements Dg.e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f62168a;

    public L(Object obj) {
        this.f62168a = obj;
    }

    @Override // gg.s
    protected void L0(gg.x xVar) {
        a0.a aVar = new a0.a(xVar, this.f62168a);
        xVar.c(aVar);
        aVar.run();
    }

    @Override // Dg.e, kg.q
    public Object get() {
        return this.f62168a;
    }
}
