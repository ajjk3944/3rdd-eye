package d4;

/* loaded from: classes.dex */
public final class a0 extends rq.c {
    public int B;

    /* renamed from: r, reason: collision with root package name */
    public br.u f6762r;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f6763x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c0 f6764y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c0 c0Var, rq.c cVar) {
        super(cVar);
        this.f6764y = c0Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f6763x = obj;
        this.B |= Integer.MIN_VALUE;
        return this.f6764y.k(null, false, this);
    }
}
