package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4916n6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f36605a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f36606b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f36607c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f36608d;

    RunnableC4916n6(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.U0 u02, String str, String str2) {
        this.f36605a = u02;
        this.f36606b = str;
        this.f36607c = str2;
        this.f36608d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36608d.f35784a.I().C(this.f36605a, this.f36606b, this.f36607c);
    }
}
