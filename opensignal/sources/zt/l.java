package zt;

/* loaded from: classes.dex */
public final class l extends rq.c {
    public xr.a B;
    public g D;
    public au.s E;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27564r;

    /* renamed from: x, reason: collision with root package name */
    public int f27565x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ xr.a f27566y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(xr.a aVar, pq.c cVar) {
        super(cVar);
        this.f27566y = aVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f27564r = obj;
        this.f27565x |= Integer.MIN_VALUE;
        return this.f27566y.l(null, this);
    }
}
