package ht;

/* loaded from: classes.dex */
public final class t extends r implements b1 {

    /* renamed from: r, reason: collision with root package name */
    public final r f10943r;

    /* renamed from: x, reason: collision with root package name */
    public final x f10944x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r rVar, x xVar) {
        super(rVar.f10938d, rVar.f10939g);
        br.l.e(rVar, "origin");
        br.l.e(xVar, "enhancement");
        this.f10943r = rVar;
        this.f10944x = xVar;
    }

    @Override // ht.b1
    public final c1 K() {
        return this.f10943r;
    }

    @Override // ht.x
    /* renamed from: h0 */
    public final x q0(jt.f fVar) {
        br.l.e(fVar, "kotlinTypeRefiner");
        r rVar = this.f10943r;
        br.l.e(rVar, "type");
        x xVar = this.f10944x;
        br.l.e(xVar, "type");
        return new t(rVar, xVar);
    }

    @Override // ht.c1
    public final c1 p0(boolean z10) {
        return c.A(this.f10943r.p0(z10), this.f10944x.k0().p0(z10));
    }

    @Override // ht.c1
    public final c1 q0(jt.f fVar) {
        br.l.e(fVar, "kotlinTypeRefiner");
        r rVar = this.f10943r;
        br.l.e(rVar, "type");
        x xVar = this.f10944x;
        br.l.e(xVar, "type");
        return new t(rVar, xVar);
    }

    @Override // ht.c1
    public final c1 r0(i0 i0Var) {
        br.l.e(i0Var, "newAttributes");
        return c.A(this.f10943r.r0(i0Var), this.f10944x);
    }

    @Override // ht.r
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f10944x + ")] " + this.f10943r;
    }

    @Override // ht.r
    public final b0 u0() {
        return this.f10943r.u0();
    }

    @Override // ht.r
    public final String v0(ss.j jVar, ss.j jVar2) {
        ss.o oVar = jVar2.f22246a;
        return ((Boolean) oVar.f22260m.a(ss.o.W[11], oVar)).booleanValue() ? jVar.Y(this.f10944x) : this.f10943r.v0(jVar, jVar2);
    }

    @Override // ht.b1
    public final x x() {
        return this.f10944x;
    }
}
