package u6;

import a0.x0;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements a7.a {

    /* renamed from: l, reason: collision with root package name */
    public static final String f35122l = t6.v.g("Processor");

    /* renamed from: b, reason: collision with root package name */
    public final Context f35124b;

    /* renamed from: c, reason: collision with root package name */
    public final t6.b f35125c;

    /* renamed from: d, reason: collision with root package name */
    public final x0 f35126d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f35127e;
    public final HashMap g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f35128f = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f35130i = new HashSet();
    public final ArrayList j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f35123a = null;

    /* renamed from: k, reason: collision with root package name */
    public final Object f35131k = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f35129h = new HashMap();

    public c(Context context, t6.b bVar, x0 x0Var, WorkDatabase workDatabase) {
        this.f35124b = context;
        this.f35125c = bVar;
        this.f35126d = x0Var;
        this.f35127e = workDatabase;
    }

    public static boolean e(String str, c0 c0Var, int i4) {
        String str2 = f35122l;
        if (c0Var == null) {
            t6.v.e().a(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        c0Var.f35143n.s(new u(i4));
        t6.v.e().a(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(a aVar) {
        synchronized (this.f35131k) {
            this.j.add(aVar);
        }
    }

    public final c0 b(String str) {
        c0 c0Var = (c0) this.f35128f.remove(str);
        boolean z3 = c0Var != null;
        if (!z3) {
            c0Var = (c0) this.g.remove(str);
        }
        this.f35129h.remove(str);
        if (z3) {
            synchronized (this.f35131k) {
                try {
                    if (this.f35128f.isEmpty()) {
                        Context context = this.f35124b;
                        String str2 = a7.b.f208k;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f35124b.startService(intent);
                        } catch (Throwable th2) {
                            t6.v.e().d(f35122l, "Unable to stop foreground service", th2);
                        }
                        PowerManager.WakeLock wakeLock = this.f35123a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f35123a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return c0Var;
    }

    public final b7.r c(String str) {
        synchronized (this.f35131k) {
            try {
                c0 c0VarD = d(str);
                if (c0VarD == null) {
                    return null;
                }
                return c0VarD.f35132a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final c0 d(String str) {
        c0 c0Var = (c0) this.f35128f.get(str);
        return c0Var == null ? (c0) this.g.get(str) : c0Var;
    }

    public final boolean f(String str) {
        boolean z3;
        synchronized (this.f35131k) {
            z3 = d(str) != null;
        }
        return z3;
    }

    public final void g(a aVar) {
        synchronized (this.f35131k) {
            this.j.remove(aVar);
        }
    }

    public final void h(b7.l lVar) {
        ((d7.b) this.f35126d.f147d).execute(new k1.b(24, this, lVar));
    }

    public final boolean i(h hVar, int i4) {
        String str = hVar.f35152a.f2007a;
        synchronized (this.f35131k) {
            try {
                if (this.f35128f.get(str) == null) {
                    Set set = (Set) this.f35129h.get(str);
                    if (set != null && set.contains(hVar)) {
                        return e(str, b(str), i4);
                    }
                    return false;
                }
                t6.v.e().a(f35122l, "Ignored stopWork. WorkerWrapper " + str + " is in foreground");
                return false;
            } finally {
            }
        }
    }
}
