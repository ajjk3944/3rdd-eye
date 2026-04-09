package zt;

/* loaded from: classes.dex */
public final class r extends rq.c {
    public final /* synthetic */ j0.g B;
    public Object D;

    /* renamed from: r, reason: collision with root package name */
    public j0.g f27589r;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f27590x;

    /* renamed from: y, reason: collision with root package name */
    public int f27591y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(j0.g gVar, pq.c cVar) {
        super(cVar);
        this.B = gVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f27590x = obj;
        this.f27591y |= Integer.MIN_VALUE;
        return this.B.i(null, this);
    }
}
