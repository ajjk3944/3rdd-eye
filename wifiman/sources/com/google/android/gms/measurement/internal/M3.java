package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class M3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C4877j f36000a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A3 f36001b;

    M3(A3 a32, C4877j c4877j) {
        this.f36000a = c4877j;
        this.f36001b = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36001b.f35772a.K0();
        if (this.f36000a.f36545c.b() == null) {
            this.f36001b.f35772a.s(this.f36000a);
        } else {
            this.f36001b.f35772a.e0(this.f36000a);
        }
    }
}
