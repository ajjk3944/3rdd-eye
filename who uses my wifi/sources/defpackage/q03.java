package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q03 extends hv1 implements t72 {
    public final c03 f;
    public final /* synthetic */ r03 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q03(r03 r03Var, c03 c03Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
        this.g = r03Var;
        this.f = c03Var;
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        a72 a72Var;
        r03 r03Var = this.g;
        c03 c03Var = this.f;
        if (i == 1) {
            u10 u10VarX0 = oi0.X0(parcel.readStrongBinder());
            iv1.f(parcel);
            r03Var.d = (View) oi0.l1(u10VarX0);
            ((u03) c03Var.c).g();
        } else if (i == 2) {
            String string = parcel.readString();
            iv1.f(parcel);
            ((u03) c03Var.c).w0(string, 0);
        } else if (i == 3) {
            nx2 nx2Var = (nx2) iv1.b(parcel, nx2.CREATOR);
            iv1.f(parcel);
            a(nx2Var);
        } else {
            if (i != 4) {
                return false;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                a72Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
                a72Var = iInterfaceQueryLocalInterface instanceof a72 ? (a72) iInterfaceQueryLocalInterface : new a72(strongBinder);
            }
            iv1.f(parcel);
            r03Var.e = a72Var;
            ((u03) c03Var.c).g();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.t72
    public final void a(nx2 nx2Var) {
        ((u03) this.f.c).K0(nx2Var);
    }
}
