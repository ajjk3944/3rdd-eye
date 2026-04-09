package n0;

/* loaded from: classes.dex */
public final class a1 extends rq.c {
    public int B;

    /* renamed from: r, reason: collision with root package name */
    public ar.k f17130r;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f17131x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b1 f17132y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b1 b1Var, rq.c cVar) {
        super(cVar);
        this.f17132y = b1Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f17131x = obj;
        this.B |= Integer.MIN_VALUE;
        return this.f17132y.i(null, this);
    }
}
