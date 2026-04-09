package pf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g implements we.d {

    /* renamed from: a, reason: collision with root package name */
    public static final g f31821a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final we.c f31822b = we.c.a("eventType");

    /* renamed from: c, reason: collision with root package name */
    public static final we.c f31823c = we.c.a("sessionData");

    /* renamed from: d, reason: collision with root package name */
    public static final we.c f31824d = we.c.a("applicationInfo");

    @Override // we.a
    public final void a(Object obj, Object obj2) {
        o0 o0Var = (o0) obj;
        we.e eVar = (we.e) obj2;
        o0Var.getClass();
        eVar.e(f31822b, m.SESSION_START);
        eVar.e(f31823c, o0Var.f31877a);
        eVar.e(f31824d, o0Var.f31878b);
    }
}
