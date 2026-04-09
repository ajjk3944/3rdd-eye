package pf;

import android.os.Build;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d implements we.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f31789a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final we.c f31790b = we.c.a("appId");

    /* renamed from: c, reason: collision with root package name */
    public static final we.c f31791c = we.c.a("deviceModel");

    /* renamed from: d, reason: collision with root package name */
    public static final we.c f31792d = we.c.a("sessionSdkVersion");

    /* renamed from: e, reason: collision with root package name */
    public static final we.c f31793e = we.c.a("osVersion");

    /* renamed from: f, reason: collision with root package name */
    public static final we.c f31794f = we.c.a("logEnvironment");
    public static final we.c g = we.c.a("androidAppInfo");

    @Override // we.a
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        we.e eVar = (we.e) obj2;
        eVar.e(f31790b, bVar.f31764a);
        eVar.e(f31791c, Build.MODEL);
        eVar.e(f31792d, "3.0.3");
        eVar.e(f31793e, Build.VERSION.RELEASE);
        eVar.e(f31794f, y.LOG_ENVIRONMENT_PROD);
        eVar.e(g, bVar.f31765b);
    }
}
