package m9;

/* loaded from: classes.dex */
public final class f implements xf.d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f16345a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final xf.c f16346b;

    /* renamed from: c, reason: collision with root package name */
    public static final xf.c f16347c;

    static {
        ag.b bVarC = ag.b.c();
        bVarC.f345d = 1;
        f16346b = new xf.c("currentCacheSizeBytes", h0.b.w(h0.b.v(ag.f.class, bVarC.b())));
        ag.b bVarC2 = ag.b.c();
        bVarC2.f345d = 2;
        f16347c = new xf.c("maxCacheSizeBytes", h0.b.w(h0.b.v(ag.f.class, bVarC2.b())));
    }

    @Override // xf.a
    public final void a(Object obj, Object obj2) {
        p9.f fVar = (p9.f) obj;
        xf.e eVar = (xf.e) obj2;
        eVar.c(f16346b, fVar.f20348a);
        eVar.c(f16347c, fVar.f20349b);
    }
}
