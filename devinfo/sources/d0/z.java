package d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z extends ek.i implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public c2.j f21906a;

    /* renamed from: b, reason: collision with root package name */
    public int f21907b;

    /* renamed from: c, reason: collision with root package name */
    public int f21908c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f21909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nk.q f21910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nk.u f21911f;
    public final /* synthetic */ nk.u g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(nk.q qVar, nk.u uVar, nk.u uVar2, ck.c cVar) {
        super(2, cVar);
        this.f21910e = qVar;
        this.f21911f = uVar;
        this.g = uVar2;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        z zVar = new z(this.f21910e, this.f21911f, this.g, cVar);
        zVar.f21909d = obj;
        return zVar;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((c2.k0) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ed, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012d A[EDGE_INSN: B:70:0x012d->B:45:0x012d BREAK  A[LOOP:0: B:40:0x011a->B:44:0x012a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x010c -> B:39:0x0111). Please report as a decompilation issue!!! */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
