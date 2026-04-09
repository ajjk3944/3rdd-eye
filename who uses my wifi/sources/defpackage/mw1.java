package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class mw1 extends hv1 implements nw1 {
    public mw1() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        kw1 jw1Var;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                jw1Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                jw1Var = iInterfaceQueryLocalInterface instanceof kw1 ? (kw1) iInterfaceQueryLocalInterface : new jw1(strongBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd", 2);
            }
            iv1.f(parcel);
            d3(jw1Var);
        } else if (i == 2) {
            parcel.readInt();
            iv1.f(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            nx2 nx2Var = (nx2) iv1.b(parcel, nx2.CREATOR);
            iv1.f(parcel);
            W(nx2Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
