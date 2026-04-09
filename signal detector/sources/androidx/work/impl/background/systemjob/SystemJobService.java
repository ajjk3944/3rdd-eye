package androidx.work.impl.background.systemjob;

import A.f;
import V0.m;
import V2.e;
import W0.a;
import W0.k;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f5689c = m.h("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    public k f5690a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5691b = new HashMap();

    @Override // W0.a
    public final void c(String str, boolean z6) {
        JobParameters jobParameters;
        m.f().a(f5689c, AbstractC2763b.e(str, " executed on JobScheduler"), new Throwable[0]);
        synchronized (this.f5691b) {
            jobParameters = (JobParameters) this.f5691b.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z6);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            k kVarG = k.G(getApplicationContext());
            this.f5690a = kVarG;
            kVarG.f3995n.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            m.f().i(f5689c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        k kVar = this.f5690a;
        if (kVar != null) {
            kVar.f3995n.f(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras;
        if (this.f5690a == null) {
            m.f().a(f5689c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        e eVar = null;
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        String string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            m.f().e(f5689c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f5691b) {
            try {
                if (this.f5691b.containsKey(string)) {
                    m.f().a(f5689c, "Job is already being executed by SystemJobService: " + string, new Throwable[0]);
                    return false;
                }
                m.f().a(f5689c, "onStartJob for " + string, new Throwable[0]);
                this.f5691b.put(string, jobParameters);
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    eVar = new e();
                    if (jobParameters.getTriggeredContentUris() != null) {
                        eVar.f3869c = Arrays.asList(jobParameters.getTriggeredContentUris());
                    }
                    if (jobParameters.getTriggeredContentAuthorities() != null) {
                        eVar.f3868b = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                    }
                    if (i >= 28) {
                        eVar.f3870d = jobParameters.getNetwork();
                    }
                }
                this.f5690a.K(string, eVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        PersistableBundle extras;
        if (this.f5690a == null) {
            m.f().a(f5689c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        String string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            m.f().e(f5689c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        m.f().a(f5689c, f.l("onStopJob for ", string), new Throwable[0]);
        synchronized (this.f5691b) {
            this.f5691b.remove(string);
        }
        this.f5690a.L(string);
        return !this.f5690a.f3995n.d(string);
    }
}
