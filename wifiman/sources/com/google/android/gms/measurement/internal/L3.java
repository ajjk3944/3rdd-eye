package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class L3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ t7 f35990a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A3 f35991b;

    L3(A3 a32, t7 t7Var) {
        this.f35990a = t7Var;
        this.f35991b = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35991b.f35772a.K0();
        this.f35991b.f35772a.p0(this.f35990a);
    }
}
