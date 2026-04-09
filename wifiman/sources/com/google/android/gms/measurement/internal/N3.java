package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class N3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C4877j f36133a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ t7 f36134b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ A3 f36135c;

    N3(A3 a32, C4877j c4877j, t7 t7Var) {
        this.f36133a = c4877j;
        this.f36134b = t7Var;
        this.f36135c = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36135c.f35772a.K0();
        if (this.f36133a.f36545c.b() == null) {
            this.f36135c.f35772a.t(this.f36133a, this.f36134b);
        } else {
            this.f36135c.f35772a.f0(this.f36133a, this.f36134b);
        }
    }
}
