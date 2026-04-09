package ht;

/* loaded from: classes.dex */
public final class a extends o {

    /* renamed from: d, reason: collision with root package name */
    public final b0 f10879d;

    /* renamed from: g, reason: collision with root package name */
    public final b0 f10880g;

    public a(b0 b0Var, b0 b0Var2) {
        br.l.e(b0Var, "delegate");
        br.l.e(b0Var2, "abbreviation");
        this.f10879d = b0Var;
        this.f10880g = b0Var2;
    }

    @Override // ht.o
    public final b0 C0() {
        return this.f10879d;
    }

    @Override // ht.o
    public final o M0(b0 b0Var) {
        return new a(b0Var, this.f10880g);
    }

    @Override // ht.b0
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final a p0(boolean z10) {
        return new a(this.f10879d.p0(z10), this.f10880g.p0(z10));
    }

    @Override // ht.o, ht.c1
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final a q0(jt.f fVar) {
        br.l.e(fVar, "kotlinTypeRefiner");
        b0 b0Var = this.f10879d;
        br.l.e(b0Var, "type");
        b0 b0Var2 = this.f10880g;
        br.l.e(b0Var2, "type");
        return new a(b0Var, b0Var2);
    }

    @Override // ht.b0
    /* renamed from: v0 */
    public final b0 r0(i0 i0Var) {
        br.l.e(i0Var, "newAttributes");
        return new a(this.f10879d.r0(i0Var), this.f10880g);
    }
}
