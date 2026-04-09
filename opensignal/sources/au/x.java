package au;

/* loaded from: classes.dex */
public final class x implements pq.c, rq.d {

    /* renamed from: a, reason: collision with root package name */
    public final pq.c f2352a;

    /* renamed from: d, reason: collision with root package name */
    public final pq.h f2353d;

    public x(pq.c cVar, pq.h hVar) {
        this.f2352a = cVar;
        this.f2353d = hVar;
    }

    @Override // rq.d
    public final rq.d e() {
        pq.c cVar = this.f2352a;
        if (cVar instanceof rq.d) {
            return (rq.d) cVar;
        }
        return null;
    }

    @Override // pq.c
    public final void g(Object obj) {
        this.f2352a.g(obj);
    }

    @Override // pq.c
    public final pq.h m() {
        return this.f2353d;
    }
}
