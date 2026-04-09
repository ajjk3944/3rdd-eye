package ec;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w3 extends b4 {

    /* renamed from: e, reason: collision with root package name */
    public final AlarmManager f23114e;

    /* renamed from: f, reason: collision with root package name */
    public q3 f23115f;
    public Integer g;

    public w3(g4 g4Var) {
        super(g4Var);
        this.f23114e = (AlarmManager) ((o1) this.f218b).f22949a.getSystemService("alarm");
    }

    @Override // ec.b4
    public final void E() {
        AlarmManager alarmManager = this.f23114e;
        if (alarmManager != null) {
            alarmManager.cancel(J());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            H();
        }
    }

    public final void F() {
        C();
        s0 s0Var = ((o1) this.f218b).f22954f;
        o1.m(s0Var);
        s0Var.f23060o.d("Unscheduling upload");
        AlarmManager alarmManager = this.f23114e;
        if (alarmManager != null) {
            alarmManager.cancel(J());
        }
        G().c();
        if (Build.VERSION.SDK_INT >= 24) {
            H();
        }
    }

    public final n G() {
        if (this.f23115f == null) {
            this.f23115f = new q3(this, this.f23175c.f22740l, 1);
        }
        return this.f23115f;
    }

    public final void H() {
        JobScheduler jobScheduler = (JobScheduler) ((o1) this.f218b).f22949a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(I());
        }
    }

    public final int I() {
        if (this.g == null) {
            this.g = Integer.valueOf("measurement".concat(String.valueOf(((o1) this.f218b).f22949a.getPackageName())).hashCode());
        }
        return this.g.intValue();
    }

    public final PendingIntent J() {
        Context context = ((o1) this.f218b).f22949a;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.e0.f19667a);
    }
}
