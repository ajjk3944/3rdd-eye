package zt;

/* loaded from: classes.dex */
public final class o extends rq.c {
    public int B;

    /* renamed from: r, reason: collision with root package name */
    public d f27576r;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f27577x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f27578y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(d dVar, pq.c cVar) {
        super(cVar);
        this.f27578y = dVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f27577x = obj;
        this.B |= Integer.MIN_VALUE;
        return this.f27578y.i(null, this);
    }
}
