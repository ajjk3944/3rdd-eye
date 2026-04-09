package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class M5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f36004a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f36005b;

    M5(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.U0 u02) {
        this.f36004a = u02;
        this.f36005b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36005b.f35784a.K().Q(this.f36004a, this.f36005b.f35784a.m());
    }
}
