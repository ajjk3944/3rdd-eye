package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l implements we.d {

    /* renamed from: a, reason: collision with root package name */
    public static final l f29210a = new l();

    /* renamed from: b, reason: collision with root package name */
    public static final we.c f29211b = we.c.a("baseAddress");

    /* renamed from: c, reason: collision with root package name */
    public static final we.c f29212c = we.c.a("size");

    /* renamed from: d, reason: collision with root package name */
    public static final we.c f29213d = we.c.a("name");

    /* renamed from: e, reason: collision with root package name */
    public static final we.c f29214e = we.c.a("uuid");

    @Override // we.a
    public final void a(Object obj, Object obj2) {
        we.e eVar = (we.e) obj2;
        s0 s0Var = (s0) ((w1) obj);
        eVar.d(f29211b, s0Var.f29305a);
        eVar.d(f29212c, s0Var.f29306b);
        eVar.e(f29213d, s0Var.f29307c);
        String str = s0Var.f29308d;
        eVar.e(f29214e, str != null ? str.getBytes(n2.f29256a) : null);
    }
}
