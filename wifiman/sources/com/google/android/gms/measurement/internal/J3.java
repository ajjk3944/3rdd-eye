package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class J3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f35942a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ L f35943b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f35944c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f35945d;

    J3(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.U0 u02, L l10, String str) {
        this.f35942a = u02;
        this.f35943b = l10;
        this.f35944c = str;
        this.f35945d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35945d.f35784a.I().B(this.f35942a, this.f35943b, this.f35944c);
    }
}
