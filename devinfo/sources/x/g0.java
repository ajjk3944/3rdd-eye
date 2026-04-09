package x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g0 extends ek.i implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public a1.d f36889a;

    /* renamed from: b, reason: collision with root package name */
    public h0 f36890b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f36891c;

    /* renamed from: d, reason: collision with root package name */
    public int f36892d;

    /* renamed from: e, reason: collision with root package name */
    public int f36893e;

    /* renamed from: f, reason: collision with root package name */
    public int f36894f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public long f36895h;

    /* renamed from: i, reason: collision with root package name */
    public int f36896i;
    public /* synthetic */ Object j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h0 f36897k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a1.d f36898l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, a1.d dVar, ck.c cVar) {
        super(2, cVar);
        this.f36897k = h0Var;
        this.f36898l = dVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        g0 g0Var = new g0(this.f36897k, this.f36898l, cVar);
        g0Var.j = obj;
        return g0Var;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((uk.h) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:22:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:19:0x0095). Please report as a decompilation issue!!! */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.f36896i
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 != r4) goto L25
            int r1 = r0.g
            int r5 = r0.f36894f
            long r6 = r0.f36895h
            int r8 = r0.f36893e
            int r9 = r0.f36892d
            long[] r10 = r0.f36891c
            x.h0 r11 = r0.f36890b
            a1.d r12 = r0.f36889a
            java.lang.Object r13 = r0.j
            uk.h r13 = (uk.h) r13
            ci.b.D(r21)
            goto L95
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2d:
            ci.b.D(r21)
            java.lang.Object r1 = r0.j
            uk.h r1 = (uk.h) r1
            x.h0 r5 = r0.f36897k
            x.f0 r6 = r5.f36901b
            long[] r6 = r6.f36882a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La5
            a1.d r8 = r0.f36898l
            r9 = r2
        L42:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto La0
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L65:
            if (r1 >= r5) goto L98
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L95
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.f164c = r2
            x.f0 r3 = r11.f36901b
            java.lang.Object[] r3 = r3.f36883b
            r2 = r3[r2]
            r0.j = r13
            r0.f36889a = r12
            r0.f36890b = r11
            r0.f36891c = r10
            r0.f36892d = r9
            r0.f36893e = r8
            r0.f36895h = r6
            r0.f36894f = r5
            r0.g = r1
            r0.f36896i = r4
            r13.a(r0, r2)
            dk.a r1 = dk.a.f22275a
            return r1
        L95:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L65
        L98:
            if (r5 != r3) goto La5
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        La0:
            if (r9 == r7) goto La5
            int r9 = r9 + 1
            goto L42
        La5:
            yj.u r1 = yj.u.f37649a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
