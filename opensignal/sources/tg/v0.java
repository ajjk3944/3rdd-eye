package tg;

import lf.t1;

/* loaded from: classes.dex */
public final class v0 extends rq.j implements ar.n {
    public final /* synthetic */ a1 B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f22859x;

    /* renamed from: y, reason: collision with root package name */
    public int f22860y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(a1 a1Var, pq.c cVar, int i10) {
        super(2, cVar);
        this.f22859x = i10;
        this.B = a1Var;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f22859x) {
            case 0:
                return new v0(this.B, cVar, 0);
            default:
                return new v0(this.B, cVar, 1);
        }
    }

    @Override // rq.a
    public final Object q(Object obj) {
        switch (this.f22859x) {
            case 0:
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                int i10 = this.f22860y;
                if (i10 == 0) {
                    t1.G(obj);
                    a1 a1Var = this.B;
                    zj.c cVar = new zj.c(a1Var.f22729e.a(), new u0(a1Var, null, 0), 2);
                    d4.q qVar = new d4.q(2, a1Var);
                    this.f22860y = 1;
                    if (cVar.l(qVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                }
                return lq.b0.f15562a;
            default:
                qq.a aVar2 = qq.a.COROUTINE_SUSPENDED;
                int i11 = this.f22860y;
                pq.c cVar2 = null;
                a1 a1Var2 = this.B;
                try {
                    if (i11 == 0) {
                        t1.G(obj);
                        d4.g gVar = a1Var2.f22729e;
                        y0 y0Var = new y0(a1Var2, cVar2, 0);
                        this.f22860y = 1;
                        if (gVar.b(y0Var, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.G(obj);
                    }
                } catch (Exception e4) {
                    e4.getMessage();
                    f0 f0Var = a1Var2.f22732h;
                    if (f0Var == null) {
                        br.l.l("localSessionData");
                        throw null;
                    }
                    a1Var2.f22732h = f0.a(f0Var, null, a1Var2.f22728d.a(), null, 5);
                }
                return lq.b0.f15562a;
        }
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        wt.t tVar = (wt.t) obj;
        pq.c cVar = (pq.c) obj2;
        switch (this.f22859x) {
        }
        return ((v0) o(tVar, cVar)).q(lq.b0.f15562a);
    }
}
