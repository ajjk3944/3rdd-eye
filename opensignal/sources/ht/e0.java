package ht;

/* loaded from: classes.dex */
public final class e0 extends o implements b1 {

    /* renamed from: d, reason: collision with root package name */
    public final b0 f10895d;

    /* renamed from: g, reason: collision with root package name */
    public final x f10896g;

    public e0(b0 b0Var, x xVar) {
        br.l.e(b0Var, "delegate");
        br.l.e(xVar, "enhancement");
        this.f10895d = b0Var;
        this.f10896g = xVar;
    }

    @Override // ht.o
    public final b0 C0() {
        return this.f10895d;
    }

    @Override // ht.b1
    public final c1 K() {
        return this.f10895d;
    }

    @Override // ht.o
    public final o M0(b0 b0Var) {
        return new e0(b0Var, this.f10896g);
    }

    @Override // ht.o, ht.c1
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final e0 q0(jt.f fVar) {
        br.l.e(fVar, "kotlinTypeRefiner");
        b0 b0Var = this.f10895d;
        br.l.e(b0Var, "type");
        x xVar = this.f10896g;
        br.l.e(xVar, "type");
        return new e0(b0Var, xVar);
    }

    @Override // ht.b0
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f10896g + ")] " + this.f10895d;
    }

    @Override // ht.b0
    /* renamed from: u0 */
    public final b0 p0(boolean z10) {
        c1 c1VarA = c.A(this.f10895d.p0(z10), this.f10896g.k0().p0(z10));
        br.l.c(c1VarA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (b0) c1VarA;
    }

    @Override // ht.b0
    /* renamed from: v0 */
    public final b0 r0(i0 i0Var) {
        br.l.e(i0Var, "newAttributes");
        c1 c1VarA = c.A(this.f10895d.r0(i0Var), this.f10896g);
        br.l.c(c1VarA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (b0) c1VarA;
    }

    @Override // ht.b1
    public final x x() {
        return this.f10896g;
    }
}
