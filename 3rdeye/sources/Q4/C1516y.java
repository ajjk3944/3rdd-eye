package Q4;

import Q4.f0;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: Q4.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1516y implements Z4.d<f0.e.AbstractC0146e> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1516y f11304a = new C1516y();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11305b = Z4.c.a("platform");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f11306c = Z4.c.a("version");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f11307d = Z4.c.a("buildVersion");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f11308e = Z4.c.a("jailbroken");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        f0.e.AbstractC0146e abstractC0146e = (f0.e.AbstractC0146e) obj;
        Z4.e eVar2 = eVar;
        eVar2.c(f11305b, abstractC0146e.b());
        eVar2.a(f11306c, abstractC0146e.c());
        eVar2.a(f11307d, abstractC0146e.a());
        eVar2.e(f11308e, abstractC0146e.d());
    }
}
