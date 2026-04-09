package T1;

import T1.K;
import a2.C1645b;
import a2.InterfaceC1644a;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import b2.C1834o;
import b2.C1842w;
import d2.AbstractC4266a;
import d2.C4268c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import z0.C5848a;

/* compiled from: Processor.java */
/* loaded from: classes.dex */
public final class l implements InterfaceC1644a {

    /* renamed from: l, reason: collision with root package name */
    public static final String f12188l = androidx.work.m.g("Processor");

    /* renamed from: b, reason: collision with root package name */
    public final Context f12190b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.work.b f12191c;

    /* renamed from: d, reason: collision with root package name */
    public final e2.c f12192d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f12193e;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f12195g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f12194f = new HashMap();
    public final HashSet i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f12197j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f12189a = null;

    /* renamed from: k, reason: collision with root package name */
    public final Object f12198k = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f12196h = new HashMap();

    public l(Context context, androidx.work.b bVar, e2.c cVar, WorkDatabase workDatabase) {
        this.f12190b = context;
        this.f12191c = bVar;
        this.f12192d = cVar;
        this.f12193e = workDatabase;
    }

    public static boolean e(String str, K k10, int i) {
        if (k10 == null) {
            androidx.work.m.e().a(f12188l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        k10.f12156s = i;
        k10.h();
        k10.f12155r.cancel(true);
        if (k10.f12144f == null || !(k10.f12155r.f37349b instanceof AbstractC4266a.b)) {
            androidx.work.m.e().a(K.f12139t, "WorkSpec " + k10.f12143e + " is already done. Not interrupting.");
        } else {
            k10.f12144f.stop(i);
        }
        androidx.work.m.e().a(f12188l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(InterfaceC1591c interfaceC1591c) {
        synchronized (this.f12198k) {
            this.f12197j.add(interfaceC1591c);
        }
    }

    public final K b(String str) {
        K k10 = (K) this.f12194f.remove(str);
        boolean z10 = k10 != null;
        if (!z10) {
            k10 = (K) this.f12195g.remove(str);
        }
        this.f12196h.remove(str);
        if (z10) {
            synchronized (this.f12198k) {
                try {
                    if (this.f12194f.isEmpty()) {
                        Context context = this.f12190b;
                        String str2 = C1645b.f14096k;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f12190b.startService(intent);
                        } catch (Throwable th) {
                            androidx.work.m.e().d(f12188l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.f12189a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f12189a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return k10;
    }

    public final C1842w c(String str) {
        synchronized (this.f12198k) {
            try {
                K kD = d(str);
                if (kD == null) {
                    return null;
                }
                return kD.f12143e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final K d(String str) {
        K k10 = (K) this.f12194f.get(str);
        return k10 == null ? (K) this.f12195g.get(str) : k10;
    }

    public final boolean f(String str) {
        boolean zContains;
        synchronized (this.f12198k) {
            zContains = this.i.contains(str);
        }
        return zContains;
    }

    public final boolean g(String str) {
        boolean z10;
        synchronized (this.f12198k) {
            z10 = d(str) != null;
        }
        return z10;
    }

    public final void h(InterfaceC1591c interfaceC1591c) {
        synchronized (this.f12198k) {
            this.f12197j.remove(interfaceC1591c);
        }
    }

    public final void i(String str, androidx.work.h hVar) {
        synchronized (this.f12198k) {
            try {
                androidx.work.m.e().f(f12188l, "Moving WorkSpec (" + str + ") to the foreground");
                K k10 = (K) this.f12195g.remove(str);
                if (k10 != null) {
                    if (this.f12189a == null) {
                        PowerManager.WakeLock wakeLockA = c2.y.a(this.f12190b, "ProcessorForegroundLck");
                        this.f12189a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f12194f.put(str, k10);
                    C5848a.startForegroundService(this.f12190b, C1645b.d(this.f12190b, B7.d.l(k10.f12143e), hVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j(r rVar, WorkerParameters.a aVar) throws Throwable {
        Throwable th;
        C1834o c1834o = rVar.f12210a;
        String str = c1834o.f17128a;
        ArrayList arrayList = new ArrayList();
        C1842w c1842w = (C1842w) this.f12193e.q(new H8.e(new CallableC1599k(this, arrayList, str, 0), 7));
        if (c1842w == null) {
            androidx.work.m.e().h(f12188l, "Didn't find WorkSpec for id " + c1834o);
            this.f12192d.f37703d.execute(new C.E(5, this, c1834o));
            return false;
        }
        synchronized (this.f12198k) {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    throw th;
                }
                try {
                    if (g(str)) {
                        Set set = (Set) this.f12196h.get(str);
                        if (((r) set.iterator().next()).f12210a.f17129b == c1834o.f17129b) {
                            set.add(rVar);
                            androidx.work.m.e().a(f12188l, "Work " + c1834o + " is already enqueued for processing");
                        } else {
                            this.f12192d.f37703d.execute(new C.E(5, this, c1834o));
                        }
                        return false;
                    }
                    if (c1842w.f17156t != c1834o.f17129b) {
                        this.f12192d.f37703d.execute(new C.E(5, this, c1834o));
                        return false;
                    }
                    K.a aVar2 = new K.a(this.f12190b, this.f12191c, this.f12192d, this, this.f12193e, c1842w, arrayList);
                    if (aVar != null) {
                        aVar2.f12164h = aVar;
                    }
                    K k10 = new K(aVar2);
                    C4268c<Boolean> c4268c = k10.f12154q;
                    c4268c.addListener(new J4.f(this, c4268c, k10, 1), this.f12192d.f37703d);
                    this.f12195g.put(str, k10);
                    HashSet hashSet = new HashSet();
                    hashSet.add(rVar);
                    this.f12196h.put(str, hashSet);
                    this.f12192d.f37700a.execute(k10);
                    androidx.work.m.e().a(f12188l, l.class.getSimpleName() + ": processing " + c1834o);
                    return true;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public final boolean k(r rVar, int i) {
        String str = rVar.f12210a.f17128a;
        synchronized (this.f12198k) {
            try {
                if (this.f12194f.get(str) == null) {
                    Set set = (Set) this.f12196h.get(str);
                    if (set != null && set.contains(rVar)) {
                        return e(str, b(str), i);
                    }
                    return false;
                }
                androidx.work.m.e().a(f12188l, "Ignored stopWork. WorkerWrapper " + str + " is in foreground");
                return false;
            } finally {
            }
        }
    }
}
