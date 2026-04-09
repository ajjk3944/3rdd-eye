package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;
import androidx.work.k;
import d2.b;
import d2.j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RequiresApi(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements b {

    /* renamed from: c, reason: collision with root package name */
    public static final String f4445c = k.f("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    public j f4446a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f4447b = new HashMap();

    public static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // d2.b
    public void e(String str, boolean z10) {
        JobParameters jobParameters;
        k.c().a(f4445c, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f4447b) {
            jobParameters = (JobParameters) this.f4447b.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            j jVarK = j.k(getApplicationContext());
            this.f4446a = jVarK;
            jVarK.m().c(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            k.c().h(f4445c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        j jVar = this.f4446a;
        if (jVar != null) {
            jVar.m().i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        WorkerParameters.a aVar;
        if (this.f4446a == null) {
            k.c().a(f4445c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String strA = a(jobParameters);
        if (TextUtils.isEmpty(strA)) {
            k.c().b(f4445c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f4447b) {
            try {
                if (this.f4447b.containsKey(strA)) {
                    k.c().a(f4445c, String.format("Job is already being executed by SystemJobService: %s", strA), new Throwable[0]);
                    return false;
                }
                k.c().a(f4445c, String.format("onStartJob for %s", strA), new Throwable[0]);
                this.f4447b.put(strA, jobParameters);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24) {
                    aVar = new WorkerParameters.a();
                    if (jobParameters.getTriggeredContentUris() != null) {
                        aVar.f4327b = Arrays.asList(jobParameters.getTriggeredContentUris());
                    }
                    if (jobParameters.getTriggeredContentAuthorities() != null) {
                        aVar.f4326a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                    }
                    if (i10 >= 28) {
                        aVar.f4328c = jobParameters.getNetwork();
                    }
                } else {
                    aVar = null;
                }
                this.f4446a.v(strA, aVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f4446a == null) {
            k.c().a(f4445c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String strA = a(jobParameters);
        if (TextUtils.isEmpty(strA)) {
            k.c().b(f4445c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        k.c().a(f4445c, String.format("onStopJob for %s", strA), new Throwable[0]);
        synchronized (this.f4447b) {
            this.f4447b.remove(strA);
        }
        this.f4446a.x(strA);
        return !this.f4446a.m().f(strA);
    }
}
