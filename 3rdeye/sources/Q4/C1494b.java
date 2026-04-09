package Q4;

import Q4.f0;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: Q4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1494b implements Z4.d<f0.a> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1494b f11152a = new C1494b();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11153b = Z4.c.a("pid");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f11154c = Z4.c.a("processName");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f11155d = Z4.c.a("reasonCode");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f11156e = Z4.c.a("importance");

    /* renamed from: f, reason: collision with root package name */
    public static final Z4.c f11157f = Z4.c.a("pss");

    /* renamed from: g, reason: collision with root package name */
    public static final Z4.c f11158g = Z4.c.a("rss");

    /* renamed from: h, reason: collision with root package name */
    public static final Z4.c f11159h = Z4.c.a("timestamp");
    public static final Z4.c i = Z4.c.a("traceFile");

    /* renamed from: j, reason: collision with root package name */
    public static final Z4.c f11160j = Z4.c.a("buildIdMappingForArch");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        f0.a aVar = (f0.a) obj;
        Z4.e eVar2 = eVar;
        eVar2.c(f11153b, aVar.c());
        eVar2.a(f11154c, aVar.d());
        eVar2.c(f11155d, aVar.f());
        eVar2.c(f11156e, aVar.b());
        eVar2.b(f11157f, aVar.e());
        eVar2.b(f11158g, aVar.g());
        eVar2.b(f11159h, aVar.h());
        eVar2.a(i, aVar.i());
        eVar2.a(f11160j, aVar.a());
    }
}
