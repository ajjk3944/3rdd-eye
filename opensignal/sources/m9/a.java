package m9;

/* loaded from: classes.dex */
public final class a implements xf.d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16331a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final xf.c f16332b;

    /* renamed from: c, reason: collision with root package name */
    public static final xf.c f16333c;

    /* renamed from: d, reason: collision with root package name */
    public static final xf.c f16334d;

    /* renamed from: e, reason: collision with root package name */
    public static final xf.c f16335e;

    static {
        ag.b bVarC = ag.b.c();
        bVarC.f345d = 1;
        f16332b = new xf.c("window", h0.b.w(h0.b.v(ag.f.class, bVarC.b())));
        ag.b bVarC2 = ag.b.c();
        bVarC2.f345d = 2;
        f16333c = new xf.c("logSourceMetrics", h0.b.w(h0.b.v(ag.f.class, bVarC2.b())));
        ag.b bVarC3 = ag.b.c();
        bVarC3.f345d = 3;
        f16334d = new xf.c("globalMetrics", h0.b.w(h0.b.v(ag.f.class, bVarC3.b())));
        ag.b bVarC4 = ag.b.c();
        bVarC4.f345d = 4;
        f16335e = new xf.c("appNamespace", h0.b.w(h0.b.v(ag.f.class, bVarC4.b())));
    }

    @Override // xf.a
    public final void a(Object obj, Object obj2) {
        p9.a aVar = (p9.a) obj;
        xf.e eVar = (xf.e) obj2;
        eVar.e(f16332b, aVar.f20338a);
        eVar.e(f16333c, aVar.f20339b);
        eVar.e(f16334d, aVar.f20340c);
        eVar.e(f16335e, aVar.f20341d);
    }
}
