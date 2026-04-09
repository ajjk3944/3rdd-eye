package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fa0 extends va.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11079a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final va.a2 f11080b;

    /* renamed from: c, reason: collision with root package name */
    public final lr f11081c;

    public fa0(va.a2 a2Var, lr lrVar) {
        this.f11080b = a2Var;
        this.f11081c = lrVar;
    }

    @Override // va.a2
    public final float A1() {
        lr lrVar = this.f11081c;
        if (lrVar != null) {
            return lrVar.u();
        }
        return 0.0f;
    }

    @Override // va.a2
    public final int C1() throws RemoteException {
        throw new RemoteException();
    }

    @Override // va.a2
    public final float D1() {
        lr lrVar = this.f11081c;
        if (lrVar != null) {
            return lrVar.r();
        }
        return 0.0f;
    }

    @Override // va.a2
    public final float F1() throws RemoteException {
        throw new RemoteException();
    }

    @Override // va.a2
    public final boolean G1() throws RemoteException {
        throw new RemoteException();
    }

    @Override // va.a2
    public final va.b2 H1() {
        synchronized (this.f11079a) {
            try {
                va.a2 a2Var = this.f11080b;
                if (a2Var == null) {
                    return null;
                }
                return a2Var.H1();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // va.a2
    public final boolean I1() throws RemoteException {
        throw new RemoteException();
    }

    @Override // va.a2
    public final void S1(boolean z3) throws RemoteException {
        throw new RemoteException();
    }

    @Override // va.a2
    public final void X1(va.b2 b2Var) {
        synchronized (this.f11079a) {
            try {
                va.a2 a2Var = this.f11080b;
                if (a2Var != null) {
                    a2Var.X1(b2Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // va.a2
    public final void c() throws RemoteException {
        throw new RemoteException();
    }

    @Override // va.a2
    public final void d() throws RemoteException {
        throw new RemoteException();
    }

    @Override // va.a2
    public final void l() throws RemoteException {
        throw new RemoteException();
    }

    @Override // va.a2
    public final boolean z1() throws RemoteException {
        throw new RemoteException();
    }
}
