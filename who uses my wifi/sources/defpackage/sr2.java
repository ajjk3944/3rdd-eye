package defpackage;

import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sr2 extends hy2 {
    public final Object f = new Object();
    public final py2 g;
    public final e72 h;

    public sr2(py2 py2Var, e72 e72Var) {
        this.g = py2Var;
        this.h = e72Var;
    }

    @Override // defpackage.py2
    public final void Z0(wy2 wy2Var) {
        synchronized (this.f) {
            try {
                py2 py2Var = this.g;
                if (py2Var != null) {
                    py2Var.Z0(wy2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.py2
    public final void b() throws RemoteException {
        throw new RemoteException();
    }

    @Override // defpackage.py2
    public final void c() throws RemoteException {
        throw new RemoteException();
    }

    @Override // defpackage.py2
    public final boolean f() throws RemoteException {
        throw new RemoteException();
    }

    @Override // defpackage.py2
    public final float g() {
        e72 e72Var = this.h;
        if (e72Var != null) {
            return e72Var.L();
        }
        return 0.0f;
    }

    @Override // defpackage.py2
    public final int j() throws RemoteException {
        throw new RemoteException();
    }

    @Override // defpackage.py2
    public final float k() {
        e72 e72Var = this.h;
        if (e72Var != null) {
            return e72Var.C();
        }
        return 0.0f;
    }

    @Override // defpackage.py2
    public final float n() throws RemoteException {
        throw new RemoteException();
    }

    @Override // defpackage.py2
    public final boolean o() throws RemoteException {
        throw new RemoteException();
    }

    @Override // defpackage.py2
    public final void o0(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // defpackage.py2
    public final wy2 p() {
        synchronized (this.f) {
            try {
                py2 py2Var = this.g;
                if (py2Var == null) {
                    return null;
                }
                return py2Var.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.py2
    public final boolean q() throws RemoteException {
        throw new RemoteException();
    }

    @Override // defpackage.py2
    public final void x() throws RemoteException {
        throw new RemoteException();
    }
}
