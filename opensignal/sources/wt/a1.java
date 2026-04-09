package wt;

/* loaded from: classes.dex */
public final class a1 extends rq.i implements ar.n {
    public final /* synthetic */ b1 B;

    /* renamed from: g, reason: collision with root package name */
    public e1 f24598g;

    /* renamed from: r, reason: collision with root package name */
    public k f24599r;

    /* renamed from: x, reason: collision with root package name */
    public int f24600x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f24601y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b1 b1Var, pq.c cVar) {
        super(2, cVar);
        this.B = b1Var;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        a1 a1Var = new a1(this.B, cVar);
        a1Var.f24601y = obj;
        return a1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r7.b(r1, r6) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r4.b(r5, r6) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0069 -> B:27:0x007f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007c -> B:27:0x007f). Please report as a decompilation issue!!! */
    @Override // rq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.lang.Object r7) {
        /*
            r6 = this;
            qq.a r0 = qq.a.COROUTINE_SUSPENDED
            int r1 = r6.f24600x
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            wt.k r1 = r6.f24599r
            wt.e1 r3 = r6.f24598g
            java.lang.Object r4 = r6.f24601y
            st.k r4 = (st.k) r4
            lf.t1.G(r7)
            goto L7f
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L20:
            lf.t1.G(r7)
            goto L84
        L24:
            lf.t1.G(r7)
            java.lang.Object r7 = r6.f24601y
            st.k r7 = (st.k) r7
            wt.b1 r1 = r6.B
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = wt.b1.f24604a
            java.lang.Object r1 = r4.get(r1)
            boolean r4 = r1 instanceof wt.k
            if (r4 == 0) goto L44
            wt.k r1 = (wt.k) r1
            wt.b1 r1 = r1.f24627x
            r6.f24600x = r3
            qq.a r7 = r7.b(r1, r6)
            if (r7 != r0) goto L84
            goto L7e
        L44:
            boolean r3 = r1 instanceof wt.p0
            if (r3 == 0) goto L84
            wt.p0 r1 = (wt.p0) r1
            wt.e1 r1 = r1.d()
            if (r1 == 0) goto L84
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = bu.j.f2971a
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            br.l.c(r3, r4)
            bu.j r3 = (bu.j) r3
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r7
        L61:
            boolean r7 = r1.equals(r3)
            if (r7 != 0) goto L84
            boolean r7 = r1 instanceof wt.k
            if (r7 == 0) goto L7f
            r7 = r1
            wt.k r7 = (wt.k) r7
            wt.b1 r5 = r7.f24627x
            r6.f24601y = r4
            r6.f24598g = r3
            r6.f24599r = r7
            r6.f24600x = r2
            qq.a r7 = r4.b(r5, r6)
            if (r7 != r0) goto L7f
        L7e:
            return r0
        L7f:
            bu.j r1 = r1.h()
            goto L61
        L84:
            lq.b0 r7 = lq.b0.f15562a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wt.a1.q(java.lang.Object):java.lang.Object");
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        return ((a1) o((st.k) obj, (pq.c) obj2)).q(lq.b0.f15562a);
    }
}
