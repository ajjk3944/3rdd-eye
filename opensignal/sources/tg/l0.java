package tg;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f22817a = new l0();

    /* renamed from: b, reason: collision with root package name */
    public static final z7.j f22818b;

    static {
        zf.c cVar = new zf.c();
        cVar.a(k0.class, g.f22778a);
        cVar.a(s0.class, h.f22783a);
        cVar.a(k.class, e.f22763a);
        cVar.a(b.class, d.f22752a);
        cVar.a(a.class, c.f22741a);
        cVar.a(c0.class, f.f22768a);
        cVar.f27374d = true;
        f22818b = new z7.j(5, cVar);
    }

    public static b a(se.f fVar) throws PackageManager.NameNotFoundException {
        fVar.a();
        Context context = fVar.f22007a;
        br.l.d(context, "getApplicationContext(...)");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        fVar.a();
        String str = fVar.f22009c.f22022b;
        br.l.d(str, "getApplicationId(...)");
        br.l.d(Build.MODEL, "MODEL");
        br.l.d(Build.VERSION.RELEASE, "RELEASE");
        v vVar = v.LOG_ENVIRONMENT_PROD;
        br.l.b(packageName);
        String str2 = packageInfo.versionName;
        String str3 = str2 == null ? strValueOf : str2;
        br.l.d(Build.MANUFACTURER, "MANUFACTURER");
        fVar.a();
        c0 c0VarB = r.b(context);
        fVar.a();
        return new b(str, vVar, new a(packageName, str3, strValueOf, c0VarB, r.a(context)));
    }
}
