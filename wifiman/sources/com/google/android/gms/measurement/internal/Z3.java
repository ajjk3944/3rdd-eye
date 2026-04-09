package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class Z3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ r7 f36315a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ t7 f36316b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ A3 f36317c;

    Z3(A3 a32, r7 r7Var, t7 t7Var) {
        this.f36315a = r7Var;
        this.f36316b = t7Var;
        this.f36317c = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36317c.f35772a.K0();
        if (this.f36315a.b() == null) {
            this.f36317c.f35772a.K(this.f36315a.f36713b, this.f36316b);
        } else {
            this.f36317c.f35772a.A(this.f36315a, this.f36316b);
        }
    }
}
