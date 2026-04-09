package y;

import lf.t1;
import lq.b0;
import wt.t;

/* loaded from: classes.dex */
public final class e extends rq.j implements ar.n {
    public final /* synthetic */ h B;
    public final /* synthetic */ a0.k D;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f25571x;

    /* renamed from: y, reason: collision with root package name */
    public int f25572y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(h hVar, a0.k kVar, pq.c cVar, int i10) {
        super(2, cVar);
        this.f25571x = i10;
        this.B = hVar;
        this.D = kVar;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f25571x) {
            case 0:
                return new e(this.B, this.D, cVar, 0);
            case 1:
                return new e(this.B, this.D, cVar, 1);
            default:
                return new e(this.B, this.D, cVar, 2);
        }
    }

    @Override // rq.a
    public final Object q(Object obj) {
        switch (this.f25571x) {
            case 0:
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                int i10 = this.f25572y;
                if (i10 == 0) {
                    t1.G(obj);
                    a0.i iVar = this.B.f25582r;
                    if (iVar != null) {
                        a0.j jVar = new a0.j(this.D);
                        this.f25572y = 1;
                        if (iVar.a(jVar, this) == aVar) {
                            return aVar;
                        }
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
                int i11 = this.f25572y;
                if (i11 == 0) {
                    t1.G(obj);
                    a0.i iVar2 = this.B.f25582r;
                    if (iVar2 != null) {
                        this.f25572y = 1;
                        if (iVar2.a(this.D, this) == aVar2) {
                            return aVar2;
                        }
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
                int i12 = this.f25572y;
                if (i12 == 0) {
                    t1.G(obj);
                    a0.i iVar3 = this.B.f25582r;
                    if (iVar3 != null) {
                        a0.l lVar = new a0.l(this.D);
                        this.f25572y = 1;
                        if (iVar3.a(lVar, this) == aVar3) {
                            return aVar3;
                        }
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
        switch (this.f25571x) {
        }
        return ((e) o(tVar, cVar)).q(b0.f15562a);
    }
}
