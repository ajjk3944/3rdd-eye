package wt;

/* loaded from: classes.dex */
public final class y0 extends w0 {
    public final k B;
    public final Object D;

    /* renamed from: x, reason: collision with root package name */
    public final b1 f24673x;

    /* renamed from: y, reason: collision with root package name */
    public final z0 f24674y;

    public y0(b1 b1Var, z0 z0Var, k kVar, Object obj) {
        this.f24673x = b1Var;
        this.f24674y = z0Var;
        this.B = kVar;
        this.D = obj;
    }

    @Override // wt.w0
    public final boolean k() {
        return false;
    }

    @Override // wt.w0
    public final void l(Throwable th2) {
        k kVar = this.B;
        k kVarK = b1.K(kVar);
        b1 b1Var = this.f24673x;
        z0 z0Var = this.f24674y;
        Object obj = this.D;
        if (kVarK == null || !b1Var.W(z0Var, kVarK, obj)) {
            z0Var.f24679a.e(new bu.h(2), 2);
            k kVarK2 = b1.K(kVar);
            if (kVarK2 == null || !b1Var.W(z0Var, kVarK2, obj)) {
                b1Var.d(b1Var.x(z0Var, obj));
            }
        }
    }
}
