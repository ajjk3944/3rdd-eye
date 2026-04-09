package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.x6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4995x6 {

    /* renamed from: a, reason: collision with root package name */
    private A6 f36871a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4987w6 f36872b;

    C4995x6(C4987w6 c4987w6) {
        this.f36872b = c4987w6;
    }

    final void a() {
        this.f36872b.j();
        if (this.f36871a != null) {
            this.f36872b.f36852c.removeCallbacks(this.f36871a);
        }
        this.f36872b.e().f36281u.a(false);
        this.f36872b.A(false);
        if (this.f36872b.a().p(N.f36060Z0) && this.f36872b.n().K0()) {
            this.f36872b.zzj().G().a("Retrying trigger URI registration in foreground");
            this.f36872b.n().I0();
        }
    }

    final void b(long j10) {
        this.f36871a = new A6(this, this.f36872b.zzb().a(), j10);
        this.f36872b.f36852c.postDelayed(this.f36871a, 2000L);
    }
}
