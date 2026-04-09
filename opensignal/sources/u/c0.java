package u;

/* loaded from: classes.dex */
public final class c0 extends rq.i implements ar.n {
    public int B;
    public int D;
    public int E;
    public long F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ d0 I;
    public final /* synthetic */ st.h J;

    /* renamed from: g, reason: collision with root package name */
    public st.h f23053g;

    /* renamed from: r, reason: collision with root package name */
    public d0 f23054r;

    /* renamed from: x, reason: collision with root package name */
    public long[] f23055x;

    /* renamed from: y, reason: collision with root package name */
    public int f23056y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, st.h hVar, pq.c cVar) {
        super(2, cVar);
        this.I = d0Var;
        this.J = hVar;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        c0 c0Var = new c0(this.I, this.J, cVar);
        c0Var.H = obj;
        return c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0051 -> B:23:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0053 -> B:14:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006f -> B:20:0x0097). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0094 -> B:20:0x0097). Please report as a decompilation issue!!! */
    @Override // rq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.G
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2e
            if (r2 != r5) goto L26
            int r2 = r0.E
            int r6 = r0.D
            long r7 = r0.F
            int r9 = r0.B
            int r10 = r0.f23056y
            long[] r11 = r0.f23055x
            u.d0 r12 = r0.f23054r
            st.h r13 = r0.f23053g
            java.lang.Object r14 = r0.H
            st.k r14 = (st.k) r14
            lf.t1.G(r22)
            goto L97
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2e:
            lf.t1.G(r22)
            java.lang.Object r2 = r0.H
            st.k r2 = (st.k) r2
            u.d0 r6 = r0.I
            u.b0 r7 = r6.f23059d
            long[] r7 = r7.f23044a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La7
            st.h r9 = r0.J
            r10 = 0
        L43:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La2
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = 0
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L66:
            if (r2 >= r6) goto L9a
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L97
            int r15 = r9 << 3
            int r15 = r15 + r2
            r13.f22292d = r15
            u.b0 r3 = r12.f23059d
            java.lang.Object[] r3 = r3.f23045b
            r3 = r3[r15]
            r0.H = r14
            r0.f23053g = r13
            r0.f23054r = r12
            r0.f23055x = r11
            r0.f23056y = r10
            r0.B = r9
            r0.F = r7
            r0.D = r6
            r0.E = r2
            r0.G = r5
            qq.a r3 = r14.b(r3, r0)
            if (r3 != r1) goto L97
            return r1
        L97:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L66
        L9a:
            if (r6 != r4) goto La7
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r14
            r10 = r9
            r9 = r13
        La2:
            if (r10 == r8) goto La7
            int r10 = r10 + 1
            goto L43
        La7:
            lq.b0 r1 = lq.b0.f15562a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u.c0.q(java.lang.Object):java.lang.Object");
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        return ((c0) o((st.k) obj, (pq.c) obj2)).q(lq.b0.f15562a);
    }
}
