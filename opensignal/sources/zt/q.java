package zt;

/* loaded from: classes.dex */
public final class q extends rq.c {
    public j0.g B;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27585r;

    /* renamed from: x, reason: collision with root package name */
    public int f27586x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ zj.c f27587y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(zj.c cVar, pq.c cVar2) {
        super(cVar2);
        this.f27587y = cVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f27585r = obj;
        this.f27586x |= Integer.MIN_VALUE;
        return this.f27587y.l(null, this);
    }
}
