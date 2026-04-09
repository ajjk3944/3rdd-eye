package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class by2 extends fy2 {
    public final Context l;
    public final e51 m;
    public final z71 n;

    public by2(Context context, e51 e51Var, z71 z71Var) {
        this.l = context;
        this.m = e51Var;
        this.n = z71Var;
    }

    @Override // defpackage.fy2, defpackage.t9
    public final void T(int i) {
        gi2.U("Cannot connect to remote service, fallback to local instance.");
        this.n.m(new RemoteException(ex0.j(new StringBuilder(String.valueOf(i).length() + 33), "Connection suspended with cause: ", i)));
    }

    @Override // defpackage.fy2, defpackage.u9
    public final void U(rh rhVar) {
        super.U(rhVar);
        this.n.m(new RemoteException("Connection failed: ".concat(String.valueOf(rhVar.i))));
    }

    @Override // defpackage.t9
    public final void Y() {
        synchronized (this.g) {
            if (!this.i) {
                this.i = true;
                try {
                    ((y92) this.k.t()).q0(this.m.f);
                    this.n.mo7a();
                } catch (RemoteException e) {
                    this.n.m(e);
                }
            }
        }
    }
}
