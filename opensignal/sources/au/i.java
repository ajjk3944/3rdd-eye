package au;

import lf.t1;
import lq.b0;

/* loaded from: classes.dex */
public final class i extends rq.j implements ar.n {
    public /* synthetic */ Object B;
    public final /* synthetic */ l D;
    public final /* synthetic */ zt.g E;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2328x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f2329y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, zt.g gVar, Object obj, pq.c cVar) {
        super(2, cVar);
        this.D = lVar;
        this.E = gVar;
        this.B = obj;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f2328x) {
            case 0:
                return new i(this.D, this.E, this.B, cVar);
            default:
                i iVar = new i(this.D, this.E, cVar);
                iVar.B = obj;
                return iVar;
        }
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [ar.o, rq.j] */
    @Override // rq.a
    public final Object q(Object obj) {
        switch (this.f2328x) {
            case 0:
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                int i10 = this.f2329y;
                if (i10 == 0) {
                    t1.G(obj);
                    ?? r10 = this.D.f2338x;
                    Object obj2 = this.B;
                    this.f2329y = 1;
                    if (r10.h(this.E, obj2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                }
                return b0.f15562a;
            default:
                qq.a aVar2 = qq.a.COROUTINE_SUSPENDED;
                int i11 = this.f2329y;
                if (i11 == 0) {
                    t1.G(obj);
                    wt.t tVar = (wt.t) this.B;
                    br.w wVar = new br.w();
                    l lVar = this.D;
                    zt.f fVar = lVar.f2327r;
                    k kVar = new k(wVar, tVar, lVar, this.E, 0);
                    this.f2329y = 1;
                    if (fVar.l(kVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                }
                return b0.f15562a;
        }
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        wt.t tVar = (wt.t) obj;
        pq.c cVar = (pq.c) obj2;
        switch (this.f2328x) {
        }
        return ((i) o(tVar, cVar)).q(b0.f15562a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, zt.g gVar, pq.c cVar) {
        super(2, cVar);
        this.D = lVar;
        this.E = gVar;
    }
}
