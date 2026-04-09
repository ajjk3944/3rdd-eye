package wt;

/* loaded from: classes.dex */
public final class o1 extends bu.q {
    private volatile boolean threadLocalIsSet;

    /* renamed from: x, reason: collision with root package name */
    public final ThreadLocal f24646x;

    /* JADX WARN: Illegal instructions before constructor call */
    public o1(pq.c cVar, pq.h hVar) {
        p1 p1Var = p1.f24649a;
        super(cVar, hVar.Y(p1Var) == null ? hVar.i0(p1Var) : hVar);
        this.f24646x = new ThreadLocal();
        if (cVar.m().Y(pq.d.f20620a) instanceof q) {
            return;
        }
        Object objL = bu.a.l(hVar, null);
        bu.a.g(hVar, objL);
        c0(hVar, objL);
    }

    public final boolean b0() {
        boolean z10 = this.threadLocalIsSet && this.f24646x.get() == null;
        this.f24646x.remove();
        return !z10;
    }

    public final void c0(pq.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f24646x.set(new lq.l(hVar, obj));
    }

    @Override // bu.q, wt.b1
    public final void l(Object obj) {
        if (this.threadLocalIsSet) {
            lq.l lVar = (lq.l) this.f24646x.get();
            if (lVar != null) {
                bu.a.g((pq.h) lVar.f15571a, lVar.f15572d);
            }
            this.f24646x.remove();
        }
        Object objU = w.u(obj);
        pq.c cVar = this.f2985r;
        pq.h hVarM = cVar.m();
        Object objL = bu.a.l(hVarM, null);
        o1 o1VarA = objL != bu.a.f2954d ? w.A(cVar, hVarM, objL) : null;
        try {
            this.f2985r.g(objU);
            if (o1VarA == null || o1VarA.b0()) {
                bu.a.g(hVarM, objL);
            }
        } catch (Throwable th2) {
            if (o1VarA == null || o1VarA.b0()) {
                bu.a.g(hVarM, objL);
            }
            throw th2;
        }
    }
}
