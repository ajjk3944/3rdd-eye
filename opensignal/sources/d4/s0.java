package d4;

/* loaded from: classes.dex */
public final class s0 extends rq.c {
    public /* synthetic */ Object B;
    public final /* synthetic */ u0 D;
    public int E;

    /* renamed from: r, reason: collision with root package name */
    public Object f6874r;

    /* renamed from: x, reason: collision with root package name */
    public Object f6875x;

    /* renamed from: y, reason: collision with root package name */
    public Object f6876y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(u0 u0Var, rq.c cVar) {
        super(cVar);
        this.D = u0Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.B = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.c(null, this);
    }
}
