package d4;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class z extends rq.j implements ar.k {
    public final /* synthetic */ c0 B;
    public Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Serializable F;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6914x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f6915y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(br.w wVar, c0 c0Var, br.u uVar, pq.c cVar) {
        super(1, cVar);
        this.E = wVar;
        this.B = c0Var;
        this.F = uVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [ar.n, rq.j] */
    @Override // ar.k
    public final Object a(Object obj) {
        pq.c cVar = (pq.c) obj;
        switch (this.f6914x) {
            case 0:
                return new z((br.w) this.E, this.B, (br.u) this.F, cVar).q(lq.b0.f15562a);
            default:
                return new z(this.B, (pq.h) this.E, (ar.n) this.F, cVar).q(lq.b0.f15562a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Type inference failed for: r7v2, types: [ar.n, rq.j] */
    @Override // rq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.z.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(c0 c0Var, pq.h hVar, ar.n nVar, pq.c cVar) {
        super(1, cVar);
        this.B = c0Var;
        this.E = hVar;
        this.F = (rq.j) nVar;
    }
}
