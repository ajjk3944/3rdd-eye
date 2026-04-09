package w;

import java.util.concurrent.CancellationException;
import lf.t1;
import n0.b2;
import n0.x0;

/* loaded from: classes.dex */
public final class b extends rq.j implements ar.k {
    public int B;
    public final /* synthetic */ al.c D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ d0 F;
    public final /* synthetic */ long G;

    /* renamed from: x, reason: collision with root package name */
    public k8.b f24089x;

    /* renamed from: y, reason: collision with root package name */
    public br.t f24090y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(al.c cVar, Object obj, d0 d0Var, long j, pq.c cVar2) {
        super(1, cVar2);
        this.D = cVar;
        this.E = obj;
        this.F = d0Var;
        this.G = j;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        d0 d0Var = this.F;
        long j = this.G;
        return new b(this.D, this.E, d0Var, j, (pq.c) obj).q(lq.b0.f15562a);
    }

    @Override // rq.a
    public final Object q(Object obj) {
        k8.b bVar;
        br.t tVar;
        d0 d0Var = this.F;
        qq.a aVar = qq.a.COROUTINE_SUSPENDED;
        int i10 = this.B;
        final al.c cVar = this.D;
        try {
            if (i10 == 0) {
                t1.G(obj);
                ((k8.b) cVar.f822d).B = (l) ((ar.k) ((om.f) cVar.f820b).f19554d).a(this.E);
                ((b2) ((x0) cVar.f824f)).setValue(d0Var.f24107c);
                ((b2) ((x0) cVar.f823e)).setValue(Boolean.TRUE);
                k8.b bVar2 = (k8.b) cVar.f822d;
                final k8.b bVar3 = new k8.b((om.f) bVar2.f14198x, ((b2) ((x0) bVar2.f14199y)).getValue(), c.d((l) bVar2.B), bVar2.f14195d, Long.MIN_VALUE, bVar2.f14197r);
                final br.t tVar2 = new br.t();
                long j = this.G;
                ar.k kVar = new ar.k() { // from class: w.a
                    @Override // ar.k
                    public final Object a(Object obj2) {
                        e eVar = (e) obj2;
                        al.c cVar2 = cVar;
                        c.g(eVar, (k8.b) cVar2.f822d);
                        b2 b2Var = (b2) eVar.f24117d;
                        Object value = b2Var.getValue();
                        om.f fVar = (om.f) cVar2.f820b;
                        l lVar = (l) cVar2.k;
                        l lVar2 = (l) cVar2.j;
                        if (!br.l.a(lVar2, (l) cVar2.f826h) || !br.l.a(lVar, (l) cVar2.f827i)) {
                            l lVar3 = (l) ((ar.k) fVar.f19554d).a(value);
                            int iB = lVar3.b();
                            boolean z10 = false;
                            for (int i11 = 0; i11 < iB; i11++) {
                                if (lVar3.a(i11) < lVar2.a(i11) || lVar3.a(i11) > lVar.a(i11)) {
                                    lVar3.e(i11, vc.e.g(lVar3.a(i11), lVar2.a(i11), lVar.a(i11)));
                                    z10 = true;
                                }
                            }
                            if (z10) {
                                value = ((ar.k) fVar.f19555g).a(lVar3);
                            }
                        }
                        if (!br.l.a(value, b2Var.getValue())) {
                            ((b2) ((x0) ((k8.b) cVar2.f822d).f14199y)).setValue(value);
                            ((b2) ((x0) bVar3.f14199y)).setValue(value);
                            ((b2) eVar.f24121h).setValue(Boolean.FALSE);
                            eVar.f24116c.c();
                            tVar2.f2914a = true;
                        }
                        return lq.b0.f15562a;
                    }
                };
                this.f24089x = bVar3;
                this.f24090y = tVar2;
                this.B = 1;
                if (c.b(bVar3, d0Var, j, kVar, this) == aVar) {
                    return aVar;
                }
                bVar = bVar3;
                tVar = tVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tVar = this.f24090y;
                bVar = this.f24089x;
                t1.G(obj);
            }
            d dVar = tVar.f2914a ? d.BoundReached : d.Finished;
            k8.b bVar4 = (k8.b) cVar.f822d;
            ((l) bVar4.B).d();
            bVar4.f14195d = Long.MIN_VALUE;
            ((b2) ((x0) cVar.f823e)).setValue(Boolean.FALSE);
            return new q3.a(bVar, 15, dVar);
        } catch (CancellationException e4) {
            k8.b bVar5 = (k8.b) cVar.f822d;
            ((l) bVar5.B).d();
            bVar5.f14195d = Long.MIN_VALUE;
            ((b2) ((x0) cVar.f823e)).setValue(Boolean.FALSE);
            throw e4;
        }
    }
}
