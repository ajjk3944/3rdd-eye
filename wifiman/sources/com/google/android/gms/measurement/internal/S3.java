package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class S3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ t7 f36201a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A3 f36202b;

    S3(A3 a32, t7 t7Var) {
        this.f36201a = t7Var;
        this.f36202b = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36202b.f35772a.K0();
        this.f36202b.f35772a.t0(this.f36201a);
    }
}
