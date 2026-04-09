package au;

import lq.b0;

/* loaded from: classes.dex */
public final class l extends g {

    /* renamed from: x, reason: collision with root package name */
    public final rq.j f2338x;

    /* JADX WARN: Multi-variable type inference failed */
    public l(ar.o oVar, zt.f fVar, pq.h hVar, int i10, yt.a aVar) {
        super(fVar, hVar, i10, aVar);
        this.f2338x = (rq.j) oVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ar.o, rq.j] */
    @Override // au.f
    public final f c(pq.h hVar, int i10, yt.a aVar) {
        return new l(this.f2338x, this.f2327r, hVar, i10, aVar);
    }

    @Override // au.g
    public final Object e(zt.g gVar, pq.c cVar) {
        Object objG = wt.w.g(new i(this, gVar, null), cVar);
        return objG == qq.a.COROUTINE_SUSPENDED ? objG : b0.f15562a;
    }
}
