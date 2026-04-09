package tg;

/* loaded from: classes.dex */
public final class z0 extends rq.c {
    public final /* synthetic */ a1 B;
    public int D;

    /* renamed from: r, reason: collision with root package name */
    public String f22869r;

    /* renamed from: x, reason: collision with root package name */
    public w0 f22870x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f22871y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, pq.c cVar) {
        super(cVar);
        this.B = a1Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f22871y = obj;
        this.D |= Integer.MIN_VALUE;
        return a1.a(this.B, null, null, this);
    }
}
