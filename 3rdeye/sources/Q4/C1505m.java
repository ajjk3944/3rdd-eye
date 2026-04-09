package Q4;

import Q4.f0;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: Q4.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1505m implements Z4.d<f0.e.d.a.b> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1505m f11247a = new C1505m();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11248b = Z4.c.a("threads");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f11249c = Z4.c.a("exception");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f11250d = Z4.c.a("appExitInfo");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f11251e = Z4.c.a("signal");

    /* renamed from: f, reason: collision with root package name */
    public static final Z4.c f11252f = Z4.c.a("binaries");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        f0.e.d.a.b bVar = (f0.e.d.a.b) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f11248b, bVar.e());
        eVar2.a(f11249c, bVar.c());
        eVar2.a(f11250d, bVar.a());
        eVar2.a(f11251e, bVar.d());
        eVar2.a(f11252f, bVar.b());
    }
}
