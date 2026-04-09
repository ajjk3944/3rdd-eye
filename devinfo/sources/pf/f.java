package pf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f implements we.d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f31809a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final we.c f31810b = we.c.a("processName");

    /* renamed from: c, reason: collision with root package name */
    public static final we.c f31811c = we.c.a("pid");

    /* renamed from: d, reason: collision with root package name */
    public static final we.c f31812d = we.c.a("importance");

    /* renamed from: e, reason: collision with root package name */
    public static final we.c f31813e = we.c.a("defaultProcess");

    @Override // we.a
    public final void a(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        we.e eVar = (we.e) obj2;
        eVar.e(f31810b, f0Var.f31814a);
        eVar.c(f31811c, f0Var.f31815b);
        eVar.c(f31812d, f0Var.f31816c);
        eVar.a(f31813e, f0Var.f31817d);
    }
}
