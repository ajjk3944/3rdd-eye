package Q4;

import Q4.f0;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* loaded from: classes2.dex */
public final class r implements Z4.d<f0.e.d.a.c> {

    /* renamed from: a, reason: collision with root package name */
    public static final r f11273a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11274b = Z4.c.a("processName");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f11275c = Z4.c.a("pid");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f11276d = Z4.c.a("importance");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f11277e = Z4.c.a("defaultProcess");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        f0.e.d.a.c cVar = (f0.e.d.a.c) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f11274b, cVar.c());
        eVar2.c(f11275c, cVar.b());
        eVar2.c(f11276d, cVar.a());
        eVar2.e(f11277e, cVar.d());
    }
}
