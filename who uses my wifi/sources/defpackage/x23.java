package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class x23 implements wm2 {
    public final /* synthetic */ s23 f;
    public final /* synthetic */ j52 g;

    public /* synthetic */ x23(s23 s23Var, j52 j52Var) {
        this.f = s23Var;
        this.g = j52Var;
    }

    @Override // defpackage.wm2
    public final void d0(nx2 nx2Var) {
        this.f.d0(nx2Var);
        j52 j52Var = this.g;
        if (j52Var != null) {
            try {
                Parcel parcelU = j52Var.U();
                iv1.c(parcelU, nx2Var);
                j52Var.M0(parcelU, 3);
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
            }
        }
        if (j52Var != null) {
            try {
                int i = nx2Var.f;
                Parcel parcelU2 = j52Var.U();
                parcelU2.writeInt(i);
                j52Var.M0(parcelU2, 2);
            } catch (RemoteException e2) {
                gi2.p0("#007 Could not call remote method.", e2);
            }
        }
    }
}
