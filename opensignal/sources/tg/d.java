package tg;

import android.os.Build;

/* loaded from: classes.dex */
public final class d implements xf.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f22752a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final xf.c f22753b = xf.c.a("appId");

    /* renamed from: c, reason: collision with root package name */
    public static final xf.c f22754c = xf.c.a("deviceModel");

    /* renamed from: d, reason: collision with root package name */
    public static final xf.c f22755d = xf.c.a("sessionSdkVersion");

    /* renamed from: e, reason: collision with root package name */
    public static final xf.c f22756e = xf.c.a("osVersion");

    /* renamed from: f, reason: collision with root package name */
    public static final xf.c f22757f = xf.c.a("logEnvironment");

    /* renamed from: g, reason: collision with root package name */
    public static final xf.c f22758g = xf.c.a("androidAppInfo");

    @Override // xf.a
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        xf.e eVar = (xf.e) obj2;
        eVar.e(f22753b, bVar.f22734a);
        eVar.e(f22754c, Build.MODEL);
        eVar.e(f22755d, "3.0.3");
        eVar.e(f22756e, Build.VERSION.RELEASE);
        eVar.e(f22757f, bVar.f22735b);
        eVar.e(f22758g, bVar.f22736c);
    }
}
