package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class Y5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ t7 f36308a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C5 f36309b;

    Y5(C5 c52, t7 t7Var) {
        this.f36308a = t7Var;
        this.f36309b = c52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4951s2 interfaceC4951s2 = this.f36309b.f35813d;
        if (interfaceC4951s2 == null) {
            this.f36309b.zzj().C().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            AbstractC7901p.l(this.f36308a);
            interfaceC4951s2.a0(this.f36308a);
            this.f36309b.m0();
        } catch (RemoteException e10) {
            this.f36309b.zzj().C().b("Failed to send measurementEnabled to the service", e10);
        }
    }
}
