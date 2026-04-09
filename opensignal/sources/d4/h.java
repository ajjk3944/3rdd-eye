package d4;

/* loaded from: classes.dex */
public final class h extends rq.c {
    public int B;

    /* renamed from: r, reason: collision with root package name */
    public kg.r f6812r;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f6813x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ kg.r f6814y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kg.r rVar, rq.c cVar) {
        super(cVar);
        this.f6814y = rVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f6813x = obj;
        this.B |= Integer.MIN_VALUE;
        return this.f6814y.g(this);
    }
}
