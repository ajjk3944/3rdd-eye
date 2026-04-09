package au;

import lq.b0;

/* loaded from: classes.dex */
public final class h extends g {
    @Override // au.f
    public final f c(pq.h hVar, int i10, yt.a aVar) {
        return new h(this.f2327r, hVar, i10, aVar);
    }

    @Override // au.f
    public final zt.f d() {
        return this.f2327r;
    }

    @Override // au.g
    public final Object e(zt.g gVar, pq.c cVar) {
        Object objL = this.f2327r.l(gVar, cVar);
        return objL == qq.a.COROUTINE_SUSPENDED ? objL : b0.f15562a;
    }
}
