package Q4;

import Q4.f0;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: Q4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1493a implements Z4.d<f0.a.AbstractC0135a> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1493a f11147a = new C1493a();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11148b = Z4.c.a("arch");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f11149c = Z4.c.a("libraryName");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f11150d = Z4.c.a("buildId");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        f0.a.AbstractC0135a abstractC0135a = (f0.a.AbstractC0135a) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f11148b, abstractC0135a.a());
        eVar2.a(f11149c, abstractC0135a.c());
        eVar2.a(f11150d, abstractC0135a.b());
    }
}
