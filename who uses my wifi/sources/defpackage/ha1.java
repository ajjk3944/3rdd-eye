package defpackage;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ha1 extends uk2 {
    public static final Object A;
    public static ha1 y;
    public static ha1 z;
    public final Context p;
    public final ru0 q;
    public final WorkDatabase r;
    public final xb4 s;
    public final List t;
    public final om0 u;
    public final kf3 v;
    public boolean w;
    public BroadcastReceiver.PendingResult x;

    static {
        h80.f("WorkManagerImpl");
        y = null;
        z = null;
        A = new Object();
    }

    public ha1(Context context, ru0 ru0Var, xb4 xb4Var) throws Resources.NotFoundException {
        oq0 oq0Var;
        Executor executor;
        String str;
        boolean z2 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        lu0 lu0Var = (lu0) xb4Var.g;
        int i = WorkDatabase.k;
        if (z2) {
            oq0Var = new oq0(applicationContext, null);
            oq0Var.g = true;
        } else {
            String[] strArr = ba1.a;
            oq0 oq0Var2 = new oq0(applicationContext, "androidx.work.workdb");
            oq0Var2.f = new x91(applicationContext);
            oq0Var = oq0Var2;
        }
        oq0Var.d = lu0Var;
        y91 y91Var = new y91();
        if (oq0Var.c == null) {
            oq0Var.c = new ArrayList();
        }
        oq0Var.c.add(y91Var);
        oq0Var.a(um.i);
        oq0Var.a(new aa1(applicationContext, 2, 3));
        oq0Var.a(um.j);
        oq0Var.a(um.k);
        oq0Var.a(new aa1(applicationContext, 5, 6));
        oq0Var.a(um.l);
        oq0Var.a(um.m);
        oq0Var.a(um.n);
        oq0Var.a(new aa1(applicationContext));
        oq0Var.a(new aa1(applicationContext, 10, 11));
        oq0Var.a(um.o);
        oq0Var.h = false;
        oq0Var.i = true;
        Context context2 = oq0Var.b;
        if (context2 == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        Executor executor2 = oq0Var.d;
        if (executor2 == null && oq0Var.e == null) {
            i8 i8Var = j8.F;
            oq0Var.e = i8Var;
            oq0Var.d = i8Var;
        } else if (executor2 != null && oq0Var.e == null) {
            oq0Var.e = executor2;
        } else if (executor2 == null && (executor = oq0Var.e) != null) {
            oq0Var.d = executor;
        }
        if (oq0Var.f == null) {
            oq0Var.f = new pz(22);
        }
        String str2 = oq0Var.a;
        jz0 jz0Var = oq0Var.f;
        hm hmVar = oq0Var.j;
        ArrayList arrayList = oq0Var.c;
        boolean z3 = oq0Var.g;
        ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
        char c = (activityManager == null || activityManager.isLowRamDevice()) ? (char) 2 : (char) 3;
        Executor executor3 = oq0Var.d;
        Executor executor4 = oq0Var.e;
        boolean z4 = oq0Var.h;
        boolean z5 = oq0Var.i;
        qm qmVar = new qm();
        qmVar.c = jz0Var;
        qmVar.d = context2;
        qmVar.e = str2;
        qmVar.f = hmVar;
        qmVar.g = executor3;
        qmVar.h = executor4;
        qmVar.a = z4;
        qmVar.b = z5;
        String name = WorkDatabase.class.getPackage().getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        String str3 = (name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1)).replace('.', '_') + "_Impl";
        try {
            if (name.isEmpty()) {
                str = str3;
            } else {
                str = name + "." + str3;
            }
            pq0 pq0Var = (pq0) Class.forName(str).newInstance();
            kz0 kz0VarE = pq0Var.e(qmVar);
            pq0Var.c = kz0VarE;
            boolean z6 = c == 3;
            kz0VarE.setWriteAheadLoggingEnabled(z6);
            pq0Var.g = arrayList;
            pq0Var.b = executor3;
            new ArrayDeque();
            pq0Var.e = z3;
            pq0Var.f = z6;
            WorkDatabase workDatabase = (WorkDatabase) pq0Var;
            Context applicationContext2 = context.getApplicationContext();
            h80 h80Var = new h80(ru0Var.a, 0);
            synchronized (h80.class) {
                h80.h = h80Var;
            }
            int i2 = gt0.a;
            vz0 vz0Var = new vz0(applicationContext2, this);
            yj0.a(applicationContext2, SystemJobService.class, true);
            h80.d().a(new Throwable[0]);
            List listAsList = Arrays.asList(vz0Var, new zz(applicationContext2, ru0Var, xb4Var, this));
            om0 om0Var = new om0(context, ru0Var, xb4Var, workDatabase, listAsList);
            Context applicationContext3 = context.getApplicationContext();
            this.p = applicationContext3;
            this.q = ru0Var;
            this.s = xb4Var;
            this.r = workDatabase;
            this.t = listAsList;
            this.u = om0Var;
            this.v = new kf3(6, workDatabase);
            this.w = false;
            if (applicationContext3.isDeviceProtectedStorage()) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
            this.s.j(new xv(applicationContext3, this));
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + str3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + WorkDatabase.class.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class.getCanonicalName());
        }
    }

    public static ha1 j0(Context context) {
        ha1 ha1Var;
        Object obj = A;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    ha1Var = y;
                    if (ha1Var == null) {
                        ha1Var = z;
                    }
                }
                return ha1Var;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (ha1Var != null) {
            return ha1Var;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public static void k0(Context context, ru0 ru0Var) {
        synchronized (A) {
            try {
                ha1 ha1Var = y;
                if (ha1Var != null && z != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (ha1Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (z == null) {
                        z = new ha1(applicationContext, ru0Var, new xb4((ExecutorService) ru0Var.e));
                    }
                    y = z;
                }
            } finally {
            }
        }
    }

    public final void l0() {
        synchronized (A) {
            try {
                this.w = true;
                BroadcastReceiver.PendingResult pendingResult = this.x;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.x = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m0() {
        ArrayList arrayListC;
        String str = vz0.j;
        Context context = this.p;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListC = vz0.c(context, jobScheduler)) != null && !arrayListC.isEmpty()) {
            int size = arrayListC.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListC.get(i);
                i++;
                vz0.a(jobScheduler, ((JobInfo) obj).getId());
            }
        }
        WorkDatabase workDatabase = this.r;
        h2 h2VarN = workDatabase.n();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) h2VarN.a;
        workDatabase_Impl.b();
        tz0 tz0Var = (tz0) h2VarN.i;
        px pxVarA = tz0Var.a();
        workDatabase_Impl.c();
        try {
            pxVarA.i.executeUpdateDelete();
            workDatabase_Impl.h();
            workDatabase_Impl.f();
            tz0Var.c(pxVarA);
            gt0.a(this.q, workDatabase, this.t);
        } catch (Throwable th) {
            workDatabase_Impl.f();
            tz0Var.c(pxVarA);
            throw th;
        }
    }

    public final void n0(String str, t83 t83Var) {
        gi giVar = new gi(4);
        giVar.g = this;
        giVar.h = str;
        giVar.i = t83Var;
        this.s.j(giVar);
    }

    public final void o0(String str) {
        this.s.j(new iy0(this, str, false));
    }
}
