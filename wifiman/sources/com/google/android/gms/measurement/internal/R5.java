package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class R5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ t7 f36199a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C5 f36200b;

    R5(C5 c52, t7 t7Var) {
        this.f36199a = t7Var;
        this.f36200b = c52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4951s2 interfaceC4951s2 = this.f36200b.f35813d;
        if (interfaceC4951s2 == null) {
            this.f36200b.zzj().C().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            AbstractC7901p.l(this.f36199a);
            interfaceC4951s2.d0(this.f36199a);
        } catch (RemoteException e10) {
            this.f36200b.zzj().C().b("Failed to reset data on the service: remote exception", e10);
        }
        this.f36200b.m0();
    }
}
