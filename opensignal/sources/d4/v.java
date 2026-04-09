package d4;

/* loaded from: classes.dex */
public final class v extends rq.c {
    public /* synthetic */ Object B;
    public final /* synthetic */ c0 D;
    public int E;

    /* renamed from: r, reason: collision with root package name */
    public c0 f6895r;

    /* renamed from: x, reason: collision with root package name */
    public f1 f6896x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6897y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(c0 c0Var, pq.c cVar) {
        super(cVar);
        this.D = c0Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.B = obj;
        this.E |= Integer.MIN_VALUE;
        return c0.f(this.D, false, this);
    }
}
