package bl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public zk.l f2318b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f2319c;

    /* renamed from: d, reason: collision with root package name */
    public int f2320d;

    /* renamed from: e, reason: collision with root package name */
    public int f2321e;

    /* renamed from: f, reason: collision with root package name */
    public int f2322f;
    public /* synthetic */ Object g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ al.h[] f2323h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ mk.a f2324i;
    public final /* synthetic */ ek.j j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ al.i f2325k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(al.h[] hVarArr, mk.a aVar, mk.f fVar, al.i iVar, ck.c cVar) {
        super(2, cVar);
        this.f2323h = hVarArr;
        this.f2324i = aVar;
        this.j = (ek.j) fVar;
        this.f2325k = iVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [ek.j, mk.f] */
    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        p pVar = new p(this.f2323h, this.f2324i, this.j, this.f2325k, cVar);
        pVar.g = obj;
        return pVar;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
    
        if (r8 != 0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:33:0x00c2, B:31:0x00b3], limit reached: 42 */
    /* JADX WARN: Path cross not found for [B:34:0x00c4, B:19:0x0083], limit reached: 42 */
    /* JADX WARN: Path cross not found for [B:36:0x00d2, B:39:0x00e5], limit reached: 42 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3 A[LOOP:0: B:26:0x00a3->B:44:?, LOOP_START, PHI: r8 r12
  0x00a3: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:23:0x009e, B:44:?] A[DONT_GENERATE, DONT_INLINE]
  0x00a3: PHI (r12v4 zj.v) = (r12v3 zj.v), (r12v10 zj.v) binds: [B:23:0x009e, B:44:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r14v4, types: [ek.j, mk.f] */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e2 -> B:19:0x0083). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00fa -> B:19:0x0083). Please report as a decompilation issue!!! */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
