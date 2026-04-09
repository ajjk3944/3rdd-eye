package y;

import lf.t1;
import lq.b0;
import wt.t;

/* loaded from: classes.dex */
public final class c extends rq.j implements ar.n {
    public final /* synthetic */ a0.k B;
    public final /* synthetic */ a0.i D;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f25567x;

    /* renamed from: y, reason: collision with root package name */
    public int f25568y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a0.i iVar, a0.k kVar, pq.c cVar) {
        super(2, cVar);
        this.f25567x = 2;
        this.D = iVar;
        this.B = kVar;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f25567x) {
            case 0:
                return new c(this.B, this.D, cVar, 0);
            case 1:
                return new c(this.B, this.D, cVar, 1);
            default:
                return new c(this.D, this.B, cVar);
        }
    }

    @Override // rq.a
    public final Object q(Object obj) {
        switch (this.f25567x) {
            case 0:
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                int i10 = this.f25568y;
                if (i10 == 0) {
                    t1.G(obj);
                    a0.j jVar = new a0.j(this.B);
                    this.f25568y = 1;
                    if (this.D.a(jVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                }
                return b0.f15562a;
            case 1:
                qq.a aVar2 = qq.a.COROUTINE_SUSPENDED;
                int i11 = this.f25568y;
                if (i11 == 0) {
                    t1.G(obj);
                    a0.l lVar = new a0.l(this.B);
                    this.f25568y = 1;
                    if (this.D.a(lVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                }
                return b0.f15562a;
            default:
                qq.a aVar3 = qq.a.COROUTINE_SUSPENDED;
                int i12 = this.f25568y;
                if (i12 == 0) {
                    t1.G(obj);
                    this.f25568y = 1;
                    if (this.D.a(this.B, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                }
                return b0.f15562a;
        }
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        t tVar = (t) obj;
        pq.c cVar = (pq.c) obj2;
        switch (this.f25567x) {
        }
        return ((c) o(tVar, cVar)).q(b0.f15562a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(a0.k kVar, a0.i iVar, pq.c cVar, int i10) {
        super(2, cVar);
        this.f25567x = i10;
        this.B = kVar;
        this.D = iVar;
    }
}
