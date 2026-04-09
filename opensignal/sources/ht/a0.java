package ht;

/* loaded from: classes.dex */
public final class a0 extends p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10881g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(b0 b0Var, int i10) {
        super(b0Var);
        this.f10881g = i10;
    }

    @Override // ht.o
    public final o M0(b0 b0Var) {
        switch (this.f10881g) {
            case 0:
                return new a0(b0Var, 0);
            default:
                return new a0(b0Var, 1);
        }
    }

    @Override // ht.o, ht.x
    public final boolean c0() {
        switch (this.f10881g) {
            case 0:
                return false;
            default:
                return true;
        }
    }
}
