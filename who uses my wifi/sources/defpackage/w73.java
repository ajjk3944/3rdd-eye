package defpackage;

import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class w73 implements si0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ sb1 g;
    public final /* synthetic */ hv1 h;

    public /* synthetic */ w73(hv1 hv1Var, sb1 sb1Var, int i) {
        this.f = i;
        this.g = sb1Var;
        this.h = hv1Var;
    }

    @Override // defpackage.si0
    public final void l() {
        switch (this.f) {
            case 0:
                if (((x73) this.h).o != null) {
                    try {
                        xs2 xs2Var = (xs2) this.g;
                        xs2Var.M0(xs2Var.U(), 1);
                        break;
                    } catch (RemoteException e) {
                        gi2.p0("#007 Could not call remote method.", e);
                        return;
                    }
                }
                break;
            default:
                if (((y73) this.h).i != null) {
                    try {
                        kb2 kb2Var = (kb2) this.g;
                        kb2Var.M0(kb2Var.U(), 1);
                        break;
                    } catch (RemoteException e2) {
                        gi2.p0("#007 Could not call remote method.", e2);
                    }
                }
                break;
        }
    }
}
