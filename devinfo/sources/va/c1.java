package va;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ar;
import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.ng;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class c1 extends mg implements d1 {
    public static d1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof d1 ? (d1) iInterfaceQueryLocalInterface : new b1(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo", 1);
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            l2 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            ng.d(parcel2, liteSdkVersion);
            return true;
        }
        if (i4 != 2) {
            return false;
        }
        ar adapterCreator = getAdapterCreator();
        parcel2.writeNoException();
        ng.e(parcel2, adapterCreator);
        return true;
    }
}
