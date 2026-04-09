package d4;

import java.io.IOException;
import lf.t1;

/* loaded from: classes.dex */
public final class o extends rq.j implements ar.o {
    public /* synthetic */ Object B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6850x = 1;

    /* renamed from: y, reason: collision with root package name */
    public int f6851y;

    public /* synthetic */ o(int i10, pq.c cVar) {
        super(i10, cVar);
    }

    @Override // ar.o
    public final Object h(Object obj, Object obj2, Object obj3) {
        switch (this.f6850x) {
            case 0:
                return new o((c0) this.B, (pq.c) obj3).q(lq.b0.f15562a);
            default:
                ((Boolean) obj2).getClass();
                o oVar = new o(3, (pq.c) obj3);
                oVar.B = (e0) obj;
                return oVar.q(lq.b0.f15562a);
        }
    }

    @Override // rq.a
    public final Object q(Object obj) throws IOException {
        switch (this.f6850x) {
            case 0:
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                int i10 = this.f6851y;
                if (i10 == 0) {
                    t1.G(obj);
                    c0 c0Var = (c0) this.B;
                    this.f6851y = 1;
                    if (c0.c(c0Var, this) == aVar) {
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
                int i11 = this.f6851y;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                    return obj;
                }
                t1.G(obj);
                e0 e0Var = (e0) this.B;
                this.f6851y = 1;
                e0Var.getClass();
                Object objA = e0.a(e0Var, this);
                return objA == aVar2 ? aVar2 : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(c0 c0Var, pq.c cVar) {
        super(3, cVar);
        this.B = c0Var;
    }
}
