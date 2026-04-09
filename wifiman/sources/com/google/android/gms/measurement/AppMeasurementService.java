package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.C4940q6;
import com.google.android.gms.measurement.internal.InterfaceC4963t6;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements InterfaceC4963t6 {

    /* renamed from: a, reason: collision with root package name */
    private C4940q6 f35764a;

    private final C4940q6 c() {
        if (this.f35764a == null) {
            this.f35764a = new C4940q6(this);
        }
        return this.f35764a;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4963t6
    public final void a(Intent intent) {
        Y1.a.b(intent);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4963t6
    public final void b(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return c().b(intent);
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

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        return c().a(intent, i10, i11);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return c().l(intent);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4963t6
    public final boolean zza(int i10) {
        return stopSelfResult(i10);
    }
}
