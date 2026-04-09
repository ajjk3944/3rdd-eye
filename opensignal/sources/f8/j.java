package f8;

/* loaded from: classes.dex */
public final class j extends rq.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f8688r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f8689x;

    /* renamed from: y, reason: collision with root package name */
    public int f8690y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, rq.c cVar) {
        super(cVar);
        this.f8689x = lVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f8688r = obj;
        this.f8690y |= Integer.MIN_VALUE;
        return this.f8689x.b(null, this);
    }
}
