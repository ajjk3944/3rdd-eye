package androidx.work.impl.background.systemjob;

import T1.InterfaceC1591c;
import T1.l;
import T1.r;
import T1.y;
import T1.z;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import androidx.work.m;
import b2.C1834o;
import c2.t;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC1591c {

    /* renamed from: f, reason: collision with root package name */
    public static final String f16917f = m.g("SystemJobService");

    /* renamed from: b, reason: collision with root package name */
    public z f16918b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f16919c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final E7.b f16920d = new E7.b(6);

    /* renamed from: e, reason: collision with root package name */
    public y f16921e;

    public static class a {
        public static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        public static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    public static class b {
        public static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    public static class c {
        public static int a(JobParameters jobParameters) {
            int stopReason = jobParameters.getStopReason();
            String str = SystemJobService.f16917f;
            switch (stopReason) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return stopReason;
                default:
                    return -512;
            }
        }
    }

    public static C1834o a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C1834o(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // T1.InterfaceC1591c
    public final void c(C1834o c1834o, boolean z10) {
        JobParameters jobParameters;
        m.e().a(f16917f, c1834o.f17128a + " executed on JobScheduler");
        synchronized (this.f16919c) {
            jobParameters = (JobParameters) this.f16919c.remove(c1834o);
        }
        this.f16920d.o(c1834o);
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            z zVarC = z.c(getApplicationContext());
            this.f16918b = zVarC;
            l lVar = zVarC.f12235f;
            this.f16921e = new y(lVar, zVarC.f12233d);
            lVar.a(this);
        } catch (IllegalStateException e4) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e4);
            }
            m.e().h(f16917f, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        z zVar = this.f16918b;
        if (zVar != null) {
            zVar.f12235f.h(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        WorkerParameters.a aVar;
        if (this.f16918b == null) {
            m.e().a(f16917f, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        C1834o c1834oA = a(jobParameters);
        if (c1834oA == null) {
            m.e().c(f16917f, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f16919c) {
            try {
                if (this.f16919c.containsKey(c1834oA)) {
                    m.e().a(f16917f, "Job is already being executed by SystemJobService: " + c1834oA);
                    return false;
                }
                m.e().a(f16917f, "onStartJob for " + c1834oA);
                this.f16919c.put(c1834oA, jobParameters);
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    aVar = new WorkerParameters.a();
                    if (a.b(jobParameters) != null) {
                        aVar.f16863b = Arrays.asList(a.b(jobParameters));
                    }
                    if (a.a(jobParameters) != null) {
                        aVar.f16862a = Arrays.asList(a.a(jobParameters));
                    }
                    if (i >= 28) {
                        aVar.f16864c = b.a(jobParameters);
                    }
                } else {
                    aVar = null;
                }
                y yVar = this.f16921e;
                yVar.f12225b.d(new t(yVar.f12224a, this.f16920d.r(c1834oA), aVar));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        if (this.f16918b == null) {
            m.e().a(f16917f, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        C1834o c1834oA = a(jobParameters);
        if (c1834oA == null) {
            m.e().c(f16917f, "WorkSpec id not found!");
            return false;
        }
        m.e().a(f16917f, "onStopJob for " + c1834oA);
        synchronized (this.f16919c) {
            this.f16919c.remove(c1834oA);
        }
        r rVarO = this.f16920d.o(c1834oA);
        if (rVarO != null) {
            int iA = Build.VERSION.SDK_INT >= 31 ? c.a(jobParameters) : -512;
            y yVar = this.f16921e;
            yVar.getClass();
            yVar.c(rVarO, iA);
        }
        return !this.f16918b.f12235f.f(c1834oA.f17128a);
    }
}
