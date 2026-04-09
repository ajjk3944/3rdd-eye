package tg;

import android.os.Build;

/* loaded from: classes.dex */
public final class c implements xf.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f22741a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final xf.c f22742b = xf.c.a("packageName");

    /* renamed from: c, reason: collision with root package name */
    public static final xf.c f22743c = xf.c.a("versionName");

    /* renamed from: d, reason: collision with root package name */
    public static final xf.c f22744d = xf.c.a("appBuildVersion");

    /* renamed from: e, reason: collision with root package name */
    public static final xf.c f22745e = xf.c.a("deviceManufacturer");

    /* renamed from: f, reason: collision with root package name */
    public static final xf.c f22746f = xf.c.a("currentProcessDetails");

    /* renamed from: g, reason: collision with root package name */
    public static final xf.c f22747g = xf.c.a("appProcessDetails");

    @Override // xf.a
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        xf.e eVar = (xf.e) obj2;
        eVar.e(f22742b, aVar.f22714a);
        eVar.e(f22743c, aVar.f22715b);
        eVar.e(f22744d, aVar.f22716c);
        eVar.e(f22745e, Build.MANUFACTURER);
        eVar.e(f22746f, aVar.f22717d);
        eVar.e(f22747g, aVar.f22718e);
    }
}
