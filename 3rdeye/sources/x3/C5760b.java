package x3;

import com.applovin.sdk.AppLovinEventTypes;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;

/* compiled from: AutoBatchedLogRequestEncoder.java */
/* renamed from: x3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5760b implements Z4.d<AbstractC5759a> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5760b f47666a = new C5760b();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f47667b = Z4.c.a("sdkVersion");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f47668c = Z4.c.a(CommonUrlParts.MODEL);

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f47669d = Z4.c.a("hardware");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f47670e = Z4.c.a("device");

    /* renamed from: f, reason: collision with root package name */
    public static final Z4.c f47671f = Z4.c.a(AppLovinEventTypes.USER_VIEWED_PRODUCT);

    /* renamed from: g, reason: collision with root package name */
    public static final Z4.c f47672g = Z4.c.a("osBuild");

    /* renamed from: h, reason: collision with root package name */
    public static final Z4.c f47673h = Z4.c.a(CommonUrlParts.MANUFACTURER);
    public static final Z4.c i = Z4.c.a("fingerprint");

    /* renamed from: j, reason: collision with root package name */
    public static final Z4.c f47674j = Z4.c.a(CommonUrlParts.LOCALE);

    /* renamed from: k, reason: collision with root package name */
    public static final Z4.c f47675k = Z4.c.a("country");

    /* renamed from: l, reason: collision with root package name */
    public static final Z4.c f47676l = Z4.c.a("mccMnc");

    /* renamed from: m, reason: collision with root package name */
    public static final Z4.c f47677m = Z4.c.a("applicationBuild");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        AbstractC5759a abstractC5759a = (AbstractC5759a) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f47667b, abstractC5759a.l());
        eVar2.a(f47668c, abstractC5759a.i());
        eVar2.a(f47669d, abstractC5759a.e());
        eVar2.a(f47670e, abstractC5759a.c());
        eVar2.a(f47671f, abstractC5759a.k());
        eVar2.a(f47672g, abstractC5759a.j());
        eVar2.a(f47673h, abstractC5759a.g());
        eVar2.a(i, abstractC5759a.d());
        eVar2.a(f47674j, abstractC5759a.f());
        eVar2.a(f47675k, abstractC5759a.b());
        eVar2.a(f47676l, abstractC5759a.h());
        eVar2.a(f47677m, abstractC5759a.a());
    }
}
