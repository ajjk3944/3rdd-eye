package Q4;

import Q4.f0;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: Q4.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1506n implements Z4.d<f0.e.d.a.b.AbstractC0139b> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1506n f11253a = new C1506n();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11254b = Z4.c.a("type");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f11255c = Z4.c.a("reason");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f11256d = Z4.c.a("frames");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f11257e = Z4.c.a("causedBy");

    /* renamed from: f, reason: collision with root package name */
    public static final Z4.c f11258f = Z4.c.a("overflowCount");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        f0.e.d.a.b.AbstractC0139b abstractC0139b = (f0.e.d.a.b.AbstractC0139b) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f11254b, abstractC0139b.e());
        eVar2.a(f11255c, abstractC0139b.d());
        eVar2.a(f11256d, abstractC0139b.b());
        eVar2.a(f11257e, abstractC0139b.a());
        eVar2.c(f11258f, abstractC0139b.c());
    }
}
