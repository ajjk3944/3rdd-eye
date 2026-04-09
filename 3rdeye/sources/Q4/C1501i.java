package Q4;

import Q4.f0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: Q4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1501i implements Z4.d<f0.e.c> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1501i f11213a = new C1501i();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11214b = Z4.c.a("arch");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f11215c = Z4.c.a(CommonUrlParts.MODEL);

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f11216d = Z4.c.a("cores");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f11217e = Z4.c.a("ram");

    /* renamed from: f, reason: collision with root package name */
    public static final Z4.c f11218f = Z4.c.a("diskSpace");

    /* renamed from: g, reason: collision with root package name */
    public static final Z4.c f11219g = Z4.c.a("simulator");

    /* renamed from: h, reason: collision with root package name */
    public static final Z4.c f11220h = Z4.c.a("state");
    public static final Z4.c i = Z4.c.a(CommonUrlParts.MANUFACTURER);

    /* renamed from: j, reason: collision with root package name */
    public static final Z4.c f11221j = Z4.c.a("modelClass");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        f0.e.c cVar = (f0.e.c) obj;
        Z4.e eVar2 = eVar;
        eVar2.c(f11214b, cVar.a());
        eVar2.a(f11215c, cVar.e());
        eVar2.c(f11216d, cVar.b());
        eVar2.b(f11217e, cVar.g());
        eVar2.b(f11218f, cVar.c());
        eVar2.e(f11219g, cVar.i());
        eVar2.c(f11220h, cVar.h());
        eVar2.a(i, cVar.d());
        eVar2.a(f11221j, cVar.f());
    }
}
