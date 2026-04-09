package Q4;

import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: Q4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1496d implements Z4.d<f0> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1496d f11173a = new C1496d();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11174b = Z4.c.a("sdkVersion");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f11175c = Z4.c.a("gmpAppId");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f11176d = Z4.c.a("platform");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f11177e = Z4.c.a("installationUuid");

    /* renamed from: f, reason: collision with root package name */
    public static final Z4.c f11178f = Z4.c.a("firebaseInstallationId");

    /* renamed from: g, reason: collision with root package name */
    public static final Z4.c f11179g = Z4.c.a("firebaseAuthenticationToken");

    /* renamed from: h, reason: collision with root package name */
    public static final Z4.c f11180h = Z4.c.a("appQualitySessionId");
    public static final Z4.c i = Z4.c.a("buildVersion");

    /* renamed from: j, reason: collision with root package name */
    public static final Z4.c f11181j = Z4.c.a("displayVersion");

    /* renamed from: k, reason: collision with root package name */
    public static final Z4.c f11182k = Z4.c.a("session");

    /* renamed from: l, reason: collision with root package name */
    public static final Z4.c f11183l = Z4.c.a("ndkPayload");

    /* renamed from: m, reason: collision with root package name */
    public static final Z4.c f11184m = Z4.c.a("appExitInfo");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        f0 f0Var = (f0) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f11174b, f0Var.k());
        eVar2.a(f11175c, f0Var.g());
        eVar2.c(f11176d, f0Var.j());
        eVar2.a(f11177e, f0Var.h());
        eVar2.a(f11178f, f0Var.f());
        eVar2.a(f11179g, f0Var.e());
        eVar2.a(f11180h, f0Var.b());
        eVar2.a(i, f0Var.c());
        eVar2.a(f11181j, f0Var.d());
        eVar2.a(f11182k, f0Var.l());
        eVar2.a(f11183l, f0Var.i());
        eVar2.a(f11184m, f0Var.a());
    }
}
