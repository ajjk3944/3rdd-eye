package qg;

import yg.C8670e;

/* loaded from: classes4.dex */
public final class M extends gg.i implements Dg.e {

    /* renamed from: b, reason: collision with root package name */
    private final Object f58745b;

    public M(Object obj) {
        this.f58745b = obj;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        bVar.j(new C8670e(bVar, this.f58745b));
    }

    @Override // Dg.e, kg.q
    public Object get() {
        return this.f58745b;
    }
}
