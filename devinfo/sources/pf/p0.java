package pf;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f31881a = new p0();

    /* renamed from: b, reason: collision with root package name */
    public static final nm.d0 f31882b;

    static {
        ye.d dVar = new ye.d();
        dVar.a(o0.class, g.f31821a);
        dVar.a(w0.class, h.f31826a);
        dVar.a(k.class, e.f31802a);
        dVar.a(b.class, d.f31789a);
        dVar.a(a.class, c.f31773a);
        dVar.a(f0.class, f.f31809a);
        dVar.f37580d = true;
        f31882b = new nm.d0(22, dVar);
    }

    public static b a(wd.f fVar) throws PackageManager.NameNotFoundException {
        fVar.a();
        Context context = fVar.f36614a;
        nk.k.d(context, "getApplicationContext(...)");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        fVar.a();
        String str = fVar.f36616c.f36628b;
        nk.k.d(str, "getApplicationId(...)");
        nk.k.d(Build.MODEL, "MODEL");
        nk.k.d(Build.VERSION.RELEASE, "RELEASE");
        nk.k.b(packageName);
        String str2 = packageInfo.versionName;
        String str3 = str2 == null ? strValueOf : str2;
        nk.k.d(Build.MANUFACTURER, "MANUFACTURER");
        fVar.a();
        f0 f0VarB = g0.b(context);
        fVar.a();
        return new b(str, new a(packageName, str3, strValueOf, f0VarB, g0.a(context)));
    }
}
