package m9;

/* loaded from: classes.dex */
public final class g implements xf.d {

    /* renamed from: a, reason: collision with root package name */
    public static final g f16348a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final xf.c f16349b;

    /* renamed from: c, reason: collision with root package name */
    public static final xf.c f16350c;

    static {
        ag.b bVarC = ag.b.c();
        bVarC.f345d = 1;
        f16349b = new xf.c("startMs", h0.b.w(h0.b.v(ag.f.class, bVarC.b())));
        ag.b bVarC2 = ag.b.c();
        bVarC2.f345d = 2;
        f16350c = new xf.c("endMs", h0.b.w(h0.b.v(ag.f.class, bVarC2.b())));
    }

    @Override // xf.a
    public final void a(Object obj, Object obj2) {
        p9.g gVar = (p9.g) obj;
        xf.e eVar = (xf.e) obj2;
        eVar.c(f16349b, gVar.f20350a);
        eVar.c(f16350c, gVar.f20351b);
    }
}
