package Q4;

import Q4.f0;
import io.appmetrica.analytics.impl.L2;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: Q4.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1503k implements Z4.d<f0.e.d.a> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1503k f11234a = new C1503k();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11235b = Z4.c.a("execution");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f11236c = Z4.c.a("customAttributes");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f11237d = Z4.c.a("internalKeys");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f11238e = Z4.c.a(L2.f39740g);

    /* renamed from: f, reason: collision with root package name */
    public static final Z4.c f11239f = Z4.c.a("currentProcessDetails");

    /* renamed from: g, reason: collision with root package name */
    public static final Z4.c f11240g = Z4.c.a("appProcessDetails");

    /* renamed from: h, reason: collision with root package name */
    public static final Z4.c f11241h = Z4.c.a("uiOrientation");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        f0.e.d.a aVar = (f0.e.d.a) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f11235b, aVar.e());
        eVar2.a(f11236c, aVar.d());
        eVar2.a(f11237d, aVar.f());
        eVar2.a(f11238e, aVar.b());
        eVar2.a(f11239f, aVar.c());
        eVar2.a(f11240g, aVar.a());
        eVar2.c(f11241h, aVar.g());
    }
}
