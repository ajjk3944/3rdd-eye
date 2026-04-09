package d4;

/* loaded from: classes.dex */
public final class y0 extends rq.c {
    public final /* synthetic */ kg.r B;
    public int D;

    /* renamed from: r, reason: collision with root package name */
    public kg.r f6911r;

    /* renamed from: x, reason: collision with root package name */
    public eu.a f6912x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f6913y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(kg.r rVar, rq.c cVar) {
        super(cVar);
        this.B = rVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f6913y = obj;
        this.D |= Integer.MIN_VALUE;
        return this.B.u(this);
    }
}
