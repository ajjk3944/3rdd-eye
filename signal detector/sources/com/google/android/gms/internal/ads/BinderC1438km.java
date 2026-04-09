package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.km, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1438km extends q2.A0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15266a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final q2.B0 f15267b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0790Wc f15268c;

    public BinderC1438km(q2.B0 b0, InterfaceC0790Wc interfaceC0790Wc) {
        this.f15267b = b0;
        this.f15268c = interfaceC0790Wc;
    }

    @Override // q2.B0
    public final void J1(q2.C0 c02) {
        synchronized (this.f15266a) {
            try {
                q2.B0 b0 = this.f15267b;
                if (b0 != null) {
                    b0.J1(c02);
                }
            } catch (Throwable th) {
                throw th;
            }
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
    public final float h() {
        InterfaceC0790Wc interfaceC0790Wc = this.f15268c;
        if (interfaceC0790Wc != null) {
            return interfaceC0790Wc.M();
        }
        return 0.0f;
    }

    @Override // q2.B0
    public final int j() throws RemoteException {
        throw new RemoteException();
    }

    @Override // q2.B0
    public final float k() {
        InterfaceC0790Wc interfaceC0790Wc = this.f15268c;
        if (interfaceC0790Wc != null) {
            return interfaceC0790Wc.H();
        }
        return 0.0f;
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
        synchronized (this.f15266a) {
            try {
                q2.B0 b0 = this.f15267b;
                if (b0 == null) {
                    return null;
                }
                return b0.p();
            } catch (Throwable th) {
                throw th;
            }
        }
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
