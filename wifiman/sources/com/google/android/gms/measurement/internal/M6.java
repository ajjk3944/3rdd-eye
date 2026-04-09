package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;

/* loaded from: classes.dex */
public final class M6 extends U6 {

    /* renamed from: d, reason: collision with root package name */
    private final AlarmManager f36006d;

    /* renamed from: e, reason: collision with root package name */
    private A f36007e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f36008f;

    protected M6(C4833d7 c4833d7) {
        super(c4833d7);
        this.f36006d = (AlarmManager) zza().getSystemService("alarm");
    }

    private final int w() {
        if (this.f36008f == null) {
            this.f36008f = Integer.valueOf(("measurement" + zza().getPackageName()).hashCode());
        }
        return this.f36008f.intValue();
    }

    private final PendingIntent x() {
        Context contextZza = zza();
        return com.google.android.gms.internal.measurement.B0.a(contextZza, 0, new Intent().setClassName(contextZza, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.B0.f34936a);
    }

    private final A y() {
        if (this.f36007e == null) {
            this.f36007e = new L6(this, this.f36173b.D0());
        }
        return this.f36007e;
    }

    private final void z() {
        JobScheduler jobScheduler = (JobScheduler) zza().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(w());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4893l a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ F b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ D2 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ X2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4915n5 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ x7 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ s7 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ C7 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ C4933q m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ C4873i3 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ C4924o6 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ X6 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.U6
    protected final boolean t() {
        AlarmManager alarmManager = this.f36006d;
        if (alarmManager != null) {
            alarmManager.cancel(x());
        }
        z();
        return false;
    }

    public final void u(long j10) {
        q();
        Context contextZza = zza();
        if (!x7.a0(contextZza)) {
            zzj().B().a("Receiver not registered/enabled");
        }
        if (!x7.b0(contextZza, false)) {
            zzj().B().a("Service not registered/enabled");
        }
        v();
        zzj().G().b("Scheduling upload, millis", Long.valueOf(j10));
        zzb().c();
        if (j10 < Math.max(0L, ((Long) N.f36031L.a(null)).longValue()) && !y().e()) {
            y().b(j10);
        }
        Context contextZza2 = zza();
        ComponentName componentName = new ComponentName(contextZza2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iW = w();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.A0.c(contextZza2, new JobInfo.Builder(iW, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void v() {
        q();
        zzj().G().a("Unscheduling upload");
        AlarmManager alarmManager = this.f36006d;
        if (alarmManager != null) {
            alarmManager.cancel(x());
        }
        y().a();
        z();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.d zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ C4834e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ L2 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ C4952s3 zzl() {
        return super.zzl();
    }
}
