package d4;

/* loaded from: classes.dex */
public final class i0 extends rq.c {
    public l0 B;
    public /* synthetic */ Object D;
    public final /* synthetic */ j0 E;
    public int F;

    /* renamed from: r, reason: collision with root package name */
    public j0 f6822r;

    /* renamed from: x, reason: collision with root package name */
    public Object f6823x;

    /* renamed from: y, reason: collision with root package name */
    public Object f6824y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, rq.c cVar) {
        super(cVar);
        this.E = j0Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.b(null, this);
    }
}
