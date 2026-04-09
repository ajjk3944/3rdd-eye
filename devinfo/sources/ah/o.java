package ah;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.pro.account.mode.User;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o implements si.b {

    /* renamed from: d, reason: collision with root package name */
    public static final o f400d = new o();

    /* renamed from: a, reason: collision with root package name */
    public si.b f401a = new ja.c();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f402b = DeviceInfoApp.f21145f.getSharedPreferences("com.liuzh.deviceinfo_pro_pref", 0);

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f403c = new CopyOnWriteArrayList();

    public final void a() {
        this.f402b.edit().putBoolean("is_pro_user", true).apply();
        g(c());
    }

    public final void b(n nVar) {
        synchronized (this.f403c) {
            try {
                if (!this.f403c.contains(nVar)) {
                    this.f403c.add(nVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c() {
        boolean z3 = mg.d.f29372a;
        User userB = bh.c.b();
        if (userB == null || !userB.getVip().getAvailable()) {
            return this.f402b.getBoolean("is_pro_user", false);
        }
        return true;
    }

    @Override // si.b
    public final void d(Context context, si.f fVar, int i4, si.e eVar) {
        this.f401a.d(context, fVar, i4, eVar);
    }

    @Override // si.b
    public final void e(Context context, si.i iVar) {
        this.f401a.e(context, iVar);
    }

    @Override // si.b
    public final void f(Context context, Intent intent, yb.e eVar) {
        this.f401a.f(context, intent, eVar);
    }

    public final void g(boolean z3) {
        synchronized (this.f403c) {
            bi.d.b(new m(0, this, z3));
        }
    }

    public final void h(n nVar) {
        synchronized (this.f403c) {
            this.f403c.remove(nVar);
        }
    }

    @Override // si.b
    public final void p(Context context, String str, yb.e eVar) {
        this.f401a.p(context, str, eVar);
    }

    @Override // si.b
    public final void q(Intent intent, o7.c cVar) {
        this.f401a.q(intent, cVar);
    }

    @Override // si.b
    public final int r() {
        return this.f401a.r();
    }

    @Override // si.b
    public final void s(Context context, int i4, List list, si.h hVar) {
        this.f401a.s(context, i4, list, hVar);
    }

    @Override // si.b
    public final void t(Context context, int i4, si.g gVar) {
        this.f401a.t(context, i4, new yb.i(4, this, gVar));
    }
}
