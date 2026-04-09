package wg;

/* loaded from: classes.dex */
public final class j extends rq.c {
    public int B;

    /* renamed from: r, reason: collision with root package name */
    public k f24511r;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f24512x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f24513y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, rq.c cVar) {
        super(cVar);
        this.f24513y = kVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f24512x = obj;
        this.B |= Integer.MIN_VALUE;
        return this.f24513y.b(this);
    }
}
