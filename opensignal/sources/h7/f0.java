package h7;

/* loaded from: classes.dex */
public final class f0 extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f10057a;

    public f0(g0 g0Var) {
        this.f10057a = g0Var;
    }

    @Override // h7.s0
    public final void a() {
        g0 g0Var = this.f10057a;
        g0Var.f10073e = g0Var.f10071c.b();
        a8.f fVar = g0Var.f10072d;
        ((f) fVar.f195a).f10189a.b();
        fVar.e();
    }

    @Override // h7.s0
    public final void b(int i10, int i11) {
        g0 g0Var = this.f10057a;
        a8.f fVar = g0Var.f10072d;
        ((f) fVar.f195a).f10189a.d(i10 + fVar.k(g0Var), i11);
    }

    @Override // h7.s0
    public final void c(int i10, int i11) {
        g0 g0Var = this.f10057a;
        g0Var.f10073e += i11;
        a8.f fVar = g0Var.f10072d;
        ((f) fVar.f195a).g(i10 + fVar.k(g0Var), i11);
        if (g0Var.f10073e <= 0 || g0Var.f10071c.f10191c != p0.PREVENT_WHEN_EMPTY) {
            return;
        }
        g0Var.f10072d.e();
    }

    @Override // h7.s0
    public final void d(int i10, int i11) {
        g0 g0Var = this.f10057a;
        a8.f fVar = g0Var.f10072d;
        int iK = fVar.k(g0Var);
        ((f) fVar.f195a).f(i10 + iK, i11 + iK);
    }

    @Override // h7.s0
    public final void e(int i10, int i11) {
        g0 g0Var = this.f10057a;
        g0Var.f10073e -= i11;
        a8.f fVar = g0Var.f10072d;
        ((f) fVar.f195a).h(i10 + fVar.k(g0Var), i11);
        if (g0Var.f10073e >= 1 || g0Var.f10071c.f10191c != p0.PREVENT_WHEN_EMPTY) {
            return;
        }
        g0Var.f10072d.e();
    }

    @Override // h7.s0
    public final void f() {
        this.f10057a.f10072d.e();
    }
}
