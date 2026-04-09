package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.g6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4859g6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ InterfaceC4951s2 f36466a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC4868h6 f36467b;

    RunnableC4859g6(ServiceConnectionC4868h6 serviceConnectionC4868h6, InterfaceC4951s2 interfaceC4951s2) {
        this.f36466a = interfaceC4951s2;
        this.f36467b = serviceConnectionC4868h6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f36467b) {
            try {
                this.f36467b.f36521a = false;
                if (!this.f36467b.f36523c.g0()) {
                    this.f36467b.f36523c.zzj().G().a("Connected to service");
                    this.f36467b.f36523c.H(this.f36466a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
