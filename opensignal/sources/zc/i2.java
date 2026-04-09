package zc;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* loaded from: classes.dex */
public final class i2 extends w {

    /* renamed from: r, reason: collision with root package name */
    public JobScheduler f26971r;

    @Override // zc.w
    public final boolean v1() {
        return true;
    }

    public final void w1(long j) {
        c1 c1Var = (c1) this.f1504d;
        t1();
        s1();
        JobScheduler jobScheduler = this.f26971r;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(c1Var.f26884a.getPackageName())).hashCode()) != null) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.K.b("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        com.google.android.gms.internal.measurement.o3 o3VarX1 = x1();
        if (o3VarX1 != com.google.android.gms.internal.measurement.o3.CLIENT_UPLOAD_ELIGIBLE) {
            j0 j0Var2 = c1Var.f26889y;
            c1.g(j0Var2);
            j0Var2.K.c(o3VarX1.name(), "[sgtm] Not eligible for Scion upload");
            return;
        }
        j0 j0Var3 = c1Var.f26889y;
        c1.g(j0Var3);
        j0Var3.K.c(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(c1Var.f26884a.getPackageName())).hashCode(), new ComponentName(c1Var.f26884a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.f26971r;
        cc.s.h(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        j0 j0Var4 = c1Var.f26889y;
        c1.g(j0Var4);
        j0Var4.K.c(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final com.google.android.gms.internal.measurement.o3 x1() {
        c1 c1Var = (c1) this.f1504d;
        t1();
        s1();
        if (this.f26971r == null) {
            return com.google.android.gms.internal.measurement.o3.MISSING_JOB_SCHEDULER;
        }
        Boolean boolE1 = c1Var.f26887r.E1("google_analytics_sgtm_upload_enabled");
        return boolE1 == null ? false : boolE1.booleanValue() ? c1Var.l().G >= 119000 ? !s3.L1(c1Var.f26884a) ? com.google.android.gms.internal.measurement.o3.MEASUREMENT_SERVICE_NOT_ENABLED : !c1Var.j().z1() ? com.google.android.gms.internal.measurement.o3.NON_PLAY_MODE : com.google.android.gms.internal.measurement.o3.CLIENT_UPLOAD_ELIGIBLE : com.google.android.gms.internal.measurement.o3.SDK_TOO_OLD : com.google.android.gms.internal.measurement.o3.NOT_ENABLED_IN_MANIFEST;
    }
}
