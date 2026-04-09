package Q4;

import Q4.f0;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: Q4.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1514w implements Z4.d<f0.e.d.AbstractC0145e.b> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1514w f11299a = new C1514w();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11300b = Z4.c.a("rolloutId");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f11301c = Z4.c.a("variantId");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        f0.e.d.AbstractC0145e.b bVar = (f0.e.d.AbstractC0145e.b) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f11300b, bVar.a());
        eVar2.a(f11301c, bVar.b());
    }
}
