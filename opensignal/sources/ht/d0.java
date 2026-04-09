package ht;

/* loaded from: classes.dex */
public final class d0 extends p {

    /* renamed from: g, reason: collision with root package name */
    public final i0 f10893g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(b0 b0Var, i0 i0Var) {
        super(b0Var);
        br.l.e(i0Var, "attributes");
        this.f10893g = i0Var;
    }

    @Override // ht.o
    public final o M0(b0 b0Var) {
        return new d0(b0Var, this.f10893g);
    }

    @Override // ht.o, ht.x
    public final i0 X() {
        return this.f10893g;
    }
}
