package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class i32 extends hv1 implements v22 {
    public final /* synthetic */ t83 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i32(t83 t83Var) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        this.f = t83Var;
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        p22 o22Var;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            o22Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            o22Var = iInterfaceQueryLocalInterface instanceof p22 ? (p22) iInterfaceQueryLocalInterface : new o22(strongBinder);
        }
        iv1.f(parcel);
        g3(o22Var);
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.v22
    public final void g3(p22 p22Var) {
        f23 f23Var;
        String strF;
        t83 t83Var = this.f;
        rx2 rx2Var = (rx2) t83Var.g;
        synchronized (t83Var) {
            f23Var = (f23) t83Var.i;
            if (f23Var == null) {
                f23Var = new f23(p22Var);
                t83Var.i = f23Var;
            }
        }
        xb4 xb4Var = (xb4) rx2Var.g;
        xb4Var.getClass();
        ou1.h("#008 Must be called on the main UI thread.");
        try {
            strF = ((p22) f23Var.g).f();
        } catch (RemoteException e) {
            gi2.c0("", e);
            strF = null;
        }
        gi2.U("Adapter called onAdLoaded with template id ".concat(String.valueOf(strF)));
        xb4Var.i = f23Var;
        try {
            ((z62) xb4Var.g).g();
        } catch (RemoteException e2) {
            gi2.p0("#007 Could not call remote method.", e2);
        }
    }
}
