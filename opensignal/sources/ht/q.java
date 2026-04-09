package ht;

/* loaded from: classes.dex */
public final class q extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public final s0 f10936b;

    /* renamed from: c, reason: collision with root package name */
    public final s0 f10937c;

    public q(s0 s0Var, s0 s0Var2) {
        this.f10936b = s0Var;
        this.f10937c = s0Var2;
    }

    @Override // ht.s0
    public final boolean a() {
        return this.f10936b.a() || this.f10937c.a();
    }

    @Override // ht.s0
    public final boolean b() {
        return this.f10936b.b() || this.f10937c.b();
    }

    @Override // ht.s0
    public final sr.h c(sr.h hVar) {
        br.l.e(hVar, "annotations");
        return this.f10937c.c(this.f10936b.c(hVar));
    }

    @Override // ht.s0
    public final p0 d(x xVar) {
        p0 p0VarD = this.f10936b.d(xVar);
        return p0VarD == null ? this.f10937c.d(xVar) : p0VarD;
    }

    @Override // ht.s0
    public final x f(x xVar, d1 d1Var) {
        br.l.e(xVar, "topLevelType");
        br.l.e(d1Var, "position");
        return this.f10937c.f(this.f10936b.f(xVar, d1Var), d1Var);
    }
}
