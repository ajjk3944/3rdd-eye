package lf;

/* loaded from: classes.dex */
public final class s implements xf.d {

    /* renamed from: a, reason: collision with root package name */
    public static final s f15418a = new s();

    /* renamed from: b, reason: collision with root package name */
    public static final xf.c f15419b = xf.c.a("batteryLevel");

    /* renamed from: c, reason: collision with root package name */
    public static final xf.c f15420c = xf.c.a("batteryVelocity");

    /* renamed from: d, reason: collision with root package name */
    public static final xf.c f15421d = xf.c.a("proximityOn");

    /* renamed from: e, reason: collision with root package name */
    public static final xf.c f15422e = xf.c.a("orientation");

    /* renamed from: f, reason: collision with root package name */
    public static final xf.c f15423f = xf.c.a("ramUsed");

    /* renamed from: g, reason: collision with root package name */
    public static final xf.c f15424g = xf.c.a("diskUsed");

    @Override // xf.a
    public final void a(Object obj, Object obj2) {
        xf.e eVar = (xf.e) obj2;
        b1 b1Var = (b1) ((e2) obj);
        eVar.e(f15419b, b1Var.f15182a);
        eVar.d(f15420c, b1Var.f15183b);
        eVar.a(f15421d, b1Var.f15184c);
        eVar.d(f15422e, b1Var.f15185d);
        eVar.c(f15423f, b1Var.f15186e);
        eVar.c(f15424g, b1Var.f15187f);
    }
}
