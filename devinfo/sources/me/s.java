package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s implements we.d {

    /* renamed from: a, reason: collision with root package name */
    public static final s f29299a = new s();

    /* renamed from: b, reason: collision with root package name */
    public static final we.c f29300b = we.c.a("batteryLevel");

    /* renamed from: c, reason: collision with root package name */
    public static final we.c f29301c = we.c.a("batteryVelocity");

    /* renamed from: d, reason: collision with root package name */
    public static final we.c f29302d = we.c.a("proximityOn");

    /* renamed from: e, reason: collision with root package name */
    public static final we.c f29303e = we.c.a("orientation");

    /* renamed from: f, reason: collision with root package name */
    public static final we.c f29304f = we.c.a("ramUsed");
    public static final we.c g = we.c.a("diskUsed");

    @Override // we.a
    public final void a(Object obj, Object obj2) {
        we.e eVar = (we.e) obj2;
        b1 b1Var = (b1) ((e2) obj);
        eVar.e(f29300b, b1Var.f29072a);
        eVar.c(f29301c, b1Var.f29073b);
        eVar.a(f29302d, b1Var.f29074c);
        eVar.c(f29303e, b1Var.f29075d);
        eVar.d(f29304f, b1Var.f29076e);
        eVar.d(g, b1Var.f29077f);
    }
}
