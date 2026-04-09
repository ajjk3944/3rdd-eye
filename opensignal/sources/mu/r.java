package mu;

import lf.t1;

/* loaded from: classes.dex */
public final class r extends rq.i implements ar.o {

    /* renamed from: g, reason: collision with root package name */
    public int f17030g;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ lq.b f17031r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ag.b f17032x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ag.b bVar, pq.c cVar) {
        super(3, cVar);
        this.f17032x = bVar;
    }

    @Override // ar.o
    public final Object h(Object obj, Object obj2, Object obj3) {
        r rVar = new r(this.f17032x, (pq.c) obj3);
        rVar.f17031r = (lq.b) obj;
        return rVar.q(lq.b0.f15562a);
    }

    @Override // rq.a
    public final Object q(Object obj) {
        ag.b bVar = this.f17032x;
        bj.c cVar = (bj.c) bVar.f346g;
        qq.a aVar = qq.a.COROUTINE_SUSPENDED;
        int i10 = this.f17030g;
        if (i10 == 0) {
            t1.G(obj);
            lq.b bVar2 = this.f17031r;
            byte bE = cVar.E();
            if (bE == 1) {
                return bVar.o(true);
            }
            if (bE == 0) {
                return bVar.o(false);
            }
            if (bE != 6) {
                if (bE == 8) {
                    return bVar.l();
                }
                bj.c.u(cVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f17030g = 1;
            obj = ag.b.a(bVar, bVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.G(obj);
        }
        return (lu.l) obj;
    }
}
