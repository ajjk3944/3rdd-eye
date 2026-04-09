package ht;

/* loaded from: classes.dex */
public final class s extends r implements l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(b0 b0Var, b0 b0Var2) {
        super(b0Var, b0Var2);
        br.l.e(b0Var, "lowerBound");
        br.l.e(b0Var2, "upperBound");
    }

    @Override // ht.l
    public final c1 H(x xVar) {
        c1 c1VarJ;
        br.l.e(xVar, "replacement");
        c1 c1VarK0 = xVar.k0();
        if (c1VarK0 instanceof r) {
            c1VarJ = c1VarK0;
        } else {
            if (!(c1VarK0 instanceof b0)) {
                throw new bf.n();
            }
            b0 b0Var = (b0) c1VarK0;
            c1VarJ = e.j(b0Var, b0Var.p0(true));
        }
        return c.g(c1VarJ, c1VarK0);
    }

    @Override // ht.l
    public final boolean J() {
        b0 b0Var = this.f10938d;
        return (b0Var.Z().p() instanceof rr.r0) && br.l.a(b0Var.Z(), this.f10939g.Z());
    }

    @Override // ht.x
    /* renamed from: h0 */
    public final x q0(jt.f fVar) {
        br.l.e(fVar, "kotlinTypeRefiner");
        b0 b0Var = this.f10938d;
        br.l.e(b0Var, "type");
        b0 b0Var2 = this.f10939g;
        br.l.e(b0Var2, "type");
        return new s(b0Var, b0Var2);
    }

    @Override // ht.c1
    public final c1 p0(boolean z10) {
        return e.j(this.f10938d.p0(z10), this.f10939g.p0(z10));
    }

    @Override // ht.c1
    public final c1 q0(jt.f fVar) {
        br.l.e(fVar, "kotlinTypeRefiner");
        b0 b0Var = this.f10938d;
        br.l.e(b0Var, "type");
        b0 b0Var2 = this.f10939g;
        br.l.e(b0Var2, "type");
        return new s(b0Var, b0Var2);
    }

    @Override // ht.c1
    public final c1 r0(i0 i0Var) {
        br.l.e(i0Var, "newAttributes");
        return e.j(this.f10938d.r0(i0Var), this.f10939g.r0(i0Var));
    }

    @Override // ht.r
    public final String toString() {
        return "(" + this.f10938d + ".." + this.f10939g + ')';
    }

    @Override // ht.r
    public final b0 u0() {
        return this.f10938d;
    }

    @Override // ht.r
    public final String v0(ss.j jVar, ss.j jVar2) {
        boolean zN = jVar2.f22246a.n();
        b0 b0Var = this.f10939g;
        b0 b0Var2 = this.f10938d;
        if (!zN) {
            return jVar.F(jVar.Y(b0Var2), jVar.Y(b0Var), se.b.A(this));
        }
        return "(" + jVar.Y(b0Var2) + ".." + jVar.Y(b0Var) + ')';
    }
}
