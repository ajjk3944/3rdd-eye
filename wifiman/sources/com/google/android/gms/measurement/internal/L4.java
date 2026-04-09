package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class L4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f35992a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f35993b;

    L4(C4945r4 c4945r4, long j10) {
        this.f35992a = j10;
        this.f35993b = c4945r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35993b.e().f36273m.b(this.f35992a);
        this.f35993b.zzj().B().b("Session timeout duration set", Long.valueOf(this.f35992a));
    }
}
