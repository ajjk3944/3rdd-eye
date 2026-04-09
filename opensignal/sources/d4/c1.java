package d4;

/* loaded from: classes.dex */
public final class c1 extends rq.c {
    public final /* synthetic */ e1 B;
    public int D;

    /* renamed from: r, reason: collision with root package name */
    public eu.d f6784r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6785x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f6786y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(e1 e1Var, rq.c cVar) {
        super(cVar);
        this.B = e1Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f6786y = obj;
        this.D |= Integer.MIN_VALUE;
        return this.B.b(null, this);
    }
}
