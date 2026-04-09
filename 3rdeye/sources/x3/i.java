package x3;

import java.io.IOException;

/* compiled from: AutoBatchedLogRequestEncoder.java */
/* loaded from: classes.dex */
public final class i implements Z4.d<C> {

    /* renamed from: a, reason: collision with root package name */
    public static final i f47693a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f47694b = Z4.c.a("eventTimeMs");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f47695c = Z4.c.a("eventCode");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f47696d = Z4.c.a("complianceData");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f47697e = Z4.c.a("eventUptimeMs");

    /* renamed from: f, reason: collision with root package name */
    public static final Z4.c f47698f = Z4.c.a("sourceExtension");

    /* renamed from: g, reason: collision with root package name */
    public static final Z4.c f47699g = Z4.c.a("sourceExtensionJsonProto3");

    /* renamed from: h, reason: collision with root package name */
    public static final Z4.c f47700h = Z4.c.a("timezoneOffsetSeconds");
    public static final Z4.c i = Z4.c.a("networkConnectionInfo");

    /* renamed from: j, reason: collision with root package name */
    public static final Z4.c f47701j = Z4.c.a("experimentIds");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        C c10 = (C) obj;
        Z4.e eVar2 = eVar;
        eVar2.b(f47694b, c10.c());
        eVar2.a(f47695c, c10.b());
        eVar2.a(f47696d, c10.a());
        eVar2.b(f47697e, c10.d());
        eVar2.a(f47698f, c10.g());
        eVar2.a(f47699g, c10.h());
        eVar2.b(f47700h, c10.i());
        eVar2.a(i, c10.f());
        eVar2.a(f47701j, c10.e());
    }
}
