package zb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import io.sentry.android.core.e0;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f26820b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f26821c = false;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f26823e = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f26819a = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f26822d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f26821c) {
                try {
                    PackageInfo packageInfoC = ic.c.a(context).c(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
                    g.a(context);
                    if (packageInfoC == null || g.e(packageInfoC, false) || !g.e(packageInfoC, true)) {
                        f26820b = false;
                    } else {
                        f26820b = true;
                    }
                    f26821c = true;
                } catch (PackageManager.NameNotFoundException e4) {
                    e0.q("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e4);
                    f26821c = true;
                }
            }
            return f26820b || !"user".equals(Build.TYPE);
        } catch (Throwable th2) {
            f26821c = true;
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zb.f.b(android.content.Context, int):int");
    }

    public static boolean c(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
