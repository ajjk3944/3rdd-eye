package d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i0 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21754b = 1;

    /* renamed from: c, reason: collision with root package name */
    public nk.u f21755c;

    /* renamed from: d, reason: collision with root package name */
    public nk.u f21756d;

    /* renamed from: e, reason: collision with root package name */
    public int f21757e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f21758f;
    public final /* synthetic */ s1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(s1 s1Var, ck.c cVar) {
        super(2, cVar);
        this.g = s1Var;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f21754b) {
            case 0:
                i0 i0Var = new i0(this.f21756d, this.g, cVar);
                i0Var.f21758f = obj;
                return i0Var;
            default:
                i0 i0Var2 = new i0(this.g, cVar);
                i0Var2.f21758f = obj;
                return i0Var2;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21754b) {
            case 0:
                return ((i0) create((mk.c) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            default:
                return ((i0) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f6, code lost:
    
        if (d0.s1.s0(r2, r10) != r4) goto L13;
     */
    /* JADX WARN: Path cross not found for [B:49:0x00d9, B:45:0x00c7], limit reached: 88 */
    /* JADX WARN: Path cross not found for [B:51:0x00dd, B:21:0x005d], limit reached: 88 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[PHI: r0 r5
  0x0039: PHI (r0v14 nk.u) = (r0v6 nk.u), (r0v18 nk.u) binds: [B:15:0x0036, B:41:0x00be] A[DONT_GENERATE, DONT_INLINE]
  0x0039: PHI (r5v6 xk.v) = (r5v4 xk.v), (r5v7 xk.v) binds: [B:15:0x0036, B:41:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[PHI: r6
  0x005d: PHI (r6v8 xk.v) = (r6v0 xk.v), (r6v3 xk.v), (r6v3 xk.v), (r6v3 xk.v), (r6v6 xk.v), (r6v9 xk.v) binds: [B:20:0x0055, B:50:0x00db, B:52:0x00e8, B:46:0x00d4, B:32:0x0089, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7 A[Catch: CancellationException -> 0x00d7, TryCatch #2 {CancellationException -> 0x00d7, blocks: (B:43:0x00c1, B:45:0x00c7, B:49:0x00d9, B:51:0x00dd), top: B:91:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9 A[Catch: CancellationException -> 0x00d7, TryCatch #2 {CancellationException -> 0x00d7, blocks: (B:43:0x00c1, B:45:0x00c7, B:49:0x00d9, B:51:0x00dd), top: B:91:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0089 -> B:21:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d4 -> B:21:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00db -> B:21:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00e8 -> B:21:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00f6 -> B:13:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x014a -> B:81:0x014b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x014f -> B:83:0x0150). Please report as a decompilation issue!!! */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(nk.u uVar, s1 s1Var, ck.c cVar) {
        super(2, cVar);
        this.f21756d = uVar;
        this.g = s1Var;
    }
}
