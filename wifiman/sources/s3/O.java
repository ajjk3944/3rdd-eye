package s3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class O extends B3.c implements InterfaceC7896k {
    public O() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // B3.c
    protected final boolean b(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            int i12 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) B3.d.a(parcel, Bundle.CREATOR);
            B3.d.b(parcel);
            K(i12, strongBinder, bundle);
        } else if (i10 == 2) {
            int i13 = parcel.readInt();
            Bundle bundle2 = (Bundle) B3.d.a(parcel, Bundle.CREATOR);
            B3.d.b(parcel);
            A(i13, bundle2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            d0 d0Var = (d0) B3.d.a(parcel, d0.CREATOR);
            B3.d.b(parcel);
            z(i14, strongBinder2, d0Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
