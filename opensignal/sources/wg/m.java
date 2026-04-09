package wg;

import lf.t1;
import lq.b0;
import wt.t;
import zt.f0;

/* loaded from: classes.dex */
public final class m extends rq.j implements ar.n {
    public final /* synthetic */ o B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f24517x;

    /* renamed from: y, reason: collision with root package name */
    public int f24518y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(o oVar, pq.c cVar, int i10) {
        super(2, cVar);
        this.f24517x = i10;
        this.B = oVar;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f24517x) {
            case 0:
                return new m(this.B, cVar, 0);
            default:
                return new m(this.B, cVar, 1);
        }
    }

    @Override // rq.a
    public final Object q(Object obj) {
        switch (this.f24517x) {
            case 0:
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                int i10 = this.f24518y;
                if (i10 == 0) {
                    t1.G(obj);
                    o oVar = this.B;
                    zt.f fVarA = oVar.f24523b.a();
                    l lVar = new l(oVar.f24524c);
                    this.f24518y = 1;
                    if (fVarA.l(lVar, this) == aVar) {
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
                int i11 = this.f24518y;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                    return obj;
                }
                t1.G(obj);
                zt.f fVarA2 = this.B.f24523b.a();
                this.f24518y = 1;
                Object objI = f0.i(fVarA2, this);
                return objI == aVar2 ? aVar2 : objI;
        }
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        t tVar = (t) obj;
        pq.c cVar = (pq.c) obj2;
        switch (this.f24517x) {
        }
        return ((m) o(tVar, cVar)).q(b0.f15562a);
    }
}
