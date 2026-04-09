package j$.util.stream;

/* loaded from: classes2.dex */
public final class u extends x {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f26763s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(a aVar, int i4, int i10) {
        super(aVar, i4);
        this.f26763s = i10;
    }

    @Override // j$.util.stream.a
    public final m5 H0(int i4, m5 m5Var) {
        switch (this.f26763s) {
            case 0:
                return m5Var;
            case 1:
                return new o(this, m5Var, 4);
            case 2:
                return new u0(1, m5Var);
            case 3:
                return new s0(this, m5Var, 4);
            case 4:
                return new b1(m5Var);
            default:
                return new a1(this, m5Var, 3);
        }
    }
}
