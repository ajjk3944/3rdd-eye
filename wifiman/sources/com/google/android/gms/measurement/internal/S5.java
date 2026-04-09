package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class S5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ t7 f36204a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C5 f36205b;

    S5(C5 c52, t7 t7Var) {
        this.f36204a = t7Var;
        this.f36205b = c52;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        InterfaceC4951s2 interfaceC4951s2 = this.f36205b.f35813d;
        if (interfaceC4951s2 == null) {
            this.f36205b.zzj().C().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            AbstractC7901p.l(this.f36204a);
            interfaceC4951s2.u(this.f36204a);
            this.f36205b.m().H();
            this.f36205b.I(interfaceC4951s2, null, this.f36204a);
            this.f36205b.m0();
        } catch (RemoteException e10) {
            this.f36205b.zzj().C().b("Failed to send app launch to the service", e10);
        }
    }
}
