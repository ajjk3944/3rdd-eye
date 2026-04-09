package d4;

/* loaded from: classes.dex */
public final class r extends rq.c {
    public final /* synthetic */ c0 B;
    public int D;

    /* renamed from: r, reason: collision with root package name */
    public c0 f6866r;

    /* renamed from: x, reason: collision with root package name */
    public eu.d f6867x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f6868y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(c0 c0Var, rq.c cVar) {
        super(cVar);
        this.B = c0Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f6868y = obj;
        this.D |= Integer.MIN_VALUE;
        return c0.c(this.B, this);
    }
}
