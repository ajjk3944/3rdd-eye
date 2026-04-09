package j0;

import ar.n;
import lf.t1;
import lq.b0;
import rq.j;
import wt.t;

/* loaded from: classes.dex */
public final class h extends j implements n {
    public final /* synthetic */ float B;
    public final /* synthetic */ w.f D;

    /* renamed from: x, reason: collision with root package name */
    public int f13039x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g1.f f13040y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g1.f fVar, float f10, w.f fVar2, pq.c cVar) {
        super(2, cVar);
        this.f13040y = fVar;
        this.B = f10;
        this.D = fVar2;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        return new h(this.f13040y, this.B, this.D, cVar);
    }

    @Override // rq.a
    public final Object q(Object obj) {
        qq.a aVar = qq.a.COROUTINE_SUSPENDED;
        int i10 = this.f13039x;
        if (i10 == 0) {
            t1.G(obj);
            al.c cVar = (al.c) this.f13040y.f9210g;
            Float f10 = new Float(this.B);
            this.f13039x = 1;
            if (al.c.c(cVar, f10, this.D, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.G(obj);
        }
        return b0.f15562a;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        return ((h) o((t) obj, (pq.c) obj2)).q(b0.f15562a);
    }
}
