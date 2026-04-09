package Q4;

import Q4.f0;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: Q4.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1513v implements Z4.d<f0.e.d.AbstractC0145e> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1513v f11294a = new C1513v();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11295b = Z4.c.a("rolloutVariant");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f11296c = Z4.c.a("parameterKey");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f11297d = Z4.c.a("parameterValue");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f11298e = Z4.c.a("templateVersion");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        f0.e.d.AbstractC0145e abstractC0145e = (f0.e.d.AbstractC0145e) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f11295b, abstractC0145e.c());
        eVar2.a(f11296c, abstractC0145e.a());
        eVar2.a(f11297d, abstractC0145e.b());
        eVar2.b(f11298e, abstractC0145e.d());
    }
}
