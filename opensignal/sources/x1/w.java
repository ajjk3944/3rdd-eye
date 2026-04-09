package x1;

/* loaded from: classes.dex */
public final class w extends n0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x f24952u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar) {
        super(xVar);
        this.f24952u = xVar;
    }

    @Override // x1.m0
    public final int S(v1.h hVar) {
        int iC = k.c(this, hVar);
        this.f24894t.h(iC, hVar);
        return iC;
    }

    @Override // v1.q
    public final v1.v s(long j) {
        Q(j);
        new t2.a(j);
        x xVar = this.f24952u;
        v vVar = xVar.N;
        f1 f1Var = xVar.f24822p;
        br.l.b(f1Var);
        n0 n0VarT0 = f1Var.t0();
        br.l.b(n0VarT0);
        n0.k0(this, vVar.K(this, n0VarT0, j));
        return this;
    }
}
