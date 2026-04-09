package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class L5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f35994a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ t7 f35995b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Bundle f35996c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C5 f35997d;

    L5(C5 c52, AtomicReference atomicReference, t7 t7Var, Bundle bundle) {
        this.f35994a = atomicReference;
        this.f35995b = t7Var;
        this.f35996c = bundle;
        this.f35997d = c52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4951s2 interfaceC4951s2;
        synchronized (this.f35994a) {
            try {
                try {
                    interfaceC4951s2 = this.f35997d.f35813d;
                } catch (RemoteException e10) {
                    this.f35997d.zzj().C().b("Failed to get trigger URIs; remote exception", e10);
                }
                if (interfaceC4951s2 == null) {
                    this.f35997d.zzj().C().a("Failed to get trigger URIs; not connected to service");
                    return;
                }
                AbstractC7901p.l(this.f35995b);
                this.f35994a.set(interfaceC4951s2.h(this.f35995b, this.f35996c));
                this.f35997d.m0();
                this.f35994a.notify();
            } finally {
                this.f35994a.notify();
            }
        }
    }
}
