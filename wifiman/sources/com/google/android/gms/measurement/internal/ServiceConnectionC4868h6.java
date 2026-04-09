package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import r3.C7564b;
import s3.AbstractC7888c;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.h6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC4868h6 implements ServiceConnection, AbstractC7888c.a, AbstractC7888c.b {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f36521a;

    /* renamed from: b, reason: collision with root package name */
    private volatile F2 f36522b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C5 f36523c;

    protected ServiceConnectionC4868h6(C5 c52) {
        this.f36523c = c52;
    }

    public final void a() {
        this.f36523c.j();
        Context contextZza = this.f36523c.zza();
        synchronized (this) {
            try {
                if (this.f36521a) {
                    this.f36523c.zzj().G().a("Connection attempt already in progress");
                    return;
                }
                if (this.f36522b != null && (this.f36522b.c() || this.f36522b.isConnected())) {
                    this.f36523c.zzj().G().a("Already awaiting connection attempt");
                    return;
                }
                this.f36522b = new F2(contextZza, Looper.getMainLooper(), this, this);
                this.f36523c.zzj().G().a("Connecting to remote service");
                this.f36521a = true;
                AbstractC7901p.l(this.f36522b);
                this.f36522b.o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // s3.AbstractC7888c.b
    public final void b(C7564b c7564b) {
        AbstractC7901p.e("MeasurementServiceConnection.onConnectionFailed");
        L2 l2B = this.f36523c.f36331a.B();
        if (l2B != null) {
            l2B.H().b("Service connection failed", c7564b);
        }
        synchronized (this) {
            this.f36521a = false;
            this.f36522b = null;
        }
        this.f36523c.zzl().z(new RunnableC4892k6(this, c7564b));
    }

    @Override // s3.AbstractC7888c.a
    public final void c(int i10) {
        AbstractC7901p.e("MeasurementServiceConnection.onConnectionSuspended");
        this.f36523c.zzj().B().a("Service connection suspended");
        this.f36523c.zzl().z(new RunnableC4900l6(this));
    }

    public final void d(Intent intent) {
        this.f36523c.j();
        Context contextZza = this.f36523c.zza();
        v3.b bVarB = v3.b.b();
        synchronized (this) {
            try {
                if (this.f36521a) {
                    this.f36523c.zzj().G().a("Connection attempt already in progress");
                    return;
                }
                this.f36523c.zzj().G().a("Using local app measurement service");
                this.f36521a = true;
                bVarB.a(contextZza, intent, this.f36523c.f35812c, 129);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // s3.AbstractC7888c.a
    public final void f(Bundle bundle) {
        AbstractC7901p.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                AbstractC7901p.l(this.f36522b);
                this.f36523c.zzl().z(new RunnableC4876i6(this, (InterfaceC4951s2) this.f36522b.B()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f36522b = null;
                this.f36521a = false;
            }
        }
    }

    public final void g() {
        if (this.f36522b != null && (this.f36522b.isConnected() || this.f36522b.c())) {
            this.f36522b.disconnect();
        }
        this.f36522b = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC7901p.e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f36521a = false;
                this.f36523c.zzj().C().a("Service connected with null binder");
                return;
            }
            InterfaceC4951s2 c4967u2 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    c4967u2 = iInterfaceQueryLocalInterface instanceof InterfaceC4951s2 ? (InterfaceC4951s2) iInterfaceQueryLocalInterface : new C4967u2(iBinder);
                    this.f36523c.zzj().G().a("Bound to IMeasurementService interface");
                } else {
                    this.f36523c.zzj().C().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f36523c.zzj().C().a("Service connect failed to get IMeasurementService");
            }
            if (c4967u2 == null) {
                this.f36521a = false;
                try {
                    v3.b.b().c(this.f36523c.zza(), this.f36523c.f35812c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f36523c.zzl().z(new RunnableC4859g6(this, c4967u2));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC7901p.e("MeasurementServiceConnection.onServiceDisconnected");
        this.f36523c.zzj().B().a("Service disconnected");
        this.f36523c.zzl().z(new RunnableC4884j6(this, componentName));
    }
}
