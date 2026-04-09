package c8;

/* loaded from: classes.dex */
public final class z extends rq.c {
    public final /* synthetic */ c0 B;
    public int D;

    /* renamed from: r, reason: collision with root package name */
    public Object f3381r;

    /* renamed from: x, reason: collision with root package name */
    public br.t f3382x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f3383y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(c0 c0Var, rq.c cVar) {
        super(cVar);
        this.B = c0Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f3383y = obj;
        this.D |= Integer.MIN_VALUE;
        return this.B.a(this);
    }
}
