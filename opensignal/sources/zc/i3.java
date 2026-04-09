package zc;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class i3 extends k3 {
    public Integer B;

    /* renamed from: x, reason: collision with root package name */
    public final AlarmManager f26972x;

    /* renamed from: y, reason: collision with root package name */
    public d3 f26973y;

    public i3(p3 p3Var) {
        super(p3Var);
        this.f26972x = (AlarmManager) ((c1) this.f1504d).f26884a.getSystemService("alarm");
    }

    @Override // zc.k3
    public final void v1() {
        AlarmManager alarmManager = this.f26972x;
        if (alarmManager != null) {
            Context context = ((c1) this.f1504d).f26884a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.f0.f4982a));
        }
        y1();
    }

    public final void w1() {
        t1();
        c1 c1Var = (c1) this.f1504d;
        j0 j0Var = c1Var.f26889y;
        c1.g(j0Var);
        j0Var.K.b("Unscheduling upload");
        AlarmManager alarmManager = this.f26972x;
        if (alarmManager != null) {
            Context context = c1Var.f26884a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.f0.f4982a));
        }
        x1().c();
        y1();
    }

    public final m x1() {
        if (this.f26973y == null) {
            this.f26973y = new d3(this, this.f26981g.H, 1);
        }
        return this.f26973y;
    }

    public final void y1() {
        JobScheduler jobScheduler = (JobScheduler) ((c1) this.f1504d).f26884a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(z1());
        }
    }

    public final int z1() {
        if (this.B == null) {
            this.B = Integer.valueOf("measurement".concat(String.valueOf(((c1) this.f1504d).f26884a.getPackageName())).hashCode());
        }
        return this.B.intValue();
    }
}
