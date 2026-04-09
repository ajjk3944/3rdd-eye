package F;

import T.AbstractC3528f1;
import T.InterfaceC3545n0;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public final class J implements H.b {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6824a f4913b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3545n0 f4914c = AbstractC3528f1.a(-1);

    public J(InterfaceC6824a interfaceC6824a) {
        this.f4913b = interfaceC6824a;
    }

    private final void e(int i10) {
        this.f4914c.l(i10);
    }

    @Override // H.b
    public void a(H.f fVar) {
        if (fVar.c().a() != 1 || L0.S.j(fVar.c().c(0)) != 1 || L0.S.j(fVar.c().b(0)) != 0 || fVar.f()) {
            e(-1);
            return;
        }
        int iL = L0.S.l(fVar.c().c(0));
        if (c() != iL) {
            this.f4913b.invoke();
            e(iL);
        }
    }

    public final int c() {
        return this.f4914c.e();
    }

    public final void d() {
        e(-1);
    }
}
