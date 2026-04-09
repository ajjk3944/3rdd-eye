package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C4940q6;
import com.google.android.gms.measurement.internal.InterfaceC4963t6;

@TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC4963t6 {

    /* renamed from: a, reason: collision with root package name */
    private C4940q6 f35762a;

    private final C4940q6 c() {
        if (this.f35762a == null) {
            this.f35762a = new C4940q6(this);
        }
        return this.f35762a;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4963t6
    public final void a(Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4963t6
    public final void b(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        c().c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        c().i();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        c().j(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return c().h(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return c().l(intent);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4963t6
    public final boolean zza(int i10) {
        throw new UnsupportedOperationException();
    }
}
