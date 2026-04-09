package s3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import x3.InterfaceC8420a;

/* loaded from: classes.dex */
public abstract class r0 extends B3.c implements N {
    public r0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static N c(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof N ? (N) iInterfaceQueryLocalInterface : new q0(iBinder);
    }

    @Override // B3.c
    protected final boolean b(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            InterfaceC8420a interfaceC8420aZzd = zzd();
            parcel2.writeNoException();
            B3.d.d(parcel2, interfaceC8420aZzd);
        } else {
            if (i10 != 2) {
                return false;
            }
            int iZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(iZzc);
        }
        return true;
    }
}
