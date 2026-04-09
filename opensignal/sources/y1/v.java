package y1;

/* loaded from: classes.dex */
public final class v extends rq.c {
    public final /* synthetic */ x B;
    public int D;

    /* renamed from: r, reason: collision with root package name */
    public u.u f25783r;

    /* renamed from: x, reason: collision with root package name */
    public yt.b f25784x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f25785y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, rq.c cVar) {
        super(cVar);
        this.B = xVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f25785y = obj;
        this.D |= Integer.MIN_VALUE;
        return this.B.k(this);
    }
}
