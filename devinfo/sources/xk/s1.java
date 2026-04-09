package xk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s1 extends cl.r {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f37237e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public s1(ck.c cVar, ck.h hVar) {
        t1 t1Var = t1.f37239a;
        super(cVar, hVar.O(t1Var) == null ? hVar.y(t1Var) : hVar);
        this.f37237e = new ThreadLocal();
        if (cVar.getContext().O(ck.d.f2897a) instanceof r) {
            return;
        }
        Object objN = cl.b.n(hVar, null);
        cl.b.g(hVar, objN);
        m0(hVar, objN);
    }

    @Override // cl.r
    public final void j0() {
        l0();
    }

    public final boolean k0() {
        boolean z3 = this.threadLocalIsSet && this.f37237e.get() == null;
        this.f37237e.remove();
        return !z3;
    }

    public final void l0() {
        if (this.threadLocalIsSet) {
            yj.i iVar = (yj.i) this.f37237e.get();
            if (iVar != null) {
                cl.b.g((ck.h) iVar.f37638a, iVar.f37639b);
            }
            this.f37237e.remove();
        }
    }

    public final void m0(ck.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f37237e.set(new yj.i(hVar, obj));
    }

    @Override // cl.r, xk.f1
    public final void q(Object obj) {
        l0();
        Object objX = x.x(obj);
        ck.c cVar = this.f2937d;
        ck.h context = cVar.getContext();
        Object objN = cl.b.n(context, null);
        s1 s1VarD = objN != cl.b.f2905d ? x.D(cVar, context, objN) : null;
        try {
            cVar.resumeWith(objX);
            if (s1VarD == null || s1VarD.k0()) {
                cl.b.g(context, objN);
            }
        } catch (Throwable th2) {
            if (s1VarD == null || s1VarD.k0()) {
                cl.b.g(context, objN);
            }
            throw th2;
        }
    }
}
