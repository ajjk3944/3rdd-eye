package androidx.lifecycle;

/* loaded from: classes.dex */
public final class a0 extends b0 implements t {

    /* renamed from: x, reason: collision with root package name */
    public final v f1473x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c0 f1474y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c0 c0Var, v vVar, e0 e0Var) {
        super(c0Var, e0Var);
        this.f1474y = c0Var;
        this.f1473x = vVar;
    }

    @Override // androidx.lifecycle.t
    public final void b(v vVar, m mVar) {
        v vVar2 = this.f1473x;
        n nVarE1 = vVar2.h().e1();
        if (nVarE1 == n.DESTROYED) {
            this.f1474y.h(this.f1477a);
            return;
        }
        n nVar = null;
        while (nVar != nVarE1) {
            a(e());
            nVar = nVarE1;
            nVarE1 = vVar2.h().e1();
        }
    }

    @Override // androidx.lifecycle.b0
    public final void c() {
        this.f1473x.h().m1(this);
    }

    @Override // androidx.lifecycle.b0
    public final boolean d(v vVar) {
        return this.f1473x == vVar;
    }

    @Override // androidx.lifecycle.b0
    public final boolean e() {
        return this.f1473x.h().e1().isAtLeast(n.STARTED);
    }
}
