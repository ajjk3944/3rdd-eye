package p4;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31317b;

    /* renamed from: c, reason: collision with root package name */
    public int f31318c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f31319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f31320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f31321f;
    public Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(z zVar, int i4, ck.c cVar, int i10) {
        super(2, cVar);
        this.f31317b = i10;
        this.f31320e = zVar;
        this.f31321f = i4;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f31317b) {
            case 0:
                u uVar = new u(this.f31320e, this.f31321f, cVar, 0);
                uVar.f31319d = ((Boolean) obj).booleanValue();
                return uVar;
            default:
                u uVar2 = new u(this.f31320e, this.f31321f, cVar, 1);
                uVar2.f31319d = ((Boolean) obj).booleanValue();
                return uVar2;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.f31317b;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        ck.c cVar = (ck.c) obj2;
        switch (i4) {
        }
        return ((u) create(bool, cVar)).invokeSuspend(yj.u.f37649a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
