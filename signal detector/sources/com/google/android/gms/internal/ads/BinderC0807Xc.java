package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Xc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0807Xc extends q2.A0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f12431a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public volatile q2.C0 f12432b;

    @Override // q2.B0
    public final void J1(q2.C0 c02) {
        synchronized (this.f12431a) {
            this.f12432b = c02;
        }
    }

    @Override // q2.B0
    public final void b() throws RemoteException {
        throw new RemoteException();
    }

    @Override // q2.B0
    public final void d() throws RemoteException {
        throw new RemoteException();
    }

    @Override // q2.B0
    public final boolean g() throws RemoteException {
        throw new RemoteException();
    }

    @Override // q2.B0
    public final float h() throws RemoteException {
        throw new RemoteException();
    }

    @Override // q2.B0
    public final int j() throws RemoteException {
        throw new RemoteException();
    }

    @Override // q2.B0
    public final float k() throws RemoteException {
        throw new RemoteException();
    }

    @Override // q2.B0
    public final float n() throws RemoteException {
        throw new RemoteException();
    }

    @Override // q2.B0
    public final boolean o() throws RemoteException {
        throw new RemoteException();
    }

    @Override // q2.B0
    public final q2.C0 p() {
        q2.C0 c02;
        synchronized (this.f12431a) {
            c02 = this.f12432b;
        }
        return c02;
    }

    @Override // q2.B0
    public final boolean q() throws RemoteException {
        throw new RemoteException();
    }

    @Override // q2.B0
    public final void r0(boolean z6) throws RemoteException {
        throw new RemoteException();
    }

    @Override // q2.B0
    public final void y() throws RemoteException {
        throw new RemoteException();
    }
}
