package bu;

/* loaded from: classes.dex */
public class q extends wt.a implements rq.d {

    /* renamed from: r, reason: collision with root package name */
    public final pq.c f2985r;

    public q(pq.c cVar, pq.h hVar) {
        super(hVar, true);
        this.f2985r = cVar;
    }

    @Override // wt.b1
    public final boolean H() {
        return true;
    }

    @Override // wt.b1
    public void d(Object obj) {
        a.h(wt.w.u(obj), xu.l.D(this.f2985r));
    }

    @Override // rq.d
    public final rq.d e() {
        pq.c cVar = this.f2985r;
        if (cVar instanceof rq.d) {
            return (rq.d) cVar;
        }
        return null;
    }

    @Override // wt.b1
    public void l(Object obj) {
        this.f2985r.g(wt.w.u(obj));
    }
}
