package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class X5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C4970u5 f36292a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C5 f36293b;

    X5(C5 c52, C4970u5 c4970u5) {
        this.f36292a = c4970u5;
        this.f36293b = c52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4951s2 interfaceC4951s2 = this.f36293b.f35813d;
        if (interfaceC4951s2 == null) {
            this.f36293b.zzj().C().a("Failed to send current screen to service");
            return;
        }
        try {
            C4970u5 c4970u5 = this.f36292a;
            if (c4970u5 == null) {
                interfaceC4951s2.G(0L, null, null, this.f36293b.zza().getPackageName());
            } else {
                interfaceC4951s2.G(c4970u5.f36782c, c4970u5.f36780a, c4970u5.f36781b, this.f36293b.zza().getPackageName());
            }
            this.f36293b.m0();
        } catch (RemoteException e10) {
            this.f36293b.zzj().C().b("Failed to send current screen to the service", e10);
        }
    }
}
