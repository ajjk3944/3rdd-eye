package Q4;

import Q4.f0;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: Q4.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1499g implements Z4.d<f0.e.a> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1499g f11203a = new C1499g();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11204b = Z4.c.a("identifier");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f11205c = Z4.c.a("version");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f11206d = Z4.c.a("displayVersion");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f11207e = Z4.c.a("organization");

    /* renamed from: f, reason: collision with root package name */
    public static final Z4.c f11208f = Z4.c.a("installationUuid");

    /* renamed from: g, reason: collision with root package name */
    public static final Z4.c f11209g = Z4.c.a("developmentPlatform");

    /* renamed from: h, reason: collision with root package name */
    public static final Z4.c f11210h = Z4.c.a("developmentPlatformVersion");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        f0.e.a aVar = (f0.e.a) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f11204b, aVar.d());
        eVar2.a(f11205c, aVar.g());
        eVar2.a(f11206d, aVar.c());
        eVar2.a(f11207e, aVar.f());
        eVar2.a(f11208f, aVar.e());
        eVar2.a(f11209g, aVar.a());
        eVar2.a(f11210h, aVar.b());
    }
}
