package d4;

/* loaded from: classes.dex */
public final class b1 extends rq.c {
    public final /* synthetic */ e1 B;
    public int D;

    /* renamed from: r, reason: collision with root package name */
    public Object f6769r;

    /* renamed from: x, reason: collision with root package name */
    public eu.d f6770x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f6771y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(e1 e1Var, rq.c cVar) {
        super(cVar);
        this.B = e1Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f6771y = obj;
        this.D |= Integer.MIN_VALUE;
        return this.B.c(null, this);
    }
}
