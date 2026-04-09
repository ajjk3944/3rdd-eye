package androidx.work.impl.background.systemjob;

import a0.x0;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import b7.l;
import bd.e;
import com.google.android.gms.internal.measurement.j4;
import d.h;
import i0.f;
import java.util.Arrays;
import java.util.HashMap;
import km.i;
import km.o;
import t6.v;
import u6.a;
import u6.c;
import u6.r;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements a {

    /* renamed from: e, reason: collision with root package name */
    public static final String f1617e = v.g("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    public r f1618a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1619b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final i f1620c = new i(23);

    /* renamed from: d, reason: collision with root package name */
    public o f1621d;

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(h.t("Cannot invoke ", str, " on a background thread"));
        }
    }

    public static l b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new l(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // u6.a
    public final void e(l lVar, boolean z3) {
        a("onExecuted");
        v.e().a(f1617e, lVar.f2007a + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.f1619b.remove(lVar);
        this.f1620c.x(lVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z3);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            r rVarD = r.D(getApplicationContext());
            this.f1618a = rVarD;
            c cVar = rVarD.f35179i;
            this.f1621d = new o(cVar, rVarD.g);
            cVar.a(this);
        } catch (IllegalStateException e2) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
            }
            v.e().h(f1617e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        r rVar = this.f1618a;
        if (rVar != null) {
            rVar.f35179i.g(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        f fVar;
        a("onStartJob");
        r rVar = this.f1618a;
        String str = f1617e;
        if (rVar == null) {
            v.e().a(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        l lVarB = b(jobParameters);
        if (lVarB == null) {
            v.e().c(str, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.f1619b;
        if (map.containsKey(lVarB)) {
            v.e().a(str, "Job is already being executed by SystemJobService: " + lVarB);
            return false;
        }
        v.e().a(str, "onStartJob for " + lVarB);
        map.put(lVarB, jobParameters);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 24) {
            fVar = new f(23);
            if (j4.l(jobParameters) != null) {
                fVar.f25417c = Arrays.asList(j4.l(jobParameters));
            }
            if (j4.k(jobParameters) != null) {
                fVar.f25416b = Arrays.asList(j4.k(jobParameters));
            }
            if (i4 >= 28) {
                fVar.f25418d = a4.f.i(jobParameters);
            }
        } else {
            fVar = null;
        }
        o oVar = this.f1621d;
        u6.h hVarA = this.f1620c.A(lVarB);
        oVar.getClass();
        ((c7.l) ((x0) ((d7.a) oVar.f28446b)).f148e).execute(new oi.f(oVar, hVarA, fVar, 10));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        a("onStopJob");
        if (this.f1618a == null) {
            v.e().a(f1617e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        l lVarB = b(jobParameters);
        if (lVarB == null) {
            v.e().c(f1617e, "WorkSpec id not found!");
            return false;
        }
        v.e().a(f1617e, "onStopJob for " + lVarB);
        this.f1619b.remove(lVarB);
        u6.h hVarX = this.f1620c.x(lVarB);
        if (hVarX != null) {
            int iB = Build.VERSION.SDK_INT >= 31 ? e.b(jobParameters) : -512;
            o oVar = this.f1621d;
            oVar.getClass();
            oVar.o(hVarX, iB);
        }
        c cVar = this.f1618a.f35179i;
        String str = lVarB.f2007a;
        synchronized (cVar.f35131k) {
            zContains = cVar.f35130i.contains(str);
        }
        return !zContains;
    }
}
