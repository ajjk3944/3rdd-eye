package d4;

/* loaded from: classes.dex */
public final class s extends rq.c {
    public /* synthetic */ Object B;
    public final /* synthetic */ c0 D;
    public int E;

    /* renamed from: r, reason: collision with root package name */
    public Object f6871r;

    /* renamed from: x, reason: collision with root package name */
    public c0 f6872x;

    /* renamed from: y, reason: collision with root package name */
    public wt.m f6873y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(c0 c0Var, rq.c cVar) {
        super(cVar);
        this.D = c0Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.B = obj;
        this.E |= Integer.MIN_VALUE;
        return c0.d(this.D, null, this);
    }
}
