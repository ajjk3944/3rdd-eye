package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.m5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4907m5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f36592a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f36593b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f36594c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ boolean f36595d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f36596e;

    RunnableC4907m5(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.U0 u02, String str, String str2, boolean z10) {
        this.f36592a = u02;
        this.f36593b = str;
        this.f36594c = str2;
        this.f36595d = z10;
        this.f36596e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36596e.f35784a.I().D(this.f36592a, this.f36593b, this.f36594c, this.f36595d);
    }
}
