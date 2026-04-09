package au;

/* loaded from: classes.dex */
public final class j extends rq.c {
    public final /* synthetic */ k B;
    public int D;

    /* renamed from: r, reason: collision with root package name */
    public k f2330r;

    /* renamed from: x, reason: collision with root package name */
    public Object f2331x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f2332y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, pq.c cVar) {
        super(cVar);
        this.B = kVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f2332y = obj;
        this.D |= Integer.MIN_VALUE;
        return this.B.i(null, this);
    }
}
