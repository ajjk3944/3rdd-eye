package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class Q5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f36186a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ t7 f36187b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C5 f36188c;

    Q5(C5 c52, AtomicReference atomicReference, t7 t7Var) {
        this.f36186a = atomicReference;
        this.f36187b = t7Var;
        this.f36188c = c52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f36186a) {
            try {
                try {
                } catch (RemoteException e10) {
                    this.f36188c.zzj().C().b("Failed to get app instance id", e10);
                }
                if (!this.f36188c.e().J().x()) {
                    this.f36188c.zzj().I().a("Analytics storage consent denied; will not get app instance id");
                    this.f36188c.n().U0(null);
                    this.f36188c.e().f36269i.b(null);
                    this.f36186a.set(null);
                    return;
                }
                InterfaceC4951s2 interfaceC4951s2 = this.f36188c.f35813d;
                if (interfaceC4951s2 == null) {
                    this.f36188c.zzj().C().a("Failed to get app instance id");
                    return;
                }
                AbstractC7901p.l(this.f36187b);
                this.f36186a.set(interfaceC4951s2.e(this.f36187b));
                String str = (String) this.f36186a.get();
                if (str != null) {
                    this.f36188c.n().U0(str);
                    this.f36188c.e().f36269i.b(str);
                }
                this.f36188c.m0();
                this.f36186a.notify();
            } finally {
                this.f36186a.notify();
            }
        }
    }
}
