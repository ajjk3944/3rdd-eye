package zt;

import lf.t1;

/* loaded from: classes.dex */
public final class y extends rq.j implements ar.n {

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ int f27607x;

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        y yVar = new y(2, cVar);
        yVar.f27607x = ((Number) obj).intValue();
        return yVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        qq.a aVar = qq.a.COROUTINE_SUSPENDED;
        t1.G(obj);
        return Boolean.valueOf(this.f27607x > 0);
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        return ((y) o(Integer.valueOf(((Number) obj).intValue()), (pq.c) obj2)).q(lq.b0.f15562a);
    }
}
