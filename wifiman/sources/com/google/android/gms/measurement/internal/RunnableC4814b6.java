package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.b6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4814b6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ t7 f36353a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C5 f36354b;

    RunnableC4814b6(C5 c52, t7 t7Var) {
        this.f36353a = t7Var;
        this.f36354b = c52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4951s2 interfaceC4951s2 = this.f36354b.f35813d;
        if (interfaceC4951s2 == null) {
            this.f36354b.zzj().C().a("Failed to send consent settings to service");
            return;
        }
        try {
            AbstractC7901p.l(this.f36353a);
            interfaceC4951s2.k0(this.f36353a);
            this.f36354b.m0();
        } catch (RemoteException e10) {
            this.f36354b.zzj().C().b("Failed to send consent settings to the service", e10);
        }
    }
}
