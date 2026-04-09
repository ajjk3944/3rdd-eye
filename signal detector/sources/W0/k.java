package W0;

import A2.C;
import C0.o;
import V0.m;
import a4.t;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.apm.insight.R;
import e1.C2301d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class k extends I5.b {

    /* renamed from: F, reason: collision with root package name */
    public static k f3985F;

    /* renamed from: G, reason: collision with root package name */
    public static k f3986G;

    /* renamed from: H, reason: collision with root package name */
    public static final Object f3987H;

    /* renamed from: C, reason: collision with root package name */
    public final f1.f f3988C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f3989D;

    /* renamed from: E, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f3990E;
    public final Context i;

    /* renamed from: j, reason: collision with root package name */
    public final V0.b f3991j;

    /* renamed from: k, reason: collision with root package name */
    public final WorkDatabase f3992k;

    /* renamed from: l, reason: collision with root package name */
    public final V2.e f3993l;

    /* renamed from: m, reason: collision with root package name */
    public final List f3994m;

    /* renamed from: n, reason: collision with root package name */
    public final b f3995n;

    static {
        m.h("WorkManagerImpl");
        f3985F = null;
        f3986G = null;
        f3987H = new Object();
    }

    public k(Context context, V0.b bVar, V2.e eVar) throws Resources.NotFoundException {
        o oVarH;
        boolean z6 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        f1.j jVar = (f1.j) eVar.f3868b;
        int i = WorkDatabase.f5675l;
        int i3 = 1;
        if (z6) {
            q5.i.e(applicationContext, "context");
            oVarH = new o(applicationContext, WorkDatabase.class, null);
            oVarH.f1078j = true;
        } else {
            String str = j.f3983a;
            oVarH = t.h(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            oVarH.i = new R3.e(applicationContext, i3);
        }
        q5.i.e(jVar, "executor");
        oVarH.f1076g = jVar;
        oVarH.f1073d.add(new f());
        oVarH.a(i.f3976a);
        oVarH.a(new h(applicationContext, 2, 3));
        oVarH.a(i.f3977b);
        oVarH.a(i.f3978c);
        oVarH.a(new h(applicationContext, 5, 6));
        oVarH.a(i.f3979d);
        oVarH.a(i.f3980e);
        oVarH.a(i.f3981f);
        oVarH.a(new h(applicationContext));
        oVarH.a(new h(applicationContext, 10, 11));
        oVarH.a(i.f3982g);
        oVarH.c();
        WorkDatabase workDatabase = (WorkDatabase) oVarH.b();
        Context applicationContext2 = context.getApplicationContext();
        m mVar = new m(bVar.f3800a, 0);
        synchronized (m.class) {
            m.f3828c = mVar;
        }
        String str2 = d.f3966a;
        Z0.b bVar2 = new Z0.b(applicationContext2, this);
        f1.g.a(applicationContext2, SystemJobService.class, true);
        m.f().a(d.f3966a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        List listAsList = Arrays.asList(bVar2, new X0.b(applicationContext2, bVar, eVar, this));
        b bVar3 = new b(context, bVar, eVar, workDatabase, listAsList);
        Context applicationContext3 = context.getApplicationContext();
        this.i = applicationContext3;
        this.f3991j = bVar;
        this.f3993l = eVar;
        this.f3992k = workDatabase;
        this.f3994m = listAsList;
        this.f3995n = bVar3;
        this.f3988C = new f1.f(workDatabase);
        this.f3989D = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext3.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f3993l.o(new f1.e(applicationContext3, this));
    }

    public static k F() {
        synchronized (f3987H) {
            try {
                k kVar = f3985F;
                if (kVar != null) {
                    return kVar;
                }
                return f3986G;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static k G(Context context) {
        k kVarF;
        synchronized (f3987H) {
            try {
                kVarF = F();
                if (kVarF == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVarF;
    }

    public static void H(Context context, V0.b bVar) {
        synchronized (f3987H) {
            try {
                k kVar = f3985F;
                if (kVar != null && f3986G != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (kVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f3986G == null) {
                        f3986G = new k(applicationContext, bVar, new V2.e((ExecutorService) bVar.f3804e));
                    }
                    f3985F = f3986G;
                }
            } finally {
            }
        }
    }

    public final void I() {
        synchronized (f3987H) {
            try {
                this.f3989D = true;
                BroadcastReceiver.PendingResult pendingResult = this.f3990E;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f3990E = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void J() {
        ArrayList arrayListF;
        String str = Z0.b.f4518e;
        Context context = this.i;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListF = Z0.b.f(context, jobScheduler)) != null && !arrayListF.isEmpty()) {
            int size = arrayListF.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListF.get(i);
                i++;
                Z0.b.a(jobScheduler, ((JobInfo) obj).getId());
            }
        }
        WorkDatabase workDatabase = this.f3992k;
        K4.c cVarT = workDatabase.t();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVarT.f2209b;
        workDatabase_Impl.b();
        C2301d c2301d = (C2301d) cVarT.f2216j;
        H0.j jVarA = c2301d.a();
        workDatabase_Impl.c();
        try {
            jVarA.b();
            workDatabase_Impl.m();
            workDatabase_Impl.j();
            c2301d.c(jVarA);
            d.a(this.f3991j, workDatabase, this.f3994m);
        } catch (Throwable th) {
            workDatabase_Impl.j();
            c2301d.c(jVarA);
            throw th;
        }
    }

    public final void K(String str, V2.e eVar) {
        C c6 = new C(15);
        c6.f149b = this;
        c6.f150c = str;
        c6.f151d = eVar;
        this.f3993l.o(c6);
    }

    public final void L(String str) {
        this.f3993l.o(new f1.k(this, str, false));
    }
}
