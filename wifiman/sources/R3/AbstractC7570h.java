package r3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.snmp4j.util.SnmpConfigurator;
import s3.AbstractC7901p;

/* renamed from: r3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7570h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f60088a = 12451000;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f60090c = false;

    /* renamed from: d, reason: collision with root package name */
    static boolean f60091d = false;

    /* renamed from: b, reason: collision with root package name */
    static final AtomicBoolean f60089b = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f60092e = new AtomicBoolean();

    public static void a(Context context, int i10) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int iH = C7568f.f().h(context, i10);
        if (iH != 0) {
            Intent intentB = C7568f.f().b(context, iH, SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID);
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + iH);
            if (intentB != null) {
                throw new GooglePlayServicesRepairableException(iH, "Google Play Services not available", intentB);
            }
            throw new GooglePlayServicesNotAvailableException(iH);
        }
    }

    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public static String c(int i10) {
        return C7564b.j(i10);
    }

    public static Context d(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources e(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean f(Context context) {
        try {
            if (!f60091d) {
                try {
                    PackageInfo packageInfoD = w3.c.a(context).d("com.google.android.gms", 64);
                    C7571i.a(context);
                    if (packageInfoD == null || C7571i.e(packageInfoD, false) || !C7571i.e(packageInfoD, true)) {
                        f60090c = false;
                    } else {
                        f60090c = true;
                    }
                    f60091d = true;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                    f60091d = true;
                }
            }
            return f60090c || !com.google.android.gms.common.util.h.b();
        } catch (Throwable th2) {
            f60091d = true;
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int g(android.content.Context r10, int r11) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.AbstractC7570h.g(android.content.Context, int):int");
    }

    public static boolean h(Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return l(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean i(Context context) {
        Object systemService = context.getSystemService("user");
        AbstractC7901p.l(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    public static boolean j(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    public static boolean k(Context context, int i10, String str) {
        return com.google.android.gms.common.util.p.b(context, i10, str);
    }

    static boolean l(Context context, String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !i(context);
    }
}
