package Q4;

import Q4.f0;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: Q4.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1502j implements Z4.d<f0.e> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1502j f11222a = new C1502j();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11223b = Z4.c.a("generator");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f11224c = Z4.c.a("identifier");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f11225d = Z4.c.a("appQualitySessionId");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f11226e = Z4.c.a("startedAt");

    /* renamed from: f, reason: collision with root package name */
    public static final Z4.c f11227f = Z4.c.a("endedAt");

    /* renamed from: g, reason: collision with root package name */
    public static final Z4.c f11228g = Z4.c.a("crashed");

    /* renamed from: h, reason: collision with root package name */
    public static final Z4.c f11229h = Z4.c.a("app");
    public static final Z4.c i = Z4.c.a("user");

    /* renamed from: j, reason: collision with root package name */
    public static final Z4.c f11230j = Z4.c.a("os");

    /* renamed from: k, reason: collision with root package name */
    public static final Z4.c f11231k = Z4.c.a("device");

    /* renamed from: l, reason: collision with root package name */
    public static final Z4.c f11232l = Z4.c.a("events");

    /* renamed from: m, reason: collision with root package name */
    public static final Z4.c f11233m = Z4.c.a("generatorType");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        f0.e eVar2 = (f0.e) obj;
        Z4.e eVar3 = eVar;
        eVar3.a(f11223b, eVar2.f());
        eVar3.a(f11224c, eVar2.h().getBytes(f0.f11202a));
        eVar3.a(f11225d, eVar2.b());
        eVar3.b(f11226e, eVar2.j());
        eVar3.a(f11227f, eVar2.d());
        eVar3.e(f11228g, eVar2.l());
        eVar3.a(f11229h, eVar2.a());
        eVar3.a(i, eVar2.k());
        eVar3.a(f11230j, eVar2.i());
        eVar3.a(f11231k, eVar2.c());
        eVar3.a(f11232l, eVar2.e());
        eVar3.c(f11233m, eVar2.g());
    }
}
