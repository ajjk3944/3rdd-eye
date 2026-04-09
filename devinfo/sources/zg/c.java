package zg;

import ah.d;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import b5.o0;
import b5.z;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.utilities.f;
import i.g;
import lf.e;
import wi.h;
import wi.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f38279a = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f38280b = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f38281c = {"android.permission.BLUETOOTH_CONNECT"};

    public static boolean b() {
        f fVar = f.f21256b;
        return f.f21257c.getBoolean("user_granted_all_apps_permission", false);
    }

    public static boolean c() {
        if (h.f36762h) {
            return i.a(DeviceInfoApp.f21145f, "android.permission.POST_NOTIFICATIONS");
        }
        if (h.f36756a) {
            return ((NotificationManager) DeviceInfoApp.f21145f.getSystemService(NotificationManager.class)).areNotificationsEnabled();
        }
        return true;
    }

    public static boolean d(Context context) {
        return h.f36761f ? Environment.isExternalStorageManager() : i.b(context, f38279a);
    }

    public static void e() {
        f fVar = f.f21256b;
        f.k("already_request_storage_permission", true);
    }

    public static b f(g gVar, f.c cVar, f.b bVar) {
        if (h.f36762h) {
            return new com.applovin.impl.sdk.ad.f(26, gVar, cVar.h(new o0(4), bVar));
        }
        if (h.f36756a) {
            return new e(22, gVar);
        }
        return null;
    }

    public static b g(Context context, f.c cVar, f.b bVar) {
        if (h.f36761f) {
            return new d(context, new yk.c(2, cVar.h(new o0(5), new e(20, bVar)), context), bVar, 23);
        }
        return new e(21, cVar.h(new o0(4), bVar));
    }

    public static void h(g gVar) {
        try {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            if (h.f36757b) {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", "com.liuzh.deviceinfo");
            } else {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("app_package", "com.liuzh.deviceinfo");
                intent.putExtra("app_uid", gVar.getApplicationInfo().uid);
            }
            gVar.startActivity(intent);
        } catch (Throwable unused) {
            nh.a.k(gVar, "com.liuzh.deviceinfo", true);
        }
    }

    public static boolean i(z zVar) {
        if (h.f36761f) {
            return true;
        }
        f fVar = f.f21256b;
        if (f.f21257c.getBoolean("already_request_storage_permission", false)) {
            return i.d(zVar, f38279a);
        }
        return true;
    }
}
