package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class Z5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ L f36320a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f36321b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f36322c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C5 f36323d;

    Z5(C5 c52, L l10, String str, com.google.android.gms.internal.measurement.U0 u02) {
        this.f36320a = l10;
        this.f36321b = str;
        this.f36322c = u02;
        this.f36323d = c52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC4951s2 interfaceC4951s2 = this.f36323d.f35813d;
            if (interfaceC4951s2 == null) {
                this.f36323d.zzj().C().a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] bArrX = interfaceC4951s2.x(this.f36320a, this.f36321b);
            this.f36323d.m0();
            this.f36323d.g().R(this.f36322c, bArrX);
        } catch (RemoteException e10) {
            this.f36323d.zzj().C().b("Failed to send event to the service to bundle", e10);
        } finally {
            this.f36323d.g().R(this.f36322c, null);
        }
    }
}
