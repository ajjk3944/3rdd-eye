package j$.util.stream;

/* loaded from: classes2.dex */
public final class s extends g1 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f26750s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(a aVar, int i4, int i10) {
        super(aVar, i4);
        this.f26750s = i10;
    }

    @Override // j$.util.stream.a
    public final m5 H0(int i4, m5 m5Var) {
        switch (this.f26750s) {
            case 0:
                return new o(this, m5Var, 3);
            case 1:
                return new u0(0, m5Var);
            case 2:
                return new s0(this, m5Var, 3);
            case 3:
                return new a1(this, m5Var, 1);
            case 4:
                return m5Var;
            default:
                return new a1(this, m5Var, 4);
        }
    }
}
