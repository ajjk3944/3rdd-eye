package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class U5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ t7 f36227a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C5 f36228b;

    U5(C5 c52, t7 t7Var) {
        this.f36227a = t7Var;
        this.f36228b = c52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4951s2 interfaceC4951s2 = this.f36228b.f35813d;
        if (interfaceC4951s2 == null) {
            this.f36228b.zzj().H().a("Failed to send app backgrounded");
            return;
        }
        try {
            AbstractC7901p.l(this.f36227a);
            interfaceC4951s2.t(this.f36227a);
            this.f36228b.m0();
        } catch (RemoteException e10) {
            this.f36228b.zzj().C().b("Failed to send app backgrounded to the service", e10);
        }
    }
}
