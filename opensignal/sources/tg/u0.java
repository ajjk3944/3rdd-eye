package tg;

import lf.t1;

/* loaded from: classes.dex */
public final class u0 extends rq.j implements ar.o {
    public /* synthetic */ zt.g B;
    public /* synthetic */ Object D;
    public final /* synthetic */ Object E;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f22857x;

    /* renamed from: y, reason: collision with root package name */
    public int f22858y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(Object obj, pq.c cVar, int i10) {
        super(3, cVar);
        this.f22857x = i10;
        this.E = obj;
    }

    @Override // ar.o
    public final Object h(Object obj, Object obj2, Object obj3) {
        zt.g gVar = (zt.g) obj;
        switch (this.f22857x) {
            case 0:
                u0 u0Var = new u0((a1) this.E, (pq.c) obj3, 0);
                u0Var.B = gVar;
                u0Var.D = (Throwable) obj2;
                return u0Var.q(lq.b0.f15562a);
            default:
                u0 u0Var2 = new u0((wg.d) this.E, (pq.c) obj3, 1);
                u0Var2.B = gVar;
                u0Var2.D = obj2;
                return u0Var2.q(lq.b0.f15562a);
        }
    }

    @Override // rq.a
    public final Object q(Object obj) {
        zt.g gVar;
        switch (this.f22857x) {
            case 0:
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                int i10 = this.f22858y;
                if (i10 == 0) {
                    t1.G(obj);
                    zt.g gVar2 = this.B;
                    Throwable th2 = (Throwable) this.D;
                    f0 f0Var = new f0(((a1) this.E).f22726b.a(null), null, null);
                    th2.getMessage();
                    this.B = null;
                    this.f22858y = 1;
                    if (gVar2.i(f0Var, this) == aVar) {
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
                int i11 = this.f22858y;
                if (i11 == 0) {
                    t1.G(obj);
                    gVar = this.B;
                    Object obj2 = this.D;
                    wg.d dVar = (wg.d) this.E;
                    this.B = gVar;
                    this.f22858y = 1;
                    obj = dVar.w(obj2, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.G(obj);
                        return lq.b0.f15562a;
                    }
                    gVar = this.B;
                    t1.G(obj);
                }
                this.B = null;
                this.f22858y = 2;
                if (gVar.i(obj, this) == aVar2) {
                    return aVar2;
                }
                return lq.b0.f15562a;
        }
    }
}
