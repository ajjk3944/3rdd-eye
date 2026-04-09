package xk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d1 extends b1 {

    /* renamed from: e, reason: collision with root package name */
    public final f1 f37177e;

    /* renamed from: f, reason: collision with root package name */
    public final e1 f37178f;
    public final l g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f37179h;

    public d1(f1 f1Var, e1 e1Var, l lVar, Object obj) {
        this.f37177e = f1Var;
        this.f37178f = e1Var;
        this.g = lVar;
        this.f37179h = obj;
    }

    @Override // xk.b1
    public final boolean k() {
        return false;
    }

    @Override // xk.b1
    public final void l(Throwable th2) {
        l lVar = this.g;
        l lVarW = f1.W(lVar);
        f1 f1Var = this.f37177e;
        e1 e1Var = this.f37178f;
        Object obj = this.f37179h;
        if (lVarW == null || !f1Var.f0(e1Var, lVarW, obj)) {
            e1Var.f37186a.e(new cl.i(2), 2);
            l lVarW2 = f1.W(lVar);
            if (lVarW2 == null || !f1Var.f0(e1Var, lVarW2, obj)) {
                f1Var.o(f1Var.C(e1Var, obj));
            }
        }
    }
}
