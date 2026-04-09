package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class cm2 extends hv1 implements nm2 {
    public static nm2 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof nm2 ? (nm2) iInterfaceQueryLocalInterface : new xl2(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo", 2);
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            w63 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            iv1.d(parcel2, liteSdkVersion);
            return true;
        }
        if (i != 2) {
            return false;
        }
        u62 adapterCreator = getAdapterCreator();
        parcel2.writeNoException();
        iv1.e(parcel2, adapterCreator);
        return true;
    }
}
