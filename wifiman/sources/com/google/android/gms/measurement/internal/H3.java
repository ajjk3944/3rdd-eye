package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class H3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ t7 f35915a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A3 f35916b;

    H3(A3 a32, t7 t7Var) {
        this.f35915a = t7Var;
        this.f35916b = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35916b.f35772a.K0();
        this.f35916b.f35772a.r0(this.f35915a);
    }
}
