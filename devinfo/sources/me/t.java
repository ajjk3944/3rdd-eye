package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t implements we.d {

    /* renamed from: a, reason: collision with root package name */
    public static final t f29309a = new t();

    /* renamed from: b, reason: collision with root package name */
    public static final we.c f29310b = we.c.a("timestamp");

    /* renamed from: c, reason: collision with root package name */
    public static final we.c f29311c = we.c.a("type");

    /* renamed from: d, reason: collision with root package name */
    public static final we.c f29312d = we.c.a("app");

    /* renamed from: e, reason: collision with root package name */
    public static final we.c f29313e = we.c.a("device");

    /* renamed from: f, reason: collision with root package name */
    public static final we.c f29314f = we.c.a("log");
    public static final we.c g = we.c.a("rollouts");

    @Override // we.a
    public final void a(Object obj, Object obj2) {
        we.e eVar = (we.e) obj2;
        p0 p0Var = (p0) ((j2) obj);
        eVar.d(f29310b, p0Var.f29271a);
        eVar.e(f29311c, p0Var.f29272b);
        eVar.e(f29312d, p0Var.f29273c);
        eVar.e(f29313e, p0Var.f29274d);
        eVar.e(f29314f, p0Var.f29275e);
        eVar.e(g, p0Var.f29276f);
    }
}
