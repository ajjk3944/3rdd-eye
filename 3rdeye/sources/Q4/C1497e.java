package Q4;

import Q4.f0;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: Q4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1497e implements Z4.d<f0.d> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1497e f11193a = new C1497e();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11194b = Z4.c.a("files");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f11195c = Z4.c.a("orgId");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        f0.d dVar = (f0.d) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f11194b, dVar.a());
        eVar2.a(f11195c, dVar.b());
    }
}
