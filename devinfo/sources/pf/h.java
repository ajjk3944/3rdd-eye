package pf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h implements we.d {

    /* renamed from: a, reason: collision with root package name */
    public static final h f31826a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final we.c f31827b = we.c.a("sessionId");

    /* renamed from: c, reason: collision with root package name */
    public static final we.c f31828c = we.c.a("firstSessionId");

    /* renamed from: d, reason: collision with root package name */
    public static final we.c f31829d = we.c.a("sessionIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final we.c f31830e = we.c.a("eventTimestampUs");

    /* renamed from: f, reason: collision with root package name */
    public static final we.c f31831f = we.c.a("dataCollectionStatus");
    public static final we.c g = we.c.a("firebaseInstallationId");

    /* renamed from: h, reason: collision with root package name */
    public static final we.c f31832h = we.c.a("firebaseAuthenticationToken");

    @Override // we.a
    public final void a(Object obj, Object obj2) {
        w0 w0Var = (w0) obj;
        we.e eVar = (we.e) obj2;
        eVar.e(f31827b, w0Var.f31913a);
        eVar.e(f31828c, w0Var.f31914b);
        eVar.c(f31829d, w0Var.f31915c);
        eVar.d(f31830e, w0Var.f31916d);
        eVar.e(f31831f, w0Var.f31917e);
        eVar.e(g, w0Var.f31918f);
        eVar.e(f31832h, w0Var.g);
    }
}
