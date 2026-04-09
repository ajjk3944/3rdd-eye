package zt;

/* loaded from: classes.dex */
public final class c extends rq.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27530r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f27531x;

    /* renamed from: y, reason: collision with root package name */
    public int f27532y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, pq.c cVar) {
        super(cVar);
        this.f27531x = dVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f27530r = obj;
        this.f27532y |= Integer.MIN_VALUE;
        return this.f27531x.i(null, this);
    }
}
