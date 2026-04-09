package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class E implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ InterfaceC4821c4 f35845a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A f35846b;

    E(A a10, InterfaceC4821c4 interfaceC4821c4) {
        this.f35845a = interfaceC4821c4;
        this.f35846b = a10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35845a.zzd();
        if (C4834e.a()) {
            this.f35845a.zzl().z(this);
            return;
        }
        boolean zE = this.f35846b.e();
        this.f35846b.f35771c = 0L;
        if (zE) {
            this.f35846b.d();
        }
    }
}
