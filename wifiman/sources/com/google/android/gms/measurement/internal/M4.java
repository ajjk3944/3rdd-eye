package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes.dex */
final class M4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService.b f36002a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f36003b;

    M4(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.b bVar) {
        this.f36002a = bVar;
        this.f36003b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36003b.f35784a.E().P(this.f36002a);
    }
}
