package on;

/* loaded from: classes.dex */
public final class c extends rq.c {
    public final /* synthetic */ e B;
    public int D;

    /* renamed from: r, reason: collision with root package name */
    public e f19596r;

    /* renamed from: x, reason: collision with root package name */
    public long f19597x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f19598y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, rq.c cVar) {
        super(cVar);
        this.B = eVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f19598y = obj;
        this.D |= Integer.MIN_VALUE;
        return this.B.b(null, 0L, this);
    }
}
