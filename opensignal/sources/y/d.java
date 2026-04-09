package y;

import lq.b0;
import wt.t;

/* loaded from: classes.dex */
public final class d extends rq.j implements ar.n {
    public final /* synthetic */ h B;
    public final /* synthetic */ long D;
    public final /* synthetic */ a0.i E;

    /* renamed from: x, reason: collision with root package name */
    public a0.l f25569x;

    /* renamed from: y, reason: collision with root package name */
    public int f25570y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, long j, a0.i iVar, pq.c cVar) {
        super(2, cVar);
        this.B = hVar;
        this.D = j;
        this.E = iVar;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        return new d(this.B, this.D, this.E, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065 A[RETURN] */
    @Override // rq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.lang.Object r10) {
        /*
            r9 = this;
            qq.a r0 = qq.a.COROUTINE_SUSPENDED
            int r1 = r9.f25570y
            lq.b0 r2 = lq.b0.f15562a
            a0.i r3 = r9.E
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L2a
            if (r1 == r7) goto L26
            if (r1 == r6) goto L20
            if (r1 != r5) goto L18
            lf.t1.G(r10)
            goto L65
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            a0.l r1 = r9.f25569x
            lf.t1.G(r10)
            goto L5a
        L26:
            lf.t1.G(r10)
            goto L43
        L2a:
            lf.t1.G(r10)
            y.h r10 = r9.B
            wt.z r10 = r10.F
            if (r10 == 0) goto L43
            r9.f25570y = r7
            r10.h(r4)
            java.lang.Object r10 = r10.V(r9)
            if (r10 != r0) goto L3f
            goto L40
        L3f:
            r10 = r2
        L40:
            if (r10 != r0) goto L43
            goto L64
        L43:
            a0.k r10 = new a0.k
            long r7 = r9.D
            r10.<init>(r7)
            a0.l r1 = new a0.l
            r1.<init>(r10)
            r9.f25569x = r1
            r9.f25570y = r6
            java.lang.Object r10 = r3.a(r10, r9)
            if (r10 != r0) goto L5a
            goto L64
        L5a:
            r9.f25569x = r4
            r9.f25570y = r5
            java.lang.Object r10 = r3.a(r1, r9)
            if (r10 != r0) goto L65
        L64:
            return r0
        L65:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y.d.q(java.lang.Object):java.lang.Object");
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        return ((d) o((t) obj, (pq.c) obj2)).q(b0.f15562a);
    }
}
