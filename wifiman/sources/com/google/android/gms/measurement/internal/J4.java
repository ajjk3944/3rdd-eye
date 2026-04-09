package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class J4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f35946a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f35947b;

    J4(C4945r4 c4945r4, boolean z10) {
        this.f35946a = z10;
        this.f35947b = c4945r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zN = this.f35947b.f36331a.n();
        boolean zM = this.f35947b.f36331a.m();
        this.f35947b.f36331a.i(this.f35946a);
        if (zM == this.f35946a) {
            this.f35947b.f36331a.zzj().G().b("Default data collection state already set to", Boolean.valueOf(this.f35946a));
        }
        if (this.f35947b.f36331a.n() == zN || this.f35947b.f36331a.n() != this.f35947b.f36331a.m()) {
            this.f35947b.f36331a.zzj().I().c("Default data collection is different than actual status", Boolean.valueOf(this.f35946a), Boolean.valueOf(zN));
        }
        this.f35947b.L0();
    }
}
