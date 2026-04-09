package y;

import lf.t1;
import lq.b0;
import wt.t;
import wt.w;

/* loaded from: classes.dex */
public final class f extends rq.j implements ar.n {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f25573x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f25574y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, pq.c cVar, int i10) {
        super(2, cVar);
        this.f25573x = i10;
        this.f25574y = hVar;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f25573x) {
            case 0:
                return new f(this.f25574y, cVar, 0);
            default:
                return new f(this.f25574y, cVar, 1);
        }
    }

    @Override // rq.a
    public final Object q(Object obj) {
        int i10 = this.f25573x;
        b0 b0Var = b0.f15562a;
        h hVar = this.f25574y;
        switch (i10) {
            case 0:
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                if (hVar.A == null) {
                    a0.f fVar = new a0.f();
                    a0.i iVar = hVar.f25582r;
                    if (iVar != null) {
                        w.s(hVar.Q(), null, null, new a8.h(iVar, fVar, (pq.c) null, 21), 3);
                    }
                    hVar.A = fVar;
                    break;
                }
                break;
            default:
                qq.a aVar2 = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                a0.f fVar2 = hVar.A;
                if (fVar2 != null) {
                    a0.g gVar = new a0.g(fVar2);
                    a0.i iVar2 = hVar.f25582r;
                    if (iVar2 != null) {
                        w.s(hVar.Q(), null, null, new a8.h(iVar2, gVar, (pq.c) null, 22), 3);
                    }
                    hVar.A = null;
                    break;
                }
                break;
        }
        return b0Var;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        t tVar = (t) obj;
        pq.c cVar = (pq.c) obj2;
        switch (this.f25573x) {
            case 0:
                f fVar = (f) o(tVar, cVar);
                b0 b0Var = b0.f15562a;
                fVar.q(b0Var);
                return b0Var;
            default:
                f fVar2 = (f) o(tVar, cVar);
                b0 b0Var2 = b0.f15562a;
                fVar2.q(b0Var2);
                return b0Var2;
        }
    }
}
