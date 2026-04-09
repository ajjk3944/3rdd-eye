package W0;

import A2.C;
import V0.m;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import d1.C2264b;
import d1.InterfaceC2263a;
import f4.InterfaceFutureC2326a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class b implements a, InterfaceC2263a {

    /* renamed from: l, reason: collision with root package name */
    public static final String f3955l = m.h("Processor");

    /* renamed from: b, reason: collision with root package name */
    public final Context f3957b;

    /* renamed from: c, reason: collision with root package name */
    public final V0.b f3958c;

    /* renamed from: d, reason: collision with root package name */
    public final V2.e f3959d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f3960e;

    /* renamed from: h, reason: collision with root package name */
    public final List f3963h;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f3962g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f3961f = new HashMap();
    public final HashSet i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f3964j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f3956a = null;

    /* renamed from: k, reason: collision with root package name */
    public final Object f3965k = new Object();

    public b(Context context, V0.b bVar, V2.e eVar, WorkDatabase workDatabase, List list) {
        this.f3957b = context;
        this.f3958c = bVar;
        this.f3959d = eVar;
        this.f3960e = workDatabase;
        this.f3963h = list;
    }

    public static boolean b(String str, l lVar) {
        boolean zIsDone;
        if (lVar == null) {
            m.f().a(f3955l, A.f.l("WorkerWrapper could not be found for ", str), new Throwable[0]);
            return false;
        }
        lVar.f4001G = true;
        lVar.h();
        InterfaceFutureC2326a interfaceFutureC2326a = lVar.f4000F;
        if (interfaceFutureC2326a != null) {
            zIsDone = interfaceFutureC2326a.isDone();
            lVar.f4000F.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = lVar.f4007f;
        if (listenableWorker == null || zIsDone) {
            m.f().a(l.f3996H, "WorkSpec " + lVar.f4006e + " is already done. Not interrupting.", new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        m.f().a(f3955l, A.f.l("WorkerWrapper interrupted for ", str), new Throwable[0]);
        return true;
    }

    public final void a(a aVar) {
        synchronized (this.f3965k) {
            this.f3964j.add(aVar);
        }
    }

    @Override // W0.a
    public final void c(String str, boolean z6) {
        synchronized (this.f3965k) {
            try {
                this.f3962g.remove(str);
                int i = 0;
                m.f().a(f3955l, b.class.getSimpleName() + " " + str + " executed; reschedule = " + z6, new Throwable[0]);
                ArrayList arrayList = this.f3964j;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((a) obj).c(str, z6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean zContains;
        synchronized (this.f3965k) {
            zContains = this.i.contains(str);
        }
        return zContains;
    }

    public final boolean e(String str) {
        boolean z6;
        synchronized (this.f3965k) {
            try {
                z6 = this.f3962g.containsKey(str) || this.f3961f.containsKey(str);
            } finally {
            }
        }
        return z6;
    }

    public final void f(a aVar) {
        synchronized (this.f3965k) {
            this.f3964j.remove(aVar);
        }
    }

    public final void g(String str, V0.g gVar) {
        synchronized (this.f3965k) {
            try {
                m.f().g(f3955l, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                l lVar = (l) this.f3962g.remove(str);
                if (lVar != null) {
                    if (this.f3956a == null) {
                        PowerManager.WakeLock wakeLockA = f1.l.a(this.f3957b, "ProcessorForegroundLck");
                        this.f3956a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f3961f.put(str, lVar);
                    Intent intentD = C2264b.d(this.f3957b, str, gVar);
                    Context context = this.f3957b;
                    if (Build.VERSION.SDK_INT >= 26) {
                        H.a.j(context, intentD);
                    } else {
                        context.startService(intentD);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(String str, V2.e eVar) {
        synchronized (this.f3965k) {
            try {
                if (e(str)) {
                    m.f().a(f3955l, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.f3957b;
                V0.b bVar = this.f3958c;
                V2.e eVar2 = this.f3959d;
                WorkDatabase workDatabase = this.f3960e;
                V2.e eVar3 = new V2.e();
                Context applicationContext = context.getApplicationContext();
                List list = this.f3963h;
                if (eVar == null) {
                    eVar = eVar3;
                }
                l lVar = new l();
                lVar.f4009h = new V0.i();
                lVar.f3999E = new g1.k();
                lVar.f4000F = null;
                lVar.f4002a = applicationContext;
                lVar.f4008g = eVar2;
                lVar.f4010j = this;
                lVar.f4003b = str;
                lVar.f4004c = list;
                lVar.f4005d = eVar;
                lVar.f4007f = null;
                lVar.i = bVar;
                lVar.f4011k = workDatabase;
                lVar.f4012l = workDatabase.t();
                lVar.f4013m = workDatabase.o();
                lVar.f4014n = workDatabase.u();
                g1.k kVar = lVar.f3999E;
                C c6 = new C(6);
                c6.f149b = this;
                c6.f150c = str;
                c6.f151d = kVar;
                kVar.a(c6, (c3.i) this.f3959d.f3870d);
                this.f3962g.put(str, lVar);
                ((f1.j) this.f3959d.f3868b).execute(lVar);
                m.f().a(f3955l, AbstractC2763b.f(b.class.getSimpleName(), ": processing ", str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.f3965k) {
            try {
                if (this.f3961f.isEmpty()) {
                    Context context = this.f3957b;
                    String str = C2264b.f19713k;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f3957b.startService(intent);
                    } catch (Throwable th) {
                        m.f().e(f3955l, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f3956a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f3956a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean j(String str) {
        boolean zB;
        synchronized (this.f3965k) {
            m.f().a(f3955l, "Processor stopping foreground work " + str, new Throwable[0]);
            zB = b(str, (l) this.f3961f.remove(str));
        }
        return zB;
    }

    public final boolean k(String str) {
        boolean zB;
        synchronized (this.f3965k) {
            m.f().a(f3955l, "Processor stopping background work " + str, new Throwable[0]);
            zB = b(str, (l) this.f3962g.remove(str));
        }
        return zB;
    }
}
