package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h32 extends hv1 implements t22 {
    public final /* synthetic */ t83 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h32(t83 t83Var) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
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
        String string = parcel.readString();
        iv1.f(parcel);
        Q0(o22Var, string);
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.t22
    public final void Q0(p22 p22Var, String str) {
        f23 f23Var;
        t83 t83Var = this.f;
        if (((rx2) t83Var.h) == null) {
            return;
        }
        synchronized (t83Var) {
            f23Var = (f23) t83Var.i;
            if (f23Var == null) {
                f23Var = new f23(p22Var);
                t83Var.i = f23Var;
            }
        }
        xb4 xb4Var = (xb4) ((rx2) t83Var.h).g;
        xb4Var.getClass();
        try {
            ((z62) xb4Var.g).c3((p22) f23Var.g, str);
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }
}
