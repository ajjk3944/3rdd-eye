package d4;

import lf.t1;

/* loaded from: classes.dex */
public final class m extends rq.j implements ar.n {
    public final /* synthetic */ c0 B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6845x;

    /* renamed from: y, reason: collision with root package name */
    public int f6846y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(c0 c0Var, pq.c cVar, int i10) {
        super(2, cVar);
        this.f6845x = i10;
        this.B = c0Var;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f6845x) {
            case 0:
                return new m(this.B, cVar, 0);
            case 1:
                return new m(this.B, cVar, 1);
            default:
                return new m(this.B, cVar, 2);
        }
    }

    @Override // rq.a
    public final Object q(Object obj) throws Throwable {
        switch (this.f6845x) {
            case 0:
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                int i10 = this.f6846y;
                if (i10 == 0) {
                    t1.G(obj);
                    this.f6846y = 1;
                    if (c0.e(this.B, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                }
                return lq.b0.f15562a;
            case 1:
                qq.a aVar2 = qq.a.COROUTINE_SUSPENDED;
                int i11 = this.f6846y;
                lq.b0 b0Var = lq.b0.f15562a;
                c0 c0Var = this.B;
                if (i11 == 0) {
                    t1.G(obj);
                    kg.r rVar = c0Var.f6782i;
                    this.f6846y = 1;
                    Object objX = ((wt.m) rVar.f14396d).X(this);
                    if (objX != aVar2) {
                        objX = b0Var;
                    }
                    if (objX == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.G(obj);
                        return b0Var;
                    }
                    t1.G(obj);
                }
                zt.f fVarD = zt.f0.d(c0Var.h().e(), -1);
                q qVar = new q(1, c0Var);
                this.f6846y = 2;
                if (fVarD.l(qVar, this) == aVar2) {
                    return aVar2;
                }
                return b0Var;
            default:
                c0 c0Var2 = this.B;
                a2.g gVar = c0Var2.f6781h;
                qq.a aVar3 = qq.a.COROUTINE_SUSPENDED;
                int i12 = this.f6846y;
                try {
                    if (i12 == 0) {
                        t1.G(obj);
                        if (gVar.e() instanceof m0) {
                            return gVar.e();
                        }
                        this.f6846y = 1;
                        if (c0Var2.i(this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t1.G(obj);
                            return (f1) obj;
                        }
                        t1.G(obj);
                    }
                    this.f6846y = 2;
                    obj = c0.f(c0Var2, false, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    return (f1) obj;
                } catch (Throwable th2) {
                    return new x0(th2, -1);
                }
        }
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        switch (this.f6845x) {
        }
        return ((m) o((wt.t) obj, (pq.c) obj2)).q(lq.b0.f15562a);
    }
}
