package qa;

import android.os.RemoteException;
import pa.h;
import pa.k;
import pa.s;
import pa.t;
import va.e2;
import va.l0;
import va.x2;
import za.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends k {
    public h[] getAdSizes() {
        return this.f31539a.g;
    }

    public d getAppEventListener() {
        return this.f31539a.f36076h;
    }

    public s getVideoController() {
        return this.f31539a.f36072c;
    }

    public t getVideoOptions() {
        return this.f31539a.j;
    }

    public void setAdSizes(h... hVarArr) {
        if (hVarArr == null || hVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f31539a.d(hVarArr);
    }

    public void setAppEventListener(d dVar) {
        this.f31539a.e(dVar);
    }

    public void setManualImpressionsEnabled(boolean z3) {
        e2 e2Var = this.f31539a;
        e2Var.f36080m = z3;
        try {
            l0 l0Var = e2Var.f36077i;
            if (l0Var != null) {
                l0Var.S2(z3);
            }
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
        }
    }

    public void setVideoOptions(t tVar) {
        e2 e2Var = this.f31539a;
        e2Var.j = tVar;
        try {
            l0 l0Var = e2Var.f36077i;
            if (l0Var != null) {
                l0Var.P2(tVar == null ? null : new x2(tVar));
            }
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
        }
    }
}
