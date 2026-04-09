package Q4;

import Q4.f0;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: Q4.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1511t implements Z4.d<f0.e.d> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1511t f11285a = new C1511t();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11286b = Z4.c.a("timestamp");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f11287c = Z4.c.a("type");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f11288d = Z4.c.a("app");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f11289e = Z4.c.a("device");

    /* renamed from: f, reason: collision with root package name */
    public static final Z4.c f11290f = Z4.c.a("log");

    /* renamed from: g, reason: collision with root package name */
    public static final Z4.c f11291g = Z4.c.a("rollouts");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        f0.e.d dVar = (f0.e.d) obj;
        Z4.e eVar2 = eVar;
        eVar2.b(f11286b, dVar.e());
        eVar2.a(f11287c, dVar.f());
        eVar2.a(f11288d, dVar.a());
        eVar2.a(f11289e, dVar.b());
        eVar2.a(f11290f, dVar.c());
        eVar2.a(f11291g, dVar.d());
    }
}
