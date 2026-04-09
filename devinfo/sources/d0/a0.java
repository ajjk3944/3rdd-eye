package d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a0 extends ek.i implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public Object f21647a;

    /* renamed from: b, reason: collision with root package name */
    public Object f21648b;

    /* renamed from: c, reason: collision with root package name */
    public nk.t f21649c;

    /* renamed from: d, reason: collision with root package name */
    public nk.t f21650d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.d f21651e;

    /* renamed from: f, reason: collision with root package name */
    public c2.p f21652f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public float f21653h;

    /* renamed from: i, reason: collision with root package name */
    public int f21654i;
    public /* synthetic */ Object j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ mk.a f21655k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ nk.t f21656l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a1 f21657m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ mk.f f21658n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ mk.e f21659o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ mk.a f21660p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ mk.c f21661q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(mk.a aVar, nk.t tVar, a1 a1Var, mk.f fVar, mk.e eVar, mk.a aVar2, mk.c cVar, ck.c cVar2) {
        super(2, cVar2);
        this.f21655k = aVar;
        this.f21656l = tVar;
        this.f21657m = a1Var;
        this.f21658n = fVar;
        this.f21659o = eVar;
        this.f21660p = aVar2;
        this.f21661q = cVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        a0 a0Var = new a0(this.f21655k, this.f21656l, this.f21657m, this.f21658n, this.f21659o, this.f21660p, this.f21661q, cVar);
        a0Var.j = obj;
        return a0Var;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((c2.k0) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x048a, code lost:
    
        if (d0.d0.d(r4.f2643f.f2651s, r2) != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04b0, code lost:
    
        if (r5 != r14) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0517, code lost:
    
        if (o1.b.c(c2.h0.f(r13, true)) == 0.0f) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0176, code lost:
    
        if (r5 != r14) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02e2, code lost:
    
        if (r5 == r14) goto L175;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:199:0x050b, B:188:0x04e6], limit reached: 217 */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02b3  */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v56, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v33, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v50, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x030c -> B:92:0x02cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0347 -> B:164:0x0450). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x034e -> B:118:0x0366). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x0444 -> B:161:0x0447). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:174:0x04b0 -> B:176:0x04b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0190 -> B:31:0x0192). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0205 -> B:31:0x0192). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0261 -> B:78:0x029b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x028c -> B:75:0x0291). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x02aa -> B:86:0x02b1). Please report as a decompilation issue!!! */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 1392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
