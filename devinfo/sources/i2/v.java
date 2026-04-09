package i2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v extends n0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ w f25805u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar) {
        super(wVar);
        this.f25805u = wVar;
    }

    @Override // g2.i0
    public final int J(int i4) {
        w wVar = this.f25805u;
        u uVar = wVar.R;
        d1 d1Var = wVar.f25611p;
        nk.k.b(d1Var);
        n0 n0VarX0 = d1Var.x0();
        nk.k.b(n0VarX0);
        return uVar.h(this, n0VarX0, i4);
    }

    @Override // i2.m0
    public final int Z(g2.a aVar) {
        int iC = k.c(this, aVar);
        this.f25724t.g(iC, aVar);
        return iC;
    }

    @Override // g2.i0
    public final int d(int i4) {
        w wVar = this.f25805u;
        u uVar = wVar.R;
        d1 d1Var = wVar.f25611p;
        nk.k.b(d1Var);
        n0 n0VarX0 = d1Var.x0();
        nk.k.b(n0VarX0);
        return uVar.t(this, n0VarX0, i4);
    }

    @Override // g2.i0
    public final int n(int i4) {
        w wVar = this.f25805u;
        u uVar = wVar.R;
        d1 d1Var = wVar.f25611p;
        nk.k.b(d1Var);
        n0 n0VarX0 = d1Var.x0();
        nk.k.b(n0VarX0);
        return uVar.S(this, n0VarX0, i4);
    }

    @Override // g2.i0
    public final int t(int i4) {
        w wVar = this.f25805u;
        u uVar = wVar.R;
        d1 d1Var = wVar.f25611p;
        nk.k.b(d1Var);
        n0 n0VarX0 = d1Var.x0();
        nk.k.b(n0VarX0);
        return uVar.L(this, n0VarX0, i4);
    }

    @Override // g2.i0
    public final g2.s0 v(long j) {
        V(j);
        new d3.a(j);
        w wVar = this.f25805u;
        u uVar = wVar.R;
        d1 d1Var = wVar.f25611p;
        nk.k.b(d1Var);
        n0 n0VarX0 = d1Var.x0();
        nk.k.b(n0VarX0);
        n0.o0(this, uVar.a0(this, n0VarX0, j));
        return this;
    }
}
