package x3;

import java.io.IOException;

/* compiled from: AutoBatchedLogRequestEncoder.java */
/* loaded from: classes.dex */
public final class j implements Z4.d<D> {

    /* renamed from: a, reason: collision with root package name */
    public static final j f47702a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f47703b = Z4.c.a("requestTimeMs");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f47704c = Z4.c.a("requestUptimeMs");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f47705d = Z4.c.a("clientInfo");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f47706e = Z4.c.a("logSource");

    /* renamed from: f, reason: collision with root package name */
    public static final Z4.c f47707f = Z4.c.a("logSourceName");

    /* renamed from: g, reason: collision with root package name */
    public static final Z4.c f47708g = Z4.c.a("logEvent");

    /* renamed from: h, reason: collision with root package name */
    public static final Z4.c f47709h = Z4.c.a("qosTier");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        D d10 = (D) obj;
        Z4.e eVar2 = eVar;
        eVar2.b(f47703b, d10.f());
        eVar2.b(f47704c, d10.g());
        eVar2.a(f47705d, d10.a());
        eVar2.a(f47706e, d10.c());
        eVar2.a(f47707f, d10.d());
        eVar2.a(f47708g, d10.b());
        eVar2.a(f47709h, d10.e());
    }
}
