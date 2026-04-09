package fm;

import lf.t1;
import lq.b0;

/* loaded from: classes.dex */
public final class g extends rq.j implements ar.k {
    public final /* synthetic */ long B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9007x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a8.f f9008y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(a8.f fVar, long j, pq.c cVar, int i10) {
        super(1, cVar);
        this.f9007x = i10;
        this.f9008y = fVar;
        this.B = j;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f9007x) {
            case 0:
                long j = this.B;
                g gVar = new g(this.f9008y, j, (pq.c) obj, 0);
                b0 b0Var = b0.f15562a;
                gVar.q(b0Var);
                return b0Var;
            default:
                long j7 = this.B;
                g gVar2 = new g(this.f9008y, j7, (pq.c) obj, 1);
                b0 b0Var2 = b0.f15562a;
                gVar2.q(b0Var2);
                return b0Var2;
        }
    }

    @Override // rq.a
    public final Object q(Object obj) {
        em.a aVar;
        int i10 = this.f9007x;
        b0 b0Var = b0.f15562a;
        long j = this.B;
        a8.f fVar = this.f9008y;
        switch (i10) {
            case 0:
                qq.a aVar2 = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                i iVar = (i) fVar.f199e;
                iVar.a();
                gm.b bVar = gm.b.LATENCY_STARTED;
                iVar.f9013b = bVar;
                em.a aVar3 = (em.a) fVar.f202h;
                if (aVar3 != null) {
                    aVar3.b(new gm.a(bVar, false), iVar.f9012a, j);
                    break;
                }
                break;
            default:
                qq.a aVar4 = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                gm.b bVar2 = ((i) fVar.f199e).f9013b;
                if (bVar2 != null && (aVar = (em.a) fVar.f202h) != null) {
                    aVar.b(new gm.a(bVar2, true), ((i) fVar.f199e).f9012a, j);
                    break;
                }
                break;
        }
        return b0Var;
    }
}
