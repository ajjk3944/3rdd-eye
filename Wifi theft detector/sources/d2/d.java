package d2;

import android.content.Context;
import android.os.PowerManager;
import androidx.core.content.ContextCompat;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import d2.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import m2.n;

/* loaded from: classes.dex */
public class d implements b, k2.a {

    /* renamed from: l, reason: collision with root package name */
    public static final String f20662l = androidx.work.k.f("Processor");

    /* renamed from: b, reason: collision with root package name */
    public Context f20664b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.work.a f20665c;

    /* renamed from: d, reason: collision with root package name */
    public o2.a f20666d;

    /* renamed from: e, reason: collision with root package name */
    public WorkDatabase f20667e;

    /* renamed from: h, reason: collision with root package name */
    public List f20670h;

    /* renamed from: g, reason: collision with root package name */
    public Map f20669g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public Map f20668f = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public Set f20671i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final List f20672j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f20663a = null;

    /* renamed from: k, reason: collision with root package name */
    public final Object f20673k = new Object();

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public b f20674a;

        /* renamed from: b, reason: collision with root package name */
        public String f20675b;

        /* renamed from: c, reason: collision with root package name */
        public com.google.common.util.concurrent.a f20676c;

        public a(b bVar, String str, com.google.common.util.concurrent.a aVar) {
            this.f20674a = bVar;
            this.f20675b = str;
            this.f20676c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = ((Boolean) this.f20676c.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f20674a.e(this.f20675b, zBooleanValue);
        }
    }

    public d(Context context, androidx.work.a aVar, o2.a aVar2, WorkDatabase workDatabase, List list) {
        this.f20664b = context;
        this.f20665c = aVar;
        this.f20666d = aVar2;
        this.f20667e = workDatabase;
        this.f20670h = list;
    }

    public static boolean d(String str, k kVar) {
        if (kVar == null) {
            androidx.work.k.c().a(f20662l, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        kVar.d();
        androidx.work.k.c().a(f20662l, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    @Override // k2.a
    public void a(String str) {
        synchronized (this.f20673k) {
            this.f20668f.remove(str);
            m();
        }
    }

    @Override // k2.a
    public void b(String str, androidx.work.e eVar) {
        synchronized (this.f20673k) {
            try {
                androidx.work.k.c().d(f20662l, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
                k kVar = (k) this.f20669g.remove(str);
                if (kVar != null) {
                    if (this.f20663a == null) {
                        PowerManager.WakeLock wakeLockB = n.b(this.f20664b, "ProcessorForegroundLck");
                        this.f20663a = wakeLockB;
                        wakeLockB.acquire();
                    }
                    this.f20668f.put(str, kVar);
                    ContextCompat.startForegroundService(this.f20664b, androidx.work.impl.foreground.a.c(this.f20664b, str, eVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(b bVar) {
        synchronized (this.f20673k) {
            this.f20672j.add(bVar);
        }
    }

    @Override // d2.b
    public void e(String str, boolean z10) {
        synchronized (this.f20673k) {
            try {
                this.f20669g.remove(str);
                androidx.work.k.c().a(f20662l, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z10)), new Throwable[0]);
                Iterator it = this.f20672j.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).e(str, z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean f(String str) {
        boolean zContains;
        synchronized (this.f20673k) {
            zContains = this.f20671i.contains(str);
        }
        return zContains;
    }

    public boolean g(String str) {
        boolean z10;
        synchronized (this.f20673k) {
            try {
                z10 = this.f20669g.containsKey(str) || this.f20668f.containsKey(str);
            } finally {
            }
        }
        return z10;
    }

    public boolean h(String str) {
        boolean zContainsKey;
        synchronized (this.f20673k) {
            zContainsKey = this.f20668f.containsKey(str);
        }
        return zContainsKey;
    }

    public void i(b bVar) {
        synchronized (this.f20673k) {
            this.f20672j.remove(bVar);
        }
    }

    public boolean j(String str) {
        return k(str, null);
    }

    public boolean k(String str, WorkerParameters.a aVar) throws Throwable {
        Throwable th;
        synchronized (this.f20673k) {
            try {
                try {
                    if (g(str)) {
                        try {
                            androidx.work.k.c().a(f20662l, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                            return false;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    k kVarA = new k.c(this.f20664b, this.f20665c, this.f20666d, this, this.f20667e, str).c(this.f20670h).b(aVar).a();
                    com.google.common.util.concurrent.a aVarB = kVarA.b();
                    aVarB.addListener(new a(this, str, aVarB), this.f20666d.a());
                    this.f20669g.put(str, kVarA);
                    this.f20666d.getBackgroundExecutor().execute(kVarA);
                    androidx.work.k.c().a(f20662l, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
                    return true;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public boolean l(String str) {
        boolean zD;
        synchronized (this.f20673k) {
            try {
                boolean z10 = true;
                androidx.work.k.c().a(f20662l, String.format("Processor cancelling %s", str), new Throwable[0]);
                this.f20671i.add(str);
                k kVar = (k) this.f20668f.remove(str);
                if (kVar == null) {
                    z10 = false;
                }
                if (kVar == null) {
                    kVar = (k) this.f20669g.remove(str);
                }
                zD = d(str, kVar);
                if (z10) {
                    m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zD;
    }

    public final void m() {
        synchronized (this.f20673k) {
            try {
                if (this.f20668f.isEmpty()) {
                    try {
                        this.f20664b.startService(androidx.work.impl.foreground.a.d(this.f20664b));
                    } catch (Throwable th) {
                        androidx.work.k.c().b(f20662l, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f20663a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f20663a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean n(String str) {
        boolean zD;
        synchronized (this.f20673k) {
            androidx.work.k.c().a(f20662l, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            zD = d(str, (k) this.f20668f.remove(str));
        }
        return zD;
    }

    public boolean o(String str) {
        boolean zD;
        synchronized (this.f20673k) {
            androidx.work.k.c().a(f20662l, String.format("Processor stopping background work %s", str), new Throwable[0]);
            zD = d(str, (k) this.f20669g.remove(str));
        }
        return zD;
    }
}
