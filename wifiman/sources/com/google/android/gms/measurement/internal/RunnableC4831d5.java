package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.d5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4831d5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ D f36375a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f36376b;

    RunnableC4831d5(C4945r4 c4945r4, D d10) {
        this.f36375a = d10;
        this.f36376b = c4945r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f36376b.e().v(this.f36375a)) {
            this.f36376b.zzj().F().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.f36375a.a()));
            return;
        }
        this.f36376b.zzj().G().b("Setting DMA consent(FE)", this.f36375a);
        if (this.f36376b.q().j0()) {
            this.f36376b.q().e0();
        } else {
            this.f36376b.q().W(false);
        }
    }
}
