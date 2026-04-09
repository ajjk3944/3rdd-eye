package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class om0 implements gt, aw {
    public static final String q = h80.f("Processor");
    public final Context g;
    public final ru0 h;
    public final xb4 i;
    public final WorkDatabase j;
    public final List m;
    public final HashMap l = new HashMap();
    public final HashMap k = new HashMap();
    public final HashSet n = new HashSet();
    public final ArrayList o = new ArrayList();
    public PowerManager.WakeLock f = null;
    public final Object p = new Object();

    public om0(Context context, ru0 ru0Var, xb4 xb4Var, WorkDatabase workDatabase, List list) {
        this.g = context;
        this.h = ru0Var;
        this.i = xb4Var;
        this.j = workDatabase;
        this.m = list;
    }

    public static boolean c(String str, wa1 wa1Var) {
        boolean zIsDone;
        if (wa1Var == null) {
            h80.d().a(new Throwable[0]);
            return false;
        }
        wa1Var.x = true;
        wa1Var.h();
        n70 n70Var = wa1Var.w;
        if (n70Var != null) {
            zIsDone = n70Var.isDone();
            wa1Var.w.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = wa1Var.k;
        if (listenableWorker == null || zIsDone) {
            Objects.toString(wa1Var.j);
            h80 h80VarD = h80.d();
            String str2 = wa1.y;
            h80VarD.a(new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        h80.d().a(new Throwable[0]);
        return true;
    }

    @Override // defpackage.gt
    public final void a(String str, boolean z) {
        synchronized (this.p) {
            try {
                this.l.remove(str);
                int i = 0;
                h80.d().a(new Throwable[0]);
                ArrayList arrayList = this.o;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((gt) obj).a(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(gt gtVar) {
        synchronized (this.p) {
            this.o.add(gtVar);
        }
    }

    public final boolean d(String str) {
        boolean z;
        synchronized (this.p) {
            try {
                z = this.l.containsKey(str) || this.k.containsKey(str);
            } finally {
            }
        }
        return z;
    }

    public final void e(gt gtVar) {
        synchronized (this.p) {
            this.o.remove(gtVar);
        }
    }

    public final void f(String str, yv yvVar) {
        synchronized (this.p) {
            try {
                h80.d().e(new Throwable[0]);
                wa1 wa1Var = (wa1) this.l.remove(str);
                if (wa1Var != null) {
                    if (this.f == null) {
                        PowerManager.WakeLock wakeLockA = y71.a(this.g, "ProcessorForegroundLck");
                        this.f = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.k.put(str, wa1Var);
                    lj.b(this.g, rz0.d(this.g, str, yvVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g(String str, t83 t83Var) {
        synchronized (this.p) {
            try {
                if (d(str)) {
                    h80.d().a(new Throwable[0]);
                    return false;
                }
                Context context = this.g;
                ru0 ru0Var = this.h;
                xb4 xb4Var = this.i;
                WorkDatabase workDatabase = this.j;
                t83 t83Var2 = new t83(10);
                Context applicationContext = context.getApplicationContext();
                List list = this.m;
                if (t83Var == null) {
                    t83Var = t83Var2;
                }
                wa1 wa1Var = new wa1();
                wa1Var.m = new o70();
                ou0 ou0Var = new ou0();
                wa1Var.v = ou0Var;
                wa1Var.w = null;
                wa1Var.f = applicationContext;
                wa1Var.l = xb4Var;
                wa1Var.o = this;
                wa1Var.g = str;
                wa1Var.h = list;
                wa1Var.i = t83Var;
                wa1Var.k = null;
                wa1Var.n = ru0Var;
                wa1Var.p = workDatabase;
                wa1Var.q = workDatabase.n();
                wa1Var.r = workDatabase.i();
                wa1Var.s = workDatabase.o();
                gi giVar = new gi(2);
                giVar.g = this;
                giVar.h = str;
                giVar.i = ou0Var;
                ou0Var.c(giVar, (ia1) this.i.i);
                this.l.put(str, wa1Var);
                ((lu0) this.i.g).execute(wa1Var);
                h80.d().a(new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.p) {
            try {
                if (this.k.isEmpty()) {
                    Context context = this.g;
                    String str = rz0.o;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.g.startService(intent);
                    } catch (Throwable th) {
                        h80.d().b(q, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
