package ec;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.ads.d7;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v2 extends f0 {

    /* renamed from: d, reason: collision with root package name */
    public JobScheduler f23100d;

    @Override // ec.f0
    public final boolean E() {
        return true;
    }

    public final void F(long j) {
        o1 o1Var = (o1) this.f218b;
        C();
        B();
        JobScheduler jobScheduler = this.f23100d;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(o1Var.f22949a.getPackageName())).hashCode()) != null) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.f23060o.d("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int iG = G();
        if (iG != 2) {
            s0 s0Var2 = o1Var.f22954f;
            o1.m(s0Var2);
            s0Var2.f23060o.e(d7.z(iG), "[sgtm] Not eligible for Scion upload");
            return;
        }
        s0 s0Var3 = o1Var.f22954f;
        o1.m(s0Var3);
        s0Var3.f23060o.e(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(o1Var.f22949a.getPackageName())).hashCode(), new ComponentName(o1Var.f22949a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.f23100d;
        pb.y.h(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        s0 s0Var4 = o1Var.f22954f;
        o1.m(s0Var4);
        s0Var4.f23060o.e(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final int G() {
        o1 o1Var = (o1) this.f218b;
        C();
        B();
        if (this.f23100d == null) {
            return 7;
        }
        Boolean boolN = o1Var.f22952d.N("google_analytics_sgtm_upload_enabled");
        if (!(boolN == null ? false : boolN.booleanValue())) {
            return 8;
        }
        if (o1Var.r().f22850k < 119000) {
            return 6;
        }
        if (!l4.V(o1Var.f22949a, "com.google.android.gms.measurement.AppMeasurementJobService")) {
            return 3;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return !o1Var.p().I() ? 5 : 2;
        }
        return 4;
    }
}
