package pf;

import android.os.Build;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c implements we.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f31773a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final we.c f31774b = we.c.a("packageName");

    /* renamed from: c, reason: collision with root package name */
    public static final we.c f31775c = we.c.a("versionName");

    /* renamed from: d, reason: collision with root package name */
    public static final we.c f31776d = we.c.a("appBuildVersion");

    /* renamed from: e, reason: collision with root package name */
    public static final we.c f31777e = we.c.a("deviceManufacturer");

    /* renamed from: f, reason: collision with root package name */
    public static final we.c f31778f = we.c.a("currentProcessDetails");
    public static final we.c g = we.c.a("appProcessDetails");

    @Override // we.a
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        we.e eVar = (we.e) obj2;
        eVar.e(f31774b, aVar.f31756a);
        eVar.e(f31775c, aVar.f31757b);
        eVar.e(f31776d, aVar.f31758c);
        eVar.e(f31777e, Build.MANUFACTURER);
        eVar.e(f31778f, aVar.f31759d);
        eVar.e(g, aVar.f31760e);
    }
}
