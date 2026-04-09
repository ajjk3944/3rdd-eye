package zt;

/* loaded from: classes.dex */
public final class a extends rq.c {
    public int B;

    /* renamed from: r, reason: collision with root package name */
    public au.s f27521r;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f27522x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z7.j f27523y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(z7.j jVar, pq.c cVar) {
        super(cVar);
        this.f27523y = jVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f27522x = obj;
        this.B |= Integer.MIN_VALUE;
        return this.f27523y.l(null, this);
    }
}
