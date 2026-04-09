package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class A6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private long f35780a;

    /* renamed from: b, reason: collision with root package name */
    private long f35781b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C4995x6 f35782c;

    A6(C4995x6 c4995x6, long j10, long j11) {
        this.f35782c = c4995x6;
        this.f35780a = j10;
        this.f35781b = j11;
    }

    public static /* synthetic */ void a(A6 a62) {
        C4995x6 c4995x6 = a62.f35782c;
        long j10 = a62.f35780a;
        long j11 = a62.f35781b;
        c4995x6.f36872b.j();
        c4995x6.f36872b.zzj().B().a("Application going to the background");
        c4995x6.f36872b.e().f36281u.a(true);
        c4995x6.f36872b.A(true);
        if (!c4995x6.f36872b.a().T()) {
            c4995x6.f36872b.B(false, false, j11);
            c4995x6.f36872b.f36855f.e(j11);
        }
        c4995x6.f36872b.zzj().F().b("Application backgrounded at: timestamp_millis", Long.valueOf(j10));
        c4995x6.f36872b.n().B0();
        if (c4995x6.f36872b.a().p(N.f36046S0)) {
            long jY = c4995x6.f36872b.g().B0(c4995x6.f36872b.zza().getPackageName(), c4995x6.f36872b.a().R()) ? 1000L : c4995x6.f36872b.a().y(c4995x6.f36872b.zza().getPackageName(), N.f36017E);
            c4995x6.f36872b.zzj().G().b("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(jY));
            c4995x6.f36872b.o().y(jY);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35782c.f36872b.zzl().z(new Runnable() { // from class: com.google.android.gms.measurement.internal.z6
            @Override // java.lang.Runnable
            public final void run() {
                A6.a(this.f36915a);
            }
        });
    }
}
