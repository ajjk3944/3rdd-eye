package lf;

/* loaded from: classes.dex */
public final class j implements xf.d {

    /* renamed from: a, reason: collision with root package name */
    public static final j f15286a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final xf.c f15287b = xf.c.a("generator");

    /* renamed from: c, reason: collision with root package name */
    public static final xf.c f15288c = xf.c.a("identifier");

    /* renamed from: d, reason: collision with root package name */
    public static final xf.c f15289d = xf.c.a("appQualitySessionId");

    /* renamed from: e, reason: collision with root package name */
    public static final xf.c f15290e = xf.c.a("startedAt");

    /* renamed from: f, reason: collision with root package name */
    public static final xf.c f15291f = xf.c.a("endedAt");

    /* renamed from: g, reason: collision with root package name */
    public static final xf.c f15292g = xf.c.a("crashed");

    /* renamed from: h, reason: collision with root package name */
    public static final xf.c f15293h = xf.c.a("app");

    /* renamed from: i, reason: collision with root package name */
    public static final xf.c f15294i = xf.c.a("user");
    public static final xf.c j = xf.c.a("os");
    public static final xf.c k = xf.c.a("device");

    /* renamed from: l, reason: collision with root package name */
    public static final xf.c f15295l = xf.c.a("events");

    /* renamed from: m, reason: collision with root package name */
    public static final xf.c f15296m = xf.c.a("generatorType");

    @Override // xf.a
    public final void a(Object obj, Object obj2) {
        xf.e eVar = (xf.e) obj2;
        j0 j0Var = (j0) ((m2) obj);
        eVar.e(f15287b, j0Var.f15297a);
        eVar.e(f15288c, j0Var.f15298b.getBytes(n2.f15373a));
        eVar.e(f15289d, j0Var.f15299c);
        eVar.c(f15290e, j0Var.f15300d);
        eVar.e(f15291f, j0Var.f15301e);
        eVar.a(f15292g, j0Var.f15302f);
        eVar.e(f15293h, j0Var.f15303g);
        eVar.e(f15294i, j0Var.f15304h);
        eVar.e(j, j0Var.f15305i);
        eVar.e(k, j0Var.j);
        eVar.e(f15295l, j0Var.k);
        eVar.d(f15296m, j0Var.f15306l);
    }
}
