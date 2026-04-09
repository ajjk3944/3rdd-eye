package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import defpackage.gt;
import defpackage.h80;
import defpackage.ha1;
import defpackage.om0;
import defpackage.t83;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements gt {
    public static final String h = h80.f("SystemJobService");
    public ha1 f;
    public final HashMap g = new HashMap();

    @Override // defpackage.gt
    public final void a(String str, boolean z) {
        JobParameters jobParameters;
        h80.d().a(new Throwable[0]);
        synchronized (this.g) {
            jobParameters = (JobParameters) this.g.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            ha1 ha1VarJ0 = ha1.j0(getApplicationContext());
            this.f = ha1VarJ0;
            ha1VarJ0.u.b(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            h80.d().g(new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ha1 ha1Var = this.f;
        if (ha1Var != null) {
            ha1Var.u.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras;
        if (this.f == null) {
            h80.d().a(new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        String string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            h80.d().b(h, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.g) {
            try {
                if (this.g.containsKey(string)) {
                    h80.d().a(new Throwable[0]);
                    return false;
                }
                h80.d().a(new Throwable[0]);
                this.g.put(string, jobParameters);
                int i = Build.VERSION.SDK_INT;
                t83 t83Var = new t83(10);
                if (jobParameters.getTriggeredContentUris() != null) {
                    t83Var.h = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    t83Var.g = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i >= 28) {
                    t83Var.i = jobParameters.getNetwork();
                }
                this.f.n0(string, t83Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        PersistableBundle extras;
        if (this.f == null) {
            h80.d().a(new Throwable[0]);
            return true;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        String string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            h80.d().b(h, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        h80.d().a(new Throwable[0]);
        synchronized (this.g) {
            this.g.remove(string);
        }
        this.f.o0(string);
        om0 om0Var = this.f.u;
        synchronized (om0Var.p) {
            zContains = om0Var.n.contains(string);
        }
        return !zContains;
    }
}
