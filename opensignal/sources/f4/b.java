package f4;

/* loaded from: classes.dex */
public final class b extends rq.c {
    public int B;

    /* renamed from: r, reason: collision with root package name */
    public c f8431r;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f8432x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f8433y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, rq.c cVar2) {
        super(cVar2);
        this.f8433y = cVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f8432x = obj;
        this.B |= Integer.MIN_VALUE;
        return this.f8433y.a(null, this);
    }
}
