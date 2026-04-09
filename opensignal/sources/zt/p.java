package zt;

/* loaded from: classes.dex */
public final class p extends rq.c {
    public final /* synthetic */ au.z B;
    public int D;

    /* renamed from: r, reason: collision with root package name */
    public au.z f27581r;

    /* renamed from: x, reason: collision with root package name */
    public Object f27582x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f27583y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(au.z zVar, pq.c cVar) {
        super(cVar);
        this.B = zVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f27583y = obj;
        this.D |= Integer.MIN_VALUE;
        return this.B.i(null, this);
    }
}
