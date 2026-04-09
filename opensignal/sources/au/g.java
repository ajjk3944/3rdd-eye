package au;

import lq.b0;

/* loaded from: classes.dex */
public abstract class g extends f {

    /* renamed from: r, reason: collision with root package name */
    public final zt.f f2327r;

    public g(zt.f fVar, pq.h hVar, int i10, yt.a aVar) {
        super(hVar, i10, aVar);
        this.f2327r = fVar;
    }

    @Override // au.f
    public final Object b(yt.p pVar, a8.h hVar) {
        Object objE = e(new w(pVar), hVar);
        return objE == qq.a.COROUTINE_SUSPENDED ? objE : b0.f15562a;
    }

    public abstract Object e(zt.g gVar, pq.c cVar);

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    @Override // au.f, zt.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(zt.g r5, pq.c r6) {
        /*
            r4 = this;
            int r0 = r4.f2325d
            r1 = -3
            if (r0 != r1) goto L6f
            pq.h r0 = r6.m()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            wl.a r2 = new wl.a
            r3 = 2
            r2.<init>(r3)
            pq.h r3 = r4.f2324a
            java.lang.Object r1 = r3.Z(r2, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L24
            pq.h r1 = r0.i0(r3)
            goto L29
        L24:
            r1 = 0
            pq.h r1 = wt.w.k(r0, r3, r1)
        L29:
            boolean r2 = br.l.a(r1, r0)
            if (r2 == 0) goto L38
            java.lang.Object r5 = r4.e(r5, r6)
            qq.a r6 = qq.a.COROUTINE_SUSPENDED
            if (r5 != r6) goto L78
            return r5
        L38:
            pq.d r2 = pq.d.f20620a
            pq.f r3 = r1.Y(r2)
            pq.f r0 = r0.Y(r2)
            boolean r0 = br.l.a(r3, r0)
            if (r0 == 0) goto L6f
            pq.h r0 = r6.m()
            boolean r2 = r5 instanceof au.w
            if (r2 != 0) goto L5b
            boolean r2 = r5 instanceof au.q
            if (r2 == 0) goto L55
            goto L5b
        L55:
            au.z r2 = new au.z
            r2.<init>(r5, r0)
            r5 = r2
        L5b:
            a8.h r0 = new a8.h
            r2 = 0
            r3 = 2
            r0.<init>(r4, r2, r3)
            java.lang.Object r2 = bu.a.k(r1)
            java.lang.Object r5 = au.c.a(r1, r5, r2, r0, r6)
            qq.a r6 = qq.a.COROUTINE_SUSPENDED
            if (r5 != r6) goto L78
            return r5
        L6f:
            java.lang.Object r5 = super.l(r5, r6)
            qq.a r6 = qq.a.COROUTINE_SUSPENDED
            if (r5 != r6) goto L78
            return r5
        L78:
            lq.b0 r5 = lq.b0.f15562a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.g.l(zt.g, pq.c):java.lang.Object");
    }

    @Override // au.f
    public final String toString() {
        return this.f2327r + " -> " + super.toString();
    }
}
