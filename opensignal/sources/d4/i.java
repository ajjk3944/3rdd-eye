package d4;

/* loaded from: classes.dex */
public final class i extends rq.c {
    public br.w B;
    public c0 D;
    public /* synthetic */ Object E;
    public final /* synthetic */ j F;
    public int G;

    /* renamed from: r, reason: collision with root package name */
    public Object f6819r;

    /* renamed from: x, reason: collision with root package name */
    public Object f6820x;

    /* renamed from: y, reason: collision with root package name */
    public Object f6821y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, rq.c cVar) {
        super(cVar);
        this.F = jVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(null, this);
    }
}
