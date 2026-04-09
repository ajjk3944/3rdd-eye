package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.B7;
import com.google.android.gms.internal.ads.C7;
import com.google.android.gms.internal.ads.InterfaceC0603Lc;

/* renamed from: q2.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2813d0 extends B7 implements InterfaceC2815e0 {
    public static InterfaceC2815e0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2815e0 ? (InterfaceC2815e0) iInterfaceQueryLocalInterface : new C2811c0(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo", 2);
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            L0 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            C7.d(parcel2, liteSdkVersion);
            return true;
        }
        if (i != 2) {
            return false;
        }
        InterfaceC0603Lc adapterCreator = getAdapterCreator();
        parcel2.writeNoException();
        C7.e(parcel2, adapterCreator);
        return true;
    }
}
