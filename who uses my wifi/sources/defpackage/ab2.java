package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ab2 extends hv1 implements bb2 {
    public ab2() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        va2 ua2Var;
        switch (i) {
            case 1:
                b();
                break;
            case 2:
                c();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    ua2Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    ua2Var = iInterfaceQueryLocalInterface instanceof va2 ? (va2) iInterfaceQueryLocalInterface : new ua2(strongBinder);
                }
                iv1.f(parcel);
                U0(ua2Var);
                break;
            case 4:
                int i2 = parcel.readInt();
                iv1.f(parcel);
                z(i2);
                break;
            case 5:
                nx2 nx2Var = (nx2) iv1.b(parcel, nx2.CREATOR);
                iv1.f(parcel);
                t2(nx2Var);
                break;
            case 6:
                g();
                break;
            case 7:
                k();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
