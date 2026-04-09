package bh;

import android.content.SharedPreferences;
import androidx.lifecycle.o0;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.pro.account.mode.User;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2188a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final SharedPreferences f2189b = DeviceInfoApp.f21145f.getSharedPreferences("com.liuzh.deviceinfo_account", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f2190c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.gson.j f2191d = new com.google.gson.j();

    public static final String a() {
        return f2189b.getString("ltoken", null);
    }

    public static final User b() {
        String string = f2189b.getString("user_info", null);
        if (string == null || vk.i.H0(string)) {
            return null;
        }
        com.google.gson.j jVar = f2191d;
        jVar.getClass();
        return (User) jVar.c(string, new xf.a(User.class));
    }

    public static boolean c() {
        String string = f2189b.getString("ltoken", null);
        return !(string == null || vk.i.H0(string));
    }

    public static final synchronized void d(a aVar) {
        nk.k.e(aVar, "l");
        f2190c.add(aVar);
    }

    public static final synchronized void g(a aVar) {
        nk.k.e(aVar, "l");
        f2190c.remove(aVar);
    }

    public final void e(User user) {
        nk.k.e(user, "user");
        if (!c()) {
            throw new RuntimeException("not logged in but call-saveUserInfo");
        }
        f2189b.edit().putString("user_info", f2191d.g(user)).apply();
        if (user.getVip().getAvailable()) {
            ah.o oVar = ah.o.f400d;
            oVar.g(oVar.c());
        } else {
            ah.o oVar2 = ah.o.f400d;
            oVar2.g(oVar2.c());
        }
        synchronized (this) {
            bi.d.b(new o0(5, user));
        }
    }

    public final void f() {
        f2189b.edit().remove("user_info").remove("ltoken").apply();
        ah.o oVar = ah.o.f400d;
        oVar.g(oVar.c());
        synchronized (this) {
            bi.d.b(new bg.a(1));
        }
        oVar.t(DeviceInfoApp.f21145f, 1, new ed.f(6));
    }
}
