package j$.util.stream;

/* loaded from: classes2.dex */
public final class r extends y0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f26735s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(a aVar, int i4, int i10) {
        super(aVar, i4);
        this.f26735s = i10;
    }

    @Override // j$.util.stream.a
    public final m5 H0(int i4, m5 m5Var) {
        switch (this.f26735s) {
            case 0:
                return new o(this, m5Var, 2);
            case 1:
                return new s0(this, m5Var, 2);
            case 2:
                return m5Var;
            case 3:
                return new s0(this, m5Var, 5);
            default:
                return new a1(this, m5Var, 2);
        }
    }
}
