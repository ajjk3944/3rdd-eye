package g8;

/* loaded from: classes.dex */
public final class f extends rq.c {
    public final /* synthetic */ h B;
    public int D;

    /* renamed from: r, reason: collision with root package name */
    public h f9389r;

    /* renamed from: x, reason: collision with root package name */
    public j f9390x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f9391y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, rq.c cVar) {
        super(cVar);
        this.B = hVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f9391y = obj;
        this.D |= Integer.MIN_VALUE;
        return this.B.d(null, this);
    }
}
