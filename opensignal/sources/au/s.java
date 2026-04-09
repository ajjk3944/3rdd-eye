package au;

import lq.b0;

/* loaded from: classes.dex */
public final class s extends rq.c implements zt.g {
    public pq.h B;
    public pq.c D;

    /* renamed from: r, reason: collision with root package name */
    public final zt.g f2345r;

    /* renamed from: x, reason: collision with root package name */
    public final pq.h f2346x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2347y;

    public s(zt.g gVar, pq.h hVar) {
        super(p.f2342a, pq.i.f20621a);
        this.f2345r = gVar;
        this.f2346x = hVar;
        this.f2347y = ((Number) hVar.Z(new r(0), 0)).intValue();
    }

    @Override // rq.a, rq.d
    public final rq.d e() {
        pq.c cVar = this.D;
        if (cVar instanceof rq.d) {
            return (rq.d) cVar;
        }
        return null;
    }

    @Override // zt.g
    public final Object i(Object obj, pq.c cVar) {
        try {
            Object objS = s(cVar, obj);
            return objS == qq.a.COROUTINE_SUSPENDED ? objS : b0.f15562a;
        } catch (Throwable th2) {
            this.B = new n(th2, cVar.m());
            throw th2;
        }
    }

    @Override // rq.c, pq.c
    public final pq.h m() {
        pq.h hVar = this.B;
        return hVar == null ? pq.i.f20621a : hVar;
    }

    @Override // rq.a
    public final StackTraceElement p() {
        return null;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        Throwable thA = lq.o.a(obj);
        if (thA != null) {
            this.B = new n(thA, m());
        }
        pq.c cVar = this.D;
        if (cVar != null) {
            cVar.g(obj);
        }
        return qq.a.COROUTINE_SUSPENDED;
    }

    public final Object s(pq.c cVar, Object obj) {
        pq.h hVarM = cVar.m();
        wt.w.i(hVarM);
        pq.h hVar = this.B;
        if (hVar != hVarM) {
            if (hVar instanceof n) {
                throw new IllegalStateException(tt.m.a0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((n) hVar).f2341d + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) hVarM.Z(new v(0, this), 0)).intValue() != this.f2347y) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f2346x + ",\n\t\tbut emission happened in " + hVarM + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.B = hVarM;
        }
        this.D = cVar;
        ar.o oVar = u.f2348a;
        zt.g gVar = this.f2345r;
        br.l.c(gVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objH = oVar.h(gVar, obj, this);
        if (!br.l.a(objH, qq.a.COROUTINE_SUSPENDED)) {
            this.D = null;
        }
        return objH;
    }
}
