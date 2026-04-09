package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.i6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4876i6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ InterfaceC4951s2 f36540a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC4868h6 f36541b;

    RunnableC4876i6(ServiceConnectionC4868h6 serviceConnectionC4868h6, InterfaceC4951s2 interfaceC4951s2) {
        this.f36540a = interfaceC4951s2;
        this.f36541b = serviceConnectionC4868h6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f36541b) {
            try {
                this.f36541b.f36521a = false;
                if (!this.f36541b.f36523c.g0()) {
                    this.f36541b.f36523c.zzj().B().a("Connected to remote service");
                    this.f36541b.f36523c.H(this.f36540a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
