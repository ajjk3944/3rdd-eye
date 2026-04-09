package g8;

/* loaded from: classes.dex */
public final class i extends rq.c {
    public final /* synthetic */ j B;
    public int D;

    /* renamed from: r, reason: collision with root package name */
    public j f9398r;

    /* renamed from: x, reason: collision with root package name */
    public h f9399x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f9400y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, rq.c cVar) {
        super(cVar);
        this.B = jVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f9400y = obj;
        this.D |= Integer.MIN_VALUE;
        return this.B.b(null, this);
    }
}
