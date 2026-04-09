package Q4;

import Q4.f0;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: Q4.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1510s implements Z4.d<f0.e.d.c> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1510s f11278a = new C1510s();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11279b = Z4.c.a("batteryLevel");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f11280c = Z4.c.a("batteryVelocity");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f11281d = Z4.c.a("proximityOn");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f11282e = Z4.c.a("orientation");

    /* renamed from: f, reason: collision with root package name */
    public static final Z4.c f11283f = Z4.c.a("ramUsed");

    /* renamed from: g, reason: collision with root package name */
    public static final Z4.c f11284g = Z4.c.a("diskUsed");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        f0.e.d.c cVar = (f0.e.d.c) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f11279b, cVar.a());
        eVar2.c(f11280c, cVar.b());
        eVar2.e(f11281d, cVar.f());
        eVar2.c(f11282e, cVar.d());
        eVar2.b(f11283f, cVar.e());
        eVar2.b(f11284g, cVar.c());
    }
}
