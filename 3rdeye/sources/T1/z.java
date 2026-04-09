package T1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.m;
import androidx.work.multiprocess.RemoteWorkManagerClient;
import b2.C1834o;
import e2.InterfaceC4306b;
import g2.AbstractC4381e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WorkManagerImpl.java */
/* loaded from: classes.dex */
public final class z extends androidx.work.u {

    /* renamed from: l, reason: collision with root package name */
    public static final String f12226l = androidx.work.m.g("WorkManagerImpl");

    /* renamed from: m, reason: collision with root package name */
    public static z f12227m = null;

    /* renamed from: n, reason: collision with root package name */
    public static z f12228n = null;

    /* renamed from: o, reason: collision with root package name */
    public static final Object f12229o = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f12230a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.work.b f12231b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase f12232c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4306b f12233d;

    /* renamed from: e, reason: collision with root package name */
    public final List<n> f12234e;

    /* renamed from: f, reason: collision with root package name */
    public final l f12235f;

    /* renamed from: g, reason: collision with root package name */
    public final c2.p f12236g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12237h = false;
    public BroadcastReceiver.PendingResult i;

    /* renamed from: j, reason: collision with root package name */
    public volatile AbstractC4381e f12238j;

    /* renamed from: k, reason: collision with root package name */
    public final G5.c f12239k;

    /* compiled from: WorkManagerImpl.java */
    public static class a {
        public static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public z(Context context, final androidx.work.b bVar, InterfaceC4306b interfaceC4306b, final WorkDatabase workDatabase, final List<n> list, l lVar, G5.c cVar) {
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 24 && a.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        m.a aVar = new m.a(bVar.f16873j);
        synchronized (androidx.work.m.f16948a) {
            androidx.work.m.f16949b = aVar;
        }
        this.f12230a = applicationContext;
        this.f12233d = interfaceC4306b;
        this.f12232c = workDatabase;
        this.f12235f = lVar;
        this.f12239k = cVar;
        this.f12231b = bVar;
        this.f12234e = list;
        this.f12236g = new c2.p(workDatabase);
        final c2.s sVarC = interfaceC4306b.c();
        String str = q.f12209a;
        lVar.a(new InterfaceC1591c() { // from class: T1.o
            @Override // T1.InterfaceC1591c
            public final void c(C1834o c1834o, boolean z10) {
                ((c2.s) sVarC).execute(new p(list, c1834o, bVar, workDatabase, 0));
            }
        });
        interfaceC4306b.d(new ForceStopRunnable(applicationContext, this));
    }

    @Deprecated
    public static z b() {
        synchronized (f12229o) {
            try {
                z zVar = f12227m;
                if (zVar != null) {
                    return zVar;
                }
                return f12228n;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static z c(Context context) {
        z zVarB;
        synchronized (f12229o) {
            try {
                zVarB = b();
                if (zVarB == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (!(applicationContext instanceof b.InterfaceC0266b)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    d(applicationContext, ((b.InterfaceC0266b) applicationContext).a());
                    zVarB = c(applicationContext);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zVarB;
    }

    public static void d(Context context, androidx.work.b bVar) {
        synchronized (f12229o) {
            try {
                z zVar = f12227m;
                if (zVar != null && f12228n != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (zVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f12228n == null) {
                        f12228n = B.d(applicationContext, bVar);
                    }
                    f12227m = f12228n;
                }
            } finally {
            }
        }
    }

    public final androidx.work.q a(List<? extends androidx.work.w> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new s(this, null, androidx.work.g.KEEP, list, null).i0();
    }

    public final void e() {
        synchronized (f12229o) {
            try {
                this.f12237h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        ArrayList arrayListF;
        String str = W1.b.f13323g;
        Context context = this.f12230a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListF = W1.b.f(context, jobScheduler)) != null && !arrayListF.isEmpty()) {
            Iterator it = arrayListF.iterator();
            while (it.hasNext()) {
                W1.b.a(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        WorkDatabase workDatabase = this.f12232c;
        workDatabase.y().C();
        q.b(this.f12231b, workDatabase, this.f12234e);
    }

    public final void g() {
        try {
            String str = RemoteWorkManagerClient.f16962j;
            this.f12238j = (AbstractC4381e) RemoteWorkManagerClient.class.getConstructor(Context.class, z.class).newInstance(this.f12230a, this);
        } catch (Throwable th) {
            androidx.work.m.e().b(f12226l, "Unable to initialize multi-process support", th);
        }
    }
}
